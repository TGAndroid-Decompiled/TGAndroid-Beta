package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class s91 extends org.telegram.ui.Components.dk0 {
    public final u91 f51955c;

    public s91(u91 u91Var) {
        this.f51955c = u91Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f59115f;
        if (i7 != 3 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        u91 u91Var = this.f51955c;
        if (u91Var.f52487o0) {
            return 0;
        }
        return u91Var.f52486n0;
    }

    @Override
    public final int d(int i7) {
        u91 u91Var = this.f51955c;
        if (i7 != u91Var.f52484k0 && i7 != u91Var.f52481h0) {
            if (i7 >= u91Var.f52482i0 && i7 < u91Var.f52483j0) {
                return 2;
            }
            if (i7 >= u91Var.f52485l0 && i7 < u91Var.m0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        int i10;
        boolean z11;
        View view = e1Var.f59111a;
        u91 u91Var = this.f51955c;
        y91 y91Var = u91Var.f52495w0;
        if (d(i7) == 1) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            if (i7 == u91Var.f52481h0) {
                y3Var.setText(org.telegram.messenger.hd.N0(2131743753, null));
            }
            if (i7 == u91Var.f52484k0) {
                y3Var.setText(org.telegram.messenger.hd.N0(2131745560, null));
            }
        }
        if (d(i7) == 2) {
            org.telegram.ui.Cells.la laVar = (org.telegram.ui.Cells.la) view;
            laVar.setTopic((TLRPC.TL_forumTopic) u91Var.f52479f0.get(i7 - u91Var.f52482i0));
            if (i7 != u91Var.f52483j0 - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            laVar.d = z11;
        }
        if (d(i7) == 3) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) u91Var.f52480g0.get(i7 - u91Var.f52485l0);
            v91 v91Var = (v91) view;
            if (i7 != u91Var.m0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            v91Var.f52741b5 = z10;
            i10 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
            long b22 = org.telegram.messenger.gj.b2(i10, gjVar.f24177k, true, false);
            if (b22 == 0) {
                b22 = 1;
            }
            TLRPC.TL_forumTopic f10 = y91Var.f54115s.f(y91Var.f54075a, b22);
            if (f10 == null) {
                org.telegram.messenger.a8.b("cant find topic " + b22);
                return;
            }
            v91Var.f0(f10, org.telegram.messenger.gj.B0(gjVar.f24177k), gjVar, false, false);
            v91Var.setTopicIcon(f10);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        boolean z10;
        y91 y91Var = this.f51955c.f52495w0;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    ?? v91Var = new v91(y91Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.g2) y91Var).inPreviewMode;
                    v91Var.f31943l0 = z10;
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
        frameLayout.setLayoutParams(new v4.p0(-1, -2));
        return new v4.e1(frameLayout);
    }
}
