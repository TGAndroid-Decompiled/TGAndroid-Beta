package s2;

import a8.ja;
import android.net.Uri;
import android.os.SystemClock;
import h9.g2;
import h9.i0;
import h9.t0;
import java.util.HashMap;
public final class c {
    public final w f56180a;
    public final HashMap f56181b;
    public final d f56182c;

    public c(d dVar, w wVar) {
        this.f56182c = dVar;
        this.f56180a = wVar;
        HashMap hashMap = new HashMap();
        g2 it = t0.q(wVar.f56332b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) wVar.f56332b.get(str);
            uri.getClass();
            hashMap.put(uri, new b(this.f56182c, uri, str));
        }
        this.f56181b = hashMap;
    }

    public static m a(c cVar, Uri uri) {
        b bVar = (b) r.b.i(cVar.f56181b, uri, uri);
        bVar.getClass();
        return bVar.f56172e;
    }

    public static void b(c cVar, Uri uri, boolean z10) {
        Uri uri2;
        b bVar = (b) r.b.i(cVar.f56181b, uri, uri);
        bVar.getClass();
        if (z10) {
            uri2 = bVar.a();
        } else {
            uri2 = bVar.f56169a;
        }
        bVar.c(uri2);
    }

    public static boolean c(c cVar, Uri uri, long j3) {
        HashMap hashMap = cVar.f56181b;
        b bVar = (b) r.b.i(hashMap, uri, uri);
        bVar.getClass();
        bVar.f56175r = SystemClock.elapsedRealtime() + j3;
        d dVar = cVar.f56182c;
        w wVar = cVar.f56180a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (b bVar2 : hashMap.values()) {
            if (!bVar2.f56170b.equals(wVar.d) && elapsedRealtime > bVar2.f56175r) {
                Uri c10 = wVar.c();
                String str = bVar2.f56170b;
                ja.p(wVar.f56332b.containsKey(str));
                wVar.d = str;
                if (c10.equals(dVar.G)) {
                    dVar.g(bVar2.f56169a);
                }
                b bVar3 = (b) hashMap.get(c10);
                bVar3.getClass();
                bVar2.f56178x = bVar3.f56178x;
                bVar3.f56178x = false;
                return true;
            }
        }
        Uri uri2 = dVar.G;
        if (uri2 == null || uri.equals(uri2)) {
            i0 i0Var = dVar.f56192x;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            boolean z10 = false;
            int i7 = 0;
            while (true) {
                if (i7 >= i0Var.size()) {
                    break;
                }
                Uri c11 = ((w) i0Var.get(i7)).c();
                c cVar2 = (c) dVar.d.get(c11);
                cVar2.getClass();
                HashMap hashMap2 = cVar2.f56181b;
                b bVar4 = (b) r.b.i(hashMap2, c11, c11);
                bVar4.getClass();
                if (elapsedRealtime2 <= bVar4.f56175r) {
                    i7++;
                } else {
                    dVar.G = c11;
                    Uri d = dVar.d(c11);
                    b bVar5 = (b) r.b.i(hashMap2, c11, c11);
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
