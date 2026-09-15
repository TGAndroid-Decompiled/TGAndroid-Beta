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
public final class c1 extends f3 {
    public c1(n2 n2Var) {
        super(n2Var.getParentActivity(), false);
        Activity parentActivity = n2Var.getParentActivity();
        LinearLayout f7 = org.telegram.messenger.w1.f(parentActivity, 1);
        TextView textView = new TextView(parentActivity);
        textView.setGravity(8388611);
        int i10 = i6.f18943j5;
        org.telegram.messenger.w1.q(textView, i6.w0(null, i10, false), 1, 20.0f);
        f7.addView(textView, x5.d(-1, -2.0f, 0, 21.0f, 16.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(8388611);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(i6.w0(null, i10, false));
        f7.addView(textView2, x5.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
        TextView textView3 = new TextView(parentActivity);
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        org.telegram.messenger.w1.q(textView3, i6.w0(null, i6.Sh, false), 1, 14.0f);
        textView3.setBackground(y5.f(new float[]{8.0f}, i6.Oh));
        textView3.setText(LocaleController.getString(R.string.InstallOfficialApp));
        textView3.setOnClickListener(new e2(23));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.addView(textView3, x5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout.setBackgroundColor(getThemedColor(i6.f18907h5));
        f7.addView(frameLayout, x5.q(-1, 68, 80));
        org.telegram.messenger.w1.n(R.string.SubscribeToPremiumOfficialAppNeeded, textView);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SubscribeToPremiumOfficialAppNeededDescription)));
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(f7);
        setCustomView(scrollView);
    }
}
