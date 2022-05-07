# Level 1

## 001. 짝수와 홀수

- **[solution001.java](https://github.com/krhong23/programmers-algorithm/blob/master/Level1/solution001.java)**
- **문제 설명**
  - 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
- **제한 조건**
  - num은 int 범위의 정수입니다.
  - 0은 짝수입니다.

- **입출력 예**

  | num  | return |
  | ---- | :----: |
  | 3    | "Odd"  |
  | 4    | "Even" |


## 002. 핸드폰 번호 가리기

- **[solution002.java](https://github.com/krhong23/programmers-algorithm/blob/master/Level1/solution002.java)**
- **문제 설명**
  - 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
  - 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 `*`으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
- **제한 조건**
  - s는 길이 

- **입출력 예** 

  | phone_number  |    return     |
  | :------------ | :-----------: |
  | "01033334444" | "*******4444" |
  | "027778888"   |  "*****8888"  |


## 003. 두 정수 사이의 합

- **[solution003.java](https://github.com/krhong23/programmers-algorithm/blob/master/Level1/solution003.java)**
- **문제 설명**
  - 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
  - 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
- **제한 조건**
  - a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
  - a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
  - a와 b의 대소관계는 정해져있지 않습니다. 

- **입출력 예** 

  | a | b | return |
  | :-----------: | :-----------: | :-----------: |
  | 3 | 5 | 12 |
  | 3 | 3 | 3  |
  | 5 | 3 | 12 |


## 004. 평균 구하기

- **[solution004.java](https://github.com/krhong23/programmers-algorithm/blob/master/Level1/solution004.java)**
- **문제 설명**
  - 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
- **제한 조건**
  - arr은 길이 1 이상, 100 이하인 배열입니다.
  - arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
    
- **입출력 예**

    | arr       | return |
    | --------- | :----: |
    | [1,2,3,4] |  2.5   |
    | [5,5]     |   5    |


## 005. 직사각형 별찍기

- **[solution005.java](https://github.com/krhong23/programmers-algorithm/blob/master/Level1/solution005.java)**
- **문제 설명**
  - 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
  - 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
- **제한 조건**
  - n과 m은 각각 1000 이하인 자연수입니다.
    
- **입출력 예**

  - 입력
    ```
    5 3
    ```

  - 출력
    ```
    *****
    *****
    *****
    ```


## 006. 약수의 합

- **[solution006.java](https://github.com/krhong23/programmers-algorithm/blob/master/Level1/solution006.java)**
- **문제 설명**
  - 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
- **제한 조건**
  - n은 0 이상 3000이하인 정수입니다.
    
- **입출력 예**

    | n    | return |
    | ---- | ------ |
    | 12   | 28     |
    | 5    | 6      |


## 007. 문자열 내 p와 y의 개수

- **[solution007.java](https://github.com/krhong23/programmers-algorithm/blob/master/Level1/solution007.java)**
- **문제 설명**
  - 대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
  - s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
  - 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 
  - 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
  - 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
- **제한 조건**
  - 문자열 s의 길이 : 50 이하의 자연수
  - 문자열 s는 알파벳으로만 이루어져 있습니다.
    
- **입출력 예**

    | s         | answer |
    | --------- | ------ |
    | "pPoooyY" | true   |
    | "Pyy"     | false  |


## 008. 문자열 내림차순으로 배치하기

- **[solution008.java](https://github.com/krhong23/programmers-algorithm/blob/master/Level1/solution008.java)**
- **문제 설명**
  - 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
  - s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
- **제한 조건**
  - str은 길이 1 이상인 문자열입니다.
    
- **입출력 예**

    | s         | return    |
    | --------- | --------- |
    | "Zbcdefg" | "gfedcbZ" |
    

## 009. 문자열 내 마음대로 정렬하기

- **[solution009.java](https://github.com/krhong23/programmers-algorithm/blob/master/Level1/solution009.java)**
- **문제 설명**
  - 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
  - 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
- **제한 조건**
  - strings는 길이 1 이상, 50이하인 배열입니다.
  - strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
  - strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
  - 모든 strings의 원소의 길이는 n보다 큽니다.
  - 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
    
- **입출력 예**

    | strings                 | n    | return                  |
    | ----------------------- | ---- | ----------------------- |
    | ["sun", "bed", "car"]   | 1    | ["car", "bed", "sun"]   |
    | ["abce", "abcd", "cdx"] | 2    | ["abcd", "abce", "cdx"] |

## 010. 가운데 글자 가져오기

- **[solution010.java](https://github.com/krhong23/programmers-algorithm/blob/master/Level1/solution010.java)**
- **문제 설명**
  - 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
- **제한 조건**
  - s는 길이가 1 이상, 100이하인 스트링입니다.
    
- **입출력 예**

    | s       | return |
    | ------- | ------ |
    | "abcde" | "c"    |
    | "qwer"  | "we"   |


## 011. 나누어 떨어지는 숫자 배열

- **[solution011.java](https://github.com/krhong23/programmers-algorithm/blob/master/Level1/solution011.java)**
- **문제 설명**
  - array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
  - divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
- **제한 조건**
  - arr은 자연수를 담은 배열입니다.
  - 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
  - divisor는 자연수입니다.
  - array는 길이 1 이상인 배열입니다.
    
- **입출력 예**

    | arr           | divisor | return        |
    | ------------- | ------- | ------------- |
    | [5, 9, 7, 10] | 5       | [5, 10]       |
    | [2, 36, 1, 3] | 1       | [1, 2, 3, 36] |
    | [3,2,6]       | 10      | [-1]          |
    
    
## 012. 하샤드 수

- **[solution012.java](https://github.com/krhong23/programmers-algorithm/blob/master/Level1/solution012.java)**
- **문제 설명**
  - 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
  - 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
  - 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
- **제한 조건**
  - x는 1 이상, 10000 이하인 정수입니다.
    
- **입출력 예**

    | arr  | return |
    | ---- | :----: |
    | 10   |  true  |
    | 12   |  true  |
    | 11   | false  |
    | 13   | false  |


## 013. K번째수

- **[solution013.java](https://github.com/krhong23/programmers-algorithm/blob/master/Level1/solution013.java)**
- **문제 설명**
  - 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
  - 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면 array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
  - 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
  - 2에서 나온 배열의 3번째 숫자는 5입니다.
  - 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
    
- **제한 조건**
  - array의 길이는 1 이상 100 이하입니다.
  - array의 각 원소는 1 이상 100 이하입니다.
  - commands의 길이는 1 이상 50 이하입니다.
  - commands의 각 원소는 길이가 3입니다.
    
- **입출력 예**

    | array    | commands    | return |
    | ---- | ---- | ------ |
    | [1, 5, 2, 6, 3, 7, 4]    | [[2, 5, 3], [4, 4, 1], [1, 7, 3]]   | [5, 6, 3]  |

## 014. X만큼 간격이 있는 n개의 숫자

- **[solution014.java](https://github.com/krhong23/programmers-algorithm/blob/master/Level1/solution014.java)**
- **문제 설명**
    - 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
    - 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

- **제한 조건**
    - x는 -10000000 이상, 10000000 이하인 정수입니다.
    - n은 1000 이하인 자연수입니다.

- **입출력 예**

  | x   | n      | answer |
  |-----|--------| ----  |
  | 2   | 5      | [2,4,6,8,10] |
  | 4   | 3      | [4,8,12] |
  | -4  | 2      | [-4,-8] |
