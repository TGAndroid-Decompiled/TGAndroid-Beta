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
public final class rn extends org.telegram.ui.ActionBar.e5 {
    public float f41477f;
    public final zn h;

    public rn(zn znVar) {
        this.h = znVar;
    }

    @Override
    public final boolean a() {
        if (this.h.f44952u3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        zn znVar;
        zn znVar2 = this.h;
        if (!znVar2.Ac.f16366f) {
            if (znVar2.f44952u3 != null && znVar2.f44886p1 != null) {
                View currentView = znVar2.f44898q1.getCurrentView();
                if (currentView instanceof bo) {
                    znVar = ((bo) currentView).f36419a;
                } else {
                    znVar = znVar2;
                }
                if (!znVar.yc.f16366f) {
                    znVar.Pb(true);
                    return false;
                }
                int currentPosition = znVar2.f44886p1.f27716a.getCurrentPosition();
                int i10 = znVar2.f44911r1;
                if (currentPosition != i10) {
                    znVar2.f44886p1.f27716a.d(i10, i10);
                    return false;
                }
            } else if (znVar2.yc.f16366f) {
                znVar2.Pb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.h.f44865n3;
    }

    @Override
    public final void k() {
        int i10;
        zn znVar = this.h;
        znVar.O7();
        if (znVar.f44876o3 == null && znVar.f44888p3 == null) {
            if (znVar.f44865n3) {
                znVar.I1.getAdapter().U(null, 0, null, false, true);
                znVar.f44865n3 = false;
                znVar.f44813j0.H("", true);
            }
            org.telegram.ui.ActionBar.u0 u0Var = znVar.f44813j0;
            if (znVar.J9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var.setSearchFieldHint(LocaleController.getString(i10));
            znVar.S2.setVisibility(0);
            ImageView imageView = znVar.T2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            znVar.f44876o3 = null;
            znVar.f44888p3 = null;
            return;
        }
        ImageView imageView2 = znVar.T2;
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
        znVar.f44927s3 = false;
        znVar.zc();
        znVar.Mc();
        ImageView imageView = znVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = znVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (znVar.f44865n3) {
            znVar.I1.getAdapter().U(null, 0, null, false, true);
            znVar.f44865n3 = false;
        }
        znVar.I1.setReversed(false);
        znVar.I1.getAdapter().f10678k0 = false;
        znVar.p7();
        znVar.f44876o3 = null;
        znVar.f44888p3 = null;
        znVar.f44952u3 = null;
        org.telegram.ui.ActionBar.u0 u0Var = znVar.f44813j0;
        if (znVar.J9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        u0Var.setSearchFieldHint(LocaleController.getString(i10));
        znVar.f44813j0.setSearchFieldCaption(null);
        znVar.f45025zc.a(false, true);
        znVar.Ac.a(false, true);
        org.telegram.ui.ActionBar.x xVar = znVar.f44800i0;
        if (xVar != null && xVar.f21668o != null) {
            org.telegram.ui.ActionBar.u0 u0Var2 = znVar.f44788h0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = znVar.f44800i0;
            if (xVar2 != null) {
                xVar2.f(0);
                zn.S3(znVar);
            }
            org.telegram.ui.ActionBar.x xVar3 = znVar.f44753e0;
            if (xVar3 != null) {
                xVar3.f(8);
            }
            es esVar = znVar.f44739d0;
            if (esVar != null) {
                esVar.b(false);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = znVar.m0;
            if (u0Var3 != null && znVar.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar4 = znVar.f44862n0;
            if (xVar4 != null && znVar.L9) {
                xVar4.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = znVar.f44825k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
        } else if (znVar.Y.i0() && TextUtils.isEmpty(znVar.Y.getSlowModeTimer()) && ((chat = znVar.f44752e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.u0 u0Var5 = znVar.f44788h0;
            if (u0Var5 != null) {
                u0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar5 = znVar.f44800i0;
            if (xVar5 != null) {
                xVar5.f(8);
            }
            org.telegram.ui.ActionBar.x xVar6 = znVar.f44753e0;
            if (xVar6 != null) {
                xVar6.f(0);
            }
            es esVar2 = znVar.f44739d0;
            if (esVar2 != null) {
                esVar2.b(true);
            }
            org.telegram.ui.ActionBar.u0 u0Var6 = znVar.m0;
            if (u0Var6 != null && znVar.K9) {
                u0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar7 = znVar.f44862n0;
            if (xVar7 != null && znVar.L9) {
                xVar7.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var7 = znVar.f44825k0;
            if (u0Var7 != null) {
                u0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.u0 u0Var8 = znVar.f44788h0;
            if (u0Var8 != null) {
                u0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar8 = znVar.f44862n0;
            if (xVar8 != null && znVar.L9) {
                xVar8.f(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var9 = znVar.f44825k0;
            if (u0Var9 != null) {
                u0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var10 = znVar.m0;
            if (u0Var10 != null && znVar.K9) {
                u0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar9 = znVar.f44800i0;
            if (xVar9 != null) {
                xVar9.f(8);
            }
            org.telegram.ui.ActionBar.x xVar10 = znVar.f44753e0;
            if (xVar10 != null) {
                xVar10.f(8);
            }
            es esVar3 = znVar.f44739d0;
            if (esVar3 != null) {
                esVar3.b(false);
            }
        }
        if (znVar.f44898q1 != null) {
            if (znVar.f44886p1.f27716a.getCurrentPosition() != 0) {
                znVar.f44886p1.f27716a.d(0, 0);
                znVar.f44925s1 = true;
            } else {
                znVar.f44898q1.h.clear();
            }
        }
        int i13 = znVar.R3;
        if (i13 == 3 || i13 == 8 || ((znVar.f44743d4 == 0 && !UserObject.isReplyUser(znVar.f44764f)) || ((messageObject = znVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            znVar.f44813j0.setVisibility(8);
        }
        znVar.f44873o0 = false;
        znVar.getMediaDataController().clearFoundMessageObjects();
        if (znVar.O3 == 3) {
            i12 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        gg.n1 n1Var = znVar.M3;
        if (n1Var != null) {
            n1Var.l();
        }
        znVar.Ma();
        znVar.lc(false);
        znVar.Cc(0, true);
        znVar.ad(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41477f, 0.0f);
        ofFloat.addUpdateListener(new qn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.is.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        znVar.yc.a(false, true);
        znVar.Lc();
        znVar.f44900q3 = null;
        znVar.Mc();
        znVar.zc();
        zk zkVar = znVar.f44874o1;
        if (zkVar != null) {
            zkVar.d.M(new ir(2));
            zkVar.h = 0L;
            znVar.f44874o1.g(false);
        }
        lk lkVar = znVar.f44886p1;
        if (lkVar != null) {
            lkVar.b(false);
        }
        znVar.ob(false);
    }

    @Override
    public final void n() {
        lk lkVar;
        int i10;
        zn znVar = this.h;
        boolean z10 = true;
        znVar.f44927s3 = true;
        znVar.zc();
        znVar.Mc();
        if (((znVar.f44743d4 != 0 && znVar.R3 != 3) || UserObject.isReplyUser(znVar.f44764f)) && !znVar.f44751dc) {
            znVar.qa(null);
        }
        if (znVar.W4) {
            znVar.saveKeyboardPositionBeforeTransition();
            if (!znVar.Pa) {
                Activity parentActivity = znVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) znVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new cj(this, 10), 500L);
            jj jjVar = znVar.f44779g2;
            if (jjVar != null) {
                jjVar.b(true);
            }
            org.telegram.ui.Components.a50 a50Var = znVar.f44802i2;
            if (a50Var != null) {
                a50Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41477f, 1.0f);
        ofFloat.addUpdateListener(new qn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.is.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        zk zkVar = znVar.f44874o1;
        if (zkVar != null) {
            if (znVar.Pa || !zkVar.a() || znVar.f44952u3 != null) {
                z10 = false;
            }
            zkVar.g(z10);
        }
        if (znVar.f44952u3 != null && (lkVar = znVar.f44886p1) != null) {
            int currentPosition = lkVar.f27716a.getCurrentPosition();
            int i11 = znVar.f44911r1;
            if (currentPosition != i11) {
                znVar.f44886p1.f27716a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(gg.p0 p0Var) {
        zn znVar = this.h;
        zk zkVar = znVar.f44874o1;
        if (zkVar != null) {
            zkVar.d.M(new ir(2));
            zkVar.h = 0L;
        }
        znVar.f44900q3 = null;
        znVar.Mc();
        znVar.zc();
        znVar.ob(false);
    }

    @Override
    public final void p(ci.g2 g2Var) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.d6 d6Var;
        zn znVar = this.h;
        boolean z10 = false;
        znVar.Jc(0, 0, -1);
        if (g2Var != null) {
            str = g2Var.getText().toString();
        } else {
            str = znVar.f44940t3;
        }
        znVar.f44940t3 = str;
        if (!TextUtils.isEmpty(str) && (znVar.f44940t3.startsWith("$") || znVar.f44940t3.startsWith("#"))) {
            znVar.P7();
            if (znVar.f44940t3.contains("@")) {
                String str2 = znVar.f44940t3;
                d6Var = ((org.telegram.ui.ActionBar.m2) znVar).resourceProvider;
                znVar.presentFragment(new org.telegram.ui.Components.t40(str2, d6Var));
                return;
            }
            if (znVar.f44952u3 == null) {
                znVar.f44952u3 = znVar.f44940t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41477f, 1.0f);
                ofFloat.addUpdateListener(new qn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.is.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                zk zkVar = znVar.f44874o1;
                if (zkVar != null) {
                    if (!znVar.Pa && zkVar.a() && znVar.f44952u3 == null) {
                        z10 = true;
                    }
                    zkVar.g(z10);
                }
            }
            znVar.f44952u3 = znVar.f44940t3;
            znVar.U6(true);
            i11 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(znVar.f44952u3);
            znVar.f44938t1.f31676f.N(true);
            View currentView = znVar.f44898q1.getCurrentView();
            if (znVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof bo) {
                ((bo) currentView).f36419a.Nc(znVar.f44952u3);
            }
            znVar.Lc();
            znVar.f44741d2.e(true, true);
            znVar.Pb(true);
            z10 = true;
        } else {
            znVar.f44952u3 = null;
            lk lkVar = znVar.f44886p1;
            if (lkVar != null) {
                lkVar.b(false);
                znVar.Lc();
            }
            lk lkVar2 = znVar.f44886p1;
            if (lkVar2 != null && lkVar2.f27716a.getCurrentPosition() != 0) {
                znVar.f44886p1.f27716a.d(0, 0);
            }
        }
        lk lkVar3 = znVar.f44886p1;
        if (lkVar3 != null) {
            lkVar3.b(z10);
        }
        MediaDataController mediaDataController = znVar.getMediaDataController();
        String str3 = znVar.f44940t3;
        long j3 = znVar.T5;
        long j10 = znVar.L6;
        i10 = ((org.telegram.ui.ActionBar.m2) znVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j3, j10, i10, 0, znVar.f44743d4, znVar.f44876o3, znVar.f44888p3, znVar.f44900q3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        zn znVar = this.h;
        me.b bVar = znVar.Ac;
        if (znVar.f44952u3 == null) {
            znVar.Pb(false);
        }
        znVar.O7();
        if (znVar.f44865n3) {
            znVar.I1.getAdapter().U("@" + editText.getText().toString(), 0, znVar.f44955u6, true, true);
        } else if (znVar.f44876o3 == null && znVar.f44888p3 == null && znVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            znVar.T2.callOnClick();
        }
        if (znVar.f44952u3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != bVar.f16366f) {
                if (z10) {
                    znVar.P7();
                }
                bVar.a(z10, true);
                ci.h1 h1Var = znVar.f44898q1;
                if (h1Var != null) {
                    h1Var.D(0);
                }
                if (z10) {
                    znVar.Pb(true);
                }
                znVar.lc(false);
            }
        }
    }

    @Override
    public final boolean r() {
        if (this.h.f44952u3 == null) {
            return true;
        }
        return false;
    }
}
