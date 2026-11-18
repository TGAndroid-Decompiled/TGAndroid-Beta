package q1;

import gd.k;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kd.j;
import rd.p;
public final class c extends j implements p {
    public final int f55705a;
    public int f55706b;
    public Object f55707c;
    public final j d;

    public c(p pVar, id.c cVar, int i7) {
        super(2, cVar);
        this.f55705a = i7;
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
        switch (this.f55705a) {
            case 0:
                c cVar2 = new c(this.d, cVar, 0);
                cVar2.f55707c = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.d, cVar, 1);
                cVar3.f55707c = obj;
                return cVar3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f55705a) {
            case 0:
                return ((c) create(bVar, cVar)).invokeSuspend(k.f13485a);
            default:
                return ((c) create(bVar, cVar)).invokeSuspend(k.f13485a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f55705a) {
            case 0:
                jd.a aVar = jd.a.f17381a;
                int i7 = this.f55706b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        b7.h.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    b7.h.b(obj);
                    this.f55706b = 1;
                    obj = this.d.invoke((b) this.f55707c, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                b bVar = (b) obj;
                kotlin.jvm.internal.j.c(bVar, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                ((AtomicBoolean) bVar.f55704b.f38076b).set(true);
                return bVar;
            default:
                jd.a aVar2 = jd.a.f17381a;
                int i10 = this.f55706b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        b bVar2 = (b) this.f55707c;
                        b7.h.b(obj);
                        return bVar2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b7.h.b(obj);
                b bVar3 = new b(new LinkedHashMap(((b) this.f55707c).a()), false);
                this.f55707c = bVar3;
                this.f55706b = 1;
                if (this.d.invoke(bVar3, this) != aVar2) {
                    return bVar3;
                }
                return aVar2;
        }
    }
}
