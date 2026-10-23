package ug;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.bb;
public final class s0 implements BiConsumer {
    public final int f48201a;
    public final bb f48202b;

    public s0(bb bbVar, int i10) {
        this.f48201a = i10;
        this.f48202b = bbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f48201a) {
            case 0:
                String str = (String) obj;
                ((x0) this.f48202b).f48229k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((uh.f) this.f48202b).f48281b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f48201a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
