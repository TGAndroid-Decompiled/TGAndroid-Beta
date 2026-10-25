package ti;

import a8.v1;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c3.h0;
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
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.r10;
import org.telegram.ui.Components.voip.j1;
import org.telegram.ui.web.a2;
import sg.u;
public final class j implements q10 {
    public static j A;
    public static final Object f49190y = new Object();
    public static j f49191z;
    public final String f49193b;
    public final String f49194c;
    public final String d;
    public final String e;
    public final String f49195f;
    public final String f49196g;
    public final String h;
    public final ServerSocket f49197i;
    public WebView f49203o;
    public c5.h f49204p;
    public boolean f49205q;
    public boolean f49206r;
    public boolean f49207s;
    public boolean f49208t;
    public boolean f49209u;
    public boolean v;
    public int f49210w;
    public c f49211x;
    public final Object f49192a = new Object();
    public final ExecutorService f49198j = Executors.newCachedThreadPool();
    public final ExecutorService f49199k = Executors.newSingleThreadExecutor();
    public final AtomicInteger f49200l = new AtomicInteger(1);
    public final HashMap f49201m = new HashMap();
    public final ArrayDeque f49202n = new ArrayDeque();

    public j(s4.d dVar, String str, byte[] bArr) {
        String m10;
        this.f49193b = (String) dVar.d;
        String str2 = (String) dVar.f47717b;
        this.f49194c = str2;
        String str3 = (String) dVar.f47718c;
        String p10 = str3.isEmpty() ? "/" : a1.g.p("/", str3, "/");
        this.d = p10;
        this.e = str;
        String concat = "https://".concat(str2);
        this.f49195f = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.h = encodeToString;
        if (str3.isEmpty()) {
            m10 = "tdesktop-web-proxy-bridge-v1\n".concat(str2);
        } else {
            m10 = h0.m("tdesktop-web-proxy-bridge-v2\n", str2, "\n", str3);
        }
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        String encodeToString2 = Base64.encodeToString(mac.doFinal(m10.getBytes(StandardCharsets.UTF_8)), 11);
        this.f49196g = concat + p10 + "?bridge=" + encodeToString2 + "#android=" + encodeToString;
        this.f49197i = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void a(j jVar) {
        synchronized (jVar.f49192a) {
            try {
                if (!jVar.f49209u && jVar.f49203o == null) {
                    r10 r10Var = r10.getInstance();
                    if (r10Var != null && r10Var.isBackground()) {
                        jVar.v = true;
                        return;
                    }
                    jVar.v = false;
                    jVar.e();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        jVar.f49203o = webView;
                        jVar.f49205q = v1.a("WEB_MESSAGE_ARRAY_BUFFER");
                        jVar.f49206r = false;
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
                        webView.setWebViewClient(new ig0(jVar, 2));
                        HashSet hashSet = new HashSet();
                        hashSet.add(jVar.f49195f);
                        b5.a.a(webView, "TelegramWebProxy", hashSet, new j1(jVar, 21));
                        webView.loadUrl(jVar.f49196g);
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
                Socket accept = jVar.f49197i.accept();
                accept.setTcpNoDelay(true);
                synchronized (jVar.f49192a) {
                    if (!jVar.f49209u && jVar.f49201m.size() < 64) {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(jVar.f49200l, new Object());
                            if (andUpdate != 0 && !jVar.f49201m.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        i iVar = new i(andUpdate, accept);
                        jVar.f49201m.put(Integer.valueOf(andUpdate), iVar);
                        if (jVar.f49208t) {
                            iVar.e = true;
                            jVar.l(1, andUpdate, null);
                        }
                        jVar.f49198j.execute(new u(9, jVar, iVar));
                    }
                    try {
                        accept.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                synchronized (jVar.f49192a) {
                    try {
                        if (!jVar.f49209u) {
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

    public static s4.d i(String str) {
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
            String j10 = j(str2);
            if (indexOf >= 0) {
                str3 = str.substring(indexOf + 1);
            } else {
                str3 = "";
            }
            if (!TextUtils.isEmpty(j10) && str3.length() <= 128) {
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
                return new s4.d(j10, str3);
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
            trim = h0.l(1, 0, trim);
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
        s4.d i10 = i(str);
        byte[] d = d(str2);
        if (i10 != null && d != null) {
            try {
                z10 = v1.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th2) {
                FileLog.e(th2);
                z10 = false;
            }
            if (z10) {
                synchronized (f49190y) {
                    try {
                        j jVar = f49191z;
                        if (jVar != null && !jVar.f49197i.isClosed() && f49191z.f49193b.equals((String) i10.d) && f49191z.e.equals(str2)) {
                            return f49191z.f49197i.getLocalPort();
                        }
                        j jVar2 = f49191z;
                        if (jVar2 != null) {
                            jVar2.o();
                            f49191z = null;
                        }
                        try {
                            j jVar3 = new j(i10, str2, d);
                            f49191z = jVar3;
                            r10 r10Var = r10.getInstance();
                            if (r10Var != null) {
                                r10Var.addListener(jVar3);
                            }
                            jVar3.f49198j.execute(new f(jVar3, 1));
                            AndroidUtilities.runOnUIThread(new f(jVar3, 2));
                            return f49191z.f49197i.getLocalPort();
                        } catch (Exception e) {
                            FileLog.e(e);
                            j jVar4 = f49191z;
                            if (jVar4 != null) {
                                jVar4.o();
                                f49191z = null;
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
        synchronized (f49190y) {
            try {
                j jVar = f49191z;
                if (jVar != null) {
                    jVar.o();
                    f49191z = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(i iVar, boolean z10) {
        boolean z11;
        synchronized (this.f49192a) {
            try {
                if (this.f49201m.get(Integer.valueOf(iVar.f49187a)) != iVar) {
                    return;
                }
                this.f49201m.remove(Integer.valueOf(iVar.f49187a));
                if (z10 && this.f49208t && iVar.e) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f49192a.notifyAll();
                try {
                    iVar.f49188b.close();
                } catch (Exception unused) {
                }
                if (z11) {
                    l(3, iVar.f49187a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        WebView webView = this.f49203o;
        this.f49203o = null;
        this.f49204p = null;
        this.f49206r = false;
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
        synchronized (this.f49192a) {
            if (!this.f49209u && !this.v) {
                this.v = true;
                int i10 = 0;
                this.f49208t = false;
                this.f49204p = null;
                this.f49202n.clear();
                this.f49210w = 0;
                ArrayList arrayList = new ArrayList(this.f49201m.values());
                this.f49201m.clear();
                this.f49192a.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((i) obj).f49188b.close();
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.runOnUIThread(new f(this, 3));
            }
        }
    }

    public final void g(String str, c5.h hVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("t");
            if ("tproxy-android-init".equals(optString) && jSONObject.optInt("v") == 1 && this.h.equals(jSONObject.optString("nonce"))) {
                synchronized (this.f49192a) {
                    if (!this.f49209u && this.f49204p == null) {
                        this.f49204p = hVar;
                        if (this.f49205q) {
                            this.f49206r = true;
                            l(16, 0, new byte[]{1});
                            return;
                        }
                        WebView webView = this.f49203o;
                        ny0 ny0Var = new ny0(this, webView, hVar, 15);
                        AndroidUtilities.runOnUIThread(ny0Var, 5000L);
                        try {
                            webView.evaluateJavascript("(function(){\n'use strict';\ntry {\n var bridge=window.TelegramWebProxy;\n if(!bridge||typeof bridge.postMessage!=='function'||typeof bridge.onmessage!=='function')return false;\n var nativePost=bridge.postMessage;\n var receive=bridge.onmessage;\n var prefix='tproxy-base64:';\n var maxBytes=1048584;\n var maxChars=1398112;\n function post(value){\n  if(value instanceof ArrayBuffer){\n   if(value.byteLength>maxBytes)throw new Error('WEB proxy frame too large');\n   var bytes=new Uint8Array(value),parts=[];\n   for(var i=0;i<bytes.length;i+=8192){\n    parts.push(String.fromCharCode.apply(null,bytes.subarray(i,Math.min(i+8192,bytes.length))));\n   }\n   nativePost.call(bridge,prefix+btoa(parts.join('')));\n  }else nativePost.call(bridge,value);\n }\n function onmessage(event){\n  var data=event.data;\n  if(typeof data==='string'&&data.indexOf(prefix)===0){\n   try {\n    var encoded=data.substring(prefix.length);\n    if(encoded.length>maxChars)throw new Error('WEB proxy frame too large');\n    var binary=atob(encoded);\n    if(binary.length>maxBytes)throw new Error('WEB proxy frame too large');\n    var bytes=new Uint8Array(binary.length);\n    for(var i=0;i<binary.length;i++)bytes[i]=binary.charCodeAt(i);\n    receive.call(bridge,{data:bytes.buffer});\n   }catch(error){nativePost.call(bridge,'{\"t\":\"close\"}');}\n  }else receive.call(bridge,event);\n }\n bridge.postMessage=post;\n bridge.onmessage=onmessage;\n return bridge.postMessage===post&&bridge.onmessage===onmessage;\n}catch(error){return false;}\n})()\n", new a2(this, ny0Var, webView, hVar));
                        } catch (Exception e) {
                            AndroidUtilities.cancelRunOnUIThread(ny0Var);
                            FileLog.e(e);
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
        if (!"https".equalsIgnoreCase(parse.getScheme()) || !this.f49194c.equalsIgnoreCase(parse.getHost()) || parse.getUserInfo() != null || parse.getPort() != -1 || !this.d.equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    public final void k(byte[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: ti.j.k(byte[]):void");
    }

    public final void l(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i10).put((byte) (i11 >> 16)).put((byte) (i11 >> 8)).put((byte) i11).putInt(bArr.length).put(bArr).array();
        synchronized (this.f49192a) {
            if (!this.f49209u && this.f49202n.size() < 8192 && this.f49210w <= 67108864 - array.length) {
                this.f49202n.add(array);
                this.f49210w += array.length;
                AndroidUtilities.runOnUIThread(new f(this, 4));
                return;
            }
            f();
        }
    }

    public final void o() {
        synchronized (this.f49192a) {
            try {
                if (this.f49209u) {
                    return;
                }
                this.f49209u = true;
                int i10 = 0;
                this.f49208t = false;
                this.v = false;
                ArrayList arrayList = new ArrayList(this.f49201m.values());
                this.f49201m.clear();
                this.f49202n.clear();
                this.f49210w = 0;
                this.f49192a.notifyAll();
                try {
                    this.f49197i.close();
                } catch (Exception unused) {
                }
                r10 r10Var = r10.getInstance();
                if (r10Var != null) {
                    r10Var.removeListener(this);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((i) obj).f49188b.close();
                    } catch (Exception unused2) {
                    }
                }
                AndroidUtilities.runOnUIThread(new f(this, 0));
                this.f49198j.shutdownNow();
                this.f49199k.shutdownNow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onBecameForeground() {
        AndroidUtilities.runOnUIThread(new f(this, 2));
    }

    @Override
    public final void onBecameBackground() {
    }
}
