package rf;

import a8.lg;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.util.Pair;
import bd.h;
import bd.k;
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
import org.telegram.ui.ji1;
public final class d extends k {
    public static final f f47340l;
    public static final HashMap f47341m;
    public final ExtendedDefaultDataSourceFactory e;
    public final ji1 f47342f;
    public final tb.a f47343g;
    public final HashMap h;
    public Pair f47344i;
    public boolean f47345j;
    public final AtomicInteger f47346k;

    static {
        f fVar = new f(new e(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        f47340l = fVar;
        f[] fVarArr = {fVar};
        HashMap hashMap = new HashMap();
        f47341m = hashMap;
        f fVar2 = fVarArr[0];
        hashMap.put(fVar2.d, fVar2);
    }

    public d() {
        this.f3890c = new lg(1);
        this.h = new HashMap();
        this.f47344i = null;
        this.f47345j = false;
        this.f47346k = new AtomicInteger();
        this.f47342f = new ji1(13);
        this.f47343g = new tb.a(8);
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
    public final h e(bd.d dVar) {
        String str;
        int incrementAndGet = this.f47346k.incrementAndGet();
        StringBuilder k10 = ic.a.k(incrementAndGet, "Request ", " ");
        switch (dVar.f3863g) {
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
        k10.append(str);
        k10.append(" ");
        k10.append(dVar.f3862f);
        k10.append(" ");
        k10.append((String) dVar.f3864i.get("range"));
        Log.d("CAST_SERVER", k10.toString());
        try {
            h k11 = k(dVar);
            bd.e eVar = k11.e;
            eVar.put("Access-Control-Allow-Origin", "*");
            eVar.put("Access-Control-Max-Age", "3628800");
            eVar.put("Access-Control-Allow-Methods", "*");
            eVar.put("Access-Control-Allow-Headers", "*");
            return k11;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            h c10 = k.c(bd.g.INTERNAL_ERROR, "text/plain", "Error reading file");
            bd.e eVar2 = c10.e;
            eVar2.put("Access-Control-Allow-Origin", "*");
            eVar2.put("Access-Control-Max-Age", "3628800");
            eVar2.put("Access-Control-Allow-Methods", "*");
            eVar2.put("Access-Control-Allow-Headers", "*");
            return c10;
        }
    }

    public final void h() {
        if (this.h.isEmpty()) {
            if (this.f47345j) {
                try {
                    k.d(this.f3888a);
                    lg lgVar = this.f3890c;
                    lgVar.getClass();
                    ArrayList arrayList = new ArrayList((List) lgVar.f600c);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        bd.a aVar = (bd.a) obj;
                        k.d(aVar.f3850a);
                        k.d(aVar.f3851b);
                    }
                    Thread thread = this.f3889b;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (Exception e) {
                    k.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
                }
                this.f47345j = false;
            }
        } else if (!this.f47345j) {
            try {
                f();
                this.f47345j = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final bd.h k(bd.d r44) {
        throw new UnsupportedOperationException("Method not decompiled: rf.d.k(bd.d):bd.h");
    }

    public final void l(File file, String str) {
        if (str != null && file != null) {
            this.f47344i = new Pair(str, file);
        } else {
            Pair pair = this.f47344i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.f47344i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.f47344i = null;
        }
        h();
    }
}
