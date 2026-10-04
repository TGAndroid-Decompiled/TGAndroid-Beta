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
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
public abstract class y {
    public static mg.i f48883a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        boolean z12;
        mg.i iVar = f48883a;
        if (iVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f16430r = new mg.c(frameLayout, 3);
                frameLayout.E = new ArrayList();
                mg.f fVar = new mg.f(frameLayout);
                frameLayout.f16427e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                k2.e eVar = new k2.e(launchActivity, fVar);
                ((GestureDetector) eVar.f14389b).setIsLongpressEnabled(false);
                ci.m6 m6Var = new ci.m6(frameLayout, launchActivity, eVar, 2);
                frameLayout.f16424a = m6Var;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.O9, false), PorterDuff.Mode.SRC_IN));
                m6Var.addView(imageView);
                m6Var.setVisibility(8);
                frameLayout.addView(m6Var, z5.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f16432w = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f16433x = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.DebugMenu));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
                linearLayout.addView(textView, z5.n(-1, -2));
                zl0 zl0Var = new zl0(launchActivity, null);
                frameLayout.f16434y = zl0Var;
                zl0Var.setLayoutManager(new s4.c0());
                zl0Var.setAdapter(new mg.g((mg.i) frameLayout, launchActivity));
                zl0Var.setOnItemClickListener(new ai.g(frameLayout, 13));
                linearLayout.addView(zl0Var, z5.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, z5.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f48883a = frameLayout;
                launchActivity.f33816w0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                mg.i iVar2 = f48883a;
                iVar2.f16424a.setVisibility(0);
                o1.k kVar = new o1.k(new o1.j(0.0f));
                kVar.f16988u = org.telegram.ui.Cells.c1.l(1000.0f, 750.0f, 0.75f);
                kVar.b(new ai.qa(2, iVar2));
                kVar.f();
            } else {
                iVar.getClass();
                launchActivity.f33816w0.removeView(f48883a);
                f48883a = null;
            }
            if (z11) {
                SharedConfig.isFloatingDebugActive = z10;
                SharedConfig.saveConfig();
            }
        }
    }
}
