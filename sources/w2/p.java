package w2;

import java.util.HashMap;

public final class p {

    public final i f48972a;

    public final String f48973b;

    public final t2.c f48974c;
    public final t2.e d;

    public final q f48975e;

    public p(i iVar, String str, t2.c cVar, t2.e eVar, q qVar) {
        this.f48972a = iVar;
        this.f48973b = str;
        this.f48974c = cVar;
        this.d = eVar;
        this.f48975e = qVar;
    }

    public final void a(t2.a aVar, t2.g gVar) {
        t2.e eVar = this.d;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        q qVar = this.f48975e;
        b3.b bVar = qVar.f48979c;
        i iVarB = this.f48972a.b(aVar.f48009c);
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
        mVar.f4606f = new HashMap();
        mVar.d = Long.valueOf(qVar.f48977a.E());
        mVar.f4605e = Long.valueOf(qVar.f48978b.E());
        mVar.f4602a = this.f48973b;
        mVar.f4604c = new l(this.f48974c, (byte[]) eVar.apply(aVar.f48008b));
        mVar.f4603b = aVar.f48007a;
        b3.a aVar2 = (b3.a) bVar;
        aVar2.f1906b.execute(new androidx.car.app.utils.b(aVar2, iVarB, gVar, mVar.i(), 1));
    }
}
