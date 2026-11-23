package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.ui.Components.UndoView;
public final class zu implements Runnable {
    public final int f54599a;
    public final cx f54600b;

    public zu(cx cxVar, int i7) {
        this.f54599a = i7;
        this.f54600b = cxVar;
    }

    @Override
    public final void run() {
        y91 y91Var;
        switch (this.f54599a) {
            case 0:
                this.f54600b.Y3();
                return;
            case 1:
                this.f54600b.o5();
                return;
            case 2:
                cx.L0(this.f54600b);
                return;
            case 3:
                this.f54600b.getMessagesController().s4(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 4:
                cx cxVar = this.f54600b;
                hi.l3 l3Var = cxVar.f46740r0;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                cxVar.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 5:
                this.f54600b.f46683f0[0].d.f();
                return;
            case 6:
                cx cxVar2 = this.f54600b;
                cxVar2.getClass();
                SharedPreferences g12 = org.telegram.messenger.np.g1();
                long j3 = g12.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                g12.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                cxVar2.o5();
                return;
            case 7:
                cx cxVar3 = this.f54600b;
                UndoView l42 = cxVar3.l4();
                if (l42 != null) {
                    l42.l(0L, 15, null, new gu(cxVar3, 17));
                    return;
                }
                return;
            case 8:
                cx.c0(this.f54600b);
                return;
            case 9:
                cx cxVar4 = this.f54600b;
                cxVar4.getClass();
                cxVar4.presentFragment(new UserInfoActivity());
                return;
            case 10:
                cx.i0(this.f54600b);
                return;
            case 11:
                org.telegram.messenger.np.u1(this.f54600b.currentAccount).l0(null);
                return;
            case 12:
                ?? obj = new Object();
                obj.f28871a = true;
                this.f54600b.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 13:
                cx cxVar5 = this.f54600b;
                cxVar5.U4(false, true);
                if (cxVar5.f46683f0 != null) {
                    int i7 = 0;
                    while (true) {
                        bx[] bxVarArr = cxVar5.f46683f0;
                        if (i7 < bxVarArr.length) {
                            if (bxVarArr[i7].getVisibility() == 0) {
                                bx bxVar = cxVar5.f46683f0[i7];
                                if (!bxVar.d.H) {
                                    bxVar.q(false);
                                }
                            }
                            i7++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 14:
                cx cxVar6 = this.f54600b;
                cxVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", cxVar6.f46658a3);
                cxVar6.presentFragment(new li.p(bundle));
                return;
            case 15:
                cx cxVar7 = this.f54600b;
                cxVar7.getClass();
                cxVar7.presentFragment(new org.telegram.ui.Wallet.n6());
                return;
            case 16:
                cx cxVar8 = this.f54600b;
                cxVar8.f46683f0[0].f46318a.requestLayout();
                xv xvVar = cxVar8.H3;
                if (xvVar != null && (xvVar.getFragment() instanceof y91)) {
                    y91Var = (y91) cxVar8.H3.getFragment();
                } else {
                    y91Var = null;
                }
                if (y91Var != null) {
                    y91Var.F0();
                }
                cxVar8.S3(false);
                cxVar8.m5();
                kw kwVar = cxVar8.D0;
                if (kwVar != null) {
                    kwVar.invalidate();
                    return;
                }
                return;
            default:
                this.f54600b.w5();
                return;
        }
    }
}
