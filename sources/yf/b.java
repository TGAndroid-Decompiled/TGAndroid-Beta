package yf;

import android.view.View;
import java.util.ArrayList;
import pi.h;
import x7.p6;
public final class b implements View.OnAttachStateChangeListener {
    @Override
    public final void onViewAttachedToWindow(View view) {
        a a10;
        c cVar = (c) view.getTag(2131296697);
        if (cVar != null && (a10 = p6.a(view, cVar)) != null) {
            ArrayList arrayList = cVar.f59419a;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((ue.b) a10.f59418a.f10221b).add((h) obj);
            }
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        a aVar;
        c cVar = (c) view.getTag(2131296697);
        if (cVar != null && (aVar = cVar.f59420b) != null) {
            ArrayList arrayList = cVar.f59419a;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((ue.b) aVar.f59418a.f10221b).remove((h) obj);
            }
            cVar.f59420b = null;
        }
    }
}
