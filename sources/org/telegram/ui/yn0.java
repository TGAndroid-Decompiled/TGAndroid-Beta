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
public final class yn0 extends WebViewClient {
    public final Context f43433a;
    public final fo0 f43434b;

    public yn0(fo0 fo0Var, Context context) {
        this.f43434b = fo0Var;
        this.f43433a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        fo0 fo0Var = this.f43434b;
        fo0Var.f37010z0 = false;
        fo0Var.H0(true, false);
        fo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        fo0 fo0Var = this.f43434b;
        try {
            if (!AndroidUtilities.isSafeToShow(fo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fo0Var.getParentActivity(), 0, fo0Var.Y0);
            alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20601a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new ek0(this, 10));
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
        fo0 fo0Var = this.f43434b;
        fo0Var.f37008y = !str.equals(fo0Var.f37006x);
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if ("t.me".equals(parse.getHost())) {
            fo0Var.t0();
            return true;
        }
        if (!fo0.f36969h1.contains(parse.getScheme())) {
            if (!fo0.f36968g1.contains(parse.getScheme())) {
                try {
                    if (fo0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        fo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f43433a);
                    alertDialog$Builder.f20601a.R = fo0Var.f36995p0;
                    alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
