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
public final class vo0 extends WebViewClient {
    public final Context f41054a;
    public final cp0 f41055b;

    public vo0(cp0 cp0Var, Context context) {
        this.f41055b = cp0Var;
        this.f41054a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        cp0 cp0Var = this.f41055b;
        cp0Var.f35035z0 = false;
        cp0Var.H0(true, false);
        cp0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        cp0 cp0Var = this.f41055b;
        try {
            if (!AndroidUtilities.isSafeToShow(cp0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cp0Var.getParentActivity(), 0, cp0Var.Y0);
            alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f19548a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new yk0(this, 10));
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
        cp0 cp0Var = this.f41055b;
        cp0Var.f35033y = !str.equals(cp0Var.f35031x);
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if ("t.me".equals(parse.getHost())) {
            cp0Var.t0();
            return true;
        }
        if (!cp0.f34994h1.contains(parse.getScheme())) {
            if (!cp0.f34993g1.contains(parse.getScheme())) {
                try {
                    if (cp0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        cp0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f41054a);
                    alertDialog$Builder.f19548a.R = cp0Var.f35020p0;
                    alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
