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
public final class zh0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Components.zb0 f40150n;
    public static final org.telegram.ui.Components.zb0 f40151r;
    public final int f40152a;
    public final org.telegram.ui.Components.w9 f40153b;
    public final org.telegram.ui.ActionBar.i5 f40154c;
    public final TextView d;
    public final org.telegram.ui.Components.h9 e;
    public final org.telegram.ui.Components.kw0 f40155f;
    public TLObject h;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.h6.f19170y6;
        f40150n = new org.telegram.ui.Components.zb0(i10, i11);
        f40151r = new org.telegram.ui.Components.zb0(R.drawable.mini_checklist_done_outline, i11);
    }

    public zh0(Context context) {
        super(context);
        int i10;
        this.f40152a = UserConfig.selectedAccount;
        this.e = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f40153b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f40154c = i5Var;
        i5Var.setTextSize(16);
        i5Var.setEllipsizeByGradient(!LocaleController.isRTL);
        i5Var.setImportantForAccessibility(2);
        i5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E8, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        i5Var.setGravity(i10);
        this.f40155f = new org.telegram.ui.Components.kw0(this);
        i5Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19170y6, false));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (LocaleController.isRTL) {
            addView(w9Var, w7.x5.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(i5Var, w7.x5.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, w7.x5.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(w9Var, w7.x5.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(i5Var, w7.x5.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, w7.x5.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, boolean z10, int i10) {
        org.telegram.ui.Components.o5 a2;
        org.telegram.ui.Components.zb0 zb0Var;
        this.h = tLObject;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19192z9, false);
        boolean z11 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.kw0 kw0Var = this.f40155f;
        if (z11) {
            a2 = kw0Var.a((TLRPC.User) tLObject, null, w02, false);
        } else if (tLObject instanceof TLRPC.Chat) {
            a2 = kw0Var.a(null, (TLRPC.Chat) tLObject, w02, false);
        } else {
            a2 = kw0Var.a(null, null, w02, false);
        }
        org.telegram.ui.ActionBar.i5 i5Var = this.f40154c;
        i5Var.i(a2);
        if (tLObject != null) {
            org.telegram.ui.Components.h9 h9Var = this.e;
            int i11 = this.f40152a;
            h9Var.j(i11, tLObject);
            this.f40153b.h(ImageLocation.getForUserOrChat(i11, tLObject, 1), "50_50", h9Var, tLObject);
            i5Var.l(ContactsController.formatName(tLObject), false);
        }
        TextView textView = this.d;
        if (i10 <= 0) {
            textView.setVisibility(8);
            i5Var.setTranslationY(AndroidUtilities.dp(9.0f));
            return;
        }
        if (z10) {
            zb0Var = f40151r;
        } else {
            zb0Var = f40150n;
        }
        textView.setText(TextUtils.concat(zb0Var.a(getContext(), null), LocaleController.formatSeenDate(i10)));
        textView.setVisibility(0);
        i5Var.setTranslationY(0.0f);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.User user;
        org.telegram.ui.Components.o5 a2;
        if (i10 == NotificationCenter.userEmojiStatusUpdated) {
            TLRPC.User user2 = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
            } else {
                user = null;
            }
            if (user != null && user2 != null && user.f18230id == user2.f18230id) {
                this.h = user2;
                int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19192z9, false);
                boolean z10 = user2 instanceof TLRPC.User;
                org.telegram.ui.Components.kw0 kw0Var = this.f40155f;
                if (z10) {
                    a2 = kw0Var.a(user2, null, w02, true);
                } else {
                    a2 = kw0Var.a(null, null, w02, true);
                }
                this.f40154c.i(a2);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40155f.f25712a.a();
        NotificationCenter.getInstance(this.f40152a).addObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40155f.f25712a.b();
        NotificationCenter.getInstance(this.f40152a).removeObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String formatString = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, this.f40154c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder h = w.c.h(formatString, " ");
            h.append((Object) textView.getText());
            formatString = h.toString();
        }
        accessibilityNodeInfo.setText(formatString);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
