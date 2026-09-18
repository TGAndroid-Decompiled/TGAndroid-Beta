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
import org.telegram.ui.Components.ml0;
import org.telegram.ui.LaunchActivity;
public abstract class x {
    public static mg.i f44889a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        boolean z12;
        mg.i iVar = f44889a;
        if (iVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f14839r = new mg.c(frameLayout, 3);
                frameLayout.E = new ArrayList();
                mg.f fVar = new mg.f(frameLayout);
                frameLayout.e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                k2.u uVar = new k2.u(launchActivity, fVar);
                ((GestureDetector) uVar.f13385b).setIsLongpressEnabled(false);
                ci.n6 n6Var = new ci.n6(frameLayout, launchActivity, uVar, 2);
                frameLayout.f14834a = n6Var;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false), PorterDuff.Mode.SRC_IN));
                n6Var.addView(imageView);
                n6Var.setVisibility(8);
                frameLayout.addView(n6Var, x5.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f14841w = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f14842x = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.DebugMenu));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
                linearLayout.addView(textView, x5.n(-1, -2));
                ml0 ml0Var = new ml0(launchActivity, null);
                frameLayout.f14843y = ml0Var;
                ml0Var.setLayoutManager(new s4.c0());
                ml0Var.setAdapter(new mg.g((mg.i) frameLayout, launchActivity));
                ml0Var.setOnItemClickListener(new ai.g(frameLayout, 13));
                linearLayout.addView(ml0Var, x5.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, x5.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f44889a = frameLayout;
                launchActivity.f30873w0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                mg.i iVar2 = f44889a;
                iVar2.f14834a.setVisibility(0);
                o1.k kVar = new o1.k(new o1.j(0.0f));
                kVar.f15361u = org.telegram.ui.Cells.p6.l(1000.0f, 750.0f, 0.75f);
                kVar.b(new ai.qa(2, iVar2));
                kVar.f();
            } else {
                iVar.getClass();
                launchActivity.f30873w0.removeView(f44889a);
                f44889a = null;
            }
            if (z11) {
                SharedConfig.isFloatingDebugActive = z10;
                SharedConfig.saveConfig();
            }
        }
    }
}
