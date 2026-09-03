package ze;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import gf.e;
import h7.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kf.k0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d3;
import org.telegram.ui.ez;
import org.telegram.ui.n4;
import org.telegram.ui.r3;
import org.telegram.ui.web.y0;
public abstract class d {
    public static f7.b f47470a;
    public static f7.b f47471b;
    public static hf.a f47472c;
    public static String d;
    public static WeakReference e;
    public static Pattern f47473f;

    public static java.lang.String a(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: ze.d.a(java.lang.String):java.lang.String");
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
            Matcher matcher = LaunchActivity.f31586y1.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static f7.b c() {
        f7.b bVar = f47471b;
        f7.b bVar2 = null;
        if (bVar == null) {
            f47470a = null;
        } else if (f47470a == null) {
            u uVar = new u(27);
            e eVar = (e) bVar.f6001b;
            gf.b bVar3 = new gf.b(uVar);
            try {
                if (((gf.c) eVar).E0(bVar3)) {
                    bVar2 = new f7.b(7, bVar3, (ComponentName) bVar.f6002c);
                }
            } catch (RemoteException unused) {
            }
            f47470a = bVar2;
            new WeakReference(bVar2);
        }
        return f47470a;
    }

    public static boolean d(android.content.Context r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: ze.d.d(android.content.Context, java.lang.String):boolean");
    }

    public static boolean e() {
        ez sheetFragment;
        p2 U = LaunchActivity.U();
        if (U != null && (U.getParentLayout() instanceof ActionBarLayout) && (sheetFragment = ((ActionBarLayout) U.getParentLayout()).getSheetFragment()) != null && sheetFragment.getArticleViewer() != null) {
            return true;
        }
        if (U != null && U.getArticleViewer() != null) {
            return true;
        }
        return false;
    }

    public static boolean f(Uri uri, boolean z4, boolean[] zArr) {
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
            Matcher matcher = LaunchActivity.f31586y1.matcher(str);
            if (matcher.find()) {
                StringBuilder sb = new StringBuilder("https://t.me/");
                sb.append(matcher.group(1));
                if (TextUtils.isEmpty(uri.getPath())) {
                    str2 = "";
                } else {
                    str2 = "/" + uri.getPath();
                }
                sb.append(str2);
                if (TextUtils.isEmpty(uri.getQuery())) {
                    str3 = "";
                } else {
                    str3 = "?" + uri.getQuery();
                }
                sb.append(str3);
                uri = Uri.parse(sb.toString());
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
                        if (!z4) {
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
                    if ((!"telegram.org".equals(str) || uri.getPath() == null || !uri.getPath().startsWith("/blog/")) && (!z4 || (!str.endsWith("telegram.org") && !str.endsWith("telegra.ph") && !str.endsWith("telesco.pe")))) {
                    }
                } else {
                    String path2 = uri.getPath();
                    if (path2 != null && path2.length() > 1) {
                        if (!z4) {
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

    public static boolean g(String str) {
        try {
            return TextUtils.equals(AndroidUtilities.getHostAuthority(str), MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix);
        } catch (Exception e6) {
            FileLog.e(e6);
            return false;
        }
    }

    public static boolean h(String str, boolean z4, boolean z10) {
        String str2;
        if (z4) {
            if (!str.equals("telegra.ph") && !str.equals("te.legra.ph") && !str.equals("graph.org")) {
                return false;
            }
            return true;
        }
        StringBuilder sb = new StringBuilder("^(https");
        if (z10) {
            str2 = "";
        } else {
            str2 = "?";
        }
        sb.append(str2);
        sb.append("://)?(te\\.?legra\\.ph|graph\\.org)(/.*|$)");
        return str.matches(sb.toString());
    }

    public static boolean i(String str) {
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

    public static boolean j(String str) {
        boolean matches;
        if (f47473f == null) {
            f47473f = Pattern.compile("^[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9\\-\\_]+$");
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority != null && (hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            matches = f47473f.matcher(hostAuthority).matches();
        } else {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite")) {
                matches = f47473f.matcher(parse.getScheme()).matches();
            } else {
                return false;
            }
        }
        return !matches;
    }

    public static boolean k(Context context, String str, boolean z4, boolean z10, c cVar) {
        LaunchActivity launchActivity;
        if (str == null) {
            return false;
        }
        if (AndroidUtilities.findActivity(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) AndroidUtilities.findActivity(context);
        } else {
            launchActivity = LaunchActivity.D1;
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
        intent.putExtra("force_not_internal_apps", z4);
        intent.putExtra("force_request", z10);
        launchActivity.e0(intent, cVar);
        return true;
    }

    public static boolean l(android.content.Context r5, java.lang.String r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: ze.d.l(android.content.Context, java.lang.String, boolean):boolean");
    }

    public static boolean m(Context context, String str, boolean z4, String str2) {
        boolean z10;
        Intent intent;
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || z4) {
                    if (z10) {
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
            } catch (Exception e6) {
                FileLog.e(e6);
                return false;
            }
        }
        return false;
    }

    public static void n(String str) {
        n3 P;
        m3 m3Var;
        String openURL;
        r3[] r3VarArr;
        r3 r3Var;
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null && (P = launchActivity.P()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<m3> tabs = P.getTabs();
                for (int i10 = 0; i10 < tabs.size(); i10++) {
                    m3Var = tabs.get(i10);
                    n4 n4Var = m3Var.J;
                    if (n4Var != null && !n4Var.f36359a0.isEmpty()) {
                        Object i11 = k0.i(1, m3Var.J.f36359a0);
                        if (i11 instanceof d3) {
                            y0 y0Var = ((d3) i11).f20424b;
                            if (y0Var == null && (r3VarArr = m3Var.J.f36375r0) != null && (r3Var = r3VarArr[0]) != null) {
                                y0Var = r3Var.getWebView();
                            }
                            if (y0Var != null) {
                                if (y0Var.canGoBack()) {
                                    openURL = y0Var.getUrl();
                                } else {
                                    openURL = y0Var.getOpenURL();
                                }
                                if (TextUtils.equals(n3.p(openURL), n3.p(str))) {
                                    P.e(m3Var);
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
            m3Var = null;
            if (m3Var != null) {
                return;
            }
        }
        p2 U = LaunchActivity.U();
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

    public static void o(Activity activity, String str, boolean z4) {
        if (activity != null && str != null) {
            p(activity, Uri.parse(str), z4, true);
        }
    }

    public static void p(Context context, Uri uri, boolean z4, boolean z10) {
        r(context, uri, z4, z10, false, null, null, false, true, false);
    }

    public static void q(Context context, Uri uri, boolean z4, boolean z10, c cVar) {
        r(context, uri, z4, z10, false, cVar, null, false, true, false);
    }

    public static void r(android.content.Context r19, android.net.Uri r20, boolean r21, boolean r22, boolean r23, ze.c r24, java.lang.String r25, boolean r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: ze.d.r(android.content.Context, android.net.Uri, boolean, boolean, boolean, ze.c, java.lang.String, boolean, boolean, boolean):void");
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
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = uri.getScheme();
        }
        if (str != null) {
            sb.append(str);
            sb.append("://");
        }
        if (str2 == null) {
            if (uri.getUserInfo() != null) {
                sb.append(uri.getUserInfo());
                sb.append("@");
            }
        } else if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
            sb.append("@");
        }
        if (str3 == null) {
            if (uri.getHost() != null) {
                sb.append(uri.getHost());
            }
        } else {
            sb.append(str3);
        }
        if (uri.getPort() != -1) {
            sb.append(":");
            sb.append(uri.getPort());
        }
        if (str4 != null) {
            sb.append(str4);
        } else if (uri.getPath() != null) {
            sb.append(uri.getPath());
        }
        if (uri.getQuery() != null) {
            sb.append("?");
            sb.append(uri.getQuery());
        }
        if (uri.getFragment() != null) {
            sb.append("#");
            sb.append(uri.getFragment());
        }
        return sb.toString();
    }

    public static String w(Uri uri, String str) {
        return v(uri, null, null, str, null);
    }

    public static void x(Activity activity) {
        Activity activity2;
        if (f47472c == null) {
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
            activity.unbindService(f47472c);
        } catch (Exception unused) {
        }
        f47471b = null;
        f47470a = null;
    }

    public static boolean y(String str) {
        if (!h(str, false, true) && !str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") && !str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") && !str.matches("^(https://)?fragment\\.com(/.*|$)")) {
            return false;
        }
        return true;
    }
}
