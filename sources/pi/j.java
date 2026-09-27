package pi;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.internal.vision.e2;
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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.xf0;
import org.telegram.ui.web.g2;
public final class j implements h10 {
    public static final Object v = new Object();
    public static j f41373w;
    public static j f41374x;
    public final String f41376b;
    public final String f41377c;
    public final String d;
    public final String e;
    public final String f41378f;
    public final String f41379g;
    public final String h;
    public final ServerSocket f41380i;
    public WebView f41386o;
    public b5.h f41387p;
    public boolean f41388q;
    public boolean f41389r;
    public boolean f41390s;
    public int f41391t;
    public d f41392u;
    public final Object f41375a = new Object();
    public final ExecutorService f41381j = Executors.newCachedThreadPool();
    public final ExecutorService f41382k = Executors.newSingleThreadExecutor();
    public final AtomicInteger f41383l = new AtomicInteger(1);
    public final HashMap f41384m = new HashMap();
    public final ArrayDeque f41385n = new ArrayDeque();

    public j(la.h hVar, String str, byte[] bArr) {
        String j3;
        this.f41376b = (String) hVar.d;
        String str2 = (String) hVar.f14168b;
        this.f41377c = str2;
        String str3 = (String) hVar.f14169c;
        String p5 = str3.isEmpty() ? "/" : a4.a.p("/", str3, "/");
        this.d = p5;
        this.e = str;
        String concat = "https://".concat(str2);
        this.f41378f = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.h = encodeToString;
        if (str3.isEmpty()) {
            j3 = "tdesktop-web-proxy-bridge-v1\n".concat(str2);
        } else {
            j3 = e2.j("tdesktop-web-proxy-bridge-v2\n", str2, "\n", str3);
        }
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        String encodeToString2 = Base64.encodeToString(mac.doFinal(j3.getBytes(StandardCharsets.UTF_8)), 11);
        this.f41379g = concat + p5 + "?bridge=" + encodeToString2 + "#android=" + encodeToString;
        this.f41380i = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void a(j jVar) {
        synchronized (jVar.f41375a) {
            try {
                if (!jVar.f41389r && jVar.f41386o == null) {
                    i10 i10Var = i10.getInstance();
                    if (i10Var != null && i10Var.isBackground()) {
                        jVar.f41390s = true;
                        return;
                    }
                    jVar.f41390s = false;
                    jVar.e();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        jVar.f41386o = webView;
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
                        webView.setWebViewClient(new xf0(jVar, 2));
                        HashSet hashSet = new HashSet();
                        hashSet.add(jVar.f41378f);
                        a5.b.a(webView, "TelegramWebProxy", hashSet, new le.b(jVar, 18));
                        webView.loadUrl(jVar.f41379g);
                    } catch (Exception e) {
                        FileLog.e(e);
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
                Socket accept = jVar.f41380i.accept();
                accept.setTcpNoDelay(true);
                synchronized (jVar.f41375a) {
                    if (!jVar.f41389r && jVar.f41384m.size() < 64) {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(jVar.f41383l, new Object());
                            if (andUpdate != 0 && !jVar.f41384m.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        i iVar = new i(andUpdate, accept);
                        jVar.f41384m.put(Integer.valueOf(andUpdate), iVar);
                        if (jVar.f41388q) {
                            iVar.e = true;
                            jVar.k(1, andUpdate, null);
                        }
                        jVar.f41381j.execute(new g2(4, jVar, iVar));
                    }
                    try {
                        accept.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                synchronized (jVar.f41375a) {
                    try {
                        if (!jVar.f41389r) {
                            FileLog.e(e);
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
            if (o.a("WEB_MESSAGE_LISTENER")) {
                if (o.a("WEB_MESSAGE_ARRAY_BUFFER")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return false;
        }
    }

    public static la.h i(String str) {
        String str2;
        String str3;
        String[] split;
        if (str != null) {
            int indexOf = str.indexOf(47);
            if (indexOf >= 0) {
                str2 = str.substring(0, indexOf);
            } else {
                str2 = str;
            }
            String j3 = j(str2);
            if (indexOf >= 0) {
                str3 = str.substring(indexOf + 1);
            } else {
                str3 = "";
            }
            if (!TextUtils.isEmpty(j3) && str3.length() <= 128) {
                if (!str3.isEmpty()) {
                    for (String str4 : str3.split("/", -1)) {
                        if (!str4.isEmpty() && Character.isLetterOrDigit(str4.charAt(0))) {
                            for (int i10 = 0; i10 < str4.length(); i10++) {
                                char charAt = str4.charAt(i10);
                                if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-'))) {
                                    return null;
                                }
                            }
                        } else {
                            return null;
                        }
                    }
                }
                return new la.h(j3, str3);
            }
            return null;
        }
        return null;
    }

    public static String j(String str) {
        String[] split;
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.endsWith(".")) {
            trim = e2.i(1, 0, trim);
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

    public static int l(String str, String str2) {
        la.h i10 = i(str);
        byte[] d = d(str2);
        if (i10 != null && d != null && h()) {
            synchronized (v) {
                try {
                    j jVar = f41373w;
                    if (jVar != null && jVar.f41376b.equals((String) i10.d) && f41373w.e.equals(str2)) {
                        return f41373w.f41380i.getLocalPort();
                    }
                    j jVar2 = f41373w;
                    if (jVar2 != null) {
                        jVar2.n();
                        f41373w = null;
                    }
                    try {
                        j jVar3 = new j(i10, str2, d);
                        f41373w = jVar3;
                        i10 i10Var = i10.getInstance();
                        if (i10Var != null) {
                            i10Var.addListener(jVar3);
                        }
                        jVar3.f41381j.execute(new g(jVar3, 1));
                        AndroidUtilities.runOnUIThread(new g(jVar3, 2));
                        return f41373w.f41380i.getLocalPort();
                    } catch (Exception e) {
                        FileLog.e(e);
                        j jVar4 = f41373w;
                        if (jVar4 != null) {
                            jVar4.n();
                            f41373w = null;
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

    public static void m() {
        synchronized (v) {
            try {
                j jVar = f41373w;
                if (jVar != null) {
                    jVar.n();
                    f41373w = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(i iVar, boolean z10) {
        boolean z11;
        synchronized (this.f41375a) {
            try {
                if (this.f41384m.get(Integer.valueOf(iVar.f41370a)) != iVar) {
                    return;
                }
                this.f41384m.remove(Integer.valueOf(iVar.f41370a));
                if (z10 && this.f41388q && iVar.e) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f41375a.notifyAll();
                try {
                    iVar.f41371b.close();
                } catch (Exception unused) {
                }
                if (z11) {
                    k(3, iVar.f41370a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        WebView webView = this.f41386o;
        this.f41386o = null;
        this.f41387p = null;
        if (webView != null) {
            try {
                webView.stopLoading();
                webView.loadUrl("about:blank");
                webView.removeAllViews();
                webView.destroy();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void f() {
        synchronized (this.f41375a) {
            if (!this.f41389r && !this.f41390s) {
                this.f41390s = true;
                int i10 = 0;
                this.f41388q = false;
                this.f41387p = null;
                this.f41385n.clear();
                this.f41391t = 0;
                ArrayList arrayList = new ArrayList(this.f41384m.values());
                this.f41384m.clear();
                this.f41375a.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((i) obj).f41371b.close();
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.runOnUIThread(new g(this, 3));
            }
        }
    }

    public final void g(String str, b5.h hVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("t");
            if ("tproxy-android-init".equals(optString) && jSONObject.optInt("v") == 1 && this.h.equals(jSONObject.optString("nonce"))) {
                synchronized (this.f41375a) {
                    if (!this.f41389r && this.f41387p == null) {
                        this.f41387p = hVar;
                        k(16, 0, new byte[]{1});
                    }
                }
            } else if ("close".equals(optString) || "failed".equals(jSONObject.optString("state"))) {
                f();
            }
        } catch (Exception unused) {
        }
    }

    public final void k(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i10).put((byte) (i11 >> 16)).put((byte) (i11 >> 8)).put((byte) i11).putInt(bArr.length).put(bArr).array();
        synchronized (this.f41375a) {
            if (!this.f41389r && this.f41385n.size() < 8192 && this.f41391t <= 67108864 - array.length) {
                this.f41385n.add(array);
                this.f41391t += array.length;
                AndroidUtilities.runOnUIThread(new g(this, 4));
                return;
            }
            f();
        }
    }

    public final void n() {
        synchronized (this.f41375a) {
            try {
                if (this.f41389r) {
                    return;
                }
                this.f41389r = true;
                int i10 = 0;
                this.f41388q = false;
                this.f41390s = false;
                ArrayList arrayList = new ArrayList(this.f41384m.values());
                this.f41384m.clear();
                this.f41385n.clear();
                this.f41391t = 0;
                this.f41375a.notifyAll();
                try {
                    this.f41380i.close();
                } catch (Exception unused) {
                }
                i10 i10Var = i10.getInstance();
                if (i10Var != null) {
                    i10Var.removeListener(this);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((i) obj).f41371b.close();
                    } catch (Exception unused2) {
                    }
                }
                AndroidUtilities.runOnUIThread(new g(this, 0));
                this.f41381j.shutdownNow();
                this.f41382k.shutdownNow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onBecameForeground() {
        AndroidUtilities.runOnUIThread(new g(this, 2));
    }

    @Override
    public final void onBecameBackground() {
    }
}
