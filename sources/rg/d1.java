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
import org.telegram.ui.ActionBar.y5;
import w7.x5;
public final class d1 extends f3 {
    public d1(n2 n2Var) {
        super(n2Var.getParentActivity(), false);
        Activity parentActivity = n2Var.getParentActivity();
        LinearLayout e7 = org.telegram.messenger.q.e(parentActivity, 1);
        TextView textView = new TextView(parentActivity);
        textView.setGravity(8388611);
        int i10 = i6.f20909j5;
        org.telegram.messenger.q.m(20.0f, i6.x0(null, i10, false), 1, textView);
        e7.addView(textView, x5.a(-2.0f, 21.0f, 16.0f, 21.0f, 0.0f, -1, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(8388611);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(i6.x0(null, i10, false));
        e7.addView(textView2, x5.a(-2.0f, 21.0f, 15.0f, 21.0f, 16.0f, -1, 0));
        TextView textView3 = new TextView(parentActivity);
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        org.telegram.messenger.q.m(14.0f, i6.x0(null, i6.Sh, false), 1, textView3);
        textView3.setBackground(y5.f(new float[]{8.0f}, i6.Oh));
        textView3.setText(LocaleController.getString(R.string.InstallOfficialApp));
        textView3.setOnClickListener(new e2(23));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.addView(textView3, x5.a(48.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 16));
        frameLayout.setBackgroundColor(getThemedColor(i6.f20872h5));
        e7.addView(frameLayout, x5.q(-1, 68, 80));
        org.telegram.messenger.q.n(R.string.SubscribeToPremiumOfficialAppNeeded, textView);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SubscribeToPremiumOfficialAppNeededDescription)));
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(e7);
        setCustomView(scrollView);
    }
}
