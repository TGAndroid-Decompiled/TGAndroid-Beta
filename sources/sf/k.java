package sf;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import j$.util.concurrent.atomic.DesugarAtomicInteger;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import k7.y;
import o2.l;
import o2.m;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.tf0;
import qh.l6;
public final class k implements g10 {
    public static final Object f47362t = new Object();
    public static k f47363u;
    public static k v;
    public final String f47365b;
    public final String f47366c;
    public final String d;
    public final String f47367e;
    public final String f47368f;
    public final ServerSocket f47369g;
    public WebView f47374m;
    public o2.f f47375n;
    public boolean f47376o;
    public boolean f47377p;
    public boolean f47378q;
    public int f47379r;
    public d f47380s;
    public final Object f47364a = new Object();
    public final ExecutorService h = Executors.newCachedThreadPool();
    public final ExecutorService f47370i = Executors.newSingleThreadExecutor();
    public final AtomicInteger f47371j = new AtomicInteger(1);
    public final HashMap f47372k = new HashMap();
    public final ArrayDeque f47373l = new ArrayDeque();

    public k(String str, String str2, byte[] bArr) {
        this.f47365b = str;
        this.f47366c = str2;
        String concat = "https://".concat(str);
        this.d = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.f47368f = encodeToString;
        String concat2 = "tdesktop-web-proxy-bridge-v1\n".concat(str);
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        String encodeToString2 = Base64.encodeToString(mac.doFinal(concat2.getBytes(StandardCharsets.UTF_8)), 11);
        this.f47367e = concat + "/?bridge=" + encodeToString2 + "#android=" + encodeToString;
        this.f47369g = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void a(k kVar) {
        m mVar;
        synchronized (kVar.f47364a) {
            try {
                if (!kVar.f47377p && kVar.f47374m == null) {
                    h10 h10Var = h10.getInstance();
                    if (h10Var != null && h10Var.isBackground()) {
                        kVar.f47378q = true;
                        return;
                    }
                    kVar.f47378q = false;
                    kVar.e();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        kVar.f47374m = webView;
                        webView.setBackgroundColor(0);
                        WebSettings settings = webView.getSettings();
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(false);
                        settings.setDatabaseEnabled(false);
                        settings.setAllowFileAccess(false);
                        settings.setAllowContentAccess(false);
                        settings.setCacheMode(2);
                        settings.setJavaScriptCanOpenWindowsAutomatically(false);
                        settings.setSupportMultipleWindows(false);
                        settings.setGeolocationEnabled(false);
                        settings.setMediaPlaybackRequiresUserGesture(true);
                        settings.setMixedContentMode(1);
                        if (Build.VERSION.SDK_INT >= 26) {
                            settings.setSafeBrowsingEnabled(true);
                        }
                        webView.setWebViewClient(new tf0(kVar, 2));
                        HashSet hashSet = new HashSet();
                        hashSet.add(kVar.d);
                        h hVar = new h(kVar, 0);
                        boolean z4 = n2.a.f15192a;
                        if (o2.k.f16358c.b()) {
                            if (o2.k.d.b() && n2.a.f15192a) {
                                WeakHashMap weakHashMap = n2.a.f15193b;
                                mVar = (m) weakHashMap.get(webView);
                                if (mVar == null) {
                                    mVar = new m(l.f16359a.createWebView(webView));
                                    weakHashMap.put(webView, mVar);
                                }
                            } else {
                                mVar = new m(l.f16359a.createWebView(webView));
                            }
                            mVar.f16360a.addWebMessageListener("TelegramWebProxy", (String[]) hashSet.toArray(new String[0]), new ee.a(new o5.i(hVar, 25)));
                            webView.loadUrl(kVar.f47367e);
                            return;
                        }
                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        kVar.f();
                    }
                }
            } finally {
            }
        }
    }

