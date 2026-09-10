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
public final class vn extends org.telegram.ui.ActionBar.i5 {
    public float f37591f;
    public final eo h;

    public vn(eo eoVar) {
        this.h = eoVar;
    }

    @Override
    public final boolean a() {
        if (this.h.f32506u3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        eo eoVar;
        eo eoVar2 = this.h;
        if (!eoVar2.Ac.f12870f) {
            if (eoVar2.f32506u3 != null && eoVar2.f32440p1 != null) {
                View currentView = eoVar2.f32452q1.getCurrentView();
                if (currentView instanceof go) {
                    eoVar = ((go) currentView).f33142a;
                } else {
                    eoVar = eoVar2;
                }
                if (!eoVar.f32566yc.f12870f) {
                    eoVar.Lb(true);
                    return false;
                }
                int currentPosition = eoVar2.f32440p1.f29776a.getCurrentPosition();
                int i10 = eoVar2.f32465r1;
                if (currentPosition != i10) {
                    eoVar2.f32440p1.f29776a.d(i10, i10);
                    return false;
                }
            } else if (eoVar2.f32566yc.f12870f) {
                eoVar2.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.h.f32419n3;
    }

    @Override
    public final void k() {
        int i10;
        eo eoVar = this.h;
        eoVar.L7();
        if (eoVar.f32430o3 == null && eoVar.f32442p3 == null) {
            if (eoVar.f32419n3) {
                eoVar.I1.getAdapter().U(null, 0, null, false, true);
                eoVar.f32419n3 = false;
                eoVar.f32367j0.H("", true);
            }
            org.telegram.ui.ActionBar.w0 w0Var = eoVar.f32367j0;
            if (eoVar.E9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var.setSearchFieldHint(LocaleController.getString(i10));
            eoVar.S2.setVisibility(0);
            ImageView imageView = eoVar.T2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            eoVar.f32430o3 = null;
            eoVar.f32442p3 = null;
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
        eoVar.f32481s3 = false;
        eoVar.vc();
        eoVar.Ic();
        ImageView imageView = eoVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = eoVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (eoVar.f32419n3) {
            eoVar.I1.getAdapter().U(null, 0, null, false, true);
            eoVar.f32419n3 = false;
        }
        eoVar.I1.setReversed(false);
        eoVar.I1.getAdapter().f8114k0 = false;
        eoVar.m7();
        eoVar.f32430o3 = null;
        eoVar.f32442p3 = null;
        eoVar.f32506u3 = null;
        org.telegram.ui.ActionBar.w0 w0Var = eoVar.f32367j0;
        if (eoVar.E9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        w0Var.setSearchFieldHint(LocaleController.getString(i10));
        eoVar.f32367j0.setSearchFieldCaption(null);
        eoVar.f32579zc.a(false, true);
        eoVar.Ac.a(false, true);
        org.telegram.ui.ActionBar.y yVar = eoVar.f32354i0;
        if (yVar != null && yVar.f18769o != null) {
            org.telegram.ui.ActionBar.w0 w0Var2 = eoVar.f32342h0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = eoVar.f32354i0;
            if (yVar2 != null) {
                yVar2.f(0);
                eo.J3(eoVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = eoVar.f32307e0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            is isVar = eoVar.f32294d0;
            if (isVar != null) {
                isVar.b(false);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = eoVar.m0;
            if (w0Var3 != null && eoVar.K9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = eoVar.f32416n0;
            if (yVar4 != null && eoVar.L9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = eoVar.f32379k0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
        } else if (eoVar.Y.k0() && TextUtils.isEmpty(eoVar.Y.getSlowModeTimer()) && ((chat = eoVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.w0 w0Var5 = eoVar.f32342h0;
            if (w0Var5 != null) {
                w0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = eoVar.f32354i0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = eoVar.f32307e0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            is isVar2 = eoVar.f32294d0;
            if (isVar2 != null) {
                isVar2.b(true);
            }
            org.telegram.ui.ActionBar.w0 w0Var6 = eoVar.m0;
            if (w0Var6 != null && eoVar.K9) {
                w0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = eoVar.f32416n0;
            if (yVar7 != null && eoVar.L9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var7 = eoVar.f32379k0;
            if (w0Var7 != null) {
                w0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.w0 w0Var8 = eoVar.f32342h0;
            if (w0Var8 != null) {
                w0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = eoVar.f32416n0;
            if (yVar8 != null && eoVar.L9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var9 = eoVar.f32379k0;
            if (w0Var9 != null) {
                w0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var10 = eoVar.m0;
            if (w0Var10 != null && eoVar.K9) {
                w0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = eoVar.f32354i0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = eoVar.f32307e0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            is isVar3 = eoVar.f32294d0;
            if (isVar3 != null) {
                isVar3.b(false);
            }
        }
        if (eoVar.f32452q1 != null) {
            if (eoVar.f32440p1.f29776a.getCurrentPosition() != 0) {
                eoVar.f32440p1.f29776a.d(0, 0);
                eoVar.f32479s1 = true;
            } else {
                eoVar.f32452q1.h.clear();
            }
        }
        int i13 = eoVar.R3;
        if (i13 == 3 || i13 == 8 || ((eoVar.f32298d4 == 0 && !UserObject.isReplyUser(eoVar.f32318f)) || ((messageObject = eoVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            eoVar.f32367j0.setVisibility(8);
        }
        eoVar.f32427o0 = false;
        eoVar.getMediaDataController().clearFoundMessageObjects();
        if (eoVar.O3 == 3) {
            i12 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        fg.p1 p1Var = eoVar.M3;
        if (p1Var != null) {
            p1Var.l();
        }
        eoVar.Ia();
        eoVar.hc(false);
        eoVar.yc(0, true);
        eoVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37591f, 0.0f);
        ofFloat.addUpdateListener(new un(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.wr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        eoVar.f32566yc.a(false, true);
        eoVar.Hc();
        eoVar.f32454q3 = null;
        eoVar.Ic();
        eoVar.vc();
        al alVar = eoVar.f32428o1;
        if (alVar != null) {
            alVar.d.M(new mr(2));
            alVar.h = 0L;
            eoVar.f32428o1.g(false);
        }
        mk mkVar = eoVar.f32440p1;
        if (mkVar != null) {
            mkVar.b(false);
        }
        eoVar.kb(false);
    }

    @Override
    public final void n() {
        mk mkVar;
        int i10;
        eo eoVar = this.h;
        boolean z10 = true;
        eoVar.f32481s3 = true;
        eoVar.vc();
        eoVar.Ic();
        if (((eoVar.f32298d4 != 0 && eoVar.R3 != 3) || UserObject.isReplyUser(eoVar.f32318f)) && !eoVar.f32306dc) {
            eoVar.la(null);
        }
        if (eoVar.W4) {
            eoVar.saveKeyboardPositionBeforeTransition();
            if (!eoVar.Oa) {
                Activity parentActivity = eoVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new fj(this, 9), 500L);
            kj kjVar = eoVar.f32333g2;
            if (kjVar != null) {
                kjVar.b(true);
            }
            org.telegram.ui.Components.s40 s40Var = eoVar.f32356i2;
            if (s40Var != null) {
                s40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37591f, 1.0f);
        ofFloat.addUpdateListener(new un(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.wr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        al alVar = eoVar.f32428o1;
        if (alVar != null) {
            alVar.g((!eoVar.Oa && alVar.a() && eoVar.f32506u3 == null) ? false : false);
        }
        if (eoVar.f32506u3 != null && (mkVar = eoVar.f32440p1) != null) {
            int currentPosition = mkVar.f29776a.getCurrentPosition();
            int i11 = eoVar.f32465r1;
            if (currentPosition != i11) {
                eoVar.f32440p1.f29776a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(fg.q0 q0Var) {
        eo eoVar = this.h;
        al alVar = eoVar.f32428o1;
        if (alVar != null) {
            alVar.d.M(new mr(2));
            alVar.h = 0L;
        }
        eoVar.f32454q3 = null;
        eoVar.Ic();
        eoVar.vc();
        eoVar.kb(false);
    }

    @Override
    public final void p(bi.t2 t2Var) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var;
        eo eoVar = this.h;
        boolean z10 = false;
        eoVar.Fc(0, 0, -1);
        if (t2Var != null) {
            str = t2Var.getText().toString();
        } else {
            str = eoVar.f32494t3;
        }
        eoVar.f32494t3 = str;
        if (!TextUtils.isEmpty(str) && (eoVar.f32494t3.startsWith("$") || eoVar.f32494t3.startsWith("#"))) {
            eoVar.M7();
            if (eoVar.f32494t3.contains("@")) {
                String str2 = eoVar.f32494t3;
                f6Var = ((org.telegram.ui.ActionBar.p2) eoVar).resourceProvider;
                eoVar.presentFragment(new org.telegram.ui.Components.l40(str2, f6Var));
                return;
            }
            if (eoVar.f32506u3 == null) {
                eoVar.f32506u3 = eoVar.f32494t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37591f, 1.0f);
                ofFloat.addUpdateListener(new un(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.wr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                al alVar = eoVar.f32428o1;
                if (alVar != null) {
                    if (!eoVar.Oa && alVar.a() && eoVar.f32506u3 == null) {
                        z10 = true;
                    }
                    alVar.g(z10);
                }
            }
            eoVar.f32506u3 = eoVar.f32494t3;
            eoVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(eoVar.f32506u3);
            eoVar.f32492t1.f25408f.N(true);
            View currentView = eoVar.f32452q1.getCurrentView();
            if (eoVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof go) {
                ((go) currentView).f33142a.Jc(eoVar.f32506u3);
            }
            eoVar.Hc();
            eoVar.f32296d2.e(true, true);
            eoVar.Lb(true);
            z10 = true;
        } else {
            eoVar.f32506u3 = null;
            mk mkVar = eoVar.f32440p1;
            if (mkVar != null) {
                mkVar.b(false);
                eoVar.Hc();
            }
            mk mkVar2 = eoVar.f32440p1;
            if (mkVar2 != null && mkVar2.f29776a.getCurrentPosition() != 0) {
                eoVar.f32440p1.f29776a.d(0, 0);
            }
        }
        mk mkVar3 = eoVar.f32440p1;
        if (mkVar3 != null) {
            mkVar3.b(z10);
        }
        MediaDataController mediaDataController = eoVar.getMediaDataController();
        String str3 = eoVar.f32494t3;
        long j3 = eoVar.T5;
        long j10 = eoVar.L6;
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j3, j10, i10, 0, eoVar.f32298d4, eoVar.f32430o3, eoVar.f32442p3, eoVar.f32454q3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        eo eoVar = this.h;
        le.b bVar = eoVar.Ac;
        if (eoVar.f32506u3 == null) {
            eoVar.Lb(false);
        }
        eoVar.L7();
        if (eoVar.f32419n3) {
            fg.l1 adapter = eoVar.I1.getAdapter();
            adapter.U("@" + editText.getText().toString(), 0, eoVar.f32509u6, true, true);
        } else if (eoVar.f32430o3 == null && eoVar.f32442p3 == null && eoVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            eoVar.T2.callOnClick();
        }
        if (eoVar.f32506u3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != bVar.f12870f) {
                if (z10) {
                    eoVar.M7();
                }
                bVar.a(z10, true);
                bi.p1 p1Var = eoVar.f32452q1;
                if (p1Var != null) {
                    p1Var.D(0);
                }
                if (z10) {
                    eoVar.Lb(true);
                }
                eoVar.hc(false);
            }
        }
    }

    @Override
    public final boolean r() {
        if (this.h.f32506u3 == null) {
            return true;
        }
        return false;
    }
}
