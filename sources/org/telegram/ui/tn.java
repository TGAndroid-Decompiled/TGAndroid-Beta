package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class tn extends org.telegram.ui.ActionBar.h5 {
    public float f37837f;
    public final bo h;

    public tn(bo boVar) {
        this.h = boVar;
    }

    @Override
    public final boolean a() {
        if (this.h.f32466u3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        bo boVar;
        bo boVar2 = this.h;
        if (!boVar2.Ac.f13985f) {
            if (boVar2.f32466u3 != null && boVar2.f32400p1 != null) {
                View currentView = boVar2.f32412q1.getCurrentView();
                if (currentView instanceof eo) {
                    boVar = ((eo) currentView).f33444a;
                } else {
                    boVar = boVar2;
                }
                if (!boVar.f32526yc.f13985f) {
                    boVar.Lb(true);
                    return false;
                }
                int currentPosition = boVar2.f32400p1.f28169a.getCurrentPosition();
                int i10 = boVar2.f32425r1;
                if (currentPosition != i10) {
                    boVar2.f32400p1.f28169a.d(i10, i10);
                    return false;
                }
            } else if (boVar2.f32526yc.f13985f) {
                boVar2.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.h.f32379n3;
    }

    @Override
    public final void k() {
        int i10;
        bo boVar = this.h;
        boVar.L7();
        if (boVar.f32390o3 == null && boVar.f32402p3 == null) {
            if (boVar.f32379n3) {
                boVar.I1.getAdapter().U(null, 0, null, false, true);
                boVar.f32379n3 = false;
                boVar.f32327j0.H("", true);
            }
            org.telegram.ui.ActionBar.w0 w0Var = boVar.f32327j0;
            if (boVar.E9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var.setSearchFieldHint(LocaleController.getString(i10));
            boVar.S2.setVisibility(0);
            ImageView imageView = boVar.T2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            boVar.f32390o3 = null;
            boVar.f32402p3 = null;
            return;
        }
        ImageView imageView2 = boVar.T2;
        if (imageView2 != null) {
            imageView2.callOnClick();
        }
    }

    @Override
    public final void m() {
        int i10;
        TLRPC.Chat chat;
        int i11;
        int i12;
        MessageObject messageObject;
        bo boVar = this.h;
        boVar.f32441s3 = false;
        boVar.vc();
        boVar.Ic();
        ImageView imageView = boVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = boVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (boVar.f32379n3) {
            boVar.I1.getAdapter().U(null, 0, null, false, true);
            boVar.f32379n3 = false;
        }
        boVar.I1.setReversed(false);
        boVar.I1.getAdapter().f9827k0 = false;
        boVar.m7();
        boVar.f32390o3 = null;
        boVar.f32402p3 = null;
        boVar.f32466u3 = null;
        org.telegram.ui.ActionBar.w0 w0Var = boVar.f32327j0;
        if (boVar.E9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        w0Var.setSearchFieldHint(LocaleController.getString(i10));
        boVar.f32327j0.setSearchFieldCaption(null);
        boVar.f32539zc.a(false, true);
        boVar.Ac.a(false, true);
        org.telegram.ui.ActionBar.z zVar = boVar.f32314i0;
        if (zVar != null && zVar.f19753o != null) {
            org.telegram.ui.ActionBar.w0 w0Var2 = boVar.f32302h0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar2 = boVar.f32314i0;
            if (zVar2 != null) {
                zVar2.f(0);
                bo.J3(boVar);
            }
            org.telegram.ui.ActionBar.z zVar3 = boVar.f32266e0;
            if (zVar3 != null) {
                zVar3.f(8);
            }
            js jsVar = boVar.f32253d0;
            if (jsVar != null) {
                jsVar.b(false);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = boVar.m0;
            if (w0Var3 != null && boVar.K9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar4 = boVar.f32376n0;
            if (zVar4 != null && boVar.L9) {
                zVar4.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = boVar.f32339k0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
        } else if (boVar.Y.k0() && TextUtils.isEmpty(boVar.Y.getSlowModeTimer()) && ((chat = boVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.w0 w0Var5 = boVar.f32302h0;
            if (w0Var5 != null) {
                w0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar5 = boVar.f32314i0;
            if (zVar5 != null) {
                zVar5.f(8);
            }
            org.telegram.ui.ActionBar.z zVar6 = boVar.f32266e0;
            if (zVar6 != null) {
                zVar6.f(0);
            }
            js jsVar2 = boVar.f32253d0;
            if (jsVar2 != null) {
                jsVar2.b(true);
            }
            org.telegram.ui.ActionBar.w0 w0Var6 = boVar.m0;
            if (w0Var6 != null && boVar.K9) {
                w0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar7 = boVar.f32376n0;
            if (zVar7 != null && boVar.L9) {
                zVar7.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var7 = boVar.f32339k0;
            if (w0Var7 != null) {
                w0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.w0 w0Var8 = boVar.f32302h0;
            if (w0Var8 != null) {
                w0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.z zVar8 = boVar.f32376n0;
            if (zVar8 != null && boVar.L9) {
                zVar8.f(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var9 = boVar.f32339k0;
            if (w0Var9 != null) {
                w0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var10 = boVar.m0;
            if (w0Var10 != null && boVar.K9) {
                w0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.z zVar9 = boVar.f32314i0;
            if (zVar9 != null) {
                zVar9.f(8);
            }
            org.telegram.ui.ActionBar.z zVar10 = boVar.f32266e0;
            if (zVar10 != null) {
                zVar10.f(8);
            }
            js jsVar3 = boVar.f32253d0;
            if (jsVar3 != null) {
                jsVar3.b(false);
            }
        }
        if (boVar.f32412q1 != null) {
            if (boVar.f32400p1.f28169a.getCurrentPosition() != 0) {
                boVar.f32400p1.f28169a.d(0, 0);
                boVar.f32439s1 = true;
            } else {
                boVar.f32412q1.h.clear();
            }
        }
        int i13 = boVar.R3;
        if (i13 == 3 || i13 == 8 || ((boVar.f32257d4 == 0 && !UserObject.isReplyUser(boVar.f32277f)) || ((messageObject = boVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            boVar.f32327j0.setVisibility(8);
        }
        boVar.f32387o0 = false;
        boVar.getMediaDataController().clearFoundMessageObjects();
        if (boVar.O3 == 3) {
            i12 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        gg.o1 o1Var = boVar.M3;
        if (o1Var != null) {
            o1Var.l();
        }
        boVar.Ia();
        boVar.hc(false);
        boVar.yc(0, true);
        boVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37837f, 0.0f);
        ofFloat.addUpdateListener(new sn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        boVar.f32526yc.a(false, true);
        boVar.Hc();
        boVar.f32414q3 = null;
        boVar.Ic();
        boVar.vc();
        zk zkVar = boVar.f32388o1;
        if (zkVar != null) {
            zkVar.d.N(new kr(2));
            zkVar.h = 0L;
            boVar.f32388o1.g(false);
        }
        lk lkVar = boVar.f32400p1;
        if (lkVar != null) {
            lkVar.b(false);
        }
        boVar.kb(false);
    }

    @Override
    public final void n() {
        lk lkVar;
        int i10;
        bo boVar = this.h;
        boolean z10 = true;
        boVar.f32441s3 = true;
        boVar.vc();
        boVar.Ic();
        if (((boVar.f32257d4 != 0 && boVar.R3 != 3) || UserObject.isReplyUser(boVar.f32277f)) && !boVar.f32265dc) {
            boVar.la(null);
        }
        if (boVar.W4) {
            boVar.saveKeyboardPositionBeforeTransition();
            if (!boVar.Oa) {
                Activity parentActivity = boVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) boVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new ej(this, 9), 500L);
            jj jjVar = boVar.f32292g2;
            if (jjVar != null) {
                jjVar.b(true);
            }
            org.telegram.ui.Components.i40 i40Var = boVar.f32316i2;
            if (i40Var != null) {
                i40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37837f, 1.0f);
        ofFloat.addUpdateListener(new sn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        zk zkVar = boVar.f32388o1;
        if (zkVar != null) {
            zkVar.g((!boVar.Oa && zkVar.a() && boVar.f32466u3 == null) ? false : false);
        }
        if (boVar.f32466u3 != null && (lkVar = boVar.f32400p1) != null) {
            int currentPosition = lkVar.f28169a.getCurrentPosition();
            int i11 = boVar.f32425r1;
            if (currentPosition != i11) {
                boVar.f32400p1.f28169a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(gg.q0 q0Var) {
        bo boVar = this.h;
        zk zkVar = boVar.f32388o1;
        if (zkVar != null) {
            zkVar.d.N(new kr(2));
            zkVar.h = 0L;
        }
        boVar.f32414q3 = null;
        boVar.Ic();
        boVar.vc();
        boVar.kb(false);
    }

    @Override
    public final void p(ci.h2 h2Var) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var;
        bo boVar = this.h;
        boolean z10 = false;
        boVar.Fc(0, 0, -1);
        if (h2Var != null) {
            str = h2Var.getText().toString();
        } else {
            str = boVar.f32454t3;
        }
        boVar.f32454t3 = str;
        if (!TextUtils.isEmpty(str) && (boVar.f32454t3.startsWith("$") || boVar.f32454t3.startsWith("#"))) {
            boVar.M7();
            if (boVar.f32454t3.contains("@")) {
                String str2 = boVar.f32454t3;
                f6Var = ((org.telegram.ui.ActionBar.o2) boVar).resourceProvider;
                boVar.presentFragment(new org.telegram.ui.Components.b40(str2, f6Var));
                return;
            }
            if (boVar.f32466u3 == null) {
                boVar.f32466u3 = boVar.f32454t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37837f, 1.0f);
                ofFloat.addUpdateListener(new sn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                zk zkVar = boVar.f32388o1;
                if (zkVar != null) {
                    if (!boVar.Oa && zkVar.a() && boVar.f32466u3 == null) {
                        z10 = true;
                    }
                    zkVar.g(z10);
                }
            }
            boVar.f32466u3 = boVar.f32454t3;
            boVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(boVar.f32466u3);
            boVar.f32452t1.f23207f.N(true);
            View currentView = boVar.f32412q1.getCurrentView();
            if (boVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof eo) {
                ((eo) currentView).f33444a.Jc(boVar.f32466u3);
            }
            boVar.Hc();
            boVar.f32255d2.e(true, true);
            boVar.Lb(true);
            z10 = true;
        } else {
            boVar.f32466u3 = null;
            lk lkVar = boVar.f32400p1;
            if (lkVar != null) {
                lkVar.b(false);
                boVar.Hc();
            }
            lk lkVar2 = boVar.f32400p1;
            if (lkVar2 != null && lkVar2.f28169a.getCurrentPosition() != 0) {
                boVar.f32400p1.f28169a.d(0, 0);
            }
        }
        lk lkVar3 = boVar.f32400p1;
        if (lkVar3 != null) {
            lkVar3.b(z10);
        }
        MediaDataController mediaDataController = boVar.getMediaDataController();
        String str3 = boVar.f32454t3;
        long j3 = boVar.T5;
        long j10 = boVar.L6;
        i10 = ((org.telegram.ui.ActionBar.o2) boVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j3, j10, i10, 0, boVar.f32257d4, boVar.f32390o3, boVar.f32402p3, boVar.f32414q3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        bo boVar = this.h;
        le.b bVar = boVar.Ac;
        if (boVar.f32466u3 == null) {
            boVar.Lb(false);
        }
        boVar.L7();
        if (boVar.f32379n3) {
            gg.k1 adapter = boVar.I1.getAdapter();
            adapter.U("@" + editText.getText().toString(), 0, boVar.f32469u6, true, true);
        } else if (boVar.f32390o3 == null && boVar.f32402p3 == null && boVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            boVar.T2.callOnClick();
        }
        if (boVar.f32466u3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != bVar.f13985f) {
                if (z10) {
                    boVar.M7();
                }
                bVar.a(z10, true);
                ci.i1 i1Var = boVar.f32412q1;
                if (i1Var != null) {
                    i1Var.E(0);
                }
                if (z10) {
                    boVar.Lb(true);
                }
                boVar.hc(false);
            }
        }
    }

    @Override
    public final boolean r() {
        if (this.h.f32466u3 == null) {
            return true;
        }
        return false;
    }
}
