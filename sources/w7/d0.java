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
import org.telegram.ui.Components.jm0;
import org.telegram.ui.LaunchActivity;
public abstract class d0 {
    public static ng.i f48617a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        boolean z12;
        ng.i iVar = f48617a;
        if (iVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f17469r = new ng.c(frameLayout, 3);
                frameLayout.E = new ArrayList();
                ng.f fVar = new ng.f(frameLayout);
                frameLayout.e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                le.b bVar = new le.b(launchActivity, fVar);
                ((GestureDetector) bVar.f16009b).setIsLongpressEnabled(false);
                ah.v vVar = new ah.v(frameLayout, launchActivity, bVar, 5);
                frameLayout.f17464a = vVar;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.O9, false), PorterDuff.Mode.SRC_IN));
                vVar.addView(imageView);
                vVar.setVisibility(8);
                frameLayout.addView(vVar, z5.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f17471w = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f17472x = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.DebugMenu));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
                linearLayout.addView(textView, z5.n(-1, -2));
                jm0 jm0Var = new jm0(launchActivity, null);
                frameLayout.f17473y = jm0Var;
                jm0Var.setLayoutManager(new s4.b0());
                jm0Var.setAdapter(new ng.g((ng.i) frameLayout, launchActivity));
                jm0Var.setOnItemClickListener(new ai.wa(frameLayout, 17));
                linearLayout.addView(jm0Var, z5.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, z5.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f48617a = frameLayout;
                launchActivity.f33197w0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                ng.i iVar2 = f48617a;
                iVar2.f17464a.setVisibility(0);
                o1.k kVar = new o1.k(new o1.j(0.0f));
                kVar.f17559u = org.telegram.ui.Cells.c1.l(1000.0f, 750.0f, 0.75f);
                kVar.b(new ci.l8(2, iVar2));
                kVar.h();
            } else {
                iVar.getClass();
                launchActivity.f33197w0.removeView(f48617a);
                f48617a = null;
            }
            if (z11) {
                SharedConfig.isFloatingDebugActive = z10;
                SharedConfig.saveConfig();
            }
        }
    }
}
