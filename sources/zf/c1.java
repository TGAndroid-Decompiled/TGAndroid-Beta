package zf;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.v5;
public final class c1 extends f3 {
    public c1(o2 o2Var) {
        super(o2Var.getParentActivity(), false);
        Activity parentActivity = o2Var.getParentActivity();
        LinearLayout f10 = org.telegram.messenger.l0.f(parentActivity, 1);
        TextView textView = new TextView(parentActivity);
        textView.setGravity(8388611);
        int i9 = f6.f23108j5;
        org.telegram.messenger.l0.q(textView, f6.w0(null, i9, false), 1, 20.0f);
        f10.addView(textView, e6.d(-1, -2.0f, 0, 21.0f, 16.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(8388611);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(f6.w0(null, i9, false));
        f10.addView(textView2, e6.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
        TextView textView3 = new TextView(parentActivity);
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        org.telegram.messenger.l0.q(textView3, f6.w0(null, f6.Sh, false), 1, 14.0f);
        textView3.setBackground(v5.f(new float[]{8.0f}, f6.Oh));
        textView3.setText(LocaleController.getString(R.string.InstallOfficialApp));
        textView3.setOnClickListener(new fh.n(28));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.addView(textView3, e6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout.setBackgroundColor(getThemedColor(f6.f23072h5));
        f10.addView(frameLayout, e6.q(-1, 68, 80));
        org.telegram.messenger.l0.m(R.string.SubscribeToPremiumOfficialAppNeeded, textView);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SubscribeToPremiumOfficialAppNeededDescription)));
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(f10);
        setCustomView(scrollView);
    }
}
