package ug;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.bb;
public final class t0 implements BiConsumer {
    public final int f47757a;
    public final bb f47758b;

    public t0(bb bbVar, int i10) {
        this.f47757a = i10;
        this.f47758b = bbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f47757a) {
            case 0:
                String str = (String) obj;
                ((y0) this.f47758b).f47785k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((uh.f) this.f47758b).f47834b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f47757a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
