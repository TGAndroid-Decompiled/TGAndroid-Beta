package tg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.db;
public final class u0 implements BiConsumer {
    public final int f48653a;
    public final db f48654b;

    public u0(db dbVar, int i10) {
        this.f48653a = i10;
        this.f48654b = dbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f48653a) {
            case 0:
                String str = (String) obj;
                ((z0) this.f48654b).f48683k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((th.f) this.f48654b).f48706b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f48653a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
