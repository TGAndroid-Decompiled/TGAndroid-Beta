package vh;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.na;
import wg.w0;
public final class c implements BiConsumer {
    public final int f57502a;
    public final na f57503b;

    public c(na naVar, int i7) {
        this.f57502a = i7;
        this.f57503b = naVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f57502a) {
            case 0:
                String str = (String) obj;
                ((g) this.f57503b).T1.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((w0) this.f57503b).f57822c2.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i7 = this.f57502a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
