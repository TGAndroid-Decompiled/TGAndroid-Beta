package vh;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.ra;
import wg.v0;
public final class c implements BiConsumer {
    public final int f59682a;
    public final ra f59683b;

    public c(ra raVar, int i7) {
        this.f59682a = i7;
        this.f59683b = raVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f59682a) {
            case 0:
                String str = (String) obj;
                ((g) this.f59683b).X1.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((v0) this.f59683b).f59944g2.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i7 = this.f59682a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
