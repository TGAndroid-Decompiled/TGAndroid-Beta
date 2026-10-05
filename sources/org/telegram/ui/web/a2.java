package org.telegram.ui.web;

import ai.i3;
import ai.t3;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.Cells.l6;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ft;
import org.telegram.ui.m4;
import w7.z5;
public final class a2 extends z61 implements NotificationCenter.NotificationCenterDelegate {
    public t3 f42116e;
    public final Utilities.Callback f42117f;
    public long h;
    public long f42118n;
    public long f42119r;

    public a2(org.telegram.ui.s sVar) {
        this.f42117f = sVar;
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
        long j3 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j3 += Y(file2, bool);
                }
                return j3;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override
    public final void S(ArrayList arrayList, w61 w61Var) {
        String str;
        boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        h61 h61Var = new h61(9);
        h61Var.d = 1;
        h61Var.f27093l = string;
        h61Var.L(isWebBrowserInAppEnabled);
        arrayList.add(h61Var);
        hg.c.n(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!isWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            h61 i10 = h61.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            i10.L(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(i10);
            hg.c.n(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(h61.u(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            t3 t3Var = this.f42116e;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            h61 h61Var2 = new h61(3);
            h61Var2.d = 16;
            h61Var2.G = t3Var;
            h61Var2.f27093l = string2;
            h61Var2.f27098q = true;
            arrayList.add(h61Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str2 = webDomainException.domain;
                String str3 = webDomainException.title;
                long j3 = webDomainException.favicon;
                int i11 = y1.f42439a;
                h61 K = h61.K(y1.class);
                K.f27093l = str2;
                K.f27095n = str3;
                K.B = j3;
                arrayList.add(K);
            }
            arrayList.add(h61.C(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (!webBrowserExceptionsList.isEmpty()) {
                arrayList.size();
                h61 e7 = h61.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
                e7.f27099r = true;
                arrayList.add(e7);
                arrayList.add(h61.C(null));
                return;
            }
            return;
        }
        arrayList.size();
        int i12 = R.drawable.menu_clear_cookies;
        String string3 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
        long j10 = this.f42118n;
        String str4 = "";
        if (j10 <= 0) {
            str = "";
        } else {
            str = AndroidUtilities.formatFileSize(j10);
        }
        arrayList.add(h61.d(3, i12, string3, str));
        arrayList.size();
        int i13 = R.drawable.menu_clear_cache;
        String string4 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j11 = this.h;
        if (j11 > 0) {
            str4 = AndroidUtilities.formatFileSize(j11);
        }
        arrayList.add(h61.d(2, i13, string4, str4));
        hg.c.n(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.f42119r > 0) {
            arrayList.size();
            arrayList.add(h61.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(h61.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.f42119r, ',')));
            arrayList.add(h61.C(null));
        }
        arrayList.add(h61.u(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        t3 t3Var2 = this.f42116e;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        h61 h61Var3 = new h61(3);
        h61Var3.d = 15;
        h61Var3.G = t3Var2;
        h61Var3.f27093l = string5;
        h61Var3.f27098q = true;
        arrayList.add(h61Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str5 = webDomainException2.domain;
            String str6 = webDomainException2.title;
            long j12 = webDomainException2.favicon;
            int i14 = y1.f42439a;
            h61 K2 = h61.K(y1.class);
            K2.f27093l = str5;
            K2.f27095n = str6;
            K2.B = j12;
            arrayList.add(K2);
        }
        arrayList.add(h61.C(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            h61 e10 = h61.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e10.f27099r = true;
            arrayList.add(e10);
            arrayList.add(h61.C(null));
        }
        arrayList.size();
        arrayList.add(h61.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), o1.a().f42318a));
        hg.c.n(R.string.BrowserSettingsSearchEngineInfo, arrayList);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            h61 i15 = h61.i(12, "adaptable colors");
            i15.L(SharedConfig.adaptableColorInBrowser);
            arrayList.add(i15);
            h61 i16 = h61.i(13, "only local IV");
            i16.L(SharedConfig.onlyLocalInstantView);
            arrayList.add(i16);
        }
    }

    @Override
    public final CharSequence T() {
        return LocaleController.getString(R.string.BrowserSettingsTitle);
    }

    @Override
    public final void U(h61 h61Var, View view) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13 = h61Var.d;
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
            this.f33438a.f26034f3.N(true);
        } else {
            View view2 = null;
            if (i13 == 1) {
                getMessagesController().toggleWebBrowserInAppEnabled();
                boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
                w8 w8Var = (w8) view;
                w8Var.setChecked(isWebBrowserInAppEnabled);
                if (isWebBrowserInAppEnabled) {
                    i12 = i6.f20864f6;
                } else {
                    i12 = i6.f20847e6;
                }
                w8Var.b(i6.w0(null, i12, false), isWebBrowserInAppEnabled);
                this.f33438a.f26034f3.N(true);
            } else if (i13 == 10) {
                getMessagesController().toggleWebBrowserUseCustomTabs(true);
                this.f33438a.f26034f3.N(true);
            } else if (i13 == 11) {
                getMessagesController().toggleWebBrowserUseCustomTabs(false);
                this.f33438a.f26034f3.N(true);
            } else {
                String str = "";
                if (i13 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                    b2Var.R = string;
                    int i14 = R.string.BrowserSettingsCacheClearText;
                    if (this.h != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
                    }
                    b2Var.T = LocaleController.formatString(i14, str);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                        public final a2 f42426b;

                        {
                            this.f42426b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i15) {
                            switch (r2) {
                                case 0:
                                    a2 a2Var = this.f42426b;
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
                                            a2.X(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            a2.X(file2, null);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    o2 b10 = o2.b();
                                    HashMap hashMap = b10.f42322a;
                                    if (hashMap == null) {
                                        b10.f42324c = false;
                                        b10.f42323b = true;
                                        b10.f42322a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    a2Var.Z();
                                    return;
                                case 1:
                                    a2 a2Var2 = this.f42426b;
                                    a2Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            a2.X(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    a2Var2.Z();
                                    return;
                                case 2:
                                    a2 a2Var3 = this.f42426b;
                                    try {
                                        e1.f42194c.clear();
                                        e1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    a2Var3.f42119r = 0L;
                                    a2Var3.f33438a.f26034f3.N(true);
                                    return;
                                default:
                                    a2 a2Var4 = this.f42426b;
                                    a2Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    a2Var4.f33438a.f26034f3.N(true);
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
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20377a;
                    b2Var2.R = string2;
                    int i15 = R.string.BrowserSettingsCookiesClearText;
                    if (this.f42118n != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.f42118n) + ")";
                    }
                    b2Var2.T = LocaleController.formatString(i15, str);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                        public final a2 f42426b;

                        {
                            this.f42426b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    a2 a2Var = this.f42426b;
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
                                            a2.X(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            a2.X(file2, null);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    o2 b10 = o2.b();
                                    HashMap hashMap = b10.f42322a;
                                    if (hashMap == null) {
                                        b10.f42324c = false;
                                        b10.f42323b = true;
                                        b10.f42322a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    a2Var.Z();
                                    return;
                                case 1:
                                    a2 a2Var2 = this.f42426b;
                                    a2Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            a2.X(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    a2Var2.Z();
                                    return;
                                case 2:
                                    a2 a2Var3 = this.f42426b;
                                    try {
                                        e1.f42194c.clear();
                                        e1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    a2Var3.f42119r = 0L;
                                    a2Var3.f33438a.f26034f3.N(true);
                                    return;
                                default:
                                    a2 a2Var4 = this.f42426b;
                                    a2Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    a2Var4.f33438a.f26034f3.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder2.d(-1);
                    alertDialog$Builder2.o();
                } else if (i13 == 7) {
                    ArrayList a2 = e1.a(null);
                    int size = a2.size();
                    long j3 = Long.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj = a2.get(i16);
                        i16++;
                        j3 = Math.min(j3, ((d1) obj).f42184b);
                    }
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string3 = LocaleController.getString(R.string.BrowserSettingsHistoryClear);
                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20377a;
                    b2Var3.R = string3;
                    b2Var3.T = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(j3 / 1000));
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                        public final a2 f42426b;

                        {
                            this.f42426b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    a2 a2Var = this.f42426b;
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
                                            a2.X(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            a2.X(file2, null);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    o2 b10 = o2.b();
                                    HashMap hashMap = b10.f42322a;
                                    if (hashMap == null) {
                                        b10.f42324c = false;
                                        b10.f42323b = true;
                                        b10.f42322a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    a2Var.Z();
                                    return;
                                case 1:
                                    a2 a2Var2 = this.f42426b;
                                    a2Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            a2.X(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    a2Var2.Z();
                                    return;
                                case 2:
                                    a2 a2Var3 = this.f42426b;
                                    try {
                                        e1.f42194c.clear();
                                        e1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    a2Var3.f42119r = 0L;
                                    a2Var3.f33438a.f26034f3.N(true);
                                    return;
                                default:
                                    a2 a2Var4 = this.f42426b;
                                    a2Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    a2Var4.f33438a.f26034f3.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder3.d(-1);
                    alertDialog$Builder3.o();
                } else if (i13 == 9) {
                    h1[] h1VarArr = {null};
                    org.telegram.ui.ActionBar.n2 h1Var = new h1(null, new ft(20, this, h1VarArr));
                    h1VarArr[0] = h1Var;
                    presentFragment(h1Var);
                } else if (i13 == 5) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f20377a;
                    b2Var4.R = string4;
                    b2Var4.T = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) {
                        public final a2 f42426b;

                        {
                            this.f42426b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    a2 a2Var = this.f42426b;
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
                                            a2.X(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            a2.X(file2, null);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    o2 b10 = o2.b();
                                    HashMap hashMap = b10.f42322a;
                                    if (hashMap == null) {
                                        b10.f42324c = false;
                                        b10.f42323b = true;
                                        b10.f42322a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    a2Var.Z();
                                    return;
                                case 1:
                                    a2 a2Var2 = this.f42426b;
                                    a2Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            a2.X(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    a2Var2.Z();
                                    return;
                                case 2:
                                    a2 a2Var3 = this.f42426b;
                                    try {
                                        e1.f42194c.clear();
                                        e1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    a2Var3.f42119r = 0L;
                                    a2Var3.f33438a.f26034f3.N(true);
                                    return;
                                default:
                                    a2 a2Var4 = this.f42426b;
                                    a2Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    a2Var4.f33438a.f26034f3.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder4.d(-1);
                    alertDialog$Builder4.o();
                } else if (h61Var.H(y1.class)) {
                    z1 z1Var = (z1) view;
                    String str2 = z1Var.f42457e;
                    b80 F = b80.F((ViewGroup) this.fragmentView, null, z1Var);
                    F.f24885s = 40;
                    F.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new x1(0, this, str2), false);
                    F.Z();
                } else {
                    int i17 = h61Var.d;
                    if (i17 == 6) {
                        if (getParentActivity() != null) {
                            AtomicReference atomicReference = new AtomicReference();
                            LinearLayout linearLayout = new LinearLayout(getParentActivity());
                            linearLayout.setOrientation(1);
                            ArrayList b10 = o1.b();
                            int size2 = b10.size();
                            CharSequence[] charSequenceArr = new CharSequence[size2];
                            for (int i18 = 0; i18 < size2; i18++) {
                                charSequenceArr[i18] = ((o1) b10.get(i18)).f42318a;
                                l6 l6Var = new l6(getParentActivity(), null);
                                l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                                l6Var.a(i6.w0(null, i6.f20883g7, false), i6.w0(null, i6.E5, false));
                                CharSequence charSequence = charSequenceArr[i18];
                                if (i18 == SharedConfig.searchEngineType) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                l6Var.b(charSequence, z10);
                                l6Var.setBackground(i6.f0(i6.w0(null, i6.f20918i6, false), 2, -1));
                                linearLayout.addView(l6Var);
                                l6Var.setOnClickListener(new ua(i18, view, atomicReference));
                            }
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                            String string5 = LocaleController.getString(R.string.SearchEngine);
                            org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder5.f20377a;
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
                        d6 resourceProvider = getResourceProvider();
                        i3 i3Var = new i3(8, this, isWebBrowserInAppEnabled2);
                        Pattern pattern = e5.f25971a;
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
                        org.telegram.ui.ActionBar.b2 b2Var6 = alertDialog$Builder6.f20377a;
                        b2Var6.R = string6;
                        if (isWebBrowserInAppEnabled2) {
                            i11 = R.string.BrowserSettingsAddText;
                        } else {
                            i11 = R.string.BrowserSettingsAddTextExternal;
                        }
                        b2Var6.T = LocaleController.getString(i11);
                        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                        editTextBoldCursor.setTextSize(1, 16.0f);
                        int i19 = i6.f20935j5;
                        editTextBoldCursor.setTextColor(i6.v0(i19, resourceProvider));
                        editTextBoldCursor.setHintTextColor(i6.v0(i6.Xh, resourceProvider));
                        editTextBoldCursor.setHint(LocaleController.getString(R.string.BrowserSettingsAddHint));
                        editTextBoldCursor.setInputType(17);
                        editTextBoldCursor.setImeOptions(6);
                        editTextBoldCursor.setSingleLine(true);
                        editTextBoldCursor.setFocusable(true);
                        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
                        editTextBoldCursor.setCursorWidth(1.5f);
                        editTextBoldCursor.setCursorColor(i6.v0(i6.q6, resourceProvider));
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                        gradientDrawable.setColor(i6.l1(0.06f, i6.v0(i19, resourceProvider)));
                        editTextBoldCursor.setBackground(gradientDrawable);
                        m5 m5Var = new m5(editTextBoldCursor, i3Var, b2VarArr, view3, 16);
                        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.e1(m5Var, 0));
                        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                        linearLayout2.setOrientation(1);
                        linearLayout2.addView(editTextBoldCursor, z5.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                        alertDialog$Builder6.c();
                        alertDialog$Builder6.n(linearLayout2);
                        b2Var6.f20419a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                        alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.s(m5Var, 2));
                        alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new m4(24));
                        b2VarArr[0] = b2Var6;
                        b2Var6.f20433h0 = false;
                        b2Var6.setOnDismissListener(new org.telegram.ui.Components.b1(editTextBoldCursor, 1));
                        b2VarArr[0].setOnShowListener(new org.telegram.ui.Components.f1(0, editTextBoldCursor));
                        b2VarArr[0].show();
                    }
                }
            }
        }
    }

    @Override
    public final boolean W(h61 h61Var, View view) {
        return false;
    }

    public final void Z() {
        w61 w61Var;
        ArrayList a2 = e1.a(new ii.q1(this, 5));
        if (a2 != null) {
            this.f42119r = a2.size();
            y61 y61Var = this.f33438a;
            if (y61Var != null && (w61Var = y61Var.f26034f3) != null && y61Var.G) {
                w61Var.N(true);
            }
        }
        Utilities.globalQueue.postRunnable(new u0(this, 4));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(i6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i6.f20957k7), mode));
        t3 t3Var = new t3(mutate, mutate2, 4);
        t3Var.f30932x = AndroidUtilities.dp(2.0f);
        this.f42116e = t3Var;
        this.fragmentView = super.createView(context);
        this.f33438a.r1();
        this.f33438a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        y61 y61Var;
        if (i10 == NotificationCenter.webBrowserSettingsUpdate && (y61Var = this.f33438a) != null) {
            y61Var.f26034f3.N(true);
        }
    }

    @Override
    public final zl0 getListViewForSimpleGlass() {
        return this.f33438a;
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
}
