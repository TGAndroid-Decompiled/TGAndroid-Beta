package ra;

import android.content.Context;
import b8.ke;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;
import t9.r;
public final class b implements t9.d {
    public final int f54453a;
    public final r f54454b;

    public b(r rVar, int i3) {
        this.f54453a = i3;
        this.f54454b = rVar;
    }

    @Override
    public final Object q1(ke keVar) {
        switch (this.f54453a) {
            case 0:
                return new d((Context) keVar.a(Context.class), ((n9.h) keVar.a(n9.h.class)).d(), keVar.I(e.class), keVar.f(bb.b.class), (Executor) keVar.g(this.f54454b));
            default:
                return FirebaseMessagingRegistrar.a(this.f54454b, keVar);
        }
    }
}
