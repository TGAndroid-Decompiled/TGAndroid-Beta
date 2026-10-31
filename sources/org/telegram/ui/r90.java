package org.telegram.ui;

import android.os.Bundle;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class r90 implements org.telegram.messenger.jp {
    public final f70 f41179a;
    public final String f41180b;
    public final org.telegram.ui.ActionBar.k2 f41181c;
    public final long d;
    public final Integer e;
    public final Bundle f41182f;
    public final LaunchActivity h;

    public r90(LaunchActivity launchActivity, f70 f70Var, String str, org.telegram.ui.ActionBar.k2 k2Var, long j10, Integer num, Bundle bundle) {
        this.h = launchActivity;
        this.f41179a = f70Var;
        this.f41180b = str;
        this.f41181c = k2Var;
        this.d = j10;
        this.e = num;
        this.f41182f = bundle;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.s4.t0((org.telegram.ui.ActionBar.k2) i0.a.g(1, launchActivity.f33353d0), null, org.telegram.messenger.cd.L0(2131749085, null), null);
        }
        try {
            this.f41179a.run();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void g(boolean z10) {
        try {
            this.f41179a.run();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            String str = this.f41180b;
            long j10 = this.d;
            org.telegram.ui.ActionBar.k2 k2Var = this.f41181c;
            if (str == null || !(k2Var instanceof un) || ((un) k2Var).a() != j10) {
                if (k2Var instanceof un) {
                    un unVar = (un) k2Var;
                    if (unVar.a() == j10 && this.e == null) {
                        org.telegram.messenger.i0.F3(5.0f, unVar.f42492z0, null);
                        org.telegram.messenger.t2.APP_ERROR.a();
                        mk mkVar = unVar.Z;
                        for (int i10 = 0; i10 < mkVar.getChildCount(); i10++) {
                            org.telegram.messenger.i0.F3(5.0f, mkVar.getChildAt(i10), null);
                        }
                        org.telegram.ui.ActionBar.l actionBar = unVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            org.telegram.messenger.i0.F3(5.0f, actionBar.getChildAt(i11), null);
                        }
                    }
                }
                k2Var = new un(this.f41182f);
                ((ActionBarLayout) launchActivity.M()).R(k2Var);
            }
            org.telegram.messenger.i0.h3(new ag.a3(this, this.f41180b, this.d, k2Var, 10), 150L);
        }
    }
}
