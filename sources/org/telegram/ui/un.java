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
public final class un extends org.telegram.ui.ActionBar.g5 {
    public float f41217f;
    public final co h;

    public un(co coVar) {
        this.h = coVar;
    }

    @Override
    public final boolean a() {
        if (this.h.f35464u3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        co coVar;
        co coVar2 = this.h;
        if (!coVar2.Ac.f15396f) {
            if (coVar2.f35464u3 != null && coVar2.f35398p1 != null) {
                View currentView = coVar2.f35410q1.getCurrentView();
                if (currentView instanceof fo) {
                    coVar = ((fo) currentView).f36464a;
                } else {
                    coVar = coVar2;
                }
                if (!coVar.f35524yc.f15396f) {
                    coVar.Lb(true);
                    return false;
                }
                int currentPosition = coVar2.f35398p1.f30404a.getCurrentPosition();
                int i10 = coVar2.f35423r1;
                if (currentPosition != i10) {
                    coVar2.f35398p1.f30404a.d(i10, i10);
                    return false;
                }
            } else if (coVar2.f35524yc.f15396f) {
                coVar2.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.h.f35377n3;
    }

    @Override
    public final void k() {
        int i10;
        co coVar = this.h;
        coVar.L7();
        if (coVar.f35388o3 == null && coVar.f35400p3 == null) {
            if (coVar.f35377n3) {
                coVar.I1.getAdapter().U(null, 0, null, false, true);
                coVar.f35377n3 = false;
                coVar.f35325j0.H("", true);
            }
            org.telegram.ui.ActionBar.v0 v0Var = coVar.f35325j0;
            if (coVar.E9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            v0Var.setSearchFieldHint(LocaleController.getString(i10));
            coVar.S2.setVisibility(0);
            ImageView imageView = coVar.T2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            coVar.f35388o3 = null;
            coVar.f35400p3 = null;
            return;
        }
        ImageView imageView2 = coVar.T2;
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
        co coVar = this.h;
        coVar.f35439s3 = false;
        coVar.vc();
        coVar.Ic();
        ImageView imageView = coVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = coVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (coVar.f35377n3) {
            coVar.I1.getAdapter().U(null, 0, null, false, true);
            coVar.f35377n3 = false;
        }
        coVar.I1.setReversed(false);
        coVar.I1.getAdapter().f11167k0 = false;
        coVar.m7();
        coVar.f35388o3 = null;
        coVar.f35400p3 = null;
        coVar.f35464u3 = null;
        org.telegram.ui.ActionBar.v0 v0Var = coVar.f35325j0;
        if (coVar.E9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        v0Var.setSearchFieldHint(LocaleController.getString(i10));
        coVar.f35325j0.setSearchFieldCaption(null);
        coVar.f35537zc.a(false, true);
        coVar.Ac.a(false, true);
        org.telegram.ui.ActionBar.y yVar = coVar.f35312i0;
        if (yVar != null && yVar.f21562o != null) {
            org.telegram.ui.ActionBar.v0 v0Var2 = coVar.f35300h0;
            if (v0Var2 != null) {
                v0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = coVar.f35312i0;
            if (yVar2 != null) {
                yVar2.f(0);
                co.J3(coVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = coVar.f35265e0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            hs hsVar = coVar.f35251d0;
            if (hsVar != null) {
                hsVar.b(false);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = coVar.m0;
            if (v0Var3 != null && coVar.K9) {
                v0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = coVar.f35374n0;
            if (yVar4 != null && coVar.L9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = coVar.f35337k0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
        } else if (coVar.Y.k0() && TextUtils.isEmpty(coVar.Y.getSlowModeTimer()) && ((chat = coVar.f35264e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.v0 v0Var5 = coVar.f35300h0;
            if (v0Var5 != null) {
                v0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = coVar.f35312i0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = coVar.f35265e0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            hs hsVar2 = coVar.f35251d0;
            if (hsVar2 != null) {
                hsVar2.b(true);
            }
            org.telegram.ui.ActionBar.v0 v0Var6 = coVar.m0;
            if (v0Var6 != null && coVar.K9) {
                v0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = coVar.f35374n0;
            if (yVar7 != null && coVar.L9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var7 = coVar.f35337k0;
            if (v0Var7 != null) {
                v0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.v0 v0Var8 = coVar.f35300h0;
            if (v0Var8 != null) {
                v0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = coVar.f35374n0;
            if (yVar8 != null && coVar.L9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var9 = coVar.f35337k0;
            if (v0Var9 != null) {
                v0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var10 = coVar.m0;
            if (v0Var10 != null && coVar.K9) {
                v0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = coVar.f35312i0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = coVar.f35265e0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            hs hsVar3 = coVar.f35251d0;
            if (hsVar3 != null) {
                hsVar3.b(false);
            }
        }
        if (coVar.f35410q1 != null) {
            if (coVar.f35398p1.f30404a.getCurrentPosition() != 0) {
                coVar.f35398p1.f30404a.d(0, 0);
                coVar.f35437s1 = true;
            } else {
                coVar.f35410q1.h.clear();
            }
        }
        int i13 = coVar.R3;
        if (i13 == 3 || i13 == 8 || ((coVar.f35255d4 == 0 && !UserObject.isReplyUser(coVar.f35276f)) || ((messageObject = coVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            coVar.f35325j0.setVisibility(8);
        }
        coVar.f35385o0 = false;
        coVar.getMediaDataController().clearFoundMessageObjects();
        if (coVar.O3 == 3) {
            i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        hg.o1 o1Var = coVar.M3;
        if (o1Var != null) {
            o1Var.l();
        }
        coVar.Ia();
        coVar.hc(false);
        coVar.yc(0, true);
        coVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41217f, 0.0f);
        ofFloat.addUpdateListener(new tn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.pr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        coVar.f35524yc.a(false, true);
        coVar.Hc();
        coVar.f35412q3 = null;
        coVar.Ic();
        coVar.vc();
        yk ykVar = coVar.f35386o1;
        if (ykVar != null) {
            ykVar.d.M(new lr(2));
            ykVar.h = 0L;
            coVar.f35386o1.g(false);
        }
        kk kkVar = coVar.f35398p1;
        if (kkVar != null) {
            kkVar.b(false);
        }
        coVar.kb(false);
    }

    @Override
    public final void n() {
        kk kkVar;
        int i10;
        co coVar = this.h;
        boolean z10 = true;
        coVar.f35439s3 = true;
        coVar.vc();
        coVar.Ic();
        if (((coVar.f35255d4 != 0 && coVar.R3 != 3) || UserObject.isReplyUser(coVar.f35276f)) && !coVar.f35263dc) {
            coVar.la(null);
        }
        if (coVar.W4) {
            coVar.saveKeyboardPositionBeforeTransition();
            if (!coVar.Oa) {
                Activity parentActivity = coVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new dj(this, 9), 500L);
            ij ijVar = coVar.f35291g2;
            if (ijVar != null) {
                ijVar.b(true);
            }
            org.telegram.ui.Components.i40 i40Var = coVar.f35314i2;
            if (i40Var != null) {
                i40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41217f, 1.0f);
        ofFloat.addUpdateListener(new tn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.pr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        yk ykVar = coVar.f35386o1;
        if (ykVar != null) {
            ykVar.g((!coVar.Oa && ykVar.a() && coVar.f35464u3 == null) ? false : false);
        }
        if (coVar.f35464u3 != null && (kkVar = coVar.f35398p1) != null) {
            int currentPosition = kkVar.f30404a.getCurrentPosition();
            int i11 = coVar.f35423r1;
            if (currentPosition != i11) {
                coVar.f35398p1.f30404a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(hg.q0 q0Var) {
        co coVar = this.h;
        yk ykVar = coVar.f35386o1;
        if (ykVar != null) {
            ykVar.d.M(new lr(2));
            ykVar.h = 0L;
        }
        coVar.f35412q3 = null;
        coVar.Ic();
        coVar.vc();
        coVar.kb(false);
    }

    @Override
    public final void p(di.h2 h2Var) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var;
        co coVar = this.h;
        boolean z10 = false;
        coVar.Fc(0, 0, -1);
        if (h2Var != null) {
            str = h2Var.getText().toString();
        } else {
            str = coVar.f35452t3;
        }
        coVar.f35452t3 = str;
        if (!TextUtils.isEmpty(str) && (coVar.f35452t3.startsWith("$") || coVar.f35452t3.startsWith("#"))) {
            coVar.M7();
            if (coVar.f35452t3.contains("@")) {
                String str2 = coVar.f35452t3;
                f6Var = ((org.telegram.ui.ActionBar.n2) coVar).resourceProvider;
                coVar.presentFragment(new org.telegram.ui.Components.b40(str2, f6Var));
                return;
            }
            if (coVar.f35464u3 == null) {
                coVar.f35464u3 = coVar.f35452t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41217f, 1.0f);
                ofFloat.addUpdateListener(new tn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.pr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                yk ykVar = coVar.f35386o1;
                if (ykVar != null) {
                    if (!coVar.Oa && ykVar.a() && coVar.f35464u3 == null) {
                        z10 = true;
                    }
                    ykVar.g(z10);
                }
            }
            coVar.f35464u3 = coVar.f35452t3;
            coVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(coVar.f35464u3);
            coVar.f35450t1.f25253f.N(true);
            View currentView = coVar.f35410q1.getCurrentView();
            if (coVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof fo) {
                ((fo) currentView).f36464a.Jc(coVar.f35464u3);
            }
            coVar.Hc();
            coVar.f35253d2.e(true, true);
            coVar.Lb(true);
            z10 = true;
        } else {
            coVar.f35464u3 = null;
            kk kkVar = coVar.f35398p1;
            if (kkVar != null) {
                kkVar.b(false);
                coVar.Hc();
            }
            kk kkVar2 = coVar.f35398p1;
            if (kkVar2 != null && kkVar2.f30404a.getCurrentPosition() != 0) {
                coVar.f35398p1.f30404a.d(0, 0);
            }
        }
        kk kkVar3 = coVar.f35398p1;
        if (kkVar3 != null) {
            kkVar3.b(z10);
        }
        MediaDataController mediaDataController = coVar.getMediaDataController();
        String str3 = coVar.f35452t3;
        long j3 = coVar.T5;
        long j10 = coVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j3, j10, i10, 0, coVar.f35255d4, coVar.f35388o3, coVar.f35400p3, coVar.f35412q3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        co coVar = this.h;
        le.b bVar = coVar.Ac;
        if (coVar.f35464u3 == null) {
            coVar.Lb(false);
        }
        coVar.L7();
        if (coVar.f35377n3) {
            hg.k1 adapter = coVar.I1.getAdapter();
            adapter.U("@" + editText.getText().toString(), 0, coVar.f35467u6, true, true);
        } else if (coVar.f35388o3 == null && coVar.f35400p3 == null && coVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            coVar.T2.callOnClick();
        }
        if (coVar.f35464u3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != bVar.f15396f) {
                if (z10) {
                    coVar.M7();
                }
                bVar.a(z10, true);
                di.i1 i1Var = coVar.f35410q1;
                if (i1Var != null) {
                    i1Var.D(0);
                }
                if (z10) {
                    coVar.Lb(true);
                }
                coVar.hc(false);
            }
        }
    }

    @Override
    public final boolean r() {
        if (this.h.f35464u3 == null) {
            return true;
        }
        return false;
    }
}
