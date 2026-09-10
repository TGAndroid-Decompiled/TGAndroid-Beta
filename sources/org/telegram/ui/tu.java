package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class tu implements org.telegram.ui.Components.gl0, org.telegram.ui.ActionBar.c2 {
    public final xu f37042a;

    public tu(xu xuVar) {
        this.f37042a = xuVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12;
        int i13;
        xu xuVar = this.f37042a;
        bv bvVar = xuVar.f38829o3;
        ArrayList arrayList = xuVar.f38821f3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            wu[] wuVarArr = xuVar.f38822g3;
            if (i14 >= wuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                xuVar.X2 = true;
                xuVar.y1();
                xuVar.z1(true);
                return;
            }
            wu wuVar = wuVarArr[i14];
            if (wuVar.f21804c > 0) {
                arrayList.add(Integer.valueOf(wuVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        xu xuVar = this.f37042a;
        ArrayList arrayList = xuVar.f38818c3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((su) arrayList.get(i10)).f14046a == 5) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return -1;
        }
        xuVar.Z2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
