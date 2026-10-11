package tg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.db;
public final class t0 implements BiConsumer {
    public final int f48479a;
    public final db f48480b;

    public t0(db dbVar, int i10) {
        this.f48479a = i10;
        this.f48480b = dbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f48479a) {
            case 0:
                String str = (String) obj;
                ((y0) this.f48480b).f48508k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((th.f) this.f48480b).f48557b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f48479a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
