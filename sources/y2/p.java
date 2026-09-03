package y2;

import java.util.HashMap;
public final class p {
    public final i f47122a;
    public final String f47123b;
    public final v2.c f47124c;
    public final v2.e d;
    public final q e;

    public p(i iVar, String str, v2.c cVar, v2.e eVar, q qVar) {
        this.f47122a = iVar;
        this.f47123b = str;
        this.f47124c = cVar;
        this.d = eVar;
        this.e = qVar;
    }

    public final void a(v2.a aVar, v2.g gVar) {
        v2.e eVar = this.d;
        if (eVar != null) {
            q qVar = this.e;
            d3.b bVar = qVar.f47127c;
            i b10 = this.f47122a.b(aVar.f45621c);
            ?? obj = new Object();
            obj.f145f = new HashMap();
            obj.d = Long.valueOf(qVar.f47125a.l());
            obj.e = Long.valueOf(qVar.f47126b.l());
            obj.f143b = this.f47123b;
            obj.f144c = new l(this.f47124c, (byte[]) eVar.apply(aVar.f45620b));
            obj.f142a = aVar.f45619a;
            d3.a aVar2 = (d3.a) bVar;
            aVar2.f4109b.execute(new androidx.car.app.utils.c(aVar2, b10, gVar, obj.j(), 1));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
