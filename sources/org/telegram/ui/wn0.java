package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wn0 extends WebViewClient {
    public final Context f39738a;
    public final lo0 f39739b;

    public wn0(lo0 lo0Var, Context context) {
        this.f39739b = lo0Var;
        this.f39738a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        lo0 lo0Var = this.f39739b;
        lo0Var.f35847w0 = false;
        lo0Var.H0(true, false);
        lo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        lo0 lo0Var = this.f39739b;
        try {
            if (!AndroidUtilities.isSafeToShow(lo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lo0Var.getParentActivity(), 0, lo0Var.V0);
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f19478a.Q = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new gl0(this, 7));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse;
        boolean equals;
        lo0 lo0Var;
        boolean z4;
        try {
            parse = Uri.parse(str);
            equals = "t.me".equals(parse.getHost());
            lo0Var = this.f39739b;
        } catch (Exception unused) {
        }
        if (equals) {
            lo0Var.t0();
            return true;
        }
        if (!lo0.f35814e1.contains(parse.getScheme())) {
            if (!lo0.f35813d1.contains(parse.getScheme())) {
                try {
                    if (lo0Var.getParentActivity() != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        lo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f39738a);
                    alertDialog$Builder.f19478a.O = lo0Var.m0;
                    alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return false;
        }
        return true;
    }
}
