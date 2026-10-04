package tg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.cb;
public final class u0 implements BiConsumer {
    public final int f47109a;
    public final cb f47110b;

    public u0(cb cbVar, int i10) {
        this.f47109a = i10;
        this.f47110b = cbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f47109a) {
            case 0:
                String str = (String) obj;
                ((z0) this.f47110b).f47138k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((th.f) this.f47110b).f47161b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f47109a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
