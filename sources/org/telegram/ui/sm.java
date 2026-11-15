package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sm extends org.telegram.ui.ActionBar.m0 {
    public float f51243a;
    public final an f51244b;

    public sm(an anVar) {
        this.f51244b = anVar;
    }

    @Override
    public final boolean a() {
        if (this.f51244b.J3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        an anVar;
        an anVar2 = this.f51244b;
        if (!anVar2.f45226hd.f57082f) {
            if (anVar2.J3 != null && anVar2.E1 != null) {
                View currentView = anVar2.F1.getCurrentView();
                if (currentView instanceof cn) {
                    anVar = ((cn) currentView).f46216a;
                } else {
                    anVar = anVar2;
                }
                if (!anVar.f45199fd.f57082f) {
                    anVar.sc(true);
                    return false;
                }
                int currentPosition = anVar2.E1.f37329a.getCurrentPosition();
                int i7 = anVar2.G1;
                if (currentPosition != i7) {
                    anVar2.E1.f37329a.d(i7, i7);
                    return false;
                }
            } else if (anVar2.f45199fd.f57082f) {
                anVar2.sc(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean d() {
        return this.f51244b.C3;
    }

    @Override
    public final void f() {
        int i7;
        an anVar = this.f51244b;
        anVar.c8();
        if (anVar.D3 == null && anVar.E3 == null) {
            if (anVar.C3) {
                anVar.X1.getAdapter().U(null, 0, null, false, true);
                anVar.C3 = false;
                anVar.f45253k0.Q("", true);
            }
            org.telegram.ui.ActionBar.q0 q0Var = anVar.f45253k0;
            if (anVar.ea()) {
                i7 = 2131745868;
            } else {
                i7 = 2131745836;
            }
            q0Var.setSearchFieldHint(org.telegram.messenger.hd.M0(i7, null));
            anVar.f45217h3.setVisibility(0);
            ImageView imageView = anVar.f45230i3;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            anVar.D3 = null;
            anVar.E3 = null;
            return;
        }
        ImageView imageView2 = anVar.f45230i3;
        if (imageView2 != null) {
            imageView2.callOnClick();
        }
    }

    @Override
    public final void h() {
        int i7;
        int i10;
        int i11;
        org.telegram.messenger.gj gjVar;
        TLRPC.Chat chat;
        an anVar = this.f51244b;
        anVar.H3 = false;
        anVar.dd();
        anVar.qd();
        ImageView imageView = anVar.f45217h3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = anVar.f45230i3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (anVar.C3) {
            anVar.X1.getAdapter().U(null, 0, null, false, true);
            anVar.C3 = false;
        }
        anVar.X1.setReversed(false);
        anVar.X1.getAdapter().f17131l0 = false;
        anVar.B7();
        anVar.D3 = null;
        anVar.E3 = null;
        anVar.J3 = null;
        org.telegram.ui.ActionBar.q0 q0Var = anVar.f45253k0;
        if (anVar.ea()) {
            i7 = 2131745868;
        } else {
            i7 = 2131745836;
        }
        q0Var.setSearchFieldHint(org.telegram.messenger.hd.M0(i7, null));
        anVar.f45253k0.setSearchFieldCaption(null);
        anVar.f45213gd.a(false, true);
        anVar.f45226hd.a(false, true);
        if (anVar.f45118a0.w0() && TextUtils.isEmpty(anVar.f45118a0.getSlowModeTimer()) && (((chat = anVar.f45173e) == null || org.telegram.messenger.t3.q(chat)) && !anVar.ca())) {
            org.telegram.ui.ActionBar.q0 q0Var2 = anVar.f45240j0;
            if (q0Var2 != null) {
                q0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = anVar.f45200g0;
            if (xVar != null) {
                xVar.e(0);
            }
            er erVar = anVar.f45188f0;
            if (erVar != null) {
                erVar.b(true);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = anVar.f45313p0;
            if (q0Var3 != null && anVar.f45210ga) {
                q0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = anVar.f45326q0;
            if (xVar2 != null && anVar.f45223ha) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = anVar.f45266l0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var5 = anVar.m0;
            if (q0Var5 != null) {
                q0Var5.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.q0 q0Var6 = anVar.f45240j0;
            if (q0Var6 != null) {
                q0Var6.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar3 = anVar.f45326q0;
            if (xVar3 != null && anVar.f45223ha) {
                xVar3.e(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var7 = anVar.f45266l0;
            if (q0Var7 != null) {
                q0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var8 = anVar.f45313p0;
            if (q0Var8 != null && anVar.f45210ga) {
                q0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar4 = anVar.f45200g0;
            if (xVar4 != null) {
                xVar4.e(8);
            }
            er erVar2 = anVar.f45188f0;
            if (erVar2 != null) {
                erVar2.b(false);
            }
        }
        if (anVar.F1 != null) {
            if (anVar.E1.f37329a.getCurrentPosition() != 0) {
                anVar.E1.f37329a.d(0, 0);
                anVar.H1 = true;
            } else {
                anVar.F1.h.clear();
            }
        }
        int i12 = anVar.f45204g4;
        if (i12 == 3 || i12 == 8 || ((anVar.f45358s4 == 0 && !org.telegram.messenger.q10.z(anVar.f45187f)) || ((gjVar = anVar.f45281m4) != null && gjVar.M1() < 10))) {
            anVar.f45253k0.setVisibility(8);
        }
        anVar.f45340r0 = false;
        anVar.Dd();
        org.telegram.messenger.si mediaDataController = anVar.getMediaDataController();
        mediaDataController.Z0.clear();
        mediaDataController.f26460a1.clear();
        mediaDataController.f26463b1.clear();
        if (anVar.f45164d4 == 3) {
            i11 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            org.telegram.messenger.na.a(i11).b(3).a();
        } else {
            i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            org.telegram.messenger.na a10 = org.telegram.messenger.na.a(i10);
            a10.f25177b.a();
            a10.f25178c.a();
        }
        jg.l1 l1Var = anVar.f45137b4;
        if (l1Var != null) {
            l1Var.f();
        }
        anVar.lb();
        anVar.Pc(false);
        anVar.gd(0, true);
        anVar.Gd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f51243a, 0.0f);
        ofFloat.addUpdateListener(new rm(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.er.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        anVar.f45199fd.a(false, true);
        anVar.pd();
        anVar.F3 = null;
        anVar.qd();
        anVar.dd();
        ak akVar = anVar.D1;
        if (akVar != null) {
            akVar.d.M(new gq(2));
            akVar.h = 0L;
            anVar.D1.g(false);
        }
        nj njVar = anVar.E1;
        if (njVar != null) {
            njVar.b(false);
        }
        anVar.Qb(false);
    }

    @Override
    public final void i() {
        nj njVar;
        int i7;
        an anVar = this.f51244b;
        boolean z10 = true;
        anVar.H3 = true;
        anVar.dd();
        anVar.qd();
        if (((anVar.f45358s4 != 0 && anVar.f45204g4 != 3) || org.telegram.messenger.q10.z(anVar.f45187f)) && !anVar.Jc) {
            anVar.Oa(null);
        }
        if (anVar.f45244j5) {
            anVar.saveKeyboardPositionBeforeTransition();
            if (!anVar.f45276lb) {
                Activity parentActivity = anVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
                org.telegram.messenger.g0.a3(parentActivity, i7);
            }
            org.telegram.messenger.g0.i3(new bh(this, 10), 500L);
            hi.l3 l3Var = anVar.f45392v2;
            if (l3Var != null) {
                l3Var.f(true);
            }
            hi.l3 l3Var2 = anVar.f45419x2;
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f51243a, 1.0f);
        ofFloat.addUpdateListener(new rm(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.er.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        ak akVar = anVar.D1;
        if (akVar != null) {
            if (anVar.f45276lb || !akVar.a() || anVar.J3 != null) {
                z10 = false;
            }
            akVar.g(z10);
        }
        if (anVar.J3 != null && (njVar = anVar.E1) != null) {
            int currentPosition = njVar.f37329a.getCurrentPosition();
            int i10 = anVar.G1;
            if (currentPosition != i10) {
                anVar.E1.f37329a.d(i10, i10);
            }
        }
    }

    @Override
    public final void j(jg.o0 o0Var) {
        an anVar = this.f51244b;
        ak akVar = anVar.D1;
        if (akVar != null) {
            akVar.d.M(new gq(2));
            akVar.h = 0L;
        }
        anVar.F3 = null;
        anVar.qd();
        anVar.dd();
        anVar.Qb(false);
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        String str;
        int i7;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var;
        an anVar = this.f51244b;
        boolean z10 = false;
        anVar.nd(0, 0, -1);
        if (editTextBoldCursor != null) {
            str = editTextBoldCursor.getText().toString();
        } else {
            str = anVar.I3;
        }
        anVar.I3 = str;
        if (!TextUtils.isEmpty(str) && (anVar.I3.startsWith("$") || anVar.I3.startsWith("#"))) {
            anVar.d8();
            if (anVar.I3.contains("@")) {
                String str2 = anVar.I3;
                e6Var = ((org.telegram.ui.ActionBar.e2) anVar).resourceProvider;
                anVar.presentFragment(new org.telegram.ui.Components.u20(str2, e6Var));
                return;
            }
            if (anVar.J3 == null) {
                anVar.J3 = anVar.I3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f51243a, 1.0f);
                ofFloat.addUpdateListener(new rm(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.er.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                ak akVar = anVar.D1;
                if (akVar != null) {
                    if (!anVar.f45276lb && akVar.a() && anVar.J3 == null) {
                        z10 = true;
                    }
                    akVar.g(z10);
                }
            }
            anVar.J3 = anVar.I3;
            anVar.g7(true);
            i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            org.telegram.messenger.na.a(i10).c(anVar.J3);
            anVar.I1.f41235f.O(true);
            View currentView = anVar.F1.getCurrentView();
            if (anVar.f45164d4 == 3) {
                i12 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                org.telegram.messenger.na.a(i12).b(3).a();
            } else {
                i11 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                org.telegram.messenger.na a10 = org.telegram.messenger.na.a(i11);
                a10.f25177b.a();
                a10.f25178c.a();
            }
            if (currentView instanceof cn) {
                ((cn) currentView).f46216a.rd(anVar.J3);
            }
            anVar.pd();
            anVar.f45356s2.e(true, true);
            anVar.sc(true);
            z10 = true;
        } else {
            anVar.J3 = null;
            nj njVar = anVar.E1;
            if (njVar != null) {
                njVar.b(false);
                anVar.pd();
            }
            nj njVar2 = anVar.E1;
            if (njVar2 != null && njVar2.f37329a.getCurrentPosition() != 0) {
                anVar.E1.f37329a.d(0, 0);
            }
        }
        nj njVar3 = anVar.E1;
        if (njVar3 != null) {
            njVar3.b(z10);
        }
        org.telegram.messenger.si mediaDataController = anVar.getMediaDataController();
        String str3 = anVar.I3;
        long j3 = anVar.f45259k6;
        long j10 = anVar.f45154c7;
        i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
        mediaDataController.X1(str3, j3, j10, i7, 0, anVar.f45358s4, false, anVar.D3, anVar.E3, true, anVar.F3);
    }

    @Override
    public final void l(EditText editText) {
        boolean z10;
        an anVar = this.f51244b;
        te.a aVar = anVar.f45226hd;
        if (anVar.J3 == null) {
            anVar.sc(false);
        }
        anVar.c8();
        if (anVar.C3) {
            anVar.X1.getAdapter().U("@" + editText.getText().toString(), 0, anVar.L6, true, true);
        } else if (anVar.D3 == null && anVar.E3 == null && anVar.f45230i3 != null && TextUtils.equals(editText.getText(), org.telegram.messenger.hd.M0(2131745766, null))) {
            anVar.f45230i3.callOnClick();
        }
        if (anVar.J3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != aVar.f57082f) {
                if (z10) {
                    anVar.d8();
                }
                aVar.a(z10, true);
                hi.i1 i1Var = anVar.F1;
                if (i1Var != null) {
                    i1Var.C(0);
                }
                if (z10) {
                    anVar.sc(true);
                }
                anVar.Pc(false);
            }
        }
    }

    @Override
    public final boolean m() {
        if (this.f51244b.J3 == null) {
            return true;
        }
        return false;
    }
}
