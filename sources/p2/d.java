package p2;

import android.net.Uri;
import android.os.SystemClock;
import e9.m2;
import e9.n0;
import e9.y0;
import i2.o1;
import java.util.HashMap;
import v7.u6;
public final class d {
    public final x f44353a;
    public final HashMap f44354b;
    public final e f44355c;

    public d(e eVar, x xVar) {
        this.f44355c = eVar;
        this.f44353a = xVar;
        HashMap hashMap = new HashMap();
        m2 it = y0.u(xVar.f44495b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) xVar.f44495b.get(str);
            uri.getClass();
            hashMap.put(uri, new c(this.f44355c, uri, str));
        }
        this.f44354b = hashMap;
    }

    public static n a(d dVar, Uri uri) {
        c cVar = (c) o1.j(dVar.f44354b, uri, uri);
        cVar.getClass();
        return cVar.e;
    }

    public static void b(d dVar, Uri uri, boolean z10) {
        Uri uri2;
        c cVar = (c) o1.j(dVar.f44354b, uri, uri);
        cVar.getClass();
        if (z10) {
            uri2 = cVar.a();
        } else {
            uri2 = cVar.f44344a;
        }
        cVar.c(uri2);
    }

    public static boolean c(d dVar, Uri uri, long j10) {
        HashMap hashMap = dVar.f44354b;
        c cVar = (c) o1.j(hashMap, uri, uri);
        cVar.getClass();
        cVar.f44349r = SystemClock.elapsedRealtime() + j10;
        e eVar = dVar.f44355c;
        x xVar = dVar.f44353a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (c cVar2 : hashMap.values()) {
            if (!cVar2.f44345b.equals(xVar.d) && elapsedRealtime > cVar2.f44349r) {
                Uri c10 = xVar.c();
                String str = cVar2.f44345b;
                u6.p(xVar.f44495b.containsKey(str));
                xVar.d = str;
                if (c10.equals(eVar.F)) {
                    eVar.h(cVar2.f44344a);
                }
                c cVar3 = (c) hashMap.get(c10);
                cVar3.getClass();
                cVar2.f44351w = cVar3.f44351w;
                cVar3.f44351w = false;
                return true;
            }
        }
        Uri uri2 = eVar.F;
        if (uri2 == null || uri.equals(uri2)) {
            n0 n0Var = eVar.f44363w;
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
                HashMap hashMap2 = dVar2.f44354b;
                c cVar4 = (c) o1.j(hashMap2, c11, c11);
                cVar4.getClass();
                if (elapsedRealtime2 <= cVar4.f44349r) {
                    i10++;
                } else {
                    eVar.F = c11;
                    Uri d = eVar.d(c11);
                    c cVar5 = (c) o1.j(hashMap2, c11, c11);
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
