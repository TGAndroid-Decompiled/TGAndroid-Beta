package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class qu implements org.telegram.ui.Components.fl0, org.telegram.ui.ActionBar.c2 {
    public final uu f40677a;

    public qu(uu uuVar) {
        this.f40677a = uuVar;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12;
        int i13;
        uu uuVar = this.f40677a;
        yu yuVar = uuVar.f41940l3;
        ArrayList arrayList = uuVar.c3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            tu[] tuVarArr = uuVar.f41932d3;
            if (i14 >= tuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                uuVar.U2 = true;
                uuVar.y1();
                uuVar.z1(true);
                return;
            }
            tu tuVar = tuVarArr[i14];
            if (tuVar.f31860c > 0) {
                arrayList.add(Integer.valueOf(tuVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        uu uuVar = this.f40677a;
        ArrayList arrayList = uuVar.Z2;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((pu) arrayList.get(i10)).f2505a == 5) {
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
        uuVar.W2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
