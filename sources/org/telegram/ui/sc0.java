package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sc0 implements Runnable {
    public final int f51192a;
    public final ed0 f51193b;

    public sc0(ed0 ed0Var, int i7) {
        this.f51192a = i7;
        this.f51193b = ed0Var;
    }

    @Override
    public final void run() {
        dr[] drVarArr;
        View view;
        int i7 = this.f51192a;
        int i10 = 0;
        ed0 ed0Var = this.f51193b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.fh0 fh0Var = ed0Var.H;
                ar arVar = ed0Var.f46730f;
                int i11 = ed0Var.f46734i0;
                if (i11 != 3 && (drVarArr = arVar.f45485f) != null) {
                    for (int length = drVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || arVar.f45485f[length].length() != 0) {
                            arVar.f45485f[length].requestFocus();
                            dr drVar = arVar.f45485f[length];
                            drVar.setSelection(drVar.length());
                            ce0.b1(ed0Var.f46749v0, arVar.f45485f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.ch0 ch0Var = ed0Var.f46721a;
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
                org.telegram.messenger.g0.h3(new sc0(ed0Var, 6));
                return;
            case 2:
                nb0 nb0Var = ed0Var.f46751x;
                ed0Var.f46747t0 = false;
                while (true) {
                    dr[] drVarArr2 = ed0Var.f46730f.f45485f;
                    if (i10 < drVarArr2.length) {
                        drVarArr2[i10].A(0.0f);
                        i10++;
                    } else {
                        if (ed0Var.f46734i0 == 15) {
                            view = ed0Var.G;
                        } else {
                            view = ed0Var.E;
                        }
                        if (nb0Var.getCurrentView() != view) {
                            nb0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                org.telegram.messenger.g0.h3(new sc0(ed0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.fh0 fh0Var2 = ed0Var.f46745s;
                fh0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.ch0 ch0Var2 = ed0Var.R;
                ch0Var2.N(0, false, false);
                ch0Var2.K(1);
                fh0Var2.setAnimation(ch0Var2);
                fh0Var2.d();
                return;
            case 5:
                try {
                    ed0Var.f46749v0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ed0Var.getContext());
                String M0 = org.telegram.messenger.hd.M0(2131742798, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131752534, org.telegram.messenger.k5.h(new StringBuilder("+"), ed0Var.d, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                t1Var.setOnDismissListener(new ad0(ed0Var, 1));
                alertDialog$Builder.p();
                return;
            case 6:
                org.telegram.ui.Components.ch0 ch0Var3 = ed0Var.S;
                ch0Var3.f33599u0 = new sc0(ed0Var, 8);
                org.telegram.ui.Components.fh0 fh0Var3 = ed0Var.f46745s;
                fh0Var3.setAutoRepeat(false);
                ch0Var3.N(0, false, false);
                fh0Var3.setAnimation(ch0Var3);
                fh0Var3.d();
                return;
            case 7:
                ed0Var.postDelayed(new sc0(ed0Var, 9), 150L);
                return;
            case 8:
                org.telegram.messenger.g0.h3(new sc0(ed0Var, 10));
                return;
            case 9:
                ar arVar2 = ed0Var.f46730f;
                arVar2.f45484e = false;
                arVar2.f45485f[0].requestFocus();
                while (true) {
                    dr[] drVarArr3 = arVar2.f45485f;
                    if (i10 < drVarArr3.length) {
                        drVarArr3[i10].A(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.fh0 fh0Var4 = ed0Var.f46745s;
                fh0Var4.setAutoRepeat(false);
                fh0Var4.setAnimation(ed0Var.f46721a);
                return;
        }
    }
}
