package w2;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import u9.d;
import x2.c;
import x2.f;
import x2.g;
import x2.h;
import x2.i;
import x2.j;
import x2.k;
import x2.l;
import x2.n;
import x2.o;
import x2.q;
import x2.r;
import x2.s;
import x2.v;
import z2.e;
public final class b implements e {
    public final o1.a f49626a;
    public final ConnectivityManager f49627b;
    public final Context f49628c;
    public final URL d;
    public final h3.a f49629e;
    public final h3.a f49630f;
    public final int f49631g;

    public b(Context context, h3.a aVar, h3.a aVar2) {
        d dVar = new d();
        c cVar = c.f49996a;
        dVar.i(o.class, cVar);
        dVar.i(i.class, cVar);
        f fVar = f.f50007a;
        dVar.i(s.class, fVar);
        dVar.i(l.class, fVar);
        x2.d dVar2 = x2.d.f49998a;
        dVar.i(q.class, dVar2);
        dVar.i(j.class, dVar2);
        x2.b bVar = x2.b.f49985a;
        dVar.i(x2.a.class, bVar);
        dVar.i(h.class, bVar);
        x2.e eVar = x2.e.f50001a;
        dVar.i(r.class, eVar);
        dVar.i(k.class, eVar);
        g gVar = g.f50013a;
        dVar.i(v.class, gVar);
        dVar.i(n.class, gVar);
        dVar.d = true;
        this.f49626a = new o1.a(dVar, 27);
        this.f49628c = context;
        this.f49627b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f49621c);
        this.f49629e = aVar2;
        this.f49630f = aVar;
        this.f49631g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(u3.c.e("Invalid url: ", str), e10);
        }
    }

    public final y2.h a(y2.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: w2.b.a(y2.h):y2.h");
    }
}
