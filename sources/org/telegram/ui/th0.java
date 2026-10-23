package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class th0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
    public static final org.telegram.ui.Components.wc0 f42011n;
    public static final org.telegram.ui.Components.wc0 f42012r;
    public final int f42013a;
    public final org.telegram.ui.Components.w9 f42014b;
    public final org.telegram.ui.ActionBar.n5 f42015c;
    public final TextView d;
    public final org.telegram.ui.Components.h9 e;
    public final org.telegram.ui.Components.jx0 f42016f;
    public TLObject h;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.k6.f21571y6;
        f42011n = new org.telegram.ui.Components.wc0(i10, i11);
        f42012r = new org.telegram.ui.Components.wc0(R.drawable.mini_checklist_done_outline, i11);
    }

    public th0(Context context) {
        super(context);
        int i10;
        this.f42013a = UserConfig.selectedAccount;
        this.e = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f42014b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f42015c = n5Var;
        n5Var.setTextSize(16);
        n5Var.setEllipsizeByGradient(!LocaleController.isRTL);
        n5Var.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.E8, null);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        n5Var.setGravity(i10);
        this.f42016f = new org.telegram.ui.Components.jx0(this);
        n5Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21571y6, null);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (LocaleController.isRTL) {
            addView(w9Var, w7.z5.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(n5Var, w7.z5.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, w7.z5.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(w9Var, w7.z5.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(n5Var, w7.z5.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, w7.z5.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, boolean z10, int i10) {
        org.telegram.ui.Components.wc0 wc0Var;
        this.h = tLObject;
        org.telegram.ui.Components.p5 a2 = this.f42016f.a(tLObject, false, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21591z9, false));
        org.telegram.ui.ActionBar.n5 n5Var = this.f42015c;
        n5Var.i(a2);
        if (tLObject != null) {
            org.telegram.ui.Components.h9 h9Var = this.e;
            int i11 = this.f42013a;
            h9Var.j(i11, tLObject);
            this.f42014b.h(ImageLocation.getForUserOrChat(i11, tLObject, 1), "50_50", h9Var, tLObject);
            n5Var.l(ContactsController.formatName(tLObject), false);
        }
        TextView textView = this.d;
        if (i10 <= 0) {
            textView.setVisibility(8);
            n5Var.setTranslationY(AndroidUtilities.dp(9.0f));
            return;
        }
        if (z10) {
            wc0Var = f42012r;
        } else {
            wc0Var = f42011n;
        }
        textView.setText(TextUtils.concat(wc0Var.a(getContext(), null), LocaleController.formatSeenDate(i10)));
        textView.setVisibility(0);
        n5Var.setTranslationY(0.0f);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21591z9));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.User user;
        if (i10 == NotificationCenter.userEmojiStatusUpdated) {
            TLRPC.User user2 = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
            } else {
                user = null;
            }
            if (user != null && user2 != null && user.f20490id == user2.f20490id) {
                this.h = user2;
                this.f42015c.i(this.f42016f.a(user2, true, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21591z9, false)));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42016f.f27775a.a();
        NotificationCenter.getInstance(this.f42013a).addObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42016f.f27775a.b();
        NotificationCenter.getInstance(this.f42013a).removeObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String formatString = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, this.f42015c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder i10 = si.o0.i(formatString, " ");
            i10.append((Object) textView.getText());
            formatString = i10.toString();
        }
        accessibilityNodeInfo.setText(formatString);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        boolean z10;
        org.telegram.ui.Components.jx0 jx0Var = this.f42016f;
        if (jx0Var != null) {
            try {
                org.telegram.ui.Components.p5 p5Var = jx0Var.f27775a;
                if (p5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21591z9, false);
                    Integer num = p5Var.F;
                    if (num != null && num.intValue() != x02) {
                        p5Var.k(Integer.valueOf(x02));
                        org.telegram.ui.ActionBar.n5 n5Var = this.f42015c;
                        if (n5Var != null) {
                            n5Var.invalidate();
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
