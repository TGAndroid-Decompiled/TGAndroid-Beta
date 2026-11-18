package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tm extends org.telegram.ui.ActionBar.n0 {
    public float f52304a;
    public final bn f52305b;

    public tm(bn bnVar) {
        this.f52305b = bnVar;
    }

    @Override
    public final boolean a() {
        if (this.f52305b.J3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        bn bnVar;
        bn bnVar2 = this.f52305b;
        if (!bnVar2.f46053id.f57658f) {
            if (bnVar2.J3 != null && bnVar2.E1 != null) {
                View currentView = bnVar2.F1.getCurrentView();
                if (currentView instanceof dn) {
                    bnVar = ((dn) currentView).f47021a;
                } else {
                    bnVar = bnVar2;
                }
                if (!bnVar.f46027gd.f57658f) {
                    bnVar.sc(true);
                    return false;
                }
                int currentPosition = bnVar2.E1.f40061a.getCurrentPosition();
                int i7 = bnVar2.G1;
                if (currentPosition != i7) {
                    bnVar2.E1.f40061a.e(i7, i7);
                    return false;
                }
            } else if (bnVar2.f46027gd.f57658f) {
                bnVar2.sc(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean d() {
        return this.f52305b.C3;
    }

    @Override
    public final void f() {
        int i7;
        bn bnVar = this.f52305b;
        bnVar.c8();
        if (bnVar.D3 == null && bnVar.E3 == null) {
            if (bnVar.C3) {
                bnVar.X1.getAdapter().U(null, 0, null, false, true);
                bnVar.C3 = false;
                bnVar.f46067k0.Q("", true);
            }
            org.telegram.ui.ActionBar.r0 r0Var = bnVar.f46067k0;
            if (bnVar.ea()) {
                i7 = 2131745673;
            } else {
                i7 = 2131745641;
            }
            r0Var.setSearchFieldHint(org.telegram.messenger.gd.M0(i7, null));
            bnVar.f46031h3.setVisibility(0);
            ImageView imageView = bnVar.f46044i3;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            bnVar.D3 = null;
            bnVar.E3 = null;
            return;
        }
        ImageView imageView2 = bnVar.f46044i3;
        if (imageView2 != null) {
            imageView2.callOnClick();
        }
    }

    @Override
    public final void h() {
        int i7;
        int i10;
        int i11;
        org.telegram.messenger.fj fjVar;
        TLRPC.Chat chat;
        bn bnVar = this.f52305b;
        bnVar.H3 = false;
        bnVar.dd();
        bnVar.qd();
        ImageView imageView = bnVar.f46031h3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = bnVar.f46044i3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (bnVar.C3) {
            bnVar.X1.getAdapter().U(null, 0, null, false, true);
            bnVar.C3 = false;
        }
        bnVar.X1.setReversed(false);
        bnVar.X1.getAdapter().f17517l0 = false;
        bnVar.B7();
        bnVar.D3 = null;
        bnVar.E3 = null;
        bnVar.J3 = null;
        org.telegram.ui.ActionBar.r0 r0Var = bnVar.f46067k0;
        if (bnVar.ea()) {
            i7 = 2131745673;
        } else {
            i7 = 2131745641;
        }
        r0Var.setSearchFieldHint(org.telegram.messenger.gd.M0(i7, null));
        bnVar.f46067k0.setSearchFieldCaption(null);
        bnVar.f46040hd.a(false, true);
        bnVar.f46053id.a(false, true);
        if (bnVar.f45932a0.E0() && TextUtils.isEmpty(bnVar.f45932a0.getSlowModeTimer()) && (((chat = bnVar.f45987e) == null || org.telegram.messenger.v3.q(chat)) && !bnVar.ca())) {
            org.telegram.ui.ActionBar.r0 r0Var2 = bnVar.f46054j0;
            if (r0Var2 != null) {
                r0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = bnVar.f46014g0;
            if (yVar != null) {
                yVar.e(0);
            }
            fr frVar = bnVar.f46002f0;
            if (frVar != null) {
                frVar.b(true);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = bnVar.f46128p0;
            if (r0Var3 != null && bnVar.f46037ha) {
                r0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = bnVar.f46141q0;
            if (yVar2 != null && bnVar.f46050ia) {
                yVar2.e(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = bnVar.f46080l0;
            if (r0Var4 != null) {
                r0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var5 = bnVar.m0;
            if (r0Var5 != null) {
                r0Var5.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.r0 r0Var6 = bnVar.f46054j0;
            if (r0Var6 != null) {
                r0Var6.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar3 = bnVar.f46141q0;
            if (yVar3 != null && bnVar.f46050ia) {
                yVar3.e(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var7 = bnVar.f46080l0;
            if (r0Var7 != null) {
                r0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var8 = bnVar.f46128p0;
            if (r0Var8 != null && bnVar.f46037ha) {
                r0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar4 = bnVar.f46014g0;
            if (yVar4 != null) {
                yVar4.e(8);
            }
            fr frVar2 = bnVar.f46002f0;
            if (frVar2 != null) {
                frVar2.b(false);
            }
        }
        if (bnVar.F1 != null) {
            if (bnVar.E1.f40061a.getCurrentPosition() != 0) {
                bnVar.E1.f40061a.e(0, 0);
                bnVar.H1 = true;
            } else {
                bnVar.F1.h.clear();
            }
        }
        int i12 = bnVar.f46018g4;
        if (i12 == 3 || i12 == 8 || ((bnVar.f46173s4 == 0 && !org.telegram.messenger.o10.A(bnVar.f46001f)) || ((fjVar = bnVar.f46096m4) != null && fjVar.M1() < 10))) {
            bnVar.f46067k0.setVisibility(8);
        }
        bnVar.f46155r0 = false;
        bnVar.Dd();
        org.telegram.messenger.ri mediaDataController = bnVar.getMediaDataController();
        mediaDataController.Z0.clear();
        mediaDataController.f26600a1.clear();
        mediaDataController.f26603b1.clear();
        if (bnVar.f45978d4 == 3) {
            i11 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
            org.telegram.messenger.ma.a(i11).b(3).a();
        } else {
            i10 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
            org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(i10);
            a10.f25551b.a();
            a10.f25552c.a();
        }
        jg.l1 l1Var = bnVar.f45951b4;
        if (l1Var != null) {
            l1Var.f();
        }
        bnVar.lb();
        bnVar.Pc(false);
        bnVar.gd(0, true);
        bnVar.Gd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52304a, 0.0f);
        ofFloat.addUpdateListener(new sm(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.lr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        bnVar.f46027gd.a(false, true);
        bnVar.pd();
        bnVar.F3 = null;
        bnVar.qd();
        bnVar.dd();
        bk bkVar = bnVar.D1;
        if (bkVar != null) {
            bkVar.d.M(new hq(2));
            bkVar.h = 0L;
            bnVar.D1.g(false);
        }
        oj ojVar = bnVar.E1;
        if (ojVar != null) {
            ojVar.b(false);
        }
        bnVar.Qb(false);
    }

    @Override
    public final void i() {
        oj ojVar;
        int i7;
        bn bnVar = this.f52305b;
        boolean z10 = true;
        bnVar.H3 = true;
        bnVar.dd();
        bnVar.qd();
        if (((bnVar.f46173s4 != 0 && bnVar.f46018g4 != 3) || org.telegram.messenger.o10.A(bnVar.f46001f)) && !bnVar.Kc) {
            bnVar.Oa(null);
        }
        if (bnVar.f46072k5) {
            bnVar.saveKeyboardPositionBeforeTransition();
            if (!bnVar.mb) {
                Activity parentActivity = bnVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
                org.telegram.messenger.g0.Z2(parentActivity, i7);
            }
            org.telegram.messenger.g0.h3(new bh(this, 10), 500L);
            hi.m3 m3Var = bnVar.f46207v2;
            if (m3Var != null) {
                m3Var.f(true);
            }
            hi.m3 m3Var2 = bnVar.f46234x2;
            if (m3Var2 != null) {
                m3Var2.f(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52304a, 1.0f);
        ofFloat.addUpdateListener(new sm(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.lr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        bk bkVar = bnVar.D1;
        if (bkVar != null) {
            if (bnVar.mb || !bkVar.a() || bnVar.J3 != null) {
                z10 = false;
            }
            bkVar.g(z10);
        }
        if (bnVar.J3 != null && (ojVar = bnVar.E1) != null) {
            int currentPosition = ojVar.f40061a.getCurrentPosition();
            int i10 = bnVar.G1;
            if (currentPosition != i10) {
                bnVar.E1.f40061a.e(i10, i10);
            }
        }
    }

    @Override
    public final void j(jg.o0 o0Var) {
        bn bnVar = this.f52305b;
        bk bkVar = bnVar.D1;
        if (bkVar != null) {
            bkVar.d.M(new hq(2));
            bkVar.h = 0L;
        }
        bnVar.F3 = null;
        bnVar.qd();
        bnVar.dd();
        bnVar.Qb(false);
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        String str;
        int i7;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.i6 i6Var;
        bn bnVar = this.f52305b;
        boolean z10 = false;
        bnVar.nd(0, 0, -1);
        if (editTextBoldCursor != null) {
            str = editTextBoldCursor.getText().toString();
        } else {
            str = bnVar.I3;
        }
        bnVar.I3 = str;
        if (!TextUtils.isEmpty(str) && (bnVar.I3.startsWith("$") || bnVar.I3.startsWith("#"))) {
            bnVar.d8();
            if (bnVar.I3.contains("@")) {
                String str2 = bnVar.I3;
                i6Var = ((org.telegram.ui.ActionBar.h2) bnVar).resourceProvider;
                bnVar.presentFragment(new org.telegram.ui.Components.c30(str2, i6Var));
                return;
            }
            if (bnVar.J3 == null) {
                bnVar.J3 = bnVar.I3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52304a, 1.0f);
                ofFloat.addUpdateListener(new sm(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.lr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                bk bkVar = bnVar.D1;
                if (bkVar != null) {
                    if (!bnVar.mb && bkVar.a() && bnVar.J3 == null) {
                        z10 = true;
                    }
                    bkVar.g(z10);
                }
            }
            bnVar.J3 = bnVar.I3;
            bnVar.g7(true);
            i10 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
            org.telegram.messenger.ma.a(i10).c(bnVar.J3);
            bnVar.I1.f34594f.O(true);
            View currentView = bnVar.F1.getCurrentView();
            if (bnVar.f45978d4 == 3) {
                i12 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                org.telegram.messenger.ma.a(i12).b(3).a();
            } else {
                i11 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(i11);
                a10.f25551b.a();
                a10.f25552c.a();
            }
            if (currentView instanceof dn) {
                ((dn) currentView).f47021a.rd(bnVar.J3);
            }
            bnVar.pd();
            bnVar.f46171s2.e(true, true);
            bnVar.sc(true);
            z10 = true;
        } else {
            bnVar.J3 = null;
            oj ojVar = bnVar.E1;
            if (ojVar != null) {
                ojVar.b(false);
                bnVar.pd();
            }
            oj ojVar2 = bnVar.E1;
            if (ojVar2 != null && ojVar2.f40061a.getCurrentPosition() != 0) {
                bnVar.E1.f40061a.e(0, 0);
            }
        }
        oj ojVar3 = bnVar.E1;
        if (ojVar3 != null) {
            ojVar3.b(z10);
        }
        org.telegram.messenger.ri mediaDataController = bnVar.getMediaDataController();
        String str3 = bnVar.I3;
        long j3 = bnVar.f46085l6;
        long j10 = bnVar.f45981d7;
        i7 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
        mediaDataController.c2(str3, j3, j10, i7, 0, bnVar.f46173s4, false, bnVar.D3, bnVar.E3, true, bnVar.F3);
    }

    @Override
    public final void l(EditText editText) {
        boolean z10;
        bn bnVar = this.f52305b;
        te.a aVar = bnVar.f46053id;
        if (bnVar.J3 == null) {
            bnVar.sc(false);
        }
        bnVar.c8();
        if (bnVar.C3) {
            bnVar.X1.getAdapter().U("@" + editText.getText().toString(), 0, bnVar.M6, true, true);
        } else if (bnVar.D3 == null && bnVar.E3 == null && bnVar.f46044i3 != null && TextUtils.equals(editText.getText(), org.telegram.messenger.gd.M0(2131745571, null))) {
            bnVar.f46044i3.callOnClick();
        }
        if (bnVar.J3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != aVar.f57658f) {
                if (z10) {
                    bnVar.d8();
                }
                aVar.a(z10, true);
                hi.i1 i1Var = bnVar.F1;
                if (i1Var != null) {
                    i1Var.A(0);
                }
                if (z10) {
                    bnVar.sc(true);
                }
                bnVar.Pc(false);
            }
        }
    }

    @Override
    public final boolean m() {
        if (this.f52305b.J3 == null) {
            return true;
        }
        return false;
    }
}
