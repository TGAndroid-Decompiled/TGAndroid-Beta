package sf;

import ag.e;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.p1;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.b3;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i4;
import org.telegram.ui.l3;
import org.telegram.ui.y2;
import p4.q;
public abstract class c {
    public static tf.b f54710a;
    public static q f54711b;
    public static bg.a f54712c;
    public static String d;
    public static WeakReference f54713e;
    public static Pattern f54714f;

    public static String A(String str) {
        String[] split;
        String substring;
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        boolean z11 = false;
        for (String str2 : str.split("&", -1)) {
            int indexOf = str2.indexOf(61);
            if (indexOf < 0) {
                substring = str2;
            } else {
                substring = str2.substring(0, indexOf);
            }
            int i3 = 0;
            while (i3 < 4) {
                String decode = Uri.decode(substring);
                if (TextUtils.equals(decode, substring)) {
                    break;
                }
                i3++;
                substring = decode;
            }
            while (substring.startsWith("?")) {
                substring = substring.substring(1);
            }
            String lowerCase = substring.toLowerCase();
            if (!lowerCase.startsWith("tgwebauth") && !lowerCase.equals("autologin_token")) {
                if (!z10) {
                    sb2.append('&');
                }
                sb2.append(str2);
                z10 = false;
            } else {
                z11 = true;
            }
        }
        if (!z11) {
            return null;
        }
        return sb2.toString();
    }

    public static java.lang.String a(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: sf.c.a(java.lang.String):java.lang.String");
    }

    public static String b(String str) {
        if (str.indexOf(37) >= 0) {
            String decode = Uri.decode(str);
            if (decode.indexOf(65533) < 0) {
                StringBuilder sb2 = new StringBuilder(decode.length());
                int i3 = 0;
                while (i3 < decode.length()) {
                    int codePointAt = decode.codePointAt(i3);
                    int charCount = Character.charCount(codePointAt);
                    if (!Character.isISOControl(codePointAt) && Character.getType(codePointAt) != 16) {
                        sb2.append((CharSequence) decode, i3, i3 + charCount);
                    } else {
                        sb2.append(Uri.encode(decode.substring(i3, i3 + charCount)));
                    }
                    i3 += charCount;
                }
                return sb2.toString();
            }
        }
        return str;
    }

