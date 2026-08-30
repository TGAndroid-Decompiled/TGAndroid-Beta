package y2;

import java.util.HashMap;
public final class p {
    public final i f47028a;
    public final String f47029b;
    public final v2.c f47030c;
    public final v2.e d;
    public final q e;

    public p(i iVar, String str, v2.c cVar, v2.e eVar, q qVar) {
        this.f47028a = iVar;
        this.f47029b = str;
        this.f47030c = cVar;
        this.d = eVar;
        this.e = qVar;
    }

    public final void a(v2.a aVar, v2.g gVar) {
        v2.e eVar = this.d;
        if (eVar != null) {
            q qVar = this.e;
            d3.b bVar = qVar.f47033c;
            i b10 = this.f47028a.b(aVar.f45557c);
            ?? obj = new Object();
            obj.f146f = new HashMap();
            obj.d = Long.valueOf(qVar.f47031a.X());
            obj.e = Long.valueOf(qVar.f47032b.X());
            obj.f144b = this.f47029b;
            obj.f145c = new l(this.f47030c, (byte[]) eVar.apply(aVar.f45556b));
            obj.f143a = aVar.f45555a;
            d3.a aVar2 = (d3.a) bVar;
            aVar2.f4128b.execute(new androidx.car.app.utils.c(aVar2, b10, gVar, obj.j(), 1));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
