package tg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.bb;
public final class v0 implements BiConsumer {
    public final int f43181a;
    public final bb f43182b;

    public v0(bb bbVar, int i10) {
        this.f43181a = i10;
        this.f43182b = bbVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f43181a) {
            case 0:
                String str = (String) obj;
                ((a1) this.f43182b).f43025k0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((th.f) this.f43182b).f43211b0.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f43181a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
