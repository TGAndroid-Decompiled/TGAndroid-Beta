package za;

import android.util.Log;
import j$.util.Objects;
import java.util.Map;
import v7.u7;
public final class t extends kd.j implements rd.p {
    public final int f47947a;
    public int f47948b;
    public final Object f47949c;

    public t(Object obj, id.c cVar, int i10) {
        super(2, cVar);
        this.f47947a = i10;
        this.f47949c = obj;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f47947a) {
            case 0:
                return new t((z) this.f47949c, cVar, 0);
            default:
                return new t((String) this.f47949c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        zd.c0 c0Var = (zd.c0) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f47947a) {
            case 0:
                return ((t) create(c0Var, cVar)).invokeSuspend(gd.i.f8748a);
            default:
                return ((t) create(c0Var, cVar)).invokeSuspend(gd.i.f8748a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f47947a) {
            case 0:
                jd.a aVar = jd.a.f11861a;
                int i10 = this.f47948b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        u7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    u7.b(obj);
                    z zVar = (z) this.f47949c;
                    y yVar = zVar.d;
                    ce.j jVar = new ce.j(zVar, 1);
                    this.f47948b = 1;
                    if (yVar.u(jVar, this) == aVar) {
                        return aVar;
                    }
                }
                return gd.i.f8748a;
            default:
                jd.a aVar2 = jd.a.f11861a;
                int i11 = this.f47948b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        u7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    u7.b(obj);
                    ab.c cVar = ab.c.f368a;
                    this.f47948b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                String str = (String) this.f47949c;
                for (w9.j jVar2 : ((Map) obj).values()) {
                    ab.e eVar = new ab.e(str);
                    jVar2.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    w9.i iVar = jVar2.f43888b;
                    synchronized (iVar) {
                        if (!Objects.equals(iVar.f43886c, str)) {
                            w9.i.a(iVar.f43884a, iVar.f43885b, str);
                            iVar.f43886c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + ab.d.f370a + " of new session " + str);
                }
                return gd.i.f8748a;
        }
    }
}
