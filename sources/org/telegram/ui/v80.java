package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class v80 implements org.telegram.messenger.q20 {
    public final int f42679a;
    public final LaunchActivity f42680b;

    public v80(LaunchActivity launchActivity, int i10) {
        this.f42679a = i10;
        this.f42680b = launchActivity;
    }

    @Override
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.k2 lastFragment;
        int i10 = this.f42679a;
        LaunchActivity launchActivity = this.f42680b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f33377q0 != null && booleanValue && org.telegram.messenger.sc.c() < 100 && (lastFragment = launchActivity.f33377q0.getLastFragment()) != null && !(lastFragment instanceof bb0)) {
                    int b10 = org.telegram.messenger.sc.b();
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(lastFragment);
                    org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(b10 / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.t6.Y5));
                    String L0 = org.telegram.messenger.cd.L0(2131748726, null);
                    String a03 = org.telegram.messenger.cd.a0("LowPowerEnabledSubtitle", null, 2131748727, String.format("%d%%", Integer.valueOf(b10)));
                    String L02 = org.telegram.messenger.cd.L0(2131751436, null);
                    q70 q70Var = new q70(launchActivity, 11);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.p6 p6Var = a02.f25043c;
                    org.telegram.ui.Components.tb tbVar = new org.telegram.ui.Components.tb(W, p6Var);
                    tbVar.f30536a.setImageDrawable(i9Var);
                    tbVar.f30537b.setText(L0);
                    tbVar.f30538c.setText(a03);
                    org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(a02.W(), p6Var, true);
                    ubVar.e(L02);
                    ubVar.f30890b = q70Var;
                    tbVar.setButton(ubVar);
                    org.telegram.ui.Components.wb b11 = a02.b(tbVar, 2750);
                    b11.f32135j = 5000;
                    b11.j();
                    return;
                }
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.vp.r1(launchActivity.O).u3(null, user, null, 0, null, false, false);
                return;
        }
    }
}
