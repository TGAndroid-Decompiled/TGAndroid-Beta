package za;

import android.util.Log;
import j$.util.Objects;
import java.util.Map;
import v7.u7;
import x7.d7;
public final class t extends kd.j implements rd.p {
    public final int f49127a;
    public int f49128b;
    public final Object f49129c;

    public t(Object obj, id.c cVar, int i10) {
        super(2, cVar);
        this.f49127a = i10;
        this.f49129c = obj;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f49127a) {
            case 0:
                return new t((y) this.f49129c, cVar, 0);
            default:
                return new t((String) this.f49129c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        zd.c0 c0Var = (zd.c0) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f49127a) {
            case 0:
                return ((t) create(c0Var, cVar)).invokeSuspend(gd.i.f9621a);
            default:
                return ((t) create(c0Var, cVar)).invokeSuspend(gd.i.f9621a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f49127a) {
            case 0:
                jd.a aVar = jd.a.f12971a;
                int i10 = this.f49128b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        u7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    u7.b(obj);
                    y yVar = (y) this.f49129c;
                    d7 d7Var = yVar.d;
                    ce.j jVar = new ce.j(yVar, 1);
                    this.f49128b = 1;
                    if (d7Var.s(jVar, this) == aVar) {
                        return aVar;
                    }
                }
                return gd.i.f9621a;
            default:
                jd.a aVar2 = jd.a.f12971a;
                int i11 = this.f49128b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        u7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    u7.b(obj);
                    ab.c cVar = ab.c.f372a;
                    this.f49128b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                String str = (String) this.f49129c;
                for (w9.j jVar2 : ((Map) obj).values()) {
                    ab.e eVar = new ab.e(str);
                    jVar2.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    w9.i iVar = jVar2.f45227b;
                    synchronized (iVar) {
                        if (!Objects.equals(iVar.f45225c, str)) {
                            w9.i.a(iVar.f45223a, iVar.f45224b, str);
                            iVar.f45225c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + ab.d.f374a + " of new session " + str);
                }
                return gd.i.f9621a;
        }
    }
}
