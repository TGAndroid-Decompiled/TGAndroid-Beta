package p2;

import android.net.Uri;
import android.os.SystemClock;
import e9.m2;
import e9.n0;
import e9.y0;
import java.util.HashMap;
import v7.u6;
public final class c {
    public final w f43930a;
    public final HashMap f43931b;
    public final d f43932c;

    public c(d dVar, w wVar) {
        this.f43932c = dVar;
        this.f43930a = wVar;
        HashMap hashMap = new HashMap();
        m2 it = y0.u(wVar.f44072b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) wVar.f44072b.get(str);
            uri.getClass();
            hashMap.put(uri, new b(this.f43932c, uri, str));
        }
        this.f43931b = hashMap;
    }

    public static m a(c cVar, Uri uri) {
        b bVar = (b) i2.d.i(cVar.f43931b, uri, uri);
        bVar.getClass();
        return bVar.e;
    }

    public static void b(c cVar, Uri uri, boolean z10) {
        Uri uri2;
        b bVar = (b) i2.d.i(cVar.f43931b, uri, uri);
        bVar.getClass();
        if (z10) {
            uri2 = bVar.a();
        } else {
            uri2 = bVar.f43921a;
        }
        bVar.c(uri2);
    }

    public static boolean c(c cVar, Uri uri, long j10) {
        HashMap hashMap = cVar.f43931b;
        b bVar = (b) i2.d.i(hashMap, uri, uri);
        bVar.getClass();
        bVar.f43926r = SystemClock.elapsedRealtime() + j10;
        d dVar = cVar.f43932c;
        w wVar = cVar.f43930a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (b bVar2 : hashMap.values()) {
            if (!bVar2.f43922b.equals(wVar.d) && elapsedRealtime > bVar2.f43926r) {
                Uri c10 = wVar.c();
                String str = bVar2.f43922b;
                u6.p(wVar.f44072b.containsKey(str));
                wVar.d = str;
                if (c10.equals(dVar.F)) {
                    dVar.g(bVar2.f43921a);
                }
                b bVar3 = (b) hashMap.get(c10);
                bVar3.getClass();
                bVar2.f43928w = bVar3.f43928w;
                bVar3.f43928w = false;
                return true;
            }
        }
        Uri uri2 = dVar.F;
        if (uri2 == null || uri.equals(uri2)) {
            n0 n0Var = dVar.f43940w;
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
                HashMap hashMap2 = cVar2.f43931b;
                b bVar4 = (b) i2.d.i(hashMap2, c11, c11);
                bVar4.getClass();
                if (elapsedRealtime2 <= bVar4.f43926r) {
                    i10++;
                } else {
                    dVar.F = c11;
                    Uri d = dVar.d(c11);
                    b bVar5 = (b) i2.d.i(hashMap2, c11, c11);
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
