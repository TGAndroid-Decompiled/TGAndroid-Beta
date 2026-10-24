package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public final class vi0 extends org.telegram.ui.Components.km0 {
    public final Context f42752c;
    public final xi0 d;

    public vi0(xi0 xi0Var, Context context) {
        this.d = xi0Var;
        this.f42752c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f46342a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46345f == 0) {
            return ((org.telegram.ui.Cells.a5) b1Var.f46342a).getCurrentObject() instanceof TLObject;
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
    public final void v(s4.b1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vi0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.Cells.b7 b7Var;
        xi0 xi0Var = this.d;
        if (i10 != 0) {
            int i11 = 1;
            Context context = this.f42752c;
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
                            view = new wi0(xi0Var, context);
                            view.setLayoutParams(new s4.o0(-1, -2));
                        }
                    }
                    if (i10 != 4) {
                        i11 = 2;
                    }
                    jg.f fVar = new jg.f(xi0Var.getResourceProvider());
                    xi0Var.f43619c0 = fVar;
                    view = new ui0(this, this.f42752c, i11, fVar, xi0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f42752c, org.telegram.ui.ActionBar.k6.G6, 16, 11, false, xi0Var.getResourceProvider());
                    l4Var.setHeight(43);
                    b7Var = l4Var;
                }
            } else {
                xi0Var.getResourceProvider();
                b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
            }
            view = b7Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(6, 2, this.f42752c, xi0Var.getResourceProvider(), false);
            a5Var.setDividerColor(org.telegram.ui.ActionBar.k6.f21185d7);
            view = a5Var;
        }
        return new s4.b1(view);
    }
}
