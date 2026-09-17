package yh;

import com.google.firebase.sessions.FirebaseSessionsRegistrar;
public final class a2 implements org.telegram.ui.ActionBar.b2, d9.e, q9.d {
    public final int f46944a;

    public a2(int i10) {
        this.f46944a = i10;
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f46944a) {
            case 10:
                return FirebaseSessionsRegistrar.e(cVar);
            case 11:
                return FirebaseSessionsRegistrar.f(cVar);
            case 12:
                return FirebaseSessionsRegistrar.a(cVar);
            case 13:
                return FirebaseSessionsRegistrar.b(cVar);
            case 14:
                return FirebaseSessionsRegistrar.d(cVar);
            default:
                return FirebaseSessionsRegistrar.c(cVar);
        }
    }

    @Override
    public java.lang.Object apply(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: yh.a2.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11 = a4.f46967q1;
    }
}
