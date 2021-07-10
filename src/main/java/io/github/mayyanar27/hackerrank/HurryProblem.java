package io.github.mayyanar27.hackerrank;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 05-07-2021
 * Time: 14:41
 */

import java.io.*;
import java.util.*;


public class HurryProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int t = Integer.parseInt(line[1]);
        int[][] task = new int[n][2];
        for (int i_task = 0; i_task < n; i_task++) {
            String[] arr_task = br.readLine().split(" ");
            for (int j_task = 0; j_task < arr_task.length; j_task++) {
                task[i_task][j_task] = Integer.parseInt(arr_task[j_task]);
            }
        }

        int out_ = solve(n, t, task);
        System.out.println(out_);

        wr.close();
        br.close();
    }

    static int solve(int n, int t, int[][] task) {
        int startPos = task[0][0];
        int totalStartPos = startPos + task[0][1];
        int reamingTime = t - totalStartPos;
        int numTask = 0;
        ArrayList<Integer> durations = new ArrayList<>();
        ArrayList<Integer> positions = new ArrayList<>();
        if ((t / 2) < reamingTime) {
            numTask = numTask + 1;
            convert(n, task, durations, positions);
            int farLoc = farPos(task);
            return calcuateNumberOfTask(reamingTime, durations, positions, farLoc, numTask);

        } else {
            convert(n, task, durations, positions);
            int farLoc = farPos(task);
            reamingTime = t;
            reamingTime = reamingTime - 2 * farLoc;
            return calcuateNumberOfTask(reamingTime, durations, positions, farLoc, numTask);
        }

    }

    private static int calcuateNumberOfTask(int reamingTime, ArrayList<Integer> durations, ArrayList<Integer> positions, Integer farLoc, int numTask) {
        int previous = -1;
        if (reamingTime > 0 && !positions.isEmpty() && !durations.isEmpty()) {
            numTask = numTask + 1;
            int i = positions.indexOf(farLoc);
            previous = durations.get(i);
            positions.remove(i);
            durations.remove(i);
            reamingTime = reamingTime - previous;
            if (reamingTime > 0)
                return calcuateNumberOfTask(reamingTime, durations, positions, getLargestNum(positions), numTask);
            else
                return numTask;
        } else if (reamingTime == 0) {
            return numTask;
        } else if (reamingTime < 0) {
            return numTask - 1;
        }
        return numTask;
    }


    private static void convert(int n, int[][] task, ArrayList<Integer> durations, ArrayList<Integer> positions) {
        for (int i = 1; i < n; i++) {
            positions.add(task[i][0]);
            durations.add(task[i][1]);
        }

    }


    private static int farPos(int[][] task) {
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < task.length; i++) {
            integers.add(task[i][0]);
        }
        return getLargestNum(integers);

    }

    private static Integer getLargestNum(ArrayList<Integer> integers) {
        Collections.sort(integers);
        return integers.get(integers.size() - 1);
    }


}
