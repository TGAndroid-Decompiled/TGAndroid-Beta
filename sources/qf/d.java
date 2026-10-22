package qf;

import ad.i;
import ad.j;
import ad.m;
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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.ui.fk0;
import t7.u;
public final class d extends m {
    public static final f f44455l;
    public static final HashMap f44456m;
    public final ExtendedDefaultDataSourceFactory e;
    public final fk0 f44457f;
    public final u f44458g;
    public final HashMap h;
    public Pair f44459i;
    public boolean f44460j;
    public final AtomicInteger f44461k;

    static {
        f fVar = new f(new e(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        f44455l = fVar;
        f[] fVarArr = {fVar};
        HashMap hashMap = new HashMap();
        f44456m = hashMap;
        f fVar2 = fVarArr[0];
        hashMap.put(fVar2.d, fVar2);
    }

    public d() {
        this.f539c = new ad.d(0);
        this.h = new HashMap();
        this.f44459i = null;
        this.f44460j = false;
        this.f44461k = new AtomicInteger();
        this.f44457f = new fk0(24);
        this.f44458g = new u(8);
        this.e = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
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
            } catch (SocketException e) {
                FileLog.e(e);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(ipAddress & 255) + '.' + ((ipAddress >> 8) & 255) + '.' + ((ipAddress >> 16) & 255) + '.' + ((ipAddress >> 24) & 255));
        sb2.append(":61578");
        return sb2.toString();
    }

    public static String j(String str, String str2) {
        return a1.g.p("http://", str, str2);
    }

    @Override
    public final j e(ad.f fVar) {
        String str;
        int incrementAndGet = this.f44461k.incrementAndGet();
        StringBuilder l4 = i2.e.l(incrementAndGet, "Request ", " ");
        switch (fVar.f512g) {
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
        l4.append(str);
        l4.append(" ");
        l4.append(fVar.f511f);
        l4.append(" ");
        l4.append((String) fVar.f513i.get("range"));
        Log.d("CAST_SERVER", l4.toString());
        try {
            j k10 = k(fVar);
            ad.g gVar = k10.e;
            gVar.put("Access-Control-Allow-Origin", "*");
            gVar.put("Access-Control-Max-Age", "3628800");
            gVar.put("Access-Control-Allow-Methods", "*");
            gVar.put("Access-Control-Allow-Headers", "*");
            return k10;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            j c10 = m.c(i.INTERNAL_ERROR, "text/plain", "Error reading file");
            ad.g gVar2 = c10.e;
            gVar2.put("Access-Control-Allow-Origin", "*");
            gVar2.put("Access-Control-Max-Age", "3628800");
            gVar2.put("Access-Control-Allow-Methods", "*");
            gVar2.put("Access-Control-Allow-Headers", "*");
            return c10;
        }
    }

    public final void h() {
        if (this.h.isEmpty()) {
            if (this.f44460j) {
                try {
                    m.d(this.f537a);
                    ad.d dVar = this.f539c;
                    dVar.getClass();
                    ArrayList arrayList = new ArrayList((List) dVar.f505c);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ad.a aVar = (ad.a) obj;
                        m.d(aVar.f494a);
                        m.d(aVar.f495b);
                    }
                    Thread thread = this.f538b;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (Exception e) {
                    m.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
                }
                this.f44460j = false;
            }
        } else if (!this.f44460j) {
            try {
                f();
                this.f44460j = true;
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    public final ad.j k(ad.f r44) {
        throw new UnsupportedOperationException("Method not decompiled: qf.d.k(ad.f):ad.j");
    }

    public final void l(File file, String str) {
        if (str != null && file != null) {
            this.f44459i = new Pair(str, file);
        } else {
            Pair pair = this.f44459i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.f44459i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.f44459i = null;
        }
        h();
    }
}
