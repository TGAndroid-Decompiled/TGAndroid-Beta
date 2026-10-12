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
import bi.j3;
import bi.y2;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.l6;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Wallet.t8;
import org.telegram.ui.Wallet.y6;
import org.telegram.ui.is;
import org.telegram.ui.p6;
import w7.a6;
public final class y1 extends c71 implements NotificationCenter.NotificationCenterDelegate {
    public j3 d;
    public final Utilities.Callback e;
    public long f41570f;
    public long h;
    public long f41571n;

    public y1(org.telegram.ui.r rVar) {
        this.e = rVar;
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
    public final void U(ArrayList arrayList, z61 z61Var) {
        String str;
        boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        l61 l61Var = new l61(9);
        l61Var.d = 1;
        l61Var.f26954l = string;
        l61Var.K(isWebBrowserInAppEnabled);
        arrayList.add(l61Var);
        i2.d.y(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!isWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            l61 i10 = l61.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            i10.K(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(i10);
            i2.d.y(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(l61.t(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            j3 j3Var = this.d;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            l61 l61Var2 = new l61(3);
            l61Var2.d = 16;
            l61Var2.G = j3Var;
            l61Var2.f26954l = string2;
            l61Var2.f26959q = true;
            arrayList.add(l61Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str2 = webDomainException.domain;
                String str3 = webDomainException.title;
                long j10 = webDomainException.favicon;
                int i11 = w1.f41548a;
                l61 J = l61.J(w1.class);
                J.f26954l = str2;
                J.f26956n = str3;
                J.B = j10;
                arrayList.add(J);
            }
            arrayList.add(l61.B(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (!webBrowserExceptionsList.isEmpty()) {
                arrayList.size();
                l61 e = l61.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
                e.f26960r = true;
                arrayList.add(e);
                arrayList.add(l61.B(null));
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
        arrayList.add(l61.d(3, i12, string3, str));
        arrayList.size();
        int i13 = R.drawable.menu_clear_cache;
        String string4 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j12 = this.f41570f;
        if (j12 > 0) {
            str4 = AndroidUtilities.formatFileSize(j12);
        }
        arrayList.add(l61.d(2, i13, string4, str4));
        i2.d.y(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.f41571n > 0) {
            arrayList.size();
            arrayList.add(l61.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(l61.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.f41571n, ',')));
            arrayList.add(l61.B(null));
        }
        arrayList.add(l61.t(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        j3 j3Var2 = this.d;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        l61 l61Var3 = new l61(3);
        l61Var3.d = 15;
        l61Var3.G = j3Var2;
        l61Var3.f26954l = string5;
        l61Var3.f26959q = true;
        arrayList.add(l61Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str5 = webDomainException2.domain;
            String str6 = webDomainException2.title;
            long j13 = webDomainException2.favicon;
            int i14 = w1.f41548a;
            l61 J2 = l61.J(w1.class);
            J2.f26954l = str5;
            J2.f26956n = str6;
            J2.B = j13;
            arrayList.add(J2);
        }
        arrayList.add(l61.B(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            l61 e7 = l61.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e7.f26960r = true;
            arrayList.add(e7);
            arrayList.add(l61.B(null));
        }
        arrayList.size();
        arrayList.add(l61.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), n1.a().f41440a));
        i2.d.y(R.string.BrowserSettingsSearchEngineInfo, arrayList);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            l61 i15 = l61.i(12, "adaptable colors");
            i15.K(SharedConfig.adaptableColorInBrowser);
            arrayList.add(i15);
            l61 i16 = l61.i(13, "only local IV");
            i16.K(SharedConfig.onlyLocalInstantView);
            arrayList.add(i16);
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BrowserSettingsTitle);
    }

    @Override
    public final void W(l61 l61Var, View view) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13 = l61Var.d;
        if (i13 == 12) {
            SharedConfig.toggleBrowserAdaptableColors();
            ((w8) view).setChecked(SharedConfig.adaptableColorInBrowser);
        } else if (i13 == 13) {
            SharedConfig.toggleLocalInstantView();
            ((w8) view).setChecked(SharedConfig.onlyLocalInstantView);
        } else if (i13 == 17) {
            boolean z11 = !getMessagesController().isWebBrowserUseCustomTabs();
            getMessagesController().toggleWebBrowserUseCustomTabs(z11);
            ((w8) view).setChecked(z11);
            this.f23964a.W2.N(true);
        } else {
            View view2 = null;
            if (i13 == 1) {
                getMessagesController().toggleWebBrowserInAppEnabled();
                boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
                w8 w8Var = (w8) view;
                w8Var.setChecked(isWebBrowserInAppEnabled);
                if (isWebBrowserInAppEnabled) {
                    i12 = g6.f19937f6;
                } else {
                    i12 = g6.f19918e6;
                }
                w8Var.b(g6.x0(null, i12, false), isWebBrowserInAppEnabled);
                this.f23964a.W2.N(true);
            } else if (i13 == 10) {
                getMessagesController().toggleWebBrowserUseCustomTabs(true);
                this.f23964a.W2.N(true);
            } else if (i13 == 11) {
                getMessagesController().toggleWebBrowserUseCustomTabs(false);
                this.f23964a.W2.N(true);
            } else {
                String str = "";
                if (i13 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                    a2Var.R = string;
                    int i14 = R.string.BrowserSettingsCacheClearText;
                    if (this.f41570f != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.f41570f) + ")";
                    }
                    a2Var.T = LocaleController.formatString(i14, str);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) {
                        public final y1 f41543b;

                        {
                            this.f41543b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.a2 a2Var2, int i15) {
                            switch (r2) {
                                case 0:
                                    y1 y1Var = this.f41543b;
                                    y1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(y1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            y1.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            y1.Y(file2, null);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    m2 b10 = m2.b();
                                    HashMap hashMap = b10.f41433a;
                                    if (hashMap == null) {
                                        b10.f41435c = false;
                                        b10.f41434b = true;
                                        b10.f41433a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    y1Var.a0();
                                    return;
                                case 1:
                                    y1 y1Var2 = this.f41543b;
                                    y1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            y1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    y1Var2.a0();
                                    return;
                                case 2:
                                    y1 y1Var3 = this.f41543b;
                                    try {
                                        d1.f41332c.clear();
                                        d1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    y1Var3.f41571n = 0L;
                                    y1Var3.f23964a.W2.N(true);
                                    return;
                                default:
                                    y1 y1Var4 = this.f41543b;
                                    y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    y1Var4.f23964a.W2.N(true);
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
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19548a;
                    a2Var2.R = string2;
                    int i15 = R.string.BrowserSettingsCookiesClearText;
                    if (this.h != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
                    }
                    a2Var2.T = LocaleController.formatString(i15, str);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) {
                        public final y1 f41543b;

                        {
                            this.f41543b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.a2 a2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    y1 y1Var = this.f41543b;
                                    y1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(y1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            y1.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            y1.Y(file2, null);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    m2 b10 = m2.b();
                                    HashMap hashMap = b10.f41433a;
                                    if (hashMap == null) {
                                        b10.f41435c = false;
                                        b10.f41434b = true;
                                        b10.f41433a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    y1Var.a0();
                                    return;
                                case 1:
                                    y1 y1Var2 = this.f41543b;
                                    y1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            y1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    y1Var2.a0();
                                    return;
                                case 2:
                                    y1 y1Var3 = this.f41543b;
                                    try {
                                        d1.f41332c.clear();
                                        d1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    y1Var3.f41571n = 0L;
                                    y1Var3.f23964a.W2.N(true);
                                    return;
                                default:
                                    y1 y1Var4 = this.f41543b;
                                    y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    y1Var4.f23964a.W2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder2.d(-1);
                    alertDialog$Builder2.o();
                } else if (i13 == 7) {
                    ArrayList a2 = d1.a(null);
                    int size = a2.size();
                    long j10 = Long.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj = a2.get(i16);
                        i16++;
                        j10 = Math.min(j10, ((c1) obj).f41322b);
                    }
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string3 = LocaleController.getString(R.string.BrowserSettingsHistoryClear);
                    org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder3.f19548a;
                    a2Var3.R = string3;
                    a2Var3.T = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(j10 / 1000));
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) {
                        public final y1 f41543b;

                        {
                            this.f41543b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.a2 a2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    y1 y1Var = this.f41543b;
                                    y1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(y1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            y1.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            y1.Y(file2, null);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    m2 b10 = m2.b();
                                    HashMap hashMap = b10.f41433a;
                                    if (hashMap == null) {
                                        b10.f41435c = false;
                                        b10.f41434b = true;
                                        b10.f41433a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    y1Var.a0();
                                    return;
                                case 1:
                                    y1 y1Var2 = this.f41543b;
                                    y1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            y1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    y1Var2.a0();
                                    return;
                                case 2:
                                    y1 y1Var3 = this.f41543b;
                                    try {
                                        d1.f41332c.clear();
                                        d1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    y1Var3.f41571n = 0L;
                                    y1Var3.f23964a.W2.N(true);
                                    return;
                                default:
                                    y1 y1Var4 = this.f41543b;
                                    y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    y1Var4.f23964a.W2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder3.d(-1);
                    alertDialog$Builder3.o();
                } else if (i13 == 9) {
                    g1[] g1VarArr = {null};
                    org.telegram.ui.ActionBar.m2 g1Var = new g1(null, new y6(6, this, g1VarArr));
                    g1VarArr[0] = g1Var;
                    presentFragment(g1Var);
                } else if (i13 == 5) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
                    org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder4.f19548a;
                    a2Var4.R = string4;
                    a2Var4.T = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                        public final y1 f41543b;

                        {
                            this.f41543b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.a2 a2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    y1 y1Var = this.f41543b;
                                    y1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(y1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            y1.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            y1.Y(file2, null);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    m2 b10 = m2.b();
                                    HashMap hashMap = b10.f41433a;
                                    if (hashMap == null) {
                                        b10.f41435c = false;
                                        b10.f41434b = true;
                                        b10.f41433a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    y1Var.a0();
                                    return;
                                case 1:
                                    y1 y1Var2 = this.f41543b;
                                    y1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            y1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    y1Var2.a0();
                                    return;
                                case 2:
                                    y1 y1Var3 = this.f41543b;
                                    try {
                                        d1.f41332c.clear();
                                        d1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    y1Var3.f41571n = 0L;
                                    y1Var3.f23964a.W2.N(true);
                                    return;
                                default:
                                    y1 y1Var4 = this.f41543b;
                                    y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    y1Var4.f23964a.W2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder4.d(-1);
                    alertDialog$Builder4.o();
                } else if (l61Var.G(w1.class)) {
                    x1 x1Var = (x1) view;
                    String str2 = x1Var.e;
                    m80 F = m80.F((ViewGroup) this.fragmentView, null, x1Var);
                    F.f27298s = 40;
                    F.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new t8(11, this, str2), false);
                    F.Z();
                } else {
                    int i17 = l61Var.d;
                    if (i17 == 6) {
                        if (getParentActivity() != null) {
                            AtomicReference atomicReference = new AtomicReference();
                            LinearLayout linearLayout = new LinearLayout(getParentActivity());
                            linearLayout.setOrientation(1);
                            ArrayList b10 = n1.b();
                            int size2 = b10.size();
                            CharSequence[] charSequenceArr = new CharSequence[size2];
                            for (int i18 = 0; i18 < size2; i18++) {
                                charSequenceArr[i18] = ((n1) b10.get(i18)).f41440a;
                                l6 l6Var = new l6(getParentActivity(), null);
                                l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                                l6Var.a(g6.x0(null, g6.f19955g7, false), g6.x0(null, g6.E5, false));
                                CharSequence charSequence = charSequenceArr[i18];
                                if (i18 == SharedConfig.searchEngineType) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                l6Var.b(charSequence, z10);
                                l6Var.setBackground(g6.g0(g6.x0(null, g6.f19990i6, false), 2, -1));
                                linearLayout.addView(l6Var);
                                l6Var.setOnClickListener(new sa(i18, view, atomicReference));
                            }
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                            String string5 = LocaleController.getString(R.string.SearchEngine);
                            org.telegram.ui.ActionBar.a2 a2Var5 = alertDialog$Builder5.f19548a;
                            a2Var5.R = string5;
                            alertDialog$Builder5.n(linearLayout);
                            alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                            atomicReference.set(a2Var5);
                            showDialog(a2Var5);
                        }
                    } else if (i17 == 15 || i17 == 16) {
                        boolean isWebBrowserInAppEnabled2 = getMessagesController().isWebBrowserInAppEnabled();
                        if (getMessagesController().isWebBrowserExceptionsLimitReached(isWebBrowserInAppEnabled2)) {
                            g5.t0(this, LocaleController.getString(R.string.WebBrowserExceptionsLimitTitle), LocaleController.getString(R.string.WebBrowserExceptionsLimitMessage), null);
                            return;
                        }
                        Activity parentActivity = getParentActivity();
                        c6 resourceProvider = getResourceProvider();
                        y2 y2Var = new y2(9, this, isWebBrowserInAppEnabled2);
                        Pattern pattern = g5.f25184a;
                        Activity findActivity = AndroidUtilities.findActivity(parentActivity);
                        if (findActivity != null) {
                            view2 = findActivity.getCurrentFocus();
                        }
                        View view3 = view2;
                        org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
                        AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(parentActivity, 0, resourceProvider);
                        if (isWebBrowserInAppEnabled2) {
                            i10 = R.string.BrowserSettingsAddTitle;
                        } else {
                            i10 = R.string.BrowserSettingsAddTitleExternal;
                        }
                        String string6 = LocaleController.getString(i10);
                        org.telegram.ui.ActionBar.a2 a2Var6 = alertDialog$Builder6.f19548a;
                        a2Var6.R = string6;
                        if (isWebBrowserInAppEnabled2) {
                            i11 = R.string.BrowserSettingsAddText;
                        } else {
                            i11 = R.string.BrowserSettingsAddTextExternal;
                        }
                        a2Var6.T = LocaleController.getString(i11);
                        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                        editTextBoldCursor.setTextSize(1, 16.0f);
                        int i19 = g6.f20007j5;
                        editTextBoldCursor.setTextColor(g6.w0(i19, resourceProvider));
                        editTextBoldCursor.setHintTextColor(g6.w0(g6.Xh, resourceProvider));
                        editTextBoldCursor.setHint(LocaleController.getString(R.string.BrowserSettingsAddHint));
                        editTextBoldCursor.setInputType(17);
                        editTextBoldCursor.setImeOptions(6);
                        editTextBoldCursor.setSingleLine(true);
                        editTextBoldCursor.setFocusable(true);
                        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
                        editTextBoldCursor.setCursorWidth(1.5f);
                        editTextBoldCursor.setCursorColor(g6.w0(g6.q6, resourceProvider));
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                        gradientDrawable.setColor(g6.m1(0.06f, g6.w0(i19, resourceProvider)));
                        editTextBoldCursor.setBackground(gradientDrawable);
                        p6 p6Var = new p6(editTextBoldCursor, y2Var, a2VarArr, view3, 15);
                        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.e1(p6Var, 0));
                        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                        linearLayout2.setOrientation(1);
                        linearLayout2.addView(editTextBoldCursor, a6.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                        alertDialog$Builder6.c();
                        alertDialog$Builder6.n(linearLayout2);
                        a2Var6.f19557a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                        alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.s(p6Var, 2));
                        alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new is(9));
                        a2VarArr[0] = a2Var6;
                        a2Var6.f19570h0 = false;
                        a2Var6.setOnDismissListener(new org.telegram.ui.Components.b1(editTextBoldCursor, 1));
                        a2VarArr[0].setOnShowListener(new org.telegram.ui.Components.f1(0, editTextBoldCursor));
                        a2VarArr[0].show();
                    }
                }
            }
        }
    }

    @Override
    public final boolean X(l61 l61Var, View view) {
        return false;
    }

    public final void a0() {
        z61 z61Var;
        ArrayList a2 = d1.a(new ji.p1(this, 5));
        if (a2 != null) {
            this.f41571n = a2.size();
            b71 b71Var = this.f23964a;
            if (b71Var != null && (z61Var = b71Var.W2) != null && b71Var.G) {
                z61Var.N(true);
            }
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.voip.m2(this, 10));
    }

    @Override
    public final View createView(Context context) {
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(g6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(g6.f20029k7), mode));
        j3 j3Var = new j3(mutate, mutate2, 4);
        j3Var.f24199x = AndroidUtilities.dp(2.0f);
        this.d = j3Var;
        this.fragmentView = super.createView(context);
        this.f23964a.p1();
        this.actionBar.setAdaptiveBackground(this.f23964a);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b71 b71Var;
        if (i10 == NotificationCenter.webBrowserSettingsUpdate && (b71Var = this.f23964a) != null) {
            b71Var.W2.N(true);
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
        b71 b71Var = this.f23964a;
        b71Var.setPadding(0, b71Var.getPaddingTop(), 0, i13);
        this.f23964a.setClipToPadding(false);
    }
}
