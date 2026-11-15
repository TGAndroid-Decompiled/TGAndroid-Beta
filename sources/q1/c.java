package q1;

import gd.k;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kd.j;
import rd.p;
public final class c extends j implements p {
    public final int f55129a;
    public int f55130b;
    public Object f55131c;
    public final j d;

    public c(p pVar, id.c cVar, int i7) {
        super(2, cVar);
        this.f55129a = i7;
        switch (i7) {
            case 1:
                this.d = (j) pVar;
                super(2, cVar);
                return;
            default:
                this.d = (j) pVar;
                return;
        }
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f55129a) {
            case 0:
                c cVar2 = new c(this.d, cVar, 0);
                cVar2.f55131c = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.d, cVar, 1);
                cVar3.f55131c = obj;
                return cVar3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f55129a) {
            case 0:
                return ((c) create(bVar, cVar)).invokeSuspend(k.f13173a);
            default:
                return ((c) create(bVar, cVar)).invokeSuspend(k.f13173a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f55129a) {
            case 0:
                jd.a aVar = jd.a.f16999a;
                int i7 = this.f55130b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        af.b.c(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    af.b.c(obj);
                    this.f55130b = 1;
                    obj = this.d.invoke((b) this.f55131c, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                b bVar = (b) obj;
                kotlin.jvm.internal.j.c(bVar, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                ((AtomicBoolean) bVar.f55128b.f34590b).set(true);
                return bVar;
            default:
                jd.a aVar2 = jd.a.f16999a;
                int i10 = this.f55130b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        b bVar2 = (b) this.f55131c;
                        af.b.c(obj);
                        return bVar2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                af.b.c(obj);
                b bVar3 = new b(new LinkedHashMap(((b) this.f55131c).a()), false);
                this.f55131c = bVar3;
                this.f55130b = 1;
                if (this.d.invoke(bVar3, this) != aVar2) {
                    return bVar3;
                }
                return aVar2;
        }
    }
}
