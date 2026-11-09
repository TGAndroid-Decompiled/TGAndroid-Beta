package z7;

import android.content.Context;
import java.util.ArrayList;
public final class la implements ka {
    public final ArrayList f59873a;

    public la(Context context, ja jaVar) {
        ArrayList arrayList = new ArrayList();
        this.f59873a = arrayList;
        jaVar.getClass();
        arrayList.add(new na(context, jaVar));
    }

    @Override
    public final void a(sg.i0 i0Var) {
        ArrayList arrayList = this.f59873a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((ka) obj).a(i0Var);
        }
    }
}
