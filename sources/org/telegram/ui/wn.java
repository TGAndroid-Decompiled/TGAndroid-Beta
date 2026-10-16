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
public final class wn extends org.telegram.ui.ActionBar.e5 {
    public float f41327f;
    public final fo h;

    public wn(fo foVar) {
        this.h = foVar;
    }

    @Override
    public final boolean a() {
        if (this.h.f35825u3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        fo foVar;
        fo foVar2 = this.h;
        if (!foVar2.Ac.f16004f) {
            if (foVar2.f35825u3 != null && foVar2.f35759p1 != null) {
                View currentView = foVar2.f35770q1.getCurrentView();
                if (currentView instanceof ho) {
                    foVar = ((ho) currentView).f36617a;
                } else {
                    foVar = foVar2;
                }
                if (!foVar.yc.f16004f) {
                    foVar.Pb(true);
                    return false;
                }
                int currentPosition = foVar2.f35759p1.f25060a.getCurrentPosition();
                int i10 = foVar2.f35783r1;
                if (currentPosition != i10) {
                    foVar2.f35759p1.f25060a.d(i10, i10);
                    return false;
                }
            } else if (foVar2.yc.f16004f) {
                foVar2.Pb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.h.f35737n3;
    }

    @Override
    public final void k() {
        int i10;
        fo foVar = this.h;
        foVar.O7();
        if (foVar.f35750o3 == null && foVar.f35761p3 == null) {
            if (foVar.f35737n3) {
                foVar.I1.getAdapter().U(null, 0, null, false, true);
                foVar.f35737n3 = false;
                foVar.f35684j0.H("", true);
            }
            org.telegram.ui.ActionBar.u0 u0Var = foVar.f35684j0;
            if (foVar.J9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var.setSearchFieldHint(LocaleController.getString(i10));
            foVar.S2.setVisibility(0);
            ImageView imageView = foVar.T2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            foVar.f35750o3 = null;
            foVar.f35761p3 = null;
            return;
        }
        ImageView imageView2 = foVar.T2;
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
        fo foVar = this.h;
        foVar.f35799s3 = false;
        foVar.zc();
        foVar.Mc();
        ImageView imageView = foVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = foVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (foVar.f35737n3) {
            foVar.I1.getAdapter().U(null, 0, null, false, true);
            foVar.f35737n3 = false;
        }
        foVar.I1.setReversed(false);
        foVar.I1.getAdapter().f10627k0 = false;
        foVar.p7();
        foVar.f35750o3 = null;
        foVar.f35761p3 = null;
        foVar.f35825u3 = null;
        org.telegram.ui.ActionBar.u0 u0Var = foVar.f35684j0;
        if (foVar.J9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        u0Var.setSearchFieldHint(LocaleController.getString(i10));
        foVar.f35684j0.setSearchFieldCaption(null);
        foVar.zc.a(false, true);
        foVar.Ac.a(false, true);
        org.telegram.ui.ActionBar.x xVar = foVar.f35672i0;
        if (xVar != null && xVar.f20501o != null) {
            org.telegram.ui.ActionBar.u0 u0Var2 = foVar.f35661h0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = foVar.f35672i0;
            if (xVar2 != null) {
                xVar2.f(0);
                fo.S3(foVar);
            }
            org.telegram.ui.ActionBar.x xVar3 = foVar.f35624e0;
            if (xVar3 != null) {
                xVar3.f(8);
            }
            ls lsVar = foVar.f35612d0;
            if (lsVar != null) {
                lsVar.b(false);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = foVar.m0;
            if (u0Var3 != null && foVar.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar4 = foVar.f35734n0;
            if (xVar4 != null && foVar.L9) {
                xVar4.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = foVar.f35697k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
        } else if (foVar.Y.i0() && TextUtils.isEmpty(foVar.Y.getSlowModeTimer()) && ((chat = foVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.u0 u0Var5 = foVar.f35661h0;
            if (u0Var5 != null) {
                u0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar5 = foVar.f35672i0;
            if (xVar5 != null) {
                xVar5.f(8);
            }
            org.telegram.ui.ActionBar.x xVar6 = foVar.f35624e0;
            if (xVar6 != null) {
                xVar6.f(0);
            }
            ls lsVar2 = foVar.f35612d0;
            if (lsVar2 != null) {
                lsVar2.b(true);
            }
            org.telegram.ui.ActionBar.u0 u0Var6 = foVar.m0;
            if (u0Var6 != null && foVar.K9) {
                u0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar7 = foVar.f35734n0;
            if (xVar7 != null && foVar.L9) {
                xVar7.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var7 = foVar.f35697k0;
            if (u0Var7 != null) {
                u0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.u0 u0Var8 = foVar.f35661h0;
            if (u0Var8 != null) {
                u0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar8 = foVar.f35734n0;
            if (xVar8 != null && foVar.L9) {
                xVar8.f(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var9 = foVar.f35697k0;
            if (u0Var9 != null) {
                u0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var10 = foVar.m0;
            if (u0Var10 != null && foVar.K9) {
                u0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar9 = foVar.f35672i0;
            if (xVar9 != null) {
                xVar9.f(8);
            }
            org.telegram.ui.ActionBar.x xVar10 = foVar.f35624e0;
            if (xVar10 != null) {
                xVar10.f(8);
            }
            ls lsVar3 = foVar.f35612d0;
            if (lsVar3 != null) {
                lsVar3.b(false);
            }
        }
        if (foVar.f35770q1 != null) {
            if (foVar.f35759p1.f25060a.getCurrentPosition() != 0) {
                foVar.f35759p1.f25060a.d(0, 0);
                foVar.f35797s1 = true;
            } else {
                foVar.f35770q1.h.clear();
            }
        }
        int i13 = foVar.R3;
        if (i13 == 3 || i13 == 8 || ((foVar.f35616d4 == 0 && !UserObject.isReplyUser(foVar.f35636f)) || ((messageObject = foVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            foVar.f35684j0.setVisibility(8);
        }
        foVar.f35747o0 = false;
        foVar.getMediaDataController().clearFoundMessageObjects();
        if (foVar.O3 == 3) {
            i12 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        hg.n1 n1Var = foVar.M3;
        if (n1Var != null) {
            n1Var.l();
        }
        foVar.Ma();
        foVar.lc(false);
        foVar.Cc(0, true);
        foVar.ad(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41327f, 0.0f);
        ofFloat.addUpdateListener(new vn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.es.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        foVar.yc.a(false, true);
        foVar.Lc();
        foVar.f35772q3 = null;
        foVar.Mc();
        foVar.zc();
        dl dlVar = foVar.f35748o1;
        if (dlVar != null) {
            dlVar.d.M(new or(2));
            dlVar.h = 0L;
            foVar.f35748o1.g(false);
        }
        pk pkVar = foVar.f35759p1;
        if (pkVar != null) {
            pkVar.b(false);
        }
        foVar.ob(false);
    }

    @Override
    public final void n() {
        pk pkVar;
        int i10;
        fo foVar = this.h;
        boolean z10 = true;
        foVar.f35799s3 = true;
        foVar.zc();
        foVar.Mc();
        if (((foVar.f35616d4 != 0 && foVar.R3 != 3) || UserObject.isReplyUser(foVar.f35636f)) && !foVar.f35623dc) {
            foVar.qa(null);
        }
        if (foVar.W4) {
            foVar.saveKeyboardPositionBeforeTransition();
            if (!foVar.Pa) {
                Activity parentActivity = foVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new gj(this, 10), 500L);
            nj njVar = foVar.f35650g2;
            if (njVar != null) {
                njVar.b(true);
            }
            org.telegram.ui.Components.v40 v40Var = foVar.f35674i2;
            if (v40Var != null) {
                v40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41327f, 1.0f);
        ofFloat.addUpdateListener(new vn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.es.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        dl dlVar = foVar.f35748o1;
        if (dlVar != null) {
            if (foVar.Pa || !dlVar.a() || foVar.f35825u3 != null) {
                z10 = false;
            }
            dlVar.g(z10);
        }
        if (foVar.f35825u3 != null && (pkVar = foVar.f35759p1) != null) {
            int currentPosition = pkVar.f25060a.getCurrentPosition();
            int i11 = foVar.f35783r1;
            if (currentPosition != i11) {
                foVar.f35759p1.f25060a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(hg.p0 p0Var) {
        fo foVar = this.h;
        dl dlVar = foVar.f35748o1;
        if (dlVar != null) {
            dlVar.d.M(new or(2));
            dlVar.h = 0L;
        }
        foVar.f35772q3 = null;
        foVar.Mc();
        foVar.zc();
        foVar.ob(false);
    }

    @Override
    public final void p(di.g2 g2Var) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.c6 c6Var;
        fo foVar = this.h;
        boolean z10 = false;
        foVar.Jc(0, 0, -1);
        if (g2Var != null) {
            str = g2Var.getText().toString();
        } else {
            str = foVar.f35812t3;
        }
        foVar.f35812t3 = str;
        if (!TextUtils.isEmpty(str) && (foVar.f35812t3.startsWith("$") || foVar.f35812t3.startsWith("#"))) {
            foVar.P7();
            if (foVar.f35812t3.contains("@")) {
                String str2 = foVar.f35812t3;
                c6Var = ((org.telegram.ui.ActionBar.m2) foVar).resourceProvider;
                foVar.presentFragment(new org.telegram.ui.Components.o40(str2, c6Var));
                return;
            }
            if (foVar.f35825u3 == null) {
                foVar.f35825u3 = foVar.f35812t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41327f, 1.0f);
                ofFloat.addUpdateListener(new vn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.es.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                dl dlVar = foVar.f35748o1;
                if (dlVar != null) {
                    if (!foVar.Pa && dlVar.a() && foVar.f35825u3 == null) {
                        z10 = true;
                    }
                    dlVar.g(z10);
                }
            }
            foVar.f35825u3 = foVar.f35812t3;
            foVar.U6(true);
            i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(foVar.f35825u3);
            foVar.f35810t1.f28193f.N(true);
            View currentView = foVar.f35770q1.getCurrentView();
            if (foVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof ho) {
                ((ho) currentView).f36617a.Nc(foVar.f35825u3);
            }
            foVar.Lc();
            foVar.f35614d2.e(true, true);
            foVar.Pb(true);
            z10 = true;
        } else {
            foVar.f35825u3 = null;
            pk pkVar = foVar.f35759p1;
            if (pkVar != null) {
                pkVar.b(false);
                foVar.Lc();
            }
            pk pkVar2 = foVar.f35759p1;
            if (pkVar2 != null && pkVar2.f25060a.getCurrentPosition() != 0) {
                foVar.f35759p1.f25060a.d(0, 0);
            }
        }
        pk pkVar3 = foVar.f35759p1;
        if (pkVar3 != null) {
            pkVar3.b(z10);
        }
        MediaDataController mediaDataController = foVar.getMediaDataController();
        String str3 = foVar.f35812t3;
        long j10 = foVar.T5;
        long j11 = foVar.L6;
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j10, j11, i10, 0, foVar.f35616d4, foVar.f35750o3, foVar.f35761p3, foVar.f35772q3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        fo foVar = this.h;
        ne.b bVar = foVar.Ac;
        if (foVar.f35825u3 == null) {
            foVar.Pb(false);
        }
        foVar.O7();
        if (foVar.f35737n3) {
            foVar.I1.getAdapter().U("@" + editText.getText().toString(), 0, foVar.f35828u6, true, true);
        } else if (foVar.f35750o3 == null && foVar.f35761p3 == null && foVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            foVar.T2.callOnClick();
        }
        if (foVar.f35825u3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != bVar.f16004f) {
                if (z10) {
                    foVar.P7();
                }
                bVar.a(z10, true);
                di.h1 h1Var = foVar.f35770q1;
                if (h1Var != null) {
                    h1Var.D(0);
                }
                if (z10) {
                    foVar.Pb(true);
                }
                foVar.lc(false);
            }
        }
    }

    @Override
    public final boolean r() {
        if (this.h.f35825u3 == null) {
            return true;
        }
        return false;
    }
}
