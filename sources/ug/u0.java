package ug;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.db;
public final class u0 implements BiConsumer {
    public final int f46396a;
    public final db f46397b;

    public u0(db dbVar, int i10) {
        this.f46396a = i10;
        this.f46397b = dbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f46396a) {
            case 0:
                String str = (String) obj;
                ((z0) this.f46397b).f46424k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((uh.f) this.f46397b).f46447b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f46396a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
