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
public abstract class c0 {
    public static ng.i f48092a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        boolean z12;
        ng.i iVar = f48092a;
        if (iVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f16776r = new ng.c(frameLayout, 3);
                frameLayout.E = new ArrayList();
                ng.f fVar = new ng.f(frameLayout);
                frameLayout.f16773e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                l.d dVar = new l.d(launchActivity, fVar);
                ((GestureDetector) dVar.f15098b).setIsLongpressEnabled(false);
                ah.w wVar = new ah.w(frameLayout, launchActivity, dVar, 4);
                frameLayout.f16770a = wVar;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false), PorterDuff.Mode.SRC_IN));
                wVar.addView(imageView);
                wVar.setVisibility(8);
                frameLayout.addView(wVar, x5.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f16778w = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f16779x = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.DebugMenu));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
                linearLayout.addView(textView, x5.n(-1, -2));
                ll0 ll0Var = new ll0(launchActivity, null);
                frameLayout.f16780y = ll0Var;
                ll0Var.setLayoutManager(new s4.c0());
                ll0Var.setAdapter(new ng.g((ng.i) frameLayout, launchActivity));
                ll0Var.setOnItemClickListener(new bi.d(frameLayout, 13));
                linearLayout.addView(ll0Var, x5.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, x5.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f48092a = frameLayout;
                launchActivity.f33492w0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                ng.i iVar2 = f48092a;
                iVar2.f16770a.setVisibility(0);
                o1.k kVar = new o1.k(new o1.j(0.0f));
                kVar.f16852u = org.telegram.ui.Cells.p6.l(1000.0f, 750.0f, 0.75f);
                kVar.b(new bi.x9(2, iVar2));
                kVar.f();
            } else {
                iVar.getClass();
                launchActivity.f33492w0.removeView(f48092a);
                f48092a = null;
            }
            if (z11) {
                SharedConfig.isFloatingDebugActive = z10;
                SharedConfig.saveConfig();
            }
        }
    }
}
