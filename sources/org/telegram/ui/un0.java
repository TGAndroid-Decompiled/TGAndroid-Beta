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
public final class un0 extends WebViewClient {
    public final Context f43292a;
    public final bo0 f43293b;

    public un0(bo0 bo0Var, Context context) {
        this.f43293b = bo0Var;
        this.f43292a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        bo0 bo0Var = this.f43293b;
        bo0Var.f36868v0 = false;
        bo0Var.H0(true, false);
        bo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        bo0 bo0Var = this.f43293b;
        try {
            if (!AndroidUtilities.isSafeToShow(bo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bo0Var.getParentActivity(), 0, bo0Var.U0);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f22714a.P = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new vk0(this, 9));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.o();
            return true;
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse;
        boolean z10;
        bo0 bo0Var = this.f43293b;
        bo0Var.f36873y = !str.equals(bo0Var.f36871x);
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if ("t.me".equals(parse.getHost())) {
            bo0Var.t0();
            return true;
        }
        if (!bo0.f36837d1.contains(parse.getScheme())) {
            if (!bo0.f36836c1.contains(parse.getScheme())) {
                try {
                    if (bo0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        bo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f43292a);
                    alertDialog$Builder.f22714a.N = bo0Var.f36856l0;
                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
