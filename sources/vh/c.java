package vh;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.ja;
import wg.u0;
public final class c implements BiConsumer {
    public final int f58987a;
    public final ja f58988b;

    public c(ja jaVar, int i7) {
        this.f58987a = i7;
        this.f58988b = jaVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f58987a) {
            case 0:
                String str = (String) obj;
                ((h) this.f58988b).X1.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((u0) this.f58988b).f59248g2.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i7 = this.f58987a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
