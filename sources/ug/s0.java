package ug;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.bb;
public final class s0 implements BiConsumer {
    public final int f47776a;
    public final bb f47777b;

    public s0(bb bbVar, int i10) {
        this.f47776a = i10;
        this.f47777b = bbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f47776a) {
            case 0:
                String str = (String) obj;
                ((x0) this.f47777b).f47804k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((uh.f) this.f47777b).f47856b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f47776a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
