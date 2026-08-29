package y2;

import java.util.HashMap;
public final class p {
    public final i f50202a;
    public final String f50203b;
    public final v2.c f50204c;
    public final v2.e d;
    public final q f50205e;

    public p(i iVar, String str, v2.c cVar, v2.e eVar, q qVar) {
        this.f50202a = iVar;
        this.f50203b = str;
        this.f50204c = cVar;
        this.d = eVar;
        this.f50205e = qVar;
    }

    public final void a(v2.a aVar, v2.g gVar) {
        v2.e eVar = this.d;
        if (eVar != null) {
            q qVar = this.f50205e;
            d3.b bVar = qVar.f50209c;
            i b10 = this.f50202a.b(aVar.f49325c);
            ?? obj = new Object();
            obj.f2122f = new HashMap();
            obj.d = Long.valueOf(qVar.f50207a.e());
            obj.f2121e = Long.valueOf(qVar.f50208b.e());
            obj.f2118a = this.f50203b;
            obj.f2120c = new l(this.f50204c, (byte[]) eVar.apply(aVar.f49324b));
            obj.f2119b = aVar.f49323a;
            d3.a aVar2 = (d3.a) bVar;
            aVar2.f5298b.execute(new androidx.car.app.utils.c(aVar2, b10, gVar, obj.i(), 3));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
