package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wh0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Components.dc0 f42772n;
    public static final org.telegram.ui.Components.dc0 f42773r;
    public final int f42774a;
    public final org.telegram.ui.Components.p9 f42775b;
    public final org.telegram.ui.ActionBar.l5 f42776c;
    public final TextView d;
    public final org.telegram.ui.Components.z8 f42777e;
    public final org.telegram.ui.Components.lw0 f42778f;
    public TLObject h;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.k6.f22038y6;
        f42772n = new org.telegram.ui.Components.dc0(i10, i11);
        f42773r = new org.telegram.ui.Components.dc0(R.drawable.mini_checklist_done_outline, i11);
    }

    public wh0(Context context) {
        super(context);
        int i10;
        this.f42774a = UserConfig.selectedAccount;
        this.f42777e = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f42775b = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f42776c = l5Var;
        l5Var.setTextSize(16);
        l5Var.setEllipsizeByGradient(!LocaleController.isRTL);
        l5Var.setImportantForAccessibility(2);
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E8, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        l5Var.setGravity(i10);
        this.f42778f = new org.telegram.ui.Components.lw0(this);
        l5Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22038y6, false));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (LocaleController.isRTL) {
            addView(p9Var, k7.c6.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(l5Var, k7.c6.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, k7.c6.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(p9Var, k7.c6.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(l5Var, k7.c6.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, k7.c6.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, boolean z4, int i10) {
        org.telegram.ui.Components.j5 a2;
        org.telegram.ui.Components.dc0 dc0Var;
        this.h = tLObject;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22058z9, false);
        boolean z10 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.lw0 lw0Var = this.f42778f;
        if (z10) {
            a2 = lw0Var.a((TLRPC.User) tLObject, null, w02, false);
        } else if (tLObject instanceof TLRPC.Chat) {
            a2 = lw0Var.a(null, (TLRPC.Chat) tLObject, w02, false);
        } else {
            a2 = lw0Var.a(null, null, w02, false);
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.f42776c;
        l5Var.i(a2);
        if (tLObject != null) {
            org.telegram.ui.Components.z8 z8Var = this.f42777e;
            int i11 = this.f42774a;
            z8Var.j(i11, tLObject);
            this.f42775b.h(ImageLocation.getForUserOrChat(i11, tLObject, 1), "50_50", z8Var, tLObject);
            l5Var.l(ContactsController.formatName(tLObject), false);
        }
        TextView textView = this.d;
        if (i10 <= 0) {
            textView.setVisibility(8);
            l5Var.setTranslationY(AndroidUtilities.dp(9.0f));
            return;
        }
        if (z4) {
            dc0Var = f42773r;
        } else {
            dc0Var = f42772n;
        }
        textView.setText(TextUtils.concat(dc0Var.a(getContext(), null), LocaleController.formatSeenDate(i10)));
        textView.setVisibility(0);
        l5Var.setTranslationY(0.0f);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.User user;
        org.telegram.ui.Components.j5 a2;
        if (i10 == NotificationCenter.userEmojiStatusUpdated) {
            TLRPC.User user2 = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
            } else {
                user = null;
            }
            if (user != null && user2 != null && user.f20992id == user2.f20992id) {
                this.h = user2;
                int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22058z9, false);
                boolean z4 = user2 instanceof TLRPC.User;
                org.telegram.ui.Components.lw0 lw0Var = this.f42778f;
                if (z4) {
                    a2 = lw0Var.a(user2, null, w02, true);
                } else {
                    a2 = lw0Var.a(null, null, w02, true);
                }
                this.f42776c.i(a2);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42778f.f28891a.a();
        NotificationCenter.getInstance(this.f42774a).addObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42778f.f28891a.b();
        NotificationCenter.getInstance(this.f42774a).removeObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String formatString = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, this.f42776c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder f10 = w.c.f(formatString, " ");
            f10.append((Object) textView.getText());
            formatString = f10.toString();
        }
        accessibilityNodeInfo.setText(formatString);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
