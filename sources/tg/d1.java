package tg;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
public final class d1 extends k3 {
    public d1(r2 r2Var) {
        super(r2Var.getParentActivity(), false);
        Activity parentActivity = r2Var.getParentActivity();
        LinearLayout f7 = org.telegram.messenger.t.f(parentActivity, 1);
        TextView textView = new TextView(parentActivity);
        textView.setGravity(8388611);
        int i10 = y6.f23465j5;
        org.telegram.messenger.t.r(textView, i10, null, 1, 20.0f);
        f7.addView(textView, kb1.h(-1, -2.0f, 0, 21.0f, 16.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(8388611);
        textView2.setTextSize(1, 16.0f);
        f7.V(textView2, i10, null);
        f7.addView(textView2, kb1.h(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
        TextView textView3 = new TextView(parentActivity);
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        org.telegram.messenger.t.r(textView3, y6.Sh, null, 1, 14.0f);
        textView3.setBackground(o6.f(new float[]{8.0f}, y6.Oh));
        textView3.setText(LocaleController.getString(R.string.InstallOfficialApp));
        textView3.setOnClickListener(new bh.f(26));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.addView(textView3, kb1.h(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        f7.i(y6.f23428h5, frameLayout, this.resourcesProvider);
        f7.addView(frameLayout, kb1.u(-1, 68, 80));
        org.telegram.messenger.t.n(R.string.SubscribeToPremiumOfficialAppNeeded, textView);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SubscribeToPremiumOfficialAppNeededDescription)));
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(f7);
        setCustomView(scrollView);
    }
}
