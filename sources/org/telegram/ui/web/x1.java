package org.telegram.ui.web;

import ai.ga;
import ai.x8;
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
import ci.p2;
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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Wallet.t3;
import org.telegram.ui.tr;
import w7.z5;
public final class x1 extends v61 implements NotificationCenter.NotificationCenterDelegate {
    public p2 d;
    public final Utilities.Callback e;
    public long f42807f;
    public long h;
    public long f42808n;

    public x1(org.telegram.ui.r rVar) {
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
    public final void U(ArrayList arrayList, s61 s61Var) {
        String str;
        boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        f61 f61Var = new f61(9);
        f61Var.d = 1;
        f61Var.f26140l = string;
        f61Var.K(isWebBrowserInAppEnabled);
        arrayList.add(f61Var);
        i0.a.A(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!isWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            f61 i10 = f61.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            i10.K(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(i10);
            i0.a.A(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(f61.t(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            p2 p2Var = this.d;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            f61 f61Var2 = new f61(3);
            f61Var2.d = 16;
            f61Var2.G = p2Var;
            f61Var2.f26140l = string2;
            f61Var2.f26145q = true;
            arrayList.add(f61Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str2 = webDomainException.domain;
                String str3 = webDomainException.title;
                long j10 = webDomainException.favicon;
                int i11 = v1.f42785a;
                f61 J = f61.J(v1.class);
                J.f26140l = str2;
                J.f26142n = str3;
                J.B = j10;
                arrayList.add(J);
            }
            arrayList.add(f61.B(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (!webBrowserExceptionsList.isEmpty()) {
                arrayList.size();
                f61 e = f61.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
                e.f26146r = true;
                arrayList.add(e);
                arrayList.add(f61.B(null));
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
        arrayList.add(f61.d(3, i12, string3, str));
        arrayList.size();
        int i13 = R.drawable.menu_clear_cache;
        String string4 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j12 = this.f42807f;
        if (j12 > 0) {
            str4 = AndroidUtilities.formatFileSize(j12);
        }
        arrayList.add(f61.d(2, i13, string4, str4));
        i0.a.A(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.f42808n > 0) {
            arrayList.size();
            arrayList.add(f61.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(f61.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.f42808n, ',')));
            arrayList.add(f61.B(null));
        }
        arrayList.add(f61.t(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        p2 p2Var2 = this.d;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        f61 f61Var3 = new f61(3);
        f61Var3.d = 15;
        f61Var3.G = p2Var2;
        f61Var3.f26140l = string5;
        f61Var3.f26145q = true;
        arrayList.add(f61Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str5 = webDomainException2.domain;
            String str6 = webDomainException2.title;
            long j13 = webDomainException2.favicon;
            int i14 = v1.f42785a;
            f61 J2 = f61.J(v1.class);
            J2.f26140l = str5;
            J2.f26142n = str6;
            J2.B = j13;
            arrayList.add(J2);
        }
        arrayList.add(f61.B(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            f61 e7 = f61.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e7.f26146r = true;
            arrayList.add(e7);
            arrayList.add(f61.B(null));
        }
        arrayList.size();
        arrayList.add(f61.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), m1.a().f42675a));
        i0.a.A(R.string.BrowserSettingsSearchEngineInfo, arrayList);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            f61 i15 = f61.i(12, "adaptable colors");
            i15.K(SharedConfig.adaptableColorInBrowser);
            arrayList.add(i15);
            f61 i16 = f61.i(13, "only local IV");
            i16.K(SharedConfig.onlyLocalInstantView);
            arrayList.add(i16);
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BrowserSettingsTitle);
    }

    @Override
    public final void W(f61 f61Var, View view) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13 = f61Var.d;
        if (i13 == 12) {
            SharedConfig.toggleBrowserAdaptableColors();
            ((v8) view).setChecked(SharedConfig.adaptableColorInBrowser);
        } else if (i13 == 13) {
            SharedConfig.toggleLocalInstantView();
            ((v8) view).setChecked(SharedConfig.onlyLocalInstantView);
        } else if (i13 == 17) {
            boolean z11 = !getMessagesController().isWebBrowserUseCustomTabs();
            getMessagesController().toggleWebBrowserUseCustomTabs(z11);
            ((v8) view).setChecked(z11);
            this.f31190a.W2.N(true);
        } else {
            View view2 = null;
            if (i13 == 1) {
                getMessagesController().toggleWebBrowserInAppEnabled();
                boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
                v8 v8Var = (v8) view;
                v8Var.setChecked(isWebBrowserInAppEnabled);
                if (isWebBrowserInAppEnabled) {
                    i12 = h6.f21022f6;
                } else {
                    i12 = h6.f21003e6;
                }
                v8Var.b(h6.x0(null, i12, false), isWebBrowserInAppEnabled);
                this.f31190a.W2.N(true);
            } else if (i13 == 10) {
                getMessagesController().toggleWebBrowserUseCustomTabs(true);
                this.f31190a.W2.N(true);
            } else if (i13 == 11) {
                getMessagesController().toggleWebBrowserUseCustomTabs(false);
                this.f31190a.W2.N(true);
            } else {
                String str = "";
                if (i13 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                    b2Var.R = string;
                    int i14 = R.string.BrowserSettingsCacheClearText;
                    if (this.f42807f != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.f42807f) + ")";
                    }
                    b2Var.T = LocaleController.formatString(i14, str);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                        public final x1 f42779b;

                        {
                            this.f42779b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i15) {
                            switch (r2) {
                                case 0:
                                    x1 x1Var = this.f42779b;
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
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            x1.Y(file2, null);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    m2 b10 = m2.b();
                                    HashMap hashMap = b10.f42678a;
                                    if (hashMap == null) {
                                        b10.f42680c = false;
                                        b10.f42679b = true;
                                        b10.f42678a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    x1Var.a0();
                                    return;
                                case 1:
                                    x1 x1Var2 = this.f42779b;
                                    x1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            x1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    x1Var2.a0();
                                    return;
                                case 2:
                                    x1 x1Var3 = this.f42779b;
                                    try {
                                        c1.f42567c.clear();
                                        c1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    x1Var3.f42808n = 0L;
                                    x1Var3.f31190a.W2.N(true);
                                    return;
                                default:
                                    x1 x1Var4 = this.f42779b;
                                    x1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    x1Var4.f31190a.W2.N(true);
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
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20601a;
                    b2Var2.R = string2;
                    int i15 = R.string.BrowserSettingsCookiesClearText;
                    if (this.h != 0) {
                        str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
                    }
                    b2Var2.T = LocaleController.formatString(i15, str);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                        public final x1 f42779b;

                        {
                            this.f42779b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    x1 x1Var = this.f42779b;
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
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            x1.Y(file2, null);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    m2 b10 = m2.b();
                                    HashMap hashMap = b10.f42678a;
                                    if (hashMap == null) {
                                        b10.f42680c = false;
                                        b10.f42679b = true;
                                        b10.f42678a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    x1Var.a0();
                                    return;
                                case 1:
                                    x1 x1Var2 = this.f42779b;
                                    x1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            x1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    x1Var2.a0();
                                    return;
                                case 2:
                                    x1 x1Var3 = this.f42779b;
                                    try {
                                        c1.f42567c.clear();
                                        c1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    x1Var3.f42808n = 0L;
                                    x1Var3.f31190a.W2.N(true);
                                    return;
                                default:
                                    x1 x1Var4 = this.f42779b;
                                    x1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    x1Var4.f31190a.W2.N(true);
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
                        j10 = Math.min(j10, ((b1) obj).f42559b);
                    }
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string3 = LocaleController.getString(R.string.BrowserSettingsHistoryClear);
                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20601a;
                    b2Var3.R = string3;
                    b2Var3.T = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(j10 / 1000));
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                        public final x1 f42779b;

                        {
                            this.f42779b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    x1 x1Var = this.f42779b;
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
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            x1.Y(file2, null);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    m2 b10 = m2.b();
                                    HashMap hashMap = b10.f42678a;
                                    if (hashMap == null) {
                                        b10.f42680c = false;
                                        b10.f42679b = true;
                                        b10.f42678a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    x1Var.a0();
                                    return;
                                case 1:
                                    x1 x1Var2 = this.f42779b;
                                    x1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            x1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    x1Var2.a0();
                                    return;
                                case 2:
                                    x1 x1Var3 = this.f42779b;
                                    try {
                                        c1.f42567c.clear();
                                        c1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    x1Var3.f42808n = 0L;
                                    x1Var3.f31190a.W2.N(true);
                                    return;
                                default:
                                    x1 x1Var4 = this.f42779b;
                                    x1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    x1Var4.f31190a.W2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder3.d(-1);
                    alertDialog$Builder3.o();
                } else if (i13 == 9) {
                    f1[] f1VarArr = {null};
                    n2 f1Var = new f1(null, new org.telegram.ui.Wallet.x(13, this, f1VarArr));
                    f1VarArr[0] = f1Var;
                    presentFragment(f1Var);
                } else if (i13 == 5) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                    String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f20601a;
                    b2Var4.R = string4;
                    b2Var4.T = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) {
                        public final x1 f42779b;

                        {
                            this.f42779b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i152) {
                            switch (r2) {
                                case 0:
                                    x1 x1Var = this.f42779b;
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
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            x1.Y(file2, null);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    m2 b10 = m2.b();
                                    HashMap hashMap = b10.f42678a;
                                    if (hashMap == null) {
                                        b10.f42680c = false;
                                        b10.f42679b = true;
                                        b10.f42678a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    x1Var.a0();
                                    return;
                                case 1:
                                    x1 x1Var2 = this.f42779b;
                                    x1Var2.getClass();
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            x1.Y(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    x1Var2.a0();
                                    return;
                                case 2:
                                    x1 x1Var3 = this.f42779b;
                                    try {
                                        c1.f42567c.clear();
                                        c1.d.clear();
                                        File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    x1Var3.f42808n = 0L;
                                    x1Var3.f31190a.W2.N(true);
                                    return;
                                default:
                                    x1 x1Var4 = this.f42779b;
                                    x1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                    x1Var4.f31190a.W2.N(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder4.d(-1);
                    alertDialog$Builder4.o();
                } else if (f61Var.G(v1.class)) {
                    w1 w1Var = (w1) view;
                    String str2 = w1Var.e;
                    i80 F = i80.F((ViewGroup) this.fragmentView, null, w1Var);
                    F.f27134s = 40;
                    F.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new t3(27, this, str2), false);
                    F.Z();
                } else {
                    int i17 = f61Var.d;
                    if (i17 == 6) {
                        if (getParentActivity() != null) {
                            AtomicReference atomicReference = new AtomicReference();
                            LinearLayout linearLayout = new LinearLayout(getParentActivity());
                            linearLayout.setOrientation(1);
                            ArrayList b10 = m1.b();
                            int size2 = b10.size();
                            CharSequence[] charSequenceArr = new CharSequence[size2];
                            for (int i18 = 0; i18 < size2; i18++) {
                                charSequenceArr[i18] = ((m1) b10.get(i18)).f42675a;
                                k6 k6Var = new k6(getParentActivity(), null);
                                k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                                k6Var.a(h6.x0(null, h6.f21040g7, false), h6.x0(null, h6.E5, false));
                                CharSequence charSequence = charSequenceArr[i18];
                                if (i18 == SharedConfig.searchEngineType) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                k6Var.b(charSequence, z10);
                                k6Var.setBackground(h6.g0(h6.x0(null, h6.f21075i6, false), 2, -1));
                                linearLayout.addView(k6Var);
                                k6Var.setOnClickListener(new ga(i18, view, atomicReference));
                            }
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                            String string5 = LocaleController.getString(R.string.SearchEngine);
                            org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder5.f20601a;
                            b2Var5.R = string5;
                            alertDialog$Builder5.n(linearLayout);
                            alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                            atomicReference.set(b2Var5);
                            showDialog(b2Var5);
                        }
                    } else if (i17 == 15 || i17 == 16) {
                        boolean isWebBrowserInAppEnabled2 = getMessagesController().isWebBrowserInAppEnabled();
                        if (getMessagesController().isWebBrowserExceptionsLimitReached(isWebBrowserInAppEnabled2)) {
                            f5.t0(this, LocaleController.getString(R.string.WebBrowserExceptionsLimitTitle), LocaleController.getString(R.string.WebBrowserExceptionsLimitMessage), null);
                            return;
                        }
                        Activity parentActivity = getParentActivity();
                        d6 resourceProvider = getResourceProvider();
                        x8 x8Var = new x8(10, this, isWebBrowserInAppEnabled2);
                        Pattern pattern = f5.f26080a;
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
                        org.telegram.ui.ActionBar.b2 b2Var6 = alertDialog$Builder6.f20601a;
                        b2Var6.R = string6;
                        if (isWebBrowserInAppEnabled2) {
                            i11 = R.string.BrowserSettingsAddText;
                        } else {
                            i11 = R.string.BrowserSettingsAddTextExternal;
                        }
                        b2Var6.T = LocaleController.getString(i11);
                        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                        editTextBoldCursor.setTextSize(1, 16.0f);
                        int i19 = h6.f21092j5;
                        editTextBoldCursor.setTextColor(h6.w0(i19, resourceProvider));
                        editTextBoldCursor.setHintTextColor(h6.w0(h6.Xh, resourceProvider));
                        editTextBoldCursor.setHint(LocaleController.getString(R.string.BrowserSettingsAddHint));
                        editTextBoldCursor.setInputType(17);
                        editTextBoldCursor.setImeOptions(6);
                        editTextBoldCursor.setSingleLine(true);
                        editTextBoldCursor.setFocusable(true);
                        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
                        editTextBoldCursor.setCursorWidth(1.5f);
                        editTextBoldCursor.setCursorColor(h6.w0(h6.q6, resourceProvider));
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                        gradientDrawable.setColor(h6.m1(0.06f, h6.w0(i19, resourceProvider)));
                        editTextBoldCursor.setBackground(gradientDrawable);
                        org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(editTextBoldCursor, x8Var, b2VarArr, view3, 20);
                        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.e1(iVar, 0));
                        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                        linearLayout2.setOrientation(1);
                        linearLayout2.addView(editTextBoldCursor, z5.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                        alertDialog$Builder6.c();
                        alertDialog$Builder6.n(linearLayout2);
                        b2Var6.f20649a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                        alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.s(iVar, 2));
                        alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new tr(9));
                        b2VarArr[0] = b2Var6;
                        b2Var6.f20662h0 = false;
                        b2Var6.setOnDismissListener(new org.telegram.ui.Components.b1(editTextBoldCursor, 1));
                        b2VarArr[0].setOnShowListener(new org.telegram.ui.Components.f1(0, editTextBoldCursor));
                        b2VarArr[0].show();
                    }
                }
            }
        }
    }

    @Override
    public final boolean X(f61 f61Var, View view) {
        return false;
    }

    public final void a0() {
        s61 s61Var;
        ArrayList a2 = c1.a(new ig.l0(this, 11));
        if (a2 != null) {
            this.f42808n = a2.size();
            u61 u61Var = this.f31190a;
            if (u61Var != null && (s61Var = u61Var.W2) != null && u61Var.G) {
                s61Var.N(true);
            }
        }
        Utilities.globalQueue.postRunnable(new ki.u(this, 29));
    }

    @Override
    public final View createView(Context context) {
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(h6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(h6.f21114k7), mode));
        p2 p2Var = new p2(mutate, mutate2, 4);
        p2Var.f33000x = AndroidUtilities.dp(2.0f);
        this.d = p2Var;
        this.fragmentView = super.createView(context);
        this.f31190a.p1();
        this.actionBar.setAdaptiveBackground(this.f31190a);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u61 u61Var;
        if (i10 == NotificationCenter.webBrowserSettingsUpdate && (u61Var = this.f31190a) != null) {
            u61Var.W2.N(true);
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
        u61 u61Var = this.f31190a;
        u61Var.setPadding(0, u61Var.getPaddingTop(), 0, i13);
        this.f31190a.setClipToPadding(false);
    }
}
