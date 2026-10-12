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
public final class vn extends org.telegram.ui.ActionBar.e5 {
    public float f42817f;
    public final eo h;

    public vn(eo eoVar) {
        this.h = eoVar;
    }

    @Override
    public final boolean a() {
        if (this.h.f37446u3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        eo eoVar;
        eo eoVar2 = this.h;
        if (!eoVar2.Ac.f16089f) {
            if (eoVar2.f37446u3 != null && eoVar2.f37380p1 != null) {
                View currentView = eoVar2.f37392q1.getCurrentView();
                if (currentView instanceof go) {
                    eoVar = ((go) currentView).f38109a;
                } else {
                    eoVar = eoVar2;
                }
                if (!eoVar.yc.f16089f) {
                    eoVar.Pb(true);
                    return false;
                }
                int currentPosition = eoVar2.f37380p1.f28245a.getCurrentPosition();
                int i10 = eoVar2.f37405r1;
                if (currentPosition != i10) {
                    eoVar2.f37380p1.f28245a.d(i10, i10);
                    return false;
                }
            } else if (eoVar2.yc.f16089f) {
                eoVar2.Pb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.h.f37359n3;
    }

    @Override
    public final void k() {
        int i10;
        eo eoVar = this.h;
        eoVar.O7();
        if (eoVar.f37370o3 == null && eoVar.f37382p3 == null) {
            if (eoVar.f37359n3) {
                eoVar.I1.getAdapter().U(null, 0, null, false, true);
                eoVar.f37359n3 = false;
                eoVar.f37307j0.H("", true);
            }
            org.telegram.ui.ActionBar.u0 u0Var = eoVar.f37307j0;
            if (eoVar.J9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var.setSearchFieldHint(LocaleController.getString(i10));
            eoVar.S2.setVisibility(0);
            ImageView imageView = eoVar.T2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            eoVar.f37370o3 = null;
            eoVar.f37382p3 = null;
            return;
        }
        ImageView imageView2 = eoVar.T2;
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
        eo eoVar = this.h;
        eoVar.f37421s3 = false;
        eoVar.zc();
        eoVar.Mc();
        ImageView imageView = eoVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = eoVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (eoVar.f37359n3) {
            eoVar.I1.getAdapter().U(null, 0, null, false, true);
            eoVar.f37359n3 = false;
        }
        eoVar.I1.setReversed(false);
        eoVar.I1.getAdapter().f10677k0 = false;
        eoVar.p7();
        eoVar.f37370o3 = null;
        eoVar.f37382p3 = null;
        eoVar.f37446u3 = null;
        org.telegram.ui.ActionBar.u0 u0Var = eoVar.f37307j0;
        if (eoVar.J9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        u0Var.setSearchFieldHint(LocaleController.getString(i10));
        eoVar.f37307j0.setSearchFieldCaption(null);
        eoVar.f37519zc.a(false, true);
        eoVar.Ac.a(false, true);
        org.telegram.ui.ActionBar.x xVar = eoVar.f37294i0;
        if (xVar != null && xVar.f21443o != null) {
            org.telegram.ui.ActionBar.u0 u0Var2 = eoVar.f37282h0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = eoVar.f37294i0;
            if (xVar2 != null) {
                xVar2.f(0);
                eo.S3(eoVar);
            }
            org.telegram.ui.ActionBar.x xVar3 = eoVar.f37247e0;
            if (xVar3 != null) {
                xVar3.f(8);
            }
            is isVar = eoVar.f37233d0;
            if (isVar != null) {
                isVar.b(false);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = eoVar.m0;
            if (u0Var3 != null && eoVar.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar4 = eoVar.f37356n0;
            if (xVar4 != null && eoVar.L9) {
                xVar4.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = eoVar.f37319k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
        } else if (eoVar.Y.l0() && TextUtils.isEmpty(eoVar.Y.getSlowModeTimer()) && ((chat = eoVar.f37246e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.u0 u0Var5 = eoVar.f37282h0;
            if (u0Var5 != null) {
                u0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar5 = eoVar.f37294i0;
            if (xVar5 != null) {
                xVar5.f(8);
            }
            org.telegram.ui.ActionBar.x xVar6 = eoVar.f37247e0;
            if (xVar6 != null) {
                xVar6.f(0);
            }
            is isVar2 = eoVar.f37233d0;
            if (isVar2 != null) {
                isVar2.b(true);
            }
            org.telegram.ui.ActionBar.u0 u0Var6 = eoVar.m0;
            if (u0Var6 != null && eoVar.K9) {
                u0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar7 = eoVar.f37356n0;
            if (xVar7 != null && eoVar.L9) {
                xVar7.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var7 = eoVar.f37319k0;
            if (u0Var7 != null) {
                u0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.u0 u0Var8 = eoVar.f37282h0;
            if (u0Var8 != null) {
                u0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar8 = eoVar.f37356n0;
            if (xVar8 != null && eoVar.L9) {
                xVar8.f(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var9 = eoVar.f37319k0;
            if (u0Var9 != null) {
                u0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var10 = eoVar.m0;
            if (u0Var10 != null && eoVar.K9) {
                u0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar9 = eoVar.f37294i0;
            if (xVar9 != null) {
                xVar9.f(8);
            }
            org.telegram.ui.ActionBar.x xVar10 = eoVar.f37247e0;
            if (xVar10 != null) {
                xVar10.f(8);
            }
            is isVar3 = eoVar.f37233d0;
            if (isVar3 != null) {
                isVar3.b(false);
            }
        }
        if (eoVar.f37392q1 != null) {
            if (eoVar.f37380p1.f28245a.getCurrentPosition() != 0) {
                eoVar.f37380p1.f28245a.d(0, 0);
                eoVar.f37419s1 = true;
            } else {
                eoVar.f37392q1.h.clear();
            }
        }
        int i13 = eoVar.R3;
        if (i13 == 3 || i13 == 8 || ((eoVar.f37237d4 == 0 && !UserObject.isReplyUser(eoVar.f37258f)) || ((messageObject = eoVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            eoVar.f37307j0.setVisibility(8);
        }
        eoVar.f37367o0 = false;
        eoVar.getMediaDataController().clearFoundMessageObjects();
        if (eoVar.O3 == 3) {
            i12 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        gg.n1 n1Var = eoVar.M3;
        if (n1Var != null) {
            n1Var.l();
        }
        eoVar.Ma();
        eoVar.lc(false);
        eoVar.Cc(0, true);
        eoVar.ad(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42817f, 0.0f);
        ofFloat.addUpdateListener(new un(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.js.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        eoVar.yc.a(false, true);
        eoVar.Lc();
        eoVar.f37394q3 = null;
        eoVar.Mc();
        eoVar.zc();
        dl dlVar = eoVar.f37368o1;
        if (dlVar != null) {
            dlVar.d.M(new lr(2));
            dlVar.h = 0L;
            eoVar.f37368o1.g(false);
        }
        pk pkVar = eoVar.f37380p1;
        if (pkVar != null) {
            pkVar.b(false);
        }
        eoVar.ob(false);
    }

    @Override
    public final void n() {
        pk pkVar;
        int i10;
        eo eoVar = this.h;
        boolean z10 = true;
        eoVar.f37421s3 = true;
        eoVar.zc();
        eoVar.Mc();
        if (((eoVar.f37237d4 != 0 && eoVar.R3 != 3) || UserObject.isReplyUser(eoVar.f37258f)) && !eoVar.f37245dc) {
            eoVar.qa(null);
        }
        if (eoVar.W4) {
            eoVar.saveKeyboardPositionBeforeTransition();
            if (!eoVar.Pa) {
                Activity parentActivity = eoVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) eoVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new gj(this, 10), 500L);
            nj njVar = eoVar.f37273g2;
            if (njVar != null) {
                njVar.b(true);
            }
            org.telegram.ui.Components.c50 c50Var = eoVar.f37296i2;
            if (c50Var != null) {
                c50Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42817f, 1.0f);
        ofFloat.addUpdateListener(new un(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.js.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        dl dlVar = eoVar.f37368o1;
        if (dlVar != null) {
            if (eoVar.Pa || !dlVar.a() || eoVar.f37446u3 != null) {
                z10 = false;
            }
            dlVar.g(z10);
        }
        if (eoVar.f37446u3 != null && (pkVar = eoVar.f37380p1) != null) {
            int currentPosition = pkVar.f28245a.getCurrentPosition();
            int i11 = eoVar.f37405r1;
            if (currentPosition != i11) {
                eoVar.f37380p1.f28245a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(gg.p0 p0Var) {
        eo eoVar = this.h;
        dl dlVar = eoVar.f37368o1;
        if (dlVar != null) {
            dlVar.d.M(new lr(2));
            dlVar.h = 0L;
        }
        eoVar.f37394q3 = null;
        eoVar.Mc();
        eoVar.zc();
        eoVar.ob(false);
    }

    @Override
    public final void p(ci.g2 g2Var) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.c6 c6Var;
        eo eoVar = this.h;
        boolean z10 = false;
        eoVar.Jc(0, 0, -1);
        if (g2Var != null) {
            str = g2Var.getText().toString();
        } else {
            str = eoVar.f37434t3;
        }
        eoVar.f37434t3 = str;
        if (!TextUtils.isEmpty(str) && (eoVar.f37434t3.startsWith("$") || eoVar.f37434t3.startsWith("#"))) {
            eoVar.P7();
            if (eoVar.f37434t3.contains("@")) {
                String str2 = eoVar.f37434t3;
                c6Var = ((org.telegram.ui.ActionBar.m2) eoVar).resourceProvider;
                eoVar.presentFragment(new org.telegram.ui.Components.v40(str2, c6Var));
                return;
            }
            if (eoVar.f37446u3 == null) {
                eoVar.f37446u3 = eoVar.f37434t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42817f, 1.0f);
                ofFloat.addUpdateListener(new un(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.js.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                dl dlVar = eoVar.f37368o1;
                if (dlVar != null) {
                    if (!eoVar.Pa && dlVar.a() && eoVar.f37446u3 == null) {
                        z10 = true;
                    }
                    dlVar.g(z10);
                }
            }
            eoVar.f37446u3 = eoVar.f37434t3;
            eoVar.U6(true);
            i11 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(eoVar.f37446u3);
            eoVar.f37432t1.f32648f.N(true);
            View currentView = eoVar.f37392q1.getCurrentView();
            if (eoVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof go) {
                ((go) currentView).f38109a.Nc(eoVar.f37446u3);
            }
            eoVar.Lc();
            eoVar.f37235d2.e(true, true);
            eoVar.Pb(true);
            z10 = true;
        } else {
            eoVar.f37446u3 = null;
            pk pkVar = eoVar.f37380p1;
            if (pkVar != null) {
                pkVar.b(false);
                eoVar.Lc();
            }
            pk pkVar2 = eoVar.f37380p1;
            if (pkVar2 != null && pkVar2.f28245a.getCurrentPosition() != 0) {
                eoVar.f37380p1.f28245a.d(0, 0);
            }
        }
        pk pkVar3 = eoVar.f37380p1;
        if (pkVar3 != null) {
            pkVar3.b(z10);
        }
        MediaDataController mediaDataController = eoVar.getMediaDataController();
        String str3 = eoVar.f37434t3;
        long j3 = eoVar.T5;
        long j10 = eoVar.L6;
        i10 = ((org.telegram.ui.ActionBar.m2) eoVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j3, j10, i10, 0, eoVar.f37237d4, eoVar.f37370o3, eoVar.f37382p3, eoVar.f37394q3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        eo eoVar = this.h;
        me.b bVar = eoVar.Ac;
        if (eoVar.f37446u3 == null) {
            eoVar.Pb(false);
        }
        eoVar.O7();
        if (eoVar.f37359n3) {
            eoVar.I1.getAdapter().U("@" + editText.getText().toString(), 0, eoVar.f37449u6, true, true);
        } else if (eoVar.f37370o3 == null && eoVar.f37382p3 == null && eoVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            eoVar.T2.callOnClick();
        }
        if (eoVar.f37446u3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != bVar.f16089f) {
                if (z10) {
                    eoVar.P7();
                }
                bVar.a(z10, true);
                ci.h1 h1Var = eoVar.f37392q1;
                if (h1Var != null) {
                    h1Var.D(0);
                }
                if (z10) {
                    eoVar.Pb(true);
                }
                eoVar.lc(false);
            }
        }
    }

    @Override
    public final boolean r() {
        if (this.h.f37446u3 == null) {
            return true;
        }
        return false;
    }
}
