import sys


N,K = map(int, input().split())

# 入力された数値ペアを格納するためのリストを準備します
input_pairs = []
sum = 0
for i in range(int(N)):
    a,b = map(int, input().split())
    pair = (a, b)  # 整数のタプルを作成します
    input_pairs.append(pair)  # リストにタプルを追加します
    sum += b

# 1列目の値でソートします
input_pairs.sort(key=lambda x: x[0])

# 薬の合計がK錠以下であれば1日で終了
if sum <= K:
    print(1)
    sys.exit()

ans = 0
for pair in input_pairs:
    if sum - pair[1] <= K:
        ans = pair[0] +1
        print(ans)
        break
    sum -= pair[1]
