package org.telegram.ui.web;

import ai.ia;
import ai.y8;
import android.app.Activity;
import android.content.Context;
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
import ci.o2;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.l6;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Wallet.y3;
import org.telegram.ui.tr;
import w7.z5;
public final class y1 extends d71 implements NotificationCenter.NotificationCenterDelegate {
    public o2 d;
    public final Utilities.Callback e;
    public long f43327f;
    public long h;
    public long f43328n;
    public int f43329r;
    public int f43330s;

    public y1(org.telegram.ui.q qVar) {
        this.e = qVar;
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
    public final void U(ArrayList arrayList, a71 a71Var) {
        String str;
        boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        l61 l61Var = new l61(9);
        l61Var.d = 1;
        l61Var.f28227l = string;
        l61Var.K(isWebBrowserInAppEnabled);
        arrayList.add(l61Var);
        i2.o1.B(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!isWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            l61 i10 = l61.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            i10.K(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(i10);
            i2.o1.B(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(l61.t(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            o2 o2Var = this.d;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            l61 l61Var2 = new l61(3);
            l61Var2.d = 16;
            l61Var2.G = o2Var;
            l61Var2.f28227l = string2;
            l61Var2.f28232q = true;
            arrayList.add(l61Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str2 = webDomainException.domain;
                String str3 = webDomainException.title;
                long j10 = webDomainException.favicon;
                int i11 = w1.f43305a;
                l61 J = l61.J(w1.class);
                J.f28227l = str2;
                J.f28229n = str3;
                J.B = j10;
                arrayList.add(J);
            }
            arrayList.add(l61.B(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (!webBrowserExceptionsList.isEmpty()) {
                arrayList.size();
                l61 e = l61.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
                e.f28233r = true;
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
        long j12 = this.f43327f;
        if (j12 > 0) {
            str4 = AndroidUtilities.formatFileSize(j12);
        }
        arrayList.add(l61.d(2, i13, string4, str4));
        i2.o1.B(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.f43328n > 0) {
            arrayList.size();
            arrayList.add(l61.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(l61.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.f43328n, ',')));
            arrayList.add(l61.B(null));
        }
        arrayList.add(l61.t(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        o2 o2Var2 = this.d;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        l61 l61Var3 = new l61(3);
        l61Var3.d = 15;
        l61Var3.G = o2Var2;
        l61Var3.f28227l = string5;
        l61Var3.f28232q = true;
        arrayList.add(l61Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str5 = webDomainException2.domain;
            String str6 = webDomainException2.title;
            long j13 = webDomainException2.favicon;
            int i14 = w1.f43305a;
            l61 J2 = l61.J(w1.class);
            J2.f28227l = str5;
            J2.f28229n = str6;
            J2.B = j13;
            arrayList.add(J2);
        }
        arrayList.add(l61.B(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            l61 e7 = l61.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e7.f28233r = true;
            arrayList.add(e7);
            arrayList.add(l61.B(null));
        }
        arrayList.size();
        arrayList.add(l61.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), n1.a().f43195a));
        i2.o1.B(R.string.BrowserSettingsSearchEngineInfo, arrayList);
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
        View view2;
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
            this.f25615a.Z2.N(true);
        } else if (i13 == 1) {
            getMessagesController().toggleWebBrowserInAppEnabled();
            boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
            w8 w8Var = (w8) view;
            w8Var.setChecked(isWebBrowserInAppEnabled);
            if (isWebBrowserInAppEnabled) {
                i12 = k6.f21220f6;
            } else {
                i12 = k6.f21201e6;
            }
            w8Var.b(k6.x0(null, i12, false), isWebBrowserInAppEnabled);
            this.f25615a.Z2.N(true);
        } else if (i13 == 10) {
            getMessagesController().toggleWebBrowserUseCustomTabs(true);
            this.f25615a.Z2.N(true);
        } else if (i13 == 11) {
            getMessagesController().toggleWebBrowserUseCustomTabs(false);
            this.f25615a.Z2.N(true);
        } else {
            String str = "";
            if (i13 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.R = string;
                int i14 = R.string.BrowserSettingsCacheClearText;
                if (this.f43327f != 0) {
                    str = " (" + AndroidUtilities.formatFileSize(this.f43327f) + ")";
                }
                c2Var.T = LocaleController.formatString(i14, str);
                alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) {
                    public final y1 f43299b;

                    {
                        this.f43299b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i15) {
                        switch (r2) {
                            case 0:
                                y1 y1Var = this.f43299b;
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
                                n2 b10 = n2.b();
                                HashMap hashMap = b10.f43198a;
                                if (hashMap == null) {
                                    b10.f43200c = false;
                                    b10.f43199b = true;
                                    b10.f43198a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                y1Var.a0();
                                return;
                            case 1:
                                y1 y1Var2 = this.f43299b;
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
                                y1 y1Var3 = this.f43299b;
                                try {
                                    d1.f43083c.clear();
                                    d1.d.clear();
                                    File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                y1Var3.f43328n = 0L;
                                y1Var3.f25615a.Z2.N(true);
                                return;
                            default:
                                y1 y1Var4 = this.f43299b;
                                y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                y1Var4.f25615a.Z2.N(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
            } else if (i13 == 3) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                String string2 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20679a;
                c2Var2.R = string2;
                int i15 = R.string.BrowserSettingsCookiesClearText;
                if (this.h != 0) {
                    str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
                }
                c2Var2.T = LocaleController.formatString(i15, str);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) {
                    public final y1 f43299b;

                    {
                        this.f43299b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i152) {
                        switch (r2) {
                            case 0:
                                y1 y1Var = this.f43299b;
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
                                n2 b10 = n2.b();
                                HashMap hashMap = b10.f43198a;
                                if (hashMap == null) {
                                    b10.f43200c = false;
                                    b10.f43199b = true;
                                    b10.f43198a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                y1Var.a0();
                                return;
                            case 1:
                                y1 y1Var2 = this.f43299b;
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
                                y1 y1Var3 = this.f43299b;
                                try {
                                    d1.f43083c.clear();
                                    d1.d.clear();
                                    File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                y1Var3.f43328n = 0L;
                                y1Var3.f25615a.Z2.N(true);
                                return;
                            default:
                                y1 y1Var4 = this.f43299b;
                                y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                y1Var4.f25615a.Z2.N(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder2.d(-1);
                alertDialog$Builder2.p();
            } else if (i13 == 7) {
                ArrayList a2 = d1.a(null);
                int size = a2.size();
                long j10 = Long.MAX_VALUE;
                int i16 = 0;
                while (i16 < size) {
                    Object obj = a2.get(i16);
                    i16++;
                    j10 = Math.min(j10, ((c1) obj).f43077b);
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                String string3 = LocaleController.getString(R.string.BrowserSettingsHistoryClear);
                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f20679a;
                c2Var3.R = string3;
                c2Var3.T = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(j10 / 1000));
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) {
                    public final y1 f43299b;

                    {
                        this.f43299b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i152) {
                        switch (r2) {
                            case 0:
                                y1 y1Var = this.f43299b;
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
                                n2 b10 = n2.b();
                                HashMap hashMap = b10.f43198a;
                                if (hashMap == null) {
                                    b10.f43200c = false;
                                    b10.f43199b = true;
                                    b10.f43198a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                y1Var.a0();
                                return;
                            case 1:
                                y1 y1Var2 = this.f43299b;
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
                                y1 y1Var3 = this.f43299b;
                                try {
                                    d1.f43083c.clear();
                                    d1.d.clear();
                                    File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                y1Var3.f43328n = 0L;
                                y1Var3.f25615a.Z2.N(true);
                                return;
                            default:
                                y1 y1Var4 = this.f43299b;
                                y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                y1Var4.f25615a.Z2.N(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder3.d(-1);
                alertDialog$Builder3.p();
            } else if (i13 == 9) {
                g1[] g1VarArr = {null};
                org.telegram.ui.ActionBar.o2 g1Var = new g1(null, new org.telegram.ui.Wallet.w(13, this, g1VarArr));
                g1VarArr[0] = g1Var;
                presentFragment(g1Var);
            } else if (i13 == 5) {
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
                org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.f20679a;
                c2Var4.R = string4;
                c2Var4.T = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                    public final y1 f43299b;

                    {
                        this.f43299b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i152) {
                        switch (r2) {
                            case 0:
                                y1 y1Var = this.f43299b;
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
                                n2 b10 = n2.b();
                                HashMap hashMap = b10.f43198a;
                                if (hashMap == null) {
                                    b10.f43200c = false;
                                    b10.f43199b = true;
                                    b10.f43198a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                y1Var.a0();
                                return;
                            case 1:
                                y1 y1Var2 = this.f43299b;
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
                                y1 y1Var3 = this.f43299b;
                                try {
                                    d1.f43083c.clear();
                                    d1.d.clear();
                                    File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                y1Var3.f43328n = 0L;
                                y1Var3.f25615a.Z2.N(true);
                                return;
                            default:
                                y1 y1Var4 = this.f43299b;
                                y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                y1Var4.f25615a.Z2.N(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder4.d(-1);
                alertDialog$Builder4.p();
            } else if (l61Var.G(w1.class)) {
                x1 x1Var = (x1) view;
                String str2 = x1Var.e;
                h80 F = h80.F((ViewGroup) this.fragmentView, null, x1Var);
                F.f26929s = 40;
                F.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new y3(27, this, str2), false);
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
                            charSequenceArr[i18] = ((n1) b10.get(i18)).f43195a;
                            l6 l6Var = new l6(getParentActivity(), null);
                            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                            l6Var.a(k6.x0(null, k6.f21238g7, false), k6.x0(null, k6.E5, false));
                            CharSequence charSequence = charSequenceArr[i18];
                            if (i18 == SharedConfig.searchEngineType) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            l6Var.b(charSequence, z10);
                            int i19 = k6.f21273i6;
                            org.telegram.ui.Cells.y g02 = k6.g0(k6.x0(null, i19, false), 2, -1);
                            n6 O = r6.O(i19);
                            l6Var.setBackground(g02);
                            r6.k(l6Var, g02, null, O, null);
                            linearLayout.addView(l6Var);
                            l6Var.setOnClickListener(new ia(i18, view, atomicReference));
                        }
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                        String string5 = LocaleController.getString(R.string.SearchEngine);
                        org.telegram.ui.ActionBar.c2 c2Var5 = alertDialog$Builder5.f20679a;
                        c2Var5.R = string5;
                        alertDialog$Builder5.o(linearLayout);
                        alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                        atomicReference.set(c2Var5);
                        showDialog(c2Var5);
                    }
                } else if (i17 == 15 || i17 == 16) {
                    boolean isWebBrowserInAppEnabled2 = getMessagesController().isWebBrowserInAppEnabled();
                    if (getMessagesController().isWebBrowserExceptionsLimitReached(isWebBrowserInAppEnabled2)) {
                        d5.t0(this, LocaleController.getString(R.string.WebBrowserExceptionsLimitTitle), LocaleController.getString(R.string.WebBrowserExceptionsLimitMessage), null);
                        return;
                    }
                    Activity parentActivity = getParentActivity();
                    g6 resourceProvider = getResourceProvider();
                    y8 y8Var = new y8(10, this, isWebBrowserInAppEnabled2);
                    Pattern pattern = d5.f25562a;
                    Activity findActivity = AndroidUtilities.findActivity(parentActivity);
                    if (findActivity != null) {
                        view2 = findActivity.getCurrentFocus();
                    } else {
                        view2 = null;
                    }
                    org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                    AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(parentActivity, 0, resourceProvider);
                    if (isWebBrowserInAppEnabled2) {
                        i10 = R.string.BrowserSettingsAddTitle;
                    } else {
                        i10 = R.string.BrowserSettingsAddTitleExternal;
                    }
                    String string6 = LocaleController.getString(i10);
                    org.telegram.ui.ActionBar.c2 c2Var6 = alertDialog$Builder6.f20679a;
                    c2Var6.R = string6;
                    if (isWebBrowserInAppEnabled2) {
                        i11 = R.string.BrowserSettingsAddText;
                    } else {
                        i11 = R.string.BrowserSettingsAddTextExternal;
                    }
                    c2Var6.T = LocaleController.getString(i11);
                    ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i20 = k6.f21290j5;
                    r6.W(editTextBoldCursor, i20, resourceProvider);
                    r6.F(editTextBoldCursor, k6.Xh, resourceProvider);
                    editTextBoldCursor.setHint(LocaleController.getString(R.string.BrowserSettingsAddHint));
                    editTextBoldCursor.setInputType(17);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setFocusable(true);
                    editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.i(k6.q6, resourceProvider);
                    ShapeDrawable c02 = k6.c0(AndroidUtilities.dp(22.0f), k6.o1(0.06f, k6.w0(i20, resourceProvider)));
                    n6 M = r6.M(0.06f, i20);
                    editTextBoldCursor.setBackground(c02);
                    r6.k(editTextBoldCursor, c02, M, null, resourceProvider);
                    org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(editTextBoldCursor, y8Var, c2VarArr, view2, 20);
                    editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.c1(iVar, 0));
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.addView((View) editTextBoldCursor, z5.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                    alertDialog$Builder6.c();
                    alertDialog$Builder6.o(linearLayout2);
                    c2Var6.f20743a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                    alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.s(iVar, 2));
                    alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new tr(13));
                    c2VarArr[0] = c2Var6;
                    c2Var6.f20765j0 = false;
                    c2Var6.setOnDismissListener(new org.telegram.ui.Components.y0(editTextBoldCursor, 1));
                    c2VarArr[0].setOnShowListener(new org.telegram.ui.Components.d1(0, editTextBoldCursor));
                    c2VarArr[0].show();
                }
            }
        }
    }

    @Override
    public final boolean X(l61 l61Var, View view) {
        return false;
    }

    public final void a0() {
        a71 a71Var;
        ArrayList a2 = d1.a(new ig.k0(this, 11));
        if (a2 != null) {
            this.f43328n = a2.size();
            c71 c71Var = this.f25615a;
            if (c71Var != null && (a71Var = c71Var.Z2) != null && c71Var.G) {
                a71Var.N(true);
            }
        }
        Utilities.globalQueue.postRunnable(new ki.u(this, 29));
    }

    @Override
    public final View createView(Context context) {
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(k6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(k6.f21312k7), mode));
        o2 o2Var = new o2(mutate, mutate2, 4);
        o2Var.f32330x = AndroidUtilities.dp(2.0f);
        this.d = o2Var;
        this.fragmentView = super.createView(context);
        this.f25615a.t1();
        this.actionBar.setAdaptiveBackground(this.f25615a);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c71 c71Var;
        if (i10 == NotificationCenter.webBrowserSettingsUpdate && (c71Var = this.f25615a) != null) {
            c71Var.Z2.N(true);
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
        c71 c71Var = this.f25615a;
        c71Var.setPadding(0, c71Var.getPaddingTop(), 0, i13);
        this.f25615a.setClipToPadding(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z10;
        super.onThemeColorsChanged();
        try {
            o2 o2Var = this.d;
            if (o2Var != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int themedColor = getThemedColor(k6.N6);
                int themedColor2 = getThemedColor(k6.f21312k7);
                if (themedColor == this.f43329r && themedColor2 == this.f43330s) {
                    return;
                }
                this.f43329r = themedColor;
                this.f43330s = themedColor2;
                Drawable drawable = o2Var.f32322a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = o2Var.f32323b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                c71 c71Var = this.f25615a;
                if (c71Var != null) {
                    c71Var.g1();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
