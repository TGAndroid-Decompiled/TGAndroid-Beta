package tg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.cb;
public final class u0 implements BiConsumer {
    public final int f43601a;
    public final cb f43602b;

    public u0(cb cbVar, int i10) {
        this.f43601a = i10;
        this.f43602b = cbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f43601a) {
            case 0:
                String str = (String) obj;
                ((z0) this.f43602b).f43629k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((th.f) this.f43602b).f43652b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f43601a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
