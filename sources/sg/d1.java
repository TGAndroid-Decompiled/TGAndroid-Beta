package sg;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import w7.z5;
public final class d1 extends h3 {
    public d1(o2 o2Var) {
        super(o2Var.getParentActivity(), false);
        Activity parentActivity = o2Var.getParentActivity();
        LinearLayout f7 = org.telegram.messenger.v0.f(parentActivity, 1);
        TextView textView = new TextView(parentActivity);
        textView.setGravity(8388611);
        int i10 = k6.f21289j5;
        org.telegram.messenger.v0.q(textView, i10, null, 1, 20.0f);
        f7.addView(textView, z5.d(-1, -2.0f, 0, 21.0f, 16.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(8388611);
        textView2.setTextSize(1, 16.0f);
        r6.W(textView2, i10, null);
        f7.addView(textView2, z5.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
        TextView textView3 = new TextView(parentActivity);
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        org.telegram.messenger.v0.q(textView3, k6.Sh, null, 1, 14.0f);
        textView3.setBackground(a6.f(new float[]{8.0f}, k6.Oh));
        textView3.setText(LocaleController.getString(R.string.InstallOfficialApp));
        textView3.setOnClickListener(new ah.f(26));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.addView(textView3, z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        r6.i(k6.f21254h5, frameLayout, this.resourcesProvider);
        f7.addView(frameLayout, z5.q(-1, 68, 80));
        org.telegram.messenger.v0.m(R.string.SubscribeToPremiumOfficialAppNeeded, textView);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SubscribeToPremiumOfficialAppNeededDescription)));
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(f7);
        setCustomView(scrollView);
    }
}
