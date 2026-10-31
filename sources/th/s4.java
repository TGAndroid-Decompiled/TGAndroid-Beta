package th;

import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;
public final class s4 implements Consumer {
    public final t4 f49437a;

    public s4(t4 t4Var) {
        this.f49437a = t4Var;
    }

    @Override
    public final void accept(Object obj) {
        org.telegram.messenger.i0.g3(new o0(7, this.f49437a, (List) obj));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
