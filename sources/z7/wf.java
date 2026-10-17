package z7;

import android.content.Context;
import java.util.ArrayList;
public final class wf implements vf {
    public final ArrayList f51238a;

    public wf(Context context, uf ufVar) {
        ArrayList arrayList = new ArrayList();
        this.f51238a = arrayList;
        ufVar.getClass();
        arrayList.add(new zf(context, ufVar));
    }

    @Override
    public final void a(a5.a aVar) {
        ArrayList arrayList = this.f51238a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((vf) obj).a(aVar);
        }
    }
}
