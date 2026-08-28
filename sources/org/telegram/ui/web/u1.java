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
import fh.a3;
import g7.e6;
import gh.p6;
import ih.j2;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kh.i9;
import mh.m2;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z41;
import org.telegram.ui.ai1;
import org.telegram.ui.eb0;
import org.telegram.ui.tr;
public final class u1 extends d51 implements NotificationCenter.NotificationCenterDelegate {
    public j2 d;
    public final Utilities.Callback f44030e;
    public long f44031f;
    public long h;
    public long f44032n;

    public u1(org.telegram.ui.r rVar) {
        this.f44030e = rVar;
    }

    public static boolean X(File file, Boolean bool) {
        boolean z10;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z10 = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !X(file2, bool)) {
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

    public static long Y(File file, Boolean bool) {
        long j10 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j10 += Y(file2, bool);
                }
                return j10;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override
    public final void T(ArrayList arrayList, z41 z41Var) {
        String str;
        boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        l41 l41Var = new l41(9);
        l41Var.d = 1;
        l41Var.f30339l = string;
        l41Var.K(isWebBrowserInAppEnabled);
        arrayList.add(l41Var);
        org.telegram.ui.Cells.j2.y(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!isWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            l41 i9 = l41.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            i9.K(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(i9);
            org.telegram.ui.Cells.j2.y(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(l41.t(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            j2 j2Var = this.d;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            l41 l41Var2 = new l41(3);
            l41Var2.d = 16;
            l41Var2.G = j2Var;
            l41Var2.f30339l = string2;
            l41Var2.f30344q = true;
            arrayList.add(l41Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str2 = webDomainException.domain;
                String str3 = webDomainException.title;
                long j10 = webDomainException.favicon;
                int i10 = s1.f44016a;
                l41 J = l41.J(s1.class);
                J.f30339l = str2;
                J.f30341n = str3;
                J.B = j10;
                arrayList.add(J);
            }
            arrayList.add(l41.B(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (!webBrowserExceptionsList.isEmpty()) {
                arrayList.size();
                l41 e10 = l41.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
                e10.f30345r = true;
                arrayList.add(e10);
                arrayList.add(l41.B(null));
                return;
            }
            return;
        }
        arrayList.size();
        int i11 = R.drawable.menu_clear_cookies;
        String string3 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
        long j11 = this.h;
        String str4 = "";
        if (j11 <= 0) {
            str = "";
        } else {
            str = AndroidUtilities.formatFileSize(j11);
        }
        arrayList.add(l41.d(3, i11, string3, str));
        arrayList.size();
        int i12 = R.drawable.menu_clear_cache;
        String string4 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j12 = this.f44031f;
        if (j12 > 0) {
            str4 = AndroidUtilities.formatFileSize(j12);
        }
        arrayList.add(l41.d(2, i12, string4, str4));
        org.telegram.ui.Cells.j2.y(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.f44032n > 0) {
            arrayList.size();
            arrayList.add(l41.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(l41.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.f44032n, ',')));
            arrayList.add(l41.B(null));
        }
        arrayList.add(l41.t(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        j2 j2Var2 = this.d;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        l41 l41Var3 = new l41(3);
        l41Var3.d = 15;
        l41Var3.G = j2Var2;
        l41Var3.f30339l = string5;
        l41Var3.f30344q = true;
        arrayList.add(l41Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str5 = webDomainException2.domain;
            String str6 = webDomainException2.title;
            long j13 = webDomainException2.favicon;
            int i13 = s1.f44016a;
            l41 J2 = l41.J(s1.class);
            J2.f30339l = str5;
            J2.f30341n = str6;
            J2.B = j13;
            arrayList.add(J2);
        }
        arrayList.add(l41.B(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            l41 e11 = l41.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e11.f30345r = true;
            arrayList.add(e11);
            arrayList.add(l41.B(null));
        }
        arrayList.size();
        arrayList.add(l41.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), j1.a().f43902a));
        org.telegram.ui.Cells.j2.y(R.string.BrowserSettingsSearchEngineInfo, arrayList);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            l41 i14 = l41.i(12, "adaptable colors");
            i14.K(SharedConfig.adaptableColorInBrowser);
            arrayList.add(i14);
            l41 i15 = l41.i(13, "only local IV");
            i15.K(SharedConfig.onlyLocalInstantView);
            arrayList.add(i15);
        }
    }

    @Override
    public final CharSequence U() {
        return LocaleController.getString(R.string.BrowserSettingsTitle);
    }

    @Override
    public final void V(l41 l41Var, View view) {
        int i9;
        int i10;
        boolean z10;
        int i11;
        int i12 = l41Var.d;
        if (i12 == 12) {
            SharedConfig.toggleBrowserAdaptableColors();
            ((t8) view).setChecked(SharedConfig.adaptableColorInBrowser);
        } else if (i12 == 13) {
            SharedConfig.toggleLocalInstantView();
            ((t8) view).setChecked(SharedConfig.onlyLocalInstantView);
        } else if (i12 == 17) {
            boolean z11 = !getMessagesController().isWebBrowserUseCustomTabs();
            getMessagesController().toggleWebBrowserUseCustomTabs(z11);
            ((t8) view).setChecked(z11);
            this.f27658a.U2.N(true);
        } else {
            View view2 = null;
            if (i12 == 1) {
                getMessagesController().toggleWebBrowserInAppEnabled();
                boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
                t8 t8Var = (t8) view;
                t8Var.setChecked(isWebBrowserInAppEnabled);
                if (isWebBrowserInAppEnabled) {
                    i11 = f6.f23037f6;
                } else {
                    i11 = f6.f23019e6;
                }
                t8Var.b(f6.w0(null, i11, false), isWebBrowserInAppEnabled);
                this.f27658a.U2.N(true);
            } else if (i12 == 10) {
                getMessagesController().toggleWebBrowserUseCustomTabs(true);
                this.f27658a.U2.N(true);
            } else if (i12 == 11) {
                getMessagesController().toggleWebBrowserUseCustomTabs(false);
                this.f27658a.U2.N(true);
            } else {
                String str = "";
                if (i12 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.N = string;
                    int i13 = R.string.BrowserSettingsCacheClearText;
                    if (this.f44031f != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.f44031f) + ")";
                    }
                    c2Var.P = LocaleController.formatString(i13, str);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) {
                        public final u1 f44008b;

                        {
                            this.f44008b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i14) {
                            switch (r2) {
                                case 0:
                                    u1 u1Var = this.f44008b;
                                    u1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(u1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            u1.X(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            u1.X(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    i2 b10 = i2.b();
                                    HashMap hashMap = b10.f43894a;
                                    if (hashMap == null) {
                                        b10.f43896c = false;
                                        b10.f43895b = true;
                                        b10.f43894a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    u1Var.Z();
                                    return;
                                case 1:
                                    u1 u1Var2 = this.f44008b;
                                    u1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            u1.X(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    u1Var2.Z();
                                    return;
                                case 2:
                                    u1 u1Var3 = this.f44008b;
                                    try {
                                        a1.f43796c.clear();
                                        a1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        FileLog.e(e13);
                                    }
                                    u1Var3.f44032n = 0L;
                                    u1Var3.f27658a.U2.N(true);
                                    return;
                                default:
                                    u1 u1Var4 = this.f44008b;
                                    u1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    u1Var4.f27658a.U2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.o();
                } else if (i12 == 3) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string2 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                    c2Var2.N = string2;
                    int i14 = R.string.BrowserSettingsCookiesClearText;
                    if (this.h != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
                    }
                    c2Var2.P = LocaleController.formatString(i14, str);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) {
                        public final u1 f44008b;

                        {
                            this.f44008b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.c2 c2Var22, int i142) {
                            switch (r2) {
                                case 0:
                                    u1 u1Var = this.f44008b;
                                    u1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(u1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            u1.X(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            u1.X(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    i2 b10 = i2.b();
                                    HashMap hashMap = b10.f43894a;
                                    if (hashMap == null) {
                                        b10.f43896c = false;
                                        b10.f43895b = true;
                                        b10.f43894a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    u1Var.Z();
                                    return;
                                case 1:
                                    u1 u1Var2 = this.f44008b;
                                    u1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            u1.X(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    u1Var2.Z();
                                    return;
                                case 2:
                                    u1 u1Var3 = this.f44008b;
                                    try {
                                        a1.f43796c.clear();
                                        a1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        FileLog.e(e13);
                                    }
                                    u1Var3.f44032n = 0L;
                                    u1Var3.f27658a.U2.N(true);
                                    return;
                                default:
                                    u1 u1Var4 = this.f44008b;
                                    u1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    u1Var4.f27658a.U2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder2.d(-1);
                    alertDialog$Builder2.o();
                } else if (i12 == 7) {
                    ArrayList a2 = a1.a(null);
                    int size = a2.size();
                    long j10 = Long.MAX_VALUE;
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = a2.get(i15);
                        i15++;
                        j10 = Math.min(j10, ((z0) obj).f44113b);
                    }
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string3 = LocaleController.getString(R.string.BrowserSettingsHistoryClear);
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22702a;
                    c2Var3.N = string3;
                    c2Var3.P = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(j10 / 1000));
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) {
                        public final u1 f44008b;

                        {
                            this.f44008b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.c2 c2Var22, int i142) {
                            switch (r2) {
                                case 0:
                                    u1 u1Var = this.f44008b;
                                    u1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(u1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            u1.X(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            u1.X(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    i2 b10 = i2.b();
                                    HashMap hashMap = b10.f43894a;
                                    if (hashMap == null) {
                                        b10.f43896c = false;
                                        b10.f43895b = true;
                                        b10.f43894a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    u1Var.Z();
                                    return;
                                case 1:
                                    u1 u1Var2 = this.f44008b;
                                    u1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            u1.X(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    u1Var2.Z();
                                    return;
                                case 2:
                                    u1 u1Var3 = this.f44008b;
                                    try {
                                        a1.f43796c.clear();
                                        a1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        FileLog.e(e13);
                                    }
                                    u1Var3.f44032n = 0L;
                                    u1Var3.f27658a.U2.N(true);
                                    return;
                                default:
                                    u1 u1Var4 = this.f44008b;
                                    u1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    u1Var4.f27658a.U2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder3.d(-1);
                    alertDialog$Builder3.o();
                } else if (i12 == 9) {
                    c1[] c1VarArr = {null};
                    o2 c1Var = new c1(null, new eb0(15, this, c1VarArr));
                    c1VarArr[0] = c1Var;
                    presentFragment(c1Var);
                } else if (i12 == 5) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
                    org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.f22702a;
                    c2Var4.N = string4;
                    c2Var4.P = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                        public final u1 f44008b;

                        {
                            this.f44008b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.c2 c2Var22, int i142) {
                            switch (r2) {
                                case 0:
                                    u1 u1Var = this.f44008b;
                                    u1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(u1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            u1.X(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            u1.X(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    i2 b10 = i2.b();
                                    HashMap hashMap = b10.f43894a;
                                    if (hashMap == null) {
                                        b10.f43896c = false;
                                        b10.f43895b = true;
                                        b10.f43894a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    u1Var.Z();
                                    return;
                                case 1:
                                    u1 u1Var2 = this.f44008b;
                                    u1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            u1.X(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    u1Var2.Z();
                                    return;
                                case 2:
                                    u1 u1Var3 = this.f44008b;
                                    try {
                                        a1.f43796c.clear();
                                        a1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        FileLog.e(e13);
                                    }
                                    u1Var3.f44032n = 0L;
                                    u1Var3.f27658a.U2.N(true);
                                    return;
                                default:
                                    u1 u1Var4 = this.f44008b;
                                    u1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    u1Var4.f27658a.U2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder4.d(-1);
                    alertDialog$Builder4.o();
                } else if (l41Var.G(s1.class)) {
                    t1 t1Var = (t1) view;
                    String str2 = t1Var.f44023e;
                    x60 F = x60.F((ViewGroup) this.fragmentView, null, t1Var);
                    F.f34580s = 40;
                    F.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new ai1(8, this, str2), false);
                    F.Z();
                } else {
                    int i16 = l41Var.d;
                    if (i16 == 6) {
                        if (getParentActivity() != null) {
                            AtomicReference atomicReference = new AtomicReference();
                            LinearLayout linearLayout = new LinearLayout(getParentActivity());
                            linearLayout.setOrientation(1);
                            ArrayList b10 = j1.b();
                            int size2 = b10.size();
                            CharSequence[] charSequenceArr = new CharSequence[size2];
                            for (int i17 = 0; i17 < size2; i17++) {
                                charSequenceArr[i17] = ((j1) b10.get(i17)).f43902a;
                                k6 k6Var = new k6(getParentActivity(), null);
                                k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                                k6Var.a(f6.w0(null, f6.f23056g7, false), f6.w0(null, f6.E5, false));
                                CharSequence charSequence = charSequenceArr[i17];
                                if (i17 == SharedConfig.searchEngineType) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                k6Var.b(charSequence, z10);
                                k6Var.setBackground(f6.f0(f6.w0(null, f6.f23092i6, false), 2, -1));
                                linearLayout.addView(k6Var);
                                k6Var.setOnClickListener(new a3(i17, view, atomicReference));
                            }
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                            String string5 = LocaleController.getString(R.string.SearchEngine);
                            org.telegram.ui.ActionBar.c2 c2Var5 = alertDialog$Builder5.f22702a;
                            c2Var5.N = string5;
                            alertDialog$Builder5.n(linearLayout);
                            alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                            atomicReference.set(c2Var5);
                            showDialog(c2Var5);
                        }
                    } else if (i16 == 15 || i16 == 16) {
                        boolean isWebBrowserInAppEnabled2 = getMessagesController().isWebBrowserInAppEnabled();
                        if (getMessagesController().isWebBrowserExceptionsLimitReached(isWebBrowserInAppEnabled2)) {
                            y4.u0(this, LocaleController.getString(R.string.WebBrowserExceptionsLimitTitle), LocaleController.getString(R.string.WebBrowserExceptionsLimitMessage), null);
                            return;
                        }
                        Activity parentActivity = getParentActivity();
                        b6 resourceProvider = getResourceProvider();
                        p6 p6Var = new p6(6, this, isWebBrowserInAppEnabled2);
                        Pattern pattern = y4.f34847a;
                        Activity findActivity = AndroidUtilities.findActivity(parentActivity);
                        if (findActivity != null) {
                            view2 = findActivity.getCurrentFocus();
                        }
                        View view3 = view2;
                        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                        AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(parentActivity, 0, resourceProvider);
                        if (isWebBrowserInAppEnabled2) {
                            i9 = R.string.BrowserSettingsAddTitle;
                        } else {
                            i9 = R.string.BrowserSettingsAddTitleExternal;
                        }
                        String string6 = LocaleController.getString(i9);
                        org.telegram.ui.ActionBar.c2 c2Var6 = alertDialog$Builder6.f22702a;
                        c2Var6.N = string6;
                        if (isWebBrowserInAppEnabled2) {
                            i10 = R.string.BrowserSettingsAddText;
                        } else {
                            i10 = R.string.BrowserSettingsAddTextExternal;
                        }
                        c2Var6.P = LocaleController.getString(i10);
                        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                        editTextBoldCursor.setTextSize(1, 16.0f);
                        int i18 = f6.f23108j5;
                        editTextBoldCursor.setTextColor(f6.v0(i18, resourceProvider));
                        editTextBoldCursor.setHintTextColor(f6.v0(f6.Xh, resourceProvider));
                        editTextBoldCursor.setHint(LocaleController.getString(R.string.BrowserSettingsAddHint));
                        editTextBoldCursor.setInputType(17);
                        editTextBoldCursor.setImeOptions(6);
                        editTextBoldCursor.setSingleLine(true);
                        editTextBoldCursor.setFocusable(true);
                        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
                        editTextBoldCursor.setCursorWidth(1.5f);
                        editTextBoldCursor.setCursorColor(f6.v0(f6.f23229q6, resourceProvider));
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                        gradientDrawable.setColor(f6.l1(0.06f, f6.v0(i18, resourceProvider)));
                        editTextBoldCursor.setBackground(gradientDrawable);
                        org.telegram.ui.k6 k6Var2 = new org.telegram.ui.k6(editTextBoldCursor, p6Var, c2VarArr, view3, 15);
                        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.c1(k6Var2, 0));
                        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                        linearLayout2.setOrientation(1);
                        linearLayout2.addView(editTextBoldCursor, e6.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                        alertDialog$Builder6.c();
                        alertDialog$Builder6.n(linearLayout2);
                        c2Var6.f22761a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                        alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.s(k6Var2, 2));
                        alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new tr(9));
                        c2VarArr[0] = c2Var6;
                        c2Var6.f22767d0 = false;
                        c2Var6.setOnDismissListener(new org.telegram.ui.Components.a1(editTextBoldCursor, 1));
                        c2VarArr[0].setOnShowListener(new org.telegram.ui.Components.d1(0, editTextBoldCursor));
                        c2VarArr[0].show();
                    }
                }
            }
        }
    }

    @Override
    public final boolean W(l41 l41Var, View view) {
        return false;
    }

    public final void Z() {
        z41 z41Var;
        ArrayList a2 = a1.a(new i9(this, 9));
        if (a2 != null) {
            this.f44032n = a2.size();
            c51 c51Var = this.f27658a;
            if (c51Var != null && (z41Var = c51Var.U2) != null && c51Var.C) {
                z41Var.N(true);
            }
        }
        Utilities.globalQueue.postRunnable(new m2(this, 21));
    }

    @Override
    public final View createView(Context context) {
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(f6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(f6.f23128k7), mode));
        j2 j2Var = new j2(mutate, mutate2, 4);
        j2Var.f28551x = AndroidUtilities.dp(2.0f);
        this.d = j2Var;
        this.fragmentView = super.createView(context);
        this.f27658a.p1();
        this.actionBar.setAdaptiveBackground(this.f27658a);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        c51 c51Var;
        if (i9 == NotificationCenter.webBrowserSettingsUpdate && (c51Var = this.f27658a) != null) {
            c51Var.U2.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        Z();
        getNotificationCenter().addObserver(this, NotificationCenter.webBrowserSettingsUpdate);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.webBrowserSettingsUpdate);
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        super.onInsets(i9, i10, i11, i12);
        c51 c51Var = this.f27658a;
        c51Var.setPadding(0, c51Var.getPaddingTop(), 0, i12);
        this.f27658a.setClipToPadding(false);
    }
}
