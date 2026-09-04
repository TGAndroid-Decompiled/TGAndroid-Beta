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
import bi.g3;
import bi.v2;
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
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.oj0;
import w7.x5;
public final class a2 extends y51 implements NotificationCenter.NotificationCenterDelegate {
    public g3 d;
    public final Utilities.Callback f42001e;
    public long f42002f;
    public long h;
    public long f42003n;

    public a2(org.telegram.ui.r rVar) {
        this.f42001e = rVar;
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
    public final void U(ArrayList arrayList, v51 v51Var) {
        String str;
        boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        h51 h51Var = new h51(9);
        h51Var.d = 1;
        h51Var.f26594l = string;
        h51Var.K(isWebBrowserInAppEnabled);
        arrayList.add(h51Var);
        i2.g.A(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!isWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            h51 i10 = h51.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            i10.K(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(i10);
            i2.g.A(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(h51.t(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            g3 g3Var = this.d;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            h51 h51Var2 = new h51(3);
            h51Var2.d = 16;
            h51Var2.G = g3Var;
            h51Var2.f26594l = string2;
            h51Var2.f26599q = true;
            arrayList.add(h51Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str2 = webDomainException.domain;
                String str3 = webDomainException.title;
                long j3 = webDomainException.favicon;
                int i11 = y1.f42323a;
                h51 J = h51.J(y1.class);
                J.f26594l = str2;
                J.f26596n = str3;
                J.B = j3;
                arrayList.add(J);
            }
            arrayList.add(h51.B(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (!webBrowserExceptionsList.isEmpty()) {
                arrayList.size();
                h51 e7 = h51.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
                e7.f26600r = true;
                arrayList.add(e7);
                arrayList.add(h51.B(null));
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
        arrayList.add(h51.d(3, i12, string3, str));
        arrayList.size();
        int i13 = R.drawable.menu_clear_cache;
        String string4 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j11 = this.f42002f;
        if (j11 > 0) {
            str4 = AndroidUtilities.formatFileSize(j11);
        }
        arrayList.add(h51.d(2, i13, string4, str4));
        i2.g.A(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.f42003n > 0) {
            arrayList.size();
            arrayList.add(h51.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(h51.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.f42003n, ',')));
            arrayList.add(h51.B(null));
        }
        arrayList.add(h51.t(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        g3 g3Var2 = this.d;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        h51 h51Var3 = new h51(3);
        h51Var3.d = 15;
        h51Var3.G = g3Var2;
        h51Var3.f26594l = string5;
        h51Var3.f26599q = true;
        arrayList.add(h51Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str5 = webDomainException2.domain;
            String str6 = webDomainException2.title;
            long j12 = webDomainException2.favicon;
            int i14 = y1.f42323a;
            h51 J2 = h51.J(y1.class);
            J2.f26594l = str5;
            J2.f26596n = str6;
            J2.B = j12;
            arrayList.add(J2);
        }
        arrayList.add(h51.B(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            h51 e10 = h51.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e10.f26600r = true;
            arrayList.add(e10);
            arrayList.add(h51.B(null));
        }
        arrayList.size();
        arrayList.add(h51.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), p1.a().f42208a));
        i2.g.A(R.string.BrowserSettingsSearchEngineInfo, arrayList);
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
        boolean z10;
        int i12;
        int i13 = h51Var.d;
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
            this.f32849a.Y2.N(true);
        } else {
            View view2 = null;
            if (i13 == 1) {
                getMessagesController().toggleWebBrowserInAppEnabled();
                boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
                w8 w8Var = (w8) view;
                w8Var.setChecked(isWebBrowserInAppEnabled);
                if (isWebBrowserInAppEnabled) {
                    i12 = j6.f20700f6;
                } else {
                    i12 = j6.f20683e6;
                }
                w8Var.b(j6.w0(null, i12, false), isWebBrowserInAppEnabled);
                this.f32849a.Y2.N(true);
            } else if (i13 == 10) {
                getMessagesController().toggleWebBrowserUseCustomTabs(true);
                this.f32849a.Y2.N(true);
            } else if (i13 == 11) {
                getMessagesController().toggleWebBrowserUseCustomTabs(false);
                this.f32849a.Y2.N(true);
            } else {
                String str = "";
                if (i13 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                    b2Var.R = string;
                    int i14 = R.string.BrowserSettingsCacheClearText;
                    if (this.f42002f != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.f42002f) + ")";
                    }
                    b2Var.T = LocaleController.formatString(i14, str);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                        public final a2 f42317b;

                        {
                            this.f42317b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i15) {
                            switch (r2) {
                                case 0:
                                    a2 a2Var = this.f42317b;
                                    a2Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(a2Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            a2.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            a2.Y(file2, null);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    o2 b10 = o2.b();
                                    HashMap hashMap = b10.f42201a;
                                    if (hashMap == null) {
                                        b10.f42203c = false;
                                        b10.f42202b = true;
                                        b10.f42201a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    a2Var.a0();
                                    return;
                                case 1:
                                    a2 a2Var2 = this.f42317b;
                                    a2Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            a2.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    a2Var2.a0();
                                    return;
                                case 2:
                                    a2 a2Var3 = this.f42317b;
                                    try {
                                        f1.f42090c.clear();
                                        f1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    a2Var3.f42003n = 0L;
                                    a2Var3.f32849a.Y2.N(true);
                                    return;
                                default:
                                    a2 a2Var4 = this.f42317b;
                                    a2Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    a2Var4.f32849a.Y2.N(true);
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
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20198a;
                    b2Var2.R = string2;
                    int i15 = R.string.BrowserSettingsCookiesClearText;
                    if (this.h != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
                    }
                    b2Var2.T = LocaleController.formatString(i15, str);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                        public final a2 f42317b;

                        {
                            this.f42317b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    a2 a2Var = this.f42317b;
                                    a2Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(a2Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            a2.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            a2.Y(file2, null);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    o2 b10 = o2.b();
                                    HashMap hashMap = b10.f42201a;
                                    if (hashMap == null) {
                                        b10.f42203c = false;
                                        b10.f42202b = true;
                                        b10.f42201a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    a2Var.a0();
                                    return;
                                case 1:
                                    a2 a2Var2 = this.f42317b;
                                    a2Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            a2.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    a2Var2.a0();
                                    return;
                                case 2:
                                    a2 a2Var3 = this.f42317b;
                                    try {
                                        f1.f42090c.clear();
                                        f1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    a2Var3.f42003n = 0L;
                                    a2Var3.f32849a.Y2.N(true);
                                    return;
                                default:
                                    a2 a2Var4 = this.f42317b;
                                    a2Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    a2Var4.f32849a.Y2.N(true);
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
                        j3 = Math.min(j3, ((e1) obj).f42077b);
                    }
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string3 = LocaleController.getString(R.string.BrowserSettingsHistoryClear);
                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20198a;
                    b2Var3.R = string3;
                    b2Var3.T = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(j3 / 1000));
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                        public final a2 f42317b;

                        {
                            this.f42317b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    a2 a2Var = this.f42317b;
                                    a2Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(a2Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            a2.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            a2.Y(file2, null);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    o2 b10 = o2.b();
                                    HashMap hashMap = b10.f42201a;
                                    if (hashMap == null) {
                                        b10.f42203c = false;
                                        b10.f42202b = true;
                                        b10.f42201a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    a2Var.a0();
                                    return;
                                case 1:
                                    a2 a2Var2 = this.f42317b;
                                    a2Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            a2.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    a2Var2.a0();
                                    return;
                                case 2:
                                    a2 a2Var3 = this.f42317b;
                                    try {
                                        f1.f42090c.clear();
                                        f1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    a2Var3.f42003n = 0L;
                                    a2Var3.f32849a.Y2.N(true);
                                    return;
                                default:
                                    a2 a2Var4 = this.f42317b;
                                    a2Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    a2Var4.f32849a.Y2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder3.d(-1);
                    alertDialog$Builder3.o();
                } else if (i13 == 9) {
                    i1[] i1VarArr = {null};
                    org.telegram.ui.ActionBar.n2 i1Var = new i1(null, new oj0(11, this, i1VarArr));
                    i1VarArr[0] = i1Var;
                    presentFragment(i1Var);
                } else if (i13 == 5) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f20198a;
                    b2Var4.R = string4;
                    b2Var4.T = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) {
                        public final a2 f42317b;

                        {
                            this.f42317b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    a2 a2Var = this.f42317b;
                                    a2Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(a2Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            a2.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            a2.Y(file2, null);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    o2 b10 = o2.b();
                                    HashMap hashMap = b10.f42201a;
                                    if (hashMap == null) {
                                        b10.f42203c = false;
                                        b10.f42202b = true;
                                        b10.f42201a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    a2Var.a0();
                                    return;
                                case 1:
                                    a2 a2Var2 = this.f42317b;
                                    a2Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            a2.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    a2Var2.a0();
                                    return;
                                case 2:
                                    a2 a2Var3 = this.f42317b;
                                    try {
                                        f1.f42090c.clear();
                                        f1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    a2Var3.f42003n = 0L;
                                    a2Var3.f32849a.Y2.N(true);
                                    return;
                                default:
                                    a2 a2Var4 = this.f42317b;
                                    a2Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    a2Var4.f32849a.Y2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder4.d(-1);
                    alertDialog$Builder4.o();
                } else if (h51Var.G(y1.class)) {
                    z1 z1Var = (z1) view;
                    String str2 = z1Var.f42341e;
                    n70 F = n70.F((ViewGroup) this.fragmentView, null, z1Var);
                    F.f28660s = 40;
                    F.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new g1(3, this, str2), false);
                    F.Z();
                } else {
                    int i17 = h51Var.d;
                    if (i17 == 6) {
                        if (getParentActivity() != null) {
                            AtomicReference atomicReference = new AtomicReference();
                            LinearLayout linearLayout = new LinearLayout(getParentActivity());
                            linearLayout.setOrientation(1);
                            ArrayList b10 = p1.b();
                            int size2 = b10.size();
                            CharSequence[] charSequenceArr = new CharSequence[size2];
                            for (int i18 = 0; i18 < size2; i18++) {
                                charSequenceArr[i18] = ((p1) b10.get(i18)).f42208a;
                                k6 k6Var = new k6(getParentActivity(), null);
                                k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                                k6Var.a(j6.w0(null, j6.f20719g7, false), j6.w0(null, j6.E5, false));
                                CharSequence charSequence = charSequenceArr[i18];
                                if (i18 == SharedConfig.searchEngineType) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                k6Var.b(charSequence, z10);
                                k6Var.setBackground(j6.f0(j6.w0(null, j6.f20753i6, false), 2, -1));
                                linearLayout.addView(k6Var);
                                k6Var.setOnClickListener(new ua(i18, view, atomicReference));
                            }
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                            String string5 = LocaleController.getString(R.string.SearchEngine);
                            org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder5.f20198a;
                            b2Var5.R = string5;
                            alertDialog$Builder5.n(linearLayout);
                            alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                            atomicReference.set(b2Var5);
                            showDialog(b2Var5);
                        }
                    } else if (i17 == 15 || i17 == 16) {
                        boolean isWebBrowserInAppEnabled2 = getMessagesController().isWebBrowserInAppEnabled();
                        if (getMessagesController().isWebBrowserExceptionsLimitReached(isWebBrowserInAppEnabled2)) {
                            e5.u0(this, LocaleController.getString(R.string.WebBrowserExceptionsLimitTitle), LocaleController.getString(R.string.WebBrowserExceptionsLimitMessage), null);
                            return;
                        }
                        Activity parentActivity = getParentActivity();
                        f6 resourceProvider = getResourceProvider();
                        v2 v2Var = new v2(5, this, isWebBrowserInAppEnabled2);
                        Pattern pattern = e5.f25557a;
                        Activity findActivity = AndroidUtilities.findActivity(parentActivity);
                        if (findActivity != null) {
                            view2 = findActivity.getCurrentFocus();
                        }
                        View view3 = view2;
                        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                        AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(parentActivity, 0, resourceProvider);
                        if (isWebBrowserInAppEnabled2) {
                            i10 = R.string.BrowserSettingsAddTitle;
                        } else {
                            i10 = R.string.BrowserSettingsAddTitleExternal;
                        }
                        String string6 = LocaleController.getString(i10);
                        org.telegram.ui.ActionBar.b2 b2Var6 = alertDialog$Builder6.f20198a;
                        b2Var6.R = string6;
                        if (isWebBrowserInAppEnabled2) {
                            i11 = R.string.BrowserSettingsAddText;
                        } else {
                            i11 = R.string.BrowserSettingsAddTextExternal;
                        }
                        b2Var6.T = LocaleController.getString(i11);
                        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                        editTextBoldCursor.setTextSize(1, 16.0f);
                        int i19 = j6.f20770j5;
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
                        n5 n5Var = new n5(editTextBoldCursor, v2Var, b2VarArr, view3, 16);
                        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.f1(n5Var, 0));
                        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                        linearLayout2.setOrientation(1);
                        linearLayout2.addView(editTextBoldCursor, x5.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                        alertDialog$Builder6.c();
                        alertDialog$Builder6.n(linearLayout2);
                        b2Var6.f20224a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                        alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.t(n5Var, 2));
                        alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.f(4));
                        b2VarArr[0] = b2Var6;
                        b2Var6.f20238h0 = false;
                        b2Var6.setOnDismissListener(new org.telegram.ui.Components.c1(editTextBoldCursor, 1));
                        b2VarArr[0].setOnShowListener(new org.telegram.ui.Components.g1(0, editTextBoldCursor));
                        b2VarArr[0].show();
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
        v51 v51Var;
        ArrayList a2 = f1.a(new b1(this, 2));
        if (a2 != null) {
            this.f42003n = a2.size();
            x51 x51Var = this.f32849a;
            if (x51Var != null && (v51Var = x51Var.Y2) != null && x51Var.G) {
                v51Var.N(true);
            }
        }
        Utilities.globalQueue.postRunnable(new b(this, 7));
    }

    @Override
    public final View createView(Context context) {
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(j6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(j6.f20792k7), mode));
        g3 g3Var = new g3(mutate, mutate2, 4);
        g3Var.f29168x = AndroidUtilities.dp(2.0f);
        this.d = g3Var;
        this.fragmentView = super.createView(context);
        this.f32849a.o1();
        this.actionBar.setAdaptiveBackground(this.f32849a);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x51 x51Var;
        if (i10 == NotificationCenter.webBrowserSettingsUpdate && (x51Var = this.f32849a) != null) {
            x51Var.Y2.N(true);
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
        x51 x51Var = this.f32849a;
        x51Var.setPadding(0, x51Var.getPaddingTop(), 0, i13);
        this.f32849a.setClipToPadding(false);
    }
}
