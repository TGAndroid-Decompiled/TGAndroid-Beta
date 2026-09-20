package w7;

import android.content.Context;
import java.util.ArrayList;
public final class ka implements ja {
    public final ArrayList f45038a;

    public ka(Context context, ia iaVar) {
        ArrayList arrayList = new ArrayList();
        this.f45038a = arrayList;
        iaVar.getClass();
        arrayList.add(new ma(context, iaVar));
    }

    @Override
    public final void a(org.telegram.ui.Cells.f3 f3Var) {
        ArrayList arrayList = this.f45038a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ja) obj).a(f3Var);
        }
    }
}
