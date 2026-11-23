package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.ui.Components.UndoView;
public final class yu implements Runnable {
    public final int f54429a;
    public final bx f54430b;

    public yu(bx bxVar, int i7) {
        this.f54429a = i7;
        this.f54430b = bxVar;
    }

    @Override
    public final void run() {
        w91 w91Var;
        switch (this.f54429a) {
            case 0:
                this.f54430b.Y3();
                return;
            case 1:
                this.f54430b.o5();
                return;
            case 2:
                bx.L0(this.f54430b);
                return;
            case 3:
                this.f54430b.getMessagesController().s4(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 4:
                bx bxVar = this.f54430b;
                hi.u3 u3Var = bxVar.f46606r0;
                if (u3Var != null) {
                    u3Var.f(true);
                }
                bxVar.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 5:
                this.f54430b.f46549f0[0].d.f();
                return;
            case 6:
                bx bxVar2 = this.f54430b;
                bxVar2.getClass();
                SharedPreferences g12 = org.telegram.messenger.mp.g1();
                long j3 = g12.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                g12.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                bxVar2.o5();
                return;
            case 7:
                bx bxVar3 = this.f54430b;
                UndoView l42 = bxVar3.l4();
                if (l42 != null) {
                    l42.l(0L, 15, null, new fu(bxVar3, 17));
                    return;
                }
                return;
            case 8:
                bx.c0(this.f54430b);
                return;
            case 9:
                bx bxVar4 = this.f54430b;
                bxVar4.getClass();
                bxVar4.presentFragment(new UserInfoActivity());
                return;
            case 10:
                bx.i0(this.f54430b);
                return;
            case 11:
                org.telegram.messenger.mp.u1(this.f54430b.currentAccount).l0(null);
                return;
            case 12:
                ?? obj = new Object();
                obj.f28948a = true;
                this.f54430b.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 13:
                bx bxVar5 = this.f54430b;
                bxVar5.U4(false, true);
                if (bxVar5.f46549f0 != null) {
                    int i7 = 0;
                    while (true) {
                        ax[] axVarArr = bxVar5.f46549f0;
                        if (i7 < axVarArr.length) {
                            if (axVarArr[i7].getVisibility() == 0) {
                                ax axVar = bxVar5.f46549f0[i7];
                                if (!axVar.d.H) {
                                    axVar.q(false);
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
                bx bxVar6 = this.f54430b;
                bxVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", bxVar6.f46524a3);
                bxVar6.presentFragment(new li.o(bundle));
                return;
            case 15:
                bx bxVar7 = this.f54430b;
                bxVar7.getClass();
                bxVar7.presentFragment(new org.telegram.ui.Wallet.o6());
                return;
            case 16:
                bx bxVar8 = this.f54430b;
                bxVar8.f46549f0[0].f45822a.requestLayout();
                wv wvVar = bxVar8.H3;
                if (wvVar != null && (wvVar.getFragment() instanceof w91)) {
                    w91Var = (w91) bxVar8.H3.getFragment();
                } else {
                    w91Var = null;
                }
                if (w91Var != null) {
                    w91Var.F0();
                }
                bxVar8.S3(false);
                bxVar8.m5();
                jw jwVar = bxVar8.D0;
                if (jwVar != null) {
                    jwVar.invalidate();
                    return;
                }
                return;
            default:
                this.f54430b.w5();
                return;
        }
    }
}
