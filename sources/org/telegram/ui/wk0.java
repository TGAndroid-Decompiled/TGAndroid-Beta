package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wk0 extends WebViewClient {
    public final int f51422a;
    public final Context f51423b;
    public final jl0 f51424c;

    public wk0(jl0 jl0Var, Context context, int i7) {
        this.f51422a = i7;
        this.f51424c = jl0Var;
        this.f51423b = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        switch (this.f51422a) {
            case 0:
                super.onPageFinished(webView, str);
                jl0 jl0Var = this.f51424c;
                jl0Var.f47034z0 = false;
                jl0Var.N0(true, false);
                jl0Var.Q0();
                return;
            default:
                super.onPageFinished(webView, str);
                jl0 jl0Var2 = this.f51424c;
                jl0Var2.f47034z0 = false;
                jl0Var2.N0(true, false);
                jl0Var2.Q0();
                return;
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i7 = this.f51422a;
        jl0 jl0Var = this.f51424c;
        switch (i7) {
            case 0:
                try {
                    if (!org.telegram.messenger.g0.M1(jl0Var.getParentActivity())) {
                        return true;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jl0Var.getParentActivity(), jl0Var.Y0);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = org.telegram.messenger.id.M0(2131752104, null);
                    u1Var.T = org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131752105, null), new gf0(this, 10));
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                    alertDialog$Builder.p();
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            default:
                try {
                    if (!org.telegram.messenger.g0.M1(jl0Var.getParentActivity())) {
                        return true;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, jl0Var.getParentActivity(), jl0Var.Y0);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                    u1Var2.R = org.telegram.messenger.id.M0(2131752104, null);
                    u1Var2.T = org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131752105, null), new gf0(this, 12));
                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747831, null), null);
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
        int i7 = this.f51422a;
        Context context = this.f51423b;
        boolean z10 = false;
        jl0 jl0Var = this.f51424c;
        switch (i7) {
            case 0:
                try {
                    Uri parse2 = Uri.parse(str);
                    if ("t.me".equals(parse2.getHost())) {
                        jl0Var.z0();
                    } else if (!jl0.f46992h1.contains(parse2.getScheme())) {
                        if (jl0.f46991g1.contains(parse2.getScheme())) {
                            return false;
                        }
                        try {
                            if (jl0Var.getParentActivity() != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                jl0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse2), 210);
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                            u1Var.R = jl0Var.f47019p0;
                            u1Var.T = org.telegram.messenger.id.M0(2131747429, null);
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                            alertDialog$Builder.p();
                        }
                    }
                    return true;
                } catch (Exception unused2) {
                    return false;
                }
            default:
                jl0Var.D = !str.equals(jl0Var.f47032y);
                try {
                    parse = Uri.parse(str);
                } catch (Exception unused3) {
                }
                if ("t.me".equals(parse.getHost())) {
                    jl0Var.z0();
                    return true;
                } else if (jl0.f46992h1.contains(parse.getScheme())) {
                    return true;
                } else {
                    if (!jl0.f46991g1.contains(parse.getScheme())) {
                        try {
                            if (jl0Var.getParentActivity() != null) {
                                z10 = true;
                            }
                            if (!z10) {
                                return true;
                            }
                            jl0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                            return true;
                        } catch (ActivityNotFoundException unused4) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                            u1Var2.R = jl0Var.f47019p0;
                            u1Var2.T = org.telegram.messenger.id.M0(2131747429, null);
                            alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747831, null), null);
                            alertDialog$Builder2.p();
                            return true;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
        }
    }
}
