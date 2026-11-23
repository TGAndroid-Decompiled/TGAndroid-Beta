package y7;

import a8.xa;
import android.content.Context;
import java.util.ArrayList;
public final class c9 implements d9 {
    public final ArrayList f60910a;

    public c9(Context context, b9 b9Var) {
        ArrayList arrayList = new ArrayList();
        this.f60910a = arrayList;
        b9Var.getClass();
        arrayList.add(new f9(context, b9Var));
    }

    @Override
    public final void a(xa xaVar) {
        ArrayList arrayList = this.f60910a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((d9) obj).a(xaVar);
        }
    }
}
