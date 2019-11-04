#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main(){
    int q;
    cin >> q;
    for(int i = 0; i<q; i++){
        int n, k;
        cin >> n >> k;
        vector<int> a;
        vector<int> index;
        int count = 0;
        for(int j = 0; j<n; j++){
            int t;
            cin >> t;
            a.push_back(t);
            if(t%2==1){
                index.push_back(j);
                count = count + 1;
            }
        }

        if((count < k) || ((count - k)%2 == 1)){
            cout << "NO\n";
        }
        else{
            cout << "YES\n";
            for(int h = 0; h<k-1; h++){
                cout << index[h]+1 << " ";
            }
            cout << n << "\n";
        }

    }
}
