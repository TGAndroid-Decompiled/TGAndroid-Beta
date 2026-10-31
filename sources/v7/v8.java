package v7;

import android.content.Context;
import java.util.ArrayList;
public final class v8 implements w8 {
    public final ArrayList f50626a;

    public v8(Context context, u8 u8Var) {
        ArrayList arrayList = new ArrayList();
        this.f50626a = arrayList;
        u8Var.getClass();
        arrayList.add(new a9(context, u8Var));
    }

    @Override
    public final void a(a5.a aVar) {
        ArrayList arrayList = this.f50626a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((w8) obj).a(aVar);
        }
    }
}
