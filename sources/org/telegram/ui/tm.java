package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tm extends org.telegram.ui.ActionBar.m0 {
    public float f52345a;
    public final bn f52346b;

    public tm(bn bnVar) {
        this.f52346b = bnVar;
    }

    @Override
    public final boolean a() {
        if (this.f52346b.J3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        bn bnVar;
        bn bnVar2 = this.f52346b;
        if (!bnVar2.f46067id.f57697f) {
            if (bnVar2.J3 != null && bnVar2.E1 != null) {
                View currentView = bnVar2.F1.getCurrentView();
                if (currentView instanceof dn) {
                    bnVar = ((dn) currentView).f47010a;
                } else {
                    bnVar = bnVar2;
                }
                if (!bnVar.f46041gd.f57697f) {
                    bnVar.sc(true);
                    return false;
                }
                int currentPosition = bnVar2.E1.f40876a.getCurrentPosition();
                int i7 = bnVar2.G1;
                if (currentPosition != i7) {
                    bnVar2.E1.f40876a.e(i7, i7);
                    return false;
                }
            } else if (bnVar2.f46041gd.f57697f) {
                bnVar2.sc(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean d() {
        return this.f52346b.C3;
    }

    @Override
    public final void f() {
        int i7;
        bn bnVar = this.f52346b;
        bnVar.c8();
        if (bnVar.D3 == null && bnVar.E3 == null) {
            if (bnVar.C3) {
                bnVar.X1.getAdapter().U(null, 0, null, false, true);
                bnVar.C3 = false;
                bnVar.f46081k0.Q("", true);
            }
            org.telegram.ui.ActionBar.q0 q0Var = bnVar.f46081k0;
            if (bnVar.ea()) {
                i7 = 2131745672;
            } else {
                i7 = 2131745640;
            }
            q0Var.setSearchFieldHint(org.telegram.messenger.gd.N0(i7, null));
            bnVar.f46045h3.setVisibility(0);
            ImageView imageView = bnVar.f46058i3;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            bnVar.D3 = null;
            bnVar.E3 = null;
            return;
        }
        ImageView imageView2 = bnVar.f46058i3;
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
        bn bnVar = this.f52346b;
        bnVar.H3 = false;
        bnVar.dd();
        bnVar.qd();
        ImageView imageView = bnVar.f46045h3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = bnVar.f46058i3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (bnVar.C3) {
            bnVar.X1.getAdapter().U(null, 0, null, false, true);
            bnVar.C3 = false;
        }
        bnVar.X1.setReversed(false);
        bnVar.X1.getAdapter().f17539l0 = false;
        bnVar.B7();
        bnVar.D3 = null;
        bnVar.E3 = null;
        bnVar.J3 = null;
        org.telegram.ui.ActionBar.q0 q0Var = bnVar.f46081k0;
        if (bnVar.ea()) {
            i7 = 2131745672;
        } else {
            i7 = 2131745640;
        }
        q0Var.setSearchFieldHint(org.telegram.messenger.gd.N0(i7, null));
        bnVar.f46081k0.setSearchFieldCaption(null);
        bnVar.f46054hd.a(false, true);
        bnVar.f46067id.a(false, true);
        if (bnVar.f45946a0.I0() && TextUtils.isEmpty(bnVar.f45946a0.getSlowModeTimer()) && (((chat = bnVar.f46001e) == null || org.telegram.messenger.v3.q(chat)) && !bnVar.ca())) {
            org.telegram.ui.ActionBar.q0 q0Var2 = bnVar.f46068j0;
            if (q0Var2 != null) {
                q0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = bnVar.f46028g0;
            if (xVar != null) {
                xVar.e(0);
            }
            fr frVar = bnVar.f46016f0;
            if (frVar != null) {
                frVar.b(true);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = bnVar.f46142p0;
            if (q0Var3 != null && bnVar.f46051ha) {
                q0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = bnVar.f46155q0;
            if (xVar2 != null && bnVar.f46064ia) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = bnVar.f46094l0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var5 = bnVar.m0;
            if (q0Var5 != null) {
                q0Var5.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.q0 q0Var6 = bnVar.f46068j0;
            if (q0Var6 != null) {
                q0Var6.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar3 = bnVar.f46155q0;
            if (xVar3 != null && bnVar.f46064ia) {
                xVar3.e(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var7 = bnVar.f46094l0;
            if (q0Var7 != null) {
                q0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var8 = bnVar.f46142p0;
            if (q0Var8 != null && bnVar.f46051ha) {
                q0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar4 = bnVar.f46028g0;
            if (xVar4 != null) {
                xVar4.e(8);
            }
            fr frVar2 = bnVar.f46016f0;
            if (frVar2 != null) {
                frVar2.b(false);
            }
        }
        if (bnVar.F1 != null) {
            if (bnVar.E1.f40876a.getCurrentPosition() != 0) {
                bnVar.E1.f40876a.e(0, 0);
                bnVar.H1 = true;
            } else {
                bnVar.F1.h.clear();
            }
        }
        int i12 = bnVar.f46032g4;
        if (i12 == 3 || i12 == 8 || ((bnVar.f46187s4 == 0 && !org.telegram.messenger.o10.A(bnVar.f46015f)) || ((fjVar = bnVar.f46110m4) != null && fjVar.M1() < 10))) {
            bnVar.f46081k0.setVisibility(8);
        }
        bnVar.f46169r0 = false;
        bnVar.Dd();
        org.telegram.messenger.ri mediaDataController = bnVar.getMediaDataController();
        mediaDataController.Z0.clear();
        mediaDataController.f26626a1.clear();
        mediaDataController.f26629b1.clear();
        if (bnVar.f45992d4 == 3) {
            i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            org.telegram.messenger.ma.a(i11).b(3).a();
        } else {
            i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(i10);
            a10.f25577b.a();
            a10.f25578c.a();
        }
        jg.l1 l1Var = bnVar.f45965b4;
        if (l1Var != null) {
            l1Var.f();
        }
        bnVar.lb();
        bnVar.Pc(false);
        bnVar.gd(0, true);
        bnVar.Gd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52345a, 0.0f);
        ofFloat.addUpdateListener(new sm(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        bnVar.f46041gd.a(false, true);
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
        bn bnVar = this.f52346b;
        boolean z10 = true;
        bnVar.H3 = true;
        bnVar.dd();
        bnVar.qd();
        if (((bnVar.f46187s4 != 0 && bnVar.f46032g4 != 3) || org.telegram.messenger.o10.A(bnVar.f46015f)) && !bnVar.Kc) {
            bnVar.Oa(null);
        }
        if (bnVar.f46086k5) {
            bnVar.saveKeyboardPositionBeforeTransition();
            if (!bnVar.mb) {
                Activity parentActivity = bnVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
                org.telegram.messenger.g0.Z2(parentActivity, i7);
            }
            org.telegram.messenger.g0.h3(new bh(this, 10), 500L);
            hi.l3 l3Var = bnVar.f46221v2;
            if (l3Var != null) {
                l3Var.f(true);
            }
            hi.l3 l3Var2 = bnVar.f46248x2;
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52345a, 1.0f);
        ofFloat.addUpdateListener(new sm(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
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
            int currentPosition = ojVar.f40876a.getCurrentPosition();
            int i10 = bnVar.G1;
            if (currentPosition != i10) {
                bnVar.E1.f40876a.e(i10, i10);
            }
        }
    }

    @Override
    public final void j(jg.o0 o0Var) {
        bn bnVar = this.f52346b;
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
        org.telegram.ui.ActionBar.h6 h6Var;
        bn bnVar = this.f52346b;
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
                h6Var = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
                bnVar.presentFragment(new org.telegram.ui.Components.f30(str2, h6Var));
                return;
            }
            if (bnVar.J3 == null) {
                bnVar.J3 = bnVar.I3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52345a, 1.0f);
                ofFloat.addUpdateListener(new sm(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
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
            i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            org.telegram.messenger.ma.a(i10).c(bnVar.J3);
            bnVar.I1.f35777f.O(true);
            View currentView = bnVar.F1.getCurrentView();
            if (bnVar.f45992d4 == 3) {
                i12 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                org.telegram.messenger.ma.a(i12).b(3).a();
            } else {
                i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(i11);
                a10.f25577b.a();
                a10.f25578c.a();
            }
            if (currentView instanceof dn) {
                ((dn) currentView).f47010a.rd(bnVar.J3);
            }
            bnVar.pd();
            bnVar.f46185s2.e(true, true);
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
            if (ojVar2 != null && ojVar2.f40876a.getCurrentPosition() != 0) {
                bnVar.E1.f40876a.e(0, 0);
            }
        }
        oj ojVar3 = bnVar.E1;
        if (ojVar3 != null) {
            ojVar3.b(z10);
        }
        org.telegram.messenger.ri mediaDataController = bnVar.getMediaDataController();
        String str3 = bnVar.I3;
        long j3 = bnVar.f46099l6;
        long j10 = bnVar.f45995d7;
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
        mediaDataController.c2(str3, j3, j10, i7, 0, bnVar.f46187s4, false, bnVar.D3, bnVar.E3, true, bnVar.F3);
    }

    @Override
    public final void l(EditText editText) {
        boolean z10;
        bn bnVar = this.f52346b;
        te.a aVar = bnVar.f46067id;
        if (bnVar.J3 == null) {
            bnVar.sc(false);
        }
        bnVar.c8();
        if (bnVar.C3) {
            bnVar.X1.getAdapter().U("@" + editText.getText().toString(), 0, bnVar.M6, true, true);
        } else if (bnVar.D3 == null && bnVar.E3 == null && bnVar.f46058i3 != null && TextUtils.equals(editText.getText(), org.telegram.messenger.gd.N0(2131745570, null))) {
            bnVar.f46058i3.callOnClick();
        }
        if (bnVar.J3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != aVar.f57697f) {
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
        if (this.f52346b.J3 == null) {
            return true;
        }
        return false;
    }
}
