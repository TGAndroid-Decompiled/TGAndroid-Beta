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
public final class xn0 extends WebViewClient {
    public final Context f40051a;
    public final no0 f40052b;

    public xn0(no0 no0Var, Context context) {
        this.f40052b = no0Var;
        this.f40051a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        no0 no0Var = this.f40052b;
        no0Var.f36089z0 = false;
        no0Var.H0(true, false);
        no0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        no0 no0Var = this.f40052b;
        try {
            if (!AndroidUtilities.isSafeToShow(no0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(no0Var.getParentActivity(), 0, no0Var.Y0);
            alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f18678a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new il0(this, 7));
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
        no0 no0Var;
        boolean z10;
        try {
            parse = Uri.parse(str);
            equals = "t.me".equals(parse.getHost());
            no0Var = this.f40052b;
        } catch (Exception unused) {
        }
        if (equals) {
            no0Var.t0();
            return true;
        }
        if (!no0.f36048h1.contains(parse.getScheme())) {
            if (!no0.f36047g1.contains(parse.getScheme())) {
                try {
                    if (no0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        no0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f40051a);
                    alertDialog$Builder.f18678a.R = no0Var.f36074p0;
                    alertDialog$Builder.f18678a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return false;
        }
        return true;
    }
}
