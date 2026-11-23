package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class s91 extends org.telegram.ui.Components.dk0 {
    public final u91 f51986c;

    public s91(u91 u91Var) {
        this.f51986c = u91Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59169f;
        if (i7 != 3 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        u91 u91Var = this.f51986c;
        if (u91Var.f52499o0) {
            return 0;
        }
        return u91Var.f52498n0;
    }

    @Override
    public final int d(int i7) {
        u91 u91Var = this.f51986c;
        if (i7 != u91Var.f52496k0 && i7 != u91Var.f52493h0) {
            if (i7 >= u91Var.f52494i0 && i7 < u91Var.f52495j0) {
                return 2;
            }
            if (i7 >= u91Var.f52497l0 && i7 < u91Var.m0) {
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
        View view = f1Var.f59165a;
        u91 u91Var = this.f51986c;
        y91 y91Var = u91Var.f52507w0;
        if (d(i7) == 1) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            if (i7 == u91Var.f52493h0) {
                y3Var.setText(org.telegram.messenger.hd.N0(2131743751, null));
            }
            if (i7 == u91Var.f52496k0) {
                y3Var.setText(org.telegram.messenger.hd.N0(2131745560, null));
            }
        }
        if (d(i7) == 2) {
            org.telegram.ui.Cells.la laVar = (org.telegram.ui.Cells.la) view;
            laVar.setTopic((TLRPC.TL_forumTopic) u91Var.f52491f0.get(i7 - u91Var.f52494i0));
            if (i7 != u91Var.f52495j0 - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            laVar.d = z11;
        }
        if (d(i7) == 3) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) u91Var.f52492g0.get(i7 - u91Var.f52497l0);
            v91 v91Var = (v91) view;
            if (i7 != u91Var.m0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            v91Var.f52762b5 = z10;
            i10 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
            long b22 = org.telegram.messenger.gj.b2(i10, gjVar.f24213k, true, false);
            if (b22 == 0) {
                b22 = 1;
            }
            TLRPC.TL_forumTopic f10 = y91Var.f54139s.f(y91Var.f54099a, b22);
            if (f10 == null) {
                org.telegram.messenger.a8.b("cant find topic " + b22);
                return;
            }
            v91Var.f0(f10, org.telegram.messenger.gj.B0(gjVar.f24213k), gjVar, false, false);
            v91Var.setTopicIcon(f10);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        boolean z10;
        y91 y91Var = this.f51986c.f52507w0;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    ?? v91Var = new v91(y91Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.g2) y91Var).inPreviewMode;
                    v91Var.f31977l0 = z10;
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
