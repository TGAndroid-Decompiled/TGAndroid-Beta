package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xk0 extends WebViewClient {
    public final int f53258a;
    public final Context f53259b;
    public final kl0 f53260c;

    public xk0(kl0 kl0Var, Context context, int i7) {
        this.f53258a = i7;
        this.f53260c = kl0Var;
        this.f53259b = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        switch (this.f53258a) {
            case 0:
                super.onPageFinished(webView, str);
                kl0 kl0Var = this.f53260c;
                kl0Var.A0 = false;
                kl0Var.N0(true, false);
                kl0Var.Q0();
                return;
            default:
                super.onPageFinished(webView, str);
                kl0 kl0Var2 = this.f53260c;
                kl0Var2.A0 = false;
                kl0Var2.N0(true, false);
                kl0Var2.Q0();
                return;
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i7 = this.f53258a;
        kl0 kl0Var = this.f53260c;
        switch (i7) {
            case 0:
                try {
                    if (!org.telegram.messenger.g0.M1(kl0Var.getParentActivity())) {
                        return true;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, kl0Var.getParentActivity(), kl0Var.Z0);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = org.telegram.messenger.hd.M0(2131752104, null);
                    t1Var.U = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752105, null), new ef0(this, 10));
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                    alertDialog$Builder.p();
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            default:
                try {
                    if (!org.telegram.messenger.g0.M1(kl0Var.getParentActivity())) {
                        return true;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, kl0Var.getParentActivity(), kl0Var.Z0);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                    t1Var2.S = org.telegram.messenger.hd.M0(2131752104, null);
                    t1Var2.U = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752105, null), new ef0(this, 12));
                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747831, null), null);
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
        boolean z10;
        Uri parse;
        int i7 = this.f53258a;
        Context context = this.f53259b;
        boolean z11 = false;
        kl0 kl0Var = this.f53260c;
        switch (i7) {
            case 0:
                try {
                    Uri parse2 = Uri.parse(str);
                    if ("t.me".equals(parse2.getHost())) {
                        kl0Var.z0();
                    } else if (!kl0.f48673i1.contains(parse2.getScheme())) {
                        if (kl0.f48672h1.contains(parse2.getScheme())) {
                            return false;
                        }
                        try {
                            if (kl0Var.getParentActivity() != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                kl0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse2), 210);
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.S = kl0Var.f48702q0;
                            t1Var.U = org.telegram.messenger.hd.M0(2131747429, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                            alertDialog$Builder.p();
                        }
                    }
                    return true;
                } catch (Exception unused2) {
                    return false;
                }
            default:
                kl0Var.E = !str.equals(kl0Var.f48714y);
                try {
                    parse = Uri.parse(str);
                } catch (Exception unused3) {
                }
                if ("t.me".equals(parse.getHost())) {
                    kl0Var.z0();
                    return true;
                } else if (kl0.f48673i1.contains(parse.getScheme())) {
                    return true;
                } else {
                    if (!kl0.f48672h1.contains(parse.getScheme())) {
                        try {
                            if (kl0Var.getParentActivity() != null) {
                                z11 = true;
                            }
                            if (!z11) {
                                return true;
                            }
                            kl0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                            return true;
                        } catch (ActivityNotFoundException unused4) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                            t1Var2.S = kl0Var.f48702q0;
                            t1Var2.U = org.telegram.messenger.hd.M0(2131747429, null);
                            alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                            alertDialog$Builder2.p();
                            return true;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
        }
    }
}
