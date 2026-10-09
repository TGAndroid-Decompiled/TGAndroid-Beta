package tg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.eb;
public final class u0 implements BiConsumer {
    public final int f48413a;
    public final eb f48414b;

    public u0(eb ebVar, int i10) {
        this.f48413a = i10;
        this.f48414b = ebVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f48413a) {
            case 0:
                String str = (String) obj;
                ((z0) this.f48414b).f48442k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((th.f) this.f48414b).f48465b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f48413a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
