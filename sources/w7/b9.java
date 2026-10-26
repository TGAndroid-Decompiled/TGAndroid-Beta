package w7;

import a8.ng;
import android.content.Context;
import java.util.ArrayList;
public final class b9 implements c9 {
    public final ArrayList f50821a;

    public b9(Context context, a9 a9Var) {
        ArrayList arrayList = new ArrayList();
        this.f50821a = arrayList;
        a9Var.getClass();
        arrayList.add(new e9(context, a9Var));
    }

    @Override
    public final void a(ng ngVar) {
        ArrayList arrayList = this.f50821a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((c9) obj).a(ngVar);
        }
    }
}
