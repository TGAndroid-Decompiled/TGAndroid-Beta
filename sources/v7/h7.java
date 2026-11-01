package v7;

import android.graphics.PorterDuff;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.uz;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.LaunchActivity;
public abstract class h7 {
    public static fg.l f50479a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        boolean z12;
        fg.l lVar = f50479a;
        if (lVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f7091r = new fg.e(frameLayout, 3);
                frameLayout.E = new ArrayList();
                fg.h hVar = new fg.h(frameLayout);
                frameLayout.e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                m2.t tVar = new m2.t(launchActivity, hVar);
                ((GestureDetector) tVar.f12685b).setIsLongpressEnabled(false);
                fg.i iVar = new fg.i(frameLayout, launchActivity, tVar, 0);
                frameLayout.f7086a = iVar;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(2131231036);
                org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.O9, null, PorterDuff.Mode.SRC_IN);
                iVar.addView(imageView);
                iVar.setVisibility(8);
                frameLayout.addView(iVar, w7.b6.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f7094x = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f7095y = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(dd.L0(2131751647, null));
                textView.setTypeface(org.telegram.messenger.i0.o());
                textView.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(19.0f));
                linearLayout.addView(textView, w7.b6.o(-1, -2));
                uk0 uk0Var = new uk0(launchActivity, null);
                frameLayout.D = uk0Var;
                uk0Var.setLayoutManager(new s4.a0());
                uk0Var.setAdapter(new fg.j((fg.l) frameLayout, launchActivity));
                uk0Var.setOnItemClickListener(new ag.y0(frameLayout, 3));
                linearLayout.addView(uk0Var, w7.b6.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, w7.b6.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f50479a = frameLayout;
                launchActivity.f33396w0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                fg.l lVar2 = f50479a;
                lVar2.f7086a.setVisibility(0);
                o1.j jVar = new o1.j(new o1.i(0.0f));
                jVar.f13958m = org.telegram.ui.Cells.f1.p(1000.0f, 750.0f, 0.75f);
                jVar.b(new fg.c(0, lVar2));
                jVar.h();
            } else {
                lVar.getClass();
                launchActivity.f33396w0.removeView(f50479a);
                f50479a = null;
            }
            if (z11) {
                uz.f18565x1 = z10;
                uz.y();
            }
        }
    }
}
