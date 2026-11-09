package s2;

import a8.ia;
import android.net.Uri;
import android.os.SystemClock;
import h9.h2;
import h9.i0;
import h9.t0;
import java.util.HashMap;
import org.telegram.ui.Cells.f1;
public final class c {
    public final w f54627a;
    public final HashMap f54628b;
    public final d f54629c;

    public c(d dVar, w wVar) {
        this.f54629c = dVar;
        this.f54627a = wVar;
        HashMap hashMap = new HashMap();
        h2 it = t0.q(wVar.f54779b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) wVar.f54779b.get(str);
            uri.getClass();
            hashMap.put(uri, new b(this.f54629c, uri, str));
        }
        this.f54628b = hashMap;
    }

    public static m a(c cVar, Uri uri) {
        b bVar = (b) f1.l(cVar.f54628b, uri, uri);
        bVar.getClass();
        return bVar.f54619e;
    }

    public static void b(c cVar, Uri uri, boolean z9) {
        Uri uri2;
        b bVar = (b) f1.l(cVar.f54628b, uri, uri);
        bVar.getClass();
        if (z9) {
            uri2 = bVar.a();
        } else {
            uri2 = bVar.f54616a;
        }
        bVar.c(uri2);
    }

    public static boolean c(c cVar, Uri uri, long j3) {
        HashMap hashMap = cVar.f54628b;
        b bVar = (b) f1.l(hashMap, uri, uri);
        bVar.getClass();
        bVar.f54622r = SystemClock.elapsedRealtime() + j3;
        d dVar = cVar.f54629c;
        w wVar = cVar.f54627a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (b bVar2 : hashMap.values()) {
            if (!bVar2.f54617b.equals(wVar.d) && elapsedRealtime > bVar2.f54622r) {
                Uri c10 = wVar.c();
                String str = bVar2.f54617b;
                ia.p(wVar.f54779b.containsKey(str));
                wVar.d = str;
                if (c10.equals(dVar.F)) {
                    dVar.g(bVar2.f54616a);
                }
                b bVar3 = (b) hashMap.get(c10);
                bVar3.getClass();
                bVar2.f54625x = bVar3.f54625x;
                bVar3.f54625x = false;
                return true;
            }
        }
        Uri uri2 = dVar.F;
        if (uri2 == null || uri.equals(uri2)) {
            i0 i0Var = dVar.f54639x;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            boolean z9 = false;
            int i7 = 0;
            while (true) {
                if (i7 >= i0Var.size()) {
                    break;
                }
                Uri c11 = ((w) i0Var.get(i7)).c();
                c cVar2 = (c) dVar.d.get(c11);
                cVar2.getClass();
                HashMap hashMap2 = cVar2.f54628b;
                b bVar4 = (b) f1.l(hashMap2, c11, c11);
                bVar4.getClass();
                if (elapsedRealtime2 <= bVar4.f54622r) {
                    i7++;
                } else {
                    dVar.F = c11;
                    Uri d = dVar.d(c11);
                    b bVar5 = (b) f1.l(hashMap2, c11, c11);
                    bVar5.getClass();
                    bVar5.c(d);
                    z9 = true;
                    break;
                }
            }
            if (!z9) {
                return false;
            }
        }
        return true;
    }
}
