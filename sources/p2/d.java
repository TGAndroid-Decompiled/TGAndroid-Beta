package p2;

import android.net.Uri;
import android.os.SystemClock;
import e9.m2;
import e9.n0;
import e9.y0;
import java.util.HashMap;
import v7.u6;
public final class d {
    public final x f43925a;
    public final HashMap f43926b;
    public final e f43927c;

    public d(e eVar, x xVar) {
        this.f43927c = eVar;
        this.f43925a = xVar;
        HashMap hashMap = new HashMap();
        m2 it = y0.u(xVar.f44067b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) xVar.f44067b.get(str);
            uri.getClass();
            hashMap.put(uri, new c(this.f43927c, uri, str));
        }
        this.f43926b = hashMap;
    }

    public static n a(d dVar, Uri uri) {
        c cVar = (c) i2.e.i(dVar.f43926b, uri, uri);
        cVar.getClass();
        return cVar.e;
    }

    public static void b(d dVar, Uri uri, boolean z10) {
        Uri uri2;
        c cVar = (c) i2.e.i(dVar.f43926b, uri, uri);
        cVar.getClass();
        if (z10) {
            uri2 = cVar.a();
        } else {
            uri2 = cVar.f43916a;
        }
        cVar.c(uri2);
    }

    public static boolean c(d dVar, Uri uri, long j10) {
        HashMap hashMap = dVar.f43926b;
        c cVar = (c) i2.e.i(hashMap, uri, uri);
        cVar.getClass();
        cVar.f43921r = SystemClock.elapsedRealtime() + j10;
        e eVar = dVar.f43927c;
        x xVar = dVar.f43925a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (c cVar2 : hashMap.values()) {
            if (!cVar2.f43917b.equals(xVar.d) && elapsedRealtime > cVar2.f43921r) {
                Uri c10 = xVar.c();
                String str = cVar2.f43917b;
                u6.p(xVar.f44067b.containsKey(str));
                xVar.d = str;
                if (c10.equals(eVar.F)) {
                    eVar.i(cVar2.f43916a);
                }
                c cVar3 = (c) hashMap.get(c10);
                cVar3.getClass();
                cVar2.f43923w = cVar3.f43923w;
                cVar3.f43923w = false;
                return true;
            }
        }
        Uri uri2 = eVar.F;
        if (uri2 == null || uri.equals(uri2)) {
            n0 n0Var = eVar.f43935w;
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
                HashMap hashMap2 = dVar2.f43926b;
                c cVar4 = (c) i2.e.i(hashMap2, c11, c11);
                cVar4.getClass();
                if (elapsedRealtime2 <= cVar4.f43921r) {
                    i10++;
                } else {
                    eVar.F = c11;
                    Uri d = eVar.d(c11);
                    c cVar5 = (c) i2.e.i(hashMap2, c11, c11);
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
