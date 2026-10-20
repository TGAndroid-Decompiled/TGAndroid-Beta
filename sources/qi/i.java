package qi;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.internal.play_billing.k3;
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
import m.g3;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.o10;
import org.telegram.ui.web.a2;
import qg.h0;
public final class i implements n10 {
    public static i A;
    public static final Object f44768y = new Object();
    public static i f44769z;
    public final String f44771b;
    public final String f44772c;
    public final String d;
    public final String e;
    public final String f44773f;
    public final String f44774g;
    public final String h;
    public final ServerSocket f44775i;
    public WebView f44781o;
    public b5.h f44782p;
    public boolean f44783q;
    public boolean f44784r;
    public boolean f44785s;
    public boolean f44786t;
    public boolean f44787u;
    public boolean v;
    public int f44788w;
    public c f44789x;
    public final Object f44770a = new Object();
    public final ExecutorService f44776j = Executors.newCachedThreadPool();
    public final ExecutorService f44777k = Executors.newSingleThreadExecutor();
    public final AtomicInteger f44778l = new AtomicInteger(1);
    public final HashMap f44779m = new HashMap();
    public final ArrayDeque f44780n = new ArrayDeque();

    public i(g3 g3Var, String str, byte[] bArr) {
        String k10;
        this.f44771b = (String) g3Var.d;
        String str2 = (String) g3Var.f16202b;
        this.f44772c = str2;
        String str3 = (String) g3Var.f16203c;
        String p5 = str3.isEmpty() ? "/" : a1.g.p("/", str3, "/");
        this.d = p5;
        this.e = str;
        String concat = "https://".concat(str2);
        this.f44773f = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.h = encodeToString;
        if (str3.isEmpty()) {
            k10 = "tdesktop-web-proxy-bridge-v1\n".concat(str2);
        } else {
            k10 = k3.k("tdesktop-web-proxy-bridge-v2\n", str2, "\n", str3);
        }
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        String encodeToString2 = Base64.encodeToString(mac.doFinal(k10.getBytes(StandardCharsets.UTF_8)), 11);
        this.f44774g = concat + p5 + "?bridge=" + encodeToString2 + "#android=" + encodeToString;
        this.f44775i = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void a(i iVar) {
        synchronized (iVar.f44770a) {
            try {
                if (!iVar.f44787u && iVar.f44781o == null) {
                    o10 o10Var = o10.getInstance();
                    if (o10Var != null && o10Var.isBackground()) {
                        iVar.v = true;
                        return;
                    }
                    iVar.v = false;
                    iVar.e();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        iVar.f44781o = webView;
                        iVar.f44783q = a.a.a("WEB_MESSAGE_ARRAY_BUFFER");
                        iVar.f44784r = false;
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
                        webView.setWebViewClient(new hg0(iVar, 2));
                        HashSet hashSet = new HashSet();
                        hashSet.add(iVar.f44773f);
                        a5.c.a(webView, "TelegramWebProxy", hashSet, new h0(iVar, 1));
                        webView.loadUrl(iVar.f44774g);
                    } catch (Exception e) {
                        FileLog.e(e);
                        iVar.f();
                    }
                }
            } finally {
            }
        }
    }

