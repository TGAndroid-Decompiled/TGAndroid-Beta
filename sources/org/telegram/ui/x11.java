package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class x11 extends org.telegram.ui.Components.lm0 {
    public final Context f43480c;
    public final y11 d;

    public x11(y11 y11Var, Context context) {
        this.d = y11Var;
        this.f43480c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        if (b10 != 0) {
            y11 y11Var = this.d;
            if (b10 != y11Var.f43690c && b10 != y11Var.d && b10 != y11Var.e) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.h;
    }

    @Override
    public final int j(int i10) {
        y11 y11Var = this.d;
        if (i10 == y11Var.f43691f) {
            return 0;
        }
        if (i10 != 0 && i10 != y11Var.f43690c && i10 != y11Var.d && i10 != y11Var.e) {
            return 1;
        }
        return i10 + 9;
    }

    @Override
    public final void v(s4.b1 r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x11.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        Context context = this.f43480c;
        if (i10 != 0) {
            if (i10 != 1) {
                switch (i10) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, i3Var, null);
                        this.d.f43692n[i10 - 9] = i3Var;
                        e9Var = i3Var;
                        break;
                    default:
                        e9Var = new org.telegram.ui.Cells.w8(context);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, e9Var, null);
                        break;
                }
            } else {
                e9Var = new org.telegram.ui.Cells.ca(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, e9Var, null);
            }
        } else {
            e9Var = new org.telegram.ui.Cells.e9(context);
        }
        e9Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(e9Var);
    }
}
