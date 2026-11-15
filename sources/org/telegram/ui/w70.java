package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class w70 implements org.telegram.messenger.z10 {
    public final int f52477a;
    public final LaunchActivity f52478b;

    public w70(LaunchActivity launchActivity, int i7) {
        this.f52477a = i7;
        this.f52478b = launchActivity;
    }

    @Override
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.e2 lastFragment;
        int i7 = this.f52477a;
        LaunchActivity launchActivity = this.f52478b;
        switch (i7) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f42649p0 != null && booleanValue && org.telegram.messenger.qc.c() < 100 && (lastFragment = launchActivity.f42649p0.getLastFragment()) != null && !(lastFragment instanceof x90)) {
                    int b10 = org.telegram.messenger.qc.b();
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(lastFragment);
                    org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(b10 / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.j6.Y5));
                    String M0 = org.telegram.messenger.hd.M0(2131748715, null);
                    String a03 = org.telegram.messenger.hd.a0("LowPowerEnabledSubtitle", null, 2131748716, String.format("%d%%", Integer.valueOf(b10)));
                    String M02 = org.telegram.messenger.hd.M0(2131751435, null);
                    q60 q60Var = new q60(launchActivity, 11);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.e6 e6Var = a02.f33534c;
                    org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(W, e6Var);
                    ubVar.f39987a.setImageDrawable(k9Var);
                    ubVar.f39988b.setText(M0);
                    ubVar.f39989c.setText(a03);
                    org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(a02.W(), e6Var, true);
                    vbVar.e(M02);
                    vbVar.f40369b = q60Var;
                    ubVar.setButton(vbVar);
                    org.telegram.ui.Components.xb b11 = a02.b(ubVar, 2750);
                    b11.f41643j = 5000;
                    b11.j();
                    return;
                }
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                String str = LaunchActivity.C1;
                org.telegram.messenger.np.s1(launchActivity.P).x3(null, user, null, 0, null, false, false);
                return;
        }
    }
}
