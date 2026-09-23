package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class za1 extends org.telegram.ui.ActionBar.f3 {
    public static za1 f40096b;

    public static void m(za1 za1Var, ry ryVar) {
        if (ryVar.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(za1Var.currentAccount).clearQueryTime();
        ryVar.getMessagesStorage().clearLocalDatabase();
    }

    public static void n(ry ryVar) {
        if (f40096b == null) {
            ?? f3Var = new org.telegram.ui.ActionBar.f3(ryVar.getParentActivity(), false);
            Activity parentActivity = ryVar.getParentActivity();
            LinearLayout f7 = org.telegram.messenger.z0.f(parentActivity, 1);
            org.telegram.ui.Components.yw0 yw0Var = new org.telegram.ui.Components.yw0(parentActivity, f3Var.currentAccount);
            yw0Var.setStickerNum(7);
            yw0Var.getImageReceiver().setAutoRepeat(1);
            f7.addView(yw0Var, w7.x5.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.h6.f18895j5;
            org.telegram.messenger.z0.q(textView, org.telegram.ui.ActionBar.h6.w0(null, i10, false), 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
            f7.addView(textView, w7.x5.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(ryVar.getMessagesStorage().getDatabaseSize()))));
            f7.addView(textView2, w7.x5.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ClearLocalDatabase));
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
            int dp = AndroidUtilities.dp(6.0f);
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false);
            int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false), 120);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, w02, k10, k10));
            f7.addView(textView3, w7.x5.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new py0(8, f3Var, ryVar));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(f7);
            f3Var.setCustomView(scrollView);
            f40096b = f3Var;
            f3Var.show();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        f40096b = null;
    }
}
