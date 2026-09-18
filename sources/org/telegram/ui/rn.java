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
public final class rn extends org.telegram.ui.ActionBar.g5 {
    public float f37103f;
    public final zn h;

    public rn(zn znVar) {
        this.h = znVar;
    }

    @Override
    public final boolean a() {
        if (this.h.f40452u3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        zn znVar;
        zn znVar2 = this.h;
        if (!znVar2.f40525zc.f14131f) {
            if (znVar2.f40452u3 != null && znVar2.f40386p1 != null) {
                View currentView = znVar2.f40398q1.getCurrentView();
                if (currentView instanceof bo) {
                    znVar = ((bo) currentView).f32418a;
                } else {
                    znVar = znVar2;
                }
                if (!znVar.xc.f14131f) {
                    znVar.Lb(true);
                    return false;
                }
                int currentPosition = znVar2.f40386p1.f28432a.getCurrentPosition();
                int i10 = znVar2.f40411r1;
                if (currentPosition != i10) {
                    znVar2.f40386p1.f28432a.d(i10, i10);
                    return false;
                }
            } else if (znVar2.xc.f14131f) {
                znVar2.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.h.f40365n3;
    }

    @Override
    public final void k() {
        int i10;
        zn znVar = this.h;
        znVar.L7();
        if (znVar.f40376o3 == null && znVar.f40388p3 == null) {
            if (znVar.f40365n3) {
                znVar.I1.getAdapter().U(null, 0, null, false, true);
                znVar.f40365n3 = false;
                znVar.f40313j0.H("", true);
            }
            org.telegram.ui.ActionBar.v0 v0Var = znVar.f40313j0;
            if (znVar.E9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            v0Var.setSearchFieldHint(LocaleController.getString(i10));
            znVar.S2.setVisibility(0);
            ImageView imageView = znVar.T2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            znVar.f40376o3 = null;
            znVar.f40388p3 = null;
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
        znVar.f40427s3 = false;
        znVar.vc();
        znVar.Ic();
        ImageView imageView = znVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = znVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (znVar.f40365n3) {
            znVar.I1.getAdapter().U(null, 0, null, false, true);
            znVar.f40365n3 = false;
        }
        znVar.I1.setReversed(false);
        znVar.I1.getAdapter().f9826k0 = false;
        znVar.m7();
        znVar.f40376o3 = null;
        znVar.f40388p3 = null;
        znVar.f40452u3 = null;
        org.telegram.ui.ActionBar.v0 v0Var = znVar.f40313j0;
        if (znVar.E9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        v0Var.setSearchFieldHint(LocaleController.getString(i10));
        znVar.f40313j0.setSearchFieldCaption(null);
        znVar.f40512yc.a(false, true);
        znVar.f40525zc.a(false, true);
        org.telegram.ui.ActionBar.y yVar = znVar.f40300i0;
        if (yVar != null && yVar.f19913o != null) {
            org.telegram.ui.ActionBar.v0 v0Var2 = znVar.f40288h0;
            if (v0Var2 != null) {
                v0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = znVar.f40300i0;
            if (yVar2 != null) {
                yVar2.f(0);
                zn.J3(znVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = znVar.f40252e0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            hs hsVar = znVar.f40239d0;
            if (hsVar != null) {
                hsVar.b(false);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = znVar.m0;
            if (v0Var3 != null && znVar.K9) {
                v0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = znVar.f40362n0;
            if (yVar4 != null && znVar.L9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = znVar.f40325k0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
        } else if (znVar.Y.k0() && TextUtils.isEmpty(znVar.Y.getSlowModeTimer()) && ((chat = znVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.v0 v0Var5 = znVar.f40288h0;
            if (v0Var5 != null) {
                v0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = znVar.f40300i0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = znVar.f40252e0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            hs hsVar2 = znVar.f40239d0;
            if (hsVar2 != null) {
                hsVar2.b(true);
            }
            org.telegram.ui.ActionBar.v0 v0Var6 = znVar.m0;
            if (v0Var6 != null && znVar.K9) {
                v0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = znVar.f40362n0;
            if (yVar7 != null && znVar.L9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var7 = znVar.f40325k0;
            if (v0Var7 != null) {
                v0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.v0 v0Var8 = znVar.f40288h0;
            if (v0Var8 != null) {
                v0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = znVar.f40362n0;
            if (yVar8 != null && znVar.L9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var9 = znVar.f40325k0;
            if (v0Var9 != null) {
                v0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var10 = znVar.m0;
            if (v0Var10 != null && znVar.K9) {
                v0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = znVar.f40300i0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = znVar.f40252e0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            hs hsVar3 = znVar.f40239d0;
            if (hsVar3 != null) {
                hsVar3.b(false);
            }
        }
        if (znVar.f40398q1 != null) {
            if (znVar.f40386p1.f28432a.getCurrentPosition() != 0) {
                znVar.f40386p1.f28432a.d(0, 0);
                znVar.f40425s1 = true;
            } else {
                znVar.f40398q1.h.clear();
            }
        }
        int i13 = znVar.R3;
        if (i13 == 3 || i13 == 8 || ((znVar.f40243d4 == 0 && !UserObject.isReplyUser(znVar.f40263f)) || ((messageObject = znVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            znVar.f40313j0.setVisibility(8);
        }
        znVar.f40373o0 = false;
        znVar.getMediaDataController().clearFoundMessageObjects();
        if (znVar.O3 == 3) {
            i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        gg.o1 o1Var = znVar.M3;
        if (o1Var != null) {
            o1Var.l();
        }
        znVar.Ia();
        znVar.hc(false);
        znVar.yc(0, true);
        znVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37103f, 0.0f);
        ofFloat.addUpdateListener(new qn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        znVar.xc.a(false, true);
        znVar.Hc();
        znVar.f40400q3 = null;
        znVar.Ic();
        znVar.vc();
        xk xkVar = znVar.f40374o1;
        if (xkVar != null) {
            xkVar.d.N(new ir(2));
            xkVar.h = 0L;
            znVar.f40374o1.g(false);
        }
        jk jkVar = znVar.f40386p1;
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
        boolean z10 = true;
        znVar.f40427s3 = true;
        znVar.vc();
        znVar.Ic();
        if (((znVar.f40243d4 != 0 && znVar.R3 != 3) || UserObject.isReplyUser(znVar.f40263f)) && !znVar.f40238cc) {
            znVar.la(null);
        }
        if (znVar.W4) {
            znVar.saveKeyboardPositionBeforeTransition();
            if (!znVar.Oa) {
                Activity parentActivity = znVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new cj(this, 9), 500L);
            hj hjVar = znVar.f40278g2;
            if (hjVar != null) {
                hjVar.b(true);
            }
            org.telegram.ui.Components.i40 i40Var = znVar.f40302i2;
            if (i40Var != null) {
                i40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37103f, 1.0f);
        ofFloat.addUpdateListener(new qn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        xk xkVar = znVar.f40374o1;
        if (xkVar != null) {
            xkVar.g((!znVar.Oa && xkVar.a() && znVar.f40452u3 == null) ? false : false);
        }
        if (znVar.f40452u3 != null && (jkVar = znVar.f40386p1) != null) {
            int currentPosition = jkVar.f28432a.getCurrentPosition();
            int i11 = znVar.f40411r1;
            if (currentPosition != i11) {
                znVar.f40386p1.f28432a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(gg.q0 q0Var) {
        zn znVar = this.h;
        xk xkVar = znVar.f40374o1;
        if (xkVar != null) {
            xkVar.d.N(new ir(2));
            xkVar.h = 0L;
        }
        znVar.f40400q3 = null;
        znVar.Ic();
        znVar.vc();
        znVar.kb(false);
    }

    @Override
    public final void p(ci.h2 h2Var) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.e6 e6Var;
        zn znVar = this.h;
        boolean z10 = false;
        znVar.Fc(0, 0, -1);
        if (h2Var != null) {
            str = h2Var.getText().toString();
        } else {
            str = znVar.f40440t3;
        }
        znVar.f40440t3 = str;
        if (!TextUtils.isEmpty(str) && (znVar.f40440t3.startsWith("$") || znVar.f40440t3.startsWith("#"))) {
            znVar.M7();
            if (znVar.f40440t3.contains("@")) {
                String str2 = znVar.f40440t3;
                e6Var = ((org.telegram.ui.ActionBar.n2) znVar).resourceProvider;
                znVar.presentFragment(new org.telegram.ui.Components.b40(str2, e6Var));
                return;
            }
            if (znVar.f40452u3 == null) {
                znVar.f40452u3 = znVar.f40440t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37103f, 1.0f);
                ofFloat.addUpdateListener(new qn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                xk xkVar = znVar.f40374o1;
                if (xkVar != null) {
                    if (!znVar.Oa && xkVar.a() && znVar.f40452u3 == null) {
                        z10 = true;
                    }
                    xkVar.g(z10);
                }
            }
            znVar.f40452u3 = znVar.f40440t3;
            znVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(znVar.f40452u3);
            znVar.f40438t1.f23423f.N(true);
            View currentView = znVar.f40398q1.getCurrentView();
            if (znVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof bo) {
                ((bo) currentView).f32418a.Jc(znVar.f40452u3);
            }
            znVar.Hc();
            znVar.f40241d2.e(true, true);
            znVar.Lb(true);
            z10 = true;
        } else {
            znVar.f40452u3 = null;
            jk jkVar = znVar.f40386p1;
            if (jkVar != null) {
                jkVar.b(false);
                znVar.Hc();
            }
            jk jkVar2 = znVar.f40386p1;
            if (jkVar2 != null && jkVar2.f28432a.getCurrentPosition() != 0) {
                znVar.f40386p1.f28432a.d(0, 0);
            }
        }
        jk jkVar3 = znVar.f40386p1;
        if (jkVar3 != null) {
            jkVar3.b(z10);
        }
        MediaDataController mediaDataController = znVar.getMediaDataController();
        String str3 = znVar.f40440t3;
        long j3 = znVar.T5;
        long j10 = znVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j3, j10, i10, 0, znVar.f40243d4, znVar.f40376o3, znVar.f40388p3, znVar.f40400q3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        zn znVar = this.h;
        le.b bVar = znVar.f40525zc;
        if (znVar.f40452u3 == null) {
            znVar.Lb(false);
        }
        znVar.L7();
        if (znVar.f40365n3) {
            gg.k1 adapter = znVar.I1.getAdapter();
            adapter.U("@" + editText.getText().toString(), 0, znVar.f40455u6, true, true);
        } else if (znVar.f40376o3 == null && znVar.f40388p3 == null && znVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            znVar.T2.callOnClick();
        }
        if (znVar.f40452u3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != bVar.f14131f) {
                if (z10) {
                    znVar.M7();
                }
                bVar.a(z10, true);
                ci.i1 i1Var = znVar.f40398q1;
                if (i1Var != null) {
                    i1Var.E(0);
                }
                if (z10) {
                    znVar.Lb(true);
                }
                znVar.hc(false);
            }
        }
    }

    @Override
    public final boolean r() {
        if (this.h.f40452u3 == null) {
            return true;
        }
        return false;
    }
}
