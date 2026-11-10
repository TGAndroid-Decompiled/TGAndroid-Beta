package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class um extends org.telegram.ui.ActionBar.n0 {
    public float f50520a;
    public final cn f50521b;

    public um(cn cnVar) {
        this.f50521b = cnVar;
    }

    @Override
    public final boolean a() {
        if (this.f50521b.I3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        cn cnVar;
        cn cnVar2 = this.f50521b;
        if (!cnVar2.f44513gd.f55499f) {
            if (cnVar2.I3 != null && cnVar2.D1 != null) {
                View currentView = cnVar2.E1.getCurrentView();
                if (currentView instanceof en) {
                    cnVar = ((en) currentView).f45407a;
                } else {
                    cnVar = cnVar2;
                }
                if (!cnVar.f44486ed.f55499f) {
                    cnVar.rc(true);
                    return false;
                }
                int currentPosition = cnVar2.D1.f32302a.getCurrentPosition();
                int i7 = cnVar2.F1;
                if (currentPosition != i7) {
                    cnVar2.D1.f32302a.d(i7, i7);
                    return false;
                }
            } else if (cnVar2.f44486ed.f55499f) {
                cnVar2.rc(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean d() {
        return this.f50521b.B3;
    }

    @Override
    public final void f() {
        int i7;
        cn cnVar = this.f50521b;
        cnVar.b8();
        if (cnVar.C3 == null && cnVar.D3 == null) {
            if (cnVar.B3) {
                cnVar.W1.getAdapter().U(null, 0, null, false, true);
                cnVar.B3 = false;
                cnVar.f44540j0.P("", true);
            }
            org.telegram.ui.ActionBar.r0 r0Var = cnVar.f44540j0;
            if (cnVar.da()) {
                i7 = 2131745868;
            } else {
                i7 = 2131745836;
            }
            r0Var.setSearchFieldHint(org.telegram.messenger.id.M0(i7, null));
            cnVar.f44503g3.setVisibility(0);
            ImageView imageView = cnVar.f44517h3;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            cnVar.C3 = null;
            cnVar.D3 = null;
            return;
        }
        ImageView imageView2 = cnVar.f44517h3;
        if (imageView2 != null) {
            imageView2.callOnClick();
        }
    }

    @Override
    public final void h() {
        int i7;
        int i10;
        int i11;
        org.telegram.messenger.ij ijVar;
        TLRPC.Chat chat;
        cn cnVar = this.f50521b;
        cnVar.G3 = false;
        cnVar.cd();
        cnVar.pd();
        ImageView imageView = cnVar.f44503g3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = cnVar.f44517h3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (cnVar.B3) {
            cnVar.W1.getAdapter().U(null, 0, null, false, true);
            cnVar.B3 = false;
        }
        cnVar.W1.setReversed(false);
        cnVar.W1.getAdapter().f16787k0 = false;
        cnVar.B7();
        cnVar.C3 = null;
        cnVar.D3 = null;
        cnVar.I3 = null;
        org.telegram.ui.ActionBar.r0 r0Var = cnVar.f44540j0;
        if (cnVar.da()) {
            i7 = 2131745868;
        } else {
            i7 = 2131745836;
        }
        r0Var.setSearchFieldHint(org.telegram.messenger.id.M0(i7, null));
        cnVar.f44540j0.setSearchFieldCaption(null);
        cnVar.f44499fd.a(false, true);
        cnVar.f44513gd.a(false, true);
        if (cnVar.Z.h0() && TextUtils.isEmpty(cnVar.Z.getSlowModeTimer()) && (((chat = cnVar.f44473e) == null || org.telegram.messenger.t3.q(chat)) && !cnVar.ba())) {
            org.telegram.ui.ActionBar.r0 r0Var2 = cnVar.f44527i0;
            if (r0Var2 != null) {
                r0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = cnVar.f44488f0;
            if (xVar != null) {
                xVar.e(0);
            }
            fr frVar = cnVar.f44474e0;
            if (frVar != null) {
                frVar.b(true);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = cnVar.f44600o0;
            if (r0Var3 != null && cnVar.fa) {
                r0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = cnVar.f44612p0;
            if (xVar2 != null && cnVar.f44510ga) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = cnVar.f44553k0;
            if (r0Var4 != null) {
                r0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var5 = cnVar.f44565l0;
            if (r0Var5 != null) {
                r0Var5.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.r0 r0Var6 = cnVar.f44527i0;
            if (r0Var6 != null) {
                r0Var6.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar3 = cnVar.f44612p0;
            if (xVar3 != null && cnVar.f44510ga) {
                xVar3.e(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var7 = cnVar.f44553k0;
            if (r0Var7 != null) {
                r0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var8 = cnVar.f44600o0;
            if (r0Var8 != null && cnVar.fa) {
                r0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar4 = cnVar.f44488f0;
            if (xVar4 != null) {
                xVar4.e(8);
            }
            fr frVar2 = cnVar.f44474e0;
            if (frVar2 != null) {
                frVar2.b(false);
            }
        }
        if (cnVar.E1 != null) {
            if (cnVar.D1.f32302a.getCurrentPosition() != 0) {
                cnVar.D1.f32302a.d(0, 0);
                cnVar.G1 = true;
            } else {
                cnVar.E1.h.clear();
            }
        }
        int i12 = cnVar.f44492f4;
        if (i12 == 3 || i12 == 8 || ((cnVar.f44643r4 == 0 && !org.telegram.messenger.t10.z(cnVar.f44487f)) || ((ijVar = cnVar.f44568l4) != null && ijVar.M1() < 10))) {
            cnVar.f44540j0.setVisibility(8);
        }
        cnVar.f44625q0 = false;
        cnVar.Cd();
        org.telegram.messenger.ui mediaDataController = cnVar.getMediaDataController();
        mediaDataController.Y0.clear();
        mediaDataController.Z0.clear();
        mediaDataController.f25805a1.clear();
        if (cnVar.f44451c4 == 3) {
            i11 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            org.telegram.messenger.oa.a(i11).b(3).a();
        } else {
            i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(i10);
            a10.f24317b.a();
            a10.f24318c.a();
        }
        jg.m1 m1Var = cnVar.f44422a4;
        if (m1Var != null) {
            m1Var.f();
        }
        cnVar.kb();
        cnVar.Oc(false);
        cnVar.fd(0, true);
        cnVar.Fd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f50520a, 0.0f);
        ofFloat.addUpdateListener(new tm(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.wq.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        cnVar.f44486ed.a(false, true);
        cnVar.od();
        cnVar.E3 = null;
        cnVar.pd();
        cnVar.cd();
        ck ckVar = cnVar.C1;
        if (ckVar != null) {
            ckVar.d.M(new hq(2));
            ckVar.h = 0L;
            cnVar.C1.g(false);
        }
        pj pjVar = cnVar.D1;
        if (pjVar != null) {
            pjVar.b(false);
        }
        cnVar.Pb(false);
    }

    @Override
    public final void i() {
        pj pjVar;
        int i7;
        cn cnVar = this.f50521b;
        boolean z9 = true;
        cnVar.G3 = true;
        cnVar.cd();
        cnVar.pd();
        if (((cnVar.f44643r4 != 0 && cnVar.f44492f4 != 3) || org.telegram.messenger.t10.z(cnVar.f44487f)) && !cnVar.Ic) {
            cnVar.Na(null);
        }
        if (cnVar.f44532i5) {
            cnVar.saveKeyboardPositionBeforeTransition();
            if (!cnVar.kb) {
                Activity parentActivity = cnVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
                org.telegram.messenger.g0.a3(parentActivity, i7);
            }
            org.telegram.messenger.g0.i3(new dh(this, 10), 500L);
            fi.m3 m3Var = cnVar.f44678u2;
            if (m3Var != null) {
                m3Var.f(true);
            }
            fi.m3 m3Var2 = cnVar.f44705w2;
            if (m3Var2 != null) {
                m3Var2.f(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f50520a, 1.0f);
        ofFloat.addUpdateListener(new tm(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.wq.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        ck ckVar = cnVar.C1;
        if (ckVar != null) {
            if (cnVar.kb || !ckVar.a() || cnVar.I3 != null) {
                z9 = false;
            }
            ckVar.g(z9);
        }
        if (cnVar.I3 != null && (pjVar = cnVar.D1) != null) {
            int currentPosition = pjVar.f32302a.getCurrentPosition();
            int i10 = cnVar.F1;
            if (currentPosition != i10) {
                cnVar.D1.f32302a.d(i10, i10);
            }
        }
    }

    @Override
    public final void j(jg.o0 o0Var) {
        cn cnVar = this.f50521b;
        ck ckVar = cnVar.C1;
        if (ckVar != null) {
            ckVar.d.M(new hq(2));
            ckVar.h = 0L;
        }
        cnVar.E3 = null;
        cnVar.pd();
        cnVar.cd();
        cnVar.Pb(false);
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        String str;
        int i7;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.h6 h6Var;
        cn cnVar = this.f50521b;
        boolean z9 = false;
        cnVar.md(0, 0, -1);
        if (editTextBoldCursor != null) {
            str = editTextBoldCursor.getText().toString();
        } else {
            str = cnVar.H3;
        }
        cnVar.H3 = str;
        if (!TextUtils.isEmpty(str) && (cnVar.H3.startsWith("$") || cnVar.H3.startsWith("#"))) {
            cnVar.c8();
            if (cnVar.H3.contains("@")) {
                String str2 = cnVar.H3;
                h6Var = ((org.telegram.ui.ActionBar.f2) cnVar).resourceProvider;
                cnVar.presentFragment(new org.telegram.ui.Components.r20(str2, h6Var));
                return;
            }
            if (cnVar.I3 == null) {
                cnVar.I3 = cnVar.H3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f50520a, 1.0f);
                ofFloat.addUpdateListener(new tm(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.wq.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                ck ckVar = cnVar.C1;
                if (ckVar != null) {
                    if (!cnVar.kb && ckVar.a() && cnVar.I3 == null) {
                        z9 = true;
                    }
                    ckVar.g(z9);
                }
            }
            cnVar.I3 = cnVar.H3;
            cnVar.g7(true);
            i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            org.telegram.messenger.oa.a(i10).c(cnVar.I3);
            cnVar.H1.f38147f.O(true);
            View currentView = cnVar.E1.getCurrentView();
            if (cnVar.f44451c4 == 3) {
                i12 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                org.telegram.messenger.oa.a(i12).b(3).a();
            } else {
                i11 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(i11);
                a10.f24317b.a();
                a10.f24318c.a();
            }
            if (currentView instanceof en) {
                ((en) currentView).f45407a.qd(cnVar.I3);
            }
            cnVar.od();
            cnVar.f44641r2.e(true, true);
            cnVar.rc(true);
            z9 = true;
        } else {
            cnVar.I3 = null;
            pj pjVar = cnVar.D1;
            if (pjVar != null) {
                pjVar.b(false);
                cnVar.od();
            }
            pj pjVar2 = cnVar.D1;
            if (pjVar2 != null && pjVar2.f32302a.getCurrentPosition() != 0) {
                cnVar.D1.f32302a.d(0, 0);
            }
        }
        pj pjVar3 = cnVar.D1;
        if (pjVar3 != null) {
            pjVar3.b(z9);
        }
        org.telegram.messenger.ui mediaDataController = cnVar.getMediaDataController();
        String str3 = cnVar.H3;
        long j3 = cnVar.f44545j6;
        long j10 = cnVar.f44440b7;
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
        mediaDataController.X1(str3, j3, j10, i7, 0, cnVar.f44643r4, false, cnVar.C3, cnVar.D3, true, cnVar.E3);
    }

    @Override
    public final void l(EditText editText) {
        boolean z9;
        cn cnVar = this.f50521b;
        te.a aVar = cnVar.f44513gd;
        if (cnVar.I3 == null) {
            cnVar.rc(false);
        }
        cnVar.b8();
        if (cnVar.B3) {
            cnVar.W1.getAdapter().U("@" + editText.getText().toString(), 0, cnVar.K6, true, true);
        } else if (cnVar.C3 == null && cnVar.D3 == null && cnVar.f44517h3 != null && TextUtils.equals(editText.getText(), org.telegram.messenger.id.M0(2131745766, null))) {
            cnVar.f44517h3.callOnClick();
        }
        if (cnVar.I3 != null) {
            if (editText.length() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 != aVar.f55499f) {
                if (z9) {
                    cnVar.c8();
                }
                aVar.a(z9, true);
                fi.g1 g1Var = cnVar.E1;
                if (g1Var != null) {
                    g1Var.E(0);
                }
                if (z9) {
                    cnVar.rc(true);
                }
                cnVar.Oc(false);
            }
        }
    }

    @Override
    public final boolean m() {
        if (this.f50521b.I3 == null) {
            return true;
        }
        return false;
    }
}
