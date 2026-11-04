package qg;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import b8.mf;
import m2.t;
import mi.h0;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.ActionBar.w3;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.j5;
public final class c implements Runnable {
    public final int f53913a;
    public final h f53914b;

    public c(h hVar, int i3) {
        this.f53913a = i3;
        this.f53914b = hVar;
    }

    @Override
    public final void run() {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f53913a;
        h hVar = this.f53914b;
        switch (i16) {
            case 0:
                d2 Q = LaunchActivity.Q();
                ?? t2Var = new t2(Q.getParentActivity(), false);
                if (Q.getFragmentView() instanceof qt0) {
                    t2Var.f46497j1 = (qt0) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout e10 = k5.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (j5.k1 * 5.0f));
                int i17 = k6.f28061n5;
                r6.V(textView, i17, null);
                q.n(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                if (bd.f21784a0) {
                    i3 = 3;
                } else {
                    i3 = 5;
                }
                textView.setGravity(i3 | 48);
                if (bd.f21784a0) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                e10.addView(textView, mf.d(-2, -1.0f, i10 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                pm0 pm0Var = new pm0(parentActivity);
                pm0Var.setDelegate(new t(9, t2Var, textView));
                pm0Var.setReportChanges(true);
                e10.addView(pm0Var, mf.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + j5.m1);
                r6.V(textView2, i17, null);
                q.n(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                if (bd.f21784a0) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                textView2.setGravity(i11 | 48);
                if (bd.f21784a0) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                e10.addView(textView2, mf.d(-2, -1.0f, i12 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                pm0 pm0Var2 = new pm0(parentActivity);
                pm0Var2.setDelegate(new h0(8, t2Var, textView2));
                pm0Var2.setReportChanges(true);
                e10.addView(pm0Var2, mf.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                r6.V(textView3, i17, null);
                q.n(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                if (bd.f21784a0) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                textView3.setGravity(i13 | 48);
                if (bd.f21784a0) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                e10.addView(textView3, mf.d(-2, -1.0f, i14 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                pm0 pm0Var3 = new pm0(parentActivity);
                pm0Var3.setDelegate(new org.telegram.ui.f(t2Var, 5));
                pm0Var3.setReportChanges(true);
                e10.addView(pm0Var3, mf.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                e10.addOnLayoutChangeListener(new w3(pm0Var, pm0Var3, pm0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e10);
                t2Var.O = scrollView;
                t2Var.show();
                hVar.c(false);
                return;
            case 1:
                hVar.getClass();
                az.K();
                Context context = hVar.getContext();
                if (az.J0) {
                    i15 = 2131751619;
                } else {
                    i15 = 2131751620;
                }
                Toast.makeText(context, bd.M0(i15, null), 0).show();
                return;
            case 2:
                ProfileActivity.V4((Activity) hVar.getContext(), false);
                return;
            default:
                hVar.f53935n = true;
                try {
                    hVar.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
