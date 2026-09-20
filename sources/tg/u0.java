package tg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.ab;
public final class u0 implements BiConsumer {
    public final int f43508a;
    public final ab f43509b;

    public u0(ab abVar, int i10) {
        this.f43508a = i10;
        this.f43509b = abVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f43508a) {
            case 0:
                String str = (String) obj;
                ((z0) this.f43509b).f43536k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((th.f) this.f43509b).f43559b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f43508a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
