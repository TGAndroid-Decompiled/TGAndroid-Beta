package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class tu implements org.telegram.ui.Components.hm0, org.telegram.ui.ActionBar.z1 {
    public final xu f42289a;

    public tu(xu xuVar) {
        this.f42289a = xuVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        int i12;
        int i13;
        xu xuVar = this.f42289a;
        bv bvVar = xuVar.f44173m3;
        ArrayList arrayList = xuVar.f44165d3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            wu[] wuVarArr = xuVar.f44166e3;
            if (i14 >= wuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.m2) bvVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.m2) bvVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.m2) bvVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                xuVar.V2 = true;
                xuVar.A1();
                xuVar.B1(true);
                return;
            }
            wu wuVar = wuVarArr[i14];
            if (wuVar.f25664c > 0) {
                arrayList.add(Integer.valueOf(wuVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        xu xuVar = this.f42289a;
        ArrayList arrayList = xuVar.f44162a3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((su) arrayList.get(i10)).f16876a == 5) {
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
        xuVar.X2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
