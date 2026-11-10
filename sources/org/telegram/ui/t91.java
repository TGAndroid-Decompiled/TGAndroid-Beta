package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class t91 extends org.telegram.ui.Components.oj0 {
    public final v91 f50206c;

    public t91(v91 v91Var) {
        this.f50206c = v91Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 != 3 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        v91 v91Var = this.f50206c;
        if (v91Var.f50674n0) {
            return 0;
        }
        return v91Var.m0;
    }

    @Override
    public final int d(int i7) {
        v91 v91Var = this.f50206c;
        if (i7 != v91Var.f50671j0 && i7 != v91Var.f50668g0) {
            if (i7 >= v91Var.f50669h0 && i7 < v91Var.f50670i0) {
                return 2;
            }
            if (i7 >= v91Var.f50672k0 && i7 < v91Var.f50673l0) {
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
        View view = d1Var.f57052a;
        v91 v91Var = this.f50206c;
        z91 z91Var = v91Var.f50682v0;
        if (d(i7) == 1) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i7 == v91Var.f50668g0) {
                x3Var.setText(org.telegram.messenger.id.M0(2131743994, null));
            }
            if (i7 == v91Var.f50671j0) {
                x3Var.setText(org.telegram.messenger.id.M0(2131745756, null));
            }
        }
        if (d(i7) == 2) {
            org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) view;
            jaVar.setTopic((TLRPC.TL_forumTopic) v91Var.f50666e0.get(i7 - v91Var.f50669h0));
            if (i7 != v91Var.f50670i0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            jaVar.d = z10;
        }
        if (d(i7) == 3) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) v91Var.f50667f0.get(i7 - v91Var.f50672k0);
            w91 w91Var = (w91) view;
            if (i7 != v91Var.f50673l0 - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            w91Var.f50953a5 = z9;
            i10 = ((org.telegram.ui.ActionBar.f2) z91Var).currentAccount;
            long b22 = org.telegram.messenger.ij.b2(i10, ijVar.f23266k, true, false);
            if (b22 == 0) {
                b22 = 1;
            }
            TLRPC.TL_forumTopic f10 = z91Var.f52381s.f(z91Var.f52343a, b22);
            if (f10 == null) {
                org.telegram.messenger.a8.b("cant find topic " + b22);
                return;
            }
            w91Var.g0(f10, org.telegram.messenger.ij.B0(ijVar.f23266k), ijVar, false, false);
            w91Var.setTopicIcon(f10);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        boolean z9;
        z91 z91Var = this.f50206c.f50682v0;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    ?? w91Var = new w91(z91Var, viewGroup.getContext(), true);
                    z9 = ((org.telegram.ui.ActionBar.f2) z91Var).inPreviewMode;
                    w91Var.f30454k0 = z9;
                    frameLayout = w91Var;
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
