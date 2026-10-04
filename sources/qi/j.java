package qi;

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
import k2.v;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.zf0;
import org.telegram.ui.web.c2;
import org.telegram.ui.web.x1;
public final class j implements i10 {
    public static j A;
    public static final Object f45536y = new Object();
    public static j f45537z;
    public final String f45539b;
    public final String f45540c;
    public final String d;
    public final String f45541e;
    public final String f45542f;
    public final String f45543g;
    public final String h;
    public final ServerSocket f45544i;
    public WebView f45550o;
    public b5.h f45551p;
    public boolean f45552q;
    public boolean f45553r;
    public boolean f45554s;
    public boolean f45555t;
    public boolean f45556u;
    public boolean v;
    public int f45557w;
    public d f45558x;
    public final Object f45538a = new Object();
    public final ExecutorService f45545j = Executors.newCachedThreadPool();
    public final ExecutorService f45546k = Executors.newSingleThreadExecutor();
    public final AtomicInteger f45547l = new AtomicInteger(1);
    public final HashMap f45548m = new HashMap();
    public final ArrayDeque f45549n = new ArrayDeque();

    public j(la.h hVar, String str, byte[] bArr) {
        String j3;
        this.f45539b = (String) hVar.d;
        String str2 = (String) hVar.f15398b;
        this.f45540c = str2;
        String str3 = (String) hVar.f15399c;
        String p5 = str3.isEmpty() ? "/" : a4.a.p("/", str3, "/");
        this.d = p5;
        this.f45541e = str;
        String concat = "https://".concat(str2);
        this.f45542f = concat;
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
        this.f45543g = concat + p5 + "?bridge=" + encodeToString2 + "#android=" + encodeToString;
        this.f45544i = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void a(j jVar) {
        synchronized (jVar.f45538a) {
            try {
                if (!jVar.f45556u && jVar.f45550o == null) {
                    j10 j10Var = j10.getInstance();
                    if (j10Var != null && j10Var.isBackground()) {
                        jVar.v = true;
                        return;
                    }
                    jVar.v = false;
                    jVar.e();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        jVar.f45550o = webView;
                        jVar.f45552q = o.a("WEB_MESSAGE_ARRAY_BUFFER");
                        jVar.f45553r = false;
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
                        webView.setWebViewClient(new zf0(jVar, 2));
                        HashSet hashSet = new HashSet();
                        hashSet.add(jVar.f45542f);
                        a5.b.a(webView, "TelegramWebProxy", hashSet, new v(jVar, 29));
                        webView.loadUrl(jVar.f45543g);
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
                Socket accept = jVar.f45544i.accept();
                accept.setTcpNoDelay(true);
                synchronized (jVar.f45538a) {
                    if (!jVar.f45556u && jVar.f45548m.size() < 64) {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(jVar.f45547l, new Object());
                            if (andUpdate != 0 && !jVar.f45548m.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        i iVar = new i(andUpdate, accept);
                        jVar.f45548m.put(Integer.valueOf(andUpdate), iVar);
                        if (jVar.f45555t) {
                            iVar.f45535e = true;
                            jVar.l(1, andUpdate, null);
                        }
                        jVar.f45545j.execute(new x1(11, jVar, iVar));
                    }
                    try {
                        accept.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e7) {
                synchronized (jVar.f45538a) {
                    try {
                        if (!jVar.f45556u) {
                            FileLog.e(e7);
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
                synchronized (f45536y) {
                    try {
                        j jVar = f45537z;
                        if (jVar != null && !jVar.f45544i.isClosed() && f45537z.f45539b.equals((String) i10.d) && f45537z.f45541e.equals(str2)) {
                            return f45537z.f45544i.getLocalPort();
                        }
                        j jVar2 = f45537z;
                        if (jVar2 != null) {
                            jVar2.o();
                            f45537z = null;
                        }
                        try {
                            j jVar3 = new j(i10, str2, d);
                            f45537z = jVar3;
                            j10 j10Var = j10.getInstance();
                            if (j10Var != null) {
                                j10Var.addListener(jVar3);
                            }
                            jVar3.f45545j.execute(new g(jVar3, 1));
                            AndroidUtilities.runOnUIThread(new g(jVar3, 2));
                            return f45537z.f45544i.getLocalPort();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            j jVar4 = f45537z;
                            if (jVar4 != null) {
                                jVar4.o();
                                f45537z = null;
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
        synchronized (f45536y) {
            try {
                j jVar = f45537z;
                if (jVar != null) {
                    jVar.o();
                    f45537z = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(i iVar, boolean z10) {
        boolean z11;
        synchronized (this.f45538a) {
            try {
                if (this.f45548m.get(Integer.valueOf(iVar.f45532a)) != iVar) {
                    return;
                }
                this.f45548m.remove(Integer.valueOf(iVar.f45532a));
                if (z10 && this.f45555t && iVar.f45535e) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f45538a.notifyAll();
                try {
                    iVar.f45533b.close();
                } catch (Exception unused) {
                }
                if (z11) {
                    l(3, iVar.f45532a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        WebView webView = this.f45550o;
        this.f45550o = null;
        this.f45551p = null;
        this.f45553r = false;
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
        synchronized (this.f45538a) {
            if (!this.f45556u && !this.v) {
                this.v = true;
                int i10 = 0;
                this.f45555t = false;
                this.f45551p = null;
                this.f45549n.clear();
                this.f45557w = 0;
                ArrayList arrayList = new ArrayList(this.f45548m.values());
                this.f45548m.clear();
                this.f45538a.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((i) obj).f45533b.close();
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
                synchronized (this.f45538a) {
                    if (!this.f45556u && this.f45551p == null) {
                        this.f45551p = hVar;
                        if (this.f45552q) {
                            this.f45553r = true;
                            l(16, 0, new byte[]{1});
                            return;
                        }
                        WebView webView = this.f45550o;
                        in0 in0Var = new in0(this, webView, hVar, 27);
                        AndroidUtilities.runOnUIThread(in0Var, 5000L);
                        try {
                            webView.evaluateJavascript("(function(){\n'use strict';\ntry {\n var bridge=window.TelegramWebProxy;\n if(!bridge||typeof bridge.postMessage!=='function'||typeof bridge.onmessage!=='function')return false;\n var nativePost=bridge.postMessage;\n var receive=bridge.onmessage;\n var prefix='tproxy-base64:';\n var maxBytes=1048584;\n var maxChars=1398112;\n function post(value){\n  if(value instanceof ArrayBuffer){\n   if(value.byteLength>maxBytes)throw new Error('WEB proxy frame too large');\n   var bytes=new Uint8Array(value),parts=[];\n   for(var i=0;i<bytes.length;i+=8192){\n    parts.push(String.fromCharCode.apply(null,bytes.subarray(i,Math.min(i+8192,bytes.length))));\n   }\n   nativePost.call(bridge,prefix+btoa(parts.join('')));\n  }else nativePost.call(bridge,value);\n }\n function onmessage(event){\n  var data=event.data;\n  if(typeof data==='string'&&data.indexOf(prefix)===0){\n   try {\n    var encoded=data.substring(prefix.length);\n    if(encoded.length>maxChars)throw new Error('WEB proxy frame too large');\n    var binary=atob(encoded);\n    if(binary.length>maxBytes)throw new Error('WEB proxy frame too large');\n    var bytes=new Uint8Array(binary.length);\n    for(var i=0;i<binary.length;i++)bytes[i]=binary.charCodeAt(i);\n    receive.call(bridge,{data:bytes.buffer});\n   }catch(error){nativePost.call(bridge,'{\"t\":\"close\"}');}\n  }else receive.call(bridge,event);\n }\n bridge.postMessage=post;\n bridge.onmessage=onmessage;\n return bridge.postMessage===post&&bridge.onmessage===onmessage;\n}catch(error){return false;}\n})()\n", new c2(this, in0Var, webView, hVar));
                        } catch (Exception e7) {
                            AndroidUtilities.cancelRunOnUIThread(in0Var);
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
        if (!"https".equalsIgnoreCase(parse.getScheme()) || !this.f45540c.equalsIgnoreCase(parse.getHost()) || parse.getUserInfo() != null || parse.getPort() != -1 || !this.d.equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    public final void k(byte[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: qi.j.k(byte[]):void");
    }

    public final void l(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i10).put((byte) (i11 >> 16)).put((byte) (i11 >> 8)).put((byte) i11).putInt(bArr.length).put(bArr).array();
        synchronized (this.f45538a) {
            if (!this.f45556u && this.f45549n.size() < 8192 && this.f45557w <= 67108864 - array.length) {
                this.f45549n.add(array);
                this.f45557w += array.length;
                AndroidUtilities.runOnUIThread(new g(this, 4));
                return;
            }
            f();
        }
    }

    public final void o() {
        synchronized (this.f45538a) {
            try {
                if (this.f45556u) {
                    return;
                }
                this.f45556u = true;
                int i10 = 0;
                this.f45555t = false;
                this.v = false;
                ArrayList arrayList = new ArrayList(this.f45548m.values());
                this.f45548m.clear();
                this.f45549n.clear();
                this.f45557w = 0;
                this.f45538a.notifyAll();
                try {
                    this.f45544i.close();
                } catch (Exception unused) {
                }
                j10 j10Var = j10.getInstance();
                if (j10Var != null) {
                    j10Var.removeListener(this);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((i) obj).f45533b.close();
                    } catch (Exception unused2) {
                    }
                }
                AndroidUtilities.runOnUIThread(new g(this, 0));
                this.f45545j.shutdownNow();
                this.f45546k.shutdownNow();
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
