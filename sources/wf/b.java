package wf;

import android.view.View;
import java.util.ArrayList;
import oi.h;
import org.telegram.messenger.R;
public final class b implements View.OnAttachStateChangeListener {
    @Override
    public final void onViewAttachedToWindow(View view) {
        a a2;
        c cVar = (c) view.getTag(R.id.tag_view_on_post_draw_state);
        if (cVar != null && (a2 = d.a(view, cVar)) != null) {
            ArrayList arrayList = cVar.f51218a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((se.b) a2.f51217a.f8617b).add((h) obj);
            }
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        a aVar;
        c cVar = (c) view.getTag(R.id.tag_view_on_post_draw_state);
        if (cVar != null && (aVar = cVar.f51219b) != null) {
            ArrayList arrayList = cVar.f51218a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((se.b) aVar.f51217a.f8617b).remove((h) obj);
            }
            cVar.f51219b = null;
        }
    }
}
