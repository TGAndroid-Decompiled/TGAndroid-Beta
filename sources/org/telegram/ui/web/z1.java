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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.l6;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.y70;
import org.telegram.ui.bt;
import org.telegram.ui.u6;
import w7.y5;
public final class z1 extends m61 implements NotificationCenter.NotificationCenterDelegate {
    public t3 d;
    public final Utilities.Callback e;
    public long f39297f;
    public long h;
    public long f39298n;

    public z1(org.telegram.ui.s sVar) {
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
        v51Var.f29049l = string;
        v51Var.K(isWebBrowserInAppEnabled);
        arrayList.add(v51Var);
        hg.c.n(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!isWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            v51 i10 = v51.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            i10.K(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(i10);
            hg.c.n(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(v51.t(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            t3 t3Var = this.d;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            v51 v51Var2 = new v51(3);
            v51Var2.d = 16;
            v51Var2.G = t3Var;
            v51Var2.f29049l = string2;
            v51Var2.f29054q = true;
            arrayList.add(v51Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str2 = webDomainException.domain;
                String str3 = webDomainException.title;
                long j3 = webDomainException.favicon;
                int i11 = x1.f39272a;
                v51 J = v51.J(x1.class);
                J.f29049l = str2;
                J.f29051n = str3;
                J.B = j3;
                arrayList.add(J);
            }
            arrayList.add(v51.B(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (!webBrowserExceptionsList.isEmpty()) {
                arrayList.size();
                v51 e = v51.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
                e.f29055r = true;
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
        long j11 = this.f39297f;
        if (j11 > 0) {
            str4 = AndroidUtilities.formatFileSize(j11);
        }
        arrayList.add(v51.d(2, i13, string4, str4));
        hg.c.n(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.f39298n > 0) {
            arrayList.size();
            arrayList.add(v51.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(v51.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.f39298n, ',')));
            arrayList.add(v51.B(null));
        }
        arrayList.add(v51.t(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        t3 t3Var2 = this.d;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        v51 v51Var3 = new v51(3);
        v51Var3.d = 15;
        v51Var3.G = t3Var2;
        v51Var3.f29049l = string5;
        v51Var3.f29054q = true;
        arrayList.add(v51Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str5 = webDomainException2.domain;
            String str6 = webDomainException2.title;
            long j12 = webDomainException2.favicon;
            int i14 = x1.f39272a;
            v51 J2 = v51.J(x1.class);
            J2.f29049l = str5;
            J2.f29051n = str6;
            J2.B = j12;
            arrayList.add(J2);
        }
        arrayList.add(v51.B(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            v51 e7 = v51.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e7.f29055r = true;
            arrayList.add(e7);
            arrayList.add(v51.B(null));
        }
        arrayList.size();
        arrayList.add(v51.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), n1.a().f39155a));
        hg.c.n(R.string.BrowserSettingsSearchEngineInfo, arrayList);
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
            ((w8) view).setChecked(SharedConfig.adaptableColorInBrowser);
        } else if (i13 == 13) {
            SharedConfig.toggleLocalInstantView();
            ((w8) view).setChecked(SharedConfig.onlyLocalInstantView);
        } else if (i13 == 17) {
            boolean z11 = !getMessagesController().isWebBrowserUseCustomTabs();
            getMessagesController().toggleWebBrowserUseCustomTabs(z11);
            ((w8) view).setChecked(z11);
            this.f26372a.Y2.N(true);
        } else {
            View view2 = null;
            if (i13 == 1) {
                getMessagesController().toggleWebBrowserInAppEnabled();
                boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
                w8 w8Var = (w8) view;
                w8Var.setChecked(isWebBrowserInAppEnabled);
                if (isWebBrowserInAppEnabled) {
                    i12 = h6.f19096f6;
                } else {
                    i12 = h6.f19079e6;
                }
                w8Var.b(h6.w0(null, i12, false), isWebBrowserInAppEnabled);
                this.f26372a.Y2.N(true);
            } else if (i13 == 10) {
                getMessagesController().toggleWebBrowserUseCustomTabs(true);
                this.f26372a.Y2.N(true);
            } else if (i13 == 11) {
                getMessagesController().toggleWebBrowserUseCustomTabs(false);
                this.f26372a.Y2.N(true);
            } else {
                String str = "";
                if (i13 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
                    a2Var.R = string;
                    int i14 = R.string.BrowserSettingsCacheClearText;
                    if (this.f39297f != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.f39297f) + ")";
                    }
                    a2Var.T = LocaleController.formatString(i14, str);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) {
                        public final z1 f39267b;

                        {
                            this.f39267b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i15) {
                            switch (r2) {
                                case 0:
                                    z1 z1Var = this.f39267b;
                                    z1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(z1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            z1.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            z1.Y(file2, null);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    n2 b10 = n2.b();
                                    HashMap hashMap = b10.f39158a;
                                    if (hashMap == null) {
                                        b10.f39160c = false;
                                        b10.f39159b = true;
                                        b10.f39158a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    z1Var.a0();
                                    return;
                                case 1:
                                    z1 z1Var2 = this.f39267b;
                                    z1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            z1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    z1Var2.a0();
                                    return;
                                case 2:
                                    z1 z1Var3 = this.f39267b;
                                    try {
                                        d1.f39048c.clear();
                                        d1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    z1Var3.f39298n = 0L;
                                    z1Var3.f26372a.Y2.N(true);
                                    return;
                                default:
                                    z1 z1Var4 = this.f39267b;
                                    z1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    z1Var4.f26372a.Y2.N(true);
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
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f18662a;
                    a2Var2.R = string2;
                    int i15 = R.string.BrowserSettingsCookiesClearText;
                    if (this.h != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
                    }
                    a2Var2.T = LocaleController.formatString(i15, str);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) {
                        public final z1 f39267b;

                        {
                            this.f39267b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.a2 a2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    z1 z1Var = this.f39267b;
                                    z1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(z1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            z1.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            z1.Y(file2, null);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    n2 b10 = n2.b();
                                    HashMap hashMap = b10.f39158a;
                                    if (hashMap == null) {
                                        b10.f39160c = false;
                                        b10.f39159b = true;
                                        b10.f39158a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    z1Var.a0();
                                    return;
                                case 1:
                                    z1 z1Var2 = this.f39267b;
                                    z1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            z1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    z1Var2.a0();
                                    return;
                                case 2:
                                    z1 z1Var3 = this.f39267b;
                                    try {
                                        d1.f39048c.clear();
                                        d1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    z1Var3.f39298n = 0L;
                                    z1Var3.f26372a.Y2.N(true);
                                    return;
                                default:
                                    z1 z1Var4 = this.f39267b;
                                    z1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    z1Var4.f26372a.Y2.N(true);
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
                    long j3 = Long.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj = a2.get(i16);
                        i16++;
                        j3 = Math.min(j3, ((c1) obj).f39041b);
                    }
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string3 = LocaleController.getString(R.string.BrowserSettingsHistoryClear);
                    org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder3.f18662a;
                    a2Var3.R = string3;
                    a2Var3.T = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(j3 / 1000));
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) {
                        public final z1 f39267b;

                        {
                            this.f39267b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.a2 a2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    z1 z1Var = this.f39267b;
                                    z1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(z1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            z1.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            z1.Y(file2, null);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    n2 b10 = n2.b();
                                    HashMap hashMap = b10.f39158a;
                                    if (hashMap == null) {
                                        b10.f39160c = false;
                                        b10.f39159b = true;
                                        b10.f39158a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    z1Var.a0();
                                    return;
                                case 1:
                                    z1 z1Var2 = this.f39267b;
                                    z1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            z1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    z1Var2.a0();
                                    return;
                                case 2:
                                    z1 z1Var3 = this.f39267b;
                                    try {
                                        d1.f39048c.clear();
                                        d1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    z1Var3.f39298n = 0L;
                                    z1Var3.f26372a.Y2.N(true);
                                    return;
                                default:
                                    z1 z1Var4 = this.f39267b;
                                    z1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    z1Var4.f26372a.Y2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder3.d(-1);
                    alertDialog$Builder3.o();
                } else if (i13 == 9) {
                    g1[] g1VarArr = {null};
                    org.telegram.ui.ActionBar.m2 g1Var = new g1(null, new bt(20, this, g1VarArr));
                    g1VarArr[0] = g1Var;
                    presentFragment(g1Var);
                } else if (i13 == 5) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
                    org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder4.f18662a;
                    a2Var4.R = string4;
                    a2Var4.T = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                        public final z1 f39267b;

                        {
                            this.f39267b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.a2 a2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    z1 z1Var = this.f39267b;
                                    z1Var.getClass();
                                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(z1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            z1.Y(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            z1.Y(file2, null);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    n2 b10 = n2.b();
                                    HashMap hashMap = b10.f39158a;
                                    if (hashMap == null) {
                                        b10.f39160c = false;
                                        b10.f39159b = true;
                                        b10.f39158a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    z1Var.a0();
                                    return;
                                case 1:
                                    z1 z1Var2 = this.f39267b;
                                    z1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            z1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    z1Var2.a0();
                                    return;
                                case 2:
                                    z1 z1Var3 = this.f39267b;
                                    try {
                                        d1.f39048c.clear();
                                        d1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    z1Var3.f39298n = 0L;
                                    z1Var3.f26372a.Y2.N(true);
                                    return;
                                default:
                                    z1 z1Var4 = this.f39267b;
                                    z1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    z1Var4.f26372a.Y2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder4.d(-1);
                    alertDialog$Builder4.o();
                } else if (v51Var.G(x1.class)) {
                    y1 y1Var = (y1) view;
                    String str2 = y1Var.e;
                    y70 F = y70.F((ViewGroup) this.fragmentView, null, y1Var);
                    F.f30555s = 40;
                    F.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new o1(2, this, str2), false);
                    F.Z();
                } else {
                    int i17 = v51Var.d;
                    if (i17 == 6) {
                        if (getParentActivity() != null) {
                            AtomicReference atomicReference = new AtomicReference();
                            LinearLayout linearLayout = new LinearLayout(getParentActivity());
                            linearLayout.setOrientation(1);
                            ArrayList b10 = n1.b();
                            int size2 = b10.size();
                            CharSequence[] charSequenceArr = new CharSequence[size2];
                            for (int i18 = 0; i18 < size2; i18++) {
                                charSequenceArr[i18] = ((n1) b10.get(i18)).f39155a;
                                l6 l6Var = new l6(getParentActivity(), null);
                                l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                                l6Var.a(h6.w0(null, h6.f19115g7, false), h6.w0(null, h6.E5, false));
                                CharSequence charSequence = charSequenceArr[i18];
                                if (i18 == SharedConfig.searchEngineType) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                l6Var.b(charSequence, z10);
                                l6Var.setBackground(h6.f0(h6.w0(null, h6.f19149i6, false), 2, -1));
                                linearLayout.addView(l6Var);
                                l6Var.setOnClickListener(new ua(i18, view, atomicReference));
                            }
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                            String string5 = LocaleController.getString(R.string.SearchEngine);
                            org.telegram.ui.ActionBar.a2 a2Var5 = alertDialog$Builder5.f18662a;
                            a2Var5.R = string5;
                            alertDialog$Builder5.n(linearLayout);
                            alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                            atomicReference.set(a2Var5);
                            showDialog(a2Var5);
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
                        Pattern pattern = e5.f23837a;
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
                        org.telegram.ui.ActionBar.a2 a2Var6 = alertDialog$Builder6.f18662a;
                        a2Var6.R = string6;
                        if (isWebBrowserInAppEnabled2) {
                            i11 = R.string.BrowserSettingsAddText;
                        } else {
                            i11 = R.string.BrowserSettingsAddTextExternal;
                        }
                        a2Var6.T = LocaleController.getString(i11);
                        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                        editTextBoldCursor.setTextSize(1, 16.0f);
                        int i19 = h6.f19166j5;
                        editTextBoldCursor.setTextColor(h6.v0(i19, resourceProvider));
                        editTextBoldCursor.setHintTextColor(h6.v0(h6.Xh, resourceProvider));
                        editTextBoldCursor.setHint(LocaleController.getString(R.string.BrowserSettingsAddHint));
                        editTextBoldCursor.setInputType(17);
                        editTextBoldCursor.setImeOptions(6);
                        editTextBoldCursor.setSingleLine(true);
                        editTextBoldCursor.setFocusable(true);
                        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
                        editTextBoldCursor.setCursorWidth(1.5f);
                        editTextBoldCursor.setCursorColor(h6.v0(h6.q6, resourceProvider));
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                        gradientDrawable.setColor(h6.l1(0.06f, h6.v0(i19, resourceProvider)));
                        editTextBoldCursor.setBackground(gradientDrawable);
                        l5 l5Var = new l5(editTextBoldCursor, i3Var, a2VarArr, view3, 17);
                        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.e1(l5Var, 0));
                        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                        linearLayout2.setOrientation(1);
                        linearLayout2.addView(editTextBoldCursor, y5.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                        alertDialog$Builder6.c();
                        alertDialog$Builder6.n(linearLayout2);
                        a2Var6.f18671a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                        alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.s(l5Var, 2));
                        alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new u6(22));
                        a2VarArr[0] = a2Var6;
                        a2Var6.f18684h0 = false;
                        a2Var6.setOnDismissListener(new org.telegram.ui.Components.b1(editTextBoldCursor, 1));
                        a2VarArr[0].setOnShowListener(new org.telegram.ui.Components.f1(0, editTextBoldCursor));
                        a2VarArr[0].show();
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
        ArrayList a2 = d1.a(new ii.q1(this, 5));
        if (a2 != null) {
            this.f39298n = a2.size();
            l61 l61Var = this.f26372a;
            if (l61Var != null && (j61Var = l61Var.Y2) != null && l61Var.G) {
                j61Var.N(true);
            }
        }
        Utilities.globalQueue.postRunnable(new q0(this, 5));
    }

    @Override
    public final View createView(Context context) {
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(h6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(h6.f19188k7), mode));
        t3 t3Var = new t3(mutate, mutate2, 4);
        t3Var.f27741x = AndroidUtilities.dp(2.0f);
        this.d = t3Var;
        this.fragmentView = super.createView(context);
        this.f26372a.p1();
        this.actionBar.setAdaptiveBackground(this.f26372a);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l61 l61Var;
        if (i10 == NotificationCenter.webBrowserSettingsUpdate && (l61Var = this.f26372a) != null) {
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
        l61 l61Var = this.f26372a;
        l61Var.setPadding(0, l61Var.getPaddingTop(), 0, i13);
        this.f26372a.setClipToPadding(false);
    }
}
