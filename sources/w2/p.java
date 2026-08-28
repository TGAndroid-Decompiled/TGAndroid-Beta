package w2;

import java.util.HashMap;
public final class p {
    public final i f48469a;
    public final String f48470b;
    public final t2.c f48471c;
    public final t2.e d;
    public final q f48472e;

    public p(i iVar, String str, t2.c cVar, t2.e eVar, q qVar) {
        this.f48469a = iVar;
        this.f48470b = str;
        this.f48471c = cVar;
        this.d = eVar;
        this.f48472e = qVar;
    }

    public final void a(t2.a aVar, t2.g gVar) {
        t2.e eVar = this.d;
        if (eVar != null) {
            q qVar = this.f48472e;
            b3.c cVar = qVar.f48476c;
            i b10 = this.f48469a.b(aVar.f47598c);
            ?? obj = new Object();
            obj.f4164f = new HashMap();
            obj.d = Long.valueOf(qVar.f48474a.d());
            obj.f4163e = Long.valueOf(qVar.f48475b.d());
            obj.f4160a = this.f48470b;
            obj.f4162c = new l(this.f48471c, (byte[]) eVar.apply(aVar.f47597b));
            obj.f4161b = aVar.f47596a;
            b3.a aVar2 = (b3.a) cVar;
            aVar2.f1410b.execute(new androidx.car.app.utils.c(aVar2, b10, gVar, obj.i(), 1));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
