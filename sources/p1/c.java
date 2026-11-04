package p1;

import b8.ib;
import dd.k;
import hd.j;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import od.p;
public final class c extends j implements p {
    public final int f53061a;
    public int f53062b;
    public Object f53063c;
    public final j d;

    public c(p pVar, fd.c cVar, int i3) {
        super(2, cVar);
        this.f53061a = i3;
        switch (i3) {
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
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.f53061a) {
            case 0:
                c cVar2 = new c(this.d, cVar, 0);
                cVar2.f53063c = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.d, cVar, 1);
                cVar3.f53063c = obj;
                return cVar3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        fd.c cVar = (fd.c) obj2;
        switch (this.f53061a) {
            case 0:
                return ((c) create(bVar, cVar)).invokeSuspend(k.f8801a);
            default:
                return ((c) create(bVar, cVar)).invokeSuspend(k.f8801a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f53061a) {
            case 0:
                gd.a aVar = gd.a.f12241a;
                int i3 = this.f53062b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ib.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ib.b(obj);
                    this.f53062b = 1;
                    obj = this.d.invoke((b) this.f53063c, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                b bVar = (b) obj;
                kotlin.jvm.internal.j.c(bVar, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                ((AtomicBoolean) bVar.f53060b.f36540b).set(true);
                return bVar;
            default:
                gd.a aVar2 = gd.a.f12241a;
                int i10 = this.f53062b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        b bVar2 = (b) this.f53063c;
                        ib.b(obj);
                        return bVar2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.b(obj);
                b bVar3 = new b(new LinkedHashMap(((b) this.f53063c).a()), false);
                this.f53063c = bVar3;
                this.f53062b = 1;
                if (this.d.invoke(bVar3, this) != aVar2) {
                    return bVar3;
                }
                return aVar2;
        }
    }
}
