package q5;

import android.util.LruCache;
import java.util.ArrayList;
public final class q extends LruCache {
    public final c f46414a;

    public q(c cVar) {
        super(20);
        this.f46414a = cVar;
    }

    @Override
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.f46414a.f46370g;
        Integer num = (Integer) obj;
        o5.o oVar = (o5.o) obj2;
        o5.o oVar2 = (o5.o) obj3;
        if (!z10) {
            return;
        }
        z5.l.h(arrayList);
        arrayList.add(num);
    }
}
