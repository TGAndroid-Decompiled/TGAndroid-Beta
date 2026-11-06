package vh;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.na;
import wg.w0;
public final class c implements BiConsumer {
    public final int f57411a;
    public final na f57412b;

    public c(na naVar, int i7) {
        this.f57411a = i7;
        this.f57412b = naVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f57411a) {
            case 0:
                String str = (String) obj;
                ((g) this.f57412b).T1.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((w0) this.f57412b).f57731c2.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i7 = this.f57411a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
