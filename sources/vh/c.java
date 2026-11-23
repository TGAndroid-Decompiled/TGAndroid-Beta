package vh;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.sa;
import wg.w0;
public final class c implements BiConsumer {
    public final int f59562a;
    public final sa f59563b;

    public c(sa saVar, int i7) {
        this.f59562a = i7;
        this.f59563b = saVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f59562a) {
            case 0:
                String str = (String) obj;
                ((g) this.f59563b).X1.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((w0) this.f59563b).f59849g2.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i7 = this.f59562a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
