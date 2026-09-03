package rf;

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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import k7.x;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.sf0;
import ph.e6;
import ph.z8;
public final class j implements g10 {
    public static final Object f43497t = new Object();
    public static j f43498u;
    public static j v;
    public final String f43500b;
    public final String f43501c;
    public final String d;
    public final String e;
    public final String f43502f;
    public final ServerSocket f43503g;
    public WebView f43508m;
    public o2.f f43509n;
    public boolean f43510o;
    public boolean f43511p;
    public boolean f43512q;
    public int f43513r;
    public d f43514s;
    public final Object f43499a = new Object();
    public final ExecutorService h = Executors.newCachedThreadPool();
    public final ExecutorService f43504i = Executors.newSingleThreadExecutor();
    public final AtomicInteger f43505j = new AtomicInteger(1);
    public final HashMap f43506k = new HashMap();
    public final ArrayDeque f43507l = new ArrayDeque();

    public j(String str, String str2, byte[] bArr) {
        this.f43500b = str;
        this.f43501c = str2;
        String concat = "https://".concat(str);
        this.d = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.f43502f = encodeToString;
        String concat2 = "tdesktop-web-proxy-bridge-v1\n".concat(str);
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        String encodeToString2 = Base64.encodeToString(mac.doFinal(concat2.getBytes(StandardCharsets.UTF_8)), 11);
        this.e = concat + "/?bridge=" + encodeToString2 + "#android=" + encodeToString;
        this.f43503g = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void a(j jVar) {
        synchronized (jVar.f43499a) {
            try {
                if (!jVar.f43511p && jVar.f43508m == null) {
                    h10 h10Var = h10.getInstance();
                    if (h10Var != null && h10Var.isBackground()) {
                        jVar.f43512q = true;
                        return;
                    }
                    jVar.f43512q = false;
                    jVar.e();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        jVar.f43508m = webView;
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
                        webView.setWebViewClient(new sf0(jVar, 2));
                        HashSet hashSet = new HashSet();
                        hashSet.add(jVar.d);
                        n2.b.a(webView, "TelegramWebProxy", hashSet, new z8(jVar, 1));
                        webView.loadUrl(jVar.e);
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
                Socket accept = jVar.f43503g.accept();
                accept.setTcpNoDelay(true);
                synchronized (jVar.f43499a) {
                    if (!jVar.f43511p && jVar.f43506k.size() < 64) {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(jVar.f43505j, new Object());
                            if (andUpdate != 0 && !jVar.f43506k.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        i iVar = new i(andUpdate, accept);
                        jVar.f43506k.put(Integer.valueOf(andUpdate), iVar);
                        if (jVar.f43510o) {
                            iVar.e = true;
                            jVar.j(1, andUpdate, null);
                        }
                        jVar.h.execute(new e6(10, jVar, iVar));
                    }
                    try {
                        accept.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                synchronized (jVar.f43499a) {
                    try {
                        if (!jVar.f43511p) {
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
            if (x.a("WEB_MESSAGE_LISTENER")) {
                if (x.a("WEB_MESSAGE_ARRAY_BUFFER")) {
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
            synchronized (f43497t) {
                try {
                    j jVar = f43498u;
                    if (jVar != null && jVar.f43500b.equals(i10) && f43498u.f43501c.equals(str2)) {
                        return f43498u.f43503g.getLocalPort();
                    }
                    j jVar2 = f43498u;
                    if (jVar2 != null) {
                        jVar2.m();
                        f43498u = null;
                    }
                    try {
                        j jVar3 = new j(i10, str2, d);
                        f43498u = jVar3;
                        h10 h10Var = h10.getInstance();
                        if (h10Var != null) {
                            h10Var.addListener(jVar3);
                        }
                        jVar3.h.execute(new g(jVar3, 2));
                        AndroidUtilities.runOnUIThread(new g(jVar3, 1));
                        return f43498u.f43503g.getLocalPort();
                    } catch (Exception e) {
                        FileLog.e(e);
                        j jVar4 = f43498u;
                        if (jVar4 != null) {
                            jVar4.m();
                            f43498u = null;
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
        synchronized (f43497t) {
            try {
                j jVar = f43498u;
                if (jVar != null) {
                    jVar.m();
                    f43498u = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(i iVar, boolean z4) {
        boolean z10;
        synchronized (this.f43499a) {
            try {
                if (this.f43506k.get(Integer.valueOf(iVar.f43494a)) != iVar) {
                    return;
                }
                this.f43506k.remove(Integer.valueOf(iVar.f43494a));
                if (z4 && this.f43510o && iVar.e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f43499a.notifyAll();
                try {
                    iVar.f43495b.close();
                } catch (Exception unused) {
                }
                if (z10) {
                    j(3, iVar.f43494a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        WebView webView = this.f43508m;
        this.f43508m = null;
        this.f43509n = null;
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
        synchronized (this.f43499a) {
            if (!this.f43511p && !this.f43512q) {
                this.f43512q = true;
                int i10 = 0;
                this.f43510o = false;
                this.f43509n = null;
                this.f43507l.clear();
                this.f43513r = 0;
                ArrayList arrayList = new ArrayList(this.f43506k.values());
                this.f43506k.clear();
                this.f43499a.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((i) obj).f43495b.close();
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
            if ("tproxy-android-init".equals(optString) && jSONObject.optInt("v") == 1 && this.f43502f.equals(jSONObject.optString("nonce"))) {
                synchronized (this.f43499a) {
                    if (!this.f43511p && this.f43509n == null) {
                        this.f43509n = fVar;
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
        synchronized (this.f43499a) {
            if (!this.f43511p && this.f43507l.size() < 8192 && this.f43513r <= 67108864 - array.length) {
                this.f43507l.add(array);
                this.f43513r += array.length;
                AndroidUtilities.runOnUIThread(new g(this, 4));
                return;
            }
            f();
        }
    }

    public final void m() {
        synchronized (this.f43499a) {
            try {
                if (this.f43511p) {
                    return;
                }
                this.f43511p = true;
                int i10 = 0;
                this.f43510o = false;
                this.f43512q = false;
                ArrayList arrayList = new ArrayList(this.f43506k.values());
                this.f43506k.clear();
                this.f43507l.clear();
                this.f43513r = 0;
                this.f43499a.notifyAll();
                try {
                    this.f43503g.close();
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
                        ((i) obj).f43495b.close();
                    } catch (Exception unused2) {
                    }
                }
                AndroidUtilities.runOnUIThread(new g(this, 0));
                this.h.shutdownNow();
                this.f43504i.shutdownNow();
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
