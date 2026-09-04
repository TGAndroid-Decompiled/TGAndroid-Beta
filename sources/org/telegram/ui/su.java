package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class su implements org.telegram.ui.Components.wk0, org.telegram.ui.ActionBar.a2 {
    public final wu f40555a;

    public su(wu wuVar) {
        this.f40555a = wuVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        wu wuVar = this.f40555a;
        av avVar = wuVar.f42493o3;
        ArrayList arrayList = wuVar.f42485f3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            vu[] vuVarArr = wuVar.f42486g3;
            if (i14 >= vuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.n2) avVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.n2) avVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.n2) avVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                wuVar.X2 = true;
                wuVar.y1();
                wuVar.z1(true);
                return;
            }
            vu vuVar = vuVarArr[i14];
            if (vuVar.f25370c > 0) {
                arrayList.add(Integer.valueOf(vuVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        wu wuVar = this.f40555a;
        ArrayList arrayList = wuVar.f42482c3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((ru) arrayList.get(i10)).f44071a == 5) {
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
        wuVar.Z2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