    public static String c(String str) {
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
            Matcher matcher = LaunchActivity.F1.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static String d(String str, boolean z10) {
        String host;
        if (str == null) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse.getHost() == null) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            if (parse.getScheme() != null) {
                sb2.append(parse.getScheme());
                sb2.append("://");
            }
            if (parse.getEncodedUserInfo() != null) {
                sb2.append(parse.getEncodedUserInfo());
                sb2.append("@");
            }
            if (z10) {
                host = a(parse.getHost());
            } else {
                host = parse.getHost();
            }
            sb2.append(host);
            if (parse.getPort() != -1) {
                sb2.append(":");
                sb2.append(parse.getPort());
            }
            if (parse.getEncodedPath() != null) {
                sb2.append(b(parse.getEncodedPath()));
            }
            if (parse.getEncodedQuery() != null) {
                sb2.append("?");
                sb2.append(b(parse.getEncodedQuery()));
            }
            if (parse.getEncodedFragment() != null) {
                sb2.append("#");
                sb2.append(b(parse.getEncodedFragment()));
            }
            return sb2.toString();
        } catch (Exception e10) {
            a8.g(e10, false);
            return str;
        }
    }

    public static tf.b e() {
        q qVar = f54711b;
        tf.b bVar = null;
        if (qVar == null) {
            f54710a = null;
        } else if (f54710a == null) {
            nb.a aVar = new nb.a(23);
            e eVar = (e) qVar.f53181a;
            ag.b bVar2 = new ag.b(aVar);
            try {
                if (((ag.c) eVar).H0(bVar2)) {
                    bVar = new tf.b(bVar2, (ComponentName) qVar.f53182b);
                }
            } catch (RemoteException unused) {
            }
            f54710a = bVar;
            new WeakReference(bVar);
        }
        return f54710a;
    }

    public static boolean f(android.content.Context r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: sf.c.f(android.content.Context, java.lang.String):boolean");
    }

    public static boolean g(Uri uri, boolean z10, boolean[] zArr) {
        String K0;
        String str;
        String str2;
        String str3;
        Typeface typeface = g0.f22580a;
        if (uri == null) {
            K0 = null;
        } else {
            K0 = g0.K0(uri.toString(), false);
        }
        String str4 = "";
        if (K0 == null) {
            str = "";
        } else {
            str = K0.toLowerCase();
        }
        if (hp.s1(h10.f22829t0).f23006f4.contains(str)) {
            if (zArr != null) {
                zArr[0] = true;
                return false;
            }
        } else {
            Matcher matcher = LaunchActivity.F1.matcher(str);
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
                    List<ResolveInfo> queryIntentActivities = t0.f25457b.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
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

    public static boolean h(String str) {
        try {
            return TextUtils.equals(g0.K0(str, false), hp.s1(h10.f22829t0).V2);
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public static boolean i(String str, boolean z10, boolean z11) {
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

    public static boolean j(String str) {
        String K0 = g0.K0(str, true);
        if (K0 != null && (K0.endsWith(".ton") || K0.endsWith(".adnl"))) {
            return true;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite")) {
            return true;
        }
        return false;
    }

    public static boolean k(String str) {
        boolean matches;
        if (f54714f == null) {
            f54714f = Pattern.compile("^[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9\\-\\_]+$");
        }
        String K0 = g0.K0(str, true);
        if (K0 != null && (K0.endsWith(".ton") || K0.endsWith(".adnl"))) {
            matches = f54714f.matcher(K0).matches();
        } else {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite")) {
                matches = f54714f.matcher(parse.getScheme()).matches();
            } else {
                return false;
            }
        }
        return !matches;
    }

    public static boolean l(Context context, String str, boolean z10, boolean z11, b bVar) {
        LaunchActivity launchActivity;
        if (str == null) {
            return false;
        }
        if (g0.W(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) g0.W(context);
        } else {
            launchActivity = LaunchActivity.K1;
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
        launchActivity.f0(intent, bVar);
        return true;
    }

    public static boolean m(Context context, String str, boolean z10) {
        String scheme;
        String host;
        String encodedPath;
        boolean z11;
        Intent intent;
        if (str != null) {
            try {
                if (!j(str) && !g(Uri.parse(str), false, null)) {
                    Uri parse = Uri.parse(str);
                    if (parse.getScheme() == null) {
                        scheme = "https";
                    } else {
                        scheme = parse.getScheme();
                    }
                    if (parse.getHost() != null) {
                        host = parse.getHost().toLowerCase();
                    } else {
                        host = parse.getHost();
                    }
                    if (TextUtils.isEmpty(parse.getEncodedPath())) {
                        encodedPath = "/";
                    } else {
                        encodedPath = parse.getEncodedPath();
                    }
                    String w10 = w(parse, scheme, null, host, encodedPath);
                    Uri parse2 = Uri.parse(w10);
                    if (!w10.startsWith("intent://") && (parse2.getScheme() == null || !parse2.getScheme().equalsIgnoreCase("intent"))) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11 || z10) {
                        if (z11) {
                            intent = Intent.parseUri(parse2.toString(), 1);
                            intent.addCategory("android.intent.category.BROWSABLE");
                            intent.setComponent(null);
                            Intent selector = intent.getSelector();
                            if (selector != null) {
                                selector.addCategory("android.intent.category.BROWSABLE");
                                selector.setComponent(null);
                            }
                        } else {
                            intent = new Intent("android.intent.action.VIEW", parse2);
                        }
                        if (!z11 && Build.VERSION.SDK_INT >= 30) {
                            intent.addCategory("android.intent.category.BROWSABLE");
                            intent.addCategory("android.intent.category.DEFAULT");
                            intent.addFlags(268435456);
                            intent.addFlags(1024);
                        } else if (!z11 && !f(context, w10)) {
                        }
                        context.startActivity(intent);
                        return true;
                    }
                }
            } catch (ActivityNotFoundException e10) {
                a8.g(e10, false);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        return false;
    }

    public static boolean n(Context context, String str, boolean z10, String str2) {
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
                        intent.addCategory("android.intent.category.BROWSABLE");
                        intent.setComponent(null);
                        Intent selector = intent.getSelector();
                        if (selector != null) {
                            selector.addCategory("android.intent.category.BROWSABLE");
                            selector.setComponent(null);
                        }
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
                a8.g(e10, true);
                return false;
            }
        }
        return false;
    }

    public static void o(String str) {
        b3 O;
        a3 a3Var;
        String openURL;
        l3[] l3VarArr;
        l3 l3Var;
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null && (O = launchActivity.O()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<a3> tabs = O.getTabs();
                for (int i3 = 0; i3 < tabs.size(); i3++) {
                    a3Var = tabs.get(i3);
                    i4 i4Var = a3Var.J;
                    if (i4Var != null && !i4Var.f46084e0.isEmpty()) {
                        Object h = p1.h(1, a3Var.J.f46084e0);
                        if (h instanceof y2) {
                            org.telegram.ui.web.t0 t0Var = ((y2) h).f27352b;
                            if (t0Var == null && (l3VarArr = a3Var.J.f46100v0) != null && (l3Var = l3VarArr[0]) != null) {
                                t0Var = l3Var.getWebView();
                            }
                            if (t0Var != null) {
                                if (t0Var.canGoBack()) {
                                    openURL = t0Var.getUrl();
                                } else {
                                    openURL = t0Var.getOpenURL();
                                }
                                if (TextUtils.equals(b3.p(openURL), b3.p(str))) {
                                    O.e(a3Var);
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
            a3Var = null;
            if (a3Var != null) {
                return;
            }
        }
        d2 T = LaunchActivity.T();
        if (T != null && T.getArticleViewer() != null) {
            T.getArticleViewer().L(null, null, null, str);
            return;
        }
        if (T != null && (T.getParentLayout() instanceof ActionBarLayout)) {
            T = ((ActionBarLayout) T.getParentLayout()).getSheetFragment();
        }
        if (T == null) {
            return;
        }
        T.createArticleViewer(false).L(null, null, null, str);
    }

    public static void p(Activity activity, String str, boolean z10) {
        if (activity != null && str != null) {
            q(activity, Uri.parse(str), z10, true);
        }
    }

    public static void q(Context context, Uri uri, boolean z10, boolean z11) {
        s(context, uri, z10, z11, false, null, null, false, true, false, false);
    }

    public static void r(Context context, Uri uri, boolean z10, boolean z11, b bVar) {
        s(context, uri, z10, z11, false, bVar, null, false, true, false, false);
    }

    public static void s(android.content.Context r19, android.net.Uri r20, boolean r21, boolean r22, boolean r23, sf.b r24, java.lang.String r25, boolean r26, boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: sf.c.s(android.content.Context, android.net.Uri, boolean, boolean, boolean, sf.b, java.lang.String, boolean, boolean, boolean, boolean):void");
    }

    public static void t(Context context, String str) {
        if (str == null) {
            return;
        }
        q(context, Uri.parse(str), true, true);
    }

    public static void u(LaunchActivity launchActivity, Uri uri) {
        q(launchActivity, uri, true, true);
    }

    public static void v(Context context, String str, boolean z10) {
        if (str == null) {
            return;
        }
        s(context, Uri.parse(str), false, true, false, null, null, false, false, false, z10);
    }

    public static String w(Uri uri, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = uri.getScheme();
        }
        if (str != null) {
            sb2.append(str);
            sb2.append("://");
        }
        if (str2 == null) {
            if (uri.getEncodedUserInfo() != null) {
                sb2.append(uri.getEncodedUserInfo());
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
        } else if (uri.getEncodedPath() != null) {
            sb2.append(uri.getEncodedPath());
        }
        if (uri.getEncodedQuery() != null) {
            sb2.append("?");
            sb2.append(uri.getEncodedQuery());
        }
        if (uri.getEncodedFragment() != null) {
            sb2.append("#");
            sb2.append(uri.getEncodedFragment());
        }
        return sb2.toString();
    }

    public static String x(Uri uri, String str) {
        return w(uri, null, null, str, null);
    }

    public static void y(Activity activity) {
        Activity activity2;
        if (f54712c == null) {
            return;
        }
        WeakReference weakReference = f54713e;
        if (weakReference == null) {
            activity2 = null;
        } else {
            activity2 = (Activity) weakReference.get();
        }
        if (activity2 == activity) {
            f54713e.clear();
        }
        try {
            activity.unbindService(f54712c);
        } catch (Exception unused) {
        }
        f54711b = null;
        f54710a = null;
    }

    public static boolean z(String str) {
        if (!i(str, false, true) && !str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") && !str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") && !str.matches("^(https://)?fragment\\.com(/.*|$)")) {
            return false;
        }
        return true;
    }
}
