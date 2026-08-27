package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

public final class y91 extends org.telegram.ui.ActionBar.e3 {

    public static y91 f44746b;

    public static void m(y91 y91Var, gy gyVar) {
        if (gyVar.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(y91Var.currentAccount).clearQueryTime();
        gyVar.getMessagesStorage().clearLocalDatabase();
    }

    public static void n(gy gyVar) {
        if (f44746b == null) {
            y91 y91Var = new y91(gyVar.getParentActivity(), false);
            Activity parentActivity = gyVar.getParentActivity();
            LinearLayout linearLayoutF = org.telegram.messenger.y1.f(parentActivity, 1);
            org.telegram.ui.Components.jw0 jw0Var = new org.telegram.ui.Components.jw0(parentActivity, y91Var.currentAccount);
            jw0Var.setStickerNum(7);
            jw0Var.getImageReceiver().setAutoRepeat(1);
            linearLayoutF.addView(jw0Var, h7.z5.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
            org.telegram.messenger.y1.s(textView, org.telegram.ui.ActionBar.g6.w0(null, i10, false), 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
            linearLayoutF.addView(textView, h7.z5.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(gyVar.getMessagesStorage().getDatabaseSize()))));
            linearLayoutF.addView(textView2, h7.z5.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ClearLocalDatabase));
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
            int iDp = AndroidUtilities.dp(6.0f);
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
            int iK = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false), 120);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iW0, iK, iK));
            linearLayoutF.addView(textView3, h7.z5.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new u70(26, y91Var, gyVar));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(linearLayoutF);
            y91Var.setCustomView(scrollView);
            f44746b = y91Var;
            y91Var.show();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        f44746b = null;
    }
}
