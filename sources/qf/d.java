package qf;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.r3;
import org.telegram.ui.ActionBar.s3;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.j4;
import org.telegram.ui.m3;
import org.telegram.ui.web.x0;
import org.telegram.ui.y2;
import y9.l;
import yf.f;
public abstract class d {
    public static l f47033a;
    public static yf.c f47034b;
    public static b9.c f47035c;
    public static String d;
    public static WeakReference e;
    public static Pattern f47036f;

    public static java.lang.String a(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: qf.d.a(java.lang.String):java.lang.String");
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
            Matcher matcher = LaunchActivity.D1.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static l c() {
        yf.c cVar = f47034b;
        l lVar = null;
        if (cVar == null) {
            f47033a = null;
        } else if (f47033a == null) {
            qb.a aVar = new qb.a(20);
            f fVar = (f) cVar.f52525a;
            yf.b bVar = new yf.b(aVar);
            try {
                if (((yf.d) fVar).F0(bVar)) {
                    lVar = new l(bVar, (ComponentName) cVar.f52526b);
                }
            } catch (RemoteException unused) {
            }
            f47033a = lVar;
            new WeakReference(lVar);
        }
        return f47033a;
    }

    public static boolean d(android.content.Context r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: qf.d.d(android.content.Context, java.lang.String):boolean");
    }

    public static boolean e(Uri uri, boolean z10, boolean[] zArr) {
        String str;
        String str2;
        String str3;
        String hostAuthority = AndroidUtilities.getHostAuthority(uri);
        String str4 = "";
        if (hostAuthority == null) {
            str = "";
        } else {
            str = hostAuthority.toLowerCase();
        }
        if (MessagesController.getInstance(UserConfig.selectedAccount).authDomains.contains(str)) {
            if (zArr != null) {
                zArr[0] = true;
                return false;
            }
        } else {
            Matcher matcher = LaunchActivity.D1.matcher(str);
            if (matcher.find()) {
                StringBuilder sb2 = new StringBuilder("https://t.me/");
                sb2.append(matcher.group(1));
                if (TextUtils.isEmpty(uri.getPath())) {
                    str2 = "";
                } else {
                    str2 = "/" + uri.getPath();
                }
                sb2.append(str2);
                if (TextUtils.isEmpty(uri.getQuery())) {
                    str3 = "";
                } else {
                    str3 = "?" + uri.getQuery();
                }
                sb2.append(str3);
                uri = Uri.parse(sb2.toString());
                String host = uri.getHost();
                if (host != null) {
                    str4 = host.toLowerCase();
                }
                str = str4;
            }
            if ("ton".equals(uri.getScheme())) {
                try {
                    List<ResolveInfo> queryIntentActivities = ApplicationLoader.applicationContext.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
                    if (queryIntentActivities != null) {
                        if (queryIntentActivities.size() >= 1) {
                        }
                    }
                } catch (Exception unused) {
                }
                return true;
            }
            if (!"tg".equals(uri.getScheme())) {
                if ("telegram.dog".equals(str)) {
                    String path = uri.getPath();
                    if (path != null && path.length() > 1) {
                        if (!z10) {
                            String lowerCase = path.substring(1).toLowerCase();
                            if (lowerCase.startsWith("blog") || lowerCase.equals("iv") || lowerCase.startsWith("faq") || lowerCase.equals("apps") || lowerCase.startsWith("s/")) {
                                if (zArr != null) {
                                    zArr[0] = true;
                                    return false;
                                }
                            }
                        }
                    }
                } else if (!"telegram.me".equals(str) && !"t.me".equals(str)) {
                    if ((!"telegram.org".equals(str) || uri.getPath() == null || !uri.getPath().startsWith("/blog/")) && (!z10 || (!str.endsWith("telegram.org") && !str.endsWith("telegra.ph") && !str.endsWith("telesco.pe")))) {
                    }
                } else {
                    String path2 = uri.getPath();
                    if (path2 != null && path2.length() > 1) {
                        if (!z10) {
                            String lowerCase2 = path2.substring(1).toLowerCase();
                            if (lowerCase2.equals("iv") || lowerCase2.startsWith("s/")) {
                                if (zArr != null) {
                                    zArr[0] = true;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean f(String str) {
        try {
            return TextUtils.equals(AndroidUtilities.getHostAuthority(str), MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix);
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    public static boolean g(String str, boolean z10, boolean z11) {
        String str2;
        if (z10) {
            if (!str.equals("telegra.ph") && !str.equals("te.legra.ph") && !str.equals("graph.org")) {
                return false;
            }
            return true;
        }
        StringBuilder sb2 = new StringBuilder("^(https");
        if (z11) {
            str2 = "";
        } else {
            str2 = "?";
        }
        sb2.append(str2);
        sb2.append("://)?(te\\.?legra\\.ph|graph\\.org)(/.*|$)");
        return str.matches(sb2.toString());
    }

    public static boolean h(String str) {
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority != null && (hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            return true;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite")) {
            return true;
        }
        return false;
    }

    public static boolean i(String str) {
        boolean matches;
        if (f47036f == null) {
            f47036f = Pattern.compile("^[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9\\-\\_]+$");
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority != null && (hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            matches = f47036f.matcher(hostAuthority).matches();
        } else {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite")) {
                matches = f47036f.matcher(parse.getScheme()).matches();
            } else {
                return false;
            }
        }
        return !matches;
    }

    public static boolean j(Context context, String str, boolean z10, boolean z11, c cVar) {
        LaunchActivity launchActivity;
        if (str == null) {
            return false;
        }
        if (AndroidUtilities.findActivity(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) AndroidUtilities.findActivity(context);
        } else {
            launchActivity = LaunchActivity.I1;
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
        launchActivity.g0(intent, cVar);
        return true;
    }

    public static boolean k(android.content.Context r5, java.lang.String r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: qf.d.k(android.content.Context, java.lang.String, boolean):boolean");
    }

    public static boolean l(Context context, String str, boolean z10, String str2) {
        boolean z11;
        Intent intent;
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent")) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || z10) {
                    if (z11) {
                        intent = Intent.parseUri(parse.toString(), 1);
                    } else {
                        intent = new Intent("android.intent.action.VIEW", parse);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setPackage(str2);
                    }
                    intent.putExtra("create_new_tab", true);
                    intent.putExtra("com.android.browser.application_id", context.getPackageName());
                    context.startActivity(intent);
                    return true;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return false;
            }
        }
        return false;
    }

    public static void m(String str) {
        s3 P;
        r3 r3Var;
        String openURL;
        m3[] m3VarArr;
        m3 m3Var;
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null && (P = launchActivity.P()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<r3> tabs = P.getTabs();
                for (int i10 = 0; i10 < tabs.size(); i10++) {
                    r3Var = tabs.get(i10);
                    j4 j4Var = r3Var.J;
                    if (j4Var != null && !j4Var.f40430d0.isEmpty()) {
                        Object g7 = ic.a.g(1, r3Var.J.f40430d0);
                        if (g7 instanceof y2) {
                            x0 x0Var = ((y2) g7).f23003b;
                            if (x0Var == null && (m3VarArr = r3Var.J.f40446u0) != null && (m3Var = m3VarArr[0]) != null) {
                                x0Var = m3Var.getWebView();
                            }
                            if (x0Var != null) {
                                if (x0Var.canGoBack()) {
                                    openURL = x0Var.getUrl();
                                } else {
                                    openURL = x0Var.getOpenURL();
                                }
                                if (TextUtils.equals(s3.p(openURL), s3.p(str))) {
                                    P.e(r3Var);
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            r3Var = null;
            if (r3Var != null) {
                return;
            }
        }
        r2 U = LaunchActivity.U();
        if (U != null && U.getArticleViewer() != null) {
            U.getArticleViewer().N(null, null, null, str);
            return;
        }
        if (U != null && (U.getParentLayout() instanceof ActionBarLayout)) {
            U = ((ActionBarLayout) U.getParentLayout()).getSheetFragment();
        }
        if (U == null) {
            return;
        }
        U.createArticleViewer(false).N(null, null, null, str);
    }

    public static void n(Activity activity, String str, boolean z10) {
        if (activity != null && str != null) {
            o(activity, Uri.parse(str), z10, true);
        }
    }

    public static void o(Context context, Uri uri, boolean z10, boolean z11) {
        q(context, uri, z10, z11, false, null, null, false, true, false);
    }

    public static void p(Context context, Uri uri, boolean z10, boolean z11, c cVar) {
        q(context, uri, z10, z11, false, cVar, null, false, true, false);
    }

    public static void q(android.content.Context r19, android.net.Uri r20, boolean r21, boolean r22, boolean r23, qf.c r24, java.lang.String r25, boolean r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: qf.d.q(android.content.Context, android.net.Uri, boolean, boolean, boolean, qf.c, java.lang.String, boolean, boolean, boolean):void");
    }

    public static void r(Context context, String str) {
        if (str == null) {
            return;
        }
        o(context, Uri.parse(str), true, true);
    }

    public static void s(LaunchActivity launchActivity, Uri uri) {
        o(launchActivity, uri, true, true);
    }

    public static void t(Context context, String str) {
        if (str == null) {
            return;
        }
        q(context, Uri.parse(str), false, true, false, null, null, false, false, false);
    }

    public static String u(Uri uri, String str, String str2, String str3, String str4) {
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
        if (str3 == null) {
            if (uri.getHost() != null) {
                sb2.append(uri.getHost());
            }
        } else {
            sb2.append(str3);
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

    public static String v(Uri uri, String str) {
        return u(uri, null, null, str, null);
    }

    public static void w(Activity activity) {
        Activity activity2;
        if (f47035c == null) {
            return;
        }
        WeakReference weakReference = e;
        if (weakReference == null) {
            activity2 = null;
        } else {
            activity2 = (Activity) weakReference.get();
        }
        if (activity2 == activity) {
            e.clear();
        }
        try {
            activity.unbindService(f47035c);
        } catch (Exception unused) {
        }
        f47034b = null;
        f47033a = null;
    }

    public static boolean x(String str) {
        if (!g(str, false, true) && !str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") && !str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") && !str.matches("^(https://)?fragment\\.com(/.*|$)")) {
            return false;
        }
        return true;
    }
}
