package z7;

import android.content.Context;
import java.util.ArrayList;
public final class vf implements uf {
    public final ArrayList f54317a;

    public vf(Context context, tf tfVar) {
        ArrayList arrayList = new ArrayList();
        this.f54317a = arrayList;
        tfVar.getClass();
        arrayList.add(new yf(context, tfVar));
    }

    @Override
    public final void a(a5.a aVar) {
        ArrayList arrayList = this.f54317a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((uf) obj).a(aVar);
        }
    }
}
