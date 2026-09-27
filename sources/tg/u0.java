package tg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.bb;
public final class u0 implements BiConsumer {
    public final int f43539a;
    public final bb f43540b;

    public u0(bb bbVar, int i10) {
        this.f43539a = i10;
        this.f43540b = bbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f43539a) {
            case 0:
                String str = (String) obj;
                ((z0) this.f43540b).f43567k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((th.f) this.f43540b).f43590b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f43539a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
