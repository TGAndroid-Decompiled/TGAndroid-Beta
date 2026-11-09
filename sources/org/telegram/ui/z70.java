package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class z70 implements org.telegram.messenger.c20 {
    public final int f52455a;
    public final LaunchActivity f52456b;

    public z70(LaunchActivity launchActivity, int i7) {
        this.f52455a = i7;
        this.f52456b = launchActivity;
    }

    @Override
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.f2 lastFragment;
        int i7 = this.f52455a;
        LaunchActivity launchActivity = this.f52456b;
        switch (i7) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f41286o0 != null && booleanValue && org.telegram.messenger.sc.c() < 100 && (lastFragment = launchActivity.f41286o0.getLastFragment()) != null && !(lastFragment instanceof y90)) {
                    int b10 = org.telegram.messenger.sc.b();
                    org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(lastFragment);
                    org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(b10 / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.l6.Y5));
                    String M0 = org.telegram.messenger.id.M0(2131748715, null);
                    String a03 = org.telegram.messenger.id.a0("LowPowerEnabledSubtitle", null, 2131748716, String.format("%d%%", Integer.valueOf(b10)));
                    String M02 = org.telegram.messenger.id.M0(2131751435, null);
                    u60 u60Var = new u60(launchActivity, 11);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.g6 g6Var = a02.f34273c;
                    org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(W, g6Var);
                    zbVar.f40948a.setImageDrawable(n9Var);
                    zbVar.f40949b.setText(M0);
                    zbVar.f40950c.setText(a03);
                    org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(a02.W(), g6Var, true);
                    acVar.e(M02);
                    acVar.f31766b = u60Var;
                    zbVar.setButton(acVar);
                    org.telegram.ui.Components.cc b11 = a02.b(zbVar, 2750);
                    b11.f32627j = 5000;
                    b11.j();
                    return;
                }
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                String str = LaunchActivity.B1;
                org.telegram.messenger.qp.s1(launchActivity.O).x3(null, user, null, 0, null, false, false);
                return;
        }
    }
}
