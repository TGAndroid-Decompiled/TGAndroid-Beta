package ui;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import b8.p9;
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
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.r0;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.o1;
public final class j implements uz {
    public static j A;
    public static final Object f56399y = new Object();
    public static j f56400z;
    public final String f56402b;
    public final String f56403c;
    public final String d;
    public final String f56404e;
    public final String f56405f;
    public final String f56406g;
    public final String h;
    public final ServerSocket f56407i;
    public WebView f56413o;
    public d5.g f56414p;
    public boolean f56415q;
    public boolean f56416r;
    public boolean f56417s;
    public boolean f56418t;
    public boolean f56419u;
    public boolean v;
    public int f56420w;
    public d f56421x;
    public final Object f56401a = new Object();
    public final ExecutorService f56408j = Executors.newCachedThreadPool();
    public final ExecutorService f56409k = Executors.newSingleThreadExecutor();
    public final AtomicInteger f56410l = new AtomicInteger(1);
    public final HashMap f56411m = new HashMap();
    public final ArrayDeque f56412n = new ArrayDeque();

    public j(p7.d dVar, String str, byte[] bArr) {
        String k10;
        this.f56402b = (String) dVar.f53346c;
        String str2 = (String) dVar.f53345b;
        this.f56403c = str2;
        String str3 = (String) dVar.d;
        String q10 = str3.isEmpty() ? "/" : a1.g.q("/", str3, "/");
        this.d = q10;
        this.f56404e = str;
        String concat = "https://".concat(str2);
        this.f56405f = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.h = encodeToString;
        if (str3.isEmpty()) {
            k10 = "tdesktop-web-proxy-bridge-v1\n".concat(str2);
        } else {
            k10 = com.google.android.recaptcha.internal.a.k("tdesktop-web-proxy-bridge-v2\n", str2, "\n", str3);
        }
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        String encodeToString2 = Base64.encodeToString(mac.doFinal(k10.getBytes(StandardCharsets.UTF_8)), 11);
        this.f56406g = concat + q10 + "?bridge=" + encodeToString2 + "#android=" + encodeToString;
        this.f56407i = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void c(j jVar) {
        boolean z10;
        synchronized (jVar.f56401a) {
            try {
                if (!jVar.f56419u && jVar.f56413o == null) {
                    r0 r0Var = r0.f25016f;
                    if (r0Var != null) {
                        if (r0Var.f25017a == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            jVar.v = true;
                            return;
                        }
                    }
                    jVar.v = false;
                    jVar.g();
                    try {
                        WebView webView = new WebView(t0.f25457b);
                        jVar.f56413o = webView;
                        jVar.f56415q = p9.a("WEB_MESSAGE_ARRAY_BUFFER");
                        jVar.f56416r = false;
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
                        webView.setWebViewClient(new o1(jVar, 4));
                        HashSet hashSet = new HashSet();
                        hashSet.add(jVar.f56405f);
                        c5.a.a(webView, "TelegramWebProxy", hashSet, new e3(jVar, 25));
                        webView.loadUrl(jVar.f56406g);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        jVar.h();
                    }
                }
            } finally {
            }
        }
    }

    public static void d(j jVar) {
        int andUpdate;
        while (true) {
            try {
                Socket accept = jVar.f56407i.accept();
                accept.setTcpNoDelay(true);
                synchronized (jVar.f56401a) {
                    if (!jVar.f56419u && jVar.f56411m.size() < 64) {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(jVar.f56410l, new Object());
                            if (andUpdate != 0 && !jVar.f56411m.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        i iVar = new i(andUpdate, accept);
                        jVar.f56411m.put(Integer.valueOf(andUpdate), iVar);
                        if (jVar.f56418t) {
                            iVar.f56398e = true;
                            jVar.n(1, andUpdate, null);
                        }
                        jVar.f56408j.execute(new u9.a(5, jVar, iVar));
                    }
                    try {
                        accept.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e10) {
                synchronized (jVar.f56401a) {
                    try {
                        if (!jVar.f56419u) {
                            a8.g(e10, true);
                            jVar.h();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            }
        }
    }

    public static byte[] f(String str) {
        byte[] bArr;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if ((trim.length() == 32 || trim.length() == 34) && trim.matches("[0-9a-fA-F]+")) {
            int length = trim.length() / 2;
            bArr = new byte[length];
            for (int i3 = 0; i3 < length; i3++) {
                int i10 = i3 * 2;
                bArr[i3] = (byte) Integer.parseInt(trim.substring(i10, i10 + 2), 16);
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

    public static p7.d k(String str) {
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
            String l10 = l(str2);
            if (indexOf >= 0) {
                str3 = str.substring(indexOf + 1);
            } else {
                str3 = "";
            }
            if (!TextUtils.isEmpty(l10) && str3.length() <= 128) {
                if (!str3.isEmpty()) {
                    for (String str4 : str3.split("/", -1)) {
                        if (!str4.isEmpty() && Character.isLetterOrDigit(str4.charAt(0))) {
                            for (int i3 = 0; i3 < str4.length(); i3++) {
                                char charAt = str4.charAt(i3);
                                if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-'))) {
                                    return null;
                                }
                            }
                        } else {
                            return null;
                        }
                    }
                }
                return new p7.d(l10, str3);
            }
            return null;
        }
        return null;
    }

    public static String l(String str) {
        String[] split;
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.endsWith(".")) {
            trim = com.google.android.recaptcha.internal.a.j(trim, 1, 0);
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

    public static int o(String str, String str2) {
        boolean z10;
        p7.d k10 = k(str);
        byte[] f10 = f(str2);
        if (k10 != null && f10 != null) {
            try {
                z10 = p9.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th2) {
                a8.g(th2, true);
                z10 = false;
            }
            if (z10) {
                synchronized (f56399y) {
                    try {
                        j jVar = f56400z;
                        if (jVar != null && !jVar.f56407i.isClosed() && f56400z.f56402b.equals((String) k10.f53346c) && f56400z.f56404e.equals(str2)) {
                            return f56400z.f56407i.getLocalPort();
                        }
                        j jVar2 = f56400z;
                        if (jVar2 != null) {
                            jVar2.q();
                            f56400z = null;
                        }
                        try {
                            j jVar3 = new j(k10, str2, f10);
                            f56400z = jVar3;
                            r0 r0Var = r0.f25016f;
                            if (r0Var != null) {
                                r0Var.d.add(jVar3);
                            }
                            jVar3.f56408j.execute(new g(jVar3, 1));
                            g0.h3(new g(jVar3, 2));
                            return f56400z.f56407i.getLocalPort();
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            j jVar4 = f56400z;
                            if (jVar4 != null) {
                                jVar4.q();
                                f56400z = null;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
        return 0;
    }

    public static void p() {
        synchronized (f56399y) {
            try {
                j jVar = f56400z;
                if (jVar != null) {
                    jVar.q();
                    f56400z = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void b() {
        g0.h3(new g(this, 2));
    }

    public final void e(i iVar, boolean z10) {
        boolean z11;
        synchronized (this.f56401a) {
            try {
                if (this.f56411m.get(Integer.valueOf(iVar.f56395a)) != iVar) {
                    return;
                }
                this.f56411m.remove(Integer.valueOf(iVar.f56395a));
                if (z10 && this.f56418t && iVar.f56398e) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f56401a.notifyAll();
                try {
                    iVar.f56396b.close();
                } catch (Exception unused) {
                }
                if (z11) {
                    n(3, iVar.f56395a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        WebView webView = this.f56413o;
        this.f56413o = null;
        this.f56414p = null;
        this.f56416r = false;
        if (webView != null) {
            try {
                webView.stopLoading();
                webView.loadUrl("about:blank");
                webView.removeAllViews();
                webView.destroy();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public final void h() {
        synchronized (this.f56401a) {
            if (!this.f56419u && !this.v) {
                this.v = true;
                int i3 = 0;
                this.f56418t = false;
                this.f56414p = null;
                this.f56412n.clear();
                this.f56420w = 0;
                ArrayList arrayList = new ArrayList(this.f56411m.values());
                this.f56411m.clear();
                this.f56401a.notifyAll();
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    try {
                        ((i) obj).f56396b.close();
                    } catch (Exception unused) {
                    }
                }
                g0.h3(new g(this, 3));
            }
        }
    }

    public final void i(String str, d5.g gVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("t");
            if ("tproxy-android-init".equals(optString) && jSONObject.optInt("v") == 1 && this.h.equals(jSONObject.optString("nonce"))) {
                synchronized (this.f56401a) {
                    if (!this.f56419u && this.f56414p == null) {
                        this.f56414p = gVar;
                        if (this.f56415q) {
                            this.f56416r = true;
                            n(16, 0, new byte[]{1});
                            return;
                        }
                        WebView webView = this.f56413o;
                        iv0 iv0Var = new iv0(this, webView, gVar, 19);
                        g0.i3(iv0Var, 5000L);
                        try {
                            webView.evaluateJavascript("(function(){\n'use strict';\ntry {\n var bridge=window.TelegramWebProxy;\n if(!bridge||typeof bridge.postMessage!=='function'||typeof bridge.onmessage!=='function')return false;\n var nativePost=bridge.postMessage;\n var receive=bridge.onmessage;\n var prefix='tproxy-base64:';\n var maxBytes=1048584;\n var maxChars=1398112;\n function post(value){\n  if(value instanceof ArrayBuffer){\n   if(value.byteLength>maxBytes)throw new Error('WEB proxy frame too large');\n   var bytes=new Uint8Array(value),parts=[];\n   for(var i=0;i<bytes.length;i+=8192){\n    parts.push(String.fromCharCode.apply(null,bytes.subarray(i,Math.min(i+8192,bytes.length))));\n   }\n   nativePost.call(bridge,prefix+btoa(parts.join('')));\n  }else nativePost.call(bridge,value);\n }\n function onmessage(event){\n  var data=event.data;\n  if(typeof data==='string'&&data.indexOf(prefix)===0){\n   try {\n    var encoded=data.substring(prefix.length);\n    if(encoded.length>maxChars)throw new Error('WEB proxy frame too large');\n    var binary=atob(encoded);\n    if(binary.length>maxBytes)throw new Error('WEB proxy frame too large');\n    var bytes=new Uint8Array(binary.length);\n    for(var i=0;i<binary.length;i++)bytes[i]=binary.charCodeAt(i);\n    receive.call(bridge,{data:bytes.buffer});\n   }catch(error){nativePost.call(bridge,'{\"t\":\"close\"}');}\n  }else receive.call(bridge,event);\n }\n bridge.postMessage=post;\n bridge.onmessage=onmessage;\n return bridge.postMessage===post&&bridge.onmessage===onmessage;\n}catch(error){return false;}\n})()\n", new org.telegram.ui.web.o1(this, iv0Var, webView, gVar));
                        } catch (Exception e10) {
                            g0.r(iv0Var);
                            a8.g(e10, true);
                            a8.d("WEB proxy: Base64 bridge installation threw an exception; transport stopped");
                            q();
                        }
                    }
                }
            } else if ("close".equals(optString) || "failed".equals(jSONObject.optString("state"))) {
                h();
            }
        } catch (Exception unused) {
        }
    }

    public final boolean j(WebView webView) {
        String url = webView.getUrl();
        if (url == null) {
            return false;
        }
        Uri parse = Uri.parse(url);
        if (!"https".equalsIgnoreCase(parse.getScheme()) || !this.f56403c.equalsIgnoreCase(parse.getHost()) || parse.getUserInfo() != null || parse.getPort() != -1 || !this.d.equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    public final void m(byte[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: ui.j.m(byte[]):void");
    }

    public final void n(int i3, int i10, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i3).put((byte) (i10 >> 16)).put((byte) (i10 >> 8)).put((byte) i10).putInt(bArr.length).put(bArr).array();
        synchronized (this.f56401a) {
            if (!this.f56419u && this.f56412n.size() < 8192 && this.f56420w <= 67108864 - array.length) {
                this.f56412n.add(array);
                this.f56420w += array.length;
                g0.h3(new g(this, 4));
                return;
            }
            h();
        }
    }

    public final void q() {
        synchronized (this.f56401a) {
            try {
                if (this.f56419u) {
                    return;
                }
                this.f56419u = true;
                int i3 = 0;
                this.f56418t = false;
                this.v = false;
                ArrayList arrayList = new ArrayList(this.f56411m.values());
                this.f56411m.clear();
                this.f56412n.clear();
                this.f56420w = 0;
                this.f56401a.notifyAll();
                try {
                    this.f56407i.close();
                } catch (Exception unused) {
                }
                r0 r0Var = r0.f25016f;
                if (r0Var != null) {
                    r0Var.d.remove(this);
                }
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    try {
                        ((i) obj).f56396b.close();
                    } catch (Exception unused2) {
                    }
                }
                g0.h3(new g(this, 0));
                this.f56408j.shutdownNow();
                this.f56409k.shutdownNow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void a() {
    }
}
