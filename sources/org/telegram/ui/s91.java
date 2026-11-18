package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class s91 extends org.telegram.ui.Components.bk0 {
    public final u91 f51944c;

    public s91(u91 u91Var) {
        this.f51944c = u91Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59126f;
        if (i7 != 3 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        u91 u91Var = this.f51944c;
        if (u91Var.f52490o0) {
            return 0;
        }
        return u91Var.f52489n0;
    }

    @Override
    public final int d(int i7) {
        u91 u91Var = this.f51944c;
        if (i7 != u91Var.f52487k0 && i7 != u91Var.f52484h0) {
            if (i7 >= u91Var.f52485i0 && i7 < u91Var.f52486j0) {
                return 2;
            }
            if (i7 >= u91Var.f52488l0 && i7 < u91Var.m0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        int i10;
        boolean z11;
        View view = f1Var.f59122a;
        u91 u91Var = this.f51944c;
        y91 y91Var = u91Var.f52498w0;
        if (d(i7) == 1) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i7 == u91Var.f52484h0) {
                x3Var.setText(org.telegram.messenger.gd.M0(2131743759, null));
            }
            if (i7 == u91Var.f52487k0) {
                x3Var.setText(org.telegram.messenger.gd.M0(2131745561, null));
            }
        }
        if (d(i7) == 2) {
            org.telegram.ui.Cells.ka kaVar = (org.telegram.ui.Cells.ka) view;
            kaVar.setTopic((TLRPC.TL_forumTopic) u91Var.f52482f0.get(i7 - u91Var.f52485i0));
            if (i7 != u91Var.f52486j0 - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            kaVar.d = z11;
        }
        if (d(i7) == 3) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) u91Var.f52483g0.get(i7 - u91Var.f52488l0);
            v91 v91Var = (v91) view;
            if (i7 != u91Var.m0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            v91Var.f52736b5 = z10;
            i10 = ((org.telegram.ui.ActionBar.h2) y91Var).currentAccount;
            long b22 = org.telegram.messenger.fj.b2(i10, fjVar.f23968k, true, false);
            if (b22 == 0) {
                b22 = 1;
            }
            TLRPC.TL_forumTopic f10 = y91Var.f54149s.f(y91Var.f54109a, b22);
            if (f10 == null) {
                org.telegram.messenger.a8.b("cant find topic " + b22);
                return;
            }
            v91Var.f0(f10, org.telegram.messenger.fj.B0(fjVar.f23968k), fjVar, false, false);
            v91Var.setTopicIcon(f10);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        boolean z10;
        y91 y91Var = this.f51944c.f52498w0;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    ?? v91Var = new v91(y91Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.h2) y91Var).inPreviewMode;
                    v91Var.f31898l0 = z10;
                    frameLayout = v91Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.ka(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(frameLayout);
    }
}
