package s5;

import android.util.LruCache;
import java.util.ArrayList;
public final class r extends LruCache {
    public final c f47071a;

    public r(c cVar) {
        super(20);
        this.f47071a = cVar;
    }

    @Override
    public final void entryRemoved(boolean z4, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.f47071a.f47024g;
        Integer num = (Integer) obj;
        q5.o oVar = (q5.o) obj2;
        q5.o oVar2 = (q5.o) obj3;
        if (!z4) {
            return;
        }
        b6.m.h(arrayList);
        arrayList.add(num);
    }
}
