package rh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.b4;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.qc;
import org.telegram.ui.k31;
import org.telegram.ui.xn;
public final class o3 extends di implements NotificationCenter.NotificationCenterDelegate {
    public long B;
    public int C;
    public String D;
    public boolean E;
    public k3 F;
    public h2 G;
    public org.telegram.ui.ActionBar.w0 H;
    public org.telegram.ui.ActionBar.g1 I;
    public org.telegram.ui.ActionBar.g1 J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;
    public g3 R;
    public boolean S;
    public int T;
    public j3 f43641n;
    public ValueAnimator f43642r;
    public boolean f43643s;
    public long v;
    public long f43644w;
    public long f43645x;
    public int f43646y;

    @Override
    public final void D(di diVar) {
        j3 j3Var = this.f43641n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.C).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        li liVar = this.f24278b;
        liVar.U0.setTitle(userName);
        this.G.setSwipeOffsetY(0.0f);
        if (j3Var.getWebView() != null) {
            j3Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
        if (p2Var != null) {
            j3Var.setParentActivity(p2Var.getParentActivity());
        }
        this.H.setVisibility(0);
        if (!j3Var.O) {
            AndroidUtilities.updateImageViewImageAnimated(liVar.U0.getBackButton(), R.drawable.ic_close_white);
        }
    }

