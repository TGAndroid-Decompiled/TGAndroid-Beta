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
import org.telegram.ui.Components.vl0;
import org.telegram.ui.LaunchActivity;
public abstract class n {
    public static lg.i f43740a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        boolean z12;
        lg.i iVar = f43740a;
        if (iVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f12958r = new lg.c(frameLayout, 3);
                frameLayout.E = new ArrayList();
                lg.f fVar = new lg.f(frameLayout);
                frameLayout.e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                l2.h hVar = new l2.h(launchActivity, fVar);
                ((GestureDetector) hVar.f12721b).setIsLongpressEnabled(false);
                bi.n7 n7Var = new bi.n7(frameLayout, launchActivity, hVar, 2);
                frameLayout.f12953a = n7Var;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false), PorterDuff.Mode.SRC_IN));
                n7Var.addView(imageView);
                n7Var.setVisibility(8);
                frameLayout.addView(n7Var, a6.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f12960w = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f12961x = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.DebugMenu));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
                linearLayout.addView(textView, a6.n(-1, -2));
                vl0 vl0Var = new vl0(launchActivity, null);
                frameLayout.f12962y = vl0Var;
                vl0Var.setLayoutManager(new s4.c0());
                vl0Var.setAdapter(new lg.g((lg.i) frameLayout, launchActivity));
                vl0Var.setOnItemClickListener(new ai.g(frameLayout, 12));
                linearLayout.addView(vl0Var, a6.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, a6.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f43740a = frameLayout;
                launchActivity.f29969w0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                lg.i iVar2 = f43740a;
                iVar2.f12953a.setVisibility(0);
                o1.k kVar = new o1.k(new o1.j(0.0f));
                kVar.f14134u = org.telegram.ui.Cells.r6.l(1000.0f, 750.0f, 0.75f);
                kVar.b(new bi.i6(1, iVar2));
                kVar.f();
            } else {
                iVar.getClass();
                launchActivity.f29969w0.removeView(f43740a);
                f43740a = null;
            }
            if (z11) {
                SharedConfig.isFloatingDebugActive = z10;
                SharedConfig.saveConfig();
            }
        }
    }
}
