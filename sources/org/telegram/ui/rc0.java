package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rc0 implements Runnable {
    public final int f49194a;
    public final dd0 f49195b;

    public rc0(dd0 dd0Var, int i3) {
        this.f49194a = i3;
        this.f49195b = dd0Var;
    }

    @Override
    public final void run() {
        zq[] zqVarArr;
        View view;
        int i3 = this.f49194a;
        int i10 = 0;
        dd0 dd0Var = this.f49195b;
        switch (i3) {
            case 0:
                org.telegram.ui.Components.fh0 fh0Var = dd0Var.H;
                xq xqVar = dd0Var.f44644f;
                int i11 = dd0Var.f44648i0;
                if (i11 != 3 && (zqVarArr = xqVar.f52078f) != null) {
                    for (int length = zqVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || xqVar.f52078f[length].length() != 0) {
                            xqVar.f52078f[length].requestFocus();
                            zq zqVar = xqVar.f52078f[length];
                            zqVar.setSelection(zqVar.length());
                            xd0.a1(dd0Var.f44663v0, xqVar.f52078f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.ch0 ch0Var = dd0Var.f44635a;
                if (ch0Var != null) {
                    ch0Var.start();
                }
                if (i11 == 15) {
                    fh0Var.getAnimatedDrawable().N(0, false, false);
                    fh0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new rc0(dd0Var, 6));
                return;
            case 2:
                kb0 kb0Var = dd0Var.f44665x;
                dd0Var.f44661t0 = false;
                while (true) {
                    zq[] zqVarArr2 = dd0Var.f44644f.f52078f;
                    if (i10 < zqVarArr2.length) {
                        zqVarArr2[i10].z(0.0f);
                        i10++;
                    } else {
                        if (dd0Var.f44648i0 == 15) {
                            view = dd0Var.G;
                        } else {
                            view = dd0Var.E;
                        }
                        if (kb0Var.getCurrentView() != view) {
                            kb0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                org.telegram.messenger.g0.h3(new rc0(dd0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.fh0 fh0Var2 = dd0Var.f44659s;
                fh0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.ch0 ch0Var2 = dd0Var.R;
                ch0Var2.N(0, false, false);
                ch0Var2.K(1);
                fh0Var2.setAnimation(ch0Var2);
                fh0Var2.d();
                return;
            case 5:
                try {
                    dd0Var.f44663v0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dd0Var.getContext());
                String M0 = org.telegram.messenger.bd.M0(2131742808, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131752534, org.telegram.messenger.k5.i(new StringBuilder("+"), dd0Var.d, mf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                s1Var.setOnDismissListener(new zc0(dd0Var, 1));
                alertDialog$Builder.p();
                return;
            case 6:
                org.telegram.ui.Components.ch0 ch0Var3 = dd0Var.S;
                ch0Var3.f32745u0 = new rc0(dd0Var, 8);
                org.telegram.ui.Components.fh0 fh0Var3 = dd0Var.f44659s;
                fh0Var3.setAutoRepeat(false);
                ch0Var3.N(0, false, false);
                fh0Var3.setAnimation(ch0Var3);
                fh0Var3.d();
                return;
            case 7:
                dd0Var.postDelayed(new rc0(dd0Var, 9), 150L);
                return;
            case 8:
                org.telegram.messenger.g0.h3(new rc0(dd0Var, 10));
                return;
            case 9:
                xq xqVar2 = dd0Var.f44644f;
                xqVar2.f52077e = false;
                xqVar2.f52078f[0].requestFocus();
                while (true) {
                    zq[] zqVarArr3 = xqVar2.f52078f;
                    if (i10 < zqVarArr3.length) {
                        zqVarArr3[i10].z(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.fh0 fh0Var4 = dd0Var.f44659s;
                fh0Var4.setAutoRepeat(false);
                fh0Var4.setAnimation(dd0Var.f44635a);
                return;
        }
    }
}
