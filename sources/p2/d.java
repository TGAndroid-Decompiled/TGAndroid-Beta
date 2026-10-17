package p2;

import android.net.Uri;
import android.os.SystemClock;
import e9.m2;
import e9.n0;
import e9.y0;
import java.util.HashMap;
import v7.u6;
public final class d {
    public final x f43953a;
    public final HashMap f43954b;
    public final e f43955c;

    public d(e eVar, x xVar) {
        this.f43955c = eVar;
        this.f43953a = xVar;
        HashMap hashMap = new HashMap();
        m2 it = y0.u(xVar.f44095b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) xVar.f44095b.get(str);
            uri.getClass();
            hashMap.put(uri, new c(this.f43955c, uri, str));
        }
        this.f43954b = hashMap;
    }

    public static n a(d dVar, Uri uri) {
        c cVar = (c) i0.a.i(dVar.f43954b, uri, uri);
        cVar.getClass();
        return cVar.e;
    }

    public static void b(d dVar, Uri uri, boolean z10) {
        Uri uri2;
        c cVar = (c) i0.a.i(dVar.f43954b, uri, uri);
        cVar.getClass();
        if (z10) {
            uri2 = cVar.a();
        } else {
            uri2 = cVar.f43944a;
        }
        cVar.c(uri2);
    }

    public static boolean c(d dVar, Uri uri, long j10) {
        HashMap hashMap = dVar.f43954b;
        c cVar = (c) i0.a.i(hashMap, uri, uri);
        cVar.getClass();
        cVar.f43949r = SystemClock.elapsedRealtime() + j10;
        e eVar = dVar.f43955c;
        x xVar = dVar.f43953a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (c cVar2 : hashMap.values()) {
            if (!cVar2.f43945b.equals(xVar.d) && elapsedRealtime > cVar2.f43949r) {
                Uri c10 = xVar.c();
                String str = cVar2.f43945b;
                u6.p(xVar.f44095b.containsKey(str));
                xVar.d = str;
                if (c10.equals(eVar.F)) {
                    eVar.g(cVar2.f43944a);
                }
                c cVar3 = (c) hashMap.get(c10);
                cVar3.getClass();
                cVar2.f43951w = cVar3.f43951w;
                cVar3.f43951w = false;
                return true;
            }
        }
        Uri uri2 = eVar.F;
        if (uri2 == null || uri.equals(uri2)) {
            n0 n0Var = eVar.f43963w;
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
                HashMap hashMap2 = dVar2.f43954b;
                c cVar4 = (c) i0.a.i(hashMap2, c11, c11);
                cVar4.getClass();
                if (elapsedRealtime2 <= cVar4.f43949r) {
                    i10++;
                } else {
                    eVar.F = c11;
                    Uri d = eVar.d(c11);
                    c cVar5 = (c) i0.a.i(hashMap2, c11, c11);
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