    public static void b(k kVar) {
        int andUpdate;
        while (true) {
            try {
                Socket accept = kVar.f47369g.accept();
                accept.setTcpNoDelay(true);
                synchronized (kVar.f47364a) {
                    if (!kVar.f47377p && kVar.f47372k.size() < 64) {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(kVar.f47371j, new Object());
                            if (andUpdate != 0 && !kVar.f47372k.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        j jVar = new j(andUpdate, accept);
                        kVar.f47372k.put(Integer.valueOf(andUpdate), jVar);
                        if (kVar.f47376o) {
                            jVar.f47361e = true;
                            kVar.j(1, andUpdate, null);
                        }
                        kVar.h.execute(new l6(9, kVar, jVar));
                    }
                    try {
                        accept.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e6) {
                synchronized (kVar.f47364a) {
                    try {
                        if (!kVar.f47377p) {
                            FileLog.e(e6);
                            kVar.f();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            }
        }
    }

    public static byte[] d(String str) {
        byte[] bArr;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if ((trim.length() == 32 || trim.length() == 34) && trim.matches("[0-9a-fA-F]+")) {
            int length = trim.length() / 2;
            bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) Integer.parseInt(trim.substring(i11, i11 + 2), 16);
            }
        } else {
            try {
                bArr = Base64.decode(trim, 10);
            } catch (Exception unused) {
                return null;
            }
        }
        if (bArr.length != 16 && (bArr.length != 17 || (bArr[0] & 255) != 221)) {
            return null;
        }
        return bArr;
    }

    public static boolean h() {
        try {
            if (y.a("WEB_MESSAGE_LISTENER")) {
                if (y.a("WEB_MESSAGE_ARRAY_BUFFER")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return false;
        }
    }

    public static String i(String str) {
        String[] split;
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.endsWith(".")) {
            trim = e2.c.j(trim, 1, 0);
        }
        try {
            String lowerCase = IDN.toASCII(trim, 2).toLowerCase(Locale.US);
            if (lowerCase.length() <= 253 && lowerCase.indexOf(46) > 0 && !lowerCase.contains(":") && !lowerCase.matches("[0-9.]+")) {
                for (String str2 : lowerCase.split("\\.", -1)) {
                    if (str2.isEmpty() || str2.length() > 63 || str2.startsWith("-") || str2.endsWith("-")) {
                        return "";
                    }
                }
                return lowerCase;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static int k(String str, String str2) {
        String i10 = i(str);
        byte[] d = d(str2);
        if (!TextUtils.isEmpty(i10) && d != null && h()) {
            synchronized (f47362t) {
                try {
                    k kVar = f47363u;
                    if (kVar != null && kVar.f47365b.equals(i10) && f47363u.f47366c.equals(str2)) {
                        return f47363u.f47369g.getLocalPort();
                    }
                    k kVar2 = f47363u;
                    if (kVar2 != null) {
                        kVar2.m();
                        f47363u = null;
                    }
                    try {
                        k kVar3 = new k(i10, str2, d);
                        f47363u = kVar3;
                        h10 h10Var = h10.getInstance();
                        if (h10Var != null) {
                            h10Var.addListener(kVar3);
                        }
                        kVar3.h.execute(new g(kVar3, 2));
                        AndroidUtilities.runOnUIThread(new g(kVar3, 1));
                        return f47363u.f47369g.getLocalPort();
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        k kVar4 = f47363u;
                        if (kVar4 != null) {
                            kVar4.m();
                            f47363u = null;
                        }
                        return 0;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return 0;
    }

    public static void l() {
        synchronized (f47362t) {
            try {
                k kVar = f47363u;
                if (kVar != null) {
                    kVar.m();
                    f47363u = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(j jVar, boolean z4) {
        boolean z10;
        synchronized (this.f47364a) {
            try {
                if (this.f47372k.get(Integer.valueOf(jVar.f47358a)) != jVar) {
                    return;
                }
                this.f47372k.remove(Integer.valueOf(jVar.f47358a));
                if (z4 && this.f47376o && jVar.f47361e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f47364a.notifyAll();
                try {
                    jVar.f47359b.close();
                } catch (Exception unused) {
                }
                if (z10) {
                    j(3, jVar.f47358a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        WebView webView = this.f47374m;
        this.f47374m = null;
        this.f47375n = null;
        if (webView != null) {
            try {
                webView.stopLoading();
                webView.loadUrl("about:blank");
                webView.removeAllViews();
                webView.destroy();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public final void f() {
        synchronized (this.f47364a) {
            if (!this.f47377p && !this.f47378q) {
                this.f47378q = true;
                int i10 = 0;
                this.f47376o = false;
                this.f47375n = null;
                this.f47373l.clear();
                this.f47379r = 0;
                ArrayList arrayList = new ArrayList(this.f47372k.values());
                this.f47372k.clear();
                this.f47364a.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).f47359b.close();
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.runOnUIThread(new g(this, 3));
            }
        }
    }

    public final void g(String str, o2.f fVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("t");
            if ("tproxy-android-init".equals(optString) && jSONObject.optInt("v") == 1 && this.f47368f.equals(jSONObject.optString("nonce"))) {
                synchronized (this.f47364a) {
                    if (!this.f47377p && this.f47375n == null) {
                        this.f47375n = fVar;
                        j(16, 0, new byte[]{1});
                    }
                }
            } else if ("close".equals(optString) || "failed".equals(jSONObject.optString("state"))) {
                f();
            }
        } catch (Exception unused) {
        }
    }

    public final void j(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i10).put((byte) (i11 >> 16)).put((byte) (i11 >> 8)).put((byte) i11).putInt(bArr.length).put(bArr).array();
        synchronized (this.f47364a) {
            if (!this.f47377p && this.f47373l.size() < 8192 && this.f47379r <= 67108864 - array.length) {
                this.f47373l.add(array);
                this.f47379r += array.length;
                AndroidUtilities.runOnUIThread(new g(this, 4));
                return;
            }
            f();
        }
    }

    public final void m() {
        synchronized (this.f47364a) {
            try {
                if (this.f47377p) {
                    return;
                }
                this.f47377p = true;
                int i10 = 0;
                this.f47376o = false;
                this.f47378q = false;
                ArrayList arrayList = new ArrayList(this.f47372k.values());
                this.f47372k.clear();
                this.f47373l.clear();
                this.f47379r = 0;
                this.f47364a.notifyAll();
                try {
                    this.f47369g.close();
                } catch (Exception unused) {
                }
                h10 h10Var = h10.getInstance();
                if (h10Var != null) {
                    h10Var.removeListener(this);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).f47359b.close();
                    } catch (Exception unused2) {
                    }
                }
                AndroidUtilities.runOnUIThread(new g(this, 0));
                this.h.shutdownNow();
                this.f47370i.shutdownNow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onBecameForeground() {
        AndroidUtilities.runOnUIThread(new g(this, 1));
    }

    @Override
    public final void onBecameBackground() {
    }
}
