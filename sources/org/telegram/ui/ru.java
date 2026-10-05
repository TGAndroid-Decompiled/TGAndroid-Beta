package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class ru implements org.telegram.ui.Components.jl0, org.telegram.ui.ActionBar.a2 {
    public final vu f40268a;

    public ru(vu vuVar) {
        this.f40268a = vuVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        vu vuVar = this.f40268a;
        zu zuVar = vuVar.f41838v3;
        ArrayList arrayList = vuVar.f41829m3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            uu[] uuVarArr = vuVar.f41830n3;
            if (i14 >= uuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                vuVar.f41822e3 = true;
                vuVar.A1();
                vuVar.B1(true);
                return;
            }
            uu uuVar = uuVarArr[i14];
            if (uuVar.f25759c > 0) {
                arrayList.add(Integer.valueOf(uuVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        vu vuVar = this.f40268a;
        ArrayList arrayList = vuVar.j3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((qu) arrayList.get(i10)).f17192a == 5) {
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
        vuVar.f41824g3.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
