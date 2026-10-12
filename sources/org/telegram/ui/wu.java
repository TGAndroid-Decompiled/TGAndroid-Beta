package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class wu implements org.telegram.ui.Components.xl0, org.telegram.ui.ActionBar.z1 {
    public final av f41658a;

    public wu(av avVar) {
        this.f41658a = avVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        int i12;
        int i13;
        av avVar = this.f41658a;
        ev evVar = avVar.f34358m3;
        ArrayList arrayList = avVar.f34349d3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            zu[] zuVarArr = avVar.f34350e3;
            if (i14 >= zuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                avVar.V2 = true;
                avVar.A1();
                avVar.B1(true);
                return;
            }
            zu zuVar = zuVarArr[i14];
            if (zuVar.f24684c > 0) {
                arrayList.add(Integer.valueOf(zuVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        av avVar = this.f41658a;
        ArrayList arrayList = avVar.f34346a3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((vu) arrayList.get(i10)).f43203a == 5) {
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
        avVar.X2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
