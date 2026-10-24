package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class w11 extends org.telegram.ui.Components.km0 {
    public final Context f42877c;
    public final x11 d;

    public w11(x11 x11Var, Context context) {
        this.d = x11Var;
        this.f42877c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        if (b10 != 0) {
            x11 x11Var = this.d;
            if (b10 != x11Var.f43453c && b10 != x11Var.d && b10 != x11Var.e) {
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
        x11 x11Var = this.d;
        if (i10 == x11Var.f43454f) {
            return 0;
        }
        if (i10 != 0 && i10 != x11Var.f43453c && i10 != x11Var.d && i10 != x11Var.e) {
            return 1;
        }
        return i10 + 9;
    }

    @Override
    public final void v(s4.b1 r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w11.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        Context context = this.f42877c;
        if (i10 != 0) {
            if (i10 != 1) {
                switch (i10) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, i3Var, null);
                        this.d.f43455n[i10 - 9] = i3Var;
                        e9Var = i3Var;
                        break;
                    default:
                        e9Var = new org.telegram.ui.Cells.w8(context);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, e9Var, null);
                        break;
                }
            } else {
                e9Var = new org.telegram.ui.Cells.ca(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, e9Var, null);
            }
        } else {
            e9Var = new org.telegram.ui.Cells.e9(context);
        }
        e9Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(e9Var);
    }
}
