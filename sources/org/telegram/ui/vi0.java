package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public final class vi0 extends org.telegram.ui.Components.mm0 {
    public final Context f44362c;
    public final xi0 d;

    public vi0(xi0 xi0Var, Context context) {
        this.d = xi0Var;
        this.f44362c = context;
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47773a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f == 0) {
            return ((org.telegram.ui.Cells.f5) e1Var.f47773a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.Q;
    }

    @Override
    public final int j(int i10) {
        xi0 xi0Var = this.d;
        if (xi0Var.R.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 != xi0Var.H && i10 != xi0Var.O) {
            if (i10 == xi0Var.K) {
                return 3;
            }
            if (i10 == xi0Var.L) {
                return 4;
            }
            if (i10 == xi0Var.N) {
                return 5;
            }
            if (i10 == xi0Var.P) {
                return 6;
            }
            if (i10 == xi0Var.M) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(s4.e1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vi0.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.Cells.f7 f7Var;
        xi0 xi0Var = this.d;
        if (i10 != 0) {
            int i11 = 1;
            Context context = this.f44362c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    view = new org.telegram.ui.Cells.w4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                                }
                            } else {
                                view = new org.telegram.ui.Cells.i3(context, 16);
                                view.setLayoutParams(new s4.q0(-1, 16));
                            }
                        } else {
                            view = new wi0(xi0Var, context);
                            view.setLayoutParams(new s4.q0(-1, -2));
                        }
                    }
                    if (i10 != 4) {
                        i11 = 2;
                    }
                    kg.g gVar = new kg.g(xi0Var.getResourceProvider());
                    xi0Var.f45700c0 = gVar;
                    view = new ui0(this, this.f44362c, i11, gVar, xi0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(this.f44362c, org.telegram.ui.ActionBar.y6.G6, 16, 11, false, xi0Var.getResourceProvider());
                    q4Var.setHeight(43);
                    f7Var = q4Var;
                }
            } else {
                xi0Var.getResourceProvider();
                f7Var = new org.telegram.ui.Cells.f7(context, (d3) null);
            }
            view = f7Var;
        } else {
            org.telegram.ui.Cells.f5 f5Var = new org.telegram.ui.Cells.f5(6, 2, this.f44362c, xi0Var.getResourceProvider(), false);
            f5Var.setDividerColor(org.telegram.ui.ActionBar.y6.f23358d7);
            view = f5Var;
        }
        return new s4.e1(view);
    }
}
