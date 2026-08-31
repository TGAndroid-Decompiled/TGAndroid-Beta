package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public final class zi0 extends org.telegram.ui.Components.sl0 {
    public final Context f43946c;
    public final bj0 d;

    public zi0(bj0 bj0Var, Context context) {
        this.d = bj0Var;
        this.f43946c = context;
    }

    @Override
    public final void A(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 0) {
            return ((org.telegram.ui.Cells.b5) m1Var.f5875a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.N;
    }

    @Override
    public final int j(int i10) {
        bj0 bj0Var = this.d;
        if (bj0Var.O.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 != bj0Var.E && i10 != bj0Var.L) {
            if (i10 == bj0Var.H) {
                return 3;
            }
            if (i10 == bj0Var.I) {
                return 4;
            }
            if (i10 == bj0Var.K) {
                return 5;
            }
            if (i10 == bj0Var.M) {
                return 6;
            }
            if (i10 == bj0Var.J) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(f2.m1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zi0.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.Cells.z6 z6Var;
        bj0 bj0Var = this.d;
        if (i10 != 0) {
            int i11 = 1;
            Context context = this.f43946c;
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
                                view.setLayoutParams(new f2.x0(-1, 16));
                            }
                        } else {
                            view = new aj0(bj0Var, context);
                            view.setLayoutParams(new f2.x0(-1, -2));
                        }
                    }
                    if (i10 != 4) {
                        i11 = 2;
                    }
                    wf.f fVar = new wf.f(bj0Var.getResourceProvider());
                    bj0Var.Z = fVar;
                    view = new yi0(this, this.f43946c, i11, fVar, bj0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f43946c, org.telegram.ui.ActionBar.k6.G6, 16, 11, false, bj0Var.getResourceProvider());
                    m4Var.setHeight(43);
                    z6Var = m4Var;
                }
            } else {
                bj0Var.getResourceProvider();
                z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
            }
            view = z6Var;
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f43946c, bj0Var.getResourceProvider(), false);
            b5Var.setDividerColor(org.telegram.ui.ActionBar.k6.f21660d7);
            view = b5Var;
        }
        return new f2.m1(view);
    }
}
