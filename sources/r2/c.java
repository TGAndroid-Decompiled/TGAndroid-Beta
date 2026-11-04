package r2;

import android.net.Uri;
import android.os.SystemClock;
import b8.zb;
import g9.g2;
import g9.i0;
import g9.t0;
import java.util.HashMap;
import org.telegram.ui.Cells.f1;
public final class c {
    public final w f54080a;
    public final HashMap f54081b;
    public final d f54082c;

    public c(d dVar, w wVar) {
        this.f54082c = dVar;
        this.f54080a = wVar;
        HashMap hashMap = new HashMap();
        g2 it = t0.q(wVar.f54232b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) wVar.f54232b.get(str);
            uri.getClass();
            hashMap.put(uri, new b(this.f54082c, uri, str));
        }
        this.f54081b = hashMap;
    }

    public static m a(c cVar, Uri uri) {
        b bVar = (b) f1.p(cVar.f54081b, uri, uri);
        bVar.getClass();
        return bVar.f54072e;
    }

    public static void b(c cVar, Uri uri, boolean z10) {
        Uri uri2;
        b bVar = (b) f1.p(cVar.f54081b, uri, uri);
        bVar.getClass();
        if (z10) {
            uri2 = bVar.a();
        } else {
            uri2 = bVar.f54069a;
        }
        bVar.c(uri2);
    }

    public static boolean c(c cVar, Uri uri, long j10) {
        HashMap hashMap = cVar.f54081b;
        b bVar = (b) f1.p(hashMap, uri, uri);
        bVar.getClass();
        bVar.f54075r = SystemClock.elapsedRealtime() + j10;
        d dVar = cVar.f54082c;
        w wVar = cVar.f54080a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (b bVar2 : hashMap.values()) {
            if (!bVar2.f54070b.equals(wVar.d) && elapsedRealtime > bVar2.f54075r) {
                Uri c2 = wVar.c();
                String str = bVar2.f54070b;
                zb.p(wVar.f54232b.containsKey(str));
                wVar.d = str;
                if (c2.equals(dVar.G)) {
                    dVar.g(bVar2.f54069a);
                }
                b bVar3 = (b) hashMap.get(c2);
                bVar3.getClass();
                bVar2.f54078x = bVar3.f54078x;
                bVar3.f54078x = false;
                return true;
            }
        }
        Uri uri2 = dVar.G;
        if (uri2 == null || uri.equals(uri2)) {
            i0 i0Var = dVar.f54092x;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            boolean z10 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= i0Var.size()) {
                    break;
                }
                Uri c10 = ((w) i0Var.get(i3)).c();
                c cVar2 = (c) dVar.d.get(c10);
                cVar2.getClass();
                HashMap hashMap2 = cVar2.f54081b;
                b bVar4 = (b) f1.p(hashMap2, c10, c10);
                bVar4.getClass();
                if (elapsedRealtime2 <= bVar4.f54075r) {
                    i3++;
                } else {
                    dVar.G = c10;
                    Uri d = dVar.d(c10);
                    b bVar5 = (b) f1.p(hashMap2, c10, c10);
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
