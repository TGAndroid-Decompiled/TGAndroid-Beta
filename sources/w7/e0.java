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
import org.telegram.ui.Components.mm0;
import org.telegram.ui.LaunchActivity;
public abstract class e0 {
    public static ng.i f47239a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        boolean z12;
        ng.i iVar = f47239a;
        if (iVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f16378r = new ng.c(frameLayout, 3);
                frameLayout.E = new ArrayList();
                ng.f fVar = new ng.f(frameLayout);
                frameLayout.e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                ji.d4 d4Var = new ji.d4(launchActivity, fVar);
                ((GestureDetector) d4Var.f13233b).setIsLongpressEnabled(false);
                ah.v vVar = new ah.v(frameLayout, launchActivity, d4Var, 4);
                frameLayout.f16373a = vVar;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.O9, false), PorterDuff.Mode.SRC_IN));
                vVar.addView(imageView);
                vVar.setVisibility(8);
                frameLayout.addView(vVar, a6.d(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f16380w = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f16381x = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.DebugMenu));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
                linearLayout.addView(textView, a6.n(-1, -2));
                mm0 mm0Var = new mm0(launchActivity, null);
                frameLayout.f16382y = mm0Var;
                mm0Var.setLayoutManager(new s4.b0());
                mm0Var.setAdapter(new ng.g((ng.i) frameLayout, launchActivity));
                mm0Var.setOnItemClickListener(new bi.d(frameLayout, 13));
                linearLayout.addView(mm0Var, a6.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, a6.a(-1.0f, 8.0f, 8.0f, 8.0f, 8.0f, -1, 0));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f47239a = frameLayout;
                launchActivity.f32145w0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                ng.i iVar2 = f47239a;
                iVar2.f16373a.setVisibility(0);
                o1.k kVar = new o1.k(new o1.j(0.0f));
                kVar.f16468u = org.telegram.ui.Cells.d0.k(1000.0f, 750.0f, 0.75f);
                kVar.b(new bi.aa(2, iVar2));
                kVar.h();
            } else {
                iVar.getClass();
                launchActivity.f32145w0.removeView(f47239a);
                f47239a = null;
            }
            if (z11) {
                SharedConfig.isFloatingDebugActive = z10;
                SharedConfig.saveConfig();
            }
        }
    }
}
