package th;

import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;
public final class s4 implements Consumer {
    public final t4 f49451a;

    public s4(t4 t4Var) {
        this.f49451a = t4Var;
    }

    @Override
    public final void accept(Object obj) {
        org.telegram.messenger.i0.g3(new o0(8, this.f49451a, (List) obj));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
