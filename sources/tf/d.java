package tf;

import a1.g;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.util.Pair;
import b8.ig;
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
import k2.p1;
import org.telegram.messenger.a8;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.messenger.t0;
import org.telegram.ui.Components.eg;
import vc.i;
public final class d extends i {
    public static final f f55099l;
    public static final HashMap f55100m;
    public final ExtendedDefaultDataSourceFactory f55101e;
    public final s0.b f55102f;
    public final ra.e f55103g;
    public final HashMap h;
    public Pair f55104i;
    public boolean f55105j;
    public final AtomicInteger f55106k;

    static {
        f fVar = new f(new e(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        f55099l = fVar;
        f[] fVarArr = {fVar};
        HashMap hashMap = new HashMap();
        f55100m = hashMap;
        f fVar2 = fVarArr[0];
        hashMap.put(fVar2.d, fVar2);
    }

    public d() {
        this.f56555c = new ig(8);
        this.h = new HashMap();
        this.f55104i = null;
        this.f55105j = false;
        this.f55106k = new AtomicInteger();
        this.f55102f = new s0.b(19);
        this.f55103g = new ra.e(10);
        this.f55101e = new ExtendedDefaultDataSourceFactory(t0.f25457b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
    }

    public static String i() {
        int ipAddress = ((WifiManager) t0.f25457b.getSystemService("wifi")).getConnectionInfo().getIpAddress();
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
        return g.q("http://", str, str2);
    }

    @Override
    public final vc.g e(vc.d dVar) {
        String str;
        int incrementAndGet = this.f55106k.incrementAndGet();
        StringBuilder m10 = p1.m(incrementAndGet, "Request ", " ");
        switch (dVar.f56531g) {
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
        m10.append(dVar.f56530f);
        m10.append(" ");
        m10.append((String) dVar.f56532i.get("range"));
        Log.d("CAST_SERVER", m10.toString());
        try {
            vc.g k10 = k(dVar);
            eg egVar = k10.f56547e;
            egVar.put("Access-Control-Allow-Origin", "*");
            egVar.put("Access-Control-Max-Age", "3628800");
            egVar.put("Access-Control-Allow-Methods", "*");
            egVar.put("Access-Control-Allow-Headers", "*");
            return k10;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            vc.g c2 = i.c(vc.f.INTERNAL_ERROR, "text/plain", "Error reading file");
            eg egVar2 = c2.f56547e;
            egVar2.put("Access-Control-Allow-Origin", "*");
            egVar2.put("Access-Control-Max-Age", "3628800");
            egVar2.put("Access-Control-Allow-Methods", "*");
            egVar2.put("Access-Control-Allow-Headers", "*");
            return c2;
        }
    }

    public final void h() {
        if (this.h.isEmpty()) {
            if (this.f55105j) {
                try {
                    i.d(this.f56553a);
                    ig igVar = this.f56555c;
                    igVar.getClass();
                    ArrayList arrayList = new ArrayList((List) igVar.f2683c);
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        vc.a aVar = (vc.a) obj;
                        i.d(aVar.f56516a);
                        i.d(aVar.f56517b);
                    }
                    Thread thread = this.f56554b;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (Exception e10) {
                    i.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e10);
                }
                this.f55105j = false;
            }
        } else if (!this.f55105j) {
            try {
                f();
                this.f55105j = true;
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    public final vc.g k(vc.d r44) {
        throw new UnsupportedOperationException("Method not decompiled: tf.d.k(vc.d):vc.g");
    }

    public final void l(File file, String str) {
        if (str != null && file != null) {
            this.f55104i = new Pair(str, file);
        } else {
            Pair pair = this.f55104i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.f55104i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.f55104i = null;
        }
        h();
    }
}
