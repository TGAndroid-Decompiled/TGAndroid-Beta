package p2;

import android.net.Uri;
import android.os.SystemClock;
import e9.m2;
import e9.n0;
import e9.y0;
import java.util.HashMap;
import v7.u6;
public final class c {
    public final w f42843a;
    public final HashMap f42844b;
    public final d f42845c;

    public c(d dVar, w wVar) {
        this.f42845c = dVar;
        this.f42843a = wVar;
        HashMap hashMap = new HashMap();
        m2 it = y0.u(wVar.f42985b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) wVar.f42985b.get(str);
            uri.getClass();
            hashMap.put(uri, new b(this.f42845c, uri, str));
        }
        this.f42844b = hashMap;
    }

    public static m a(c cVar, Uri uri) {
        b bVar = (b) i2.d.h(cVar.f42844b, uri, uri);
        bVar.getClass();
        return bVar.e;
    }

    public static void b(c cVar, Uri uri, boolean z10) {
        Uri uri2;
        b bVar = (b) i2.d.h(cVar.f42844b, uri, uri);
        bVar.getClass();
        if (z10) {
            uri2 = bVar.a();
        } else {
            uri2 = bVar.f42834a;
        }
        bVar.c(uri2);
    }

    public static boolean c(c cVar, Uri uri, long j10) {
        HashMap hashMap = cVar.f42844b;
        b bVar = (b) i2.d.h(hashMap, uri, uri);
        bVar.getClass();
        bVar.f42839r = SystemClock.elapsedRealtime() + j10;
        d dVar = cVar.f42845c;
        w wVar = cVar.f42843a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (b bVar2 : hashMap.values()) {
            if (!bVar2.f42835b.equals(wVar.d) && elapsedRealtime > bVar2.f42839r) {
                Uri c10 = wVar.c();
                String str = bVar2.f42835b;
                u6.p(wVar.f42985b.containsKey(str));
                wVar.d = str;
                if (c10.equals(dVar.F)) {
                    dVar.g(bVar2.f42834a);
                }
                b bVar3 = (b) hashMap.get(c10);
                bVar3.getClass();
                bVar2.f42841w = bVar3.f42841w;
                bVar3.f42841w = false;
                return true;
            }
        }
        Uri uri2 = dVar.F;
        if (uri2 == null || uri.equals(uri2)) {
            n0 n0Var = dVar.f42853w;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= n0Var.size()) {
                    break;
                }
                Uri c11 = ((w) n0Var.get(i10)).c();
                c cVar2 = (c) dVar.d.get(c11);
                cVar2.getClass();
                HashMap hashMap2 = cVar2.f42844b;
                b bVar4 = (b) i2.d.h(hashMap2, c11, c11);
                bVar4.getClass();
                if (elapsedRealtime2 <= bVar4.f42839r) {
                    i10++;
                } else {
                    dVar.F = c11;
                    Uri d = dVar.d(c11);
                    b bVar5 = (b) i2.d.h(hashMap2, c11, c11);
                    bVar5.getClass();
                    bVar5.c(d);
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
