package pi;

import android.net.Uri;
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
import m4.w;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.w10;
import org.telegram.ui.Components.x10;
import org.telegram.ui.web.a2;
import org.telegram.ui.web.f2;
public final class k implements w10 {
    public static k A;
    public static final Object f45950y = new Object();
    public static k f45951z;
    public final String f45953b;
    public final String f45954c;
    public final String d;
    public final String f45955e;
    public final String f45956f;
    public final String f45957g;
    public final String h;
    public final ServerSocket f45958i;
    public WebView f45964o;
    public b5.h f45965p;
    public boolean f45966q;
    public boolean f45967r;
    public boolean f45968s;
    public boolean f45969t;
    public boolean f45970u;
    public boolean v;
    public int f45971w;
    public d f45972x;
    public final Object f45952a = new Object();
    public final ExecutorService f45959j = Executors.newCachedThreadPool();
    public final ExecutorService f45960k = Executors.newSingleThreadExecutor();
    public final AtomicInteger f45961l = new AtomicInteger(1);
    public final HashMap f45962m = new HashMap();
    public final ArrayDeque f45963n = new ArrayDeque();

    public k(la.h hVar, String str, byte[] bArr) {
        String j3;
        this.f45953b = (String) hVar.d;
        String str2 = (String) hVar.f15465b;
        this.f45954c = str2;
        String str3 = (String) hVar.f15466c;
        String q6 = str3.isEmpty() ? "/" : a1.g.q("/", str3, "/");
        this.d = q6;
        this.f45955e = str;
        String concat = "https://".concat(str2);
        this.f45956f = concat;
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
        this.f45957g = concat + q6 + "?bridge=" + encodeToString2 + "#android=" + encodeToString;
        this.f45958i = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void a(k kVar) {
        synchronized (kVar.f45952a) {
            try {
                if (!kVar.f45970u && kVar.f45964o == null) {
                    x10 x10Var = x10.getInstance();
                    if (x10Var != null && x10Var.isBackground()) {
                        kVar.v = true;
                        return;
                    }
                    kVar.v = false;
                    kVar.e();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        kVar.f45964o = webView;
                        kVar.f45966q = o.a("WEB_MESSAGE_ARRAY_BUFFER");
                        kVar.f45967r = false;
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
                        webView.setWebViewClient(new qg0(kVar, 2));
                        HashSet hashSet = new HashSet();
                        hashSet.add(kVar.f45956f);
                        a5.b.a(webView, "TelegramWebProxy", hashSet, new w(kVar, 17));
                        webView.loadUrl(kVar.f45957g);
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
                Socket accept = kVar.f45958i.accept();
                accept.setTcpNoDelay(true);
                synchronized (kVar.f45952a) {
                    if (!kVar.f45970u && kVar.f45962m.size() < 64) {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(kVar.f45961l, new Object());
                            if (andUpdate != 0 && !kVar.f45962m.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        j jVar = new j(andUpdate, accept);
                        kVar.f45962m.put(Integer.valueOf(andUpdate), jVar);
                        if (kVar.f45969t) {
                            jVar.f45949e = true;
                            kVar.l(1, andUpdate, null);
                        }
                        kVar.f45959j.execute(new f2(5, kVar, jVar));
                    }
                    try {
                        accept.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e7) {
                synchronized (kVar.f45952a) {
                    try {
                        if (!kVar.f45970u) {
                            FileLog.e(e7);
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

    public static int m(String str, String str2) {
        boolean z10;
        la.h i10 = i(str);
        byte[] d = d(str2);
        if (i10 != null && d != null) {
            try {
                z10 = o.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th2) {
                FileLog.e(th2);
                z10 = false;
            }
            if (z10) {
                synchronized (f45950y) {
                    try {
                        k kVar = f45951z;
                        if (kVar != null && !kVar.f45958i.isClosed() && f45951z.f45953b.equals((String) i10.d) && f45951z.f45955e.equals(str2)) {
                            return f45951z.f45958i.getLocalPort();
                        }
                        k kVar2 = f45951z;
                        if (kVar2 != null) {
                            kVar2.o();
                            f45951z = null;
                        }
                        try {
                            k kVar3 = new k(i10, str2, d);
                            f45951z = kVar3;
                            x10 x10Var = x10.getInstance();
                            if (x10Var != null) {
                                x10Var.addListener(kVar3);
                            }
                            kVar3.f45959j.execute(new g(kVar3, 1));
                            AndroidUtilities.runOnUIThread(new g(kVar3, 2));
                            return f45951z.f45958i.getLocalPort();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            k kVar4 = f45951z;
                            if (kVar4 != null) {
                                kVar4.o();
                                f45951z = null;
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

    public static void n() {
        synchronized (f45950y) {
            try {
                k kVar = f45951z;
                if (kVar != null) {
                    kVar.o();
                    f45951z = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(j jVar, boolean z10) {
        boolean z11;
        synchronized (this.f45952a) {
            try {
                if (this.f45962m.get(Integer.valueOf(jVar.f45946a)) != jVar) {
                    return;
                }
                this.f45962m.remove(Integer.valueOf(jVar.f45946a));
                if (z10 && this.f45969t && jVar.f45949e) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f45952a.notifyAll();
                try {
                    jVar.f45947b.close();
                } catch (Exception unused) {
                }
                if (z11) {
                    l(3, jVar.f45946a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        WebView webView = this.f45964o;
        this.f45964o = null;
        this.f45965p = null;
        this.f45967r = false;
        if (webView != null) {
            try {
                webView.stopLoading();
                webView.loadUrl("about:blank");
                webView.removeAllViews();
                webView.destroy();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final void f() {
        synchronized (this.f45952a) {
            if (!this.f45970u && !this.v) {
                this.v = true;
                int i10 = 0;
                this.f45969t = false;
                this.f45965p = null;
                this.f45963n.clear();
                this.f45971w = 0;
                ArrayList arrayList = new ArrayList(this.f45962m.values());
                this.f45962m.clear();
                this.f45952a.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).f45947b.close();
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
                synchronized (this.f45952a) {
                    if (!this.f45970u && this.f45965p == null) {
                        this.f45965p = hVar;
                        if (this.f45966q) {
                            this.f45967r = true;
                            l(16, 0, new byte[]{1});
                            return;
                        }
                        WebView webView = this.f45964o;
                        h hVar2 = new h(this, webView, hVar, 0);
                        AndroidUtilities.runOnUIThread(hVar2, 5000L);
                        try {
                            webView.evaluateJavascript("(function(){\n'use strict';\ntry {\n var bridge=window.TelegramWebProxy;\n if(!bridge||typeof bridge.postMessage!=='function'||typeof bridge.onmessage!=='function')return false;\n var nativePost=bridge.postMessage;\n var receive=bridge.onmessage;\n var prefix='tproxy-base64:';\n var maxBytes=1048584;\n var maxChars=1398112;\n function post(value){\n  if(value instanceof ArrayBuffer){\n   if(value.byteLength>maxBytes)throw new Error('WEB proxy frame too large');\n   var bytes=new Uint8Array(value),parts=[];\n   for(var i=0;i<bytes.length;i+=8192){\n    parts.push(String.fromCharCode.apply(null,bytes.subarray(i,Math.min(i+8192,bytes.length))));\n   }\n   nativePost.call(bridge,prefix+btoa(parts.join('')));\n  }else nativePost.call(bridge,value);\n }\n function onmessage(event){\n  var data=event.data;\n  if(typeof data==='string'&&data.indexOf(prefix)===0){\n   try {\n    var encoded=data.substring(prefix.length);\n    if(encoded.length>maxChars)throw new Error('WEB proxy frame too large');\n    var binary=atob(encoded);\n    if(binary.length>maxBytes)throw new Error('WEB proxy frame too large');\n    var bytes=new Uint8Array(binary.length);\n    for(var i=0;i<binary.length;i++)bytes[i]=binary.charCodeAt(i);\n    receive.call(bridge,{data:bytes.buffer});\n   }catch(error){nativePost.call(bridge,'{\"t\":\"close\"}');}\n  }else receive.call(bridge,event);\n }\n bridge.postMessage=post;\n bridge.onmessage=onmessage;\n return bridge.postMessage===post&&bridge.onmessage===onmessage;\n}catch(error){return false;}\n})()\n", new a2(this, hVar2, webView, hVar));
                        } catch (Exception e7) {
                            AndroidUtilities.cancelRunOnUIThread(hVar2);
                            FileLog.e(e7);
                            FileLog.e("WEB proxy: Base64 bridge installation threw an exception; transport stopped");
                            o();
                        }
                    }
                }
            } else if ("close".equals(optString) || "failed".equals(jSONObject.optString("state"))) {
                f();
            }
        } catch (Exception unused) {
        }
    }

    public final boolean h(WebView webView) {
        String url = webView.getUrl();
        if (url == null) {
            return false;
        }
        Uri parse = Uri.parse(url);
        if (!"https".equalsIgnoreCase(parse.getScheme()) || !this.f45954c.equalsIgnoreCase(parse.getHost()) || parse.getUserInfo() != null || parse.getPort() != -1 || !this.d.equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    public final void k(byte[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: pi.k.k(byte[]):void");
    }

    public final void l(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i10).put((byte) (i11 >> 16)).put((byte) (i11 >> 8)).put((byte) i11).putInt(bArr.length).put(bArr).array();
        synchronized (this.f45952a) {
            if (!this.f45970u && this.f45963n.size() < 8192 && this.f45971w <= 67108864 - array.length) {
                this.f45963n.add(array);
                this.f45971w += array.length;
                AndroidUtilities.runOnUIThread(new g(this, 4));
                return;
            }
            f();
        }
    }

    public final void o() {
        synchronized (this.f45952a) {
            try {
                if (this.f45970u) {
                    return;
                }
                this.f45970u = true;
                int i10 = 0;
                this.f45969t = false;
                this.v = false;
                ArrayList arrayList = new ArrayList(this.f45962m.values());
                this.f45962m.clear();
                this.f45963n.clear();
                this.f45971w = 0;
                this.f45952a.notifyAll();
                try {
                    this.f45958i.close();
                } catch (Exception unused) {
                }
                x10 x10Var = x10.getInstance();
                if (x10Var != null) {
                    x10Var.removeListener(this);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).f45947b.close();
                    } catch (Exception unused2) {
                    }
                }
                AndroidUtilities.runOnUIThread(new g(this, 0));
                this.f45959j.shutdownNow();
                this.f45960k.shutdownNow();
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
