package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public final class ti0 extends org.telegram.ui.Components.lm0 {
    public final Context f43851c;
    public final vi0 d;

    public ti0(vi0 vi0Var, Context context) {
        this.d = vi0Var;
        this.f43851c = context;
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47738a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47741f == 0) {
            return ((org.telegram.ui.Cells.f5) e1Var.f47738a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.Q;
    }

    @Override
    public final int j(int i10) {
        vi0 vi0Var = this.d;
        if (vi0Var.R.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 != vi0Var.H && i10 != vi0Var.O) {
            if (i10 == vi0Var.K) {
                return 3;
            }
            if (i10 == vi0Var.L) {
                return 4;
            }
            if (i10 == vi0Var.N) {
                return 5;
            }
            if (i10 == vi0Var.P) {
                return 6;
            }
            if (i10 == vi0Var.M) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(s4.e1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ti0.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.Cells.f7 f7Var;
        vi0 vi0Var = this.d;
        if (i10 != 0) {
            int i11 = 1;
            Context context = this.f43851c;
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
                            view = new ui0(vi0Var, context);
                            view.setLayoutParams(new s4.q0(-1, -2));
                        }
                    }
                    if (i10 != 4) {
                        i11 = 2;
                    }
                    kg.g gVar = new kg.g(vi0Var.getResourceProvider());
                    vi0Var.f44825c0 = gVar;
                    view = new si0(this, this.f43851c, i11, gVar, vi0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(this.f43851c, org.telegram.ui.ActionBar.y6.G6, 16, 11, false, vi0Var.getResourceProvider());
                    q4Var.setHeight(43);
                    f7Var = q4Var;
                }
            } else {
                vi0Var.getResourceProvider();
                f7Var = new org.telegram.ui.Cells.f7(context, (d3) null);
            }
            view = f7Var;
        } else {
            org.telegram.ui.Cells.f5 f5Var = new org.telegram.ui.Cells.f5(6, 2, this.f43851c, vi0Var.getResourceProvider(), false);
            f5Var.setDividerColor(org.telegram.ui.ActionBar.y6.f23357d7);
            view = f5Var;
        }
        return new s4.e1(view);
    }
}
