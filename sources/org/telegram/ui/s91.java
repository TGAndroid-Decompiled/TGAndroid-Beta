package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class s91 extends org.telegram.ui.Components.dk0 {
    public final u91 f51982c;

    public s91(u91 u91Var) {
        this.f51982c = u91Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59165f;
        if (i7 != 3 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        u91 u91Var = this.f51982c;
        if (u91Var.f52495o0) {
            return 0;
        }
        return u91Var.f52494n0;
    }

    @Override
    public final int d(int i7) {
        u91 u91Var = this.f51982c;
        if (i7 != u91Var.f52492k0 && i7 != u91Var.f52489h0) {
            if (i7 >= u91Var.f52490i0 && i7 < u91Var.f52491j0) {
                return 2;
            }
            if (i7 >= u91Var.f52493l0 && i7 < u91Var.m0) {
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
        View view = f1Var.f59161a;
        u91 u91Var = this.f51982c;
        y91 y91Var = u91Var.f52503w0;
        if (d(i7) == 1) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            if (i7 == u91Var.f52489h0) {
                y3Var.setText(org.telegram.messenger.gd.N0(2131743753, null));
            }
            if (i7 == u91Var.f52492k0) {
                y3Var.setText(org.telegram.messenger.gd.N0(2131745560, null));
            }
        }
        if (d(i7) == 2) {
            org.telegram.ui.Cells.la laVar = (org.telegram.ui.Cells.la) view;
            laVar.setTopic((TLRPC.TL_forumTopic) u91Var.f52487f0.get(i7 - u91Var.f52490i0));
            if (i7 != u91Var.f52491j0 - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            laVar.d = z11;
        }
        if (d(i7) == 3) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) u91Var.f52488g0.get(i7 - u91Var.f52493l0);
            v91 v91Var = (v91) view;
            if (i7 != u91Var.m0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            v91Var.f52758b5 = z10;
            i10 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
            long b22 = org.telegram.messenger.fj.b2(i10, fjVar.f23993k, true, false);
            if (b22 == 0) {
                b22 = 1;
            }
            TLRPC.TL_forumTopic f10 = y91Var.f54135s.f(y91Var.f54095a, b22);
            if (f10 == null) {
                org.telegram.messenger.a8.b("cant find topic " + b22);
                return;
            }
            v91Var.f0(f10, org.telegram.messenger.fj.B0(fjVar.f23993k), fjVar, false, false);
            v91Var.setTopicIcon(f10);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        boolean z10;
        y91 y91Var = this.f51982c.f52503w0;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    ?? v91Var = new v91(y91Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.g2) y91Var).inPreviewMode;
                    v91Var.f31974l0 = z10;
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
