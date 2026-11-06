package xf;

import android.view.View;
import c8.td;
import java.util.ArrayList;
import oi.h;
public final class b implements View.OnAttachStateChangeListener {
    @Override
    public final void onViewAttachedToWindow(View view) {
        a a10;
        c cVar = (c) view.getTag(2131296697);
        if (cVar != null && (a10 = td.a(view, cVar)) != null) {
            ArrayList arrayList = cVar.f58605a;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((xe.b) a10.f58604a.f8841b).add((h) obj);
            }
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        a aVar;
        c cVar = (c) view.getTag(2131296697);
        if (cVar != null && (aVar = cVar.f58606b) != null) {
            ArrayList arrayList = cVar.f58605a;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((xe.b) aVar.f58604a.f8841b).remove((h) obj);
            }
            cVar.f58606b = null;
        }
    }
}
