package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class s91 extends org.telegram.ui.Components.bk0 {
    public final u91 f51942c;

    public s91(u91 u91Var) {
        this.f51942c = u91Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59127f;
        if (i7 != 3 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        u91 u91Var = this.f51942c;
        if (u91Var.f52481o0) {
            return 0;
        }
        return u91Var.f52480n0;
    }

    @Override
    public final int d(int i7) {
        u91 u91Var = this.f51942c;
        if (i7 != u91Var.f52478k0 && i7 != u91Var.f52475h0) {
            if (i7 >= u91Var.f52476i0 && i7 < u91Var.f52477j0) {
                return 2;
            }
            if (i7 >= u91Var.f52479l0 && i7 < u91Var.m0) {
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
        View view = f1Var.f59123a;
        u91 u91Var = this.f51942c;
        y91 y91Var = u91Var.f52489w0;
        if (d(i7) == 1) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            if (i7 == u91Var.f52475h0) {
                y3Var.setText(org.telegram.messenger.gd.M0(2131743759, null));
            }
            if (i7 == u91Var.f52478k0) {
                y3Var.setText(org.telegram.messenger.gd.M0(2131745561, null));
            }
        }
        if (d(i7) == 2) {
            org.telegram.ui.Cells.la laVar = (org.telegram.ui.Cells.la) view;
            laVar.setTopic((TLRPC.TL_forumTopic) u91Var.f52473f0.get(i7 - u91Var.f52476i0));
            if (i7 != u91Var.f52477j0 - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            laVar.d = z11;
        }
        if (d(i7) == 3) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) u91Var.f52474g0.get(i7 - u91Var.f52479l0);
            v91 v91Var = (v91) view;
            if (i7 != u91Var.m0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            v91Var.f52716b5 = z10;
            i10 = ((org.telegram.ui.ActionBar.h2) y91Var).currentAccount;
            long b22 = org.telegram.messenger.fj.b2(i10, fjVar.f23965k, true, false);
            if (b22 == 0) {
                b22 = 1;
            }
            TLRPC.TL_forumTopic f10 = y91Var.f54090s.f(y91Var.f54050a, b22);
            if (f10 == null) {
                org.telegram.messenger.a8.b("cant find topic " + b22);
                return;
            }
            v91Var.f0(f10, org.telegram.messenger.fj.B0(fjVar.f23965k), fjVar, false, false);
            v91Var.setTopicIcon(f10);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        boolean z10;
        y91 y91Var = this.f51942c.f52489w0;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    ?? v91Var = new v91(y91Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.h2) y91Var).inPreviewMode;
                    v91Var.f31946l0 = z10;
                    frameLayout = v91Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.la(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.y3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(frameLayout);
    }
}
