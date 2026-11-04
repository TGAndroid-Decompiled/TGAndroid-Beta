package z7;

import android.content.Context;
import b8.kg;
import java.util.ArrayList;
public final class ba implements ca {
    public final ArrayList f59808a;

    public ba(Context context, aa aaVar) {
        ArrayList arrayList = new ArrayList();
        this.f59808a = arrayList;
        aaVar.getClass();
        arrayList.add(new ea(context, aaVar));
    }

    @Override
    public final void a(kg kgVar) {
        ArrayList arrayList = this.f59808a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((ca) obj).a(kgVar);
        }
    }
}
