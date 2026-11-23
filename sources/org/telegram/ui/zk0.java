package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zk0 extends WebViewClient {
    public final int f54575a;
    public final Context f54576b;
    public final ml0 f54577c;

    public zk0(ml0 ml0Var, Context context, int i7) {
        this.f54575a = i7;
        this.f54577c = ml0Var;
        this.f54576b = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        switch (this.f54575a) {
            case 0:
                super.onPageFinished(webView, str);
                ml0 ml0Var = this.f54577c;
                ml0Var.A0 = false;
                ml0Var.N0(true, false);
                ml0Var.Q0();
                return;
            default:
                super.onPageFinished(webView, str);
                ml0 ml0Var2 = this.f54577c;
                ml0Var2.A0 = false;
                ml0Var2.N0(true, false);
                ml0Var2.Q0();
                return;
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i7 = this.f54575a;
        ml0 ml0Var = this.f54577c;
        switch (i7) {
            case 0:
                try {
                    if (!org.telegram.messenger.g0.M1(ml0Var.getParentActivity())) {
                        return true;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ml0Var.getParentActivity(), ml0Var.Z0);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                    t1Var.S = org.telegram.messenger.hd.N0(2131752092, null);
                    t1Var.U = org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131752093, null), new hf0(this, 10));
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                    alertDialog$Builder.p();
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            default:
                try {
                    if (!org.telegram.messenger.g0.M1(ml0Var.getParentActivity())) {
                        return true;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, ml0Var.getParentActivity(), ml0Var.Z0);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28777a;
                    t1Var2.S = org.telegram.messenger.hd.N0(2131752092, null);
                    t1Var2.U = org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131752093, null), new hf0(this, 12));
                    alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131747637, null), null);
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
        int i7 = this.f54575a;
        Context context = this.f54576b;
        boolean z11 = false;
        ml0 ml0Var = this.f54577c;
        switch (i7) {
            case 0:
                try {
                    Uri parse2 = Uri.parse(str);
                    if ("t.me".equals(parse2.getHost())) {
                        ml0Var.z0();
                    } else if (!ml0.f49897i1.contains(parse2.getScheme())) {
                        if (ml0.f49896h1.contains(parse2.getScheme())) {
                            return false;
                        }
                        try {
                            if (ml0Var.getParentActivity() != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                ml0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse2), 210);
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                            t1Var.S = ml0Var.f49926q0;
                            t1Var.U = org.telegram.messenger.hd.N0(2131747235, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                            alertDialog$Builder.p();
                        }
                    }
                    return true;
                } catch (Exception unused2) {
                    return false;
                }
            default:
                ml0Var.E = !str.equals(ml0Var.f49938y);
                try {
                    parse = Uri.parse(str);
                } catch (Exception unused3) {
                }
                if ("t.me".equals(parse.getHost())) {
                    ml0Var.z0();
                    return true;
                } else if (ml0.f49897i1.contains(parse.getScheme())) {
                    return true;
                } else {
                    if (!ml0.f49896h1.contains(parse.getScheme())) {
                        try {
                            if (ml0Var.getParentActivity() != null) {
                                z11 = true;
                            }
                            if (!z11) {
                                return true;
                            }
                            ml0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                            return true;
                        } catch (ActivityNotFoundException unused4) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28777a;
                            t1Var2.S = ml0Var.f49926q0;
                            t1Var2.U = org.telegram.messenger.hd.N0(2131747235, null);
                            alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                            alertDialog$Builder2.p();
                            return true;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
        }
    }
}
