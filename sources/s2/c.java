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
    public final w f54522a;
    public final HashMap f54523b;
    public final d f54524c;

    public c(d dVar, w wVar) {
        this.f54524c = dVar;
        this.f54522a = wVar;
        HashMap hashMap = new HashMap();
        h2 it = t0.q(wVar.f54674b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) wVar.f54674b.get(str);
            uri.getClass();
            hashMap.put(uri, new b(this.f54524c, uri, str));
        }
        this.f54523b = hashMap;
    }

    public static m a(c cVar, Uri uri) {
        b bVar = (b) f1.l(cVar.f54523b, uri, uri);
        bVar.getClass();
        return bVar.f54514e;
    }

    public static void b(c cVar, Uri uri, boolean z9) {
        Uri uri2;
        b bVar = (b) f1.l(cVar.f54523b, uri, uri);
        bVar.getClass();
        if (z9) {
            uri2 = bVar.a();
        } else {
            uri2 = bVar.f54511a;
        }
        bVar.c(uri2);
    }

    public static boolean c(c cVar, Uri uri, long j3) {
        HashMap hashMap = cVar.f54523b;
        b bVar = (b) f1.l(hashMap, uri, uri);
        bVar.getClass();
        bVar.f54517r = SystemClock.elapsedRealtime() + j3;
        d dVar = cVar.f54524c;
        w wVar = cVar.f54522a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (b bVar2 : hashMap.values()) {
            if (!bVar2.f54512b.equals(wVar.d) && elapsedRealtime > bVar2.f54517r) {
                Uri c10 = wVar.c();
                String str = bVar2.f54512b;
                ia.p(wVar.f54674b.containsKey(str));
                wVar.d = str;
                if (c10.equals(dVar.F)) {
                    dVar.g(bVar2.f54511a);
                }
                b bVar3 = (b) hashMap.get(c10);
                bVar3.getClass();
                bVar2.f54520x = bVar3.f54520x;
                bVar3.f54520x = false;
                return true;
            }
        }
        Uri uri2 = dVar.F;
        if (uri2 == null || uri.equals(uri2)) {
            i0 i0Var = dVar.f54534x;
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
                HashMap hashMap2 = cVar2.f54523b;
                b bVar4 = (b) f1.l(hashMap2, c11, c11);
                bVar4.getClass();
                if (elapsedRealtime2 <= bVar4.f54517r) {
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
