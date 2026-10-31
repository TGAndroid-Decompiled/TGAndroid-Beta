package x7;

import android.content.Context;
import java.util.ArrayList;
public final class da implements fa {
    public final ArrayList f53124a;

    public da(Context context, ca caVar) {
        ArrayList arrayList = new ArrayList();
        this.f53124a = arrayList;
        caVar.getClass();
        arrayList.add(new ha(context, caVar));
    }

    @Override
    public final void a(a5.a aVar) {
        ArrayList arrayList = this.f53124a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((fa) obj).a(aVar);
        }
    }
}
