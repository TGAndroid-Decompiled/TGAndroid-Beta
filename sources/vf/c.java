package vf;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
public final class c implements View.OnAttachStateChangeListener {
    @Override
    public final void onViewAttachedToWindow(View view) {
        b a2;
        d dVar = (d) view.getTag(R.id.tag_view_on_post_draw_state);
        if (dVar != null && (a2 = e.a(view, dVar)) != null) {
            ArrayList arrayList = dVar.f48383a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((re.b) a2.f48382a.f5488b).add((ni.a) obj);
            }
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        b bVar;
        d dVar = (d) view.getTag(R.id.tag_view_on_post_draw_state);
        if (dVar != null && (bVar = dVar.f48384b) != null) {
            ArrayList arrayList = dVar.f48383a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((re.b) bVar.f48382a.f5488b).remove((ni.a) obj);
            }
            dVar.f48384b = null;
        }
    }
}
