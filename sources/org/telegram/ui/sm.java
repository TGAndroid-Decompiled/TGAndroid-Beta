package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sm extends org.telegram.ui.ActionBar.n0 {
    public float f49789a;
    public final an f49790b;

    public sm(an anVar) {
        this.f49790b = anVar;
    }

    @Override
    public final boolean a() {
        if (this.f49790b.I3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        an anVar;
        an anVar2 = this.f49790b;
        if (!anVar2.f43784ed.f55395f) {
            if (anVar2.I3 != null && anVar2.D1 != null) {
                View currentView = anVar2.E1.getCurrentView();
                if (currentView instanceof cn) {
                    anVar = ((cn) currentView).f44857a;
                } else {
                    anVar = anVar2;
                }
                if (!anVar.f43758cd.f55395f) {
                    anVar.oc(true);
                    return false;
                }
                int currentPosition = anVar2.D1.f32618a.getCurrentPosition();
                int i7 = anVar2.F1;
                if (currentPosition != i7) {
                    anVar2.D1.f32618a.d(i7, i7);
                    return false;
                }
            } else if (anVar2.f43758cd.f55395f) {
                anVar2.oc(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean d() {
        return this.f49790b.B3;
    }

    @Override
    public final void f() {
        int i7;
        an anVar = this.f49790b;
        anVar.a8();
        if (anVar.C3 == null && anVar.D3 == null) {
            if (anVar.B3) {
                anVar.W1.getAdapter().U(null, 0, null, false, true);
                anVar.B3 = false;
                anVar.f43837j0.P("", true);
            }
            org.telegram.ui.ActionBar.r0 r0Var = anVar.f43837j0;
            if (anVar.ca()) {
                i7 = 2131745869;
            } else {
                i7 = 2131745837;
            }
            r0Var.setSearchFieldHint(org.telegram.messenger.hd.M0(i7, null));
            anVar.f43801g3.setVisibility(0);
            ImageView imageView = anVar.f43815h3;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            anVar.C3 = null;
            anVar.D3 = null;
            return;
        }
        ImageView imageView2 = anVar.f43815h3;
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
        an anVar = this.f49790b;
        anVar.G3 = false;
        anVar.Zc();
        anVar.md();
        ImageView imageView = anVar.f43801g3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = anVar.f43815h3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (anVar.B3) {
            anVar.W1.getAdapter().U(null, 0, null, false, true);
            anVar.B3 = false;
        }
        anVar.W1.setReversed(false);
        anVar.W1.getAdapter().f16784k0 = false;
        anVar.A7();
        anVar.C3 = null;
        anVar.D3 = null;
        anVar.I3 = null;
        org.telegram.ui.ActionBar.r0 r0Var = anVar.f43837j0;
        if (anVar.ca()) {
            i7 = 2131745869;
        } else {
            i7 = 2131745837;
        }
        r0Var.setSearchFieldHint(org.telegram.messenger.hd.M0(i7, null));
        anVar.f43837j0.setSearchFieldCaption(null);
        anVar.f43770dd.a(false, true);
        anVar.f43784ed.a(false, true);
        if (anVar.Z.h0() && TextUtils.isEmpty(anVar.Z.getSlowModeTimer()) && (((chat = anVar.f43771e) == null || org.telegram.messenger.t3.q(chat)) && !anVar.aa())) {
            org.telegram.ui.ActionBar.r0 r0Var2 = anVar.f43825i0;
            if (r0Var2 != null) {
                r0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = anVar.f43786f0;
            if (xVar != null) {
                xVar.e(0);
            }
            cr crVar = anVar.f43772e0;
            if (crVar != null) {
                crVar.b(true);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = anVar.f43896o0;
            if (r0Var3 != null && anVar.f43768da) {
                r0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = anVar.f43908p0;
            if (xVar2 != null && anVar.f43782ea) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = anVar.f43849k0;
            if (r0Var4 != null) {
                r0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var5 = anVar.f43861l0;
            if (r0Var5 != null) {
                r0Var5.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.r0 r0Var6 = anVar.f43825i0;
            if (r0Var6 != null) {
                r0Var6.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar3 = anVar.f43908p0;
            if (xVar3 != null && anVar.f43782ea) {
                xVar3.e(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var7 = anVar.f43849k0;
            if (r0Var7 != null) {
                r0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var8 = anVar.f43896o0;
            if (r0Var8 != null && anVar.f43768da) {
                r0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar4 = anVar.f43786f0;
            if (xVar4 != null) {
                xVar4.e(8);
            }
            cr crVar2 = anVar.f43772e0;
            if (crVar2 != null) {
                crVar2.b(false);
            }
        }
        if (anVar.E1 != null) {
            if (anVar.D1.f32618a.getCurrentPosition() != 0) {
                anVar.D1.f32618a.d(0, 0);
                anVar.G1 = true;
            } else {
                anVar.E1.h.clear();
            }
        }
        int i12 = anVar.f43790f4;
        if (i12 == 3 || i12 == 8 || ((anVar.f43939r4 == 0 && !org.telegram.messenger.t10.z(anVar.f43785f)) || ((ijVar = anVar.f43864l4) != null && ijVar.N1() < 10))) {
            anVar.f43837j0.setVisibility(8);
        }
        anVar.f43921q0 = false;
        anVar.zd();
        org.telegram.messenger.ui mediaDataController = anVar.getMediaDataController();
        mediaDataController.Y0.clear();
        mediaDataController.Z0.clear();
        mediaDataController.f25798a1.clear();
        if (anVar.f43749c4 == 3) {
            i11 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            org.telegram.messenger.oa.a(i11).b(3).a();
        } else {
            i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(i10);
            a10.f24309b.a();
            a10.f24310c.a();
        }
        jg.m1 m1Var = anVar.f43720a4;
        if (m1Var != null) {
            m1Var.f();
        }
        anVar.hb();
        anVar.Lc(false);
        anVar.cd(0, true);
        anVar.Cd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f49789a, 0.0f);
        ofFloat.addUpdateListener(new rm(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        anVar.f43758cd.a(false, true);
        anVar.ld();
        anVar.E3 = null;
        anVar.md();
        anVar.Zc();
        ak akVar = anVar.C1;
        if (akVar != null) {
            akVar.d.M(new eq(2));
            akVar.h = 0L;
            anVar.C1.g(false);
        }
        nj njVar = anVar.D1;
        if (njVar != null) {
            njVar.b(false);
        }
        anVar.Mb(false);
    }

    @Override
    public final void i() {
        nj njVar;
        int i7;
        an anVar = this.f49790b;
        boolean z9 = true;
        anVar.G3 = true;
        anVar.Zc();
        anVar.md();
        if (((anVar.f43939r4 != 0 && anVar.f43790f4 != 3) || org.telegram.messenger.t10.z(anVar.f43785f)) && !anVar.Gc) {
            anVar.La(null);
        }
        if (anVar.f43830i5) {
            anVar.saveKeyboardPositionBeforeTransition();
            if (!anVar.f43835ib) {
                Activity parentActivity = anVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
                org.telegram.messenger.g0.a3(parentActivity, i7);
            }
            org.telegram.messenger.g0.i3(new bh(this, 10), 500L);
            fi.m3 m3Var = anVar.f43974u2;
            if (m3Var != null) {
                m3Var.f(true);
            }
            fi.m3 m3Var2 = anVar.f44001w2;
            if (m3Var2 != null) {
                m3Var2.f(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f49789a, 1.0f);
        ofFloat.addUpdateListener(new rm(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        ak akVar = anVar.C1;
        if (akVar != null) {
            if (anVar.f43835ib || !akVar.a() || anVar.I3 != null) {
                z9 = false;
            }
            akVar.g(z9);
        }
        if (anVar.I3 != null && (njVar = anVar.D1) != null) {
            int currentPosition = njVar.f32618a.getCurrentPosition();
            int i10 = anVar.F1;
            if (currentPosition != i10) {
                anVar.D1.f32618a.d(i10, i10);
            }
        }
    }

    @Override
    public final void j(jg.o0 o0Var) {
        an anVar = this.f49790b;
        ak akVar = anVar.C1;
        if (akVar != null) {
            akVar.d.M(new eq(2));
            akVar.h = 0L;
        }
        anVar.E3 = null;
        anVar.md();
        anVar.Zc();
        anVar.Mb(false);
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        String str;
        int i7;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var;
        an anVar = this.f49790b;
        boolean z9 = false;
        anVar.jd(0, 0, -1);
        if (editTextBoldCursor != null) {
            str = editTextBoldCursor.getText().toString();
        } else {
            str = anVar.H3;
        }
        anVar.H3 = str;
        if (!TextUtils.isEmpty(str) && (anVar.H3.startsWith("$") || anVar.H3.startsWith("#"))) {
            anVar.b8();
            if (anVar.H3.contains("@")) {
                String str2 = anVar.H3;
                f6Var = ((org.telegram.ui.ActionBar.f2) anVar).resourceProvider;
                anVar.presentFragment(new org.telegram.ui.Components.r20(str2, f6Var));
                return;
            }
            if (anVar.I3 == null) {
                anVar.I3 = anVar.H3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f49789a, 1.0f);
                ofFloat.addUpdateListener(new rm(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                ak akVar = anVar.C1;
                if (akVar != null) {
                    if (!anVar.f43835ib && akVar.a() && anVar.I3 == null) {
                        z9 = true;
                    }
                    akVar.g(z9);
                }
            }
            anVar.I3 = anVar.H3;
            anVar.f7(true);
            i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            org.telegram.messenger.oa.a(i10).c(anVar.I3);
            anVar.H1.f38193f.O(true);
            View currentView = anVar.E1.getCurrentView();
            if (anVar.f43749c4 == 3) {
                i12 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                org.telegram.messenger.oa.a(i12).b(3).a();
            } else {
                i11 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(i11);
                a10.f24309b.a();
                a10.f24310c.a();
            }
            if (currentView instanceof cn) {
                ((cn) currentView).f44857a.nd(anVar.I3);
            }
            anVar.ld();
            anVar.f43937r2.e(true, true);
            anVar.oc(true);
            z9 = true;
        } else {
            anVar.I3 = null;
            nj njVar = anVar.D1;
            if (njVar != null) {
                njVar.b(false);
                anVar.ld();
            }
            nj njVar2 = anVar.D1;
            if (njVar2 != null && njVar2.f32618a.getCurrentPosition() != 0) {
                anVar.D1.f32618a.d(0, 0);
            }
        }
        nj njVar3 = anVar.D1;
        if (njVar3 != null) {
            njVar3.b(z9);
        }
        org.telegram.messenger.ui mediaDataController = anVar.getMediaDataController();
        String str3 = anVar.H3;
        long j3 = anVar.f43842j6;
        long j10 = anVar.f43738b7;
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
        mediaDataController.X1(str3, j3, j10, i7, 0, anVar.f43939r4, false, anVar.C3, anVar.D3, true, anVar.E3);
    }

    @Override
    public final void l(EditText editText) {
        boolean z9;
        an anVar = this.f49790b;
        te.a aVar = anVar.f43784ed;
        if (anVar.I3 == null) {
            anVar.oc(false);
        }
        anVar.a8();
        if (anVar.B3) {
            anVar.W1.getAdapter().U("@" + editText.getText().toString(), 0, anVar.K6, true, true);
        } else if (anVar.C3 == null && anVar.D3 == null && anVar.f43815h3 != null && TextUtils.equals(editText.getText(), org.telegram.messenger.hd.M0(2131745767, null))) {
            anVar.f43815h3.callOnClick();
        }
        if (anVar.I3 != null) {
            if (editText.length() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 != aVar.f55395f) {
                if (z9) {
                    anVar.b8();
                }
                aVar.a(z9, true);
                fi.g1 g1Var = anVar.E1;
                if (g1Var != null) {
                    g1Var.E(0);
                }
                if (z9) {
                    anVar.oc(true);
                }
                anVar.Lc(false);
            }
        }
    }

    @Override
    public final boolean m() {
        if (this.f49790b.I3 == null) {
            return true;
        }
        return false;
    }
}
