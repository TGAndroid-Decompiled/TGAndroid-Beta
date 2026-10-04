package tg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.cb;
public final class u0 implements BiConsumer {
    public final int f47101a;
    public final cb f47102b;

    public u0(cb cbVar, int i10) {
        this.f47101a = i10;
        this.f47102b = cbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f47101a) {
            case 0:
                String str = (String) obj;
                ((z0) this.f47102b).f47130k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((th.f) this.f47102b).f47153b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f47101a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
