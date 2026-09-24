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
    public final Context f40180a;
    public final oo0 f40181b;

    public yn0(oo0 oo0Var, Context context) {
        this.f40181b = oo0Var;
        this.f40180a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        oo0 oo0Var = this.f40181b;
        oo0Var.f36301z0 = false;
        oo0Var.H0(true, false);
        oo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        oo0 oo0Var = this.f40181b;
        try {
            if (!AndroidUtilities.isSafeToShow(oo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oo0Var.getParentActivity(), 0, oo0Var.Y0);
            alertDialog$Builder.f18647a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f18647a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new il0(this, 7));
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
        oo0 oo0Var;
        boolean z10;
        try {
            parse = Uri.parse(str);
            equals = "t.me".equals(parse.getHost());
            oo0Var = this.f40181b;
        } catch (Exception unused) {
        }
        if (equals) {
            oo0Var.t0();
            return true;
        }
        if (!oo0.f36260h1.contains(parse.getScheme())) {
            if (!oo0.f36259g1.contains(parse.getScheme())) {
                try {
                    if (oo0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        oo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f40180a);
                    alertDialog$Builder.f18647a.R = oo0Var.f36286p0;
                    alertDialog$Builder.f18647a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return false;
        }
        return true;
    }
}
