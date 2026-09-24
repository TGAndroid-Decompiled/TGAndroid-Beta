package v7;

import android.content.Context;
import java.util.ArrayList;
public final class x8 implements y8 {
    public final ArrayList f44450a;

    public x8(Context context, w8 w8Var) {
        ArrayList arrayList = new ArrayList();
        this.f44450a = arrayList;
        w8Var.getClass();
        arrayList.add(new c9(context, w8Var));
    }

    @Override
    public final void a(a5.a aVar) {
        ArrayList arrayList = this.f44450a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((y8) obj).a(aVar);
        }
    }
}
