package p2;

import android.net.Uri;
import android.os.SystemClock;
import e9.m2;
import e9.n0;
import e9.y0;
import java.util.HashMap;
import v7.u6;
public final class d {
    public final x f43973a;
    public final HashMap f43974b;
    public final e f43975c;

    public d(e eVar, x xVar) {
        this.f43975c = eVar;
        this.f43973a = xVar;
        HashMap hashMap = new HashMap();
        m2 it = y0.u(xVar.f44115b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) xVar.f44115b.get(str);
            uri.getClass();
            hashMap.put(uri, new c(this.f43975c, uri, str));
        }
        this.f43974b = hashMap;
    }

    public static n a(d dVar, Uri uri) {
        c cVar = (c) i2.d.i(dVar.f43974b, uri, uri);
        cVar.getClass();
        return cVar.e;
    }

    public static void b(d dVar, Uri uri, boolean z10) {
        Uri uri2;
        c cVar = (c) i2.d.i(dVar.f43974b, uri, uri);
        cVar.getClass();
        if (z10) {
            uri2 = cVar.a();
        } else {
            uri2 = cVar.f43964a;
        }
        cVar.c(uri2);
    }

    public static boolean c(d dVar, Uri uri, long j10) {
        HashMap hashMap = dVar.f43974b;
        c cVar = (c) i2.d.i(hashMap, uri, uri);
        cVar.getClass();
        cVar.f43969r = SystemClock.elapsedRealtime() + j10;
        e eVar = dVar.f43975c;
        x xVar = dVar.f43973a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (c cVar2 : hashMap.values()) {
            if (!cVar2.f43965b.equals(xVar.d) && elapsedRealtime > cVar2.f43969r) {
                Uri c10 = xVar.c();
                String str = cVar2.f43965b;
                u6.p(xVar.f44115b.containsKey(str));
                xVar.d = str;
                if (c10.equals(eVar.F)) {
                    eVar.g(cVar2.f43964a);
                }
                c cVar3 = (c) hashMap.get(c10);
                cVar3.getClass();
                cVar2.f43971w = cVar3.f43971w;
                cVar3.f43971w = false;
                return true;
            }
        }
        Uri uri2 = eVar.F;
        if (uri2 == null || uri.equals(uri2)) {
            n0 n0Var = eVar.f43983w;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= n0Var.size()) {
                    break;
                }
                Uri c11 = ((x) n0Var.get(i10)).c();
                d dVar2 = (d) eVar.d.get(c11);
                dVar2.getClass();
                HashMap hashMap2 = dVar2.f43974b;
                c cVar4 = (c) i2.d.i(hashMap2, c11, c11);
                cVar4.getClass();
                if (elapsedRealtime2 <= cVar4.f43969r) {
                    i10++;
                } else {
                    eVar.F = c11;
                    Uri d = eVar.d(c11);
                    c cVar5 = (c) i2.d.i(hashMap2, c11, c11);
                    cVar5.getClass();
                    cVar5.c(d);
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }
}
