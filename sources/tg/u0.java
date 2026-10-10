package tg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.eb;
public final class u0 implements BiConsumer {
    public final int f48459a;
    public final eb f48460b;

    public u0(eb ebVar, int i10) {
        this.f48459a = i10;
        this.f48460b = ebVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f48459a) {
            case 0:
                String str = (String) obj;
                ((z0) this.f48460b).f48488k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((th.f) this.f48460b).f48511b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f48459a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
