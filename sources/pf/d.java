package pf;

import android.net.Uri;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.util.Pair;
import e6.n;
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
import org.telegram.ui.Components.ah;
import org.telegram.ui.v20;
import t7.t;
import zc.i;
public final class d extends i {
    public static final f f45631l;
    public static final HashMap f45632m;
    public final ExtendedDefaultDataSourceFactory f45633e;
    public final v20 f45634f;
    public final t f45635g;
    public final HashMap h;
    public Pair f45636i;
    public boolean f45637j;
    public final AtomicInteger f45638k;

    static {
        f fVar = new f(new e(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        f45631l = fVar;
        f[] fVarArr = {fVar};
        HashMap hashMap = new HashMap();
        f45632m = hashMap;
        f fVar2 = fVarArr[0];
        hashMap.put(fVar2.d, fVar2);
    }

    public d() {
        this.f54479c = new n(10);
        this.h = new HashMap();
        this.f45636i = null;
        this.f45637j = false;
        this.f45638k = new AtomicInteger();
        this.f45634f = new v20(28);
        this.f45635g = new Object();
        this.f45633e = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
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
            } catch (SocketException e7) {
                FileLog.e(e7);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(ipAddress & 255) + '.' + ((ipAddress >> 8) & 255) + '.' + ((ipAddress >> 16) & 255) + '.' + ((ipAddress >> 24) & 255));
        sb2.append(":61578");
        return sb2.toString();
    }

    public static String j(String str, String str2) {
        return a1.g.q("http://", str, str2);
    }

    @Override
    public final zc.g e(zc.d dVar) {
        String str;
        int incrementAndGet = this.f45638k.incrementAndGet();
        StringBuilder j3 = hg.c.j(incrementAndGet, "Request ", " ");
        switch (dVar.f54455g) {
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
        j3.append(str);
        j3.append(" ");
        j3.append(dVar.f54454f);
        j3.append(" ");
        j3.append((String) dVar.f54456i.get("range"));
        Log.d("CAST_SERVER", j3.toString());
        try {
            zc.g k10 = k(dVar);
            ah ahVar = k10.f54471e;
            ahVar.put("Access-Control-Allow-Origin", "*");
            ahVar.put("Access-Control-Max-Age", "3628800");
            ahVar.put("Access-Control-Allow-Methods", "*");
            ahVar.put("Access-Control-Allow-Headers", "*");
            return k10;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            zc.g c10 = i.c(zc.f.INTERNAL_ERROR, "text/plain", "Error reading file");
            ah ahVar2 = c10.f54471e;
            ahVar2.put("Access-Control-Allow-Origin", "*");
            ahVar2.put("Access-Control-Max-Age", "3628800");
            ahVar2.put("Access-Control-Allow-Methods", "*");
            ahVar2.put("Access-Control-Allow-Headers", "*");
            return c10;
        }
    }

    public final void h() {
        if (this.h.isEmpty()) {
            if (this.f45637j) {
                try {
                    i.d(this.f54477a);
                    n nVar = this.f54479c;
                    nVar.getClass();
                    ArrayList arrayList = new ArrayList((List) nVar.f8689c);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        zc.a aVar = (zc.a) obj;
                        i.d(aVar.f54440a);
                        i.d(aVar.f54441b);
                    }
                    Thread thread = this.f54478b;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (Exception e7) {
                    i.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e7);
                }
                this.f45637j = false;
            }
        } else if (!this.f45637j) {
            try {
                f();
                this.f45637j = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final zc.g k(zc.d r44) {
        throw new UnsupportedOperationException("Method not decompiled: pf.d.k(zc.d):zc.g");
    }

    public final void l(File file, String str) {
        if (str != null && file != null) {
            this.f45636i = new Pair(str, file);
        } else {
            Pair pair = this.f45636i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.f45636i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.f45636i = null;
        }
        h();
    }
}
