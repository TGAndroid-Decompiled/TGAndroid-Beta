package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uk0 extends WebViewClient {
    public final int f50422a;
    public final Context f50423b;
    public final hl0 f50424c;

    public uk0(hl0 hl0Var, Context context, int i7) {
        this.f50422a = i7;
        this.f50424c = hl0Var;
        this.f50423b = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        switch (this.f50422a) {
            case 0:
                super.onPageFinished(webView, str);
                hl0 hl0Var = this.f50424c;
                hl0Var.f46428z0 = false;
                hl0Var.N0(true, false);
                hl0Var.Q0();
                return;
            default:
                super.onPageFinished(webView, str);
                hl0 hl0Var2 = this.f50424c;
                hl0Var2.f46428z0 = false;
                hl0Var2.N0(true, false);
                hl0Var2.Q0();
                return;
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i7 = this.f50422a;
        hl0 hl0Var = this.f50424c;
        switch (i7) {
            case 0:
                try {
                    if (!org.telegram.messenger.g0.M1(hl0Var.getParentActivity())) {
                        return true;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, hl0Var.getParentActivity(), hl0Var.Y0);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                    u1Var.R = org.telegram.messenger.hd.M0(2131752104, null);
                    u1Var.T = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752105, null), new ef0(this, 10));
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                    alertDialog$Builder.p();
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            default:
                try {
                    if (!org.telegram.messenger.g0.M1(hl0Var.getParentActivity())) {
                        return true;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, hl0Var.getParentActivity(), hl0Var.Y0);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27292a;
                    u1Var2.R = org.telegram.messenger.hd.M0(2131752104, null);
                    u1Var2.T = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752105, null), new ef0(this, 12));
                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                    alertDialog$Builder2.p();
                    return true;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return false;
                }
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean z9;
        Uri parse;
        int i7 = this.f50422a;
        Context context = this.f50423b;
        boolean z10 = false;
        hl0 hl0Var = this.f50424c;
        switch (i7) {
            case 0:
                try {
                    Uri parse2 = Uri.parse(str);
                    if ("t.me".equals(parse2.getHost())) {
                        hl0Var.z0();
                    } else if (!hl0.f46386h1.contains(parse2.getScheme())) {
                        if (hl0.f46385g1.contains(parse2.getScheme())) {
                            return false;
                        }
                        try {
                            if (hl0Var.getParentActivity() != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                hl0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse2), 210);
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                            u1Var.R = hl0Var.f46413p0;
                            u1Var.T = org.telegram.messenger.hd.M0(2131747428, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                            alertDialog$Builder.p();
                        }
                    }
                    return true;
                } catch (Exception unused2) {
                    return false;
                }
            default:
                hl0Var.D = !str.equals(hl0Var.f46426y);
                try {
                    parse = Uri.parse(str);
                } catch (Exception unused3) {
                }
                if ("t.me".equals(parse.getHost())) {
                    hl0Var.z0();
                    return true;
                } else if (hl0.f46386h1.contains(parse.getScheme())) {
                    return true;
                } else {
                    if (!hl0.f46385g1.contains(parse.getScheme())) {
                        try {
                            if (hl0Var.getParentActivity() != null) {
                                z10 = true;
                            }
                            if (!z10) {
                                return true;
                            }
                            hl0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                            return true;
                        } catch (ActivityNotFoundException unused4) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27292a;
                            u1Var2.R = hl0Var.f46413p0;
                            u1Var2.T = org.telegram.messenger.hd.M0(2131747428, null);
                            alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                            alertDialog$Builder2.p();
                            return true;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
        }
    }
}
