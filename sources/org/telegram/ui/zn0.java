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
public final class zn0 extends WebViewClient {
    public final Context f43807a;
    public final go0 f43808b;

    public zn0(go0 go0Var, Context context) {
        this.f43808b = go0Var;
        this.f43807a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        go0 go0Var = this.f43808b;
        go0Var.f37293z0 = false;
        go0Var.H0(true, false);
        go0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        go0 go0Var = this.f43808b;
        try {
            if (!AndroidUtilities.isSafeToShow(go0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(go0Var.getParentActivity(), 0, go0Var.Y0);
            alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20608a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new ek0(this, 10));
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
        go0 go0Var = this.f43808b;
        go0Var.f37291y = !str.equals(go0Var.f37289x);
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if ("t.me".equals(parse.getHost())) {
            go0Var.t0();
            return true;
        }
        if (!go0.f37252h1.contains(parse.getScheme())) {
            if (!go0.f37251g1.contains(parse.getScheme())) {
                try {
                    if (go0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        go0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f43807a);
                    alertDialog$Builder.f20608a.R = go0Var.f37278p0;
                    alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
