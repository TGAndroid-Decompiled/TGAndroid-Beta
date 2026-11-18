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
    public float f52299a;
    public final bn f52300b;

    public tm(bn bnVar) {
        this.f52300b = bnVar;
    }

    @Override
    public final boolean a() {
        if (this.f52300b.J3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        bn bnVar;
        bn bnVar2 = this.f52300b;
        if (!bnVar2.f46044id.f57658f) {
            if (bnVar2.J3 != null && bnVar2.E1 != null) {
                View currentView = bnVar2.F1.getCurrentView();
                if (currentView instanceof dn) {
                    bnVar = ((dn) currentView).f46944a;
                } else {
                    bnVar = bnVar2;
                }
                if (!bnVar.f46018gd.f57658f) {
                    bnVar.sc(true);
                    return false;
                }
                int currentPosition = bnVar2.E1.f40061a.getCurrentPosition();
                int i7 = bnVar2.G1;
                if (currentPosition != i7) {
                    bnVar2.E1.f40061a.e(i7, i7);
                    return false;
                }
            } else if (bnVar2.f46018gd.f57658f) {
                bnVar2.sc(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean d() {
        return this.f52300b.C3;
    }

    @Override
    public final void f() {
        int i7;
        bn bnVar = this.f52300b;
        bnVar.c8();
        if (bnVar.D3 == null && bnVar.E3 == null) {
            if (bnVar.C3) {
                bnVar.X1.getAdapter().U(null, 0, null, false, true);
                bnVar.C3 = false;
                bnVar.f46058k0.Q("", true);
            }
            org.telegram.ui.ActionBar.r0 r0Var = bnVar.f46058k0;
            if (bnVar.ea()) {
                i7 = 2131745673;
            } else {
                i7 = 2131745641;
            }
            r0Var.setSearchFieldHint(org.telegram.messenger.gd.M0(i7, null));
            bnVar.f46022h3.setVisibility(0);
            ImageView imageView = bnVar.f46035i3;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            bnVar.D3 = null;
            bnVar.E3 = null;
            return;
        }
        ImageView imageView2 = bnVar.f46035i3;
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
        bn bnVar = this.f52300b;
        bnVar.H3 = false;
        bnVar.dd();
        bnVar.qd();
        ImageView imageView = bnVar.f46022h3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = bnVar.f46035i3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (bnVar.C3) {
            bnVar.X1.getAdapter().U(null, 0, null, false, true);
            bnVar.C3 = false;
        }
        bnVar.X1.setReversed(false);
        bnVar.X1.getAdapter().f17514l0 = false;
        bnVar.B7();
        bnVar.D3 = null;
        bnVar.E3 = null;
        bnVar.J3 = null;
        org.telegram.ui.ActionBar.r0 r0Var = bnVar.f46058k0;
        if (bnVar.ea()) {
            i7 = 2131745673;
        } else {
            i7 = 2131745641;
        }
        r0Var.setSearchFieldHint(org.telegram.messenger.gd.M0(i7, null));
        bnVar.f46058k0.setSearchFieldCaption(null);
        bnVar.f46031hd.a(false, true);
        bnVar.f46044id.a(false, true);
        if (bnVar.f45923a0.E0() && TextUtils.isEmpty(bnVar.f45923a0.getSlowModeTimer()) && (((chat = bnVar.f45978e) == null || org.telegram.messenger.v3.q(chat)) && !bnVar.ca())) {
            org.telegram.ui.ActionBar.r0 r0Var2 = bnVar.f46045j0;
            if (r0Var2 != null) {
                r0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = bnVar.f46005g0;
            if (yVar != null) {
                yVar.e(0);
            }
            fr frVar = bnVar.f45993f0;
            if (frVar != null) {
                frVar.b(true);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = bnVar.f46119p0;
            if (r0Var3 != null && bnVar.f46028ha) {
                r0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = bnVar.f46132q0;
            if (yVar2 != null && bnVar.f46041ia) {
                yVar2.e(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = bnVar.f46071l0;
            if (r0Var4 != null) {
                r0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var5 = bnVar.m0;
            if (r0Var5 != null) {
                r0Var5.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.r0 r0Var6 = bnVar.f46045j0;
            if (r0Var6 != null) {
                r0Var6.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar3 = bnVar.f46132q0;
            if (yVar3 != null && bnVar.f46041ia) {
                yVar3.e(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var7 = bnVar.f46071l0;
            if (r0Var7 != null) {
                r0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var8 = bnVar.f46119p0;
            if (r0Var8 != null && bnVar.f46028ha) {
                r0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar4 = bnVar.f46005g0;
            if (yVar4 != null) {
                yVar4.e(8);
            }
            fr frVar2 = bnVar.f45993f0;
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
        int i12 = bnVar.f46009g4;
        if (i12 == 3 || i12 == 8 || ((bnVar.f46164s4 == 0 && !org.telegram.messenger.o10.A(bnVar.f45992f)) || ((fjVar = bnVar.f46087m4) != null && fjVar.M1() < 10))) {
            bnVar.f46058k0.setVisibility(8);
        }
        bnVar.f46146r0 = false;
        bnVar.Dd();
        org.telegram.messenger.ri mediaDataController = bnVar.getMediaDataController();
        mediaDataController.Z0.clear();
        mediaDataController.f26598a1.clear();
        mediaDataController.f26601b1.clear();
        if (bnVar.f45969d4 == 3) {
            i11 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
            org.telegram.messenger.ma.a(i11).b(3).a();
        } else {
            i10 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
            org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(i10);
            a10.f25549b.a();
            a10.f25550c.a();
        }
        jg.l1 l1Var = bnVar.f45942b4;
        if (l1Var != null) {
            l1Var.f();
        }
        bnVar.lb();
        bnVar.Pc(false);
        bnVar.gd(0, true);
        bnVar.Gd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52299a, 0.0f);
        ofFloat.addUpdateListener(new sm(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.lr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        bnVar.f46018gd.a(false, true);
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
        bn bnVar = this.f52300b;
        boolean z10 = true;
        bnVar.H3 = true;
        bnVar.dd();
        bnVar.qd();
        if (((bnVar.f46164s4 != 0 && bnVar.f46009g4 != 3) || org.telegram.messenger.o10.A(bnVar.f45992f)) && !bnVar.Kc) {
            bnVar.Oa(null);
        }
        if (bnVar.f46063k5) {
            bnVar.saveKeyboardPositionBeforeTransition();
            if (!bnVar.mb) {
                Activity parentActivity = bnVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
                org.telegram.messenger.g0.Z2(parentActivity, i7);
            }
            org.telegram.messenger.g0.h3(new bh(this, 10), 500L);
            hi.m3 m3Var = bnVar.f46198v2;
            if (m3Var != null) {
                m3Var.f(true);
            }
            hi.m3 m3Var2 = bnVar.f46225x2;
            if (m3Var2 != null) {
                m3Var2.f(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52299a, 1.0f);
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
        bn bnVar = this.f52300b;
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
        bn bnVar = this.f52300b;
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
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52299a, 1.0f);
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
            if (bnVar.f45969d4 == 3) {
                i12 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                org.telegram.messenger.ma.a(i12).b(3).a();
            } else {
                i11 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(i11);
                a10.f25549b.a();
                a10.f25550c.a();
            }
            if (currentView instanceof dn) {
                ((dn) currentView).f46944a.rd(bnVar.J3);
            }
            bnVar.pd();
            bnVar.f46162s2.e(true, true);
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
        long j3 = bnVar.f46076l6;
        long j10 = bnVar.f45972d7;
        i7 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
        mediaDataController.c2(str3, j3, j10, i7, 0, bnVar.f46164s4, false, bnVar.D3, bnVar.E3, true, bnVar.F3);
    }

    @Override
    public final void l(EditText editText) {
        boolean z10;
        bn bnVar = this.f52300b;
        te.a aVar = bnVar.f46044id;
        if (bnVar.J3 == null) {
            bnVar.sc(false);
        }
        bnVar.c8();
        if (bnVar.C3) {
            bnVar.X1.getAdapter().U("@" + editText.getText().toString(), 0, bnVar.M6, true, true);
        } else if (bnVar.D3 == null && bnVar.E3 == null && bnVar.f46035i3 != null && TextUtils.equals(editText.getText(), org.telegram.messenger.gd.M0(2131745571, null))) {
            bnVar.f46035i3.callOnClick();
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
        if (this.f52300b.J3 == null) {
            return true;
        }
        return false;
    }
}
