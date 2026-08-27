package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
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

public final class rj0 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {

    public final qj0 f41947b;

    public final org.telegram.ui.Components.ri0 f41948c;
    public Utilities.Callback d;

    public rj0(Context context, boolean z10, Utilities.Callback callback) {
        super(context, false);
        final int i10 = 0;
        this.d = callback;
        final int i11 = 1;
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.f41948c = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        ri0Var.f(R.raw.silent_unmute, 46, 46, null);
        ri0Var.d();
        int iDp = AndroidUtilities.dp(72.0f);
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        ri0Var.setBackground(org.telegram.ui.ActionBar.g6.K(iDp, org.telegram.ui.ActionBar.g6.w0(null, i12, false)));
        frameLayout.addView(ri0Var, h7.z5.e(72, 72, 17));
        qj0 qj0Var = new qj0(context);
        this.f41947b = qj0Var;
        frameLayout.addView(qj0Var, h7.z5.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        qj0Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) {

            public final rj0 f41372b;

            {
                this.f41372b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        org.telegram.ui.Components.ri0 ri0Var2 = this.f41372b.f41948c;
                        if (!ri0Var2.b()) {
                            ri0Var2.setProgress(0.0f);
                            ri0Var2.d();
                        }
                        break;
                    default:
                        rj0 rj0Var = this.f41372b;
                        Utilities.Callback callback2 = rj0Var.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            rj0Var.d = null;
                        }
                        rj0Var.dismiss();
                        break;
                }
            }
        });
        linearLayoutG.addView(frameLayout, h7.z5.n(-1, 110));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.g6.f23161j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setPadding(org.telegram.ui.Cells.pa.c(30.0f, R.string.NotificationsPermissionAlertTitle, textView), 0, AndroidUtilities.dp(30.0f), 0);
        linearLayoutG.addView(textView, h7.z5.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setPadding(org.telegram.ui.Cells.pa.c(30.0f, R.string.NotificationsPermissionAlertSubtitle, textView2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(21.0f));
        linearLayoutG.addView(textView2, h7.z5.n(-1, -2));
        linearLayoutG.addView(new ag.d(context, LocaleController.getString(R.string.NotificationsPermissionAlert1), R.drawable.msg_message_s), h7.z5.n(-1, -2));
        linearLayoutG.addView(new ag.d(context, LocaleController.getString(R.string.NotificationsPermissionAlert2), R.drawable.msg_members_list2), h7.z5.n(-1, -2));
        linearLayoutG.addView(new ag.d(context, LocaleController.getString(R.string.NotificationsPermissionAlert3), R.drawable.msg_customize_s), h7.z5.n(-1, -2));
        setCustomView(linearLayoutG);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
        TextView textView3 = new TextView(context);
        textView3.setText(LocaleController.getString(z10 ? R.string.NotificationsPermissionSettings : R.string.NotificationsPermissionContinue));
        textView3.setGravity(17);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        textView3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.g6.w0(null, i12, false)));
        textView3.setOnClickListener(new View.OnClickListener(this) {

            public final rj0 f41372b;

            {
                this.f41372b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        org.telegram.ui.Components.ri0 ri0Var2 = this.f41372b.f41948c;
                        if (!ri0Var2.b()) {
                            ri0Var2.setProgress(0.0f);
                            ri0Var2.d();
                        }
                        break;
                    default:
                        rj0 rj0Var = this.f41372b;
                        Utilities.Callback callback2 = rj0Var.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            rj0Var.d = null;
                        }
                        rj0Var.dismiss();
                        break;
                }
            }
        });
        linearLayoutG.addView(textView3, h7.z5.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        while (i10 < 4) {
            try {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
            } catch (Exception unused) {
            }
            i10++;
        }
    }

    public static void m() {
        long j10 = MessagesController.getGlobalMainSettings().getLong("askNotificationsDuration", 86400000L);
        long jCurrentTimeMillis = System.currentTimeMillis() + j10;
        long j11 = 259200000;
        if (j10 >= 259200000) {
            j11 = 604800000;
            if (j10 >= 604800000) {
                j11 = 2592000000L;
            }
        }
        MessagesController.getGlobalMainSettings().edit().putLong("askNotificationsAfter", jCurrentTimeMillis).putLong("askNotificationsDuration", j11).apply();
    }

    public static boolean n(Activity activity) {
        if (Build.VERSION.SDK_INT < 23 || activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return false;
        }
        long j10 = MessagesController.getGlobalMainSettings().getLong("askNotificationsAfter", -1L);
        if (j10 != -2) {
            return j10 < 0 || System.currentTimeMillis() >= j10;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) >= 0) {
                int mainUnreadCount = 0;
                for (int i12 = 0; i12 < 4; i12++) {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                    if (messagesStorage != null) {
                        mainUnreadCount = messagesStorage.getMainUnreadCount() + mainUnreadCount;
                    }
                }
                if (this.f41947b.a(mainUnreadCount)) {
                    org.telegram.ui.Components.ri0 ri0Var = this.f41948c;
                    if (ri0Var.b()) {
                        return;
                    }
                    ri0Var.setProgress(0.0f);
                    ri0Var.d();
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
