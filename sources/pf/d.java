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
import org.telegram.ui.Components.yg;
import org.telegram.ui.sw0;
import yc.i;
public final class d extends i {
    public static final f f44051l;
    public static final HashMap f44052m;
    public final ExtendedDefaultDataSourceFactory f44053e;
    public final sw0 f44054f;
    public final na.d f44055g;
    public final HashMap h;
    public Pair f44056i;
    public boolean f44057j;
    public final AtomicInteger f44058k;

    static {
        f fVar = new f(new e(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        f44051l = fVar;
        f[] fVarArr = {fVar};
        HashMap hashMap = new HashMap();
        f44052m = hashMap;
        f fVar2 = fVarArr[0];
        hashMap.put(fVar2.d, fVar2);
    }

    public d() {
        this.f49963c = new n(9);
        this.h = new HashMap();
        this.f44056i = null;
        this.f44057j = false;
        this.f44058k = new AtomicInteger();
        this.f44054f = new sw0(12);
        this.f44055g = new Object();
        this.f44053e = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
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
        return a4.a.p("http://", str, str2);
    }

    @Override
    public final yc.g e(yc.d dVar) {
        String str;
        int incrementAndGet = this.f44058k.incrementAndGet();
        StringBuilder l4 = i2.g.l(incrementAndGet, "Request ", " ");
        switch (dVar.f49939g) {
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
        l4.append(dVar.f49938f);
        l4.append(" ");
        l4.append((String) dVar.f49940i.get("range"));
        Log.d("CAST_SERVER", l4.toString());
        try {
            yc.g k10 = k(dVar);
            yg ygVar = k10.f49955e;
            ygVar.put("Access-Control-Allow-Origin", "*");
            ygVar.put("Access-Control-Max-Age", "3628800");
            ygVar.put("Access-Control-Allow-Methods", "*");
            ygVar.put("Access-Control-Allow-Headers", "*");
            return k10;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            yc.g c10 = i.c(yc.f.INTERNAL_ERROR, "text/plain", "Error reading file");
            yg ygVar2 = c10.f49955e;
            ygVar2.put("Access-Control-Allow-Origin", "*");
            ygVar2.put("Access-Control-Max-Age", "3628800");
            ygVar2.put("Access-Control-Allow-Methods", "*");
            ygVar2.put("Access-Control-Allow-Headers", "*");
            return c10;
        }
    }

    public final void h() {
        if (this.h.isEmpty()) {
            if (this.f44057j) {
                try {
                    i.d(this.f49961a);
                    n nVar = this.f49963c;
                    nVar.getClass();
                    ArrayList arrayList = new ArrayList((List) nVar.f8895c);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        yc.a aVar = (yc.a) obj;
                        i.d(aVar.f49924a);
                        i.d(aVar.f49925b);
                    }
                    Thread thread = this.f49962b;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (Exception e7) {
                    i.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e7);
                }
                this.f44057j = false;
            }
        } else if (!this.f44057j) {
            try {
                f();
                this.f44057j = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final yc.g k(yc.d r44) {
        throw new UnsupportedOperationException("Method not decompiled: pf.d.k(yc.d):yc.g");
    }

    public final void l(File file, String str) {
        if (str != null && file != null) {
            this.f44056i = new Pair(str, file);
        } else {
            Pair pair = this.f44056i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.f44056i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.f44056i = null;
        }
        h();
    }
}
