package ug;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.bb;
public final class t0 implements BiConsumer {
    public final int f47764a;
    public final bb f47765b;

    public t0(bb bbVar, int i10) {
        this.f47764a = i10;
        this.f47765b = bbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f47764a) {
            case 0:
                String str = (String) obj;
                ((y0) this.f47765b).f47792k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((uh.f) this.f47765b).f47841b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f47764a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
