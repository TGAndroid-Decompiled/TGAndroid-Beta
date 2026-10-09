package uf;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
public final class c implements View.OnAttachStateChangeListener {
    @Override
    public final void onViewAttachedToWindow(View view) {
        b a2;
        d dVar = (d) view.getTag(R.id.tag_view_on_post_draw_state);
        if (dVar != null && (a2 = e.a(view, dVar)) != null) {
            ArrayList arrayList = dVar.f48899a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((qe.b) a2.f48898a.f1526b).add((li.a) obj);
            }
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        b bVar;
        d dVar = (d) view.getTag(R.id.tag_view_on_post_draw_state);
        if (dVar != null && (bVar = dVar.f48900b) != null) {
            ArrayList arrayList = dVar.f48899a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((qe.b) bVar.f48898a.f1526b).remove((li.a) obj);
            }
            dVar.f48900b = null;
        }
    }
}
