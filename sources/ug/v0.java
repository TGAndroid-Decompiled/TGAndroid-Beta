package ug;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.bb;
public final class v0 implements BiConsumer {
    public final int f47245a;
    public final bb f47246b;

    public v0(bb bbVar, int i10) {
        this.f47245a = i10;
        this.f47246b = bbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f47245a) {
            case 0:
                String str = (String) obj;
                ((a1) this.f47246b).f47081k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((uh.f) this.f47246b).f47276b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f47245a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
