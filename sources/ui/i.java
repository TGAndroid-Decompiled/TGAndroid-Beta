package ui;

import a8.n9;
import a8.p0;
import android.net.Uri;
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
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.r0;
import org.telegram.messenger.t0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.yz;
import org.telegram.ui.hy0;
import org.telegram.ui.n1;
import org.telegram.ui.web.q1;
import ti.p;
public final class i implements yz {
    public static i A;
    public static final Object f56847y = new Object();
    public static i f56848z;
    public final String f56850b;
    public final String f56851c;
    public final String d;
    public final String f56852e;
    public final String f56853f;
    public final String f56854g;
    public final String h;
    public final ServerSocket f56855i;
    public WebView f56861o;
    public e5.f f56862p;
    public boolean f56863q;
    public boolean f56864r;
    public boolean f56865s;
    public boolean f56866t;
    public boolean f56867u;
    public boolean v;
    public int f56868w;
    public c f56869x;
    public final Object f56849a = new Object();
    public final ExecutorService f56856j = Executors.newCachedThreadPool();
    public final ExecutorService f56857k = Executors.newSingleThreadExecutor();
    public final AtomicInteger f56858l = new AtomicInteger(1);
    public final HashMap f56859m = new HashMap();
    public final ArrayDeque f56860n = new ArrayDeque();

