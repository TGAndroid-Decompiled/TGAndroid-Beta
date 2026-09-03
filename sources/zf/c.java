package zf;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import k7.b6;
import kf.k0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l4;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m5;
import org.telegram.ui.n5;
public final class c implements Runnable {
    public final int f47478a;
    public final h f47479b;

    public c(h hVar, int i10) {
        this.f47478a = i10;
        this.f47479b = hVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.f47478a) {
            case 0:
                p2 R = LaunchActivity.R();
                ?? g3Var = new g3(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof qv0) {
                    g3Var.f36388b = (qv0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout h = k0.h(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (n5.f36387c * 5.0f));
                int i16 = j6.f20059n5;
                org.telegram.ui.b.q(textView, j6.w0(null, i16, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                int i17 = 5;
                if (LocaleController.isRTL) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                textView.setGravity(i10 | 48);
                if (LocaleController.isRTL) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                h.addView(textView, b6.d(-2, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                jo0 jo0Var = new jo0(parentActivity);
                jo0Var.setDelegate(new m5(g3Var, textView, 0));
                jo0Var.setReportChanges(true);
                h.addView(jo0Var, b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + n5.e);
                org.telegram.ui.b.q(textView2, j6.w0(null, i16, false), 1, 16.0f, 1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                if (LocaleController.isRTL) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                textView2.setGravity(i12 | 48);
                if (LocaleController.isRTL) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                h.addView(textView2, b6.d(-2, -1.0f, i13 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                jo0 jo0Var2 = new jo0(parentActivity);
                jo0Var2.setDelegate(new m5(g3Var, textView2, 1));
                jo0Var2.setReportChanges(true);
                h.addView(jo0Var2, b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                org.telegram.ui.b.q(textView3, j6.w0(null, i16, false), 1, 16.0f, 1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                if (LocaleController.isRTL) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                textView3.setGravity(i14 | 48);
                if (LocaleController.isRTL) {
                    i17 = 3;
                }
                h.addView(textView3, b6.d(-2, -1.0f, i17 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                jo0 jo0Var3 = new jo0(parentActivity);
                jo0Var3.setDelegate(new org.telegram.ui.h(g3Var, 5));
                jo0Var3.setReportChanges(true);
                h.addView(jo0Var3, b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                h.addOnLayoutChangeListener(new l4(jo0Var, jo0Var3, jo0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(h);
                g3Var.setCustomView(scrollView);
                g3Var.show();
                this.f47479b.c(false);
                return;
            case 1:
                h hVar = this.f47479b;
                hVar.getClass();
                SharedConfig.toggleDebugWebView();
                Context context = hVar.getContext();
                if (SharedConfig.debugWebView) {
                    i15 = R.string.DebugMenuWebViewDebugEnabled;
                } else {
                    i15 = R.string.DebugMenuWebViewDebugDisabled;
                }
                Toast.makeText(context, LocaleController.getString(i15), 0).show();
                return;
            case 2:
                ProfileActivity.H4((Activity) this.f47479b.getContext(), false);
                return;
            default:
                h hVar2 = this.f47479b;
                hVar2.f47498n = true;
                try {
                    hVar2.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
