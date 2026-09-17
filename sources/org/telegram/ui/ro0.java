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
public final class ro0 extends WebViewClient {
    public final Context f37286a;
    public final yo0 f37287b;

    public ro0(yo0 yo0Var, Context context) {
        this.f37287b = yo0Var;
        this.f37286a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        yo0 yo0Var = this.f37287b;
        yo0Var.f39984z0 = false;
        yo0Var.H0(true, false);
        yo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        yo0 yo0Var = this.f37287b;
        try {
            if (!AndroidUtilities.isSafeToShow(yo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yo0Var.getParentActivity(), 0, yo0Var.Y0);
            alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f18446a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new sl0(this, 9));
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
        yo0 yo0Var = this.f37287b;
        yo0Var.f39982y = !str.equals(yo0Var.f39980x);
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if ("t.me".equals(parse.getHost())) {
            yo0Var.t0();
            return true;
        }
        if (!yo0.f39943h1.contains(parse.getScheme())) {
            if (!yo0.f39942g1.contains(parse.getScheme())) {
                try {
                    if (yo0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        yo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f37286a);
                    alertDialog$Builder.f18446a.R = yo0Var.f39969p0;
                    alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
