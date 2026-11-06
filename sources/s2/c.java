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
    public final w f54523a;
    public final HashMap f54524b;
    public final d f54525c;

    public c(d dVar, w wVar) {
        this.f54525c = dVar;
        this.f54523a = wVar;
        HashMap hashMap = new HashMap();
        h2 it = t0.q(wVar.f54675b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) wVar.f54675b.get(str);
            uri.getClass();
            hashMap.put(uri, new b(this.f54525c, uri, str));
        }
        this.f54524b = hashMap;
    }

    public static m a(c cVar, Uri uri) {
        b bVar = (b) f1.l(cVar.f54524b, uri, uri);
        bVar.getClass();
        return bVar.f54515e;
    }

    public static void b(c cVar, Uri uri, boolean z9) {
        Uri uri2;
        b bVar = (b) f1.l(cVar.f54524b, uri, uri);
        bVar.getClass();
        if (z9) {
            uri2 = bVar.a();
        } else {
            uri2 = bVar.f54512a;
        }
        bVar.c(uri2);
    }

    public static boolean c(c cVar, Uri uri, long j3) {
        HashMap hashMap = cVar.f54524b;
        b bVar = (b) f1.l(hashMap, uri, uri);
        bVar.getClass();
        bVar.f54518r = SystemClock.elapsedRealtime() + j3;
        d dVar = cVar.f54525c;
        w wVar = cVar.f54523a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (b bVar2 : hashMap.values()) {
            if (!bVar2.f54513b.equals(wVar.d) && elapsedRealtime > bVar2.f54518r) {
                Uri c10 = wVar.c();
                String str = bVar2.f54513b;
                ia.p(wVar.f54675b.containsKey(str));
                wVar.d = str;
                if (c10.equals(dVar.F)) {
                    dVar.g(bVar2.f54512a);
                }
                b bVar3 = (b) hashMap.get(c10);
                bVar3.getClass();
                bVar2.f54521x = bVar3.f54521x;
                bVar3.f54521x = false;
                return true;
            }
        }
        Uri uri2 = dVar.F;
        if (uri2 == null || uri.equals(uri2)) {
            i0 i0Var = dVar.f54535x;
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
                HashMap hashMap2 = cVar2.f54524b;
                b bVar4 = (b) f1.l(hashMap2, c11, c11);
                bVar4.getClass();
                if (elapsedRealtime2 <= bVar4.f54518r) {
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
