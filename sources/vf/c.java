package vf;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import h7.z5;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.rl;
import org.telegram.messenger.y1;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.qn0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i5;
import org.telegram.ui.j5;

public final class c implements Runnable {

    public final int f48886a;

    public final i f48887b;

    public c(i iVar, int i10) {
        this.f48886a = i10;
        this.f48887b = iVar;
    }

    @Override
    public final void run() {
        switch (this.f48886a) {
            case 0:
                n2 n2VarR = LaunchActivity.R();
                j5 j5Var = new j5(n2VarR.getParentActivity(), false);
                if (n2VarR.getFragmentView() instanceof zu0) {
                    j5Var.f39254b = (zu0) n2VarR.getFragmentView();
                }
                Activity parentActivity = n2VarR.getParentActivity();
                LinearLayout linearLayoutF = y1.f(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (j5.f39252c * 5.0f));
                int i10 = g6.f23233n5;
                rl.p(textView, g6.w0(null, i10, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                linearLayoutF.addView(textView, z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                qn0 qn0Var = new qn0(parentActivity);
                qn0Var.setDelegate(new i5(j5Var, textView, 0));
                qn0Var.setReportChanges(true);
                linearLayoutF.addView(qn0Var, z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + j5.f39253e);
                rl.p(textView2, g6.w0(null, i10, false), 1, 16.0f, 1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                linearLayoutF.addView(textView2, z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                qn0 qn0Var2 = new qn0(parentActivity);
                qn0Var2.setDelegate(new i5(j5Var, textView2, 1));
                qn0Var2.setReportChanges(true);
                linearLayoutF.addView(qn0Var2, z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                rl.p(textView3, g6.w0(null, i10, false), 1, 16.0f, 1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                linearLayoutF.addView(textView3, z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                qn0 qn0Var3 = new qn0(parentActivity);
                qn0Var3.setDelegate(new org.telegram.ui.g(j5Var, 5));
                qn0Var3.setReportChanges(true);
                linearLayoutF.addView(qn0Var3, z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                linearLayoutF.addOnLayoutChangeListener(new i4(qn0Var, qn0Var3, qn0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(linearLayoutF);
                j5Var.setCustomView(scrollView);
                j5Var.show();
                this.f48887b.c(false);
                break;
            case 1:
                i iVar = this.f48887b;
                iVar.getClass();
                SharedConfig.toggleDebugWebView();
                Toast.makeText(iVar.getContext(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                break;
            case 2:
                ProfileActivity.H4((Activity) this.f48887b.getContext(), false);
                break;
            default:
                i iVar2 = this.f48887b;
                iVar2.f48911n = true;
                try {
                    iVar2.performHapticFeedback(0);
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
