package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vc0 implements Runnable {
    public final int f50642a;
    public final id0 f50643b;

    public vc0(id0 id0Var, int i7) {
        this.f50642a = i7;
        this.f50643b = id0Var;
    }

    @Override
    public final void run() {
        dr[] drVarArr;
        View view;
        int i7 = this.f50642a;
        int i10 = 0;
        id0 id0Var = this.f50643b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.dh0 dh0Var = id0Var.G;
                ar arVar = id0Var.f46631f;
                int i11 = id0Var.f46634h0;
                if (i11 != 3 && (drVarArr = arVar.f43768f) != null) {
                    for (int length = drVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || arVar.f43768f[length].length() != 0) {
                            arVar.f43768f[length].requestFocus();
                            dr drVar = arVar.f43768f[length];
                            drVar.setSelection(drVar.length());
                            ee0.b1(id0Var.f46649u0, arVar.f43768f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.ah0 ah0Var = id0Var.f46622a;
                if (ah0Var != null) {
                    ah0Var.start();
                }
                if (i11 == 15) {
                    dh0Var.getAnimatedDrawable().N(0, false, false);
                    dh0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new vc0(id0Var, 6));
                return;
            case 2:
                pb0 pb0Var = id0Var.f46651x;
                id0Var.f46647s0 = false;
                while (true) {
                    dr[] drVarArr2 = id0Var.f46631f.f43768f;
                    if (i10 < drVarArr2.length) {
                        drVarArr2[i10].z(0.0f);
                        i10++;
                    } else {
                        if (id0Var.f46634h0 == 15) {
                            view = id0Var.F;
                        } else {
                            view = id0Var.D;
                        }
                        if (pb0Var.getCurrentView() != view) {
                            pb0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                org.telegram.messenger.g0.h3(new vc0(id0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.dh0 dh0Var2 = id0Var.f46646s;
                dh0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.ah0 ah0Var2 = id0Var.Q;
                ah0Var2.N(0, false, false);
                ah0Var2.K(1);
                dh0Var2.setAnimation(ah0Var2);
                dh0Var2.d();
                return;
            case 5:
                try {
                    id0Var.f46649u0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(id0Var.getContext());
                String M0 = org.telegram.messenger.id.M0(2131742798, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.a0(null, null, 2131752534, org.telegram.messenger.k5.i(new StringBuilder("+"), id0Var.d, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                u1Var.setOnDismissListener(new ed0(id0Var, 1));
                alertDialog$Builder.p();
                return;
            case 6:
                org.telegram.ui.Components.ah0 ah0Var3 = id0Var.R;
                ah0Var3.f31845t0 = new vc0(id0Var, 8);
                org.telegram.ui.Components.dh0 dh0Var3 = id0Var.f46646s;
                dh0Var3.setAutoRepeat(false);
                ah0Var3.N(0, false, false);
                dh0Var3.setAnimation(ah0Var3);
                dh0Var3.d();
                return;
            case 7:
                id0Var.postDelayed(new vc0(id0Var, 9), 150L);
                return;
            case 8:
                org.telegram.messenger.g0.h3(new vc0(id0Var, 10));
                return;
            case 9:
                ar arVar2 = id0Var.f46631f;
                arVar2.f43767e = false;
                arVar2.f43768f[0].requestFocus();
                while (true) {
                    dr[] drVarArr3 = arVar2.f43768f;
                    if (i10 < drVarArr3.length) {
                        drVarArr3[i10].z(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.dh0 dh0Var4 = id0Var.f46646s;
                dh0Var4.setAutoRepeat(false);
                dh0Var4.setAnimation(id0Var.f46622a);
                return;
        }
    }
}
