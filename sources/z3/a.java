package z3;

import com.google.firebase.sessions.FirebaseSessionsRegistrar;
public final class a implements d9.e, q9.d {
    public final int f48072a;

    public a(int i10) {
        this.f48072a = i10;
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f48072a) {
            case 9:
                return FirebaseSessionsRegistrar.e(cVar);
            case 10:
                return FirebaseSessionsRegistrar.f(cVar);
            case 11:
                return FirebaseSessionsRegistrar.a(cVar);
            case 12:
                return FirebaseSessionsRegistrar.b(cVar);
            case 13:
                return FirebaseSessionsRegistrar.d(cVar);
            default:
                return FirebaseSessionsRegistrar.c(cVar);
        }
    }

    @Override
    public java.lang.Object apply(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: z3.a.apply(java.lang.Object):java.lang.Object");
    }
}
