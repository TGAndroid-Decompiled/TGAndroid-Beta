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
public final class rn extends org.telegram.ui.ActionBar.h5 {
    public float f37898f;
    public final zn h;

    public rn(zn znVar) {
        this.h = znVar;
    }

    @Override
    public final boolean a() {
        if (this.h.f40727r3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        zn znVar;
        zn znVar2 = this.h;
        if (!znVar2.f40812xc.f46961f) {
            if (znVar2.f40727r3 != null && znVar2.f40662m1 != null) {
                View currentView = znVar2.f40675n1.getCurrentView();
                if (currentView instanceof bo) {
                    znVar = ((bo) currentView).f32924a;
                } else {
                    znVar = znVar2;
                }
                if (!znVar.f40784vc.f46961f) {
                    znVar.Lb(true);
                    return false;
                }
                int currentPosition = znVar2.f40662m1.f27619a.getCurrentPosition();
                int i10 = znVar2.f40687o1;
                if (currentPosition != i10) {
                    znVar2.f40662m1.f27619a.d(i10, i10);
                    return false;
                }
            } else if (znVar2.f40784vc.f46961f) {
                znVar2.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.h.f40640k3;
    }

    @Override
    public final void k() {
        int i10;
        zn znVar = this.h;
        znVar.L7();
        if (znVar.f40652l3 == null && znVar.f40664m3 == null) {
            if (znVar.f40640k3) {
                znVar.F1.getAdapter().U(null, 0, null, false, true);
                znVar.f40640k3 = false;
                znVar.f40588g0.H("", true);
            }
            org.telegram.ui.ActionBar.w0 w0Var = znVar.f40588g0;
            if (znVar.E9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var.setSearchFieldHint(LocaleController.getString(i10));
            znVar.P2.setVisibility(0);
            ImageView imageView = znVar.Q2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            znVar.f40652l3 = null;
            znVar.f40664m3 = null;
            return;
        }
        ImageView imageView2 = znVar.Q2;
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
        zn znVar = this.h;
        znVar.f40701p3 = false;
        znVar.vc();
        znVar.Ic();
        ImageView imageView = znVar.P2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = znVar.Q2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (znVar.f40640k3) {
            znVar.F1.getAdapter().U(null, 0, null, false, true);
            znVar.f40640k3 = false;
        }
        znVar.F1.setReversed(false);
        znVar.F1.getAdapter().f44908h0 = false;
        znVar.m7();
        znVar.f40652l3 = null;
        znVar.f40664m3 = null;
        znVar.f40727r3 = null;
        org.telegram.ui.ActionBar.w0 w0Var = znVar.f40588g0;
        if (znVar.E9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        w0Var.setSearchFieldHint(LocaleController.getString(i10));
        znVar.f40588g0.setSearchFieldCaption(null);
        znVar.f40798wc.a(false, true);
        znVar.f40812xc.a(false, true);
        org.telegram.ui.ActionBar.y yVar = znVar.f40576f0;
        if (yVar != null && yVar.f20719o != null) {
            org.telegram.ui.ActionBar.w0 w0Var2 = znVar.f40563e0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = znVar.f40576f0;
            if (yVar2 != null) {
                yVar2.f(0);
                zn.J3(znVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = znVar.f40524b0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            es esVar = znVar.f40511a0;
            if (esVar != null) {
                esVar.b(false);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = znVar.f40625j0;
            if (w0Var3 != null && znVar.H9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = znVar.f40637k0;
            if (yVar4 != null && znVar.I9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = znVar.f40601h0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
        } else if (znVar.V.k0() && TextUtils.isEmpty(znVar.V.getSlowModeTimer()) && ((chat = znVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.w0 w0Var5 = znVar.f40563e0;
            if (w0Var5 != null) {
                w0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = znVar.f40576f0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = znVar.f40524b0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            es esVar2 = znVar.f40511a0;
            if (esVar2 != null) {
                esVar2.b(true);
            }
            org.telegram.ui.ActionBar.w0 w0Var6 = znVar.f40625j0;
            if (w0Var6 != null && znVar.H9) {
                w0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = znVar.f40637k0;
            if (yVar7 != null && znVar.I9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var7 = znVar.f40601h0;
            if (w0Var7 != null) {
                w0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.w0 w0Var8 = znVar.f40563e0;
            if (w0Var8 != null) {
                w0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = znVar.f40637k0;
            if (yVar8 != null && znVar.I9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var9 = znVar.f40601h0;
            if (w0Var9 != null) {
                w0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var10 = znVar.f40625j0;
            if (w0Var10 != null && znVar.H9) {
                w0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = znVar.f40576f0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = znVar.f40524b0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            es esVar3 = znVar.f40511a0;
            if (esVar3 != null) {
                esVar3.b(false);
            }
        }
        if (znVar.f40675n1 != null) {
            if (znVar.f40662m1.f27619a.getCurrentPosition() != 0) {
                znVar.f40662m1.f27619a.d(0, 0);
                znVar.f40699p1 = true;
            } else {
                znVar.f40675n1.h.clear();
            }
        }
        int i13 = znVar.O3;
        if (i13 == 3 || i13 == 8 || ((znVar.f40514a4 == 0 && !UserObject.isReplyUser(znVar.f40575f)) || ((messageObject = znVar.U3) != null && messageObject.getRepliesCount() < 10))) {
            znVar.f40588g0.setVisibility(8);
        }
        znVar.f40650l0 = false;
        znVar.getMediaDataController().clearFoundMessageObjects();
        if (znVar.L3 == 3) {
            i12 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        tf.y0 y0Var = znVar.J3;
        if (y0Var != null) {
            y0Var.l();
        }
        znVar.Ia();
        znVar.hc(false);
        znVar.yc(0, true);
        znVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37898f, 0.0f);
        ofFloat.addUpdateListener(new qn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.mr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        znVar.f40784vc.a(false, true);
        znVar.Hc();
        znVar.f40677n3 = null;
        znVar.Ic();
        znVar.vc();
        xk xkVar = znVar.l1;
        if (xkVar != null) {
            xkVar.d.M(new hr(2));
            xkVar.h = 0L;
            znVar.l1.g(false);
        }
        jk jkVar = znVar.f40662m1;
        if (jkVar != null) {
            jkVar.b(false);
        }
        znVar.kb(false);
    }

    @Override
    public final void n() {
        jk jkVar;
        int i10;
        zn znVar = this.h;
        boolean z4 = true;
        znVar.f40701p3 = true;
        znVar.vc();
        znVar.Ic();
        if (((znVar.f40514a4 != 0 && znVar.O3 != 3) || UserObject.isReplyUser(znVar.f40575f)) && !znVar.f40522ac) {
            znVar.la(null);
        }
        if (znVar.T4) {
            znVar.saveKeyboardPositionBeforeTransition();
            if (!znVar.La) {
                Activity parentActivity = znVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new bj(this, 9), 500L);
            gj gjVar = znVar.f40552d2;
            if (gjVar != null) {
                gjVar.b(true);
            }
            org.telegram.ui.Components.l40 l40Var = znVar.f40578f2;
            if (l40Var != null) {
                l40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37898f, 1.0f);
        ofFloat.addUpdateListener(new qn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.mr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        xk xkVar = znVar.l1;
        if (xkVar != null) {
            xkVar.g((!znVar.La && xkVar.a() && znVar.f40727r3 == null) ? false : false);
        }
        if (znVar.f40727r3 != null && (jkVar = znVar.f40662m1) != null) {
            int currentPosition = jkVar.f27619a.getCurrentPosition();
            int i11 = znVar.f40687o1;
            if (currentPosition != i11) {
                znVar.f40662m1.f27619a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(tf.e0 e0Var) {
        zn znVar = this.h;
        xk xkVar = znVar.l1;
        if (xkVar != null) {
            xkVar.d.M(new hr(2));
            xkVar.h = 0L;
        }
        znVar.f40677n3 = null;
        znVar.Ic();
        znVar.vc();
        znVar.kb(false);
    }

    @Override
    public final void p(kg.f fVar) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var;
        zn znVar = this.h;
        boolean z4 = false;
        znVar.Fc(0, 0, -1);
        if (fVar != null) {
            str = fVar.getText().toString();
        } else {
            str = znVar.f40714q3;
        }
        znVar.f40714q3 = str;
        if (!TextUtils.isEmpty(str) && (znVar.f40714q3.startsWith("$") || znVar.f40714q3.startsWith("#"))) {
            znVar.M7();
            if (znVar.f40714q3.contains("@")) {
                String str2 = znVar.f40714q3;
                f6Var = ((org.telegram.ui.ActionBar.p2) znVar).resourceProvider;
                znVar.presentFragment(new org.telegram.ui.Components.e40(str2, f6Var));
                return;
            }
            if (znVar.f40727r3 == null) {
                znVar.f40727r3 = znVar.f40714q3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37898f, 1.0f);
                ofFloat.addUpdateListener(new qn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.mr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                xk xkVar = znVar.l1;
                if (xkVar != null) {
                    if (!znVar.La && xkVar.a() && znVar.f40727r3 == null) {
                        z4 = true;
                    }
                    xkVar.g(z4);
                }
            }
            znVar.f40727r3 = znVar.f40714q3;
            znVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(znVar.f40727r3);
            znVar.f40712q1.f25041f.N(true);
            View currentView = znVar.f40675n1.getCurrentView();
            if (znVar.L3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof bo) {
                ((bo) currentView).f32924a.Jc(znVar.f40727r3);
            }
            znVar.Hc();
            znVar.a2.e(true, true);
            znVar.Lb(true);
            z4 = true;
        } else {
            znVar.f40727r3 = null;
            jk jkVar = znVar.f40662m1;
            if (jkVar != null) {
                jkVar.b(false);
                znVar.Hc();
            }
            jk jkVar2 = znVar.f40662m1;
            if (jkVar2 != null && jkVar2.f27619a.getCurrentPosition() != 0) {
                znVar.f40662m1.f27619a.d(0, 0);
            }
        }
        jk jkVar3 = znVar.f40662m1;
        if (jkVar3 != null) {
            jkVar3.b(z4);
        }
        MediaDataController mediaDataController = znVar.getMediaDataController();
        String str3 = znVar.f40714q3;
        long j10 = znVar.Q5;
        long j11 = znVar.I6;
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j10, j11, i10, 0, znVar.f40514a4, znVar.f40652l3, znVar.f40664m3, znVar.f40677n3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z4;
        zn znVar = this.h;
        xd.a aVar = znVar.f40812xc;
        if (znVar.f40727r3 == null) {
            znVar.Lb(false);
        }
        znVar.L7();
        if (znVar.f40640k3) {
            tf.u0 adapter = znVar.F1.getAdapter();
            adapter.U("@" + editText.getText().toString(), 0, znVar.f40730r6, true, true);
        } else if (znVar.f40652l3 == null && znVar.f40664m3 == null && znVar.Q2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            znVar.Q2.callOnClick();
        }
        if (znVar.f40727r3 != null) {
            if (editText.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 != aVar.f46961f) {
                if (z4) {
                    znVar.M7();
                }
                aVar.a(z4, true);
                gk gkVar = znVar.f40675n1;
                if (gkVar != null) {
                    gkVar.D(0);
                }
                if (z4) {
                    znVar.Lb(true);
                }
                znVar.hc(false);
            }
        }
    }

    @Override
    public final boolean r() {
        if (this.h.f40727r3 == null) {
            return true;
        }
        return false;
    }
}
