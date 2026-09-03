package w2;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import org.telegram.ui.Components.tp0;
import vh.w2;
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
    public final tp0 f46444a;
    public final ConnectivityManager f46445b;
    public final Context f46446c;
    public final URL d;
    public final h3.a e;
    public final h3.a f46447f;
    public final int f46448g;

    public b(Context context, h3.a aVar, h3.a aVar2) {
        d dVar = new d();
        c cVar = c.f46724a;
        dVar.b(o.class, cVar);
        dVar.b(i.class, cVar);
        f fVar = f.f46734a;
        dVar.b(s.class, fVar);
        dVar.b(l.class, fVar);
        x2.d dVar2 = x2.d.f46726a;
        dVar.b(q.class, dVar2);
        dVar.b(j.class, dVar2);
        x2.b bVar = x2.b.f46714a;
        dVar.b(x2.a.class, bVar);
        dVar.b(h.class, bVar);
        x2.e eVar = x2.e.f46729a;
        dVar.b(r.class, eVar);
        dVar.b(k.class, eVar);
        g gVar = g.f46739a;
        dVar.b(v.class, gVar);
        dVar.b(n.class, gVar);
        dVar.d = true;
        this.f46444a = new tp0(dVar, 23);
        this.f46446c = context;
        this.f46445b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f46440c);
        this.e = aVar2;
        this.f46447f = aVar;
        this.f46448g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(w2.e("Invalid url: ", str), e);
        }
    }

    public final y2.h a(y2.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: w2.b.a(y2.h):y2.h");
    }
}
