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
public final class to0 extends WebViewClient {
    public final Context f40159a;
    public final ap0 f40160b;

    public to0(ap0 ap0Var, Context context) {
        this.f40160b = ap0Var;
        this.f40159a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ap0 ap0Var = this.f40160b;
        ap0Var.f34047z0 = false;
        ap0Var.H0(true, false);
        ap0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ap0 ap0Var = this.f40160b;
        try {
            if (!AndroidUtilities.isSafeToShow(ap0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ap0Var.getParentActivity(), 0, ap0Var.Y0);
            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f19248a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new xk0(this, 10));
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
        boolean z10;
        ap0 ap0Var = this.f40160b;
        ap0Var.f34045y = !str.equals(ap0Var.f34043x);
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if ("t.me".equals(parse.getHost())) {
            ap0Var.t0();
            return true;
        }
        if (!ap0.f34006h1.contains(parse.getScheme())) {
            if (!ap0.f34005g1.contains(parse.getScheme())) {
                try {
                    if (ap0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ap0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f40159a);
                    alertDialog$Builder.f19248a.R = ap0Var.f34032p0;
                    alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
