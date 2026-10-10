package za;

import android.util.Log;
import j$.util.Objects;
import java.util.Map;
import v7.a8;
public final class u extends ld.j implements sd.p {
    public final int f54332a;
    public int f54333b;
    public final Object f54334c;

    public u(Object obj, jd.c cVar, int i10) {
        super(2, cVar);
        this.f54332a = i10;
        this.f54334c = obj;
    }

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        switch (this.f54332a) {
            case 0:
                return new u((a0) this.f54334c, cVar, 0);
            default:
                return new u((String) this.f54334c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        ae.d0 d0Var = (ae.d0) obj;
        jd.c cVar = (jd.c) obj2;
        switch (this.f54332a) {
            case 0:
                return ((u) create(d0Var, cVar)).invokeSuspend(hd.i.f11092a);
            default:
                return ((u) create(d0Var, cVar)).invokeSuspend(hd.i.f11092a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f54332a) {
            case 0:
                kd.a aVar = kd.a.f14784a;
                int i10 = this.f54333b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a8.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a8.b(obj);
                    a0 a0Var = (a0) this.f54334c;
                    z zVar = a0Var.d;
                    de.j jVar = new de.j(a0Var, 1);
                    this.f54333b = 1;
                    if (zVar.z(jVar, this) == aVar) {
                        return aVar;
                    }
                }
                return hd.i.f11092a;
            default:
                kd.a aVar2 = kd.a.f14784a;
                int i11 = this.f54333b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        a8.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a8.b(obj);
                    ab.c cVar = ab.c.f398a;
                    this.f54333b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                String str = (String) this.f54334c;
                for (w9.j jVar2 : ((Map) obj).values()) {
                    ab.e eVar = new ab.e(str);
                    jVar2.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    w9.i iVar = jVar2.f50281b;
                    synchronized (iVar) {
                        if (!Objects.equals(iVar.f50279c, str)) {
                            w9.i.a(iVar.f50277a, iVar.f50278b, str);
                            iVar.f50279c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + ab.d.f400a + " of new session " + str);
                }
                return hd.i.f11092a;
        }
    }
}
