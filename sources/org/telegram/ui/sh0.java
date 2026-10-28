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
public final class sh0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.p6 {
    public static final org.telegram.ui.Components.tc0 f43329n;
    public static final org.telegram.ui.Components.tc0 f43330r;
    public final int f43331a;
    public final org.telegram.ui.Components.y9 f43332b;
    public final org.telegram.ui.ActionBar.b6 f43333c;
    public final TextView d;
    public final org.telegram.ui.Components.j9 e;
    public final org.telegram.ui.Components.rx0 f43334f;
    public TLObject h;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.y6.f23749y6;
        f43329n = new org.telegram.ui.Components.tc0(i10, i11);
        f43330r = new org.telegram.ui.Components.tc0(R.drawable.mini_checklist_done_outline, i11);
    }

    public sh0(Context context) {
        super(context);
        int i10;
        this.f43331a = UserConfig.selectedAccount;
        this.e = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f43332b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f43333c = b6Var;
        b6Var.setTextSize(16);
        b6Var.setEllipsizeByGradient(!LocaleController.isRTL);
        b6Var.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.E8, null);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        b6Var.setGravity(i10);
        this.f43334f = new org.telegram.ui.Components.rx0(this);
        b6Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23749y6, null);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (LocaleController.isRTL) {
            addView(y9Var, org.telegram.ui.Components.kb1.h(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(b6Var, org.telegram.ui.Components.kb1.h(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(y9Var, org.telegram.ui.Components.kb1.h(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(b6Var, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, boolean z10, int i10) {
        org.telegram.ui.Components.tc0 tc0Var;
        this.h = tLObject;
        org.telegram.ui.Components.r5 a2 = this.f43334f.a(tLObject, false, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23771z9, false));
        org.telegram.ui.ActionBar.b6 b6Var = this.f43333c;
        b6Var.i(a2);
        if (tLObject != null) {
            org.telegram.ui.Components.j9 j9Var = this.e;
            int i11 = this.f43331a;
            j9Var.j(i11, tLObject);
            this.f43332b.h(ImageLocation.getForUserOrChat(i11, tLObject, 1), "50_50", j9Var, tLObject);
            b6Var.l(ContactsController.formatName(tLObject), false);
        }
        TextView textView = this.d;
        if (i10 <= 0) {
            textView.setVisibility(8);
            b6Var.setTranslationY(AndroidUtilities.dp(9.0f));
            return;
        }
        if (z10) {
            tc0Var = f43330r;
        } else {
            tc0Var = f43329n;
        }
        textView.setText(TextUtils.concat(tc0Var.a(getContext(), null), LocaleController.formatSeenDate(i10)));
        textView.setVisibility(0);
        b6Var.setTranslationY(0.0f);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23771z9));
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
            if (user != null && user2 != null && user.f22177id == user2.f22177id) {
                this.h = user2;
                this.f43333c.i(this.f43334f.a(user2, true, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23771z9, false)));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43334f.f32396a.a();
        NotificationCenter.getInstance(this.f43331a).addWeakObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43334f.f32396a.b();
        NotificationCenter.getInstance(this.f43331a).removeObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String formatString = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, this.f43333c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder l4 = org.telegram.ui.Components.b10.l(formatString, " ");
            l4.append((Object) textView.getText());
            formatString = l4.toString();
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
        org.telegram.ui.Components.rx0 rx0Var = this.f43334f;
        if (rx0Var != null) {
            try {
                org.telegram.ui.Components.r5 r5Var = rx0Var.f32396a;
                if (r5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23771z9, false);
                    Integer num = r5Var.F;
                    if (num != null && num.intValue() != x02) {
                        r5Var.k(Integer.valueOf(x02));
                        org.telegram.ui.ActionBar.b6 b6Var = this.f43333c;
                        if (b6Var != null) {
                            b6Var.invalidate();
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