    @Override
    public final void E() {
        if (this.f43641n.K) {
            K();
        }
        this.G.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new g3(this, 0));
    }

    @Override
    public final void F() {
        h2 h2Var = this.G;
        h2Var.e(h2Var.getTopActionBarOffsetY() + (-h2Var.getOffsetY()));
    }

    public final boolean J() {
        String str;
        if (this.P) {
            TLRPC.User user = MessagesController.getInstance(this.C).getUser(Long.valueOf(this.v));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f19503a.O = str;
            alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new i3(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            d2Var.show();
            ((TextView) d2Var.d(-1)).setTextColor(j6.v0(j6.f20141q7, this.f24277a));
            return false;
        }
        this.f24278b.dismiss();
        return true;
    }

    public final void K() {
        li liVar = this.f24278b;
        org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
        if ((p2Var instanceof xn) && ((xn) p2Var).U0.R() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(liVar.f26689c0.getFragmentView());
            AndroidUtilities.runOnUIThread(new g3(this, 1), 250L);
            return;
        }
        liVar.getWindow().setSoftInputMode(20);
        setFocusable(true);
        liVar.setFocusable(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j3 j3Var = this.f43641n;
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.f43645x == ((Long) objArr[0]).longValue()) {
                j3Var.h();
                this.E = true;
                this.f24278b.dismiss();
            }
        } else if (i10 == NotificationCenter.didSetNewTheme) {
            j3Var.f39436n.b(j6.v0(j6.f19977h5, this.f24277a), 153);
        }
    }

    @Override
    public final boolean e() {
        return this.S;
    }

    @Override
    public final boolean f() {
        return this.N;
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(12.0f) + ((int) this.G.getTopActionBarOffsetY());
    }

    @Override
    public int getCurrentItemTop() {
        h2 h2Var = this.G;
        return (int) (h2Var.getOffsetY() + h2Var.getSwipeOffsetY());
    }

    @Override
    public int getCustomActionBarBackground() {
        return this.T;
    }

    @Override
    public int getCustomBackground() {
        return this.O;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (int) this.G.getOffsetY();
    }

    public String getStartCommand() {
        return this.D;
    }

    public org.telegram.ui.web.a1 getWebViewContainer() {
        return this.f43641n;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        if (this.f43641n.z()) {
            return true;
        }
        J();
        return true;
    }

    @Override
    public final void m() {
        NotificationCenter.getInstance(this.C).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.z n10 = this.f24278b.U0.n();
        org.telegram.ui.ActionBar.w0 w0Var = this.H;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w0Var.f20649b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        n10.removeView(w0Var);
        this.f43641n.h();
        this.Q = true;
        AndroidUtilities.cancelRunOnUIThread(this.R);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.L) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override
    public final boolean p() {
        J();
        return false;
    }

    @Override
    public final void q() {
        li liVar = this.f24278b;
        liVar.setFocusable(false);
        liVar.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void r() {
        this.H.setVisibility(8);
        this.M = false;
        j3 j3Var = this.f43641n;
        boolean z4 = j3Var.O;
        li liVar = this.f24278b;
        if (!z4) {
            AndroidUtilities.updateImageViewImageAnimated(liVar.U0.getBackButton(), R.drawable.ic_ab_back);
        }
        liVar.U0.setBackground(null);
        if (j3Var.Q) {
            j3Var.h();
            this.E = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f43643s) {
            return;
        }
        super.requestLayout();
    }

    public void setAllowSwipes(boolean z4) {
        this.G.setAllowSwipes(z4);
    }

    public void setCustomActionBarBackground(int i10) {
        this.S = true;
        this.T = i10;
    }

    public void setCustomBackground(int i10) {
        this.O = i10;
        this.N = true;
    }

    public void setDelegate(org.telegram.ui.web.e0 e0Var) {
        this.f43641n.setDelegate(e0Var);
    }

    public void setMeasureOffsetY(int i10) {
        this.K = i10;
        this.G.requestLayout();
    }

    public void setNeedCloseConfirmation(boolean z4) {
        this.P = z4;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f24278b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        k3 k3Var = this.F;
        j3 j3Var = this.f43641n;
        if (i10 == -1) {
            if (!j3Var.z()) {
                J();
                return;
            }
            return;
        }
        int i11 = R.id.menu_open_bot;
        li liVar = this.f24278b;
        if (i10 == i11) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            liVar.f26689c0.presentFragment(new xn(bundle));
            liVar.dismiss();
            return;
        }
        int i12 = 0;
        if (i10 == R.id.menu_reload_page) {
            if (j3Var.getWebView() != null) {
                j3Var.getWebView().animate().cancel();
                j3Var.getWebView().animate().alpha(0.0f).start();
            }
            k3Var.setLoadProgress(0.0f);
            k3Var.setAlpha(1.0f);
            k3Var.setVisibility(0);
            j3Var.setBotUser(MessagesController.getInstance(this.C).getUser(Long.valueOf(this.v)));
            j3Var.q(this.C, this.v);
            NotificationCenter.getInstance(j3Var.J).doOnIdle(new org.telegram.ui.web.u(j3Var, 2));
        } else if (i10 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.C).getAttachMenuBots().bots;
            int size = arrayList.size();
            while (i12 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i12);
                i12++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.v) {
                    liVar.w1(tL_attachMenuBot2, MessagesController.getInstance(this.C).getUser(Long.valueOf(this.v)));
                    return;
                }
            }
        } else if (i10 == R.id.menu_settings) {
            j3Var.getClass();
            j3Var.M = System.currentTimeMillis();
            j3Var.v("settings_button_pressed", null);
        } else if (i10 == R.id.menu_add_to_home_screen_bot) {
            MediaDataController.getInstance(this.C).installShortcut(this.v, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
        } else if (i10 == R.id.menu_tos_bot) {
            af.g.s(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
        } else if (i10 == R.id.menu_report_bot) {
            int i13 = this.C;
            Context context = getContext();
            qc qcVar = new qc(cb.a(getContext()), this.f24277a);
            long j10 = this.v;
            int i14 = k31.v;
            k31.J(i13, context, j10, false, false, new ArrayList(), qcVar, null, new byte[0], null, null);
        }
    }

    @Override
    public final void v() {
        this.L = false;
        this.G.setSwipeOffsetAnimationDisallowed(false);
        this.f43641n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void w(int i10, boolean z4) {
        boolean z10;
        j3 j3Var = this.f43641n;
        h2 h2Var = this.G;
        if (z4) {
            j3Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = h2Var.getTopActionBarOffsetY() + (-h2Var.getOffsetY());
            if (h2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                h2Var.e(topActionBarOffsetY);
                z10 = true;
            } else {
                z10 = false;
            }
            int R = this.f24278b.f26726o1.R() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.L = true;
            h2Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z10) {
                ValueAnimator valueAnimator = this.f43642r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f43642r = null;
                }
                if (j3Var.getWebView() != null) {
                    int scrollY = j3Var.getWebView().getScrollY();
                    int i11 = (R - i10) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                    this.f43642r = duration;
                    duration.setInterpolator(wh.n.V);
                    this.f43642r.addUpdateListener(new h3(this, 1));
                    this.f43642r.addListener(new b4(this, i11, 10));
                    this.f43642r.start();
                }
            }
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: rh.o3.y(int, int):void");
    }
}
