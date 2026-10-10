package w7;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.LaunchActivity;
public abstract class w {
    public static mg.i f50200a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        boolean z12;
        mg.i iVar = f50200a;
        if (iVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f16443r = new mg.c(frameLayout, 3);
                frameLayout.E = new ArrayList();
                mg.f fVar = new mg.f(frameLayout);
                frameLayout.f16440e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                m.f3 f3Var = new m.f3(launchActivity, fVar);
                ((GestureDetector) f3Var.f15672b).setIsLongpressEnabled(false);
                ci.m6 m6Var = new ci.m6(frameLayout, launchActivity, f3Var, 2);
                frameLayout.f16437a = m6Var;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.O9, false), PorterDuff.Mode.SRC_IN));
                m6Var.addView(imageView);
                m6Var.setVisibility(8);
                frameLayout.addView(m6Var, x5.d(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f16445w = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f16446x = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.DebugMenu));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
                linearLayout.addView(textView, x5.n(-1, -2));
                rm0 rm0Var = new rm0(launchActivity, null);
                frameLayout.f16447y = rm0Var;
                rm0Var.setLayoutManager(new s4.d0());
                rm0Var.setAdapter(new mg.g((mg.i) frameLayout, launchActivity));
                rm0Var.setOnItemClickListener(new ai.g(frameLayout, 13));
                linearLayout.addView(rm0Var, x5.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, x5.a(-1.0f, 8.0f, 8.0f, 8.0f, 8.0f, -1, 0));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f50200a = frameLayout;
                launchActivity.f33857w0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                mg.i iVar2 = f50200a;
                iVar2.f16437a.setVisibility(0);
                o1.k kVar = new o1.k(new o1.j(0.0f));
                kVar.f16942u = org.telegram.ui.Cells.c1.j(1000.0f, 750.0f, 0.75f);
                kVar.b(new ai.ra(2, iVar2));
                kVar.h();
            } else {
                iVar.getClass();
                launchActivity.f33857w0.removeView(f50200a);
                f50200a = null;
            }
            if (z11) {
                SharedConfig.isFloatingDebugActive = z10;
                SharedConfig.saveConfig();
            }
        }
    }
}
