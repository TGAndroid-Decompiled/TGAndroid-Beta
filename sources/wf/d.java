package wf;

import a8.p0;
import a8.ua;
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
import org.telegram.ui.Components.gg;
import v0.j;
import v4.v0;
import yc.f;
import yc.g;
import yc.i;
public final class d extends i {
    public static final e f57567l;
    public static final HashMap f57568m;
    public final ExtendedDefaultDataSourceFactory f57569e;
    public final j f57570f;
    public final sa.d f57571g;
    public final HashMap h;
    public Pair f57572i;
    public boolean f57573j;
    public final AtomicInteger f57574k;

    static {
        e eVar = new e(new v0(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        f57567l = eVar;
        e[] eVarArr = {eVar};
        HashMap hashMap = new HashMap();
        f57568m = hashMap;
        e eVar2 = eVarArr[0];
        hashMap.put(eVar2.d, eVar2);
    }

    public d() {
        this.f59301c = new ua(11);
        this.h = new HashMap();
        this.f57572i = null;
        this.f57573j = false;
        this.f57574k = new AtomicInteger();
        this.f57570f = new j(13);
        this.f57571g = new sa.d(11);
        this.f57569e = new ExtendedDefaultDataSourceFactory(t0.f25563b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
    }

    public static String i() {
        int ipAddress = ((WifiManager) t0.f25563b.getSystemService("wifi")).getConnectionInfo().getIpAddress();
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
        int incrementAndGet = this.f57574k.incrementAndGet();
        StringBuilder n10 = jg.g.n(incrementAndGet, "Request ", " ");
        switch (dVar.f59277g) {
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
        n10.append(str);
        n10.append(" ");
        n10.append(dVar.f59276f);
        n10.append(" ");
        n10.append((String) dVar.f59278i.get("range"));
        Log.d("CAST_SERVER", n10.toString());
        try {
            g k10 = k(dVar);
            gg ggVar = k10.f59293e;
            ggVar.put("Access-Control-Allow-Origin", "*");
            ggVar.put("Access-Control-Max-Age", "3628800");
            ggVar.put("Access-Control-Allow-Methods", "*");
            ggVar.put("Access-Control-Allow-Headers", "*");
            return k10;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            g c10 = i.c(f.INTERNAL_ERROR, "text/plain", "Error reading file");
            gg ggVar2 = c10.f59293e;
            ggVar2.put("Access-Control-Allow-Origin", "*");
            ggVar2.put("Access-Control-Max-Age", "3628800");
            ggVar2.put("Access-Control-Allow-Methods", "*");
            ggVar2.put("Access-Control-Allow-Headers", "*");
            return c10;
        }
    }

    public final void h() {
        if (this.h.isEmpty()) {
            if (this.f57573j) {
                try {
                    i.d(this.f59299a);
                    ua uaVar = this.f59301c;
                    uaVar.getClass();
                    ArrayList arrayList = new ArrayList((List) uaVar.f680c);
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        yc.a aVar = (yc.a) obj;
                        i.d(aVar.f59262a);
                        i.d(aVar.f59263b);
                    }
                    Thread thread = this.f59300b;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (Exception e10) {
                    i.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e10);
                }
                this.f57573j = false;
            }
        } else if (!this.f57573j) {
            try {
                f();
                this.f57573j = true;
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
            this.f57572i = new Pair(str, file);
        } else {
            Pair pair = this.f57572i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.f57572i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.f57572i = null;
        }
        h();
    }
}
