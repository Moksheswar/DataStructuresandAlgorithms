n,m=map(int,input().split())
l=[[] for i in range(n+1)]
for i in range(m):
    u,v=map(int,input().split())
    l[u].append(v)
    l[v].append(u)
print(l)