package vg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.bb;
public final class u0 implements BiConsumer {
    public final int f50298a;
    public final bb f50299b;

    public u0(bb bbVar, int i10) {
        this.f50298a = i10;
        this.f50299b = bbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f50298a) {
            case 0:
                String str = (String) obj;
                ((z0) this.f50299b).f50326k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((vh.f) this.f50299b).f50349b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f50298a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
