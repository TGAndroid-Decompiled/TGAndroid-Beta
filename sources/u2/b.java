package u2;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import n2.p;
import s9.d;
import v2.c;
import v2.f;
import v2.g;
import v2.h;
import v2.i;
import v2.j;
import v2.k;
import v2.l;
import v2.n;
import v2.o;
import v2.q;
import v2.r;
import v2.s;
import v2.v;
import x2.e;
public final class b implements e {
    public final p f47967a;
    public final ConnectivityManager f47968b;
    public final Context f47969c;
    public final URL d;
    public final f3.a f47970e;
    public final f3.a f47971f;
    public final int f47972g;

    public b(Context context, f3.a aVar, f3.a aVar2) {
        d dVar = new d();
        c cVar = c.f48258a;
        dVar.l(o.class, cVar);
        dVar.l(i.class, cVar);
        f fVar = f.f48269a;
        dVar.l(s.class, fVar);
        dVar.l(l.class, fVar);
        v2.d dVar2 = v2.d.f48260a;
        dVar.l(q.class, dVar2);
        dVar.l(j.class, dVar2);
        v2.b bVar = v2.b.f48247a;
        dVar.l(v2.a.class, bVar);
        dVar.l(h.class, bVar);
        v2.e eVar = v2.e.f48263a;
        dVar.l(r.class, eVar);
        dVar.l(k.class, eVar);
        g gVar = g.f48275a;
        dVar.l(v.class, gVar);
        dVar.l(n.class, gVar);
        dVar.d = true;
        this.f47967a = new p(dVar, 21);
        this.f47969c = context;
        this.f47968b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f47962c);
        this.f47970e = aVar2;
        this.f47971f = aVar;
        this.f47972g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(ta.b.d("Invalid url: ", str), e10);
        }
    }

    public final w2.h a(w2.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: u2.b.a(w2.h):w2.h");
    }
}
