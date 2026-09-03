package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t11 extends org.telegram.ui.ActionBar.j {
    public final Context f38355a;
    public final ProxyListActivity f38356b;

    public t11(ProxyListActivity proxyListActivity, Context context) {
        this.f38356b = proxyListActivity;
        this.f38355a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        StringBuilder sb;
        ProxyListActivity proxyListActivity = this.f38356b;
        ArrayList arrayList = proxyListActivity.E;
        if (i10 != -1) {
            int i13 = 0;
            if (i10 != 0) {
                if (i10 == 1) {
                    StringBuilder sb2 = new StringBuilder();
                    int size = arrayList.size();
                    while (i13 < size) {
                        Object obj = arrayList.get(i13);
                        i13++;
                        SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) obj;
                        if (sb2.length() > 0) {
                            sb2.append("\n\n");
                        }
                        rf.b bVar = proxyInfo.settings;
                        String str = bVar.f43479f;
                        String str2 = bVar.e;
                        String str3 = bVar.d;
                        int i14 = bVar.f43476a;
                        int c3 = m1.j.c(i14);
                        if (c3 != 1) {
                            if (c3 != 2) {
                                sb = new StringBuilder("https://t.me/socks?");
                            } else {
                                sb = new StringBuilder("https://t.me/webproxy?");
                            }
                        } else {
                            sb = new StringBuilder("https://t.me/proxy?");
                        }
                        try {
                            sb.append("server=");
                            sb.append(URLEncoder.encode(bVar.f43477b, "UTF-8"));
                            if (i14 != 3) {
                                sb.append("&port=");
                                sb.append(bVar.f43478c);
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                sb.append("&user=");
                                sb.append(URLEncoder.encode(str3, "UTF-8"));
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                sb.append("&pass=");
                                sb.append(URLEncoder.encode(str2, "UTF-8"));
                            }
                            if (!TextUtils.isEmpty(str)) {
                                sb.append("&secret=");
                                sb.append(URLEncoder.encode(str, "UTF-8"));
                            }
                        } catch (UnsupportedEncodingException unused) {
                        }
                        sb2.append(sb.toString());
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                    if (arrayList.size() > 1) {
                        i12 = R.string.ShareLinks;
                    } else {
                        i12 = R.string.ShareLink;
                    }
                    Intent createChooser = Intent.createChooser(intent, LocaleController.getString(i12));
                    createChooser.setFlags(268435456);
                    this.f38355a.startActivity(createChooser);
                    u11 u11Var = proxyListActivity.f32180a;
                    if (u11Var != null) {
                        u11Var.F();
                        return;
                    }
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            if (arrayList.size() > 1) {
                i11 = R.string.DeleteProxyMultiConfirm;
            } else {
                i11 = R.string.DeleteProxyConfirm;
            }
            alertDialog$Builder.f19478a.Q = LocaleController.getString(i11);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kl0(this, 14));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
            proxyListActivity.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
            }
        } else if (arrayList.isEmpty()) {
            proxyListActivity.finishFragment();
        } else {
            proxyListActivity.f32180a.F();
        }
    }
}
