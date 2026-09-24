package tg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.bb;
public final class u0 implements BiConsumer {
    public final int f43479a;
    public final bb f43480b;

    public u0(bb bbVar, int i10) {
        this.f43479a = i10;
        this.f43480b = bbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f43479a) {
            case 0:
                String str = (String) obj;
                ((z0) this.f43480b).f43507k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((th.f) this.f43480b).f43530b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f43479a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
