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
import gh.v2;
import h7.z5;
import hh.o6;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import lh.n6;
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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.y4;
import org.telegram.ui.fr;
import org.telegram.ui.ib0;
import org.telegram.ui.yf;
import org.telegram.ui.zh1;

public final class v1 extends f51 implements NotificationCenter.NotificationCenterDelegate {
    public jh.i2 d;

    public final Utilities.Callback f44017e;

    public long f44018f;
    public long h;

    public long f44019n;

    public v1(org.telegram.ui.s sVar) {
        this.f44017e = sVar;
    }

    public static boolean Y(File file, Boolean bool) {
        boolean z10;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                z10 = true;
                for (File file2 : fileArrListFiles) {
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
        } else {
            if (bool != null && bool.booleanValue() != file.getName().startsWith("Cookies")) {
                return false;
            }
            file.delete();
        }
        return true;
    }

    public static long Z(File file, Boolean bool) {
        long jZ = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    jZ += Z(file2, bool);
                }
                return jZ;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override
    public final void U(ArrayList arrayList, b51 b51Var) {
        boolean zIsWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        n41 n41Var = new n41(9);
        n41Var.d = 1;
        n41Var.f30844l = string;
        n41Var.K(zIsWebBrowserInAppEnabled);
        arrayList.add(n41Var);
        pa.A(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!zIsWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            n41 n41VarI = n41.i(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            n41VarI.K(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(n41VarI);
            pa.A(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(n41.t(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            jh.i2 i2Var = this.d;
            String string2 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            n41 n41Var2 = new n41(3);
            n41Var2.d = 16;
            n41Var2.G = i2Var;
            n41Var2.f30844l = string2;
            n41Var2.f30849q = true;
            arrayList.add(n41Var2);
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str = webDomainException.domain;
                String str2 = webDomainException.title;
                long j10 = webDomainException.favicon;
                int i10 = t1.f44003a;
                n41 n41VarJ = n41.J(t1.class);
                n41VarJ.f30844l = str;
                n41VarJ.f30846n = str2;
                n41VarJ.B = j10;
                arrayList.add(n41VarJ);
            }
            arrayList.add(n41.B(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (webBrowserExceptionsList.isEmpty()) {
                return;
            }
            arrayList.size();
            n41 n41VarE = n41.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            n41VarE.f30850r = true;
            arrayList.add(n41VarE);
            arrayList.add(n41.B(null));
            return;
        }
        arrayList.size();
        int i11 = R.drawable.menu_clear_cookies;
        String string3 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
        long j11 = this.h;
        arrayList.add(n41.d(3, i11, string3, j11 > 0 ? AndroidUtilities.formatFileSize(j11) : ""));
        arrayList.size();
        int i12 = R.drawable.menu_clear_cache;
        String string4 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j12 = this.f44018f;
        arrayList.add(n41.d(2, i12, string4, j12 > 0 ? AndroidUtilities.formatFileSize(j12) : ""));
        pa.A(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.f44019n > 0) {
            arrayList.size();
            arrayList.add(n41.c(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(n41.d(7, R.drawable.menu_clear_cache, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.f44019n, ',')));
            arrayList.add(n41.B(null));
        }
        arrayList.add(n41.t(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        jh.i2 i2Var2 = this.d;
        String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        n41 n41Var3 = new n41(3);
        n41Var3.d = 15;
        n41Var3.G = i2Var2;
        n41Var3.f30844l = string5;
        n41Var3.f30849q = true;
        arrayList.add(n41Var3);
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str3 = webDomainException2.domain;
            String str4 = webDomainException2.title;
            long j13 = webDomainException2.favicon;
            int i13 = t1.f44003a;
            n41 n41VarJ2 = n41.J(t1.class);
            n41VarJ2.f30844l = str3;
            n41VarJ2.f30846n = str4;
            n41VarJ2.B = j13;
            arrayList.add(n41VarJ2);
        }
        arrayList.add(n41.B(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            n41 n41VarE2 = n41.e(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            n41VarE2.f30850r = true;
            arrayList.add(n41VarE2);
            arrayList.add(n41.B(null));
        }
        arrayList.size();
        arrayList.add(n41.d(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), k1.a().f43889a));
        pa.A(R.string.BrowserSettingsSearchEngineInfo, arrayList);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            n41 n41VarI2 = n41.i(12, "adaptable colors");
            n41VarI2.K(SharedConfig.adaptableColorInBrowser);
            arrayList.add(n41VarI2);
            n41 n41VarI3 = n41.i(13, "only local IV");
            n41VarI3.K(SharedConfig.onlyLocalInstantView);
            arrayList.add(n41VarI3);
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BrowserSettingsTitle);
    }

    @Override
    public final void W(n41 n41Var, View view) {
        int i10 = n41Var.d;
        if (i10 == 12) {
            SharedConfig.toggleBrowserAdaptableColors();
            ((p8) view).setChecked(SharedConfig.adaptableColorInBrowser);
            return;
        }
        if (i10 == 13) {
            SharedConfig.toggleLocalInstantView();
            ((p8) view).setChecked(SharedConfig.onlyLocalInstantView);
            return;
        }
        final int i11 = 1;
        if (i10 == 17) {
            boolean z10 = !getMessagesController().isWebBrowserUseCustomTabs();
            getMessagesController().toggleWebBrowserUseCustomTabs(z10);
            ((p8) view).setChecked(z10);
            this.f28261a.U2.N(true);
            return;
        }
        final int i12 = 0;
        if (i10 == 1) {
            getMessagesController().toggleWebBrowserInAppEnabled();
            boolean zIsWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
            p8 p8Var = (p8) view;
            p8Var.setChecked(zIsWebBrowserInAppEnabled);
            p8Var.b(g6.w0(null, zIsWebBrowserInAppEnabled ? g6.f23090f6 : g6.f23072e6, false), zIsWebBrowserInAppEnabled);
            this.f28261a.U2.N(true);
            return;
        }
        if (i10 == 10) {
            getMessagesController().toggleWebBrowserUseCustomTabs(true);
            this.f28261a.U2.N(true);
            return;
        }
        if (i10 == 11) {
            getMessagesController().toggleWebBrowserUseCustomTabs(false);
            this.f28261a.U2.N(true);
            return;
        }
        String str = "";
        final int i13 = 2;
        if (i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = string;
            int i14 = R.string.BrowserSettingsCacheClearText;
            if (this.f44018f != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.f44018f) + ")";
            }
            b2Var.P = LocaleController.formatString(i14, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {

                public final v1 f43995b;

                {
                    this.f43995b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i15) {
                    switch (i12) {
                        case 0:
                            v1 v1Var = this.f43995b;
                            v1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(v1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                                break;
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    v1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    v1.Y(file2, null);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            j2 j2VarB = j2.b();
                            HashMap map = j2VarB.f43881a;
                            if (map == null) {
                                j2VarB.f43883c = false;
                                j2VarB.f43882b = true;
                                j2VarB.f43881a = new HashMap();
                            } else {
                                map.clear();
                            }
                            j2VarB.d();
                            v1Var.a0();
                            break;
                        case 1:
                            v1 v1Var2 = this.f43995b;
                            v1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    v1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            v1Var2.a0();
                            break;
                        case 2:
                            v1 v1Var3 = this.f43995b;
                            try {
                                b1.f43783c.clear();
                                b1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            v1Var3.f44019n = 0L;
                            v1Var3.f28261a.U2.N(true);
                            break;
                        default:
                            v1 v1Var4 = this.f43995b;
                            v1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            v1Var4.f28261a.U2.N(true);
                            break;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
            return;
        }
        final int i15 = 3;
        if (i10 == 3) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string2 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
            b2Var2.N = string2;
            int i16 = R.string.BrowserSettingsCookiesClearText;
            if (this.h != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.h) + ")";
            }
            b2Var2.P = LocaleController.formatString(i16, str);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {

                public final v1 f43995b;

                {
                    this.f43995b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var3, int i17) {
                    switch (i11) {
                        case 0:
                            v1 v1Var = this.f43995b;
                            v1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(v1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                                break;
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    v1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    v1.Y(file2, null);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            j2 j2VarB = j2.b();
                            HashMap map = j2VarB.f43881a;
                            if (map == null) {
                                j2VarB.f43883c = false;
                                j2VarB.f43882b = true;
                                j2VarB.f43881a = new HashMap();
                            } else {
                                map.clear();
                            }
                            j2VarB.d();
                            v1Var.a0();
                            break;
                        case 1:
                            v1 v1Var2 = this.f43995b;
                            v1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    v1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            v1Var2.a0();
                            break;
                        case 2:
                            v1 v1Var3 = this.f43995b;
                            try {
                                b1.f43783c.clear();
                                b1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            v1Var3.f44019n = 0L;
                            v1Var3.f28261a.U2.N(true);
                            break;
                        default:
                            v1 v1Var4 = this.f43995b;
                            v1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            v1Var4.f28261a.U2.N(true);
                            break;
                    }
                }
            });
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.d(-1);
            alertDialog$Builder2.o();
            return;
        }
        if (i10 == 7) {
            ArrayList arrayListA = b1.a(null);
            int size = arrayListA.size();
            long jMin = Long.MAX_VALUE;
            int i17 = 0;
            while (i17 < size) {
                Object obj = arrayListA.get(i17);
                i17++;
                jMin = Math.min(jMin, ((a1) obj).f43775b);
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string3 = LocaleController.getString(R.string.BrowserSettingsHistoryClear);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f22702a;
            b2Var3.N = string3;
            b2Var3.P = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(jMin / 1000));
            alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {

                public final v1 f43995b;

                {
                    this.f43995b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i18) {
                    switch (i13) {
                        case 0:
                            v1 v1Var = this.f43995b;
                            v1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(v1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                                break;
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    v1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    v1.Y(file2, null);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            j2 j2VarB = j2.b();
                            HashMap map = j2VarB.f43881a;
                            if (map == null) {
                                j2VarB.f43883c = false;
                                j2VarB.f43882b = true;
                                j2VarB.f43881a = new HashMap();
                            } else {
                                map.clear();
                            }
                            j2VarB.d();
                            v1Var.a0();
                            break;
                        case 1:
                            v1 v1Var2 = this.f43995b;
                            v1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    v1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            v1Var2.a0();
                            break;
                        case 2:
                            v1 v1Var3 = this.f43995b;
                            try {
                                b1.f43783c.clear();
                                b1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            v1Var3.f44019n = 0L;
                            v1Var3.f28261a.U2.N(true);
                            break;
                        default:
                            v1 v1Var4 = this.f43995b;
                            v1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            v1Var4.f28261a.U2.N(true);
                            break;
                    }
                }
            });
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder3.d(-1);
            alertDialog$Builder3.o();
            return;
        }
        if (i10 == 9) {
            d1[] d1VarArr = {null};
            n2 d1Var = new d1(null, new ib0(15, this, d1VarArr));
            d1VarArr[0] = d1Var;
            presentFragment(d1Var);
            return;
        }
        if (i10 == 5) {
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
            org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f22702a;
            b2Var4.N = string4;
            b2Var4.P = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) {

                public final v1 f43995b;

                {
                    this.f43995b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var5, int i18) {
                    switch (i15) {
                        case 0:
                            v1 v1Var = this.f43995b;
                            v1Var.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(v1Var.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                                break;
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    v1.Y(file, Boolean.FALSE);
                                }
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    v1.Y(file2, null);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            j2 j2VarB = j2.b();
                            HashMap map = j2VarB.f43881a;
                            if (map == null) {
                                j2VarB.f43883c = false;
                                j2VarB.f43882b = true;
                                j2VarB.f43881a = new HashMap();
                            } else {
                                map.clear();
                            }
                            j2VarB.d();
                            v1Var.a0();
                            break;
                        case 1:
                            v1 v1Var2 = this.f43995b;
                            v1Var2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    v1.Y(file3, Boolean.TRUE);
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            v1Var2.a0();
                            break;
                        case 2:
                            v1 v1Var3 = this.f43995b;
                            try {
                                b1.f43783c.clear();
                                b1.d.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            v1Var3.f44019n = 0L;
                            v1Var3.f28261a.U2.N(true);
                            break;
                        default:
                            v1 v1Var4 = this.f43995b;
                            v1Var4.getMessagesController().clearAllWebBrowserExceptions();
                            v1Var4.f28261a.U2.N(true);
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder4.d(-1);
            alertDialog$Builder4.o();
            return;
        }
        if (n41Var.G(t1.class)) {
            u1 u1Var = (u1) view;
            String str2 = u1Var.f44010e;
            b70 b70VarF = b70.F((ViewGroup) this.fragmentView, null, u1Var);
            b70VarF.f26992s = 40;
            b70VarF.c(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new zh1(8, this, str2), false);
            b70VarF.Z();
            return;
        }
        int i18 = n41Var.d;
        int i19 = 6;
        if (i18 == 6) {
            if (getParentActivity() == null) {
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            ArrayList arrayListB = k1.b();
            int size2 = arrayListB.size();
            CharSequence[] charSequenceArr = new CharSequence[size2];
            int i20 = 0;
            while (i20 < size2) {
                charSequenceArr[i20] = ((k1) arrayListB.get(i20)).f43889a;
                h6 h6Var = new h6(getParentActivity(), null);
                h6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                h6Var.a(g6.w0(null, g6.f23109g7, false), g6.w0(null, g6.E5, false));
                h6Var.b(charSequenceArr[i20], i20 == SharedConfig.searchEngineType);
                h6Var.setBackground(g6.f0(g6.w0(null, g6.f23144i6, false), 2, -1));
                linearLayout.addView(h6Var);
                h6Var.setOnClickListener(new v2(i20, view, atomicReference));
                i20++;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
            String string5 = LocaleController.getString(R.string.SearchEngine);
            org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder5.f22702a;
            b2Var5.N = string5;
            alertDialog$Builder5.n(linearLayout);
            alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
            atomicReference.set(b2Var5);
            showDialog(b2Var5);
            return;
        }
        if (i18 == 15 || i18 == 16) {
            boolean zIsWebBrowserInAppEnabled2 = getMessagesController().isWebBrowserInAppEnabled();
            if (getMessagesController().isWebBrowserExceptionsLimitReached(zIsWebBrowserInAppEnabled2)) {
                y4.u0(this, LocaleController.getString(R.string.WebBrowserExceptionsLimitTitle), LocaleController.getString(R.string.WebBrowserExceptionsLimitMessage), null);
                return;
            }
            Activity parentActivity = getParentActivity();
            c6 resourceProvider = getResourceProvider();
            o6 o6Var = new o6(i19, this, zIsWebBrowserInAppEnabled2);
            Pattern pattern = y4.f34802a;
            Activity activityFindActivity = AndroidUtilities.findActivity(parentActivity);
            View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
            org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
            AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(parentActivity, 0, resourceProvider);
            String string6 = LocaleController.getString(zIsWebBrowserInAppEnabled2 ? R.string.BrowserSettingsAddTitle : R.string.BrowserSettingsAddTitleExternal);
            org.telegram.ui.ActionBar.b2 b2Var6 = alertDialog$Builder6.f22702a;
            b2Var6.N = string6;
            b2Var6.P = LocaleController.getString(zIsWebBrowserInAppEnabled2 ? R.string.BrowserSettingsAddText : R.string.BrowserSettingsAddTextExternal);
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i21 = g6.f23161j5;
            editTextBoldCursor.setTextColor(g6.v0(i21, resourceProvider));
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
            gradientDrawable.setColor(g6.l1(0.06f, g6.v0(i21, resourceProvider)));
            editTextBoldCursor.setBackground(gradientDrawable);
            yf yfVar = new yf(editTextBoldCursor, o6Var, b2VarArr, currentFocus, 11);
            editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.c1(yfVar, i12));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(editTextBoldCursor, z5.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
            alertDialog$Builder6.c();
            alertDialog$Builder6.n(linearLayout2);
            b2Var6.f22742a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder6.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.s(yfVar, i13));
            alertDialog$Builder6.h(LocaleController.getString(R.string.Cancel), new fr(14));
            b2VarArr[0] = b2Var6;
            b2Var6.f22748d0 = false;
            b2Var6.setOnDismissListener(new org.telegram.ui.Components.a1(editTextBoldCursor, i11));
            b2VarArr[0].setOnShowListener(new org.telegram.ui.Components.d1(i12, editTextBoldCursor));
            b2VarArr[0].show();
        }
    }

    @Override
    public final boolean X(n41 n41Var, View view) {
        return false;
    }

    public final void a0() {
        b51 b51Var;
        ArrayList arrayListA = b1.a(new n6(this, 9));
        if (arrayListA != null) {
            this.f44019n = arrayListA.size();
            e51 e51Var = this.f28261a;
            if (e51Var != null && (b51Var = e51Var.U2) != null && e51Var.C) {
                b51Var.N(true);
            }
        }
        Utilities.globalQueue.postRunnable(new nh.f0(this, 27));
    }

    @Override
    public final View createView(Context context) {
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(g6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(g6.f23182k7), mode));
        jh.i2 i2Var = new jh.i2(drawableMutate, drawableMutate2, 4);
        i2Var.f27829x = AndroidUtilities.dp(2.0f);
        this.d = i2Var;
        this.fragmentView = super.createView(context);
        this.f28261a.p1();
        this.actionBar.setAdaptiveBackground(this.f28261a);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e51 e51Var;
        if (i10 != NotificationCenter.webBrowserSettingsUpdate || (e51Var = this.f28261a) == null) {
            return;
        }
        e51Var.U2.N(true);
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
        e51 e51Var = this.f28261a;
        e51Var.setPadding(0, e51Var.getPaddingTop(), 0, i13);
        this.f28261a.setClipToPadding(false);
    }
}
