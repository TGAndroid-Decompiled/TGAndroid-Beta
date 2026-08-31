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
import o2.k;
import o2.l;
import o2.m;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.tf0;
import qh.d6;
public final class j implements g10 {
    public static final Object f47326t = new Object();
    public static j f47327u;
    public static j v;
    public final String f47329b;
    public final String f47330c;
    public final String d;
    public final String f47331e;
    public final String f47332f;
    public final ServerSocket f47333g;
    public WebView f47338m;
    public o2.f f47339n;
    public boolean f47340o;
    public boolean f47341p;
    public boolean f47342q;
    public int f47343r;
    public c f47344s;
    public final Object f47328a = new Object();
    public final ExecutorService h = Executors.newCachedThreadPool();
    public final ExecutorService f47334i = Executors.newSingleThreadExecutor();
    public final AtomicInteger f47335j = new AtomicInteger(1);
    public final HashMap f47336k = new HashMap();
    public final ArrayDeque f47337l = new ArrayDeque();

    public j(String str, String str2, byte[] bArr) {
        this.f47329b = str;
        this.f47330c = str2;
        String concat = "https://".concat(str);
        this.d = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.f47332f = encodeToString;
        String concat2 = "tdesktop-web-proxy-bridge-v1\n".concat(str);
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        String encodeToString2 = Base64.encodeToString(mac.doFinal(concat2.getBytes(StandardCharsets.UTF_8)), 11);
        this.f47331e = concat + "/?bridge=" + encodeToString2 + "#android=" + encodeToString;
        this.f47333g = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void a(j jVar) {
        m mVar;
        synchronized (jVar.f47328a) {
            try {
                if (!jVar.f47341p && jVar.f47338m == null) {
                    h10 h10Var = h10.getInstance();
                    if (h10Var != null && h10Var.isBackground()) {
                        jVar.f47342q = true;
                        return;
                    }
                    jVar.f47342q = false;
                    jVar.e();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        jVar.f47338m = webView;
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
                        webView.setWebViewClient(new tf0(jVar, 2));
                        HashSet hashSet = new HashSet();
                        hashSet.add(jVar.d);
                        g gVar = new g(jVar, 0);
                        boolean z4 = n2.a.f15190a;
                        if (k.f16356c.b()) {
                            if (k.d.b() && n2.a.f15190a) {
                                WeakHashMap weakHashMap = n2.a.f15191b;
                                mVar = (m) weakHashMap.get(webView);
                                if (mVar == null) {
                                    mVar = new m(l.f16357a.createWebView(webView));
                                    weakHashMap.put(webView, mVar);
                                }
                            } else {
                                mVar = new m(l.f16357a.createWebView(webView));
                            }
                            mVar.f16358a.addWebMessageListener("TelegramWebProxy", (String[]) hashSet.toArray(new String[0]), new ee.a(new o5.i(gVar, 25)));
                            webView.loadUrl(jVar.f47331e);
                            return;
                        }
                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        jVar.f();
                    }
                }
            } finally {
            }
        }
    }

    public static void b(j jVar) {
        int andUpdate;
        while (true) {
            try {
                Socket accept = jVar.f47333g.accept();
                accept.setTcpNoDelay(true);
                synchronized (jVar.f47328a) {
                    if (!jVar.f47341p && jVar.f47336k.size() < 64) {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(jVar.f47335j, new Object());
                            if (andUpdate != 0 && !jVar.f47336k.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        i iVar = new i(andUpdate, accept);
                        jVar.f47336k.put(Integer.valueOf(andUpdate), iVar);
                        if (jVar.f47340o) {
                            iVar.f47325e = true;
                            jVar.j(1, andUpdate, null);
                        }
                        jVar.h.execute(new d6(10, jVar, iVar));
                    }
                    try {
                        accept.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e6) {
                synchronized (jVar.f47328a) {
                    try {
                        if (!jVar.f47341p) {
                            FileLog.e(e6);
                            jVar.f();
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
            synchronized (f47326t) {
                try {
                    j jVar = f47327u;
                    if (jVar != null && jVar.f47329b.equals(i10) && f47327u.f47330c.equals(str2)) {
                        return f47327u.f47333g.getLocalPort();
                    }
                    j jVar2 = f47327u;
                    if (jVar2 != null) {
                        jVar2.m();
                        f47327u = null;
                    }
                    try {
                        j jVar3 = new j(i10, str2, d);
                        f47327u = jVar3;
                        h10 h10Var = h10.getInstance();
                        if (h10Var != null) {
                            h10Var.addListener(jVar3);
                        }
                        jVar3.h.execute(new f(jVar3, 2));
                        AndroidUtilities.runOnUIThread(new f(jVar3, 1));
                        return f47327u.f47333g.getLocalPort();
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        j jVar4 = f47327u;
                        if (jVar4 != null) {
                            jVar4.m();
                            f47327u = null;
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
        synchronized (f47326t) {
            try {
                j jVar = f47327u;
                if (jVar != null) {
                    jVar.m();
                    f47327u = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(i iVar, boolean z4) {
        boolean z10;
        synchronized (this.f47328a) {
            try {
                if (this.f47336k.get(Integer.valueOf(iVar.f47322a)) != iVar) {
                    return;
                }
                this.f47336k.remove(Integer.valueOf(iVar.f47322a));
                if (z4 && this.f47340o && iVar.f47325e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f47328a.notifyAll();
                try {
                    iVar.f47323b.close();
                } catch (Exception unused) {
                }
                if (z10) {
                    j(3, iVar.f47322a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        WebView webView = this.f47338m;
        this.f47338m = null;
        this.f47339n = null;
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
        synchronized (this.f47328a) {
            if (!this.f47341p && !this.f47342q) {
                this.f47342q = true;
                int i10 = 0;
                this.f47340o = false;
                this.f47339n = null;
                this.f47337l.clear();
                this.f47343r = 0;
                ArrayList arrayList = new ArrayList(this.f47336k.values());
                this.f47336k.clear();
                this.f47328a.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((i) obj).f47323b.close();
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.runOnUIThread(new f(this, 3));
            }
        }
    }

    public final void g(String str, o2.f fVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("t");
            if ("tproxy-android-init".equals(optString) && jSONObject.optInt("v") == 1 && this.f47332f.equals(jSONObject.optString("nonce"))) {
                synchronized (this.f47328a) {
                    if (!this.f47341p && this.f47339n == null) {
                        this.f47339n = fVar;
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
        synchronized (this.f47328a) {
            if (!this.f47341p && this.f47337l.size() < 8192 && this.f47343r <= 67108864 - array.length) {
                this.f47337l.add(array);
                this.f47343r += array.length;
                AndroidUtilities.runOnUIThread(new f(this, 4));
                return;
            }
            f();
        }
    }

    public final void m() {
        synchronized (this.f47328a) {
            try {
                if (this.f47341p) {
                    return;
                }
                this.f47341p = true;
                int i10 = 0;
                this.f47340o = false;
                this.f47342q = false;
                ArrayList arrayList = new ArrayList(this.f47336k.values());
                this.f47336k.clear();
                this.f47337l.clear();
                this.f47343r = 0;
                this.f47328a.notifyAll();
                try {
                    this.f47333g.close();
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
                        ((i) obj).f47323b.close();
                    } catch (Exception unused2) {
                    }
                }
                AndroidUtilities.runOnUIThread(new f(this, 0));
                this.h.shutdownNow();
                this.f47334i.shutdownNow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onBecameForeground() {
        AndroidUtilities.runOnUIThread(new f(this, 1));
    }

    @Override
    public final void onBecameBackground() {
    }
}
