package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class qu implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.a2 {
    public final uu f41186a;

    public qu(uu uuVar) {
        this.f41186a = uuVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        uu uuVar = this.f41186a;
        yu yuVar = uuVar.f42565m3;
        ArrayList arrayList = uuVar.f42557d3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            tu[] tuVarArr = uuVar.f42558e3;
            if (i14 >= tuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                uuVar.V2 = true;
                uuVar.A1();
                uuVar.B1(true);
                return;
            }
            tu tuVar = tuVarArr[i14];
            if (tuVar.f26347c > 0) {
                arrayList.add(Integer.valueOf(tuVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        uu uuVar = this.f41186a;
        ArrayList arrayList = uuVar.f42554a3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((pu) arrayList.get(i10)).f17125a == 5) {
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
        uuVar.X2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
