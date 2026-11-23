package s2;

import a8.ma;
import android.net.Uri;
import android.os.SystemClock;
import h9.g2;
import h9.i0;
import h9.t0;
import java.util.HashMap;
public final class c {
    public final x f56877a;
    public final HashMap f56878b;
    public final d f56879c;

    public c(d dVar, x xVar) {
        this.f56879c = dVar;
        this.f56877a = xVar;
        HashMap hashMap = new HashMap();
        g2 it = t0.q(xVar.f57032b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) xVar.f57032b.get(str);
            uri.getClass();
            hashMap.put(uri, new b(this.f56879c, uri, str));
        }
        this.f56878b = hashMap;
    }

    public static n a(c cVar, Uri uri) {
        b bVar = (b) p5.c.i(cVar.f56878b, uri, uri);
        bVar.getClass();
        return bVar.f56869e;
    }

    public static void b(c cVar, Uri uri, boolean z10) {
        Uri uri2;
        b bVar = (b) p5.c.i(cVar.f56878b, uri, uri);
        bVar.getClass();
        if (z10) {
            uri2 = bVar.a();
        } else {
            uri2 = bVar.f56866a;
        }
        bVar.c(uri2);
    }

    public static boolean c(c cVar, Uri uri, long j3) {
        HashMap hashMap = cVar.f56878b;
        b bVar = (b) p5.c.i(hashMap, uri, uri);
        bVar.getClass();
        bVar.f56872r = SystemClock.elapsedRealtime() + j3;
        d dVar = cVar.f56879c;
        x xVar = cVar.f56877a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (b bVar2 : hashMap.values()) {
            if (!bVar2.f56867b.equals(xVar.d) && elapsedRealtime > bVar2.f56872r) {
                Uri c10 = xVar.c();
                String str = bVar2.f56867b;
                ma.p(xVar.f57032b.containsKey(str));
                xVar.d = str;
                if (c10.equals(dVar.G)) {
                    dVar.g(bVar2.f56866a);
                }
                b bVar3 = (b) hashMap.get(c10);
                bVar3.getClass();
                bVar2.f56875x = bVar3.f56875x;
                bVar3.f56875x = false;
                return true;
            }
        }
        Uri uri2 = dVar.G;
        if (uri2 == null || uri.equals(uri2)) {
            i0 i0Var = dVar.f56889x;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            boolean z10 = false;
            int i7 = 0;
            while (true) {
                if (i7 >= i0Var.size()) {
                    break;
                }
                Uri c11 = ((x) i0Var.get(i7)).c();
                c cVar2 = (c) dVar.d.get(c11);
                cVar2.getClass();
                HashMap hashMap2 = cVar2.f56878b;
                b bVar4 = (b) p5.c.i(hashMap2, c11, c11);
                bVar4.getClass();
                if (elapsedRealtime2 <= bVar4.f56872r) {
                    i7++;
                } else {
                    dVar.G = c11;
                    Uri d = dVar.d(c11);
                    b bVar5 = (b) p5.c.i(hashMap2, c11, c11);
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
