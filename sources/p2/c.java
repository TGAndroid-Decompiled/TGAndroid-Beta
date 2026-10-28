package p2;

import a8.yb;
import android.net.Uri;
import android.os.SystemClock;
import f9.g2;
import f9.i0;
import f9.t0;
import java.util.HashMap;
public final class c {
    public final w f46531a;
    public final HashMap f46532b;
    public final d f46533c;

    public c(d dVar, w wVar) {
        this.f46533c = dVar;
        this.f46531a = wVar;
        HashMap hashMap = new HashMap();
        g2 it = t0.u(wVar.f46673b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) wVar.f46673b.get(str);
            uri.getClass();
            hashMap.put(uri, new b(this.f46533c, uri, str));
        }
        this.f46532b = hashMap;
    }

    public static m a(c cVar, Uri uri) {
        b bVar = (b) ic.a.h(cVar.f46532b, uri, uri);
        bVar.getClass();
        return bVar.e;
    }

    public static void b(c cVar, Uri uri, boolean z10) {
        Uri uri2;
        b bVar = (b) ic.a.h(cVar.f46532b, uri, uri);
        bVar.getClass();
        if (z10) {
            uri2 = bVar.a();
        } else {
            uri2 = bVar.f46522a;
        }
        bVar.c(uri2);
    }

    public static boolean c(c cVar, Uri uri, long j10) {
        HashMap hashMap = cVar.f46532b;
        b bVar = (b) ic.a.h(hashMap, uri, uri);
        bVar.getClass();
        bVar.f46527r = SystemClock.elapsedRealtime() + j10;
        d dVar = cVar.f46533c;
        w wVar = cVar.f46531a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (b bVar2 : hashMap.values()) {
            if (!bVar2.f46523b.equals(wVar.d) && elapsedRealtime > bVar2.f46527r) {
                Uri c10 = wVar.c();
                String str = bVar2.f46523b;
                yb.p(wVar.f46673b.containsKey(str));
                wVar.d = str;
                if (c10.equals(dVar.F)) {
                    dVar.g(bVar2.f46522a);
                }
                b bVar3 = (b) hashMap.get(c10);
                bVar3.getClass();
                bVar2.f46529w = bVar3.f46529w;
                bVar3.f46529w = false;
                return true;
            }
        }
        Uri uri2 = dVar.F;
        if (uri2 == null || uri.equals(uri2)) {
            i0 i0Var = dVar.f46541w;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= i0Var.size()) {
                    break;
                }
                Uri c11 = ((w) i0Var.get(i10)).c();
                c cVar2 = (c) dVar.d.get(c11);
                cVar2.getClass();
                HashMap hashMap2 = cVar2.f46532b;
                b bVar4 = (b) ic.a.h(hashMap2, c11, c11);
                bVar4.getClass();
                if (elapsedRealtime2 <= bVar4.f46527r) {
                    i10++;
                } else {
                    dVar.F = c11;
                    Uri d = dVar.d(c11);
                    b bVar5 = (b) ic.a.h(hashMap2, c11, c11);
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
