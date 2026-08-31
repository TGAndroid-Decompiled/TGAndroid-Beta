package w2;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import org.telegram.ui.Components.ai;
import org.telegram.ui.yh;
import w9.d;
import x2.c;
import x2.e;
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
import z2.f;
public final class b implements f {
    public final ai f49328a;
    public final ConnectivityManager f49329b;
    public final Context f49330c;
    public final URL d;
    public final h3.a f49331e;
    public final h3.a f49332f;
    public final int f49333g;

    public b(Context context, h3.a aVar, h3.a aVar2) {
        d dVar = new d();
        c cVar = c.f50246a;
        dVar.b(o.class, cVar);
        dVar.b(i.class, cVar);
        x2.f fVar = x2.f.f50257a;
        dVar.b(s.class, fVar);
        dVar.b(l.class, fVar);
        x2.d dVar2 = x2.d.f50248a;
        dVar.b(q.class, dVar2);
        dVar.b(j.class, dVar2);
        x2.b bVar = x2.b.f50235a;
        dVar.b(x2.a.class, bVar);
        dVar.b(h.class, bVar);
        e eVar = e.f50251a;
        dVar.b(r.class, eVar);
        dVar.b(k.class, eVar);
        g gVar = g.f50263a;
        dVar.b(v.class, gVar);
        dVar.b(n.class, gVar);
        dVar.d = true;
        this.f49328a = new ai(dVar, 19);
        this.f49330c = context;
        this.f49329b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f49323c);
        this.f49331e = aVar2;
        this.f49332f = aVar;
        this.f49333g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e6) {
            throw new IllegalArgumentException(yh.k("Invalid url: ", str), e6);
        }
    }

    public final y2.h a(y2.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: w2.b.a(y2.h):y2.h");
    }
}
