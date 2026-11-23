package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class y70 implements org.telegram.messenger.y10 {
    public final int f54075a;
    public final LaunchActivity f54076b;

    public y70(LaunchActivity launchActivity, int i7) {
        this.f54075a = i7;
        this.f54076b = launchActivity;
    }

    @Override
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.g2 lastFragment;
        int i7 = this.f54075a;
        LaunchActivity launchActivity = this.f54076b;
        switch (i7) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f43139p0 != null && booleanValue && org.telegram.messenger.qc.c() < 100 && (lastFragment = launchActivity.f43139p0.getLastFragment()) != null && !(lastFragment instanceof z90)) {
                    int b10 = org.telegram.messenger.qc.b();
                    org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(lastFragment);
                    org.telegram.ui.Components.s9 s9Var = new org.telegram.ui.Components.s9(b10 / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.m6.Y5));
                    String N0 = org.telegram.messenger.hd.N0(2131748522, null);
                    String a02 = org.telegram.messenger.hd.a0("LowPowerEnabledSubtitle", null, 2131748523, String.format("%d%%", Integer.valueOf(b10)));
                    String N02 = org.telegram.messenger.hd.N0(2131751423, null);
                    t60 t60Var = new t60(launchActivity, 11);
                    b02.getClass();
                    Context X = b02.X();
                    org.telegram.ui.ActionBar.h6 h6Var = b02.f37162c;
                    org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(X, h6Var);
                    dcVar.f34466a.setImageDrawable(s9Var);
                    dcVar.f34467b.setText(N0);
                    dcVar.f34468c.setText(a02);
                    org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(b02.X(), h6Var, true);
                    ecVar.e(N02);
                    ecVar.f34725b = t60Var;
                    dcVar.setButton(ecVar);
                    org.telegram.ui.Components.gc b11 = b02.b(dcVar, 2750);
                    b11.f35527j = 5000;
                    b11.j();
                    return;
                }
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                String str = LaunchActivity.C1;
                org.telegram.messenger.np.u1(launchActivity.P).E3(null, user, null, 0, null, false, false);
                return;
        }
    }
}
