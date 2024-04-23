t = int(input())
for _ in range(t):
    n, x = map(int, input().split())
    arr = list(map(int, input().split()))
    
    last = 0
    ans = float('-inf')
    for i in range(n):
        ans = max(ans, arr[i] - last)
        last = arr[i]
        
    ans = max(ans, 2 * (x - last))
    print(ans)
