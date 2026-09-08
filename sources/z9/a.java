package z9;

import cf.c;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.hh1;
import q9.d;
import zh.w3;
public final class a implements d, a2 {
    public final int f51407a;

    public a(int i10) {
        this.f51407a = i10;
    }

    @Override
    public Object D(c cVar) {
        switch (this.f51407a) {
            case 7:
                return FirebaseSessionsRegistrar.e(cVar);
            case 8:
                return FirebaseSessionsRegistrar.f(cVar);
            case 9:
                return FirebaseSessionsRegistrar.a(cVar);
            case 10:
                return FirebaseSessionsRegistrar.b(cVar);
            case 11:
                return FirebaseSessionsRegistrar.d(cVar);
            default:
                return FirebaseSessionsRegistrar.c(cVar);
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f51407a) {
            case 13:
                w3.d2(new hh1(6, null));
                return;
            default:
                int i11 = w3.f52785q1;
                return;
        }
    }

    public a(w3 w3Var) {
        this.f51407a = 13;
    }
}
