package vh;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.ma;
import wg.w0;
public final class c implements BiConsumer {
    public final int f57511a;
    public final ma f57512b;

    public c(ma maVar, int i7) {
        this.f57511a = i7;
        this.f57512b = maVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f57511a) {
            case 0:
                String str = (String) obj;
                ((g) this.f57512b).W1.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((w0) this.f57512b).f57821f2.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i7 = this.f57511a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
