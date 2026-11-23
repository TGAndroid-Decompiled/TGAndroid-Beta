package wf;

import a8.p0;
import a8.va;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.util.Pair;
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
import org.telegram.messenger.a8;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.messenger.t0;
import org.telegram.ui.Components.xg;
import ug.x;
import v4.x0;
import yc.f;
import yc.g;
import yc.i;
public final class d extends i {
    public static final e f59720l;
    public static final HashMap f59721m;
    public final ExtendedDefaultDataSourceFactory f59722e;
    public final x f59723f;
    public final sa.d f59724g;
    public final HashMap h;
    public Pair f59725i;
    public boolean f59726j;
    public final AtomicInteger f59727k;

    static {
        e eVar = new e(new x0(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        f59720l = eVar;
        e[] eVarArr = {eVar};
        HashMap hashMap = new HashMap();
        f59721m = hashMap;
        e eVar2 = eVarArr[0];
        hashMap.put(eVar2.d, eVar2);
    }

    public d() {
        this.f61216c = new va(10);
        this.h = new HashMap();
        this.f59725i = null;
        this.f59726j = false;
        this.f59727k = new AtomicInteger();
        this.f59723f = new x(16);
        this.f59724g = new sa.d(11);
        this.f59722e = new ExtendedDefaultDataSourceFactory(t0.f26931b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
    }

    public static String i() {
        int ipAddress = ((WifiManager) t0.f26931b.getSystemService("wifi")).getConnectionInfo().getIpAddress();
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
                a8.g(e10, true);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(ipAddress & 255) + '.' + ((ipAddress >> 8) & 255) + '.' + ((ipAddress >> 16) & 255) + '.' + ((ipAddress >> 24) & 255));
        sb2.append(":61578");
        return sb2.toString();
    }

    public static String j(String str, String str2) {
        return p0.p("http://", str, str2);
    }

    @Override
    public final g e(yc.d dVar) {
        String str;
        int incrementAndGet = this.f59727k.incrementAndGet();
        StringBuilder m10 = i5.c.m(incrementAndGet, "Request ", " ");
        switch (dVar.f61192g) {
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
        m10.append(str);
        m10.append(" ");
        m10.append(dVar.f61191f);
        m10.append(" ");
        p5.c.t(m10, (String) dVar.f61193i.get("range"), "CAST_SERVER");
        try {
            g k10 = k(dVar);
            xg xgVar = k10.f61208e;
            xgVar.put("Access-Control-Allow-Origin", "*");
            xgVar.put("Access-Control-Max-Age", "3628800");
            xgVar.put("Access-Control-Allow-Methods", "*");
            xgVar.put("Access-Control-Allow-Headers", "*");
            return k10;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            g c10 = i.c(f.INTERNAL_ERROR, "text/plain", "Error reading file");
            xg xgVar2 = c10.f61208e;
            xgVar2.put("Access-Control-Allow-Origin", "*");
            xgVar2.put("Access-Control-Max-Age", "3628800");
            xgVar2.put("Access-Control-Allow-Methods", "*");
            xgVar2.put("Access-Control-Allow-Headers", "*");
            return c10;
        }
    }

    public final void h() {
        if (this.h.isEmpty()) {
            if (this.f59726j) {
                try {
                    i.d(this.f61214a);
                    va vaVar = this.f61216c;
                    vaVar.getClass();
                    ArrayList arrayList = new ArrayList((List) vaVar.f694c);
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        yc.a aVar = (yc.a) obj;
                        i.d(aVar.f61177a);
                        i.d(aVar.f61178b);
                    }
                    Thread thread = this.f61215b;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (Exception e10) {
                    i.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e10);
                }
                this.f59726j = false;
            }
        } else if (!this.f59726j) {
            try {
                f();
                this.f59726j = true;
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    public final yc.g k(yc.d r44) {
        throw new UnsupportedOperationException("Method not decompiled: wf.d.k(yc.d):yc.g");
    }

    public final void l(File file, String str) {
        if (str != null && file != null) {
            this.f59725i = new Pair(str, file);
        } else {
            Pair pair = this.f59725i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.f59725i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.f59725i = null;
        }
        h();
    }
}
