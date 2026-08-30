package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public final class yi0 extends org.telegram.ui.Components.rl0 {
    public final Context f40531c;
    public final aj0 d;

    public yi0(aj0 aj0Var, Context context) {
        this.d = aj0Var;
        this.f40531c = context;
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5785a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f == 0) {
            return ((org.telegram.ui.Cells.b5) l1Var.f5785a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.N;
    }

    @Override
    public final int j(int i10) {
        aj0 aj0Var = this.d;
        if (aj0Var.O.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 != aj0Var.E && i10 != aj0Var.L) {
            if (i10 == aj0Var.H) {
                return 3;
            }
            if (i10 == aj0Var.I) {
                return 4;
            }
            if (i10 == aj0Var.K) {
                return 5;
            }
            if (i10 == aj0Var.M) {
                return 6;
            }
            if (i10 == aj0Var.J) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(f2.l1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yi0.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.Cells.z6 z6Var;
        aj0 aj0Var = this.d;
        if (i10 != 0) {
            int i11 = 1;
            Context context = this.f40531c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    view = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                                }
                            } else {
                                view = new org.telegram.ui.Cells.k3(context, 16);
                                view.setLayoutParams(new f2.w0(-1, 16));
                            }
                        } else {
                            view = new zi0(aj0Var, context);
                            view.setLayoutParams(new f2.w0(-1, -2));
                        }
                    }
                    if (i10 != 4) {
                        i11 = 2;
                    }
                    vf.f fVar = new vf.f(aj0Var.getResourceProvider());
                    aj0Var.Z = fVar;
                    view = new xi0(this, this.f40531c, i11, fVar, aj0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f40531c, org.telegram.ui.ActionBar.j6.G6, 16, 11, false, aj0Var.getResourceProvider());
                    m4Var.setHeight(43);
                    z6Var = m4Var;
                }
            } else {
                aj0Var.getResourceProvider();
                z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
            }
            view = z6Var;
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f40531c, aj0Var.getResourceProvider(), false);
            b5Var.setDividerColor(org.telegram.ui.ActionBar.j6.f19907d7);
            view = b5Var;
        }
        return new f2.l1(view);
    }
}
