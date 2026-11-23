package pg;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import c8.na;
import ji.k;
import org.telegram.messenger.cz;
import org.telegram.messenger.f3;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.ActionBar.z3;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h5;
public final class d implements Runnable {
    public final int f55609a;
    public final i f55610b;

    public d(i iVar, int i7) {
        this.f55609a = i7;
        this.f55610b = iVar;
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
        int i16 = this.f55609a;
        i iVar = this.f55610b;
        switch (i16) {
            case 0:
                g2 Q = LaunchActivity.Q();
                ?? w2Var = new w2(Q.getParentActivity(), false);
                if (Q.getFragmentView() instanceof du0) {
                    w2Var.f48197m1 = (du0) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout f10 = f3.f(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (h5.n1 * 5.0f));
                int i17 = m6.f29528n5;
                t6.U(textView, i17, null);
                o10.q(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                if (hd.f24408a0) {
                    i7 = 3;
                } else {
                    i7 = 5;
                }
                textView.setGravity(i7 | 48);
                if (hd.f24408a0) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                f10.addView(textView, na.d(-2, -1.0f, i10 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                an0 an0Var = new an0(parentActivity);
                an0Var.setDelegate(new k8.a(12, w2Var, textView));
                an0Var.setReportChanges(true);
                f10.addView(an0Var, na.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + h5.f48196p1);
                t6.U(textView2, i17, null);
                o10.q(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                if (hd.f24408a0) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                textView2.setGravity(i11 | 48);
                if (hd.f24408a0) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                f10.addView(textView2, na.d(-2, -1.0f, i12 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                an0 an0Var2 = new an0(parentActivity);
                an0Var2.setDelegate(new k(w2Var, textView2, false, 12));
                an0Var2.setReportChanges(true);
                f10.addView(an0Var2, na.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                t6.U(textView3, i17, null);
                o10.q(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                if (hd.f24408a0) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                textView3.setGravity(i13 | 48);
                if (hd.f24408a0) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                f10.addView(textView3, na.d(-2, -1.0f, i14 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                an0 an0Var3 = new an0(parentActivity);
                an0Var3.setDelegate(new org.telegram.ui.f(w2Var, 5));
                an0Var3.setReportChanges(true);
                f10.addView(an0Var3, na.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                f10.addOnLayoutChangeListener(new z3(an0Var, an0Var3, an0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(f10);
                w2Var.O = scrollView;
                w2Var.show();
                iVar.c(false);
                return;
            case 1:
                iVar.getClass();
                cz.K();
                Context context = iVar.getContext();
                if (cz.J0) {
                    i15 = 2131751606;
                } else {
                    i15 = 2131751607;
                }
                Toast.makeText(context, hd.N0(i15, null), 0).show();
                return;
            case 2:
                ProfileActivity.Y4((Activity) iVar.getContext(), false);
                return;
            default:
                iVar.f55631n = true;
                try {
                    iVar.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
