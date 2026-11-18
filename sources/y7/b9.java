package y7;

import a8.xa;
import android.content.Context;
import java.util.ArrayList;
public final class b9 implements c9 {
    public final ArrayList f60775a;

    public b9(Context context, a9 a9Var) {
        ArrayList arrayList = new ArrayList();
        this.f60775a = arrayList;
        a9Var.getClass();
        arrayList.add(new e9(context, a9Var));
    }

    @Override
    public final void a(xa xaVar) {
        ArrayList arrayList = this.f60775a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((c9) obj).a(xaVar);
        }
    }
}
