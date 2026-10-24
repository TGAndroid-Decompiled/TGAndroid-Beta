package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class tj0 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public final sj0 f42074b;
    public final org.telegram.ui.Components.ak0 f42075c;
    public Utilities.Callback d;

    public tj0(Context context, boolean z10, Utilities.Callback callback) {
        super(context, false);
        int i10;
        this.d = callback;
        LinearLayout e = org.telegram.messenger.tl.e(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.f42075c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.silent_unmute, 46, 46, null);
        imageView.d();
        int dp = AndroidUtilities.dp(72.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        imageView.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(imageView, K, O, null, null);
        frameLayout.addView((View) imageView, w7.z5.e(72, 72, 17));
        sj0 sj0Var = new sj0(context);
        this.f42074b = sj0Var;
        frameLayout.addView(sj0Var, w7.z5.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        sj0Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final tj0 f41173b;

            {
                this.f41173b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.ak0 ak0Var = this.f41173b.f42075c;
                        if (!ak0Var.b()) {
                            ak0Var.setProgress(0.0f);
                            ak0Var.d();
                            return;
                        }
                        return;
                    default:
                        tj0 tj0Var = this.f41173b;
                        Utilities.Callback callback2 = tj0Var.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            tj0Var.d = null;
                        }
                        tj0Var.dismiss();
                        return;
                }
            }
        });
        e.addView(frameLayout, w7.z5.n(-1, 110));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.k6.f21290j5;
        org.telegram.ui.ActionBar.r6.W(textView, i12, null);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setPadding(org.telegram.ui.Cells.b1.e(30.0f, R.string.NotificationsPermissionAlertTitle, textView), 0, AndroidUtilities.dp(30.0f), 0);
        e.addView(textView, w7.z5.n(-1, -2));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView2, i12, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setPadding(org.telegram.ui.Cells.b1.e(30.0f, R.string.NotificationsPermissionAlertSubtitle, textView2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(21.0f));
        e.addView(textView2, w7.z5.n(-1, -2));
        e.addView(new ci.h4(context, LocaleController.getString(R.string.NotificationsPermissionAlert1), R.drawable.msg_message_s), w7.z5.n(-1, -2));
        e.addView(new ci.h4(context, LocaleController.getString(R.string.NotificationsPermissionAlert2), R.drawable.msg_members_list2), w7.z5.n(-1, -2));
        e.addView(new ci.h4(context, LocaleController.getString(R.string.NotificationsPermissionAlert3), R.drawable.msg_customize_s), w7.z5.n(-1, -2));
        setCustomView(e);
        fixNavigationBarKey(org.telegram.ui.ActionBar.k6.f21255h5);
        TextView textView3 = new TextView(context);
        if (z10) {
            i10 = R.string.NotificationsPermissionSettings;
        } else {
            i10 = R.string.NotificationsPermissionContinue;
        }
        textView3.setText(LocaleController.getString(i10));
        textView3.setGravity(17);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.Sh, null);
        org.telegram.ui.Cells.y e7 = org.telegram.ui.ActionBar.a6.e(new float[]{24.0f}, org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i11);
        org.telegram.ui.ActionBar.n6 f7 = org.telegram.ui.ActionBar.r6.f(i11);
        textView3.setBackground(e7);
        org.telegram.ui.ActionBar.r6.k(textView3, e7, O2, f7, null);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final tj0 f41173b;

            {
                this.f41173b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.ak0 ak0Var = this.f41173b.f42075c;
                        if (!ak0Var.b()) {
                            ak0Var.setProgress(0.0f);
                            ak0Var.d();
                            return;
                        }
                        return;
                    default:
                        tj0 tj0Var = this.f41173b;
                        Utilities.Callback callback2 = tj0Var.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            tj0Var.d = null;
                        }
                        tj0Var.dismiss();
                        return;
                }
            }
        });
        e.addView(textView3, w7.z5.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        for (int i13 = 0; i13 < 4; i13++) {
            try {
                NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.updateInterfaces);
            } catch (Exception unused) {
            }
        }
    }

    public static void m() {
        long j10 = MessagesController.getGlobalMainSettings().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j10;
        long j11 = 259200000;
        if (j10 >= 259200000) {
            j11 = 604800000;
            if (j10 >= 604800000) {
                j11 = 2592000000L;
            }
        }
        MessagesController.getGlobalMainSettings().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j11).apply();
    }

    public static boolean n(Activity activity) {
        if (activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
            long j10 = MessagesController.getGlobalMainSettings().getLong("askNotificationsAfter", -1L);
            if (j10 != -2) {
                if (j10 < 0 || System.currentTimeMillis() >= j10) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) >= 0) {
                int i12 = 0;
                for (int i13 = 0; i13 < 4; i13++) {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                    if (messagesStorage != null) {
                        i12 = messagesStorage.getMainUnreadCount() + i12;
                    }
                }
                if (this.f42074b.a(i12)) {
                    org.telegram.ui.Components.ak0 ak0Var = this.f42075c;
                    if (!ak0Var.b()) {
                        ak0Var.setProgress(0.0f);
                        ak0Var.d();
                    }
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        Utilities.Callback callback = this.d;
        if (callback != null) {
            callback.run(Boolean.FALSE);
            this.d = null;
            m();
        }
        for (int i10 = 0; i10 < 4; i10++) {
            try {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        System.currentTimeMillis();
    }
}
