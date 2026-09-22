package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class ru implements org.telegram.ui.Components.wk0, org.telegram.ui.ActionBar.a2 {
    public final vu f37205a;

    public ru(vu vuVar) {
        this.f37205a = vuVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        vu vuVar = this.f37205a;
        zu zuVar = vuVar.f38635o3;
        ArrayList arrayList = vuVar.f38627f3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            uu[] uuVarArr = vuVar.f38628g3;
            if (i14 >= uuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                vuVar.X2 = true;
                vuVar.z1();
                vuVar.A1(true);
                return;
            }
            uu uuVar = uuVarArr[i14];
            if (uuVar.f22358c > 0) {
                arrayList.add(Integer.valueOf(uuVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        vu vuVar = this.f37205a;
        ArrayList arrayList = vuVar.f38624c3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((qu) arrayList.get(i10)).f15531a == 5) {
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
        vuVar.Z2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
