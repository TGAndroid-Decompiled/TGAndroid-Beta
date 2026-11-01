package w7;

import android.content.Context;
import java.util.ArrayList;
public final class ia implements ha {
    public final ArrayList f52604a;

    public ia(Context context, ga gaVar) {
        ArrayList arrayList = new ArrayList();
        this.f52604a = arrayList;
        gaVar.getClass();
        arrayList.add(new ka(context, gaVar));
    }

    @Override
    public final void a(m5.e eVar) {
        ArrayList arrayList = this.f52604a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ha) obj).a(eVar);
        }
    }
}
