package xe;

import a9.p;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.q;
import e7.v;
import f2.e1;
import hc.h;
import hc.i;
import hc.l;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import m1.j;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import u3.k;

public final class e extends l {

    public static final f f49399l;

    public static final HashMap f49400m;

    public final ExtendedDefaultDataSourceFactory f49401e;

    public final k f49402f;

    public final v f49403g;
    public final HashMap h;

    public Pair f49404i;

    public boolean f49405j;

    public final AtomicInteger f49406k;

    static {
        f fVar = new f(new e1(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        f49399l = fVar;
        f[] fVarArr = {fVar};
        HashMap map = new HashMap();
        f49400m = map;
        f fVar2 = fVarArr[0];
        map.put(fVar2.d, fVar2);
    }

    public e() {
        this.f8907c = new f2.c(2);
        this.h = new HashMap();
        this.f49404i = null;
        this.f49405j = false;
        this.f49406k = new AtomicInteger();
        this.f49402f = new k(8);
        this.f49403g = new v(4);
        this.f49401e = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
    }

    public static String i() {
        int ipAddress = ((WifiManager) ApplicationLoader.applicationContext.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        if (ipAddress == 0) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (inetAddressNextElement.isSiteLocalAddress()) {
                            byte[] address = inetAddressNextElement.getAddress();
                            ipAddress = (((address[3] + 256) % 256) << 24) + ((address[0] + 256) % 256) + (((address[1] + 256) % 256) << 8) + (((address[2] + 256) % 256) << 16);
                        }
                    }
                }
            } catch (SocketException e9) {
                FileLog.e(e9);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(ipAddress & 255) + '.' + ((ipAddress >> 8) & 255) + '.' + ((ipAddress >> 16) & 255) + '.' + ((ipAddress >> 24) & 255));
        sb2.append(":61578");
        return sb2.toString();
    }

    public static String j(String str, String str2) {
        return p.m("http://", str, str2);
    }

    @Override
    public final i e(hc.e eVar) {
        String str;
        int iIncrementAndGet = this.f49406k.incrementAndGet();
        StringBuilder sbO = i0.a.o(iIncrementAndGet, "Request ", " ");
        switch (eVar.f8878g) {
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
        sbO.append(str);
        sbO.append(" ");
        sbO.append(eVar.f8877f);
        sbO.append(" ");
        sbO.append((String) eVar.f8879i.get("range"));
        Log.d("CAST_SERVER", sbO.toString());
        try {
            i iVarK = k(eVar);
            hc.f fVar = iVarK.f8896e;
            fVar.put("Access-Control-Allow-Origin", "*");
            fVar.put("Access-Control-Max-Age", "3628800");
            fVar.put("Access-Control-Allow-Methods", "*");
            fVar.put("Access-Control-Allow-Headers", "*");
            return iVarK;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + iIncrementAndGet);
            i iVarC = l.c(h.INTERNAL_ERROR, "text/plain", "Error reading file");
            hc.f fVar2 = iVarC.f8896e;
            fVar2.put("Access-Control-Allow-Origin", "*");
            fVar2.put("Access-Control-Max-Age", "3628800");
            fVar2.put("Access-Control-Allow-Methods", "*");
            fVar2.put("Access-Control-Allow-Headers", "*");
            return iVarC;
        }
    }

