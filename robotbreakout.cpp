#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main(){
    int n;
    cin >> n;
    for(int i = 0; i<n; i++){
        int nn;
        cin >> nn;
        int maxl = -100000;
        int maxr = 100000;
        int maxu = 100000;
        int maxd = -100000;
        int x, y, l, r, u, d;
        bool flag = false;
        for(int j = 0; j<nn; j++){
            cin >> x >> y >> l >> u >> r >> d;
            if(l == 0){
                maxl = max(maxl, x);
            }
            if(r == 0){
                maxr = min(maxr, x);
            }
            if(u == 0){
                maxu = min(maxu, y);

            }
            if(d == 0){
                maxd = max(maxd, y);
            }
            if((maxl > maxr) || (maxd>maxu)){
                flag = true;
                break;
            }
        }
        //cout << maxl << " " << maxr << " " << maxu << " " << maxd << "\n";
        if(flag){
            cout << "0" << "\n";
        }
        else{
            cout << "1 " << maxl << " " << maxu << "\n";
        }
        
    }
}
