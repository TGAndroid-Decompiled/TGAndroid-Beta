package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class x70 implements org.telegram.messenger.c20 {
    public final int f51770a;
    public final LaunchActivity f51771b;

    public x70(LaunchActivity launchActivity, int i7) {
        this.f51770a = i7;
        this.f51771b = launchActivity;
    }

    @Override
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.f2 lastFragment;
        int i7 = this.f51770a;
        LaunchActivity launchActivity = this.f51771b;
        switch (i7) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f41251o0 != null && booleanValue && org.telegram.messenger.rc.c() < 100 && (lastFragment = launchActivity.f41251o0.getLastFragment()) != null && !(lastFragment instanceof w90)) {
                    int b10 = org.telegram.messenger.rc.b();
                    org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(lastFragment);
                    org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(b10 / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.k6.Y5));
                    String M0 = org.telegram.messenger.hd.M0(2131748714, null);
                    String a03 = org.telegram.messenger.hd.a0("LowPowerEnabledSubtitle", null, 2131748715, String.format("%d%%", Integer.valueOf(b10)));
                    String M02 = org.telegram.messenger.hd.M0(2131751436, null);
                    s60 s60Var = new s60(launchActivity, 11);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.f6 f6Var = a02.f34289c;
                    org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(W, f6Var);
                    zbVar.f40882a.setImageDrawable(n9Var);
                    zbVar.f40883b.setText(M0);
                    zbVar.f40884c.setText(a03);
                    org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(a02.W(), f6Var, true);
                    acVar.e(M02);
                    acVar.f31748b = s60Var;
                    zbVar.setButton(acVar);
                    org.telegram.ui.Components.cc b11 = a02.b(zbVar, 2750);
                    b11.f32523j = 5000;
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
