package vg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.bb;
public final class u0 implements BiConsumer {
    public final int f50260a;
    public final bb f50261b;

    public u0(bb bbVar, int i10) {
        this.f50260a = i10;
        this.f50261b = bbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f50260a) {
            case 0:
                String str = (String) obj;
                ((z0) this.f50261b).f50288k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((vh.f) this.f50261b).f50311b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f50260a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
