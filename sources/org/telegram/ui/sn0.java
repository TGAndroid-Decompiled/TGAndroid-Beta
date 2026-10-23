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
public final class sn0 extends WebViewClient {
    public final Context f41774a;
    public final io0 f41775b;

    public sn0(io0 io0Var, Context context) {
        this.f41775b = io0Var;
        this.f41774a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        io0 io0Var = this.f41775b;
        io0Var.f38327z0 = false;
        io0Var.H0(true, false);
        io0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        io0 io0Var = this.f41775b;
        try {
            if (!AndroidUtilities.isSafeToShow(io0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(io0Var.getParentActivity(), 0, io0Var.Y0);
            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20678a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new oj0(this, 9));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.p();
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
        io0 io0Var;
        boolean z10;
        try {
            parse = Uri.parse(str);
            equals = "t.me".equals(parse.getHost());
            io0Var = this.f41775b;
        } catch (Exception unused) {
        }
        if (equals) {
            io0Var.t0();
            return true;
        }
        if (!io0.f38286h1.contains(parse.getScheme())) {
            if (!io0.f38285g1.contains(parse.getScheme())) {
                try {
                    if (io0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        io0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f41774a);
                    alertDialog$Builder.f20678a.R = io0Var.f38312p0;
                    alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.p();
                }
            }
            return false;
        }
        return true;
    }
}