    public i(hy0 hy0Var, String str, byte[] bArr) {
        String l10;
        this.f56850b = (String) hy0Var.d;
        String str2 = (String) hy0Var.f46527b;
        this.f56851c = str2;
        String str3 = (String) hy0Var.f46528c;
        String p10 = str3.isEmpty() ? "/" : p0.p("/", str3, "/");
        this.d = p10;
        this.f56852e = str;
        String concat = "https://".concat(str2);
        this.f56853f = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.h = encodeToString;
        if (str3.isEmpty()) {
            l10 = "tdesktop-web-proxy-bridge-v1\n".concat(str2);
        } else {
            l10 = com.google.android.recaptcha.internal.a.l("tdesktop-web-proxy-bridge-v2\n", str2, "\n", str3);
        }
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        String encodeToString2 = Base64.encodeToString(mac.doFinal(l10.getBytes(StandardCharsets.UTF_8)), 11);
        this.f56854g = concat + p10 + "?bridge=" + encodeToString2 + "#android=" + encodeToString;
        this.f56855i = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void c(i iVar) {
        boolean z9;
        synchronized (iVar.f56849a) {
            try {
                if (!iVar.f56867u && iVar.f56861o == null) {
                    r0 r0Var = r0.f25173f;
                    if (r0Var != null) {
                        if (r0Var.f25174a == 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            iVar.v = true;
                            return;
                        }
                    }
                    iVar.v = false;
                    iVar.g();
                    try {
                        WebView webView = new WebView(t0.f25563b);
                        iVar.f56861o = webView;
                        iVar.f56863q = n9.a("WEB_MESSAGE_ARRAY_BUFFER");
                        iVar.f56864r = false;
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
                        webView.setWebViewClient(new n1(iVar, 4));
                        HashSet hashSet = new HashSet();
                        hashSet.add(iVar.f56853f);
                        d5.b.a(webView, "TelegramWebProxy", hashSet, new u5.e(iVar, 2));
                        webView.loadUrl(iVar.f56854g);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        iVar.h();
                    }
                }
            } finally {
            }
        }
    }

    public static void d(i iVar) {
        int andUpdate;
        while (true) {
            try {
                Socket accept = iVar.f56855i.accept();
                accept.setTcpNoDelay(true);
                synchronized (iVar.f56849a) {
                    if (!iVar.f56867u && iVar.f56859m.size() < 64) {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(iVar.f56858l, new Object());
                            if (andUpdate != 0 && !iVar.f56859m.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        h hVar = new h(andUpdate, accept);
                        iVar.f56859m.put(Integer.valueOf(andUpdate), hVar);
                        if (iVar.f56866t) {
                            hVar.f56846e = true;
                            iVar.n(1, andUpdate, null);
                        }
                        iVar.f56856j.execute(new p(11, iVar, hVar));
                    }
                    try {
                        accept.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e10) {
                synchronized (iVar.f56849a) {
                    try {
                        if (!iVar.f56867u) {
                            a8.g(e10, true);
                            iVar.h();
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
            for (int i7 = 0; i7 < length; i7++) {
                int i10 = i7 * 2;
                bArr[i7] = (byte) Integer.parseInt(trim.substring(i10, i10 + 2), 16);
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

    public static hy0 k(String str) {
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
                            for (int i7 = 0; i7 < str4.length(); i7++) {
                                char charAt = str4.charAt(i7);
                                if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-'))) {
                                    return null;
                                }
                            }
                        } else {
                            return null;
                        }
                    }
                }
                return new hy0(l10, str3);
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
            trim = com.google.android.recaptcha.internal.a.k(trim, 1, 0);
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
        boolean z9;
        hy0 k10 = k(str);
        byte[] f10 = f(str2);
        if (k10 != null && f10 != null) {
            try {
                z9 = n9.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th2) {
                a8.g(th2, true);
                z9 = false;
            }
            if (z9) {
                synchronized (f56847y) {
                    try {
                        i iVar = f56848z;
                        if (iVar != null && !iVar.f56855i.isClosed() && f56848z.f56850b.equals((String) k10.d) && f56848z.f56852e.equals(str2)) {
                            return f56848z.f56855i.getLocalPort();
                        }
                        i iVar2 = f56848z;
                        if (iVar2 != null) {
                            iVar2.q();
                            f56848z = null;
                        }
                        try {
                            i iVar3 = new i(k10, str2, f10);
                            f56848z = iVar3;
                            r0 r0Var = r0.f25173f;
                            if (r0Var != null) {
                                r0Var.d.add(iVar3);
                            }
                            iVar3.f56856j.execute(new f(iVar3, 1));
                            g0.h3(new f(iVar3, 2));
                            return f56848z.f56855i.getLocalPort();
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            i iVar4 = f56848z;
                            if (iVar4 != null) {
                                iVar4.q();
                                f56848z = null;
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
        synchronized (f56847y) {
            try {
                i iVar = f56848z;
                if (iVar != null) {
                    iVar.q();
                    f56848z = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void b() {
        g0.h3(new f(this, 2));
    }

    public final void e(h hVar, boolean z9) {
        boolean z10;
        synchronized (this.f56849a) {
            try {
                if (this.f56859m.get(Integer.valueOf(hVar.f56843a)) != hVar) {
                    return;
                }
                this.f56859m.remove(Integer.valueOf(hVar.f56843a));
                if (z9 && this.f56866t && hVar.f56846e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f56849a.notifyAll();
                try {
                    hVar.f56844b.close();
                } catch (Exception unused) {
                }
                if (z10) {
                    n(3, hVar.f56843a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        WebView webView = this.f56861o;
        this.f56861o = null;
        this.f56862p = null;
        this.f56864r = false;
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
        synchronized (this.f56849a) {
            if (!this.f56867u && !this.v) {
                this.v = true;
                int i7 = 0;
                this.f56866t = false;
                this.f56862p = null;
                this.f56860n.clear();
                this.f56868w = 0;
                ArrayList arrayList = new ArrayList(this.f56859m.values());
                this.f56859m.clear();
                this.f56849a.notifyAll();
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    try {
                        ((h) obj).f56844b.close();
                    } catch (Exception unused) {
                    }
                }
                g0.h3(new f(this, 3));
            }
        }
    }

    public final void i(String str, e5.f fVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("t");
            if ("tproxy-android-init".equals(optString) && jSONObject.optInt("v") == 1 && this.h.equals(jSONObject.optString("nonce"))) {
                synchronized (this.f56849a) {
                    if (!this.f56867u && this.f56862p == null) {
                        this.f56862p = fVar;
                        if (this.f56863q) {
                            this.f56864r = true;
                            n(16, 0, new byte[]{1});
                            return;
                        }
                        WebView webView = this.f56861o;
                        r31 r31Var = new r31(this, webView, fVar, 17);
                        g0.i3(r31Var, 5000L);
                        try {
                            webView.evaluateJavascript("(function(){\n'use strict';\ntry {\n var bridge=window.TelegramWebProxy;\n if(!bridge||typeof bridge.postMessage!=='function'||typeof bridge.onmessage!=='function')return false;\n var nativePost=bridge.postMessage;\n var receive=bridge.onmessage;\n var prefix='tproxy-base64:';\n var maxBytes=1048584;\n var maxChars=1398112;\n function post(value){\n  if(value instanceof ArrayBuffer){\n   if(value.byteLength>maxBytes)throw new Error('WEB proxy frame too large');\n   var bytes=new Uint8Array(value),parts=[];\n   for(var i=0;i<bytes.length;i+=8192){\n    parts.push(String.fromCharCode.apply(null,bytes.subarray(i,Math.min(i+8192,bytes.length))));\n   }\n   nativePost.call(bridge,prefix+btoa(parts.join('')));\n  }else nativePost.call(bridge,value);\n }\n function onmessage(event){\n  var data=event.data;\n  if(typeof data==='string'&&data.indexOf(prefix)===0){\n   try {\n    var encoded=data.substring(prefix.length);\n    if(encoded.length>maxChars)throw new Error('WEB proxy frame too large');\n    var binary=atob(encoded);\n    if(binary.length>maxBytes)throw new Error('WEB proxy frame too large');\n    var bytes=new Uint8Array(binary.length);\n    for(var i=0;i<binary.length;i++)bytes[i]=binary.charCodeAt(i);\n    receive.call(bridge,{data:bytes.buffer});\n   }catch(error){nativePost.call(bridge,'{\"t\":\"close\"}');}\n  }else receive.call(bridge,event);\n }\n bridge.postMessage=post;\n bridge.onmessage=onmessage;\n return bridge.postMessage===post&&bridge.onmessage===onmessage;\n}catch(error){return false;}\n})()\n", new q1(this, r31Var, webView, fVar));
                        } catch (Exception e10) {
                            g0.r(r31Var);
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
        if (!"https".equalsIgnoreCase(parse.getScheme()) || !this.f56851c.equalsIgnoreCase(parse.getHost()) || parse.getUserInfo() != null || parse.getPort() != -1 || !this.d.equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    public final void m(byte[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: ui.i.m(byte[]):void");
    }

    public final void n(int i7, int i10, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i7).put((byte) (i10 >> 16)).put((byte) (i10 >> 8)).put((byte) i10).putInt(bArr.length).put(bArr).array();
        synchronized (this.f56849a) {
            if (!this.f56867u && this.f56860n.size() < 8192 && this.f56868w <= 67108864 - array.length) {
                this.f56860n.add(array);
                this.f56868w += array.length;
                g0.h3(new f(this, 4));
                return;
            }
            h();
        }
    }

    public final void q() {
        synchronized (this.f56849a) {
            try {
                if (this.f56867u) {
                    return;
                }
                this.f56867u = true;
                int i7 = 0;
                this.f56866t = false;
                this.v = false;
                ArrayList arrayList = new ArrayList(this.f56859m.values());
                this.f56859m.clear();
                this.f56860n.clear();
                this.f56868w = 0;
                this.f56849a.notifyAll();
                try {
                    this.f56855i.close();
                } catch (Exception unused) {
                }
                r0 r0Var = r0.f25173f;
                if (r0Var != null) {
                    r0Var.d.remove(this);
                }
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    try {
                        ((h) obj).f56844b.close();
                    } catch (Exception unused2) {
                    }
                }
                g0.h3(new f(this, 0));
                this.f56856j.shutdownNow();
                this.f56857k.shutdownNow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void a() {
    }
}
