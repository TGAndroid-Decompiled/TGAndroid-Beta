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
public final class qn extends org.telegram.ui.ActionBar.f5 {
    public float f39755f;
    public final yn h;

    public qn(yn ynVar) {
        this.h = ynVar;
    }

    @Override
    public final boolean a() {
        if (this.h.f43490s3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        yn ynVar;
        yn ynVar2 = this.h;
        if (!ynVar2.xc.f15435f) {
            if (ynVar2.f43490s3 != null && ynVar2.f43426n1 != null) {
                View currentView = ynVar2.f43437o1.getCurrentView();
                if (currentView instanceof ao) {
                    ynVar = ((ao) currentView).f34865a;
                } else {
                    ynVar = ynVar2;
                }
                if (!ynVar.f43536vc.f15435f) {
                    ynVar.Kb(true);
                    return false;
                }
                int currentPosition = ynVar2.f43426n1.f32584a.getCurrentPosition();
                int i10 = ynVar2.f43449p1;
                if (currentPosition != i10) {
                    ynVar2.f43426n1.f32584a.d(i10, i10);
                    return false;
                }
            } else if (ynVar2.f43536vc.f15435f) {
                ynVar2.Kb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.h.f43403l3;
    }

    @Override
    public final void k() {
        int i10;
        yn ynVar = this.h;
        ynVar.L7();
        if (ynVar.f43414m3 == null && ynVar.f43428n3 == null) {
            if (ynVar.f43403l3) {
                ynVar.G1.getAdapter().U(null, 0, null, false, true);
                ynVar.f43403l3 = false;
                ynVar.f43351h0.H("", true);
            }
            org.telegram.ui.ActionBar.v0 v0Var = ynVar.f43351h0;
            if (ynVar.D9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            v0Var.setSearchFieldHint(LocaleController.getString(i10));
            ynVar.Q2.setVisibility(0);
            ImageView imageView = ynVar.R2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ynVar.f43414m3 = null;
            ynVar.f43428n3 = null;
            return;
        }
        ImageView imageView2 = ynVar.R2;
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
        yn ynVar = this.h;
        ynVar.f43463q3 = false;
        ynVar.uc();
        ynVar.Hc();
        ImageView imageView = ynVar.Q2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = ynVar.R2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (ynVar.f43403l3) {
            ynVar.G1.getAdapter().U(null, 0, null, false, true);
            ynVar.f43403l3 = false;
        }
        ynVar.G1.setReversed(false);
        ynVar.G1.getAdapter().f10680k0 = false;
        ynVar.m7();
        ynVar.f43414m3 = null;
        ynVar.f43428n3 = null;
        ynVar.f43490s3 = null;
        org.telegram.ui.ActionBar.v0 v0Var = ynVar.f43351h0;
        if (ynVar.D9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        v0Var.setSearchFieldHint(LocaleController.getString(i10));
        ynVar.f43351h0.setSearchFieldCaption(null);
        ynVar.wc.a(false, true);
        ynVar.xc.a(false, true);
        org.telegram.ui.ActionBar.y yVar = ynVar.f43339g0;
        if (yVar != null && yVar.f21703o != null) {
            org.telegram.ui.ActionBar.v0 v0Var2 = ynVar.f43327f0;
            if (v0Var2 != null) {
                v0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = ynVar.f43339g0;
            if (yVar2 != null) {
                yVar2.f(0);
                yn.J3(ynVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = ynVar.f43289c0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            fs fsVar = ynVar.f43275b0;
            if (fsVar != null) {
                fsVar.b(false);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = ynVar.f43388k0;
            if (v0Var3 != null && ynVar.I9) {
                v0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = ynVar.f43401l0;
            if (yVar4 != null && ynVar.J9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = ynVar.f43363i0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
        } else if (ynVar.W.k0() && TextUtils.isEmpty(ynVar.W.getSlowModeTimer()) && ((chat = ynVar.f43314e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.v0 v0Var5 = ynVar.f43327f0;
            if (v0Var5 != null) {
                v0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = ynVar.f43339g0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = ynVar.f43289c0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            fs fsVar2 = ynVar.f43275b0;
            if (fsVar2 != null) {
                fsVar2.b(true);
            }
            org.telegram.ui.ActionBar.v0 v0Var6 = ynVar.f43388k0;
            if (v0Var6 != null && ynVar.I9) {
                v0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = ynVar.f43401l0;
            if (yVar7 != null && ynVar.J9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var7 = ynVar.f43363i0;
            if (v0Var7 != null) {
                v0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.v0 v0Var8 = ynVar.f43327f0;
            if (v0Var8 != null) {
                v0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = ynVar.f43401l0;
            if (yVar8 != null && ynVar.J9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var9 = ynVar.f43363i0;
            if (v0Var9 != null) {
                v0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var10 = ynVar.f43388k0;
            if (v0Var10 != null && ynVar.I9) {
                v0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = ynVar.f43339g0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = ynVar.f43289c0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            fs fsVar3 = ynVar.f43275b0;
            if (fsVar3 != null) {
                fsVar3.b(false);
            }
        }
        if (ynVar.f43437o1 != null) {
            if (ynVar.f43426n1.f32584a.getCurrentPosition() != 0) {
                ynVar.f43426n1.f32584a.d(0, 0);
                ynVar.f43461q1 = true;
            } else {
                ynVar.f43437o1.h.clear();
            }
        }
        int i13 = ynVar.P3;
        if (i13 == 3 || i13 == 8 || ((ynVar.f43279b4 == 0 && !UserObject.isReplyUser(ynVar.f43326f)) || ((messageObject = ynVar.V3) != null && messageObject.getRepliesCount() < 10))) {
            ynVar.f43351h0.setVisibility(8);
        }
        ynVar.m0 = false;
        ynVar.getMediaDataController().clearFoundMessageObjects();
        if (ynVar.M3 == 3) {
            i12 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        gg.o1 o1Var = ynVar.K3;
        if (o1Var != null) {
            o1Var.l();
        }
        ynVar.Ha();
        ynVar.gc(false);
        ynVar.xc(0, true);
        ynVar.Vc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39755f, 0.0f);
        ofFloat.addUpdateListener(new pn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.tr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        ynVar.f43536vc.a(false, true);
        ynVar.Gc();
        ynVar.f43439o3 = null;
        ynVar.Hc();
        ynVar.uc();
        vk vkVar = ynVar.f43412m1;
        if (vkVar != null) {
            vkVar.d.M(new hr(2));
            vkVar.h = 0L;
            ynVar.f43412m1.g(false);
        }
        hk hkVar = ynVar.f43426n1;
        if (hkVar != null) {
            hkVar.b(false);
        }
        ynVar.jb(false);
    }

    @Override
    public final void n() {
        hk hkVar;
        int i10;
        yn ynVar = this.h;
        boolean z10 = true;
        ynVar.f43463q3 = true;
        ynVar.uc();
        ynVar.Hc();
        if (((ynVar.f43279b4 != 0 && ynVar.P3 != 3) || UserObject.isReplyUser(ynVar.f43326f)) && !ynVar.f43273ac) {
            ynVar.ka(null);
        }
        if (ynVar.U4) {
            ynVar.saveKeyboardPositionBeforeTransition();
            if (!ynVar.Ma) {
                Activity parentActivity = ynVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new bj(this, 9), 500L);
            gj gjVar = ynVar.f43317e2;
            if (gjVar != null) {
                gjVar.b(true);
            }
            org.telegram.ui.Components.m40 m40Var = ynVar.f43341g2;
            if (m40Var != null) {
                m40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39755f, 1.0f);
        ofFloat.addUpdateListener(new pn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.tr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        vk vkVar = ynVar.f43412m1;
        if (vkVar != null) {
            vkVar.g((!ynVar.Ma && vkVar.a() && ynVar.f43490s3 == null) ? false : false);
        }
        if (ynVar.f43490s3 != null && (hkVar = ynVar.f43426n1) != null) {
            int currentPosition = hkVar.f32584a.getCurrentPosition();
            int i11 = ynVar.f43449p1;
            if (currentPosition != i11) {
                ynVar.f43426n1.f32584a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(gg.q0 q0Var) {
        yn ynVar = this.h;
        vk vkVar = ynVar.f43412m1;
        if (vkVar != null) {
            vkVar.d.M(new hr(2));
            vkVar.h = 0L;
        }
        ynVar.f43439o3 = null;
        ynVar.Hc();
        ynVar.uc();
        ynVar.jb(false);
    }

    @Override
    public final void p(ci.h2 h2Var) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.d6 d6Var;
        yn ynVar = this.h;
        boolean z10 = false;
        ynVar.Ec(0, 0, -1);
        if (h2Var != null) {
            str = h2Var.getText().toString();
        } else {
            str = ynVar.f43476r3;
        }
        ynVar.f43476r3 = str;
        if (!TextUtils.isEmpty(str) && (ynVar.f43476r3.startsWith("$") || ynVar.f43476r3.startsWith("#"))) {
            ynVar.M7();
            if (ynVar.f43476r3.contains("@")) {
                String str2 = ynVar.f43476r3;
                d6Var = ((org.telegram.ui.ActionBar.n2) ynVar).resourceProvider;
                ynVar.presentFragment(new org.telegram.ui.Components.f40(str2, d6Var));
                return;
            }
            if (ynVar.f43490s3 == null) {
                ynVar.f43490s3 = ynVar.f43476r3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39755f, 1.0f);
                ofFloat.addUpdateListener(new pn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.tr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                vk vkVar = ynVar.f43412m1;
                if (vkVar != null) {
                    if (!ynVar.Ma && vkVar.a() && ynVar.f43490s3 == null) {
                        z10 = true;
                    }
                    vkVar.g(z10);
                }
            }
            ynVar.f43490s3 = ynVar.f43476r3;
            ynVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(ynVar.f43490s3);
            ynVar.f43474r1.f27007f.N(true);
            View currentView = ynVar.f43437o1.getCurrentView();
            if (ynVar.M3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof ao) {
                ((ao) currentView).f34865a.Ic(ynVar.f43490s3);
            }
            ynVar.Gc();
            ynVar.f43277b2.e(true, true);
            ynVar.Kb(true);
            z10 = true;
        } else {
            ynVar.f43490s3 = null;
            hk hkVar = ynVar.f43426n1;
            if (hkVar != null) {
                hkVar.b(false);
                ynVar.Gc();
            }
            hk hkVar2 = ynVar.f43426n1;
            if (hkVar2 != null && hkVar2.f32584a.getCurrentPosition() != 0) {
                ynVar.f43426n1.f32584a.d(0, 0);
            }
        }
        hk hkVar3 = ynVar.f43426n1;
        if (hkVar3 != null) {
            hkVar3.b(z10);
        }
        MediaDataController mediaDataController = ynVar.getMediaDataController();
        String str3 = ynVar.f43476r3;
        long j3 = ynVar.R5;
        long j10 = ynVar.J6;
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j3, j10, i10, 0, ynVar.f43279b4, ynVar.f43414m3, ynVar.f43428n3, ynVar.f43439o3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        yn ynVar = this.h;
        le.b bVar = ynVar.xc;
        if (ynVar.f43490s3 == null) {
            ynVar.Kb(false);
        }
        ynVar.L7();
        if (ynVar.f43403l3) {
            gg.k1 adapter = ynVar.G1.getAdapter();
            adapter.U("@" + editText.getText().toString(), 0, ynVar.f43493s6, true, true);
        } else if (ynVar.f43414m3 == null && ynVar.f43428n3 == null && ynVar.R2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            ynVar.R2.callOnClick();
        }
        if (ynVar.f43490s3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != bVar.f15435f) {
                if (z10) {
                    ynVar.M7();
                }
                bVar.a(z10, true);
                ci.i1 i1Var = ynVar.f43437o1;
                if (i1Var != null) {
                    i1Var.E(0);
                }
                if (z10) {
                    ynVar.Kb(true);
                }
                ynVar.gc(false);
            }
        }
    }

    @Override
    public final boolean r() {
        if (this.h.f43490s3 == null) {
            return true;
        }
        return false;
    }
}
