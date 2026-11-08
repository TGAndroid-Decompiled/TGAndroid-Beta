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
    public final w f54615a;
    public final HashMap f54616b;
    public final d f54617c;

    public c(d dVar, w wVar) {
        this.f54617c = dVar;
        this.f54615a = wVar;
        HashMap hashMap = new HashMap();
        h2 it = t0.q(wVar.f54767b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) wVar.f54767b.get(str);
            uri.getClass();
            hashMap.put(uri, new b(this.f54617c, uri, str));
        }
        this.f54616b = hashMap;
    }

    public static m a(c cVar, Uri uri) {
        b bVar = (b) f1.l(cVar.f54616b, uri, uri);
        bVar.getClass();
        return bVar.f54607e;
    }

    public static void b(c cVar, Uri uri, boolean z9) {
        Uri uri2;
        b bVar = (b) f1.l(cVar.f54616b, uri, uri);
        bVar.getClass();
        if (z9) {
            uri2 = bVar.a();
        } else {
            uri2 = bVar.f54604a;
        }
        bVar.c(uri2);
    }

    public static boolean c(c cVar, Uri uri, long j3) {
        HashMap hashMap = cVar.f54616b;
        b bVar = (b) f1.l(hashMap, uri, uri);
        bVar.getClass();
        bVar.f54610r = SystemClock.elapsedRealtime() + j3;
        d dVar = cVar.f54617c;
        w wVar = cVar.f54615a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (b bVar2 : hashMap.values()) {
            if (!bVar2.f54605b.equals(wVar.d) && elapsedRealtime > bVar2.f54610r) {
                Uri c10 = wVar.c();
                String str = bVar2.f54605b;
                ia.p(wVar.f54767b.containsKey(str));
                wVar.d = str;
                if (c10.equals(dVar.F)) {
                    dVar.g(bVar2.f54604a);
                }
                b bVar3 = (b) hashMap.get(c10);
                bVar3.getClass();
                bVar2.f54613x = bVar3.f54613x;
                bVar3.f54613x = false;
                return true;
            }
        }
        Uri uri2 = dVar.F;
        if (uri2 == null || uri.equals(uri2)) {
            i0 i0Var = dVar.f54627x;
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
                HashMap hashMap2 = cVar2.f54616b;
                b bVar4 = (b) f1.l(hashMap2, c11, c11);
                bVar4.getClass();
                if (elapsedRealtime2 <= bVar4.f54610r) {
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
