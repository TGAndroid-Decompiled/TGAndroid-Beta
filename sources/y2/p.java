package y2;

import java.util.HashMap;
public final class p {
    public final i f50745a;
    public final String f50746b;
    public final v2.c f50747c;
    public final v2.e d;
    public final q f50748e;

    public p(i iVar, String str, v2.c cVar, v2.e eVar, q qVar) {
        this.f50745a = iVar;
        this.f50746b = str;
        this.f50747c = cVar;
        this.d = eVar;
        this.f50748e = qVar;
    }

    public final void a(v2.a aVar, v2.g gVar) {
        v2.e eVar = this.d;
        if (eVar != null) {
            q qVar = this.f50748e;
            d3.b bVar = qVar.f50752c;
            i b10 = this.f50745a.b(aVar.f48883c);
            ?? obj = new Object();
            obj.f159f = new HashMap();
            obj.d = Long.valueOf(qVar.f50750a.W());
            obj.f158e = Long.valueOf(qVar.f50751b.W());
            obj.f156b = this.f50746b;
            obj.f157c = new l(this.f50747c, (byte[]) eVar.apply(aVar.f48882b));
            obj.f155a = aVar.f48881a;
            d3.a aVar2 = (d3.a) bVar;
            aVar2.f4193b.execute(new androidx.car.app.utils.c(aVar2, b10, gVar, obj.j(), 1));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
