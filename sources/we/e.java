package we;

import android.net.Uri;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.util.Pair;
import f2.g1;
import gc.h;
import gc.k;
import j3.r0;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import v0.l;
public final class e extends k {
    public static final f f48800l;
    public static final HashMap f48801m;
    public final ExtendedDefaultDataSourceFactory f48802e;
    public final l f48803f;
    public final wa.a f48804g;
    public final HashMap h;
    public Pair f48805i;
    public boolean f48806j;
    public final AtomicInteger f48807k;

    static {
        f fVar = new f(new g1(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        f48800l = fVar;
        f[] fVarArr = {fVar};
        HashMap hashMap = new HashMap();
        f48801m = hashMap;
        f fVar2 = fVarArr[0];
        hashMap.put(fVar2.d, fVar2);
    }

    public e() {
        this.f7735c = new f2.d(2);
        this.h = new HashMap();
        this.f48805i = null;
        this.f48806j = false;
        this.f48807k = new AtomicInteger();
        this.f48803f = new l(3);
        this.f48804g = new wa.a(4);
        this.f48802e = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
    }

    public static String i() {
        int ipAddress = ((WifiManager) ApplicationLoader.applicationContext.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        if (ipAddress == 0) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (nextElement.isSiteLocalAddress()) {
                            byte[] address = nextElement.getAddress();
                            ipAddress = (((address[3] + 256) % 256) << 24) + ((address[0] + 256) % 256) + (((address[1] + 256) % 256) << 8) + (((address[2] + 256) % 256) << 16);
                        }
                    }
                }
            } catch (SocketException e10) {
                FileLog.e(e10);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(ipAddress & 255) + '.' + ((ipAddress >> 8) & 255) + '.' + ((ipAddress >> 16) & 255) + '.' + ((ipAddress >> 24) & 255));
        sb2.append(":61578");
        return sb2.toString();
    }

    public static String j(String str, String str2) {
        return aa.d.o("http://", str, str2);
    }

    @Override
    public final h e(gc.d dVar) {
        String str;
        int incrementAndGet = this.f48807k.incrementAndGet();
        StringBuilder p6 = r0.p(incrementAndGet, "Request ", " ");
        switch (dVar.f7706g) {
            case 1:
                str = "GET";
                break;
            case 2:
                str = "PUT";
                break;
            case 3:
                str = "POST";
                break;
            case 4:
                str = "DELETE";
                break;
            case 5:
                str = "HEAD";
                break;
            case 6:
                str = "OPTIONS";
                break;
            case 7:
                str = "TRACE";
                break;
            case 8:
                str = "CONNECT";
                break;
            case 9:
                str = "PATCH";
                break;
            case 10:
                str = "PROPFIND";
                break;
            case 11:
                str = "PROPPATCH";
                break;
            case 12:
                str = "MKCOL";
                break;
            case 13:
                str = "MOVE";
                break;
            case 14:
                str = "COPY";
                break;
            case 15:
                str = "LOCK";
                break;
            case 16:
                str = "UNLOCK";
                break;
            default:
                str = "null";
                break;
        }
        p6.append(str);
        p6.append(" ");
        p6.append(dVar.f7705f);
        p6.append(" ");
        p6.append((String) dVar.f7707i.get("range"));
        Log.d("CAST_SERVER", p6.toString());
        try {
            h k10 = k(dVar);
            gc.e eVar = k10.f7724e;
            eVar.put("Access-Control-Allow-Origin", "*");
            eVar.put("Access-Control-Max-Age", "3628800");
            eVar.put("Access-Control-Allow-Methods", "*");
            eVar.put("Access-Control-Allow-Headers", "*");
            return k10;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            h c10 = k.c(gc.g.INTERNAL_ERROR, "text/plain", "Error reading file");
            gc.e eVar2 = c10.f7724e;
            eVar2.put("Access-Control-Allow-Origin", "*");
            eVar2.put("Access-Control-Max-Age", "3628800");
            eVar2.put("Access-Control-Allow-Methods", "*");
            eVar2.put("Access-Control-Allow-Headers", "*");
            return c10;
        }
    }

    public final void h() {
        if (this.h.isEmpty()) {
            if (this.f48806j) {
                try {
                    k.d(this.f7733a);
                    f2.d dVar = this.f7735c;
                    dVar.getClass();
                    ArrayList arrayList = new ArrayList((List) dVar.f5338c);
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        gc.a aVar = (gc.a) obj;
                        k.d(aVar.f7691a);
                        k.d(aVar.f7692b);
                    }
                    Thread thread = this.f7734b;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (Exception e10) {
                    k.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e10);
                }
                this.f48806j = false;
            }
        } else if (!this.f48806j) {
            try {
                f();
                this.f48806j = true;
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    public final gc.h k(gc.d r44) {
        throw new UnsupportedOperationException("Method not decompiled: we.e.k(gc.d):gc.h");
    }

    public final void l(File file, String str) {
        if (str != null && file != null) {
            this.f48805i = new Pair(str, file);
        } else {
            Pair pair = this.f48805i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.f48805i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.f48805i = null;
        }
        h();
    }
}
