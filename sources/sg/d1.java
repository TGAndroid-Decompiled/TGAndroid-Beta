package sg;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.w5;
import w7.z5;
public final class d1 extends e3 {
    public d1(m2 m2Var) {
        super(m2Var.getParentActivity(), false);
        Activity parentActivity = m2Var.getParentActivity();
        LinearLayout e = org.telegram.messenger.g0.e(parentActivity, 1);
        TextView textView = new TextView(parentActivity);
        textView.setGravity(8388611);
        int i10 = g6.f19707j5;
        org.telegram.messenger.g0.m(20.0f, g6.x0(null, i10, false), 1, textView);
        e.addView(textView, z5.a(-2.0f, 21.0f, 16.0f, 21.0f, 0.0f, -1, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(8388611);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(g6.x0(null, i10, false));
        e.addView(textView2, z5.a(-2.0f, 21.0f, 15.0f, 21.0f, 16.0f, -1, 0));
        TextView textView3 = new TextView(parentActivity);
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        org.telegram.messenger.g0.m(14.0f, g6.x0(null, g6.Sh, false), 1, textView3);
        textView3.setBackground(w5.f(new float[]{8.0f}, g6.Oh));
        textView3.setText(LocaleController.getString(R.string.InstallOfficialApp));
        textView3.setOnClickListener(new ah.f(24));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.addView(textView3, z5.a(48.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 16));
        frameLayout.setBackgroundColor(getThemedColor(g6.f19672h5));
        e.addView(frameLayout, z5.q(-1, 68, 80));
        org.telegram.messenger.g0.n(R.string.SubscribeToPremiumOfficialAppNeeded, textView);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SubscribeToPremiumOfficialAppNeededDescription)));
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(e);
        setCustomView(scrollView);
    }
}
