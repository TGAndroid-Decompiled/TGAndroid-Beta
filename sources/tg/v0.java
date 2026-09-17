package tg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.za;
public final class v0 implements BiConsumer {
    public final int f43253a;
    public final za f43254b;

    public v0(za zaVar, int i10) {
        this.f43253a = i10;
        this.f43254b = zaVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f43253a) {
            case 0:
                String str = (String) obj;
                ((a1) this.f43254b).f43096k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((th.f) this.f43254b).f43283b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f43253a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