    public static void b(i iVar) {
        int andUpdate;
        while (true) {
            try {
                Socket accept = iVar.f44775i.accept();
                accept.setTcpNoDelay(true);
                synchronized (iVar.f44770a) {
                    if (!iVar.f44787u && iVar.f44779m.size() < 64) {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(iVar.f44778l, new Object());
                            if (andUpdate != 0 && !iVar.f44779m.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        h hVar = new h(andUpdate, accept);
                        iVar.f44779m.put(Integer.valueOf(andUpdate), hVar);
                        if (iVar.f44786t) {
                            hVar.e = true;
                            iVar.l(1, andUpdate, null);
                        }
                        iVar.f44776j.execute(new p2.b(3, iVar, hVar));
                    }
                    try {
                        accept.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                synchronized (iVar.f44770a) {
                    try {
                        if (!iVar.f44787u) {
                            FileLog.e(e);
                            iVar.f();
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

    public static g3 i(String str) {
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
                return new g3(j10, str3);
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
            trim = k3.j(1, 0, trim);
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
        g3 i10 = i(str);
        byte[] d = d(str2);
        if (i10 != null && d != null) {
            try {
                z10 = a.a.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th2) {
                FileLog.e(th2);
                z10 = false;
            }
            if (z10) {
                synchronized (f44768y) {
                    try {
                        i iVar = f44769z;
                        if (iVar != null && !iVar.f44775i.isClosed() && f44769z.f44771b.equals((String) i10.d) && f44769z.e.equals(str2)) {
                            return f44769z.f44775i.getLocalPort();
                        }
                        i iVar2 = f44769z;
                        if (iVar2 != null) {
                            iVar2.o();
                            f44769z = null;
                        }
                        try {
                            i iVar3 = new i(i10, str2, d);
                            f44769z = iVar3;
                            o10 o10Var = o10.getInstance();
                            if (o10Var != null) {
                                o10Var.addListener(iVar3);
                            }
                            iVar3.f44776j.execute(new f(iVar3, 1));
                            AndroidUtilities.runOnUIThread(new f(iVar3, 2));
                            return f44769z.f44775i.getLocalPort();
                        } catch (Exception e) {
                            FileLog.e(e);
                            i iVar4 = f44769z;
                            if (iVar4 != null) {
                                iVar4.o();
                                f44769z = null;
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
        synchronized (f44768y) {
            try {
                i iVar = f44769z;
                if (iVar != null) {
                    iVar.o();
                    f44769z = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(h hVar, boolean z10) {
        boolean z11;
        synchronized (this.f44770a) {
            try {
                if (this.f44779m.get(Integer.valueOf(hVar.f44765a)) != hVar) {
                    return;
                }
                this.f44779m.remove(Integer.valueOf(hVar.f44765a));
                if (z10 && this.f44786t && hVar.e) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f44770a.notifyAll();
                try {
                    hVar.f44766b.close();
                } catch (Exception unused) {
                }
                if (z11) {
                    l(3, hVar.f44765a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        WebView webView = this.f44781o;
        this.f44781o = null;
        this.f44782p = null;
        this.f44784r = false;
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
        synchronized (this.f44770a) {
            if (!this.f44787u && !this.v) {
                this.v = true;
                int i10 = 0;
                this.f44786t = false;
                this.f44782p = null;
                this.f44780n.clear();
                this.f44788w = 0;
                ArrayList arrayList = new ArrayList(this.f44779m.values());
                this.f44779m.clear();
                this.f44770a.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((h) obj).f44766b.close();
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.runOnUIThread(new f(this, 3));
            }
        }
    }

    public final void g(String str, b5.h hVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("t");
            if ("tproxy-android-init".equals(optString) && jSONObject.optInt("v") == 1 && this.h.equals(jSONObject.optString("nonce"))) {
                synchronized (this.f44770a) {
                    if (!this.f44787u && this.f44782p == null) {
                        this.f44782p = hVar;
                        if (this.f44783q) {
                            this.f44784r = true;
                            l(16, 0, new byte[]{1});
                            return;
                        }
                        WebView webView = this.f44781o;
                        cy0 cy0Var = new cy0(this, webView, hVar, 15);
                        AndroidUtilities.runOnUIThread(cy0Var, 5000L);
                        try {
                            webView.evaluateJavascript("(function(){\n'use strict';\ntry {\n var bridge=window.TelegramWebProxy;\n if(!bridge||typeof bridge.postMessage!=='function'||typeof bridge.onmessage!=='function')return false;\n var nativePost=bridge.postMessage;\n var receive=bridge.onmessage;\n var prefix='tproxy-base64:';\n var maxBytes=1048584;\n var maxChars=1398112;\n function post(value){\n  if(value instanceof ArrayBuffer){\n   if(value.byteLength>maxBytes)throw new Error('WEB proxy frame too large');\n   var bytes=new Uint8Array(value),parts=[];\n   for(var i=0;i<bytes.length;i+=8192){\n    parts.push(String.fromCharCode.apply(null,bytes.subarray(i,Math.min(i+8192,bytes.length))));\n   }\n   nativePost.call(bridge,prefix+btoa(parts.join('')));\n  }else nativePost.call(bridge,value);\n }\n function onmessage(event){\n  var data=event.data;\n  if(typeof data==='string'&&data.indexOf(prefix)===0){\n   try {\n    var encoded=data.substring(prefix.length);\n    if(encoded.length>maxChars)throw new Error('WEB proxy frame too large');\n    var binary=atob(encoded);\n    if(binary.length>maxBytes)throw new Error('WEB proxy frame too large');\n    var bytes=new Uint8Array(binary.length);\n    for(var i=0;i<binary.length;i++)bytes[i]=binary.charCodeAt(i);\n    receive.call(bridge,{data:bytes.buffer});\n   }catch(error){nativePost.call(bridge,'{\"t\":\"close\"}');}\n  }else receive.call(bridge,event);\n }\n bridge.postMessage=post;\n bridge.onmessage=onmessage;\n return bridge.postMessage===post&&bridge.onmessage===onmessage;\n}catch(error){return false;}\n})()\n", new a2(this, cy0Var, webView, hVar));
                        } catch (Exception e) {
                            AndroidUtilities.cancelRunOnUIThread(cy0Var);
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
        if (!"https".equalsIgnoreCase(parse.getScheme()) || !this.f44772c.equalsIgnoreCase(parse.getHost()) || parse.getUserInfo() != null || parse.getPort() != -1 || !this.d.equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    public final void k(byte[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: qi.i.k(byte[]):void");
    }

    public final void l(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i10).put((byte) (i11 >> 16)).put((byte) (i11 >> 8)).put((byte) i11).putInt(bArr.length).put(bArr).array();
        synchronized (this.f44770a) {
            if (!this.f44787u && this.f44780n.size() < 8192 && this.f44788w <= 67108864 - array.length) {
                this.f44780n.add(array);
                this.f44788w += array.length;
                AndroidUtilities.runOnUIThread(new f(this, 4));
                return;
            }
            f();
        }
    }

    public final void o() {
        synchronized (this.f44770a) {
            try {
                if (this.f44787u) {
                    return;
                }
                this.f44787u = true;
                int i10 = 0;
                this.f44786t = false;
                this.v = false;
                ArrayList arrayList = new ArrayList(this.f44779m.values());
                this.f44779m.clear();
                this.f44780n.clear();
                this.f44788w = 0;
                this.f44770a.notifyAll();
                try {
                    this.f44775i.close();
                } catch (Exception unused) {
                }
                o10 o10Var = o10.getInstance();
                if (o10Var != null) {
                    o10Var.removeListener(this);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((h) obj).f44766b.close();
                    } catch (Exception unused2) {
                    }
                }
                AndroidUtilities.runOnUIThread(new f(this, 0));
                this.f44776j.shutdownNow();
                this.f44777k.shutdownNow();
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
