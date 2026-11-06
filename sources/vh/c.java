package vh;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.na;
import wg.w0;
public final class c implements BiConsumer {
    public final int f57410a;
    public final na f57411b;

    public c(na naVar, int i7) {
        this.f57410a = i7;
        this.f57411b = naVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f57410a) {
            case 0:
                String str = (String) obj;
                ((g) this.f57411b).T1.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((w0) this.f57411b).f57730c2.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i7 = this.f57410a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
