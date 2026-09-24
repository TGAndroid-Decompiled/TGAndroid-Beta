package za;

import com.google.firebase.sessions.FirebaseSessionsRegistrar;
public final class m implements q9.d {
    public final int f49076a;

    public m(int i10) {
        this.f49076a = i10;
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f49076a) {
            case 1:
                return FirebaseSessionsRegistrar.e(cVar);
            case 2:
                return FirebaseSessionsRegistrar.f(cVar);
            case 3:
                return FirebaseSessionsRegistrar.a(cVar);
            case 4:
                return FirebaseSessionsRegistrar.b(cVar);
            case 5:
                return FirebaseSessionsRegistrar.d(cVar);
            default:
                return FirebaseSessionsRegistrar.c(cVar);
        }
    }
}
