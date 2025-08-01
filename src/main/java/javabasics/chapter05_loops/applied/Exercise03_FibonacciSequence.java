package main.java.javabasics.chapter05_loops.applied;

/**
 * <h3>Chapter 5 - 반복문 (Loops)</h3>
 * <h3>응용 문제 3: 피보나치 수열</h3>
 * 
 * <h4>문제 설명</h4>
 * <p>피보나치 수열(Fibonacci Sequence)은 수학에서 가장 유명한 수열 중 하나입니다.
 * 13세기 이탈리아 수학자 레오나르도 피보나치가 토끼의 번식 문제를 통해 소개한 이 수열은
 * 자연계의 여러 현상에서 발견되며, 컴퓨터 과학에서도 다양하게 활용됩니다.</p>
 * 
 * <h4>학습 목표</h4>
 * <ul>
 *   <li>반복문을 사용한 점화식 구현 방법 학습하기</li>
 *   <li>이전 값들을 활용한 계산 패턴 이해하기</li>
 *   <li>변수 값의 갱신과 임시 저장 기법 익히기</li>
 * </ul>
 * 
 * <h4>문제 요구사항</h4>
 * <ul>
 *   <li>피보나치 수열의 첫 15개 항을 출력하세요</li>
 *   <li>각 항은 공백으로 구분하여 한 줄에 출력하세요</li>
 *   <li>반복문을 사용하여 구현하세요 (재귀 사용 금지)</li>
 * </ul>
 * 
 * <h4>피보나치 수열의 정의</h4>
 * <pre>
 * F(0) = 0
 * F(1) = 1
 * F(n) = F(n-1) + F(n-2)  (n ≥ 2)
 * 
 * 수열: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, ...
 * </pre>
 * 
 * <h4>구현 알고리즘</h4>
 * <ol>
 *   <li>첫 번째 항(prev1)을 0으로, 두 번째 항(prev2)을 1로 초기화</li>
 *   <li>첫 두 항을 출력</li>
 *   <li>3번째 항부터 n번째 항까지 반복:
 *     <ul>
 *       <li>현재 항 = prev1 + prev2</li>
 *       <li>현재 항 출력</li>
 *       <li>prev1 = prev2, prev2 = 현재 항으로 갱신</li>
 *     </ul>
 *   </li>
 * </ol>
 * 
 * <h4>힌트 및 도움말</h4>
 * <ul>
 *   <li>변수 3개 사용: <code>int prev1 = 0, prev2 = 1, current;</code></li>
 *   <li>첫 두 항 출력: <code>System.out.print("0 1 ");</code></li>
 *   <li>반복문: <code>for(int i = 2; i < n; i++)</code></li>
 *   <li>값 갱신 순서 주의: 임시 변수를 사용하거나 동시 할당 활용</li>
 * </ul>
 * 
 * <h4>피보나치 수열의 응용</h4>
 * <ul>
 *   <li><b>황금비:</b> 인접한 두 항의 비율은 황금비(약 1.618)에 수렴</li>
 *   <li><b>자연 현상:</b> 꽃잎 개수, 나선형 껍질, 나뭇가지 패턴</li>
 *   <li><b>알고리즘:</b> 동적 프로그래밍, 분할 정복 알고리즘 예제</li>
 *   <li><b>데이터 구조:</b> 피보나치 힙, 피보나치 탐색</li>
 * </ul>
 * 
 * <h4>성능 고려사항</h4>
 * <p>반복문 방식은 O(n) 시간 복잡도로 효율적입니다. 
 * 재귀 방식은 직관적이지만 O(2^n)의 시간 복잡도를 가져 비효율적입니다.</p>
 */
public class Exercise03_FibonacciSequence {
    public static void main(String[] args) {
        int n = 15;  // 출력할 항의 개수
        
        // TODO: 피보나치 수열을 생성하고 출력하세요
        
        
        
        
        // 예상 출력:
        // 피보나치 수열의 첫 15개 항:
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
    }
}