package za;

import android.util.Log;
import j$.util.Objects;
import java.util.Map;
import v7.t7;
public final class t extends kd.j implements rd.p {
    public final int f53147a;
    public int f53148b;
    public final Object f53149c;

    public t(Object obj, id.c cVar, int i10) {
        super(2, cVar);
        this.f53147a = i10;
        this.f53149c = obj;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f53147a) {
            case 0:
                return new t((y) this.f53149c, cVar, 0);
            default:
                return new t((String) this.f53149c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        zd.c0 c0Var = (zd.c0) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f53147a) {
            case 0:
                return ((t) create(c0Var, cVar)).invokeSuspend(gd.i.f10452a);
            default:
                return ((t) create(c0Var, cVar)).invokeSuspend(gd.i.f10452a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f53147a) {
            case 0:
                jd.a aVar = jd.a.f14087a;
                int i10 = this.f53148b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        t7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t7.b(obj);
                    y yVar = (y) this.f53149c;
                    o0.a aVar2 = yVar.d;
                    ce.j jVar = new ce.j(yVar, 1);
                    this.f53148b = 1;
                    if (aVar2.d(jVar, this) == aVar) {
                        return aVar;
                    }
                }
                return gd.i.f10452a;
            default:
                jd.a aVar3 = jd.a.f14087a;
                int i11 = this.f53148b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        t7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t7.b(obj);
                    ab.c cVar = ab.c.f400a;
                    this.f53148b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                }
                String str = (String) this.f53149c;
                for (w9.j jVar2 : ((Map) obj).values()) {
                    ab.e eVar = new ab.e(str);
                    jVar2.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    w9.i iVar = jVar2.f48939b;
                    synchronized (iVar) {
                        if (!Objects.equals(iVar.f48937c, str)) {
                            w9.i.a(iVar.f48935a, iVar.f48936b, str);
                            iVar.f48937c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + ab.d.f402a + " of new session " + str);
                }
                return gd.i.f10452a;
        }
    }
}
