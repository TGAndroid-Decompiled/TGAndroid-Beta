package w2;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import vh.p1;
import vh.v2;
import w9.d;
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
    public final p1 f46362a;
    public final ConnectivityManager f46363b;
    public final Context f46364c;
    public final URL d;
    public final h3.a e;
    public final h3.a f46365f;
    public final int f46366g;

    public b(Context context, h3.a aVar, h3.a aVar2) {
        d dVar = new d();
        c cVar = c.f46655a;
        dVar.d(o.class, cVar);
        dVar.d(i.class, cVar);
        f fVar = f.f46665a;
        dVar.d(s.class, fVar);
        dVar.d(l.class, fVar);
        x2.d dVar2 = x2.d.f46657a;
        dVar.d(q.class, dVar2);
        dVar.d(j.class, dVar2);
        x2.b bVar = x2.b.f46645a;
        dVar.d(x2.a.class, bVar);
        dVar.d(h.class, bVar);
        x2.e eVar = x2.e.f46660a;
        dVar.d(r.class, eVar);
        dVar.d(k.class, eVar);
        g gVar = g.f46670a;
        dVar.d(v.class, gVar);
        dVar.d(n.class, gVar);
        dVar.d = true;
        this.f46362a = new p1(dVar);
        this.f46364c = context;
        this.f46363b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f46358c);
        this.e = aVar2;
        this.f46365f = aVar;
        this.f46366g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(v2.e("Invalid url: ", str), e);
        }
    }

    public final y2.h a(y2.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: w2.b.a(y2.h):y2.h");
    }
}
