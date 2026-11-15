package pg;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import c8.ja;
import ji.j;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.ActionBar.w3;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h5;
public final class d implements Runnable {
    public final int f55023a;
    public final i f55024b;

    public d(i iVar, int i7) {
        this.f55023a = i7;
        this.f55024b = iVar;
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
        int i16 = this.f55023a;
        i iVar = this.f55024b;
        switch (i16) {
            case 0:
                e2 Q = LaunchActivity.Q();
                ?? u2Var = new u2(Q.getParentActivity(), false);
                if (Q.getFragmentView() instanceof st0) {
                    u2Var.f47602m1 = (st0) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout e10 = k5.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (h5.n1 * 5.0f));
                int i17 = j6.f29030n5;
                q6.U(textView, i17, null);
                i20.p(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                if (hd.f24104a0) {
                    i7 = 3;
                } else {
                    i7 = 5;
                }
                textView.setGravity(i7 | 48);
                if (hd.f24104a0) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                e10.addView(textView, ja.d(-2, -1.0f, i10 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                qm0 qm0Var = new qm0(parentActivity);
                qm0Var.setDelegate(new k8.a(12, u2Var, textView));
                qm0Var.setReportChanges(true);
                e10.addView(qm0Var, ja.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + h5.f47601p1);
                q6.U(textView2, i17, null);
                i20.p(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                if (hd.f24104a0) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                textView2.setGravity(i11 | 48);
                if (hd.f24104a0) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                e10.addView(textView2, ja.d(-2, -1.0f, i12 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                qm0 qm0Var2 = new qm0(parentActivity);
                qm0Var2.setDelegate(new j(u2Var, textView2, false, 12));
                qm0Var2.setReportChanges(true);
                e10.addView(qm0Var2, ja.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                q6.U(textView3, i17, null);
                i20.p(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                if (hd.f24104a0) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                textView3.setGravity(i13 | 48);
                if (hd.f24104a0) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                e10.addView(textView3, ja.d(-2, -1.0f, i14 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                qm0 qm0Var3 = new qm0(parentActivity);
                qm0Var3.setDelegate(new org.telegram.ui.f(u2Var, 5));
                qm0Var3.setReportChanges(true);
                e10.addView(qm0Var3, ja.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                e10.addOnLayoutChangeListener(new w3(qm0Var, qm0Var3, qm0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e10);
                u2Var.O = scrollView;
                u2Var.show();
                iVar.c(false);
                return;
            case 1:
                iVar.getClass();
                gz.K();
                Context context = iVar.getContext();
                if (gz.J0) {
                    i15 = 2131751618;
                } else {
                    i15 = 2131751619;
                }
                Toast.makeText(context, hd.M0(i15, null), 0).show();
                return;
            case 2:
                ProfileActivity.X4((Activity) iVar.getContext(), false);
                return;
            default:
                iVar.f55045n = true;
                try {
                    iVar.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
