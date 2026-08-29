package xf;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import i7.f6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i5;
import org.telegram.ui.j5;
public final class d implements Runnable {
    public final int f50123a;
    public final j f50124b;

    public d(j jVar, int i10) {
        this.f50123a = i10;
        this.f50124b = jVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.f50123a) {
            case 0:
                o2 R = LaunchActivity.R();
                ?? f3Var = new f3(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof hv0) {
                    f3Var.f39433b = (hv0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout f9 = x3.f(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (j5.f39431c * 5.0f));
                int i16 = g6.f23240n5;
                org.telegram.ui.b.r(textView, g6.w0(null, i16, false), 1, 16.0f, 1);
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
                f9.addView(textView, f6.d(-2, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                ao0 ao0Var = new ao0(parentActivity);
                ao0Var.setDelegate(new i5(f3Var, textView, 0));
                ao0Var.setReportChanges(true);
                f9.addView(ao0Var, f6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + j5.f39432e);
                org.telegram.ui.b.r(textView2, g6.w0(null, i16, false), 1, 16.0f, 1);
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
                f9.addView(textView2, f6.d(-2, -1.0f, i13 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                ao0 ao0Var2 = new ao0(parentActivity);
                ao0Var2.setDelegate(new i5(f3Var, textView2, 1));
                ao0Var2.setReportChanges(true);
                f9.addView(ao0Var2, f6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                org.telegram.ui.b.r(textView3, g6.w0(null, i16, false), 1, 16.0f, 1);
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
                f9.addView(textView3, f6.d(-2, -1.0f, i17 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                ao0 ao0Var3 = new ao0(parentActivity);
                ao0Var3.setDelegate(new org.telegram.ui.h(f3Var, 5));
                ao0Var3.setReportChanges(true);
                f9.addView(ao0Var3, f6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                f9.addOnLayoutChangeListener(new i4(ao0Var, ao0Var3, ao0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(f9);
                f3Var.setCustomView(scrollView);
                f3Var.show();
                this.f50124b.c(false);
                return;
            case 1:
                j jVar = this.f50124b;
                jVar.getClass();
                SharedConfig.toggleDebugWebView();
                Context context = jVar.getContext();
                if (SharedConfig.debugWebView) {
                    i15 = R.string.DebugMenuWebViewDebugEnabled;
                } else {
                    i15 = R.string.DebugMenuWebViewDebugDisabled;
                }
                Toast.makeText(context, LocaleController.getString(i15), 0).show();
                return;
            case 2:
                ProfileActivity.H4((Activity) this.f50124b.getContext(), false);
                return;
            default:
                j jVar2 = this.f50124b;
                jVar2.f50146n = true;
                try {
                    jVar2.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
