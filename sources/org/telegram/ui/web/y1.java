package org.telegram.ui.web;

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
import bi.pa;
import bi.t8;
import di.o2;
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
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Wallet.q6;
import org.telegram.ui.cg;
public final class y1 extends m71 implements NotificationCenter.NotificationCenterDelegate {
    public o2 e;
    public final Utilities.Callback f45462f;
    public long h;
    public long f45463n;
    public long f45464r;
    public int f45465s;
    public int v;

    public y1(org.telegram.ui.q qVar) {
        this.f45462f = qVar;
    }

    public static boolean Z(File file, Boolean bool) {
        boolean z10;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z10 = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !Z(file2, bool)) {
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

    public static long a0(File file, Boolean bool) {
        long j10 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j10 += a0(file2, bool);
                }
                return j10;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override
    public final void V(ArrayList arrayList, j71 j71Var) {
        String str;
        boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        t61 t61Var = new t61(9);
        t61Var.d = 1;
        t61Var.f32875l = string;
        t61Var.L(isWebBrowserInAppEnabled);
        arrayList.add(t61Var);
        ic.a.z(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!isWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            t61 i10 = t61.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            i10.L(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(i10);
            ic.a.z(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(t61.u(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            o2 o2Var = this.e;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            t61 t61Var2 = new t61(3);
            t61Var2.d = 16;
            t61Var2.G = o2Var;
            t61Var2.f32875l = string2;
            t61Var2.f32880q = true;
            arrayList.add(t61Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str2 = webDomainException.domain;
                String str3 = webDomainException.title;
                long j10 = webDomainException.favicon;
                int i11 = w1.f45438a;
                t61 K = t61.K(w1.class);
                K.f32875l = str2;
                K.f32877n = str3;
                K.B = j10;
                arrayList.add(K);
            }
            arrayList.add(t61.C(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (!webBrowserExceptionsList.isEmpty()) {
                arrayList.size();
                t61 e = t61.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
                e.f32881r = true;
                arrayList.add(e);
                arrayList.add(t61.C(null));
                return;
            }
            return;
        }
        arrayList.size();
        int i12 = R.drawable.menu_clear_cookies;
        String string3 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
        long j11 = this.f45463n;
        String str4 = "";
        if (j11 <= 0) {
            str = "";
        } else {
            str = AndroidUtilities.formatFileSize(j11);
        }
        arrayList.add(t61.d(3, i12, string3, str));
        arrayList.size();
        int i13 = R.drawable.menu_clear_cache;
        String string4 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j12 = this.h;
        if (j12 > 0) {
            str4 = AndroidUtilities.formatFileSize(j12);
        }
        arrayList.add(t61.d(2, i13, string4, str4));
        ic.a.z(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.f45464r > 0) {
            arrayList.size();
            arrayList.add(t61.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(t61.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.f45464r, ',')));
            arrayList.add(t61.C(null));
        }
        arrayList.add(t61.u(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        o2 o2Var2 = this.e;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        t61 t61Var3 = new t61(3);
        t61Var3.d = 15;
        t61Var3.G = o2Var2;
        t61Var3.f32875l = string5;
        t61Var3.f32880q = true;
        arrayList.add(t61Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str5 = webDomainException2.domain;
            String str6 = webDomainException2.title;
            long j13 = webDomainException2.favicon;
            int i14 = w1.f45438a;
            t61 K2 = t61.K(w1.class);
            K2.f32875l = str5;
            K2.f32877n = str6;
            K2.B = j13;
            arrayList.add(K2);
        }
        arrayList.add(t61.C(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            t61 e10 = t61.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            e10.f32881r = true;
            arrayList.add(e10);
            arrayList.add(t61.C(null));
        }
        arrayList.size();
        arrayList.add(t61.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), n1.a().f45332a));
        ic.a.z(R.string.BrowserSettingsSearchEngineInfo, arrayList);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            t61 i15 = t61.i(12, "adaptable colors");
            i15.L(SharedConfig.adaptableColorInBrowser);
            arrayList.add(i15);
            t61 i16 = t61.i(13, "only local IV");
            i16.L(SharedConfig.onlyLocalInstantView);
            arrayList.add(i16);
        }
    }

    @Override
    public final CharSequence W() {
        return LocaleController.getString(R.string.BrowserSettingsTitle);
    }

    @Override
    public final void X(t61 t61Var, View view) {
        View view2;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13 = t61Var.d;
        if (i13 == 12) {
            SharedConfig.toggleBrowserAdaptableColors();
            ((a9) view).setChecked(SharedConfig.adaptableColorInBrowser);
        } else if (i13 == 13) {
            SharedConfig.toggleLocalInstantView();
            ((a9) view).setChecked(SharedConfig.onlyLocalInstantView);
        } else if (i13 == 17) {
            boolean z11 = !getMessagesController().isWebBrowserUseCustomTabs();
            getMessagesController().toggleWebBrowserUseCustomTabs(z11);
            ((a9) view).setChecked(z11);
            this.f30419a.f32152g3.O(true);
        } else if (i13 == 1) {
            getMessagesController().toggleWebBrowserInAppEnabled();
            boolean isWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
            a9 a9Var = (a9) view;
            a9Var.setChecked(isWebBrowserInAppEnabled);
            if (isWebBrowserInAppEnabled) {
                i12 = y6.f23393f6;
            } else {
                i12 = y6.f23375e6;
            }
            a9Var.b(y6.x0(null, i12, false), isWebBrowserInAppEnabled);
            this.f30419a.f32152g3.O(true);
        } else if (i13 == 10) {
            getMessagesController().toggleWebBrowserUseCustomTabs(true);
            this.f30419a.f32152g3.O(true);
        } else if (i13 == 11) {
            getMessagesController().toggleWebBrowserUseCustomTabs(false);
            this.f30419a.f32152g3.O(true);
        } else {
            String str = "";
            if (i13 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                e2Var.R = string;
                int i14 = R.string.BrowserSettingsCacheClearText;
                if (this.h != 0) {
                    str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
                }
                e2Var.T = LocaleController.formatString(i14, str);
                alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) {
                    public final y1 f45432b;

                    {
                        this.f45432b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i15) {
                        switch (r2) {
                            case 0:
                                y1 y1Var = this.f45432b;
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
                                        y1.Z(file, Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                try {
                                    File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        y1.Z(file2, null);
                                    }
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                m2 b10 = m2.b();
                                HashMap hashMap = b10.f45325a;
                                if (hashMap == null) {
                                    b10.f45327c = false;
                                    b10.f45326b = true;
                                    b10.f45325a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                y1Var.b0();
                                return;
                            case 1:
                                y1 y1Var2 = this.f45432b;
                                y1Var2.getClass();
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        y1.Z(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                y1Var2.b0();
                                return;
                            case 2:
                                y1 y1Var3 = this.f45432b;
                                try {
                                    c1.f45210c.clear();
                                    c1.d.clear();
                                    File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e12) {
                                    FileLog.e(e12);
                                }
                                y1Var3.f45464r = 0L;
                                y1Var3.f30419a.f32152g3.O(true);
                                return;
                            default:
                                y1 y1Var4 = this.f45432b;
                                y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                y1Var4.f30419a.f32152g3.O(true);
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
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
                e2Var2.R = string2;
                int i15 = R.string.BrowserSettingsCookiesClearText;
                if (this.f45463n != 0) {
                    str = " (" + AndroidUtilities.formatFileSize(this.f45463n) + ")";
                }
                e2Var2.T = LocaleController.formatString(i15, str);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) {
                    public final y1 f45432b;

                    {
                        this.f45432b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i152) {
                        switch (r2) {
                            case 0:
                                y1 y1Var = this.f45432b;
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
                                        y1.Z(file, Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                try {
                                    File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        y1.Z(file2, null);
                                    }
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                m2 b10 = m2.b();
                                HashMap hashMap = b10.f45325a;
                                if (hashMap == null) {
                                    b10.f45327c = false;
                                    b10.f45326b = true;
                                    b10.f45325a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                y1Var.b0();
                                return;
                            case 1:
                                y1 y1Var2 = this.f45432b;
                                y1Var2.getClass();
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        y1.Z(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                y1Var2.b0();
                                return;
                            case 2:
                                y1 y1Var3 = this.f45432b;
                                try {
                                    c1.f45210c.clear();
                                    c1.d.clear();
                                    File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e12) {
                                    FileLog.e(e12);
                                }
                                y1Var3.f45464r = 0L;
                                y1Var3.f30419a.f32152g3.O(true);
                                return;
                            default:
                                y1 y1Var4 = this.f45432b;
                                y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                y1Var4.f30419a.f32152g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder2.d(-1);
                alertDialog$Builder2.p();
            } else if (i13 == 7) {
                ArrayList a2 = c1.a(null);
                int size = a2.size();
                long j10 = Long.MAX_VALUE;
                int i16 = 0;
                while (i16 < size) {
                    Object obj = a2.get(i16);
                    i16++;
                    j10 = Math.min(j10, ((b1) obj).f45200b);
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                String string3 = LocaleController.getString(R.string.BrowserSettingsHistoryClear);
                org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder3.f22368a;
                e2Var3.R = string3;
                e2Var3.T = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(j10 / 1000));
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) {
                    public final y1 f45432b;

                    {
                        this.f45432b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i152) {
                        switch (r2) {
                            case 0:
                                y1 y1Var = this.f45432b;
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
                                        y1.Z(file, Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                try {
                                    File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        y1.Z(file2, null);
                                    }
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                m2 b10 = m2.b();
                                HashMap hashMap = b10.f45325a;
                                if (hashMap == null) {
                                    b10.f45327c = false;
                                    b10.f45326b = true;
                                    b10.f45325a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                y1Var.b0();
                                return;
                            case 1:
                                y1 y1Var2 = this.f45432b;
                                y1Var2.getClass();
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        y1.Z(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                y1Var2.b0();
                                return;
                            case 2:
                                y1 y1Var3 = this.f45432b;
                                try {
                                    c1.f45210c.clear();
                                    c1.d.clear();
                                    File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e12) {
                                    FileLog.e(e12);
                                }
                                y1Var3.f45464r = 0L;
                                y1Var3.f30419a.f32152g3.O(true);
                                return;
                            default:
                                y1 y1Var4 = this.f45432b;
                                y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                y1Var4.f30419a.f32152g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder3.d(-1);
                alertDialog$Builder3.p();
            } else if (i13 == 9) {
                f1[] f1VarArr = {null};
                r2 f1Var = new f1(null, new org.telegram.ui.Wallet.s(15, this, f1VarArr));
                f1VarArr[0] = f1Var;
                presentFragment(f1Var);
            } else if (i13 == 5) {
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
                org.telegram.ui.ActionBar.e2 e2Var4 = alertDialog$Builder4.f22368a;
                e2Var4.R = string4;
                e2Var4.T = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                    public final y1 f45432b;

                    {
                        this.f45432b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i152) {
                        switch (r2) {
                            case 0:
                                y1 y1Var = this.f45432b;
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
                                        y1.Z(file, Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                try {
                                    File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        y1.Z(file2, null);
                                    }
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                m2 b10 = m2.b();
                                HashMap hashMap = b10.f45325a;
                                if (hashMap == null) {
                                    b10.f45327c = false;
                                    b10.f45326b = true;
                                    b10.f45325a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                y1Var.b0();
                                return;
                            case 1:
                                y1 y1Var2 = this.f45432b;
                                y1Var2.getClass();
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        y1.Z(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                y1Var2.b0();
                                return;
                            case 2:
                                y1 y1Var3 = this.f45432b;
                                try {
                                    c1.f45210c.clear();
                                    c1.d.clear();
                                    File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e12) {
                                    FileLog.e(e12);
                                }
                                y1Var3.f45464r = 0L;
                                y1Var3.f30419a.f32152g3.O(true);
                                return;
                            default:
                                y1 y1Var4 = this.f45432b;
                                y1Var4.getMessagesController().clearAllWebBrowserExceptions();
                                y1Var4.f30419a.f32152g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder4.d(-1);
                alertDialog$Builder4.p();
            } else if (t61Var.H(w1.class)) {
                x1 x1Var = (x1) view;
                String str2 = x1Var.e;
                k80 F = k80.F((ViewGroup) this.fragmentView, null, x1Var);
                F.f29868s = 40;
                F.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new q6(17, this, str2), false);
                F.Z();
            } else {
                int i17 = t61Var.d;
                if (i17 == 6) {
                    if (getParentActivity() != null) {
                        AtomicReference atomicReference = new AtomicReference();
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        ArrayList b10 = n1.b();
                        int size2 = b10.size();
                        CharSequence[] charSequenceArr = new CharSequence[size2];
                        for (int i18 = 0; i18 < size2; i18++) {
                            charSequenceArr[i18] = ((n1) b10.get(i18)).f45332a;
                            p6 p6Var = new p6(getParentActivity(), null);
                            p6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                            p6Var.a(y6.x0(null, y6.g7, false), y6.x0(null, y6.E5, false));
                            CharSequence charSequence = charSequenceArr[i18];
                            if (i18 == SharedConfig.searchEngineType) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            p6Var.b(charSequence, z10);
                            int i19 = y6.f23448i6;
                            org.telegram.ui.Cells.y g02 = y6.g0(y6.x0(null, i19, false), 2, -1);
                            b7 N = f7.N(i19);
                            p6Var.setBackground(g02);
                            f7.k(p6Var, g02, null, N, null);
                            linearLayout.addView(p6Var);
                            p6Var.setOnClickListener(new pa(i18, view, atomicReference));
                        }
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                        String string5 = LocaleController.getString(R.string.SearchEngine);
                        org.telegram.ui.ActionBar.e2 e2Var5 = alertDialog$Builder5.f22368a;
                        e2Var5.R = string5;
                        alertDialog$Builder5.o(linearLayout);
                        alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                        atomicReference.set(e2Var5);
                        showDialog(e2Var5);
                    }
                } else if (i17 == 15 || i17 == 16) {
                    boolean isWebBrowserInAppEnabled2 = getMessagesController().isWebBrowserInAppEnabled();
                    if (getMessagesController().isWebBrowserExceptionsLimitReached(isWebBrowserInAppEnabled2)) {
                        g5.t0(this, LocaleController.getString(R.string.WebBrowserExceptionsLimitTitle), LocaleController.getString(R.string.WebBrowserExceptionsLimitMessage), null);
                        return;
                    }
                    Activity parentActivity = getParentActivity();
                    u6 resourceProvider = getResourceProvider();
                    t8 t8Var = new t8(10, this, isWebBrowserInAppEnabled2);
                    Pattern pattern = g5.f28420a;
                    Activity findActivity = AndroidUtilities.findActivity(parentActivity);
                    if (findActivity != null) {
                        view2 = findActivity.getCurrentFocus();
                    } else {
                        view2 = null;
                    }
                    org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
                    AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(parentActivity, 0, resourceProvider);
                    if (isWebBrowserInAppEnabled2) {
                        i10 = R.string.BrowserSettingsAddTitle;
                    } else {
                        i10 = R.string.BrowserSettingsAddTitleExternal;
                    }
                    String string6 = LocaleController.getString(i10);
                    org.telegram.ui.ActionBar.e2 e2Var6 = alertDialog$Builder6.f22368a;
                    e2Var6.R = string6;
                    if (isWebBrowserInAppEnabled2) {
                        i11 = R.string.BrowserSettingsAddText;
                    } else {
                        i11 = R.string.BrowserSettingsAddTextExternal;
                    }
                    e2Var6.T = LocaleController.getString(i11);
                    ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i20 = y6.f23464j5;
                    f7.V(editTextBoldCursor, i20, resourceProvider);
                    f7.E(editTextBoldCursor, y6.Xh, resourceProvider);
                    editTextBoldCursor.setHint(LocaleController.getString(R.string.BrowserSettingsAddHint));
                    editTextBoldCursor.setInputType(17);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setFocusable(true);
                    editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.i(y6.f23597q6, resourceProvider);
                    ShapeDrawable c02 = y6.c0(AndroidUtilities.dp(22.0f), y6.o1(0.06f, y6.w0(i20, resourceProvider)));
                    b7 L = f7.L(0.06f, i20);
                    editTextBoldCursor.setBackground(c02);
                    f7.k(editTextBoldCursor, c02, L, null, resourceProvider);
                    m4.v0 v0Var = new m4.v0((Object) editTextBoldCursor, t8Var, e2VarArr, view2, 23);
                    editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.d1(v0Var, 0));
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.addView((View) editTextBoldCursor, gb1.o(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                    alertDialog$Builder6.c();
                    alertDialog$Builder6.o(linearLayout2);
                    e2Var6.f22555a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                    alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.s(v0Var, 2));
                    alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new cg(17));
                    e2VarArr[0] = e2Var6;
                    e2Var6.f22577j0 = false;
                    e2Var6.setOnDismissListener(new org.telegram.ui.Components.z0(editTextBoldCursor, 1));
                    e2VarArr[0].setOnShowListener(new org.telegram.ui.Components.e1(0, editTextBoldCursor));
                    e2VarArr[0].show();
                }
            }
        }
    }

    @Override
    public final boolean Y(t61 t61Var, View view) {
        return false;
    }

    public final void b0() {
        j71 j71Var;
        ArrayList a2 = c1.a(new ig.o(this, 15));
        if (a2 != null) {
            this.f45464r = a2.size();
            l71 l71Var = this.f30419a;
            if (l71Var != null && (j71Var = l71Var.f32152g3) != null && l71Var.G) {
                j71Var.O(true);
            }
        }
        Utilities.globalQueue.postRunnable(new h1(this, 2));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(y6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(y6.f23485k7), mode));
        o2 o2Var = new o2(mutate, mutate2, 4);
        o2Var.f26600x = AndroidUtilities.dp(2.0f);
        this.e = o2Var;
        this.fragmentView = super.createView(context);
        this.f30419a.u1();
        this.f30419a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l71 l71Var;
        if (i10 == NotificationCenter.webBrowserSettingsUpdate && (l71Var = this.f30419a) != null) {
            l71Var.f32152g3.O(true);
        }
    }

    @Override
    public final mm0 getListViewForSimpleGlass() {
        return this.f30419a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        b0();
        getNotificationCenter().addObserver(this, NotificationCenter.webBrowserSettingsUpdate);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.webBrowserSettingsUpdate);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z10;
        super.onThemeColorsChanged();
        try {
            o2 o2Var = this.e;
            if (o2Var != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int themedColor = getThemedColor(y6.N6);
                int themedColor2 = getThemedColor(y6.f23485k7);
                if (themedColor == this.f45465s && themedColor2 == this.v) {
                    return;
                }
                this.f45465s = themedColor;
                this.v = themedColor2;
                Drawable drawable = o2Var.f26592a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = o2Var.f26593b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                l71 l71Var = this.f30419a;
                if (l71Var != null) {
                    l71Var.g1();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
