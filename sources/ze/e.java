package ze;

import a4.w;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.util.Pair;
import f2.d1;
import ic.h;
import ic.i;
import ic.l;
import j7.l1;
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
import sg.j;
public final class e extends l {
    public static final f f50831l;
    public static final HashMap f50832m;
    public final ExtendedDefaultDataSourceFactory f50833e;
    public final j f50834f;
    public final x9.d f50835g;
    public final HashMap h;
    public Pair f50836i;
    public boolean f50837j;
    public final AtomicInteger f50838k;

    static {
        f fVar = new f(new d1(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        f50831l = fVar;
        f[] fVarArr = {fVar};
        HashMap hashMap = new HashMap();
        f50832m = hashMap;
        f fVar2 = fVarArr[0];
        hashMap.put(fVar2.d, fVar2);
    }

    public e() {
        this.f8871c = new f2.c(2);
        this.h = new HashMap();
        this.f50836i = null;
        this.f50837j = false;
        this.f50838k = new AtomicInteger();
        this.f50834f = new j(19);
        this.f50835g = new x9.d(4);
        this.f50833e = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
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
        return w.n("http://", str, str2);
    }

    @Override
    public final i e(ic.e eVar) {
        String str;
        int incrementAndGet = this.f50838k.incrementAndGet();
        StringBuilder o10 = l1.o(incrementAndGet, "Request ", " ");
        switch (eVar.f8842g) {
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
        o10.append(str);
        o10.append(" ");
        o10.append(eVar.f8841f);
        o10.append(" ");
        o10.append((String) eVar.f8843i.get("range"));
        Log.d("CAST_SERVER", o10.toString());
        try {
            i k9 = k(eVar);
            ic.f fVar = k9.f8860e;
            fVar.put("Access-Control-Allow-Origin", "*");
            fVar.put("Access-Control-Max-Age", "3628800");
            fVar.put("Access-Control-Allow-Methods", "*");
            fVar.put("Access-Control-Allow-Headers", "*");
            return k9;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            i c3 = l.c(h.INTERNAL_ERROR, "text/plain", "Error reading file");
            ic.f fVar2 = c3.f8860e;
            fVar2.put("Access-Control-Allow-Origin", "*");
            fVar2.put("Access-Control-Max-Age", "3628800");
            fVar2.put("Access-Control-Allow-Methods", "*");
            fVar2.put("Access-Control-Allow-Headers", "*");
            return c3;
        }
    }

    public final void h() {
        if (this.h.isEmpty()) {
            if (this.f50837j) {
                try {
                    l.d(this.f8869a);
                    f2.c cVar = this.f8871c;
                    cVar.getClass();
                    ArrayList arrayList = new ArrayList((List) cVar.f6283c);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ic.a aVar = (ic.a) obj;
                        l.d(aVar.f8826a);
                        l.d(aVar.f8827b);
                    }
                    Thread thread = this.f8870b;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (Exception e10) {
                    l.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e10);
                }
                this.f50837j = false;
            }
        } else if (!this.f50837j) {
            try {
                f();
                this.f50837j = true;
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    public final ic.i k(ic.e r44) {
        throw new UnsupportedOperationException("Method not decompiled: ze.e.k(ic.e):ic.i");
    }

    public final void l(File file, String str) {
        if (str != null && file != null) {
            this.f50836i = new Pair(str, file);
        } else {
            Pair pair = this.f50836i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.f50836i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.f50836i = null;
        }
        h();
    }
}
