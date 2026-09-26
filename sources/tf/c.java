package tf;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
public final class c implements View.OnAttachStateChangeListener {
    @Override
    public final void onViewAttachedToWindow(View view) {
        b a2;
        d dVar = (d) view.getTag(R.id.tag_view_on_post_draw_state);
        if (dVar != null && (a2 = e.a(view, dVar)) != null) {
            ArrayList arrayList = dVar.f43343a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((pe.b) a2.f43342a.f1293b).add((li.a) obj);
            }
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        b bVar;
        d dVar = (d) view.getTag(R.id.tag_view_on_post_draw_state);
        if (dVar != null && (bVar = dVar.f43344b) != null) {
            ArrayList arrayList = dVar.f43343a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((pe.b) bVar.f43342a.f1293b).remove((li.a) obj);
            }
            dVar.f43344b = null;
        }
    }
}
