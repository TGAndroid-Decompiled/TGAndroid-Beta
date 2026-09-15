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
public final class tn extends org.telegram.ui.ActionBar.g5 {
    public float f37754f;
    public final bo h;

    public tn(bo boVar) {
        this.h = boVar;
    }

    @Override
    public final boolean a() {
        if (this.h.f32488u3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        bo boVar;
        bo boVar2 = this.h;
        if (!boVar2.Ac.f13975f) {
            if (boVar2.f32488u3 != null && boVar2.f32422p1 != null) {
                View currentView = boVar2.f32434q1.getCurrentView();
                if (currentView instanceof eo) {
                    boVar = ((eo) currentView).f33375a;
                } else {
                    boVar = boVar2;
                }
                if (!boVar.f32548yc.f13975f) {
                    boVar.Lb(true);
                    return false;
                }
                int currentPosition = boVar2.f32422p1.f28155a.getCurrentPosition();
                int i10 = boVar2.f32447r1;
                if (currentPosition != i10) {
                    boVar2.f32422p1.f28155a.d(i10, i10);
                    return false;
                }
            } else if (boVar2.f32548yc.f13975f) {
                boVar2.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.h.f32401n3;
    }

    @Override
    public final void k() {
        int i10;
        bo boVar = this.h;
        boVar.L7();
        if (boVar.f32412o3 == null && boVar.f32424p3 == null) {
            if (boVar.f32401n3) {
                boVar.I1.getAdapter().U(null, 0, null, false, true);
                boVar.f32401n3 = false;
                boVar.f32349j0.H("", true);
            }
            org.telegram.ui.ActionBar.v0 v0Var = boVar.f32349j0;
            if (boVar.E9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            v0Var.setSearchFieldHint(LocaleController.getString(i10));
            boVar.S2.setVisibility(0);
            ImageView imageView = boVar.T2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            boVar.f32412o3 = null;
            boVar.f32424p3 = null;
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
        boVar.f32463s3 = false;
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
        if (boVar.f32401n3) {
            boVar.I1.getAdapter().U(null, 0, null, false, true);
            boVar.f32401n3 = false;
        }
        boVar.I1.setReversed(false);
        boVar.I1.getAdapter().f9822k0 = false;
        boVar.m7();
        boVar.f32412o3 = null;
        boVar.f32424p3 = null;
        boVar.f32488u3 = null;
        org.telegram.ui.ActionBar.v0 v0Var = boVar.f32349j0;
        if (boVar.E9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        v0Var.setSearchFieldHint(LocaleController.getString(i10));
        boVar.f32349j0.setSearchFieldCaption(null);
        boVar.f32561zc.a(false, true);
        boVar.Ac.a(false, true);
        org.telegram.ui.ActionBar.y yVar = boVar.f32336i0;
        if (yVar != null && yVar.f19726o != null) {
            org.telegram.ui.ActionBar.v0 v0Var2 = boVar.f32324h0;
            if (v0Var2 != null) {
                v0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = boVar.f32336i0;
            if (yVar2 != null) {
                yVar2.f(0);
                bo.J3(boVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = boVar.f32288e0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            hs hsVar = boVar.f32275d0;
            if (hsVar != null) {
                hsVar.b(false);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = boVar.m0;
            if (v0Var3 != null && boVar.K9) {
                v0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = boVar.f32398n0;
            if (yVar4 != null && boVar.L9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = boVar.f32361k0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
        } else if (boVar.Y.k0() && TextUtils.isEmpty(boVar.Y.getSlowModeTimer()) && ((chat = boVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.v0 v0Var5 = boVar.f32324h0;
            if (v0Var5 != null) {
                v0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = boVar.f32336i0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = boVar.f32288e0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            hs hsVar2 = boVar.f32275d0;
            if (hsVar2 != null) {
                hsVar2.b(true);
            }
            org.telegram.ui.ActionBar.v0 v0Var6 = boVar.m0;
            if (v0Var6 != null && boVar.K9) {
                v0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = boVar.f32398n0;
            if (yVar7 != null && boVar.L9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var7 = boVar.f32361k0;
            if (v0Var7 != null) {
                v0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.v0 v0Var8 = boVar.f32324h0;
            if (v0Var8 != null) {
                v0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = boVar.f32398n0;
            if (yVar8 != null && boVar.L9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var9 = boVar.f32361k0;
            if (v0Var9 != null) {
                v0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var10 = boVar.m0;
            if (v0Var10 != null && boVar.K9) {
                v0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = boVar.f32336i0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = boVar.f32288e0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            hs hsVar3 = boVar.f32275d0;
            if (hsVar3 != null) {
                hsVar3.b(false);
            }
        }
        if (boVar.f32434q1 != null) {
            if (boVar.f32422p1.f28155a.getCurrentPosition() != 0) {
                boVar.f32422p1.f28155a.d(0, 0);
                boVar.f32461s1 = true;
            } else {
                boVar.f32434q1.h.clear();
            }
        }
        int i13 = boVar.R3;
        if (i13 == 3 || i13 == 8 || ((boVar.f32279d4 == 0 && !UserObject.isReplyUser(boVar.f32299f)) || ((messageObject = boVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            boVar.f32349j0.setVisibility(8);
        }
        boVar.f32409o0 = false;
        boVar.getMediaDataController().clearFoundMessageObjects();
        if (boVar.O3 == 3) {
            i12 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37754f, 0.0f);
        ofFloat.addUpdateListener(new sn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        boVar.f32548yc.a(false, true);
        boVar.Hc();
        boVar.f32436q3 = null;
        boVar.Ic();
        boVar.vc();
        yk ykVar = boVar.f32410o1;
        if (ykVar != null) {
            ykVar.d.M(new kr(2));
            ykVar.h = 0L;
            boVar.f32410o1.g(false);
        }
        kk kkVar = boVar.f32422p1;
        if (kkVar != null) {
            kkVar.b(false);
        }
        boVar.kb(false);
    }

    @Override
    public final void n() {
        kk kkVar;
        int i10;
        bo boVar = this.h;
        boolean z10 = true;
        boVar.f32463s3 = true;
        boVar.vc();
        boVar.Ic();
        if (((boVar.f32279d4 != 0 && boVar.R3 != 3) || UserObject.isReplyUser(boVar.f32299f)) && !boVar.f32287dc) {
            boVar.la(null);
        }
        if (boVar.W4) {
            boVar.saveKeyboardPositionBeforeTransition();
            if (!boVar.Oa) {
                Activity parentActivity = boVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) boVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new dj(this, 9), 500L);
            ij ijVar = boVar.f32314g2;
            if (ijVar != null) {
                ijVar.b(true);
            }
            org.telegram.ui.Components.i40 i40Var = boVar.f32338i2;
            if (i40Var != null) {
                i40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37754f, 1.0f);
        ofFloat.addUpdateListener(new sn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        yk ykVar = boVar.f32410o1;
        if (ykVar != null) {
            ykVar.g((!boVar.Oa && ykVar.a() && boVar.f32488u3 == null) ? false : false);
        }
        if (boVar.f32488u3 != null && (kkVar = boVar.f32422p1) != null) {
            int currentPosition = kkVar.f28155a.getCurrentPosition();
            int i11 = boVar.f32447r1;
            if (currentPosition != i11) {
                boVar.f32422p1.f28155a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(gg.q0 q0Var) {
        bo boVar = this.h;
        yk ykVar = boVar.f32410o1;
        if (ykVar != null) {
            ykVar.d.M(new kr(2));
            ykVar.h = 0L;
        }
        boVar.f32436q3 = null;
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
        org.telegram.ui.ActionBar.e6 e6Var;
        bo boVar = this.h;
        boolean z10 = false;
        boVar.Fc(0, 0, -1);
        if (h2Var != null) {
            str = h2Var.getText().toString();
        } else {
            str = boVar.f32476t3;
        }
        boVar.f32476t3 = str;
        if (!TextUtils.isEmpty(str) && (boVar.f32476t3.startsWith("$") || boVar.f32476t3.startsWith("#"))) {
            boVar.M7();
            if (boVar.f32476t3.contains("@")) {
                String str2 = boVar.f32476t3;
                e6Var = ((org.telegram.ui.ActionBar.n2) boVar).resourceProvider;
                boVar.presentFragment(new org.telegram.ui.Components.b40(str2, e6Var));
                return;
            }
            if (boVar.f32488u3 == null) {
                boVar.f32488u3 = boVar.f32476t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37754f, 1.0f);
                ofFloat.addUpdateListener(new sn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                yk ykVar = boVar.f32410o1;
                if (ykVar != null) {
                    if (!boVar.Oa && ykVar.a() && boVar.f32488u3 == null) {
                        z10 = true;
                    }
                    ykVar.g(z10);
                }
            }
            boVar.f32488u3 = boVar.f32476t3;
            boVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(boVar.f32488u3);
            boVar.f32474t1.f23215f.N(true);
            View currentView = boVar.f32434q1.getCurrentView();
            if (boVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof eo) {
                ((eo) currentView).f33375a.Jc(boVar.f32488u3);
            }
            boVar.Hc();
            boVar.f32277d2.e(true, true);
            boVar.Lb(true);
            z10 = true;
        } else {
            boVar.f32488u3 = null;
            kk kkVar = boVar.f32422p1;
            if (kkVar != null) {
                kkVar.b(false);
                boVar.Hc();
            }
            kk kkVar2 = boVar.f32422p1;
            if (kkVar2 != null && kkVar2.f28155a.getCurrentPosition() != 0) {
                boVar.f32422p1.f28155a.d(0, 0);
            }
        }
        kk kkVar3 = boVar.f32422p1;
        if (kkVar3 != null) {
            kkVar3.b(z10);
        }
        MediaDataController mediaDataController = boVar.getMediaDataController();
        String str3 = boVar.f32476t3;
        long j3 = boVar.T5;
        long j10 = boVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) boVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j3, j10, i10, 0, boVar.f32279d4, boVar.f32412o3, boVar.f32424p3, boVar.f32436q3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        bo boVar = this.h;
        le.b bVar = boVar.Ac;
        if (boVar.f32488u3 == null) {
            boVar.Lb(false);
        }
        boVar.L7();
        if (boVar.f32401n3) {
            gg.k1 adapter = boVar.I1.getAdapter();
            adapter.U("@" + editText.getText().toString(), 0, boVar.f32491u6, true, true);
        } else if (boVar.f32412o3 == null && boVar.f32424p3 == null && boVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            boVar.T2.callOnClick();
        }
        if (boVar.f32488u3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != bVar.f13975f) {
                if (z10) {
                    boVar.M7();
                }
                bVar.a(z10, true);
                ci.i1 i1Var = boVar.f32434q1;
                if (i1Var != null) {
                    i1Var.D(0);
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
        if (this.h.f32488u3 == null) {
            return true;
        }
        return false;
    }
}
