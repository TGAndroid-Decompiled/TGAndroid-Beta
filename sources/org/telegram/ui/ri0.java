package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public final class ri0 extends org.telegram.ui.Components.vk0 {
    public final Context f42437c;
    public final ti0 d;

    public ri0(ti0 ti0Var, Context context) {
        this.d = ti0Var;
        this.f42437c = context;
    }

    @Override
    public final void A(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 0) {
            return ((org.telegram.ui.Cells.b5) q1Var.f5501a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.M;
    }

    @Override
    public final int j(int i9) {
        ti0 ti0Var = this.d;
        if (ti0Var.N.contains(Integer.valueOf(i9))) {
            return 1;
        }
        if (i9 != ti0Var.D && i9 != ti0Var.K) {
            if (i9 == ti0Var.G) {
                return 3;
            }
            if (i9 == ti0Var.H) {
                return 4;
            }
            if (i9 == ti0Var.J) {
                return 5;
            }
            if (i9 == ti0Var.L) {
                return 6;
            }
            if (i9 == ti0Var.I) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(f2.q1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ri0.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        org.telegram.ui.Cells.z6 z6Var;
        ti0 ti0Var = this.d;
        if (i9 != 0) {
            int i10 = 1;
            Context context = this.f42437c;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            if (i9 != 6) {
                                if (i9 != 7) {
                                    view = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                                }
                            } else {
                                view = new org.telegram.ui.Cells.l3(context, 16);
                                view.setLayoutParams(new f2.a1(-1, 16));
                            }
                        } else {
                            view = new si0(ti0Var, context);
                            view.setLayoutParams(new f2.a1(-1, -2));
                        }
                    }
                    if (i9 != 4) {
                        i10 = 2;
                    }
                    qf.f fVar = new qf.f(ti0Var.getResourceProvider());
                    ti0Var.Y = fVar;
                    view = new qi0(this, this.f42437c, i10, fVar, ti0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f42437c, org.telegram.ui.ActionBar.f6.G6, 16, 11, false, ti0Var.getResourceProvider());
                    m4Var.setHeight(43);
                    z6Var = m4Var;
                }
            } else {
                ti0Var.getResourceProvider();
                z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
            }
            view = z6Var;
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f42437c, ti0Var.getResourceProvider(), false);
            b5Var.setDividerColor(org.telegram.ui.ActionBar.f6.f23002d7);
            view = b5Var;
        }
        return new f2.q1(view);
    }
}
