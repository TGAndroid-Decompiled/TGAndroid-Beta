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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.LaunchActivity;
public abstract class x {
    public static mg.i f44857a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        boolean z12;
        mg.i iVar = f44857a;
        if (iVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f14827r = new mg.c(frameLayout, 3);
                frameLayout.E = new ArrayList();
                mg.f fVar = new mg.f(frameLayout);
                frameLayout.e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                k2.u uVar = new k2.u(launchActivity, fVar);
                ((GestureDetector) uVar.f13384b).setIsLongpressEnabled(false);
                ci.n6 n6Var = new ci.n6(frameLayout, launchActivity, uVar, 2);
                frameLayout.f14822a = n6Var;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.O9, false), PorterDuff.Mode.SRC_IN));
                n6Var.addView(imageView);
                n6Var.setVisibility(8);
                frameLayout.addView(n6Var, x5.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f14829w = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f14830x = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.DebugMenu));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
                linearLayout.addView(textView, x5.n(-1, -2));
                ll0 ll0Var = new ll0(launchActivity, null);
                frameLayout.f14831y = ll0Var;
                ll0Var.setLayoutManager(new s4.c0());
                ll0Var.setAdapter(new mg.g((mg.i) frameLayout, launchActivity));
                ll0Var.setOnItemClickListener(new ai.g(frameLayout, 13));
                linearLayout.addView(ll0Var, x5.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, x5.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f44857a = frameLayout;
                launchActivity.f30853w0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                mg.i iVar2 = f44857a;
                iVar2.f14822a.setVisibility(0);
                o1.k kVar = new o1.k(new o1.j(0.0f));
                kVar.f15349u = org.telegram.ui.Cells.q3.l(1000.0f, 750.0f, 0.75f);
                kVar.b(new ai.qa(2, iVar2));
                kVar.f();
            } else {
                iVar.getClass();
                launchActivity.f30853w0.removeView(f44857a);
                f44857a = null;
            }
            if (z11) {
                SharedConfig.isFloatingDebugActive = z10;
                SharedConfig.saveConfig();
            }
        }
    }
}
