package y7;

import a8.ng;
import android.content.Context;
import java.util.ArrayList;
public final class aa implements ba {
    public final ArrayList f52136a;

    public aa(Context context, z9 z9Var) {
        ArrayList arrayList = new ArrayList();
        this.f52136a = arrayList;
        z9Var.getClass();
        arrayList.add(new da(context, z9Var));
    }

    @Override
    public final void a(ng ngVar) {
        ArrayList arrayList = this.f52136a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ba) obj).a(ngVar);
        }
    }
}
