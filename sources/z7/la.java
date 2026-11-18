package z7;

import android.content.Context;
import java.util.ArrayList;
public final class la implements ka {
    public final ArrayList f61636a;

    public la(Context context, ja jaVar) {
        ArrayList arrayList = new ArrayList();
        this.f61636a = arrayList;
        jaVar.getClass();
        arrayList.add(new na(context, jaVar));
    }

    @Override
    public final void a(sg.h0 h0Var) {
        ArrayList arrayList = this.f61636a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((ka) obj).a(h0Var);
        }
    }
}