    public final void h() {
        if (!this.h.isEmpty()) {
            if (this.f49405j) {
                return;
            }
            try {
                f();
                this.f49405j = true;
                return;
            } catch (IOException e9) {
                throw new RuntimeException(e9);
            }
        }
        if (this.f49405j) {
            try {
                l.d(this.f8905a);
                f2.c cVar = this.f8907c;
                cVar.getClass();
                ArrayList arrayList = new ArrayList((List) cVar.f5631c);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    hc.a aVar = (hc.a) obj;
                    l.d(aVar.f8862a);
                    l.d(aVar.f8863b);
                }
                Thread thread = this.f8906b;
                if (thread != null) {
                    thread.join();
                }
            } catch (Exception e10) {
                l.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e10);
            }
            this.f49405j = false;
        }
    }

    public final i k(hc.e eVar) {
        boolean z10;
        long j10;
        d dVar;
        i iVarC;
        long j11;
        long j12;
        String str = (String) eVar.f8879i.get("host");
        String path = Uri.parse("http://" + str + eVar.f8877f).getPath();
        boolean zA = j.a(6, eVar.f8878g);
        h hVar = h.OK;
        if (zA) {
            return l.c(hVar, "text/plain", "");
        }
        boolean zEquals = TextUtils.equals(path, "/");
        HashMap map = this.h;
        HashMap map2 = f49400m;
        int i10 = 0;
        if (zEquals) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f49404i != null) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(j(str, (String) this.f49404i.first));
            }
            while (i10 < 2) {
                for (Map.Entry entry : (i10 == 0 ? map2 : map).entrySet()) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(j(str, (String) entry.getKey()));
                    m5.l lVar = ((f) entry.getValue()).f49408b;
                    if (lVar != null) {
                        Bundle bundle = lVar.f17808b;
                        m5.l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                        String string = bundle.getString("com.google.android.gms.cast.metadata.TITLE");
                        m5.l.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
                        String string2 = bundle.getString("com.google.android.gms.cast.metadata.SUBTITLE");
                        if (string != null) {
                            sb2.append(' ');
                            sb2.append(string);
                        }
                        if (string2 != null) {
                            sb2.append(" [");
                            sb2.append(string2);
                            sb2.append(']');
                        }
                    }
                }
                i10++;
            }
            return l.c(hVar, "text/plain", sb2.toString());
        }
        f fVar = (f) map2.get(path);
        if (fVar == null) {
            fVar = (f) map.get(path);
        }
        if (fVar == null) {
            Pair pair = this.f49404i;
            File file = (pair == null || !((String) pair.first).equalsIgnoreCase(path)) ? null : (File) this.f49404i.second;
            return file != null ? new i(hVar, "image/jpeg", new BufferedInputStream(new FileInputStream(file)), file.length()) : l.c(h.NOT_FOUND, "text/plain", "file not found");
        }
        Uri uri = fVar.f49409c;
        String str2 = (String) eVar.f8879i.get("host");
        String str3 = fVar.f49407a;
        if (uri.toString().startsWith("data:application/x-mpegurl;base64,")) {
            return l.c(hVar, str3, new String(Base64.decode(uri.toString().substring(34), 0)).replaceAll("mtproto:", j(str2, "/mtproto_")));
        }
        m mVarCreateDataSource = (uri.toString().startsWith("file://") ? uri.toString().startsWith("file:///android_asset/") ? this.f49402f : this.f49403g : this.f49401e).createDataSource();
        Map map3 = Collections.EMPTY_MAP;
        long j13 = 0;
        long j14 = -1;
        long jOpen = mVarCreateDataSource.open(new q(uri, 1, null, map3, 0L, -1L, null, 0));
        mVarCreateDataSource.close();
        boolean zEquals2 = TextUtils.equals(str3, "application/x-mpegURL");
        if (zEquals2) {
            z10 = zEquals2;
            j10 = jOpen;
            dVar = null;
        } else {
            String str4 = (String) eVar.f8879i.get("range");
            if (TextUtils.isEmpty(str4)) {
                z10 = zEquals2;
                j10 = jOpen;
                dVar = null;
            } else {
                String strSubstring = str4.trim().substring(6);
                if (strSubstring.startsWith("-")) {
                    j12 = jOpen - 1;
                    j11 = j12 - Long.parseLong(strSubstring.substring(1));
                    z10 = zEquals2;
                } else {
                    String[] strArrSplit = strSubstring.split("-");
                    j11 = Long.parseLong(strArrSplit[0]);
                    z10 = zEquals2;
                    j12 = strArrSplit.length > 1 ? Long.parseLong(strArrSplit[1]) : jOpen - 1;
                }
                long j15 = j11;
                j10 = jOpen;
                long j16 = j10 - 1;
                dVar = new d(j15, j12 > j16 ? j16 : j12);
            }
        }
        long j17 = dVar != null ? (dVar.f49398b - dVar.f49397a) + 1 : j10;
        if (dVar != null) {
            j14 = j17;
            j13 = dVar.f49397a;
        }
        if (z10) {
            int i11 = (int) j17;
            byte[] bArr = new byte[i11];
            mVarCreateDataSource.open(new q(uri, 1, null, map3, j13, j14, null, 0));
            mVarCreateDataSource.read(bArr, 0, i11);
            mVarCreateDataSource.close();
            return l.c(hVar, str3, new String(bArr).replaceAll("mtproto:", j(str2, "/mtproto_")));
        }
        if (j17 != 0) {
            c cVar = new c(mVarCreateDataSource, new q(uri, 1, null, map3, j13, j14, null, 0));
            if (dVar != null) {
                hVar = h.PARTIAL_CONTENT;
            }
            iVarC = new i(hVar, fVar.f49407a, cVar, j17);
        } else {
            iVarC = l.c(h.NO_CONTENT, str3, "");
        }
        i iVar = iVarC;
        if (dVar != null) {
            iVar.f8896e.put("Content-Range", "bytes " + dVar.f49397a + "-" + dVar.f49398b + "/" + j10);
        }
        return iVar;
    }

    public final void l(File file, String str) {
        if (str == null || file == null) {
            Pair pair = this.f49404i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.f49404i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.f49404i = null;
        } else {
            this.f49404i = new Pair(str, file);
        }
        h();
    }
}
