package xi;

import a8.p0;
import a8.p9;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
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
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.r0;
import org.telegram.messenger.t0;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.ld0;
import org.telegram.ui.n1;
import org.telegram.ui.web.p1;
import tg.z1;
import ug.t1;
public final class i implements c00 {
    public static i A;
    public static final Object f60064y = new Object();
    public static i f60065z;
    public final String f60067b;
    public final String f60068c;
    public final String d;
    public final String f60069e;
    public final String f60070f;
    public final String f60071g;
    public final String h;
    public final ServerSocket f60072i;
    public WebView f60078o;
    public e5.f f60079p;
    public boolean f60080q;
    public boolean f60081r;
    public boolean f60082s;
    public boolean f60083t;
    public boolean f60084u;
    public boolean v;
    public int f60085w;
    public c f60086x;
    public final Object f60066a = new Object();
    public final ExecutorService f60073j = Executors.newCachedThreadPool();
    public final ExecutorService f60074k = Executors.newSingleThreadExecutor();
    public final AtomicInteger f60075l = new AtomicInteger(1);
    public final HashMap f60076m = new HashMap();
    public final ArrayDeque f60077n = new ArrayDeque();

    public i(ld0 ld0Var, String str, byte[] bArr) {
        String l10;
        this.f60067b = (String) ld0Var.f48973c;
        String str2 = (String) ld0Var.d;
        this.f60068c = str2;
        String str3 = (String) ld0Var.f48972b;
        String p10 = str3.isEmpty() ? "/" : p0.p("/", str3, "/");
        this.d = p10;
        this.f60069e = str;
        String concat = "https://".concat(str2);
        this.f60070f = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.h = encodeToString;
        if (str3.isEmpty()) {
            l10 = "tdesktop-web-proxy-bridge-v1\n".concat(str2);
        } else {
            l10 = e2.l("tdesktop-web-proxy-bridge-v2\n", str2, "\n", str3);
        }
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        String encodeToString2 = Base64.encodeToString(mac.doFinal(l10.getBytes(StandardCharsets.UTF_8)), 11);
        this.f60071g = concat + p10 + "?bridge=" + encodeToString2 + "#android=" + encodeToString;
        this.f60072i = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void c(i iVar) {
        boolean z10;
        synchronized (iVar.f60066a) {
            try {
                if (!iVar.f60084u && iVar.f60078o == null) {
                    r0 r0Var = r0.f26183f;
                    if (r0Var != null) {
                        if (r0Var.f26184a == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            iVar.v = true;
                            return;
                        }
                    }
                    iVar.v = false;
                    iVar.g();
                    try {
                        WebView webView = new WebView(t0.f26609b);
                        iVar.f60078o = webView;
                        iVar.f60080q = p9.a("WEB_MESSAGE_ARRAY_BUFFER");
                        iVar.f60081r = false;
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
                        hashSet.add(iVar.f60070f);
                        d5.b.a(webView, "TelegramWebProxy", hashSet, new z1(iVar, 16));
                        webView.loadUrl(iVar.f60071g);
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
                Socket accept = iVar.f60072i.accept();
                accept.setTcpNoDelay(true);
                synchronized (iVar.f60066a) {
                    if (!iVar.f60084u && iVar.f60076m.size() < 64) {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(iVar.f60075l, new Object());
                            if (andUpdate != 0 && !iVar.f60076m.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        h hVar = new h(andUpdate, accept);
                        iVar.f60076m.put(Integer.valueOf(andUpdate), hVar);
                        if (iVar.f60083t) {
                            hVar.f60063e = true;
                            iVar.n(1, andUpdate, null);
                        }
                        iVar.f60073j.execute(new t1(18, iVar, hVar));
                    }
                    try {
                        accept.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e10) {
                synchronized (iVar.f60066a) {
                    try {
                        if (!iVar.f60084u) {
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

    public static ld0 k(String str) {
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
                return new ld0(l10, str3);
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
            trim = e2.k(trim, 1, 0);
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
        ld0 k10 = k(str);
        byte[] f10 = f(str2);
        if (k10 != null && f10 != null) {
            try {
                z10 = p9.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th2) {
                a8.g(th2, true);
                z10 = false;
            }
            if (z10) {
                synchronized (f60064y) {
                    try {
                        i iVar = f60065z;
                        if (iVar != null && !iVar.f60072i.isClosed() && f60065z.f60067b.equals((String) k10.f48973c) && f60065z.f60069e.equals(str2)) {
                            return f60065z.f60072i.getLocalPort();
                        }
                        i iVar2 = f60065z;
                        if (iVar2 != null) {
                            iVar2.q();
                            f60065z = null;
                        }
                        try {
                            i iVar3 = new i(k10, str2, f10);
                            f60065z = iVar3;
                            r0 r0Var = r0.f26183f;
                            if (r0Var != null) {
                                r0Var.d.add(iVar3);
                            }
                            iVar3.f60073j.execute(new f(iVar3, 1));
                            g0.h3(new f(iVar3, 2));
                            return f60065z.f60072i.getLocalPort();
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            i iVar4 = f60065z;
                            if (iVar4 != null) {
                                iVar4.q();
                                f60065z = null;
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
        synchronized (f60064y) {
            try {
                i iVar = f60065z;
                if (iVar != null) {
                    iVar.q();
                    f60065z = null;
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

    public final void e(h hVar, boolean z10) {
        boolean z11;
        synchronized (this.f60066a) {
            try {
                if (this.f60076m.get(Integer.valueOf(hVar.f60060a)) != hVar) {
                    return;
                }
                this.f60076m.remove(Integer.valueOf(hVar.f60060a));
                if (z10 && this.f60083t && hVar.f60063e) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f60066a.notifyAll();
                try {
                    hVar.f60061b.close();
                } catch (Exception unused) {
                }
                if (z11) {
                    n(3, hVar.f60060a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        WebView webView = this.f60078o;
        this.f60078o = null;
        this.f60079p = null;
        this.f60081r = false;
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
        synchronized (this.f60066a) {
            if (!this.f60084u && !this.v) {
                this.v = true;
                int i7 = 0;
                this.f60083t = false;
                this.f60079p = null;
                this.f60077n.clear();
                this.f60085w = 0;
                ArrayList arrayList = new ArrayList(this.f60076m.values());
                this.f60076m.clear();
                this.f60066a.notifyAll();
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    try {
                        ((h) obj).f60061b.close();
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
                synchronized (this.f60066a) {
                    if (!this.f60084u && this.f60079p == null) {
                        this.f60079p = fVar;
                        if (this.f60080q) {
                            this.f60081r = true;
                            n(16, 0, new byte[]{1});
                            return;
                        }
                        WebView webView = this.f60078o;
                        lv0 lv0Var = new lv0(this, webView, fVar, 28);
                        g0.i3(lv0Var, 5000L);
                        try {
                            webView.evaluateJavascript("(function(){\n'use strict';\ntry {\n var bridge=window.TelegramWebProxy;\n if(!bridge||typeof bridge.postMessage!=='function'||typeof bridge.onmessage!=='function')return false;\n var nativePost=bridge.postMessage;\n var receive=bridge.onmessage;\n var prefix='tproxy-base64:';\n var maxBytes=1048584;\n var maxChars=1398112;\n function post(value){\n  if(value instanceof ArrayBuffer){\n   if(value.byteLength>maxBytes)throw new Error('WEB proxy frame too large');\n   var bytes=new Uint8Array(value),parts=[];\n   for(var i=0;i<bytes.length;i+=8192){\n    parts.push(String.fromCharCode.apply(null,bytes.subarray(i,Math.min(i+8192,bytes.length))));\n   }\n   nativePost.call(bridge,prefix+btoa(parts.join('')));\n  }else nativePost.call(bridge,value);\n }\n function onmessage(event){\n  var data=event.data;\n  if(typeof data==='string'&&data.indexOf(prefix)===0){\n   try {\n    var encoded=data.substring(prefix.length);\n    if(encoded.length>maxChars)throw new Error('WEB proxy frame too large');\n    var binary=atob(encoded);\n    if(binary.length>maxBytes)throw new Error('WEB proxy frame too large');\n    var bytes=new Uint8Array(binary.length);\n    for(var i=0;i<binary.length;i++)bytes[i]=binary.charCodeAt(i);\n    receive.call(bridge,{data:bytes.buffer});\n   }catch(error){nativePost.call(bridge,'{\"t\":\"close\"}');}\n  }else receive.call(bridge,event);\n }\n bridge.postMessage=post;\n bridge.onmessage=onmessage;\n return bridge.postMessage===post&&bridge.onmessage===onmessage;\n}catch(error){return false;}\n})()\n", new p1(this, lv0Var, webView, fVar));
                        } catch (Exception e10) {
                            g0.r(lv0Var);
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
        if (!"https".equalsIgnoreCase(parse.getScheme()) || !this.f60068c.equalsIgnoreCase(parse.getHost()) || parse.getUserInfo() != null || parse.getPort() != -1 || !this.d.equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    public final void m(byte[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: xi.i.m(byte[]):void");
    }

    public final void n(int i7, int i10, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i7).put((byte) (i10 >> 16)).put((byte) (i10 >> 8)).put((byte) i10).putInt(bArr.length).put(bArr).array();
        synchronized (this.f60066a) {
            if (!this.f60084u && this.f60077n.size() < 8192 && this.f60085w <= 67108864 - array.length) {
                this.f60077n.add(array);
                this.f60085w += array.length;
                g0.h3(new f(this, 4));
                return;
            }
            h();
        }
    }

    public final void q() {
        synchronized (this.f60066a) {
            try {
                if (this.f60084u) {
                    return;
                }
                this.f60084u = true;
                int i7 = 0;
                this.f60083t = false;
                this.v = false;
                ArrayList arrayList = new ArrayList(this.f60076m.values());
                this.f60076m.clear();
                this.f60077n.clear();
                this.f60085w = 0;
                this.f60066a.notifyAll();
                try {
                    this.f60072i.close();
                } catch (Exception unused) {
                }
                r0 r0Var = r0.f26183f;
                if (r0Var != null) {
                    r0Var.d.remove(this);
                }
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    try {
                        ((h) obj).f60061b.close();
                    } catch (Exception unused2) {
                    }
                }
                g0.h3(new f(this, 0));
                this.f60073j.shutdownNow();
                this.f60074k.shutdownNow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void a() {
    }
}
