package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class z91 extends org.telegram.ui.ActionBar.f3 {
    public static z91 f43695b;

    public static void n(z91 z91Var, ey eyVar) {
        if (eyVar.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(z91Var.currentAccount).clearQueryTime();
        eyVar.getMessagesStorage().clearLocalDatabase();
    }

    public static void o(ey eyVar) {
        if (f43695b == null) {
            ?? f3Var = new org.telegram.ui.ActionBar.f3(eyVar.getParentActivity(), false);
            Activity parentActivity = eyVar.getParentActivity();
            LinearLayout e = org.telegram.messenger.g0.e(parentActivity, 1);
            org.telegram.ui.Components.sx0 sx0Var = new org.telegram.ui.Components.sx0(parentActivity, f3Var.currentAccount);
            sx0Var.setStickerNum(7);
            sx0Var.getImageReceiver().setAutoRepeat(1);
            e.addView(sx0Var, w7.z5.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.h6.f21092j5;
            org.telegram.messenger.g0.m(20.0f, org.telegram.ui.ActionBar.h6.x0(null, i10, false), 1, textView);
            textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
            e.addView(textView, w7.z5.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(eyVar.getMessagesStorage().getDatabaseSize()))));
            e.addView(textView2, w7.z5.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ClearLocalDatabase));
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
            int dp = AndroidUtilities.dp(6.0f);
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false), 120);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, x02, o10, o10));
            e.addView(textView3, w7.z5.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new ef0(18, f3Var, eyVar));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(e);
            f3Var.setCustomView(scrollView);
            f43695b = f3Var;
            f3Var.show();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        f43695b = null;
    }
}
