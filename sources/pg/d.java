package pg;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import c8.ma;
import ji.j;
import org.telegram.messenger.bz;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.a4;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.x2;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h5;
public final class d implements Runnable {
    public final int f55599a;
    public final i f55600b;

    public d(i iVar, int i7) {
        this.f55599a = i7;
        this.f55600b = iVar;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f55599a;
        i iVar = this.f55600b;
        switch (i16) {
            case 0:
                h2 Q = LaunchActivity.Q();
                ?? x2Var = new x2(Q.getParentActivity(), false);
                if (Q.getFragmentView() instanceof au0) {
                    x2Var.f48226m1 = (au0) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout f10 = f3.f(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (h5.n1 * 5.0f));
                int i17 = n6.f29577n5;
                u6.U(textView, i17, null);
                n10.q(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                if (gd.f24216a0) {
                    i7 = 3;
                } else {
                    i7 = 5;
                }
                textView.setGravity(i7 | 48);
                if (gd.f24216a0) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                f10.addView(textView, ma.d(-2, -1.0f, i10 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                ym0 ym0Var = new ym0(parentActivity);
                ym0Var.setDelegate(new k8.a(12, x2Var, textView));
                ym0Var.setReportChanges(true);
                f10.addView(ym0Var, ma.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + h5.f48225p1);
                u6.U(textView2, i17, null);
                n10.q(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                if (gd.f24216a0) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                textView2.setGravity(i11 | 48);
                if (gd.f24216a0) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                f10.addView(textView2, ma.d(-2, -1.0f, i12 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                ym0 ym0Var2 = new ym0(parentActivity);
                ym0Var2.setDelegate(new j(x2Var, textView2, false, 12));
                ym0Var2.setReportChanges(true);
                f10.addView(ym0Var2, ma.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                u6.U(textView3, i17, null);
                n10.q(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                if (gd.f24216a0) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                textView3.setGravity(i13 | 48);
                if (gd.f24216a0) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                f10.addView(textView3, ma.d(-2, -1.0f, i14 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                ym0 ym0Var3 = new ym0(parentActivity);
                ym0Var3.setDelegate(new org.telegram.ui.f(x2Var, 5));
                ym0Var3.setReportChanges(true);
                f10.addView(ym0Var3, ma.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                f10.addOnLayoutChangeListener(new a4(ym0Var, ym0Var3, ym0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(f10);
                x2Var.O = scrollView;
                x2Var.show();
                iVar.c(false);
                return;
            case 1:
                iVar.getClass();
                bz.K();
                Context context = iVar.getContext();
                if (bz.J0) {
                    i15 = 2131751607;
                } else {
                    i15 = 2131751608;
                }
                Toast.makeText(context, gd.M0(i15, null), 0).show();
                return;
            case 2:
                ProfileActivity.Y4((Activity) iVar.getContext(), false);
                return;
            default:
                iVar.f55621n = true;
                try {
                    iVar.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
