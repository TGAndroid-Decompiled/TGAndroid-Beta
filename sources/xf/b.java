package xf;

import android.view.View;
import c8.xd;
import java.util.ArrayList;
import ri.h;
public final class b implements View.OnAttachStateChangeListener {
    @Override
    public final void onViewAttachedToWindow(View view) {
        a a10;
        c cVar = (c) view.getTag(2131296697);
        if (cVar != null && (a10 = xd.a(view, cVar)) != null) {
            ArrayList arrayList = cVar.f60460a;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((xe.b) a10.f60459a.f12614b).add((h) obj);
            }
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        a aVar;
        c cVar = (c) view.getTag(2131296697);
        if (cVar != null && (aVar = cVar.f60461b) != null) {
            ArrayList arrayList = cVar.f60460a;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((xe.b) aVar.f60459a.f12614b).remove((h) obj);
            }
            cVar.f60461b = null;
        }
    }
}
