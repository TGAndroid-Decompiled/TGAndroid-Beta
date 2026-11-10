package pg;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import c8.ha;
import j2.n;
import m4.d0;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.ActionBar.z3;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h5;
public final class d implements Runnable {
    public final int f53615a;
    public final j f53616b;

    public d(j jVar, int i7) {
        this.f53615a = i7;
        this.f53616b = jVar;
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
        int i16 = this.f53615a;
        j jVar = this.f53616b;
        switch (i16) {
            case 0:
                f2 Q = LaunchActivity.Q();
                ?? w2Var = new w2(Q.getParentActivity(), false);
                if (Q.getFragmentView() instanceof st0) {
                    w2Var.l1 = (st0) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout e10 = k5.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (h5.f46218m1 * 5.0f));
                int i17 = m6.f28071n5;
                t6.U(textView, i17, null);
                q.n(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                if (id.f23161a0) {
                    i7 = 3;
                } else {
                    i7 = 5;
                }
                textView.setGravity(i7 | 48);
                if (id.f23161a0) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                e10.addView(textView, ha.d(-2, -1.0f, i10 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                mm0 mm0Var = new mm0(parentActivity);
                mm0Var.setDelegate(new d0(w2Var, textView, false));
                mm0Var.setReportChanges(true);
                e10.addView(mm0Var, ha.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + h5.f46219o1);
                t6.U(textView2, i17, null);
                q.n(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                if (id.f23161a0) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                textView2.setGravity(i11 | 48);
                if (id.f23161a0) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                e10.addView(textView2, ha.d(-2, -1.0f, i12 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                mm0 mm0Var2 = new mm0(parentActivity);
                mm0Var2.setDelegate(new n(14, w2Var, textView2));
                mm0Var2.setReportChanges(true);
                e10.addView(mm0Var2, ha.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                t6.U(textView3, i17, null);
                q.n(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                if (id.f23161a0) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                textView3.setGravity(i13 | 48);
                if (id.f23161a0) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                e10.addView(textView3, ha.d(-2, -1.0f, i14 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                mm0 mm0Var3 = new mm0(parentActivity);
                mm0Var3.setDelegate(new org.telegram.ui.f(w2Var, 5));
                mm0Var3.setReportChanges(true);
                e10.addView(mm0Var3, ha.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                e10.addOnLayoutChangeListener(new z3(mm0Var, mm0Var3, mm0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e10);
                w2Var.N = scrollView;
                w2Var.show();
                jVar.c(false);
                return;
            case 1:
                jVar.getClass();
                iz.K();
                Context context = jVar.getContext();
                if (iz.J0) {
                    i15 = 2131751618;
                } else {
                    i15 = 2131751619;
                }
                Toast.makeText(context, id.M0(i15, null), 0).show();
                return;
            case 2:
                ProfileActivity.Y4((Activity) jVar.getContext(), false);
                return;
            default:
                jVar.f53640n = true;
                try {
                    jVar.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
