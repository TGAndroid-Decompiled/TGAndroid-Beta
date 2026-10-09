package x7;

import android.content.Context;
import java.util.ArrayList;
public final class ca implements ea {
    public final ArrayList f50717a;

    public ca(Context context, ba baVar) {
        ArrayList arrayList = new ArrayList();
        this.f50717a = arrayList;
        baVar.getClass();
        arrayList.add(new ha(context, baVar));
    }

    @Override
    public final void a(a5.a aVar) {
        ArrayList arrayList = this.f50717a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ea) obj).a(aVar);
        }
    }
}
