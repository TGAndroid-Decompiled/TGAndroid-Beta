package xf;

import android.view.View;
import c8.ud;
import java.util.ArrayList;
import ri.h;
public final class b implements View.OnAttachStateChangeListener {
    @Override
    public final void onViewAttachedToWindow(View view) {
        a a10;
        c cVar = (c) view.getTag(2131296697);
        if (cVar != null && (a10 = ud.a(view, cVar)) != null) {
            ArrayList arrayList = cVar.f59891a;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((xe.b) a10.f59890a.f12459b).add((h) obj);
            }
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        a aVar;
        c cVar = (c) view.getTag(2131296697);
        if (cVar != null && (aVar = cVar.f59892b) != null) {
            ArrayList arrayList = cVar.f59891a;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((xe.b) aVar.f59890a.f12459b).remove((h) obj);
            }
            cVar.f59892b = null;
        }
    }
}
