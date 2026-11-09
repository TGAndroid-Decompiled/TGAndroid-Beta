package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class s91 extends org.telegram.ui.Components.pj0 {
    public final u91 f49847c;

    public s91(u91 u91Var) {
        this.f49847c = u91Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 != 3 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        u91 u91Var = this.f49847c;
        if (u91Var.f50336n0) {
            return 0;
        }
        return u91Var.m0;
    }

    @Override
    public final int d(int i7) {
        u91 u91Var = this.f49847c;
        if (i7 != u91Var.f50333j0 && i7 != u91Var.f50330g0) {
            if (i7 >= u91Var.f50331h0 && i7 < u91Var.f50332i0) {
                return 2;
            }
            if (i7 >= u91Var.f50334k0 && i7 < u91Var.f50335l0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        int i10;
        boolean z10;
        View view = d1Var.f57056a;
        u91 u91Var = this.f49847c;
        y91 y91Var = u91Var.f50344v0;
        if (d(i7) == 1) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i7 == u91Var.f50330g0) {
                x3Var.setText(org.telegram.messenger.id.M0(2131743994, null));
            }
            if (i7 == u91Var.f50333j0) {
                x3Var.setText(org.telegram.messenger.id.M0(2131745756, null));
            }
        }
        if (d(i7) == 2) {
            org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) view;
            jaVar.setTopic((TLRPC.TL_forumTopic) u91Var.f50328e0.get(i7 - u91Var.f50331h0));
            if (i7 != u91Var.f50332i0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            jaVar.d = z10;
        }
        if (d(i7) == 3) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) u91Var.f50329f0.get(i7 - u91Var.f50334k0);
            v91 v91Var = (v91) view;
            if (i7 != u91Var.f50335l0 - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            v91Var.f50611a5 = z9;
            i10 = ((org.telegram.ui.ActionBar.f2) y91Var).currentAccount;
            long b22 = org.telegram.messenger.ij.b2(i10, ijVar.f23262k, true, false);
            if (b22 == 0) {
                b22 = 1;
            }
            TLRPC.TL_forumTopic f10 = y91Var.f52051s.f(y91Var.f52013a, b22);
            if (f10 == null) {
                org.telegram.messenger.a8.b("cant find topic " + b22);
                return;
            }
            v91Var.g0(f10, org.telegram.messenger.ij.B0(ijVar.f23262k), ijVar, false, false);
            v91Var.setTopicIcon(f10);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        boolean z9;
        y91 y91Var = this.f49847c.f50344v0;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    ?? v91Var = new v91(y91Var, viewGroup.getContext(), true);
                    z9 = ((org.telegram.ui.ActionBar.f2) y91Var).inPreviewMode;
                    v91Var.f30443k0 = z9;
                    frameLayout = v91Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.ja(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(frameLayout);
    }
}
