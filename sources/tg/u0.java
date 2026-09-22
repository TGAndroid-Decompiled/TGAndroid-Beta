package tg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.ab;
public final class u0 implements BiConsumer {
    public final int f43529a;
    public final ab f43530b;

    public u0(ab abVar, int i10) {
        this.f43529a = i10;
        this.f43530b = abVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f43529a) {
            case 0:
                String str = (String) obj;
                ((z0) this.f43530b).f43557k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((th.f) this.f43530b).f43580b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f43529a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
