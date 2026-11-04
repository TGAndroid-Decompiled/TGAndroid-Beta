package wh;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.ma;
import xg.w0;
public final class c implements BiConsumer {
    public final int f57758a;
    public final ma f57759b;

    public c(ma maVar, int i3) {
        this.f57758a = i3;
        this.f57759b = maVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f57758a) {
            case 0:
                String str = (String) obj;
                ((h) this.f57759b).U1.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((w0) this.f57759b).f58773d2.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i3 = this.f57758a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
