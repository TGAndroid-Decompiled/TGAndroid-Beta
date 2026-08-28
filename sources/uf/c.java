package uf;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import g7.e6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.l0;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h5;
import org.telegram.ui.i5;
public final class c implements Runnable {
    public final int f48201a;
    public final h f48202b;

    public c(h hVar, int i9) {
        this.f48201a = i9;
        this.f48202b = hVar;
    }

    @Override
    public final void run() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f48201a) {
            case 0:
                o2 R = LaunchActivity.R();
                ?? f3Var = new f3(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof xu0) {
                    f3Var.f39009b = (xu0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout f10 = l0.f(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (i5.f39007c * 5.0f));
                int i15 = f6.f23178n5;
                ll.s(textView, f6.w0(null, i15, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                int i16 = 5;
                if (LocaleController.isRTL) {
                    i9 = 3;
                } else {
                    i9 = 5;
                }
                textView.setGravity(i9 | 48);
                if (LocaleController.isRTL) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                f10.addView(textView, e6.d(-2, -1.0f, i10 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                pn0 pn0Var = new pn0(parentActivity);
                pn0Var.setDelegate(new h5(f3Var, textView, 0));
                pn0Var.setReportChanges(true);
                f10.addView(pn0Var, e6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + i5.f39008e);
                ll.s(textView2, f6.w0(null, i15, false), 1, 16.0f, 1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                if (LocaleController.isRTL) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                textView2.setGravity(i11 | 48);
                if (LocaleController.isRTL) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                f10.addView(textView2, e6.d(-2, -1.0f, i12 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                pn0 pn0Var2 = new pn0(parentActivity);
                pn0Var2.setDelegate(new h5(f3Var, textView2, 1));
                pn0Var2.setReportChanges(true);
                f10.addView(pn0Var2, e6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                ll.s(textView3, f6.w0(null, i15, false), 1, 16.0f, 1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                if (LocaleController.isRTL) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                textView3.setGravity(i13 | 48);
                if (LocaleController.isRTL) {
                    i16 = 3;
                }
                f10.addView(textView3, e6.d(-2, -1.0f, i16 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                pn0 pn0Var3 = new pn0(parentActivity);
                pn0Var3.setDelegate(new org.telegram.ui.g(f3Var, 5));
                pn0Var3.setReportChanges(true);
                f10.addView(pn0Var3, e6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                f10.addOnLayoutChangeListener(new i4(pn0Var, pn0Var3, pn0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(f10);
                f3Var.setCustomView(scrollView);
                f3Var.show();
                this.f48202b.c(false);
                return;
            case 1:
                h hVar = this.f48202b;
                hVar.getClass();
                SharedConfig.toggleDebugWebView();
                Context context = hVar.getContext();
                if (SharedConfig.debugWebView) {
                    i14 = R.string.DebugMenuWebViewDebugEnabled;
                } else {
                    i14 = R.string.DebugMenuWebViewDebugDisabled;
                }
                Toast.makeText(context, LocaleController.getString(i14), 0).show();
                return;
            case 2:
                ProfileActivity.H4((Activity) this.f48202b.getContext(), false);
                return;
            default:
                h hVar2 = this.f48202b;
                hVar2.f48223n = true;
                try {
                    hVar2.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
