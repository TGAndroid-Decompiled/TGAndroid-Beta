package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class wa1 extends org.telegram.ui.ActionBar.g3 {
    public static wa1 f39328b;

    public static void m(wa1 wa1Var, qy qyVar) {
        if (qyVar.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(wa1Var.currentAccount).clearQueryTime();
        qyVar.getMessagesStorage().clearLocalDatabase();
    }

    public static void n(qy qyVar) {
        if (f39328b == null) {
            ?? g3Var = new org.telegram.ui.ActionBar.g3(qyVar.getParentActivity(), false);
            Activity parentActivity = qyVar.getParentActivity();
            LinearLayout h = kf.k0.h(parentActivity, 1);
            org.telegram.ui.Components.ax0 ax0Var = new org.telegram.ui.Components.ax0(parentActivity, g3Var.currentAccount);
            ax0Var.setStickerNum(7);
            ax0Var.getImageReceiver().setAutoRepeat(1);
            h.addView(ax0Var, k7.b6.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.j6.f19987j5;
            org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.j6.w0(null, i10, false), 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
            h.addView(textView, k7.b6.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(qyVar.getMessagesStorage().getDatabaseSize()))));
            h.addView(textView2, k7.b6.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ClearLocalDatabase));
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
            int dp = AndroidUtilities.dp(6.0f);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false), 120);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w02, k10, k10));
            h.addView(textView3, k7.b6.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new ib0(23, g3Var, qyVar));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(h);
            g3Var.setCustomView(scrollView);
            f39328b = g3Var;
            g3Var.show();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        f39328b = null;
    }
}
