package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.LinearLayout;
import bi.v3;
import bi.x2;
import c8.ja;
import c8.za;
import di.t7;
import fi.e2;
import hi.g7;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.cl;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.r2;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.br;
import org.telegram.ui.x21;
public final class n1 extends r41 implements is {
    public e2 f52725e;
    public final z10 f52726f;
    public long h;
    public long f52727n;
    public long f52728r;
    public int f52729s;
    public int f52730w;

    public n1(org.telegram.ui.q qVar) {
        this.f52726f = qVar;
    }

    public static boolean d0(File file, Boolean bool) {
        boolean z10;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z10 = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !d0(file2, bool)) {
                        z10 = false;
                    }
                }
            } else {
                z10 = true;
            }
            if (z10) {
                file.delete();
            }
        } else if (bool != null && bool.booleanValue() != file.getName().startsWith("Cookies")) {
            return false;
        } else {
            file.delete();
        }
        return true;
    }

    public static long e0(File file, Boolean bool) {
        long j3 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j3 += e0(file2, bool);
                }
                return j3;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override
    public final void Z(ArrayList arrayList, p41 p41Var) {
        String str;
        ArrayList<TL_account.WebDomainException> arrayList2;
        ArrayList<TL_account.WebDomainException> arrayList3;
        boolean M2 = getMessagesController().M2();
        arrayList.size();
        String M0 = hd.M0(2131752857, null);
        b41 b41Var = new b41(9);
        b41Var.d = 1;
        b41Var.f33181l = M0;
        b41Var.L(M2);
        arrayList.add(b41Var);
        arrayList.add(b41.C(hd.M0(2131752856, null)));
        int i7 = 0;
        if (!M2) {
            getMessagesController().O2();
            b41 i10 = b41.i(17, hd.M0(2131742934, null));
            i10.L(getMessagesController().O2());
            arrayList.add(i10);
            arrayList.add(b41.C(hd.M0(2131742933, null)));
            arrayList.add(b41.u(hd.M0(2131752865, null)));
            arrayList.size();
            e2 e2Var = this.f52725e;
            String M02 = hd.M0(2131752849, null);
            b41 b41Var2 = new b41(3);
            b41Var2.d = 16;
            b41Var2.G = e2Var;
            b41Var2.f33181l = M02;
            b41Var2.f33186q = true;
            arrayList.add(b41Var2);
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = getMessagesController().f25458z8;
            if (tL_webBrowserSettings == null) {
                arrayList3 = new ArrayList<>();
            } else {
                arrayList3 = tL_webBrowserSettings.inapp_exceptions;
            }
            int size = arrayList3.size();
            while (i7 < size) {
                TL_account.WebDomainException webDomainException = arrayList3.get(i7);
                i7++;
                TL_account.WebDomainException webDomainException2 = webDomainException;
                String str2 = webDomainException2.domain;
                String str3 = webDomainException2.title;
                long j3 = webDomainException2.favicon;
                int i11 = l1.f52701b;
                b41 K = b41.K(l1.class);
                K.f33181l = str2;
                K.f33183n = str3;
                K.B = j3;
                arrayList.add(K);
            }
            arrayList.add(b41.C(hd.M0(2131752866, null)));
            if (!arrayList3.isEmpty()) {
                arrayList.size();
                b41 e10 = b41.e(5, hd.M0(2131752848, null));
                e10.f33187r = true;
                arrayList.add(e10);
                arrayList.add(b41.C(null));
                return;
            }
            return;
        }
        arrayList.size();
        String M03 = hd.M0(2131752862, null);
        long j10 = this.f52727n;
        String str4 = "";
        if (j10 <= 0) {
            str = "";
        } else {
            str = org.telegram.messenger.g0.i0(j10, false, false);
        }
        arrayList.add(b41.d(3, 2131231776, M03, str));
        arrayList.size();
        String M04 = hd.M0(2131752864, null);
        long j11 = this.h;
        if (j11 > 0) {
            str4 = org.telegram.messenger.g0.i0(j11, false, false);
        }
        arrayList.add(b41.d(2, 2131231775, M04, str4));
        arrayList.add(b41.C(hd.M0(2131752860, null)));
        if (this.f52728r > 0) {
            arrayList.size();
            arrayList.add(b41.c(9, 2131231777, hd.M0(2131752850, null)));
            arrayList.size();
            arrayList.add(b41.d(7, 2131231775, hd.M0(2131752855, null), hd.H(',', "BrowserSettingsHistoryPages", (int) this.f52728r)));
            arrayList.add(b41.C(null));
        }
        arrayList.add(b41.u(hd.M0(2131752846, null)));
        arrayList.size();
        e2 e2Var2 = this.f52725e;
        String M05 = hd.M0(2131752849, null);
        b41 b41Var3 = new b41(3);
        b41Var3.d = 15;
        b41Var3.G = e2Var2;
        b41Var3.f33181l = M05;
        b41Var3.f33186q = true;
        arrayList.add(b41Var3);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = getMessagesController().f25458z8;
        if (tL_webBrowserSettings2 == null) {
            arrayList2 = new ArrayList<>();
        } else {
            arrayList2 = tL_webBrowserSettings2.external_exceptions;
        }
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            TL_account.WebDomainException webDomainException3 = arrayList2.get(i12);
            i12++;
            TL_account.WebDomainException webDomainException4 = webDomainException3;
            String str5 = webDomainException4.domain;
            String str6 = webDomainException4.title;
            long j12 = webDomainException4.favicon;
            int i13 = l1.f52701b;
            b41 K2 = b41.K(l1.class);
            K2.f33181l = str5;
            K2.f33183n = str6;
            K2.B = j12;
            arrayList.add(K2);
        }
        arrayList.add(b41.C(hd.M0(2131752847, null)));
        if (!arrayList2.isEmpty()) {
            arrayList.size();
            b41 e11 = b41.e(5, hd.M0(2131752848, null));
            e11.f33187r = true;
            arrayList.add(e11);
            arrayList.add(b41.C(null));
        }
        arrayList.size();
        arrayList.add(b41.d(6, 2131232355, hd.M0(2131745799, null), d1.a().f52586a));
        arrayList.add(b41.C(hd.M0(2131752842, null)));
        boolean z10 = r2.f26198a;
    }

    @Override
    public final CharSequence a0() {
        return hd.M0(2131752841, null);
    }

    @Override
    public final void b0(b41 b41Var, View view) {
        View view2;
        int i7;
        int i10;
        boolean z10;
        int i11;
        int i12 = b41Var.d;
        if (i12 == 12) {
            gz.J();
            ((q8) view).setChecked(gz.f23987v0);
        } else if (i12 == 13) {
            gz.f23990w0 = !gz.f23990w0;
            SharedPreferences.Editor edit = np.e1().edit();
            edit.putBoolean("onlyLocalInstantView", gz.f23990w0);
            edit.apply();
            ((q8) view).setChecked(gz.f23990w0);
        } else if (i12 == 17) {
            boolean z11 = !getMessagesController().O2();
            np messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.f25458z8;
            if (tL_webBrowserSettings != null) {
                messagesController.v5(tL_webBrowserSettings.open_external_browser, z11);
            }
            ((q8) view).setChecked(z11);
            this.f38882a.f39895g3.O(true);
        } else if (i12 == 1) {
            np messagesController2 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = messagesController2.f25458z8;
            if (tL_webBrowserSettings2 != null) {
                messagesController2.v5(!tL_webBrowserSettings2.open_external_browser, tL_webBrowserSettings2.display_close_button);
            }
            boolean M2 = getMessagesController().M2();
            q8 q8Var = (q8) view;
            q8Var.setChecked(M2);
            if (M2) {
                i11 = j6.f28887f6;
            } else {
                i11 = j6.f28868e6;
            }
            q8Var.b(j6.x0(null, i11, false), M2);
            this.f38882a.f39895g3.O(true);
        } else if (i12 == 10) {
            np messagesController3 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.f25458z8;
            if (tL_webBrowserSettings3 != null) {
                messagesController3.v5(tL_webBrowserSettings3.open_external_browser, true);
            }
            this.f38882a.f39895g3.O(true);
        } else if (i12 == 11) {
            np messagesController4 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.f25458z8;
            if (tL_webBrowserSettings4 != null) {
                messagesController4.v5(tL_webBrowserSettings4.open_external_browser, false);
            }
            this.f38882a.f39895g3.O(true);
        } else {
            String str = "";
            if (i12 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                String M0 = hd.M0(2131752864, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                if (this.h != 0) {
                    str = a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.h, false, false), ")");
                }
                t1Var.U = hd.a0(null, null, 2131752863, str);
                alertDialog$Builder.k(hd.M0(2131752101, null), new org.telegram.ui.ActionBar.q1(this) {
                    public final n1 f52695b;

                    {
                        this.f52695b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i13) {
                        switch (r2) {
                            case 0:
                                n1 n1Var = this.f52695b;
                                org.telegram.messenger.t0.f26600b.deleteDatabase("webview.db");
                                org.telegram.messenger.t0.f26600b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(n1Var.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(org.telegram.messenger.t0.f26600b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        n1.d0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                }
                                try {
                                    File file2 = new File(org.telegram.messenger.t0.f26600b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        n1.d0(file2, null);
                                    }
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                }
                                a2 b10 = a2.b();
                                HashMap hashMap = b10.f52573a;
                                if (hashMap == null) {
                                    b10.f52575c = false;
                                    b10.f52574b = true;
                                    b10.f52573a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                n1Var.f0();
                                return;
                            case 1:
                                n1 n1Var2 = this.f52695b;
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(org.telegram.messenger.t0.f26600b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        n1.d0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e12) {
                                    a8.g(e12, true);
                                }
                                n1Var2.f0();
                                return;
                            case 2:
                                n1 n1Var3 = this.f52695b;
                                try {
                                    za.f4816c.clear();
                                    za.d.clear();
                                    File file4 = new File(w7.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e13) {
                                    a8.g(e13, true);
                                }
                                n1Var3.f52728r = 0L;
                                n1Var3.f38882a.f39895g3.O(true);
                                return;
                            default:
                                n1 n1Var4 = this.f52695b;
                                np messagesController5 = n1Var4.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f25458z8;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.f25458z8.inapp_exceptions.clear();
                                    messagesController5.R4(messagesController5.f25458z8);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new cl(messagesController5, 6));
                                n1Var4.f38882a.f39895g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
            } else if (i12 == 3) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                String M02 = hd.M0(2131752862, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                t1Var2.S = M02;
                if (this.f52727n != 0) {
                    str = a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.f52727n, false, false), ")");
                }
                t1Var2.U = hd.a0(null, null, 2131752861, str);
                alertDialog$Builder2.k(hd.M0(2131752101, null), new org.telegram.ui.ActionBar.q1(this) {
                    public final n1 f52695b;

                    {
                        this.f52695b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i13) {
                        switch (r2) {
                            case 0:
                                n1 n1Var = this.f52695b;
                                org.telegram.messenger.t0.f26600b.deleteDatabase("webview.db");
                                org.telegram.messenger.t0.f26600b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(n1Var.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(org.telegram.messenger.t0.f26600b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        n1.d0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                }
                                try {
                                    File file2 = new File(org.telegram.messenger.t0.f26600b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        n1.d0(file2, null);
                                    }
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                }
                                a2 b10 = a2.b();
                                HashMap hashMap = b10.f52573a;
                                if (hashMap == null) {
                                    b10.f52575c = false;
                                    b10.f52574b = true;
                                    b10.f52573a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                n1Var.f0();
                                return;
                            case 1:
                                n1 n1Var2 = this.f52695b;
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(org.telegram.messenger.t0.f26600b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        n1.d0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e12) {
                                    a8.g(e12, true);
                                }
                                n1Var2.f0();
                                return;
                            case 2:
                                n1 n1Var3 = this.f52695b;
                                try {
                                    za.f4816c.clear();
                                    za.d.clear();
                                    File file4 = new File(w7.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e13) {
                                    a8.g(e13, true);
                                }
                                n1Var3.f52728r = 0L;
                                n1Var3.f38882a.f39895g3.O(true);
                                return;
                            default:
                                n1 n1Var4 = this.f52695b;
                                np messagesController5 = n1Var4.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f25458z8;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.f25458z8.inapp_exceptions.clear();
                                    messagesController5.R4(messagesController5.f25458z8);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new cl(messagesController5, 6));
                                n1Var4.f38882a.f39895g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder2.h(hd.M0(2131752589, null), null);
                alertDialog$Builder2.d(-1);
                alertDialog$Builder2.p();
            } else if (i12 == 7) {
                ArrayList a10 = za.a(null);
                int size = a10.size();
                long j3 = Long.MAX_VALUE;
                int i13 = 0;
                while (i13 < size) {
                    Object obj = a10.get(i13);
                    i13++;
                    j3 = Math.min(j3, ((w0) obj).f52856b);
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                String M03 = hd.M0(2131752855, null);
                org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28392a;
                t1Var3.S = M03;
                t1Var3.U = hd.a0(null, null, 2131752854, hd.u(j3 / 1000, false));
                alertDialog$Builder3.k(hd.M0(2131752101, null), new org.telegram.ui.ActionBar.q1(this) {
                    public final n1 f52695b;

                    {
                        this.f52695b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i132) {
                        switch (r2) {
                            case 0:
                                n1 n1Var = this.f52695b;
                                org.telegram.messenger.t0.f26600b.deleteDatabase("webview.db");
                                org.telegram.messenger.t0.f26600b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(n1Var.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(org.telegram.messenger.t0.f26600b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        n1.d0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                }
                                try {
                                    File file2 = new File(org.telegram.messenger.t0.f26600b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        n1.d0(file2, null);
                                    }
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                }
                                a2 b10 = a2.b();
                                HashMap hashMap = b10.f52573a;
                                if (hashMap == null) {
                                    b10.f52575c = false;
                                    b10.f52574b = true;
                                    b10.f52573a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                n1Var.f0();
                                return;
                            case 1:
                                n1 n1Var2 = this.f52695b;
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(org.telegram.messenger.t0.f26600b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        n1.d0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e12) {
                                    a8.g(e12, true);
                                }
                                n1Var2.f0();
                                return;
                            case 2:
                                n1 n1Var3 = this.f52695b;
                                try {
                                    za.f4816c.clear();
                                    za.d.clear();
                                    File file4 = new File(w7.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e13) {
                                    a8.g(e13, true);
                                }
                                n1Var3.f52728r = 0L;
                                n1Var3.f38882a.f39895g3.O(true);
                                return;
                            default:
                                n1 n1Var4 = this.f52695b;
                                np messagesController5 = n1Var4.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f25458z8;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.f25458z8.inapp_exceptions.clear();
                                    messagesController5.R4(messagesController5.f25458z8);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new cl(messagesController5, 6));
                                n1Var4.f38882a.f39895g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.h(hd.M0(2131752589, null), null);
                alertDialog$Builder3.d(-1);
                alertDialog$Builder3.p();
            } else if (i12 == 9) {
                x0[] x0VarArr = {null};
                org.telegram.ui.ActionBar.e2 x0Var = new x0(null, new x21(18, this, x0VarArr));
                x0VarArr[0] = x0Var;
                presentFragment(x0Var);
            } else if (i12 == 5) {
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                String M04 = hd.M0(2131742937, null);
                org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.f28392a;
                t1Var4.S = M04;
                t1Var4.U = hd.M0(2131742938, null);
                alertDialog$Builder4.k(hd.M0(2131751598, null), new org.telegram.ui.ActionBar.q1(this) {
                    public final n1 f52695b;

                    {
                        this.f52695b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i132) {
                        switch (r2) {
                            case 0:
                                n1 n1Var = this.f52695b;
                                org.telegram.messenger.t0.f26600b.deleteDatabase("webview.db");
                                org.telegram.messenger.t0.f26600b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(n1Var.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(org.telegram.messenger.t0.f26600b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        n1.d0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                }
                                try {
                                    File file2 = new File(org.telegram.messenger.t0.f26600b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        n1.d0(file2, null);
                                    }
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                }
                                a2 b10 = a2.b();
                                HashMap hashMap = b10.f52573a;
                                if (hashMap == null) {
                                    b10.f52575c = false;
                                    b10.f52574b = true;
                                    b10.f52573a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                n1Var.f0();
                                return;
                            case 1:
                                n1 n1Var2 = this.f52695b;
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(org.telegram.messenger.t0.f26600b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        n1.d0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e12) {
                                    a8.g(e12, true);
                                }
                                n1Var2.f0();
                                return;
                            case 2:
                                n1 n1Var3 = this.f52695b;
                                try {
                                    za.f4816c.clear();
                                    za.d.clear();
                                    File file4 = new File(w7.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e13) {
                                    a8.g(e13, true);
                                }
                                n1Var3.f52728r = 0L;
                                n1Var3.f38882a.f39895g3.O(true);
                                return;
                            default:
                                n1 n1Var4 = this.f52695b;
                                np messagesController5 = n1Var4.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f25458z8;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.f25458z8.inapp_exceptions.clear();
                                    messagesController5.R4(messagesController5.f25458z8);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new cl(messagesController5, 6));
                                n1Var4.f38882a.f39895g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder4.h(hd.M0(2131752589, null), null);
                alertDialog$Builder4.d(-1);
                alertDialog$Builder4.p();
            } else if (b41Var.H(l1.class)) {
                m1 m1Var = (m1) view;
                String str2 = m1Var.f52716e;
                m60 F = m60.F((ViewGroup) this.fragmentView, null, m1Var);
                F.f37111s = 40;
                F.c(2131231785, hd.M0(2131746321, null), new e1(1, this, str2), false);
                F.Z();
            } else {
                int i14 = b41Var.d;
                if (i14 == 6) {
                    if (getParentActivity() != null) {
                        AtomicReference atomicReference = new AtomicReference();
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        ArrayList b10 = d1.b();
                        int size2 = b10.size();
                        CharSequence[] charSequenceArr = new CharSequence[size2];
                        for (int i15 = 0; i15 < size2; i15++) {
                            charSequenceArr[i15] = ((d1) b10.get(i15)).f52586a;
                            i6 i6Var = new i6(getParentActivity(), null);
                            i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                            i6Var.a(j6.x0(null, j6.f28905g7, false), j6.x0(null, j6.E5, false));
                            CharSequence charSequence = charSequenceArr[i15];
                            if (i15 == gz.f23970p0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            i6Var.b(charSequence, z10);
                            int i16 = j6.f28941i6;
                            org.telegram.ui.Cells.y h02 = j6.h0(j6.x0(null, i16, false), 2, -1);
                            m6 M = q6.M(i16);
                            i6Var.setBackground(h02);
                            q6.j(i6Var, h02, null, M, null);
                            linearLayout.addView(i6Var);
                            i6Var.setOnClickListener(new x2(i15, view, atomicReference));
                        }
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                        String M05 = hd.M0(2131745799, null);
                        org.telegram.ui.ActionBar.t1 t1Var5 = alertDialog$Builder5.f28392a;
                        t1Var5.S = M05;
                        alertDialog$Builder5.o(linearLayout);
                        alertDialog$Builder5.h(hd.M0(2131752589, null), null);
                        atomicReference.set(t1Var5);
                        showDialog(t1Var5);
                    }
                } else if (i14 == 15 || i14 == 16) {
                    boolean M22 = getMessagesController().M2();
                    if (getMessagesController().L2(M22)) {
                        t4.r0(this, hd.M0(2131742935, null), hd.M0(2131742936, null), null);
                        return;
                    }
                    Activity parentActivity = getParentActivity();
                    e6 resourceProvider = getResourceProvider();
                    t7 t7Var = new t7(10, this, M22);
                    Pattern pattern = t4.f39507a;
                    Activity W = org.telegram.messenger.g0.W(parentActivity);
                    if (W != null) {
                        view2 = W.getCurrentFocus();
                    } else {
                        view2 = null;
                    }
                    org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                    AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
                    if (M22) {
                        i7 = 2131752868;
                    } else {
                        i7 = 2131752867;
                    }
                    String M06 = hd.M0(i7, null);
                    org.telegram.ui.ActionBar.t1 t1Var6 = alertDialog$Builder6.f28392a;
                    t1Var6.S = M06;
                    if (M22) {
                        i10 = 2131752870;
                    } else {
                        i10 = 2131752869;
                    }
                    t1Var6.U = hd.M0(i10, null);
                    ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i17 = j6.f28957j5;
                    q6.U(editTextBoldCursor, i17, resourceProvider);
                    q6.D(editTextBoldCursor, j6.Oi, resourceProvider);
                    editTextBoldCursor.setHint(hd.M0(2131752871, null));
                    editTextBoldCursor.setInputType(17);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setFocusable(true);
                    editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.A(j6.f29089q6, resourceProvider);
                    ShapeDrawable d02 = j6.d0(org.telegram.messenger.g0.L(22.0f), j6.r1(0.06f, j6.w0(i17, resourceProvider)));
                    m6 K = q6.K(0.06f, i17);
                    editTextBoldCursor.setBackground(d02);
                    q6.j(editTextBoldCursor, d02, K, null, resourceProvider);
                    m5 m5Var = new m5(editTextBoldCursor, t7Var, t1VarArr, view2, 16);
                    editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.q0(m5Var, 0));
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.addView((View) editTextBoldCursor, ja.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                    alertDialog$Builder6.c();
                    alertDialog$Builder6.o(linearLayout2);
                    t1Var6.f29614a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f23609q.x * 85) / 100);
                    alertDialog$Builder6.k(hd.M0(2131751354, null), new org.telegram.ui.Components.s(m5Var, 2));
                    alertDialog$Builder6.h(hd.M0(2131752589, null), new br(9));
                    t1VarArr[0] = t1Var6;
                    t1Var6.f29639k0 = false;
                    t1Var6.setOnDismissListener(new org.telegram.ui.Components.m0(editTextBoldCursor, 1));
                    t1VarArr[0].setOnShowListener(new org.telegram.ui.Components.r0(0, editTextBoldCursor));
                    t1VarArr[0].show();
                }
            }
        }
    }

    @Override
    public final boolean c0(b41 b41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(2131232560).mutate();
        Drawable g10 = i5.c.g(context, 2131232561);
        int themedColor = getThemedColor(j6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        g10.setColorFilter(new PorterDuffColorFilter(getThemedColor(j6.f28979k7), mode));
        e2 e2Var = new e2(mutate, g10, 4);
        e2Var.f34679y = org.telegram.messenger.g0.L(2.0f);
        this.f52725e = e2Var;
        this.fragmentView = super.createView(context);
        this.f38882a.r1();
        this.f38882a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        v3 v3Var;
        if (i7 == ns.R5 && (v3Var = this.f38882a) != null) {
            v3Var.f39895g3.O(true);
        }
    }

    public final void f0() {
        p41 p41Var;
        ArrayList a10 = za.a(new g7(this, 23));
        if (a10 != null) {
            this.f52728r = a10.size();
            v3 v3Var = this.f38882a;
            if (v3Var != null && (p41Var = v3Var.f39895g3) != null && v3Var.H) {
                p41Var.O(true);
            }
        }
        Utilities.f22416e.c(new org.telegram.ui.ActionBar.r0(this, 29));
    }

    @Override
    public final uj0 getListViewForSimpleGlass() {
        return this.f38882a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        f0();
        getNotificationCenter().c(this, ns.R5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, ns.R5);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z10;
        super.onThemeColorsChanged();
        try {
            e2 e2Var = this.f52725e;
            if (e2Var != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int themedColor = getThemedColor(j6.N6);
                int themedColor2 = getThemedColor(j6.f28979k7);
                if (themedColor == this.f52729s && themedColor2 == this.f52730w) {
                    return;
                }
                this.f52729s = themedColor;
                this.f52730w = themedColor2;
                Drawable drawable = e2Var.f34669a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = e2Var.f34670b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                v3 v3Var = this.f38882a;
                if (v3Var != null) {
                    v3Var.g1();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
