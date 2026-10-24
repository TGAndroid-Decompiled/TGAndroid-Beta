package ug;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.za;
public final class s0 implements BiConsumer {
    public final int f48200a;
    public final za f48201b;

    public s0(za zaVar, int i10) {
        this.f48200a = i10;
        this.f48201b = zaVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f48200a) {
            case 0:
                String str = (String) obj;
                ((x0) this.f48201b).f48228k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((uh.f) this.f48201b).f48280b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f48200a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
