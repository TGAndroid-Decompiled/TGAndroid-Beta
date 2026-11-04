package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class we0 extends org.telegram.ui.Components.sj0 {
    public final Context f50800c;
    public final xe0 d;

    public we0(xe0 xe0Var, Context context) {
        this.d = xe0Var;
        this.f50800c = context;
    }

    @Override
    public final void A(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int b10 = d1Var.b();
        xe0 xe0Var = this.d;
        if (xe0Var.R != b10 && xe0Var.f52013y != b10) {
            if (b10 < xe0Var.E || b10 >= xe0Var.F) {
                if ((b10 < xe0Var.I || b10 >= xe0Var.J) && b10 != xe0Var.O) {
                    if (b10 >= xe0Var.V && b10 < xe0Var.W) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.d.Y;
    }

    @Override
    public final int d(int i3) {
        xe0 xe0Var = this.d;
        if (i3 == xe0Var.f52005r) {
            return 0;
        }
        if (i3 == xe0Var.f52007s || i3 == xe0Var.M || i3 == xe0Var.T || i3 == xe0Var.Q) {
            return 1;
        }
        if (i3 == xe0Var.f52011w) {
            return 2;
        }
        if (i3 == xe0Var.f52013y) {
            return 3;
        }
        if (i3 != xe0Var.f52012x && i3 != xe0Var.K && i3 != xe0Var.N && i3 != xe0Var.S && i3 != xe0Var.U) {
            if (i3 < xe0Var.E || i3 >= xe0Var.F) {
                if (i3 >= xe0Var.I && i3 < xe0Var.J) {
                    return 5;
                }
                if (i3 == xe0Var.G) {
                    return 6;
                }
                if (i3 == xe0Var.L) {
                    return 7;
                }
                if (i3 == xe0Var.O) {
                    return 8;
                }
                if (i3 == xe0Var.P) {
                    return 9;
                }
                if (i3 != xe0Var.R) {
                    if (i3 < xe0Var.V || i3 >= xe0Var.W) {
                        if (i3 != xe0Var.H) {
                            return 1;
                        }
                        return 11;
                    }
                    return 10;
                }
                return 10;
            }
            return 5;
        }
        return 4;
    }

    @Override
    public final void t(u4.d1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.we0.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Components.m70 m70Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.Components.iz izVar;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i10;
        xe0 xe0Var = this.d;
        Context context = this.f50800c;
        switch (i3) {
            case 1:
                m70Var = new org.telegram.ui.Cells.n4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.m70 m70Var2 = new org.telegram.ui.Components.m70(this.f50800c, xe0Var, null, true, xe0Var.h);
                m70Var2.setPermanent(true);
                m70Var2.setDelegate(new ve0(this, m70Var2));
                m70Var = m70Var2;
                break;
            case 3:
                e6Var = ((org.telegram.ui.ActionBar.d2) xe0Var).resourceProvider;
                m70Var = new org.telegram.ui.Cells.i2(64, context, e6Var);
                break;
            case 4:
                m70Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 5:
                m70Var = new ue0(xe0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.iz izVar2 = new org.telegram.ui.Components.iz(context, null);
                izVar2.setIsSingleCell(true);
                izVar2.setViewType(9);
                izVar2.f34869x = false;
                izVar = izVar2;
                m70Var = izVar;
                break;
            case 7:
                m70Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
                v9Var.b(org.telegram.messenger.bd.M0(2131751576, null), false);
                org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.f28102p7, null);
                izVar = v9Var;
                m70Var = izVar;
                break;
            case 9:
                m70Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 10:
                m70Var = new org.telegram.ui.Cells.a5(this.f50800c, 8, 6, false, null);
                break;
            case 11:
                e6Var2 = ((org.telegram.ui.ActionBar.d2) xe0Var).resourceProvider;
                m70Var = new org.telegram.ui.Cells.y8(context, e6Var2);
                break;
            default:
                FrameLayout d2Var = new ai.d2(context, 29);
                d2Var.addView(new qe0(context), b8.mf.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27939g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (xe0Var.h) {
                    i10 = 2131746878;
                } else {
                    i10 = 2131746879;
                }
                textView.setText(org.telegram.messenger.bd.M0(i10, null));
                d2Var.addView(textView, b8.mf.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                d2Var.setTag(-33024);
                m70Var = d2Var;
                break;
        }
        return k2.p1.p(m70Var, m70Var, -1, -2);
    }
}
