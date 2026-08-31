package y2;

import java.util.HashMap;
public final class p {
    public final i f50708a;
    public final String f50709b;
    public final v2.c f50710c;
    public final v2.e d;
    public final q f50711e;

    public p(i iVar, String str, v2.c cVar, v2.e eVar, q qVar) {
        this.f50708a = iVar;
        this.f50709b = str;
        this.f50710c = cVar;
        this.d = eVar;
        this.f50711e = qVar;
    }

    public final void a(v2.a aVar, v2.g gVar) {
        v2.e eVar = this.d;
        if (eVar != null) {
            q qVar = this.f50711e;
            d3.b bVar = qVar.f50715c;
            i b10 = this.f50708a.b(aVar.f48847c);
            ?? obj = new Object();
            obj.f159f = new HashMap();
            obj.d = Long.valueOf(qVar.f50713a.W());
            obj.f158e = Long.valueOf(qVar.f50714b.W());
            obj.f156b = this.f50709b;
            obj.f157c = new l(this.f50710c, (byte[]) eVar.apply(aVar.f48846b));
            obj.f155a = aVar.f48845a;
            d3.a aVar2 = (d3.a) bVar;
            aVar2.f4193b.execute(new androidx.car.app.utils.c(aVar2, b10, gVar, obj.j(), 1));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
