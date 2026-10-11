package tg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.db;
public final class t0 implements BiConsumer {
    public final int f48513a;
    public final db f48514b;

    public t0(db dbVar, int i10) {
        this.f48513a = i10;
        this.f48514b = dbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f48513a) {
            case 0:
                String str = (String) obj;
                ((y0) this.f48514b).f48542k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((th.f) this.f48514b).f48591b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f48513a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
