package vh;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.sa;
import wg.w0;
public final class c implements BiConsumer {
    public final int f59555a;
    public final sa f59556b;

    public c(sa saVar, int i7) {
        this.f59555a = i7;
        this.f59556b = saVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f59555a) {
            case 0:
                String str = (String) obj;
                ((g) this.f59556b).X1.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((w0) this.f59556b).f59839g2.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i7 = this.f59555a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
