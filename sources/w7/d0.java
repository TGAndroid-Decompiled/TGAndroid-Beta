package w7;

import android.graphics.PorterDuff;
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
import org.telegram.ui.Components.lm0;
import org.telegram.ui.LaunchActivity;
public abstract class d0 {
    public static ng.i f49058a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        boolean z12;
        ng.i iVar = f49058a;
        if (iVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f17532r = new ng.c(frameLayout, 3);
                frameLayout.E = new ArrayList();
                ng.f fVar = new ng.f(frameLayout);
                frameLayout.e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                le.b bVar = new le.b(launchActivity, fVar);
                ((GestureDetector) bVar.f16072b).setIsLongpressEnabled(false);
                ah.v vVar = new ah.v(frameLayout, launchActivity, bVar, 5);
                frameLayout.f17527a = vVar;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.O9, null, PorterDuff.Mode.SRC_IN);
                vVar.addView(imageView);
                vVar.setVisibility(8);
                frameLayout.addView(vVar, z5.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f17534w = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f17535x = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.DebugMenu));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
                linearLayout.addView(textView, z5.n(-1, -2));
                lm0 lm0Var = new lm0(launchActivity, null);
                frameLayout.f17536y = lm0Var;
                lm0Var.setLayoutManager(new s4.b0());
                lm0Var.setAdapter(new ng.g((ng.i) frameLayout, launchActivity));
                lm0Var.setOnItemClickListener(new ai.xa(frameLayout, 17));
                linearLayout.addView(lm0Var, z5.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, z5.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f49058a = frameLayout;
                launchActivity.f33501w0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                ng.i iVar2 = f49058a;
                iVar2.f17527a.setVisibility(0);
                o1.k kVar = new o1.k(new o1.j(0.0f));
                kVar.f17622u = org.telegram.ui.Cells.b1.m(1000.0f, 750.0f, 0.75f);
                kVar.b(new ci.k8(2, iVar2));
                kVar.h();
            } else {
                iVar.getClass();
                launchActivity.f33501w0.removeView(f49058a);
                f49058a = null;
            }
            if (z11) {
                SharedConfig.isFloatingDebugActive = z10;
                SharedConfig.saveConfig();
            }
        }
    }
}
