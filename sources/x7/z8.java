package x7;

import android.content.Context;
import b8.kg;
import java.util.ArrayList;
public final class z8 implements a9 {
    public final ArrayList f58510a;

    public z8(Context context, y8 y8Var) {
        ArrayList arrayList = new ArrayList();
        this.f58510a = arrayList;
        y8Var.getClass();
        arrayList.add(new c9(context, y8Var));
    }

    @Override
    public final void a(kg kgVar) {
        ArrayList arrayList = this.f58510a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((a9) obj).a(kgVar);
        }
    }
}
