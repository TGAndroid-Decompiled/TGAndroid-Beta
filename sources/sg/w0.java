package sg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.ab;
public final class w0 implements BiConsumer {
    public final int f42019a;
    public final ab f42020b;

    public w0(ab abVar, int i10) {
        this.f42019a = i10;
        this.f42020b = abVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f42019a) {
            case 0:
                String str = (String) obj;
                ((c1) this.f42020b).f41889k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((sh.f) this.f42020b).f42045b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f42019a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
