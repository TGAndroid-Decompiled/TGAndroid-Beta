package tg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.eb;
public final class u0 implements BiConsumer {
    public final int f48415a;
    public final eb f48416b;

    public u0(eb ebVar, int i10) {
        this.f48415a = i10;
        this.f48416b = ebVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f48415a) {
            case 0:
                String str = (String) obj;
                ((z0) this.f48416b).f48444k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((th.f) this.f48416b).f48467b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f48415a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
