package study.src.backjun_if;

import java.util.Scanner;

public class if_2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dice = new int[3];

        for(int i = 0; i < 3; i++){
            dice[i] = scanner.nextInt();
        }
        scanner.close();

        int prize = 0;
    
        if(dice[0]==dice[2]){
            prize = 10000 + 1000 * dice[0];
        } else if (dice[0]==dice[1]||dice[1]==dice[2]){
            prize = 1000 + 100 * dice[1];
        } else {
            prize = 100 * dice[2];
        }
        System.out.println(prize);
    }

   
}


// 예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
//  또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
//  3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

// 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.

// 입력
// 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 

// 출력
// 첫째 줄에 게임의 상금을 출력 한다.