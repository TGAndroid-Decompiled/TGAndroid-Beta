package v7;

import android.content.Context;
import java.util.ArrayList;
public final class w8 implements x8 {
    public final ArrayList f43195a;

    public w8(Context context, v8 v8Var) {
        ArrayList arrayList = new ArrayList();
        this.f43195a = arrayList;
        v8Var.getClass();
        arrayList.add(new b9(context, v8Var));
    }

    @Override
    public final void a(a5.a aVar) {
        ArrayList arrayList = this.f43195a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((x8) obj).a(aVar);
        }
    }
}
