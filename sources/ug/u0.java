package ug;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.db;
public final class u0 implements BiConsumer {
    public final int f46395a;
    public final db f46396b;

    public u0(db dbVar, int i10) {
        this.f46395a = i10;
        this.f46396b = dbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f46395a) {
            case 0:
                String str = (String) obj;
                ((z0) this.f46396b).f46423k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((uh.f) this.f46396b).f46446b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f46395a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
