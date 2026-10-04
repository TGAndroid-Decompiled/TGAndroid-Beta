package rg;

import ai.e2;
import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.x5;
import w7.z5;
public final class d1 extends f3 {
    public d1(n2 n2Var) {
        super(n2Var.getParentActivity(), false);
        Activity parentActivity = n2Var.getParentActivity();
        LinearLayout e7 = org.telegram.messenger.q.e(parentActivity, 1);
        TextView textView = new TextView(parentActivity);
        textView.setGravity(8388611);
        int i10 = i6.f20930j5;
        org.telegram.messenger.q.q(textView, i6.w0(null, i10, false), 1, 20.0f);
        e7.addView(textView, z5.d(-1, -2.0f, 0, 21.0f, 16.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(8388611);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(i6.w0(null, i10, false));
        e7.addView(textView2, z5.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
        TextView textView3 = new TextView(parentActivity);
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        org.telegram.messenger.q.q(textView3, i6.w0(null, i6.Sh, false), 1, 14.0f);
        textView3.setBackground(x5.f(new float[]{8.0f}, i6.Oh));
        textView3.setText(LocaleController.getString(R.string.InstallOfficialApp));
        textView3.setOnClickListener(new e2(23));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.addView(textView3, z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout.setBackgroundColor(getThemedColor(i6.f20894h5));
        e7.addView(frameLayout, z5.q(-1, 68, 80));
        org.telegram.messenger.q.m(R.string.SubscribeToPremiumOfficialAppNeeded, textView);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SubscribeToPremiumOfficialAppNeededDescription)));
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(e7);
        setCustomView(scrollView);
    }
}
