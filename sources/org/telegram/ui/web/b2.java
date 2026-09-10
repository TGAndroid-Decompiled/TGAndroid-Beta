package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.LinearLayout;
import bi.ve;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.m6;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w70;
import org.telegram.ui.da;
import org.telegram.ui.i01;
import org.telegram.ui.nj0;
import w7.a6;
public final class b2 extends m61 implements NotificationCenter.NotificationCenterDelegate {
    public i01 d;
    public final Utilities.Callback e;
    public long f37869f;
    public long h;
    public long f37870n;

    public b2(org.telegram.ui.s sVar) {
        this.e = sVar;
    }

    public static boolean Y(File file, Boolean bool) {
        boolean z10;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z10 = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !Y(file2, bool)) {
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

    public static long Z(File file, Boolean bool) {
        long j3 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j3 += Z(file2, bool);
                }
                return j3;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override
    public final void U(ArrayList arrayList, j61 j61Var) {
        String str;
        boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        v51 v51Var = new v51(9);
        v51Var.d = 1;
        v51Var.f27829l = string;
        v51Var.K(isWebBrowserInAppEnabled);
        arrayList.add(v51Var);
        com.google.android.gms.internal.vision.e2.w(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!isWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            v51 i10 = v51.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            i10.K(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(i10);
            com.google.android.gms.internal.vision.e2.w(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(v51.t(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            i01 i01Var = this.d;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            v51 v51Var2 = new v51(3);
            v51Var2.d = 16;
            v51Var2.G = i01Var;
            v51Var2.f27829l = string2;
            v51Var2.f27834q = true;
            arrayList.add(v51Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str2 = webDomainException.domain;
                String str3 = webDomainException.title;
                long j3 = webDomainException.favicon;
                int i11 = z1.f38170a;
                v51 J = v51.J(z1.class);
                J.f27829l = str2;
                J.f27831n = str3;
                J.B = j3;
                arrayList.add(J);
            }
            arrayList.add(v51.B(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (!webBrowserExceptionsList.isEmpty()) {
                arrayList.size();
                v51 e = v51.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
                e.f27835r = true;
                arrayList.add(e);
                arrayList.add(v51.B(null));
                return;
            }
            return;
        }
        arrayList.size();
        int i12 = R.drawable.menu_clear_cookies;
        String string3 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
        long j10 = this.h;
        String str4 = "";
        if (j10 <= 0) {
            str = "";
        } else {
            str = AndroidUtilities.formatFileSize(j10);
        }
        arrayList.add(v51.d(3, i12, string3, str));
        arrayList.size();
        int i13 = R.drawable.menu_clear_cache;
        String string4 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j11 = this.f37869f;
        if (j11 > 0) {
            str4 = AndroidUtilities.formatFileSize(j11);
        }
        arrayList.add(v51.d(2, i13, string4, str4));
        com.google.android.gms.internal.vision.e2.w(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.f37870n > 0) {
            arrayList.size();
            arrayList.add(v51.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(v51.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.f37870n, ',')));
            arrayList.add(v51.B(null));
        }
        arrayList.add(v51.t(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        i01 i01Var2 = this.d;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        v51 v51Var3 = new v51(3);
        v51Var3.d = 15;
        v51Var3.G = i01Var2;
        v51Var3.f27829l = string5;
        v51Var3.f27834q = true;
        arrayList.add(v51Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str5 = webDomainException2.domain;
            String str6 = webDomainException2.title;
            long j12 = webDomainException2.favicon;
            int i14 = z1.f38170a;
            v51 J2 = v51.J(z1.class);
            J2.f27829l = str5;
            J2.f27831n = str6;
            J2.B = j12;
            arrayList.add(J2);
        }
        arrayList.add(v51.B(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            v51 e7 = v51.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e7.f27835r = true;
            arrayList.add(e7);
            arrayList.add(v51.B(null));
        }
        arrayList.size();
        arrayList.add(v51.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), o1.a().f38031a));
        com.google.android.gms.internal.vision.e2.w(R.string.BrowserSettingsSearchEngineInfo, arrayList);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            v51 i15 = v51.i(12, "adaptable colors");
            i15.K(SharedConfig.adaptableColorInBrowser);
            arrayList.add(i15);
            v51 i16 = v51.i(13, "only local IV");
            i16.K(SharedConfig.onlyLocalInstantView);
            arrayList.add(i16);
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BrowserSettingsTitle);
    }

    @Override
    public final void W(v51 v51Var, View view) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13 = v51Var.d;
        if (i13 == 12) {
            SharedConfig.toggleBrowserAdaptableColors();
            ((x8) view).setChecked(SharedConfig.adaptableColorInBrowser);
        } else if (i13 == 13) {
            SharedConfig.toggleLocalInstantView();
            ((x8) view).setChecked(SharedConfig.onlyLocalInstantView);
        } else if (i13 == 17) {
            boolean z11 = !getMessagesController().isWebBrowserUseCustomTabs();
            getMessagesController().toggleWebBrowserUseCustomTabs(z11);
            ((x8) view).setChecked(z11);
            this.f25171a.Y2.N(true);
        } else {
            View view2 = null;
            if (i13 == 1) {
                getMessagesController().toggleWebBrowserInAppEnabled();
                boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
                x8 x8Var = (x8) view;
                x8Var.setChecked(isWebBrowserInAppEnabled);
                if (isWebBrowserInAppEnabled) {
                    i12 = j6.f17964f6;
                } else {
                    i12 = j6.f17946e6;
                }
                x8Var.b(j6.w0(null, i12, false), isWebBrowserInAppEnabled);
                this.f25171a.Y2.N(true);
            } else if (i13 == 10) {
                getMessagesController().toggleWebBrowserUseCustomTabs(true);
                this.f25171a.Y2.N(true);
            } else if (i13 == 11) {
                getMessagesController().toggleWebBrowserUseCustomTabs(false);
                this.f25171a.Y2.N(true);
            } else {
                String str = "";
                if (i13 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                    d2Var.R = string;
                    int i14 = R.string.BrowserSettingsCacheClearText;
                    if (this.f37869f != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.f37869f) + ")";
                    }
                    d2Var.T = LocaleController.formatString(i14, str);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2(this) {
                        public final b2 f38141b;

                        {
                            this.f38141b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.d2 d2Var2, int i15) {
                            switch (r2) {
                                case 0:
                                    b2 b2Var = this.f38141b;
                                    b2Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(b2Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            b2.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            b2.Y(file2, null);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    p2 b10 = p2.b();
                                    HashMap hashMap = b10.f38052a;
                                    if (hashMap == null) {
                                        b10.f38054c = false;
                                        b10.f38053b = true;
                                        b10.f38052a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    b2Var.a0();
                                    return;
                                case 1:
                                    b2 b2Var2 = this.f38141b;
                                    b2Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            b2.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    b2Var2.a0();
                                    return;
                                case 2:
                                    b2 b2Var3 = this.f38141b;
                                    try {
                                        f1.f37934c.clear();
                                        f1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    b2Var3.f37870n = 0L;
                                    b2Var3.f25171a.Y2.N(true);
                                    return;
                                default:
                                    b2 b2Var4 = this.f38141b;
                                    b2Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    b2Var4.f25171a.Y2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.o();
                } else if (i13 == 3) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string2 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f17528a;
                    d2Var2.R = string2;
                    int i15 = R.string.BrowserSettingsCookiesClearText;
                    if (this.h != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
                    }
                    d2Var2.T = LocaleController.formatString(i15, str);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2(this) {
                        public final b2 f38141b;

                        {
                            this.f38141b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.d2 d2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    b2 b2Var = this.f38141b;
                                    b2Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(b2Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            b2.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            b2.Y(file2, null);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    p2 b10 = p2.b();
                                    HashMap hashMap = b10.f38052a;
                                    if (hashMap == null) {
                                        b10.f38054c = false;
                                        b10.f38053b = true;
                                        b10.f38052a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    b2Var.a0();
                                    return;
                                case 1:
                                    b2 b2Var2 = this.f38141b;
                                    b2Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            b2.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    b2Var2.a0();
                                    return;
                                case 2:
                                    b2 b2Var3 = this.f38141b;
                                    try {
                                        f1.f37934c.clear();
                                        f1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    b2Var3.f37870n = 0L;
                                    b2Var3.f25171a.Y2.N(true);
                                    return;
                                default:
                                    b2 b2Var4 = this.f38141b;
                                    b2Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    b2Var4.f25171a.Y2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder2.d(-1);
                    alertDialog$Builder2.o();
                } else if (i13 == 7) {
                    ArrayList a2 = f1.a(null);
                    int size = a2.size();
                    long j3 = Long.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj = a2.get(i16);
                        i16++;
                        j3 = Math.min(j3, ((e1) obj).f37927b);
                    }
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string3 = LocaleController.getString(R.string.BrowserSettingsHistoryClear);
                    org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f17528a;
                    d2Var3.R = string3;
                    d2Var3.T = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(j3 / 1000));
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2(this) {
                        public final b2 f38141b;

                        {
                            this.f38141b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.d2 d2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    b2 b2Var = this.f38141b;
                                    b2Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(b2Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            b2.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            b2.Y(file2, null);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    p2 b10 = p2.b();
                                    HashMap hashMap = b10.f38052a;
                                    if (hashMap == null) {
                                        b10.f38054c = false;
                                        b10.f38053b = true;
                                        b10.f38052a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    b2Var.a0();
                                    return;
                                case 1:
                                    b2 b2Var2 = this.f38141b;
                                    b2Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            b2.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    b2Var2.a0();
                                    return;
                                case 2:
                                    b2 b2Var3 = this.f38141b;
                                    try {
                                        f1.f37934c.clear();
                                        f1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    b2Var3.f37870n = 0L;
                                    b2Var3.f25171a.Y2.N(true);
                                    return;
                                default:
                                    b2 b2Var4 = this.f38141b;
                                    b2Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    b2Var4.f25171a.Y2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder3.d(-1);
                    alertDialog$Builder3.o();
                } else if (i13 == 9) {
                    h1[] h1VarArr = {null};
                    org.telegram.ui.ActionBar.p2 h1Var = new h1(null, new nj0(11, this, h1VarArr));
                    h1VarArr[0] = h1Var;
                    presentFragment(h1Var);
                } else if (i13 == 5) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
                    org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.f17528a;
                    d2Var4.R = string4;
                    d2Var4.T = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) {
                        public final b2 f38141b;

                        {
                            this.f38141b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.d2 d2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    b2 b2Var = this.f38141b;
                                    b2Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(b2Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            b2.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            b2.Y(file2, null);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    p2 b10 = p2.b();
                                    HashMap hashMap = b10.f38052a;
                                    if (hashMap == null) {
                                        b10.f38054c = false;
                                        b10.f38053b = true;
                                        b10.f38052a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    b2Var.a0();
                                    return;
                                case 1:
                                    b2 b2Var2 = this.f38141b;
                                    b2Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            b2.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    b2Var2.a0();
                                    return;
                                case 2:
                                    b2 b2Var3 = this.f38141b;
                                    try {
                                        f1.f37934c.clear();
                                        f1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    b2Var3.f37870n = 0L;
                                    b2Var3.f25171a.Y2.N(true);
                                    return;
                                default:
                                    b2 b2Var4 = this.f38141b;
                                    b2Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    b2Var4.f25171a.Y2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder4.d(-1);
                    alertDialog$Builder4.o();
                } else if (v51Var.G(z1.class)) {
                    a2 a2Var = (a2) view;
                    String str2 = a2Var.e;
                    w70 F = w70.F((ViewGroup) this.fragmentView, null, a2Var);
                    F.f28701s = 40;
                    F.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new x1(0, this, str2), false);
                    F.Z();
                } else {
                    int i17 = v51Var.d;
                    if (i17 == 6) {
                        if (getParentActivity() != null) {
                            AtomicReference atomicReference = new AtomicReference();
                            LinearLayout linearLayout = new LinearLayout(getParentActivity());
                            linearLayout.setOrientation(1);
                            ArrayList b10 = o1.b();
                            int size2 = b10.size();
                            CharSequence[] charSequenceArr = new CharSequence[size2];
                            for (int i18 = 0; i18 < size2; i18++) {
                                charSequenceArr[i18] = ((o1) b10.get(i18)).f38031a;
                                m6 m6Var = new m6(getParentActivity(), null);
                                m6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                                m6Var.a(j6.w0(null, j6.f17983g7, false), j6.w0(null, j6.E5, false));
                                CharSequence charSequence = charSequenceArr[i18];
                                if (i18 == SharedConfig.searchEngineType) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                m6Var.b(charSequence, z10);
                                m6Var.setBackground(j6.f0(j6.w0(null, j6.f18017i6, false), 2, -1));
                                linearLayout.addView(m6Var);
                                m6Var.setOnClickListener(new wa(i18, view, atomicReference));
                            }
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                            String string5 = LocaleController.getString(R.string.SearchEngine);
                            org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder5.f17528a;
                            d2Var5.R = string5;
                            alertDialog$Builder5.n(linearLayout);
                            alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                            atomicReference.set(d2Var5);
                            showDialog(d2Var5);
                        }
                    } else if (i17 == 15 || i17 == 16) {
                        boolean isWebBrowserInAppEnabled2 = getMessagesController().isWebBrowserInAppEnabled();
                        if (getMessagesController().isWebBrowserExceptionsLimitReached(isWebBrowserInAppEnabled2)) {
                            d5.u0(this, LocaleController.getString(R.string.WebBrowserExceptionsLimitTitle), LocaleController.getString(R.string.WebBrowserExceptionsLimitMessage), null);
                            return;
                        }
                        Activity parentActivity = getParentActivity();
                        f6 resourceProvider = getResourceProvider();
                        ve veVar = new ve(4, this, isWebBrowserInAppEnabled2);
                        Pattern pattern = d5.f22289a;
                        Activity findActivity = AndroidUtilities.findActivity(parentActivity);
                        if (findActivity != null) {
                            view2 = findActivity.getCurrentFocus();
                        }
                        View view3 = view2;
                        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
                        AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(parentActivity, 0, resourceProvider);
                        if (isWebBrowserInAppEnabled2) {
                            i10 = R.string.BrowserSettingsAddTitle;
                        } else {
                            i10 = R.string.BrowserSettingsAddTitleExternal;
                        }
                        String string6 = LocaleController.getString(i10);
                        org.telegram.ui.ActionBar.d2 d2Var6 = alertDialog$Builder6.f17528a;
                        d2Var6.R = string6;
                        if (isWebBrowserInAppEnabled2) {
                            i11 = R.string.BrowserSettingsAddText;
                        } else {
                            i11 = R.string.BrowserSettingsAddTextExternal;
                        }
                        d2Var6.T = LocaleController.getString(i11);
                        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                        editTextBoldCursor.setTextSize(1, 16.0f);
                        int i19 = j6.f18034j5;
                        editTextBoldCursor.setTextColor(j6.v0(i19, resourceProvider));
                        editTextBoldCursor.setHintTextColor(j6.v0(j6.Xh, resourceProvider));
                        editTextBoldCursor.setHint(LocaleController.getString(R.string.BrowserSettingsAddHint));
                        editTextBoldCursor.setInputType(17);
                        editTextBoldCursor.setImeOptions(6);
                        editTextBoldCursor.setSingleLine(true);
                        editTextBoldCursor.setFocusable(true);
                        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
                        editTextBoldCursor.setCursorWidth(1.5f);
                        editTextBoldCursor.setCursorColor(j6.v0(j6.q6, resourceProvider));
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                        gradientDrawable.setColor(j6.l1(0.06f, j6.v0(i19, resourceProvider)));
                        editTextBoldCursor.setBackground(gradientDrawable);
                        da daVar = new da(editTextBoldCursor, veVar, d2VarArr, view3, 12);
                        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.g1(daVar, 0));
                        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                        linearLayout2.setOrientation(1);
                        linearLayout2.addView(editTextBoldCursor, a6.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                        alertDialog$Builder6.c();
                        alertDialog$Builder6.n(linearLayout2);
                        d2Var6.f17609a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                        alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.t(daVar, 2));
                        alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.b(5));
                        d2VarArr[0] = d2Var6;
                        d2Var6.f17622h0 = false;
                        d2Var6.setOnDismissListener(new org.telegram.ui.Components.d1(editTextBoldCursor, 1));
                        d2VarArr[0].setOnShowListener(new org.telegram.ui.Components.h1(0, editTextBoldCursor));
                        d2VarArr[0].show();
                    }
                }
            }
        }
    }

    @Override
    public final boolean X(v51 v51Var, View view) {
        return false;
    }

    public final void a0() {
        j61 j61Var;
        ArrayList a2 = f1.a(new y1(this, 0));
        if (a2 != null) {
            this.f37870n = a2.size();
            l61 l61Var = this.f25171a;
            if (l61Var != null && (j61Var = l61Var.Y2) != null && l61Var.G) {
                j61Var.N(true);
            }
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.voip.x(this, 16));
    }

    @Override
    public final View createView(Context context) {
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(j6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(j6.f18056k7), mode));
        i01 i01Var = new i01(mutate, mutate2, 1);
        i01Var.f28581x = AndroidUtilities.dp(2.0f);
        this.d = i01Var;
        this.fragmentView = super.createView(context);
        this.f25171a.o1();
        this.actionBar.setAdaptiveBackground(this.f25171a);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l61 l61Var;
        if (i10 == NotificationCenter.webBrowserSettingsUpdate && (l61Var = this.f25171a) != null) {
            l61Var.Y2.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        a0();
        getNotificationCenter().addObserver(this, NotificationCenter.webBrowserSettingsUpdate);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.webBrowserSettingsUpdate);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        l61 l61Var = this.f25171a;
        l61Var.setPadding(0, l61Var.getPaddingTop(), 0, i13);
        this.f25171a.setClipToPadding(false);
    }
}
