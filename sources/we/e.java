package we;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.net.IDN;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CustomTabsCopyReceiver;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.ShareBroadcastReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d3;
import org.telegram.ui.j0;
import org.telegram.ui.m4;
import org.telegram.ui.q3;
import org.telegram.ui.ty;
import org.telegram.ui.web.w0;

public abstract class e {

    public static xe.b f49295a;

    public static xe.b f49296b;

    public static ef.a f49297c;
    public static String d;

    public static WeakReference f49298e;

    public static Pattern f49299f;

    public static String a(String str) {
        boolean zStartsWith;
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (str == null) {
            zStartsWith = true;
        } else {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length <= 0) {
                zStartsWith = true;
            } else {
                zStartsWith = strArrSplit[strArrSplit.length - 1].startsWith("xn--");
            }
        }
        if (!zStartsWith) {
            return str;
        }
        try {
            return IDN.toUnicode(str, 1);
        } catch (Exception e10) {
            FileLog.e(e10);
            return str;
        }
    }

    public static String b(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            if (str.startsWith("@")) {
                return str.substring(1);
            }
            if (str.startsWith("t.me/")) {
                return str.substring(5);
            }
            if (str.startsWith("http://t.me/")) {
                return str.substring(12);
            }
            if (str.startsWith("https://t.me/")) {
                return str.substring(13);
            }
            Matcher matcher = LaunchActivity.f35496x1.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static xe.b c() {
        xe.b bVar = f49296b;
        xe.b bVar2 = null;
        if (bVar == null) {
            f49295a = null;
        } else if (f49295a == null) {
            xa.a aVar = new xa.a(25);
            df.e eVar = (df.e) bVar.f49392b;
            df.b bVar3 = new df.b(aVar);
            try {
                if (((df.c) eVar).E0(bVar3)) {
                    bVar2 = new xe.b(bVar3, (ComponentName) bVar.f49393c, false, 19);
                }
            } catch (RemoteException unused) {
            }
            f49295a = bVar2;
            new WeakReference(bVar2);
        }
        return f49295a;
    }

    public static boolean d(Context context, String str) {
        String[] strArr;
        if (str == null) {
            return false;
        }
        List<ResolveInfo> listQueryIntentActivities = null;
        try {
            List<ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 0);
            if (listQueryIntentActivities2 == null || listQueryIntentActivities2.isEmpty()) {
                strArr = null;
            } else {
                strArr = new String[listQueryIntentActivities2.size()];
                for (int i10 = 0; i10 < listQueryIntentActivities2.size(); i10++) {
                    try {
                        strArr[i10] = listQueryIntentActivities2.get(i10).activityInfo.packageName;
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("default browser name = " + strArr[i10]);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
        try {
            listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
            if (strArr != null) {
                int i11 = 0;
                while (i11 < listQueryIntentActivities.size()) {
                    for (String str2 : strArr) {
                        if (str2.equals(listQueryIntentActivities.get(i11).activityInfo.packageName)) {
                            listQueryIntentActivities.remove(i11);
                            i11--;
                            break;
                        }
                    }
                    i11++;
                }
            } else {
                int i12 = 0;
                while (i12 < listQueryIntentActivities.size()) {
                    String lowerCase = listQueryIntentActivities.get(i12).activityInfo.packageName.toLowerCase();
                    if (lowerCase != null && (lowerCase.contains("browser") || lowerCase.contains("chrome") || lowerCase.contains("firefox") || "com.microsoft.emmx".equals(lowerCase) || "com.opera.mini.native".equals(lowerCase) || "com.duckduckgo.mobile.android".equals(lowerCase) || "com.UCMobile.intl".equals(lowerCase))) {
                        listQueryIntentActivities.remove(i12);
                        i12--;
                    }
                    i12++;
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                for (int i13 = 0; i13 < listQueryIntentActivities.size(); i13++) {
                    FileLog.d("device has " + listQueryIntentActivities.get(i13).activityInfo.packageName + " to open " + str);
                }
            }
        } catch (Exception unused3) {
        }
        return (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }

    public static boolean e() {
        ty sheetFragment;
        n2 n2VarU = LaunchActivity.U();
        if (n2VarU == null || !(n2VarU.getParentLayout() instanceof ActionBarLayout) || (sheetFragment = ((ActionBarLayout) n2VarU.getParentLayout()).getSheetFragment()) == null || sheetFragment.getArticleViewer() == null) {
            return (n2VarU == null || n2VarU.getArticleViewer() == null) ? false : true;
        }
        return true;
    }

    public static boolean f(Uri uri, boolean z10, boolean[] zArr) {
        String str;
        String str2;
        String hostAuthority = AndroidUtilities.getHostAuthority(uri);
        String lowerCase = hostAuthority != null ? hostAuthority.toLowerCase() : "";
        if (!MessagesController.getInstance(UserConfig.selectedAccount).authDomains.contains(lowerCase)) {
            Matcher matcher = LaunchActivity.f35496x1.matcher(lowerCase);
            if (matcher.find()) {
                StringBuilder sb2 = new StringBuilder("https://t.me/");
                sb2.append(matcher.group(1));
                if (TextUtils.isEmpty(uri.getPath())) {
                    str = "";
                } else {
                    str = "/" + uri.getPath();
                }
                sb2.append(str);
                if (TextUtils.isEmpty(uri.getQuery())) {
                    str2 = "";
                } else {
                    str2 = "?" + uri.getQuery();
                }
                sb2.append(str2);
                uri = Uri.parse(sb2.toString());
                String host = uri.getHost();
                lowerCase = host != null ? host.toLowerCase() : "";
            }
            if (!"ton".equals(uri.getScheme())) {
                if (!"tg".equals(uri.getScheme())) {
                    if ("telegram.dog".equals(lowerCase)) {
                        String path = uri.getPath();
                        if (path != null && path.length() > 1) {
                            if (!z10) {
                                String lowerCase2 = path.substring(1).toLowerCase();
                                if (lowerCase2.startsWith("blog") || lowerCase2.equals("iv") || lowerCase2.startsWith("faq") || lowerCase2.equals("apps") || lowerCase2.startsWith("s/")) {
                                    if (zArr != null) {
                                        zArr[0] = true;
                                        return false;
                                    }
                                }
                            }
                        }
                    } else if ("telegram.me".equals(lowerCase) || "t.me".equals(lowerCase)) {
                        String path2 = uri.getPath();
                        if (path2 != null && path2.length() > 1) {
                            if (!z10) {
                                String lowerCase3 = path2.substring(1).toLowerCase();
                                if (lowerCase3.equals("iv") || lowerCase3.startsWith("s/")) {
                                    if (zArr != null) {
                                        zArr[0] = true;
                                    }
                                }
                            }
                        }
                    } else if ((!"telegram.org".equals(lowerCase) || uri.getPath() == null || !uri.getPath().startsWith("/blog/")) && (!z10 || (!lowerCase.endsWith("telegram.org") && !lowerCase.endsWith("telegra.ph") && !lowerCase.endsWith("telesco.pe")))) {
                    }
                }
                return true;
            }
            try {
                List<ResolveInfo> listQueryIntentActivities = ApplicationLoader.applicationContext.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
                if (listQueryIntentActivities == null || listQueryIntentActivities.size() < 1) {
                    return true;
                }
            } catch (Exception unused) {
            }
        } else if (zArr != null) {
            zArr[0] = true;
            return false;
        }
        return false;
    }

    public static boolean g(String str) {
        try {
            return TextUtils.equals(AndroidUtilities.getHostAuthority(str), MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix);
        } catch (Exception e9) {
            FileLog.e(e9);
            return false;
        }
    }

    public static boolean h(String str, boolean z10, boolean z11) {
        if (z10) {
            return str.equals("telegra.ph") || str.equals("te.legra.ph") || str.equals("graph.org");
        }
        StringBuilder sb2 = new StringBuilder("^(https");
        sb2.append(z11 ? "" : "?");
        sb2.append("://)?(te\\.?legra\\.ph|graph\\.org)(/.*|$)");
        return str.matches(sb2.toString());
    }

    public static boolean i(String str) {
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority != null && (hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            return true;
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() != null && uri.getScheme().equalsIgnoreCase("tonsite");
    }

    public static boolean j(String str) {
        boolean zMatches;
        if (f49299f == null) {
            f49299f = Pattern.compile("^[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9\\-\\_]+$");
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority == null || !(hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            Uri uri = Uri.parse(str);
            if (uri.getScheme() == null || !uri.getScheme().equalsIgnoreCase("tonsite")) {
                return false;
            }
            zMatches = f49299f.matcher(uri.getScheme()).matches();
        } else {
            zMatches = f49299f.matcher(hostAuthority).matches();
        }
        return !zMatches;
    }

    public static boolean k(Context context, String str, boolean z10, boolean z11, d dVar) throws Throwable {
        LaunchActivity launchActivity;
        if (str == null) {
            return false;
        }
        if (AndroidUtilities.findActivity(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) AndroidUtilities.findActivity(context);
        } else {
            launchActivity = LaunchActivity.C1;
            if (launchActivity == null) {
                return false;
            }
        }
        if (launchActivity == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setComponent(new ComponentName(context.getPackageName(), LaunchActivity.class.getName()));
        intent.putExtra("create_new_tab", true);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        intent.putExtra("force_not_internal_apps", z10);
        intent.putExtra("force_request", z11);
        launchActivity.e0(intent, dVar);
        return true;
    }

    public static boolean l(Context context, String str, boolean z10) {
        if (str != null) {
            try {
                if (!i(str) && !f(Uri.parse(str), false, null)) {
                    Uri uri = Uri.parse(str);
                    String strV = v(uri, uri.getScheme() == null ? "https" : uri.getScheme(), null, uri.getHost() != null ? uri.getHost().toLowerCase() : uri.getHost(), TextUtils.isEmpty(uri.getPath()) ? "/" : uri.getPath());
                    Uri uri2 = Uri.parse(strV);
                    boolean z11 = strV.startsWith("intent://") || (uri2.getScheme() != null && uri2.getScheme().equalsIgnoreCase("intent"));
                    if (!z11 || z10) {
                        Intent uri3 = z11 ? Intent.parseUri(uri2.toString(), 1) : new Intent("android.intent.action.VIEW", uri2);
                        if (!z11 && Build.VERSION.SDK_INT >= 30) {
                            uri3.addCategory("android.intent.category.BROWSABLE");
                            uri3.addCategory("android.intent.category.DEFAULT");
                            uri3.addFlags(268435456);
                            uri3.addFlags(1024);
                        } else if (!z11 && !d(context, strV)) {
                        }
                        context.startActivity(uri3);
                        return true;
                    }
                }
            } catch (ActivityNotFoundException e9) {
                FileLog.e((Throwable) e9, false);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return false;
    }

    public static boolean m(Context context, String str, boolean z10, String str2) {
        if (str != null) {
            try {
                Uri uri = Uri.parse(str);
                boolean z11 = uri.getScheme() != null && uri.getScheme().equalsIgnoreCase("intent");
                if (!z11 || z10) {
                    Intent uri2 = z11 ? Intent.parseUri(uri.toString(), 1) : new Intent("android.intent.action.VIEW", uri);
                    if (!TextUtils.isEmpty(str2)) {
                        uri2.setPackage(str2);
                    }
                    uri2.putExtra("create_new_tab", true);
                    uri2.putExtra("com.android.browser.application_id", context.getPackageName());
                    context.startActivity(uri2);
                    return true;
                }
            } catch (Exception e9) {
                FileLog.e(e9);
                return false;
            }
        }
        return false;
    }

    public static void n(String str) {
        m3 m3VarP;
        l3 l3Var;
        q3[] q3VarArr;
        q3 q3Var;
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null && (m3VarP = launchActivity.P()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<l3> tabs = m3VarP.getTabs();
                int i10 = 0;
                while (true) {
                    if (i10 >= tabs.size()) {
                        l3Var = null;
                        break;
                    }
                    l3Var = tabs.get(i10);
                    m4 m4Var = l3Var.H;
                    if (m4Var != null && !m4Var.Z.isEmpty()) {
                        Object objI = i0.a.i(1, l3Var.H.Z);
                        if (objI instanceof d3) {
                            w0 webView = ((d3) objI).f23624b;
                            if (webView == null && (q3VarArr = l3Var.H.f40347q0) != null && (q3Var = q3VarArr[0]) != null) {
                                webView = q3Var.getWebView();
                            }
                            if (webView == null) {
                                continue;
                            } else {
                                if (TextUtils.equals(m3.p(webView.canGoBack() ? webView.getUrl() : webView.getOpenURL()), m3.p(str))) {
                                    m3VarP.e(l3Var);
                                    break;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i10++;
                }
            } else {
                l3Var = null;
                break;
            }
            if (l3Var != null) {
                return;
            }
        }
        n2 n2VarU = LaunchActivity.U();
        if (n2VarU != null && n2VarU.getArticleViewer() != null) {
            n2VarU.getArticleViewer().N(null, null, null, str);
            return;
        }
        if (n2VarU != null && (n2VarU.getParentLayout() instanceof ActionBarLayout)) {
            n2VarU = ((ActionBarLayout) n2VarU.getParentLayout()).getSheetFragment();
        }
        if (n2VarU == null) {
            return;
        }
        n2VarU.createArticleViewer(false).N(null, null, null, str);
    }

    public static void o(Activity activity, String str, boolean z10) {
        if (activity == null || str == null) {
            return;
        }
        p(activity, Uri.parse(str), z10, true);
    }

    public static void p(Context context, Uri uri, boolean z10, boolean z11) {
        r(context, uri, z10, z11, false, null, null, false, true, false);
    }

    public static void q(Context context, Uri uri, boolean z10, boolean z11, d dVar) {
        r(context, uri, z10, z11, false, dVar, null, false, true, false);
    }

    public static void r(Context context, Uri uri, boolean z10, boolean z11, boolean z12, d dVar, String str, boolean z13, boolean z14, boolean z15) {
        String str2;
        String str3;
        boolean z16;
        boolean z17;
        char c10;
        String str4;
        d dVar2;
        Uri uriNormalizeScheme;
        boolean z18;
        String stringExtra;
        LaunchActivity launchActivity;
        String lowerCase;
        String hostAuthority;
        xe.b bVarC;
        Intent intent;
        df.b bVar;
        if (context == null || uri == null) {
            return;
        }
        int i10 = UserConfig.selectedAccount;
        boolean[] zArr = {false};
        boolean zF = f(uri, false, zArr);
        if (str != null) {
            switch (str) {
                case "brave-browser":
                case "brave":
                    str2 = "com.brave.browser";
                    str3 = str2;
                    break;
                case "google-chrome":
                case "chrome":
                    str2 = "com.android.chrome";
                    str3 = str2;
                    break;
                case "microsoft-edge":
                case "edge":
                    str2 = "com.microsoft.emmx";
                    str3 = str2;
                    break;
                case "tor-browser":
                case "tor":
                    str2 = "org.torproject.torbrowser";
                    str3 = str2;
                    break;
                case "duckduckgo-browser":
                case "duckduckgo":
                    str2 = "com.duckduckgo.mobile.android";
                    str3 = str2;
                    break;
                case "firefox":
                case "mozilla-firefox":
                    str2 = "org.mozilla.firefox";
                    str3 = str2;
                    break;
                case "samsung-browser":
                case "samsung":
                    str2 = "com.sec.android.app.sbrowser";
                    str3 = str2;
                    break;
                case "kiwi-browser":
                case "kiwi":
                    str2 = "com.kiwibrowser.browser";
                    str3 = str2;
                    break;
                case "opera-mini":
                    str2 = "com.opera.mini.native";
                    str3 = str2;
                    break;
                case "uc":
                case "uc-browser":
                    str2 = "com.UCMobile.intl";
                    str3 = str2;
                    break;
                case "opera":
                    str2 = "com.opera.browser";
                    str3 = str2;
                    break;
                case "vivaldi":
                case "vivaldi-browser":
                    str2 = "com.vivaldi.browser";
                    str3 = str2;
                    break;
                default:
                    str3 = null;
                    break;
            }
        } else {
            str3 = null;
        }
        if (str3 != null) {
            z17 = false;
            z16 = false;
        } else {
            z16 = z10;
            z17 = z11;
        }
        if (z17) {
            try {
                String hostAuthority2 = AndroidUtilities.getHostAuthority(uri);
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser() == null) {
                    dVar2 = dVar;
                    str4 = str3;
                } else {
                    if (h(hostAuthority2, true, false)) {
                        c10 = 0;
                    } else {
                        c10 = 0;
                        if (!"telegram.org".equalsIgnoreCase(hostAuthority2) || (!uri.toString().toLowerCase().contains("telegram.org/faq") && !uri.toString().toLowerCase().contains("telegram.org/privacy") && !uri.toString().toLowerCase().contains("telegram.org/blog"))) {
                            dVar2 = dVar;
                            str4 = str3;
                        }
                    }
                    String str5 = str3;
                    try {
                        b2[] b2VarArr = new b2[1];
                        b2VarArr[c10] = new b2(context, 3, null);
                        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                        getwebpagepreview.message = uri.toString();
                        str4 = str5;
                        dVar2 = dVar;
                        try {
                            int iSendRequest = ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(getwebpagepreview, new j0(dVar2, b2VarArr, i10, uri, context, z16));
                            if (dVar2 != null) {
                                dVar2.d();
                                return;
                            } else {
                                try {
                                    AndroidUtilities.runOnUIThread(new a(b2VarArr, iSendRequest, 0), 1000L);
                                    return;
                                } catch (Exception unused) {
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        str4 = str5;
                        dVar2 = dVar;
                    }
                }
            } catch (Exception unused4) {
            }
        } else {
            dVar2 = dVar;
            str4 = str3;
        }
        try {
            if (uri.getScheme() != null) {
                try {
                    lowerCase = uri.getScheme().toLowerCase();
                } catch (Exception e9) {
                    e = e9;
                    uriNormalizeScheme = uri;
                    FileLog.e(e);
                    if (z14) {
                        try {
                            if (BubbleActivity.W != null) {
                                if (i(uriNormalizeScheme.toString())) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                            } else if (i(uriNormalizeScheme.toString())) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    } else if (i(uriNormalizeScheme.toString())) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (uriNormalizeScheme.getScheme() != null) {
                        uriNormalizeScheme.getScheme().equalsIgnoreCase("intent");
                    }
                    if (!zF) {
                    }
                    if (z18) {
                        m(context, uriNormalizeScheme.toString(), z13, str4);
                        return;
                    }
                    if (l(context, uriNormalizeScheme.toString(), z13)) {
                    }
                    if (uriNormalizeScheme.getScheme() != null) {
                        stringExtra = Intent.parseUri(uriNormalizeScheme.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            uriNormalizeScheme = Uri.parse(stringExtra);
                        }
                    }
                    n(uriNormalizeScheme.toString());
                }
            } else {
                lowerCase = "";
            }
            String str6 = lowerCase;
            if (str6 == null || !str6.contains(".")) {
                if ("http".equals(str6) || "https".equals(str6)) {
                    try {
                        uriNormalizeScheme = uri.normalizeScheme();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        uriNormalizeScheme = uri;
                        hostAuthority = AndroidUtilities.getHostAuthority(uriNormalizeScheme.toString().toLowerCase());
                        if (AccountInstance.getInstance(i10).getMessagesController().autologinDomains.contains(hostAuthority)) {
                            uriNormalizeScheme = uriNormalizeScheme.buildUpon().appendQueryParameter("autologin_token", URLEncoder.encode(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().autologinToken, "UTF-8")).build();
                        }
                        if (z16) {
                            if (!e()) {
                                if (MessagesController.getInstance(i10).authDomains.contains(hostAuthority)) {
                                    Intent intent2 = new Intent("android.intent.action.VIEW", uriNormalizeScheme);
                                    intent2.addFlags(268435456);
                                    ApplicationLoader.applicationContext.startActivity(intent2);
                                    return;
                                }
                                Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShareBroadcastReceiver.class);
                                intent3.setAction("android.intent.action.SEND");
                                PendingIntent broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, new Intent(ApplicationLoader.applicationContext, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                                bVarC = c();
                                intent = new Intent("android.intent.action.VIEW");
                                if (bVarC != null) {
                                    intent.setPackage(((ComponentName) bVarC.f49393c).getPackageName());
                                }
                                Bundle bundle = new Bundle();
                                if (bVarC == null) {
                                    bVar = null;
                                } else {
                                    bVar = (df.b) bVarC.f49392b;
                                }
                                bundle.putBinder("android.support.customtabs.extra.SESSION", bVar);
                                intent.putExtras(bundle);
                                String string = LocaleController.getString(R.string.CopyLink);
                                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", string);
                                bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast);
                                arrayList.add(bundle2);
                                intent.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", g6.w0(null, g6.S8, false));
                                intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.msg_filled_shareout);
                                String string2 = LocaleController.getString(R.string.ShareFile);
                                try {
                                    PendingIntent broadcast2 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent3, 33554432);
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putInt("android.support.customtabs.customaction.ID", 0);
                                    bundle3.putParcelable("android.support.customtabs.customaction.ICON", bitmapDecodeResource);
                                    bundle3.putString("android.support.customtabs.customaction.DESCRIPTION", string2);
                                    bundle3.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast2);
                                    intent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle3);
                                    intent.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", true);
                                    intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
                                    intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                                    intent.addFlags(268435456);
                                    intent.setData(uriNormalizeScheme);
                                    context.startActivity(intent, null);
                                    return;
                                } catch (Exception e12) {
                                    e = e12;
                                }
                            }
                        }
                        if (z14) {
                            if (BubbleActivity.W != null) {
                                if (i(uriNormalizeScheme.toString())) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                            } else if (i(uriNormalizeScheme.toString())) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                        } else if (i(uriNormalizeScheme.toString())) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (uriNormalizeScheme.getScheme() != null) {
                            uriNormalizeScheme.getScheme().equalsIgnoreCase("intent");
                        }
                        if (!zF) {
                        }
                        if (z18) {
                            m(context, uriNormalizeScheme.toString(), z13, str4);
                            return;
                        }
                        if (l(context, uriNormalizeScheme.toString(), z13)) {
                            if (uriNormalizeScheme.getScheme() != null) {
                                stringExtra = Intent.parseUri(uriNormalizeScheme.toString(), 1).getStringExtra("browser_fallback_url");
                                if (!TextUtils.isEmpty(stringExtra)) {
                                    uriNormalizeScheme = Uri.parse(stringExtra);
                                }
                            }
                            n(uriNormalizeScheme.toString());
                        }
                    }
                } else {
                    uriNormalizeScheme = uri;
                }
                try {
                    hostAuthority = AndroidUtilities.getHostAuthority(uriNormalizeScheme.toString().toLowerCase());
                    if (AccountInstance.getInstance(i10).getMessagesController().autologinDomains.contains(hostAuthority)) {
                        uriNormalizeScheme = uriNormalizeScheme.buildUpon().appendQueryParameter("autologin_token", URLEncoder.encode(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().autologinToken, "UTF-8")).build();
                    }
                    if (z16 && (uriNormalizeScheme == null || !MessagesController.getInstance(i10).isWebBrowserOpenInApp(uriNormalizeScheme.toString()))) {
                        if (!e() && MessagesController.getInstance(i10).isWebBrowserUseCustomTabs() && !zF && !str6.equals("tel") && !i(uriNormalizeScheme.toString()) && (zArr[0] || !l(context, uriNormalizeScheme.toString(), false) || !d(context, uriNormalizeScheme.toString()))) {
                            if (MessagesController.getInstance(i10).authDomains.contains(hostAuthority)) {
                                Intent intent4 = new Intent("android.intent.action.VIEW", uriNormalizeScheme);
                                intent4.addFlags(268435456);
                                ApplicationLoader.applicationContext.startActivity(intent4);
                                return;
                            }
                            Intent intent5 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShareBroadcastReceiver.class);
                            intent5.setAction("android.intent.action.SEND");
                            PendingIntent broadcast3 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, new Intent(ApplicationLoader.applicationContext, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                            bVarC = c();
                            intent = new Intent("android.intent.action.VIEW");
                            if (bVarC != null) {
                                intent.setPackage(((ComponentName) bVarC.f49393c).getPackageName());
                            }
                            Bundle bundle4 = new Bundle();
                            if (bVarC == null) {
                                bVar = null;
                            } else {
                                bVar = (df.b) bVarC.f49392b;
                            }
                            bundle4.putBinder("android.support.customtabs.extra.SESSION", bVar);
                            intent.putExtras(bundle4);
                            String string3 = LocaleController.getString(R.string.CopyLink);
                            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                            Bundle bundle5 = new Bundle();
                            bundle5.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", string3);
                            bundle5.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast3);
                            arrayList2.add(bundle5);
                            intent.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", g6.w0(null, g6.S8, false));
                            intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                            Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.msg_filled_shareout);
                            String string4 = LocaleController.getString(R.string.ShareFile);
                            PendingIntent broadcast4 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent5, 33554432);
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("android.support.customtabs.customaction.ID", 0);
                            bundle6.putParcelable("android.support.customtabs.customaction.ICON", bitmapDecodeResource2);
                            bundle6.putString("android.support.customtabs.customaction.DESCRIPTION", string4);
                            bundle6.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast4);
                            intent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle6);
                            intent.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", true);
                            intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList2);
                            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                            intent.addFlags(268435456);
                            intent.setData(uriNormalizeScheme);
                            context.startActivity(intent, null);
                            return;
                        }
                    }
                } catch (Exception e13) {
                    e = e13;
                }
                if (z14) {
                    if (BubbleActivity.W != null && (((uriNormalizeScheme != null && MessagesController.getInstance(i10).isWebBrowserOpenInApp(uriNormalizeScheme.toString())) || e()) && TextUtils.isEmpty(str4) && (uriNormalizeScheme.getScheme() == null || "https".equals(uriNormalizeScheme.getScheme()) || "http".equals(uriNormalizeScheme.getScheme()) || "tonsite".equals(uriNormalizeScheme.getScheme())))) {
                        z18 = true;
                    } else if (i(uriNormalizeScheme.toString())) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                } else if (i(uriNormalizeScheme.toString())) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (uriNormalizeScheme.getScheme() != null) {
                    uriNormalizeScheme.getScheme().equalsIgnoreCase("intent");
                }
                if (!zF && (launchActivity = LaunchActivity.C1) != null) {
                    k(launchActivity, uriNormalizeScheme.toString(), z12, z15, dVar2);
                    return;
                }
                if (z18) {
                    m(context, uriNormalizeScheme.toString(), z13, str4);
                    return;
                }
                if (l(context, uriNormalizeScheme.toString(), z13)) {
                    if (uriNormalizeScheme.getScheme() != null && uriNormalizeScheme.getScheme().equalsIgnoreCase("intent")) {
                        stringExtra = Intent.parseUri(uriNormalizeScheme.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            uriNormalizeScheme = Uri.parse(stringExtra);
                        }
                    }
                    n(uriNormalizeScheme.toString());
                }
            }
            return;
        } catch (Exception e14) {
            e = e14;
            uriNormalizeScheme = uri;
        }
        FileLog.e(e);
        if (z14) {
            if (BubbleActivity.W != null) {
                if (i(uriNormalizeScheme.toString())) {
                    z18 = true;
                } else {
                    z18 = false;
                }
            } else if (i(uriNormalizeScheme.toString())) {
                z18 = true;
            } else {
                z18 = false;
            }
        } else if (i(uriNormalizeScheme.toString())) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (uriNormalizeScheme.getScheme() != null) {
            uriNormalizeScheme.getScheme().equalsIgnoreCase("intent");
        }
        if (!zF) {
        }
        if (z18) {
            m(context, uriNormalizeScheme.toString(), z13, str4);
            return;
        }
        if (l(context, uriNormalizeScheme.toString(), z13)) {
            if (uriNormalizeScheme.getScheme() != null) {
                stringExtra = Intent.parseUri(uriNormalizeScheme.toString(), 1).getStringExtra("browser_fallback_url");
                if (!TextUtils.isEmpty(stringExtra)) {
                    uriNormalizeScheme = Uri.parse(stringExtra);
                }
            }
            n(uriNormalizeScheme.toString());
        }
    }

    public static void s(Context context, String str) {
        if (str == null) {
            return;
        }
        p(context, Uri.parse(str), true, true);
    }

    public static void t(LaunchActivity launchActivity, Uri uri) {
        p(launchActivity, uri, true, true);
    }

    public static void u(Context context, String str) {
        if (str == null) {
            return;
        }
        r(context, Uri.parse(str), false, true, false, null, null, false, false, false);
    }

    public static String v(Uri uri, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = uri.getScheme();
        }
        if (str != null) {
            sb2.append(str);
            sb2.append("://");
        }
        if (str2 == null) {
            if (uri.getUserInfo() != null) {
                sb2.append(uri.getUserInfo());
                sb2.append("@");
            }
        } else if (!TextUtils.isEmpty(str2)) {
            sb2.append(str2);
            sb2.append("@");
        }
        if (str3 != null) {
            sb2.append(str3);
        } else if (uri.getHost() != null) {
            sb2.append(uri.getHost());
        }
        if (uri.getPort() != -1) {
            sb2.append(":");
            sb2.append(uri.getPort());
        }
        if (str4 != null) {
            sb2.append(str4);
        } else if (uri.getPath() != null) {
            sb2.append(uri.getPath());
        }
        if (uri.getQuery() != null) {
            sb2.append("?");
            sb2.append(uri.getQuery());
        }
        if (uri.getFragment() != null) {
            sb2.append("#");
            sb2.append(uri.getFragment());
        }
        return sb2.toString();
    }

    public static String w(Uri uri, String str) {
        return v(uri, null, null, str, null);
    }

    public static void x(Activity activity) {
        if (f49297c == null) {
            return;
        }
        WeakReference weakReference = f49298e;
        if ((weakReference == null ? null : (Activity) weakReference.get()) == activity) {
            f49298e.clear();
        }
        try {
            activity.unbindService(f49297c);
        } catch (Exception unused) {
        }
        f49296b = null;
        f49295a = null;
    }

    public static boolean y(String str) {
        return h(str, false, true) || str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") || str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") || str.matches("^(https://)?fragment\\.com(/.*|$)");
    }
}
