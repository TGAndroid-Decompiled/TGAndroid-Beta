package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public final class wi0 extends org.telegram.ui.Components.lm0 {
    public final Context f43380c;
    public final yi0 d;

    public wi0(yi0 yi0Var, Context context) {
        this.d = yi0Var;
        this.f43380c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f46343a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46346f == 0) {
            return ((org.telegram.ui.Cells.a5) b1Var.f46343a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.Q;
    }

    @Override
    public final int j(int i10) {
        yi0 yi0Var = this.d;
        if (yi0Var.R.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 != yi0Var.H && i10 != yi0Var.O) {
            if (i10 == yi0Var.K) {
                return 3;
            }
            if (i10 == yi0Var.L) {
                return 4;
            }
            if (i10 == yi0Var.N) {
                return 5;
            }
            if (i10 == yi0Var.P) {
                return 6;
            }
            if (i10 == yi0Var.M) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(s4.b1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wi0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.Cells.b7 b7Var;
        yi0 yi0Var = this.d;
        if (i10 != 0) {
            int i11 = 1;
            Context context = this.f43380c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    view = new org.telegram.ui.Cells.r4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                                }
                            } else {
                                view = new org.telegram.ui.Cells.j3(context, 16);
                                view.setLayoutParams(new s4.o0(-1, 16));
                            }
                        } else {
                            view = new xi0(yi0Var, context);
                            view.setLayoutParams(new s4.o0(-1, -2));
                        }
                    }
                    if (i10 != 4) {
                        i11 = 2;
                    }
                    jg.f fVar = new jg.f(yi0Var.getResourceProvider());
                    yi0Var.f43878c0 = fVar;
                    view = new vi0(this, this.f43380c, i11, fVar, yi0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f43380c, org.telegram.ui.ActionBar.k6.G6, 16, 11, false, yi0Var.getResourceProvider());
                    l4Var.setHeight(43);
                    b7Var = l4Var;
                }
            } else {
                yi0Var.getResourceProvider();
                b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
            }
            view = b7Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(6, 2, this.f43380c, yi0Var.getResourceProvider(), false);
            a5Var.setDividerColor(org.telegram.ui.ActionBar.k6.f21184d7);
            view = a5Var;
        }
        return new s4.b1(view);
    }
}
