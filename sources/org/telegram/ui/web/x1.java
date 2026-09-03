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
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import k7.c6;
import mh.m6;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.z4;
import org.telegram.ui.as;
import org.telegram.ui.bh1;
import org.telegram.ui.ih;
import org.telegram.ui.yh;
public final class x1 extends b61 implements NotificationCenter.NotificationCenterDelegate {
    public oh.j2 d;
    public final Utilities.Callback f42733e;
    public long f42734f;
    public long h;
    public long f42735n;

    public x1(org.telegram.ui.t tVar) {
        this.f42733e = tVar;
    }

    public static boolean Y(File file, Boolean bool) {
        boolean z4;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z4 = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !Y(file2, bool)) {
                        z4 = false;
                    }
                }
            } else {
                z4 = true;
            }
            if (z4) {
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
        long j10 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j10 += Z(file2, bool);
                }
                return j10;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override
    public final void U(ArrayList arrayList, w51 w51Var) {
        String str;
        boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        h51 h51Var = new h51(9);
        h51Var.d = 1;
        h51Var.f27375l = string;
        h51Var.K(isWebBrowserInAppEnabled);
        arrayList.add(h51Var);
        yh.A(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!isWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            h51 i10 = h51.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            i10.K(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(i10);
            yh.A(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(h51.t(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            oh.j2 j2Var = this.d;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            h51 h51Var2 = new h51(3);
            h51Var2.d = 16;
            h51Var2.G = j2Var;
            h51Var2.f27375l = string2;
            h51Var2.f27380q = true;
            arrayList.add(h51Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str2 = webDomainException.domain;
                String str3 = webDomainException.title;
                long j10 = webDomainException.favicon;
                int i11 = v1.f42709a;
                h51 J = h51.J(v1.class);
                J.f27375l = str2;
                J.f27377n = str3;
                J.B = j10;
                arrayList.add(J);
            }
            arrayList.add(h51.B(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (!webBrowserExceptionsList.isEmpty()) {
                arrayList.size();
                h51 e6 = h51.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
                e6.f27381r = true;
                arrayList.add(e6);
                arrayList.add(h51.B(null));
                return;
            }
            return;
        }
        arrayList.size();
        int i12 = R.drawable.menu_clear_cookies;
        String string3 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
        long j11 = this.h;
        String str4 = "";
        if (j11 <= 0) {
            str = "";
        } else {
            str = AndroidUtilities.formatFileSize(j11);
        }
        arrayList.add(h51.d(3, i12, string3, str));
        arrayList.size();
        int i13 = R.drawable.menu_clear_cache;
        String string4 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j12 = this.f42734f;
        if (j12 > 0) {
            str4 = AndroidUtilities.formatFileSize(j12);
        }
        arrayList.add(h51.d(2, i13, string4, str4));
        yh.A(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.f42735n > 0) {
            arrayList.size();
            arrayList.add(h51.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(h51.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.f42735n, ',')));
            arrayList.add(h51.B(null));
        }
        arrayList.add(h51.t(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        oh.j2 j2Var2 = this.d;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        h51 h51Var3 = new h51(3);
        h51Var3.d = 15;
        h51Var3.G = j2Var2;
        h51Var3.f27375l = string5;
        h51Var3.f27380q = true;
        arrayList.add(h51Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str5 = webDomainException2.domain;
            String str6 = webDomainException2.title;
            long j13 = webDomainException2.favicon;
            int i14 = v1.f42709a;
            h51 J2 = h51.J(v1.class);
            J2.f27375l = str5;
            J2.f27377n = str6;
            J2.B = j13;
            arrayList.add(J2);
        }
        arrayList.add(h51.B(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            h51 e10 = h51.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e10.f27381r = true;
            arrayList.add(e10);
            arrayList.add(h51.B(null));
        }
        arrayList.size();
        arrayList.add(h51.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), m1.a().f42601a));
        yh.A(R.string.BrowserSettingsSearchEngineInfo, arrayList);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            h51 i15 = h51.i(12, "adaptable colors");
            i15.K(SharedConfig.adaptableColorInBrowser);
            arrayList.add(i15);
            h51 i16 = h51.i(13, "only local IV");
            i16.K(SharedConfig.onlyLocalInstantView);
            arrayList.add(i16);
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BrowserSettingsTitle);
    }

    @Override
    public final void W(h51 h51Var, View view) {
        int i10;
        int i11;
        boolean z4;
        int i12;
        int i13 = h51Var.d;
        if (i13 == 12) {
            SharedConfig.toggleBrowserAdaptableColors();
            ((s8) view).setChecked(SharedConfig.adaptableColorInBrowser);
        } else if (i13 == 13) {
            SharedConfig.toggleLocalInstantView();
            ((s8) view).setChecked(SharedConfig.onlyLocalInstantView);
        } else if (i13 == 17) {
            boolean z10 = !getMessagesController().isWebBrowserUseCustomTabs();
            getMessagesController().toggleWebBrowserUseCustomTabs(z10);
            ((s8) view).setChecked(z10);
            this.f25523a.V2.N(true);
        } else {
            View view2 = null;
            if (i13 == 1) {
                getMessagesController().toggleWebBrowserInAppEnabled();
                boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
                s8 s8Var = (s8) view;
                s8Var.setChecked(isWebBrowserInAppEnabled);
                if (isWebBrowserInAppEnabled) {
                    i12 = k6.f21698f6;
                } else {
                    i12 = k6.e6;
                }
                s8Var.b(k6.w0(null, i12, false), isWebBrowserInAppEnabled);
                this.f25523a.V2.N(true);
            } else if (i13 == 10) {
                getMessagesController().toggleWebBrowserUseCustomTabs(true);
                this.f25523a.V2.N(true);
            } else if (i13 == 11) {
                getMessagesController().toggleWebBrowserUseCustomTabs(false);
                this.f25523a.V2.N(true);
            } else {
                String str = "";
                if (i13 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                    d2Var.O = string;
                    int i14 = R.string.BrowserSettingsCacheClearText;
                    if (this.f42734f != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.f42734f) + ")";
                    }
                    d2Var.Q = LocaleController.formatString(i14, str);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2(this) {
                        public final x1 f42703b;

                        {
                            this.f42703b = this;
                        }

                        @Override
                        public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i15) {
                            switch (r2) {
                                case 0:
                                    x1 x1Var = this.f42703b;
                                    x1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(x1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            x1.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            x1.Y(file2, null);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    m2 b10 = m2.b();
                                    HashMap hashMap = b10.f42605a;
                                    if (hashMap == null) {
                                        b10.f42607c = false;
                                        b10.f42606b = true;
                                        b10.f42605a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    x1Var.a0();
                                    return;
                                case 1:
                                    x1 x1Var2 = this.f42703b;
                                    x1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            x1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    x1Var2.a0();
                                    return;
                                case 2:
                                    x1 x1Var3 = this.f42703b;
                                    try {
                                        c1.f42477c.clear();
                                        c1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    x1Var3.f42735n = 0L;
                                    x1Var3.f25523a.V2.N(true);
                                    return;
                                default:
                                    x1 x1Var4 = this.f42703b;
                                    x1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    x1Var4.f25523a.V2.N(true);
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
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21168a;
                    d2Var2.O = string2;
                    int i15 = R.string.BrowserSettingsCookiesClearText;
                    if (this.h != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
                    }
                    d2Var2.Q = LocaleController.formatString(i15, str);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2(this) {
                        public final x1 f42703b;

                        {
                            this.f42703b = this;
                        }

                        @Override
                        public final void j(org.telegram.ui.ActionBar.d2 d2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    x1 x1Var = this.f42703b;
                                    x1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(x1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            x1.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            x1.Y(file2, null);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    m2 b10 = m2.b();
                                    HashMap hashMap = b10.f42605a;
                                    if (hashMap == null) {
                                        b10.f42607c = false;
                                        b10.f42606b = true;
                                        b10.f42605a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    x1Var.a0();
                                    return;
                                case 1:
                                    x1 x1Var2 = this.f42703b;
                                    x1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            x1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    x1Var2.a0();
                                    return;
                                case 2:
                                    x1 x1Var3 = this.f42703b;
                                    try {
                                        c1.f42477c.clear();
                                        c1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    x1Var3.f42735n = 0L;
                                    x1Var3.f25523a.V2.N(true);
                                    return;
                                default:
                                    x1 x1Var4 = this.f42703b;
                                    x1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    x1Var4.f25523a.V2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder2.d(-1);
                    alertDialog$Builder2.o();
                } else if (i13 == 7) {
                    ArrayList a2 = c1.a(null);
                    int size = a2.size();
                    long j10 = Long.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj = a2.get(i16);
                        i16++;
                        j10 = Math.min(j10, ((b1) obj).f42473b);
                    }
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string3 = LocaleController.getString(R.string.BrowserSettingsHistoryClear);
                    org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f21168a;
                    d2Var3.O = string3;
                    d2Var3.Q = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(j10 / 1000));
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2(this) {
                        public final x1 f42703b;

                        {
                            this.f42703b = this;
                        }

                        @Override
                        public final void j(org.telegram.ui.ActionBar.d2 d2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    x1 x1Var = this.f42703b;
                                    x1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(x1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            x1.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            x1.Y(file2, null);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    m2 b10 = m2.b();
                                    HashMap hashMap = b10.f42605a;
                                    if (hashMap == null) {
                                        b10.f42607c = false;
                                        b10.f42606b = true;
                                        b10.f42605a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    x1Var.a0();
                                    return;
                                case 1:
                                    x1 x1Var2 = this.f42703b;
                                    x1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            x1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    x1Var2.a0();
                                    return;
                                case 2:
                                    x1 x1Var3 = this.f42703b;
                                    try {
                                        c1.f42477c.clear();
                                        c1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    x1Var3.f42735n = 0L;
                                    x1Var3.f25523a.V2.N(true);
                                    return;
                                default:
                                    x1 x1Var4 = this.f42703b;
                                    x1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    x1Var4.f25523a.V2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder3.d(-1);
                    alertDialog$Builder3.o();
                } else if (i13 == 9) {
                    f1[] f1VarArr = {null};
                    p2 f1Var = new f1(null, new xk(29, this, f1VarArr));
                    f1VarArr[0] = f1Var;
                    presentFragment(f1Var);
                } else if (i13 == 5) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
                    org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.f21168a;
                    d2Var4.O = string4;
                    d2Var4.Q = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) {
                        public final x1 f42703b;

                        {
                            this.f42703b = this;
                        }

                        @Override
                        public final void j(org.telegram.ui.ActionBar.d2 d2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    x1 x1Var = this.f42703b;
                                    x1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(x1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            x1.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            x1.Y(file2, null);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    m2 b10 = m2.b();
                                    HashMap hashMap = b10.f42605a;
                                    if (hashMap == null) {
                                        b10.f42607c = false;
                                        b10.f42606b = true;
                                        b10.f42605a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    x1Var.a0();
                                    return;
                                case 1:
                                    x1 x1Var2 = this.f42703b;
                                    x1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            x1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    x1Var2.a0();
                                    return;
                                case 2:
                                    x1 x1Var3 = this.f42703b;
                                    try {
                                        c1.f42477c.clear();
                                        c1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    x1Var3.f42735n = 0L;
                                    x1Var3.f25523a.V2.N(true);
                                    return;
                                default:
                                    x1 x1Var4 = this.f42703b;
                                    x1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    x1Var4.f25523a.V2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder4.d(-1);
                    alertDialog$Builder4.o();
                } else if (h51Var.G(v1.class)) {
                    w1 w1Var = (w1) view;
                    String str2 = w1Var.f42717e;
                    q70 F = q70.F((ViewGroup) this.fragmentView, null, w1Var);
                    F.f30333s = 40;
                    F.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new bh1(12, this, str2), false);
                    F.Z();
                } else {
                    int i17 = h51Var.d;
                    if (i17 == 6) {
                        if (getParentActivity() != null) {
                            AtomicReference atomicReference = new AtomicReference();
                            LinearLayout linearLayout = new LinearLayout(getParentActivity());
                            linearLayout.setOrientation(1);
                            ArrayList b10 = m1.b();
                            int size2 = b10.size();
                            CharSequence[] charSequenceArr = new CharSequence[size2];
                            for (int i18 = 0; i18 < size2; i18++) {
                                charSequenceArr[i18] = ((m1) b10.get(i18)).f42601a;
                                org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(getParentActivity(), null);
                                k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                                k6Var.a(k6.w0(null, k6.f21717g7, false), k6.w0(null, k6.E5, false));
                                CharSequence charSequence = charSequenceArr[i18];
                                if (i18 == SharedConfig.searchEngineType) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                k6Var.b(charSequence, z4);
                                k6Var.setBackground(k6.f0(k6.w0(null, k6.f21752i6, false), 2, -1));
                                linearLayout.addView(k6Var);
                                k6Var.setOnClickListener(new eg.k2(i18, view, atomicReference));
                            }
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                            String string5 = LocaleController.getString(R.string.SearchEngine);
                            org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder5.f21168a;
                            d2Var5.O = string5;
                            alertDialog$Builder5.n(linearLayout);
                            alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                            atomicReference.set(d2Var5);
                            showDialog(d2Var5);
                        }
                    } else if (i17 == 15 || i17 == 16) {
                        boolean isWebBrowserInAppEnabled2 = getMessagesController().isWebBrowserInAppEnabled();
                        if (getMessagesController().isWebBrowserExceptionsLimitReached(isWebBrowserInAppEnabled2)) {
                            z4.u0(this, LocaleController.getString(R.string.WebBrowserExceptionsLimitTitle), LocaleController.getString(R.string.WebBrowserExceptionsLimitMessage), null);
                            return;
                        }
                        Activity parentActivity = getParentActivity();
                        g6 resourceProvider = getResourceProvider();
                        m6 m6Var = new m6(4, this, isWebBrowserInAppEnabled2);
                        Pattern pattern = z4.f33754a;
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
                        org.telegram.ui.ActionBar.d2 d2Var6 = alertDialog$Builder6.f21168a;
                        d2Var6.O = string6;
                        if (isWebBrowserInAppEnabled2) {
                            i11 = R.string.BrowserSettingsAddText;
                        } else {
                            i11 = R.string.BrowserSettingsAddTextExternal;
                        }
                        d2Var6.Q = LocaleController.getString(i11);
                        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                        editTextBoldCursor.setTextSize(1, 16.0f);
                        int i19 = k6.f21768j5;
                        editTextBoldCursor.setTextColor(k6.v0(i19, resourceProvider));
                        editTextBoldCursor.setHintTextColor(k6.v0(k6.Xh, resourceProvider));
                        editTextBoldCursor.setHint(LocaleController.getString(R.string.BrowserSettingsAddHint));
                        editTextBoldCursor.setInputType(17);
                        editTextBoldCursor.setImeOptions(6);
                        editTextBoldCursor.setSingleLine(true);
                        editTextBoldCursor.setFocusable(true);
                        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
                        editTextBoldCursor.setCursorWidth(1.5f);
                        editTextBoldCursor.setCursorColor(k6.v0(k6.f21896q6, resourceProvider));
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                        gradientDrawable.setColor(k6.l1(0.06f, k6.v0(i19, resourceProvider)));
                        editTextBoldCursor.setBackground(gradientDrawable);
                        ih ihVar = new ih(editTextBoldCursor, m6Var, d2VarArr, view3, 7);
                        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.d1(ihVar, 0));
                        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                        linearLayout2.setOrientation(1);
                        linearLayout2.addView(editTextBoldCursor, c6.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                        alertDialog$Builder6.c();
                        alertDialog$Builder6.n(linearLayout2);
                        d2Var6.f21237a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                        alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.t(ihVar, 2));
                        alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new as(8));
                        d2VarArr[0] = d2Var6;
                        d2Var6.f21245e0 = false;
                        d2Var6.setOnDismissListener(new org.telegram.ui.Components.b1(editTextBoldCursor, 1));
                        d2VarArr[0].setOnShowListener(new org.telegram.ui.Components.e1(0, editTextBoldCursor));
                        d2VarArr[0].show();
                    }
                }
            }
        }
    }

    @Override
    public final boolean X(h51 h51Var, View view) {
        return false;
    }

    public final void a0() {
        w51 w51Var;
        ArrayList a2 = c1.a(new d1(this, 1));
        if (a2 != null) {
            this.f42735n = a2.size();
            a61 a61Var = this.f25523a;
            if (a61Var != null && (w51Var = a61Var.V2) != null && a61Var.D) {
                w51Var.N(true);
            }
        }
        Utilities.globalQueue.postRunnable(new s0(this, 4));
    }

    @Override
    public final View createView(Context context) {
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(k6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(k6.f21788k7), mode));
        oh.j2 j2Var = new oh.j2(mutate, mutate2, 4);
        j2Var.f30167x = AndroidUtilities.dp(2.0f);
        this.d = j2Var;
        this.fragmentView = super.createView(context);
        this.f25523a.o1();
        this.actionBar.setAdaptiveBackground(this.f25523a);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a61 a61Var;
        if (i10 == NotificationCenter.webBrowserSettingsUpdate && (a61Var = this.f25523a) != null) {
            a61Var.V2.N(true);
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
        a61 a61Var = this.f25523a;
        a61Var.setPadding(0, a61Var.getPaddingTop(), 0, i13);
        this.f25523a.setClipToPadding(false);
    }
}
