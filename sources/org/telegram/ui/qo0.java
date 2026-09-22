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
public final class qo0 extends WebViewClient {
    public final Context f36974a;
    public final xo0 f36975b;

    public qo0(xo0 xo0Var, Context context) {
        this.f36975b = xo0Var;
        this.f36974a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        xo0 xo0Var = this.f36975b;
        xo0Var.f39703z0 = false;
        xo0Var.H0(true, false);
        xo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        xo0 xo0Var = this.f36975b;
        try {
            if (!AndroidUtilities.isSafeToShow(xo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xo0Var.getParentActivity(), 0, xo0Var.Y0);
            alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f18669a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new sl0(this, 9));
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
        xo0 xo0Var = this.f36975b;
        xo0Var.f39701y = !str.equals(xo0Var.f39699x);
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if ("t.me".equals(parse.getHost())) {
            xo0Var.t0();
            return true;
        }
        if (!xo0.f39662h1.contains(parse.getScheme())) {
            if (!xo0.f39661g1.contains(parse.getScheme())) {
                try {
                    if (xo0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        xo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f36974a);
                    alertDialog$Builder.f18669a.R = xo0Var.f39688p0;
                    alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
