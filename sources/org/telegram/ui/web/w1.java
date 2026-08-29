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
import bg.p2;
import i7.f6;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import jh.m6;
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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.gg;
import org.telegram.ui.th;
import org.telegram.ui.yu0;
public final class w1 extends p51 implements NotificationCenter.NotificationCenterDelegate {
    public lh.h2 d;
    public final Utilities.Callback f44236e;
    public long f44237f;
    public long h;
    public long f44238n;

    public w1(org.telegram.ui.t tVar) {
        this.f44236e = tVar;
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
    public final void U(ArrayList arrayList, k51 k51Var) {
        String str;
        boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        w41 w41Var = new w41(9);
        w41Var.d = 1;
        w41Var.f34300l = string;
        w41Var.K(isWebBrowserInAppEnabled);
        arrayList.add(w41Var);
        th.A(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!isWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            w41 i10 = w41.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            i10.K(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(i10);
            th.A(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(w41.t(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            lh.h2 h2Var = this.d;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            w41 w41Var2 = new w41(3);
            w41Var2.d = 16;
            w41Var2.G = h2Var;
            w41Var2.f34300l = string2;
            w41Var2.f34305q = true;
            arrayList.add(w41Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str2 = webDomainException.domain;
                String str3 = webDomainException.title;
                long j10 = webDomainException.favicon;
                int i11 = u1.f44211a;
                w41 J = w41.J(u1.class);
                J.f34300l = str2;
                J.f34302n = str3;
                J.B = j10;
                arrayList.add(J);
            }
            arrayList.add(w41.B(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (!webBrowserExceptionsList.isEmpty()) {
                arrayList.size();
                w41 e10 = w41.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
                e10.f34306r = true;
                arrayList.add(e10);
                arrayList.add(w41.B(null));
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
        arrayList.add(w41.d(3, i12, string3, str));
        arrayList.size();
        int i13 = R.drawable.menu_clear_cache;
        String string4 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j12 = this.f44237f;
        if (j12 > 0) {
            str4 = AndroidUtilities.formatFileSize(j12);
        }
        arrayList.add(w41.d(2, i13, string4, str4));
        th.A(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.f44238n > 0) {
            arrayList.size();
            arrayList.add(w41.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(w41.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.f44238n, ',')));
            arrayList.add(w41.B(null));
        }
        arrayList.add(w41.t(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        lh.h2 h2Var2 = this.d;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        w41 w41Var3 = new w41(3);
        w41Var3.d = 15;
        w41Var3.G = h2Var2;
        w41Var3.f34300l = string5;
        w41Var3.f34305q = true;
        arrayList.add(w41Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str5 = webDomainException2.domain;
            String str6 = webDomainException2.title;
            long j13 = webDomainException2.favicon;
            int i14 = u1.f44211a;
            w41 J2 = w41.J(u1.class);
            J2.f34300l = str5;
            J2.f34302n = str6;
            J2.B = j13;
            arrayList.add(J2);
        }
        arrayList.add(w41.B(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            w41 e11 = w41.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e11.f34306r = true;
            arrayList.add(e11);
            arrayList.add(w41.B(null));
        }
        arrayList.size();
        arrayList.add(w41.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), k1.a().f44088a));
        th.A(R.string.BrowserSettingsSearchEngineInfo, arrayList);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            w41 i15 = w41.i(12, "adaptable colors");
            i15.K(SharedConfig.adaptableColorInBrowser);
            arrayList.add(i15);
            w41 i16 = w41.i(13, "only local IV");
            i16.K(SharedConfig.onlyLocalInstantView);
            arrayList.add(i16);
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BrowserSettingsTitle);
    }

    @Override
    public final void W(w41 w41Var, View view) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13 = w41Var.d;
        if (i13 == 12) {
            SharedConfig.toggleBrowserAdaptableColors();
            ((q8) view).setChecked(SharedConfig.adaptableColorInBrowser);
        } else if (i13 == 13) {
            SharedConfig.toggleLocalInstantView();
            ((q8) view).setChecked(SharedConfig.onlyLocalInstantView);
        } else if (i13 == 17) {
            boolean z11 = !getMessagesController().isWebBrowserUseCustomTabs();
            getMessagesController().toggleWebBrowserUseCustomTabs(z11);
            ((q8) view).setChecked(z11);
            this.f31601a.U2.N(true);
        } else {
            View view2 = null;
            if (i13 == 1) {
                getMessagesController().toggleWebBrowserInAppEnabled();
                boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
                q8 q8Var = (q8) view;
                q8Var.setChecked(isWebBrowserInAppEnabled);
                if (isWebBrowserInAppEnabled) {
                    i12 = g6.f23099f6;
                } else {
                    i12 = g6.f23080e6;
                }
                q8Var.b(g6.w0(null, i12, false), isWebBrowserInAppEnabled);
                this.f31601a.U2.N(true);
            } else if (i13 == 10) {
                getMessagesController().toggleWebBrowserUseCustomTabs(true);
                this.f31601a.U2.N(true);
            } else if (i13 == 11) {
                getMessagesController().toggleWebBrowserUseCustomTabs(false);
                this.f31601a.U2.N(true);
            } else {
                String str = "";
                if (i13 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.N = string;
                    int i14 = R.string.BrowserSettingsCacheClearText;
                    if (this.f44237f != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.f44237f) + ")";
                    }
                    c2Var.P = LocaleController.formatString(i14, str);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) {
                        public final w1 f44198b;

                        {
                            this.f44198b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i15) {
                            switch (r2) {
                                case 0:
                                    w1 w1Var = this.f44198b;
                                    w1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(w1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            w1.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            w1.Y(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    k2 b10 = k2.b();
                                    HashMap hashMap = b10.f44092a;
                                    if (hashMap == null) {
                                        b10.f44094c = false;
                                        b10.f44093b = true;
                                        b10.f44092a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    w1Var.a0();
                                    return;
                                case 1:
                                    w1 w1Var2 = this.f44198b;
                                    w1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            w1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    w1Var2.a0();
                                    return;
                                case 2:
                                    w1 w1Var3 = this.f44198b;
                                    try {
                                        b1.f43989c.clear();
                                        b1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        FileLog.e(e13);
                                    }
                                    w1Var3.f44238n = 0L;
                                    w1Var3.f31601a.U2.N(true);
                                    return;
                                default:
                                    w1 w1Var4 = this.f44198b;
                                    w1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    w1Var4.f31601a.U2.N(true);
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
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                    c2Var2.N = string2;
                    int i15 = R.string.BrowserSettingsCookiesClearText;
                    if (this.h != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
                    }
                    c2Var2.P = LocaleController.formatString(i15, str);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) {
                        public final w1 f44198b;

                        {
                            this.f44198b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    w1 w1Var = this.f44198b;
                                    w1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(w1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            w1.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            w1.Y(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    k2 b10 = k2.b();
                                    HashMap hashMap = b10.f44092a;
                                    if (hashMap == null) {
                                        b10.f44094c = false;
                                        b10.f44093b = true;
                                        b10.f44092a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    w1Var.a0();
                                    return;
                                case 1:
                                    w1 w1Var2 = this.f44198b;
                                    w1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            w1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    w1Var2.a0();
                                    return;
                                case 2:
                                    w1 w1Var3 = this.f44198b;
                                    try {
                                        b1.f43989c.clear();
                                        b1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        FileLog.e(e13);
                                    }
                                    w1Var3.f44238n = 0L;
                                    w1Var3.f31601a.U2.N(true);
                                    return;
                                default:
                                    w1 w1Var4 = this.f44198b;
                                    w1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    w1Var4.f31601a.U2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder2.d(-1);
                    alertDialog$Builder2.o();
                } else if (i13 == 7) {
                    ArrayList a2 = b1.a(null);
                    int size = a2.size();
                    long j10 = Long.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj = a2.get(i16);
                        i16++;
                        j10 = Math.min(j10, ((a1) obj).f43976b);
                    }
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string3 = LocaleController.getString(R.string.BrowserSettingsHistoryClear);
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22714a;
                    c2Var3.N = string3;
                    c2Var3.P = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(j10 / 1000));
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) {
                        public final w1 f44198b;

                        {
                            this.f44198b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    w1 w1Var = this.f44198b;
                                    w1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(w1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            w1.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            w1.Y(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    k2 b10 = k2.b();
                                    HashMap hashMap = b10.f44092a;
                                    if (hashMap == null) {
                                        b10.f44094c = false;
                                        b10.f44093b = true;
                                        b10.f44092a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    w1Var.a0();
                                    return;
                                case 1:
                                    w1 w1Var2 = this.f44198b;
                                    w1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            w1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    w1Var2.a0();
                                    return;
                                case 2:
                                    w1 w1Var3 = this.f44198b;
                                    try {
                                        b1.f43989c.clear();
                                        b1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        FileLog.e(e13);
                                    }
                                    w1Var3.f44238n = 0L;
                                    w1Var3.f31601a.U2.N(true);
                                    return;
                                default:
                                    w1 w1Var4 = this.f44198b;
                                    w1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    w1Var4.f31601a.U2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder3.d(-1);
                    alertDialog$Builder3.o();
                } else if (i13 == 9) {
                    d1[] d1VarArr = {null};
                    o2 d1Var = new d1(null, new yu0(8, this, d1VarArr));
                    d1VarArr[0] = d1Var;
                    presentFragment(d1Var);
                } else if (i13 == 5) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
                    org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.f22714a;
                    c2Var4.N = string4;
                    c2Var4.P = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                        public final w1 f44198b;

                        {
                            this.f44198b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    w1 w1Var = this.f44198b;
                                    w1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(w1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            w1.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            w1.Y(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    k2 b10 = k2.b();
                                    HashMap hashMap = b10.f44092a;
                                    if (hashMap == null) {
                                        b10.f44094c = false;
                                        b10.f44093b = true;
                                        b10.f44092a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    w1Var.a0();
                                    return;
                                case 1:
                                    w1 w1Var2 = this.f44198b;
                                    w1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            w1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    w1Var2.a0();
                                    return;
                                case 2:
                                    w1 w1Var3 = this.f44198b;
                                    try {
                                        b1.f43989c.clear();
                                        b1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        FileLog.e(e13);
                                    }
                                    w1Var3.f44238n = 0L;
                                    w1Var3.f31601a.U2.N(true);
                                    return;
                                default:
                                    w1 w1Var4 = this.f44198b;
                                    w1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    w1Var4.f31601a.U2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder4.d(-1);
                    alertDialog$Builder4.o();
                } else if (w41Var.G(u1.class)) {
                    v1 v1Var = (v1) view;
                    String str2 = v1Var.f44220e;
                    j70 F = j70.F((ViewGroup) this.fragmentView, null, v1Var);
                    F.f29600s = 40;
                    F.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new y(5, this, str2), false);
                    F.Z();
                } else {
                    int i17 = w41Var.d;
                    if (i17 == 6) {
                        if (getParentActivity() != null) {
                            AtomicReference atomicReference = new AtomicReference();
                            LinearLayout linearLayout = new LinearLayout(getParentActivity());
                            linearLayout.setOrientation(1);
                            ArrayList b10 = k1.b();
                            int size2 = b10.size();
                            CharSequence[] charSequenceArr = new CharSequence[size2];
                            for (int i18 = 0; i18 < size2; i18++) {
                                charSequenceArr[i18] = ((k1) b10.get(i18)).f44088a;
                                i6 i6Var = new i6(getParentActivity(), null);
                                i6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                                i6Var.a(g6.w0(null, g6.f23118g7, false), g6.w0(null, g6.E5, false));
                                CharSequence charSequence = charSequenceArr[i18];
                                if (i18 == SharedConfig.searchEngineType) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i6Var.b(charSequence, z10);
                                i6Var.setBackground(g6.f0(g6.w0(null, g6.f23152i6, false), 2, -1));
                                linearLayout.addView(i6Var);
                                i6Var.setOnClickListener(new p2(i18, view, atomicReference));
                            }
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                            String string5 = LocaleController.getString(R.string.SearchEngine);
                            org.telegram.ui.ActionBar.c2 c2Var5 = alertDialog$Builder5.f22714a;
                            c2Var5.N = string5;
                            alertDialog$Builder5.n(linearLayout);
                            alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                            atomicReference.set(c2Var5);
                            showDialog(c2Var5);
                        }
                    } else if (i17 == 15 || i17 == 16) {
                        boolean isWebBrowserInAppEnabled2 = getMessagesController().isWebBrowserInAppEnabled();
                        if (getMessagesController().isWebBrowserExceptionsLimitReached(isWebBrowserInAppEnabled2)) {
                            c5.u0(this, LocaleController.getString(R.string.WebBrowserExceptionsLimitTitle), LocaleController.getString(R.string.WebBrowserExceptionsLimitMessage), null);
                            return;
                        }
                        Activity parentActivity = getParentActivity();
                        c6 resourceProvider = getResourceProvider();
                        m6 m6Var = new m6(6, this, isWebBrowserInAppEnabled2);
                        Pattern pattern = c5.f27308a;
                        Activity findActivity = AndroidUtilities.findActivity(parentActivity);
                        if (findActivity != null) {
                            view2 = findActivity.getCurrentFocus();
                        }
                        View view3 = view2;
                        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                        AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(parentActivity, 0, resourceProvider);
                        if (isWebBrowserInAppEnabled2) {
                            i10 = R.string.BrowserSettingsAddTitle;
                        } else {
                            i10 = R.string.BrowserSettingsAddTitleExternal;
                        }
                        String string6 = LocaleController.getString(i10);
                        org.telegram.ui.ActionBar.c2 c2Var6 = alertDialog$Builder6.f22714a;
                        c2Var6.N = string6;
                        if (isWebBrowserInAppEnabled2) {
                            i11 = R.string.BrowserSettingsAddText;
                        } else {
                            i11 = R.string.BrowserSettingsAddTextExternal;
                        }
                        c2Var6.P = LocaleController.getString(i11);
                        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                        editTextBoldCursor.setTextSize(1, 16.0f);
                        int i19 = g6.f23169j5;
                        editTextBoldCursor.setTextColor(g6.v0(i19, resourceProvider));
                        editTextBoldCursor.setHintTextColor(g6.v0(g6.Xh, resourceProvider));
                        editTextBoldCursor.setHint(LocaleController.getString(R.string.BrowserSettingsAddHint));
                        editTextBoldCursor.setInputType(17);
                        editTextBoldCursor.setImeOptions(6);
                        editTextBoldCursor.setSingleLine(true);
                        editTextBoldCursor.setFocusable(true);
                        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
                        editTextBoldCursor.setCursorWidth(1.5f);
                        editTextBoldCursor.setCursorColor(g6.v0(g6.q6, resourceProvider));
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                        gradientDrawable.setColor(g6.l1(0.06f, g6.v0(i19, resourceProvider)));
                        editTextBoldCursor.setBackground(gradientDrawable);
                        gg ggVar = new gg(editTextBoldCursor, m6Var, c2VarArr, view3, 9);
                        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.f1(ggVar, 0));
                        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                        linearLayout2.setOrientation(1);
                        linearLayout2.addView(editTextBoldCursor, f6.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                        alertDialog$Builder6.c();
                        alertDialog$Builder6.n(linearLayout2);
                        c2Var6.f22778a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                        alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.u(ggVar, 2));
                        alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.n0(3));
                        c2VarArr[0] = c2Var6;
                        c2Var6.f22784d0 = false;
                        c2Var6.setOnDismissListener(new org.telegram.ui.Components.d1(editTextBoldCursor, 1));
                        c2VarArr[0].setOnShowListener(new org.telegram.ui.Components.g1(0, editTextBoldCursor));
                        c2VarArr[0].show();
                    }
                }
            }
        }
    }

    @Override
    public final boolean X(w41 w41Var, View view) {
        return false;
    }

    public final void a0() {
        k51 k51Var;
        ArrayList a2 = b1.a(new nh.b0(this, 12));
        if (a2 != null) {
            this.f44238n = a2.size();
            o51 o51Var = this.f31601a;
            if (o51Var != null && (k51Var = o51Var.U2) != null && o51Var.C) {
                k51Var.N(true);
            }
        }
        Utilities.globalQueue.postRunnable(new t1(this, 0));
    }

    @Override
    public final View createView(Context context) {
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(g6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(g6.f23190k7), mode));
        lh.h2 h2Var = new lh.h2(mutate, mutate2, 4);
        h2Var.f29793x = AndroidUtilities.dp(2.0f);
        this.d = h2Var;
        this.fragmentView = super.createView(context);
        this.f31601a.p1();
        this.actionBar.setAdaptiveBackground(this.f31601a);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        o51 o51Var;
        if (i10 == NotificationCenter.webBrowserSettingsUpdate && (o51Var = this.f31601a) != null) {
            o51Var.U2.N(true);
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
        o51 o51Var = this.f31601a;
        o51Var.setPadding(0, o51Var.getPaddingTop(), 0, i13);
        this.f31601a.setClipToPadding(false);
    }
}
