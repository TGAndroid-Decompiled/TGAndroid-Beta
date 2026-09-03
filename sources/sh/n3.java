package sh;

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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.b4;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.qc;
import org.telegram.ui.q31;
import org.telegram.ui.xn;
public final class n3 extends ei implements NotificationCenter.NotificationCenterDelegate {
    public long B;
    public int C;
    public String D;
    public boolean E;
    public j3 F;
    public g2 G;
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
    public f3 R;
    public boolean S;
    public int T;
    public i3 f47578n;
    public ValueAnimator f47579r;
    public boolean f47580s;
    public long v;
    public long f47581w;
    public long f47582x;
    public int f47583y;

    @Override
    public final void D(ei eiVar) {
        i3 i3Var = this.f47578n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.C).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        mi miVar = this.f26590b;
        miVar.U0.setTitle(userName);
        this.G.setSwipeOffsetY(0.0f);
        if (i3Var.getWebView() != null) {
            i3Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.p2 p2Var = miVar.f29058c0;
        if (p2Var != null) {
            i3Var.setParentActivity(p2Var.getParentActivity());
        }
        this.H.setVisibility(0);
        if (!i3Var.O) {
            AndroidUtilities.updateImageViewImageAnimated(miVar.U0.getBackButton(), R.drawable.ic_close_white);
        }
    }

    @Override
    public final void E() {
        if (this.f47578n.K) {
            K();
        }
        this.G.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new f3(this, 0));
    }

    @Override
    public final void F() {
        g2 g2Var = this.G;
        g2Var.e(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()));
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
            alertDialog$Builder.f21168a.O = str;
            alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new h3(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
            d2Var.show();
            ((TextView) d2Var.d(-1)).setTextColor(k6.v0(k6.f21897q7, this.f26589a));
            return false;
        }
        this.f26590b.dismiss();
        return true;
    }

    public final void K() {
        mi miVar = this.f26590b;
        org.telegram.ui.ActionBar.p2 p2Var = miVar.f29058c0;
        if ((p2Var instanceof xn) && ((xn) p2Var).U0.R() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(miVar.f29058c0.getFragmentView());
            AndroidUtilities.runOnUIThread(new f3(this, 1), 250L);
            return;
        }
        miVar.getWindow().setSoftInputMode(20);
        setFocusable(true);
        miVar.setFocusable(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i3 i3Var = this.f47578n;
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.f47582x == ((Long) objArr[0]).longValue()) {
                i3Var.h();
                this.E = true;
                this.f26590b.dismiss();
            }
        } else if (i10 == NotificationCenter.didSetNewTheme) {
            i3Var.f42446n.b(k6.v0(k6.f21733h5, this.f26589a), 153);
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
        g2 g2Var = this.G;
        return (int) (g2Var.getOffsetY() + g2Var.getSwipeOffsetY());
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
        return this.f47578n;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        if (this.f47578n.z()) {
            return true;
        }
        J();
        return true;
    }

    @Override
    public final void m() {
        NotificationCenter.getInstance(this.C).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.z n10 = this.f26590b.U0.n();
        org.telegram.ui.ActionBar.w0 w0Var = this.H;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w0Var.f22346b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        n10.removeView(w0Var);
        this.f47578n.h();
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
        mi miVar = this.f26590b;
        miVar.setFocusable(false);
        miVar.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void r() {
        this.H.setVisibility(8);
        this.M = false;
        i3 i3Var = this.f47578n;
        boolean z4 = i3Var.O;
        mi miVar = this.f26590b;
        if (!z4) {
            AndroidUtilities.updateImageViewImageAnimated(miVar.U0.getBackButton(), R.drawable.ic_ab_back);
        }
        miVar.U0.setBackground(null);
        if (i3Var.Q) {
            i3Var.h();
            this.E = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f47580s) {
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

    public void setDelegate(org.telegram.ui.web.f0 f0Var) {
        this.f47578n.setDelegate(f0Var);
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
        this.f26590b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        j3 j3Var = this.F;
        i3 i3Var = this.f47578n;
        if (i10 == -1) {
            if (!i3Var.z()) {
                J();
                return;
            }
            return;
        }
        int i11 = R.id.menu_open_bot;
        mi miVar = this.f26590b;
        if (i10 == i11) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            miVar.f29058c0.presentFragment(new xn(bundle));
            miVar.dismiss();
            return;
        }
        int i12 = 0;
        if (i10 == R.id.menu_reload_page) {
            if (i3Var.getWebView() != null) {
                i3Var.getWebView().animate().cancel();
                i3Var.getWebView().animate().alpha(0.0f).start();
            }
            j3Var.setLoadProgress(0.0f);
            j3Var.setAlpha(1.0f);
            j3Var.setVisibility(0);
            i3Var.setBotUser(MessagesController.getInstance(this.C).getUser(Long.valueOf(this.v)));
            i3Var.q(this.C, this.v);
            NotificationCenter.getInstance(i3Var.J).doOnIdle(new org.telegram.ui.web.u(i3Var, 2));
        } else if (i10 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.C).getAttachMenuBots().bots;
            int size = arrayList.size();
            while (i12 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i12);
                i12++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.v) {
                    miVar.w1(tL_attachMenuBot2, MessagesController.getInstance(this.C).getUser(Long.valueOf(this.v)));
                    return;
                }
            }
        } else if (i10 == R.id.menu_settings) {
            i3Var.getClass();
            i3Var.M = System.currentTimeMillis();
            i3Var.v("settings_button_pressed", null);
        } else if (i10 == R.id.menu_add_to_home_screen_bot) {
            MediaDataController.getInstance(this.C).installShortcut(this.v, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
        } else if (i10 == R.id.menu_tos_bot) {
            af.g.s(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
        } else if (i10 == R.id.menu_report_bot) {
            int i13 = this.C;
            Context context = getContext();
            qc qcVar = new qc(cb.a(getContext()), this.f26589a);
            long j10 = this.v;
            int i14 = q31.v;
            q31.J(i13, context, j10, false, false, new ArrayList(), qcVar, null, new byte[0], null, null);
        }
    }

    @Override
    public final void v() {
        this.L = false;
        this.G.setSwipeOffsetAnimationDisallowed(false);
        this.f47578n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void w(int i10, boolean z4) {
        boolean z10;
        i3 i3Var = this.f47578n;
        g2 g2Var = this.G;
        if (z4) {
            i3Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY());
            if (g2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                g2Var.e(topActionBarOffsetY);
                z10 = true;
            } else {
                z10 = false;
            }
            int R = this.f26590b.f29096o1.R() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.L = true;
            g2Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z10) {
                ValueAnimator valueAnimator = this.f47579r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f47579r = null;
                }
                if (i3Var.getWebView() != null) {
                    int scrollY = i3Var.getWebView().getScrollY();
                    int i11 = (R - i10) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                    this.f47579r = duration;
                    duration.setInterpolator(xh.n.V);
                    this.f47579r.addUpdateListener(new g3(this, 1));
                    this.f47579r.addListener(new b4(this, i11, 10));
                    this.f47579r.start();
                }
            }
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: sh.n3.y(int, int):void");
    }
}
