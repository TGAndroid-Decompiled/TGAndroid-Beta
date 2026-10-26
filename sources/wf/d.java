package wf;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import di.h3;
import org.telegram.messenger.R;
public abstract class d {
    public static a a(View view, c cVar) {
        a aVar = cVar.f51161b;
        if (aVar != null) {
            return aVar;
        }
        View rootView = view.getRootView();
        if (view != rootView) {
            if (!(rootView instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) rootView;
            a aVar2 = (a) viewGroup.getTag(R.id.tag_view_on_post_draw_root_state);
            if (aVar2 == null) {
                h3 h3Var = new h3(viewGroup.getContext());
                a aVar3 = new a(h3Var);
                viewGroup.setTag(R.id.tag_view_on_post_draw_root_state, aVar3);
                if (viewGroup instanceof FrameLayout) {
                    viewGroup.addView(h3Var, new FrameLayout.LayoutParams(1, 1, 17));
                } else {
                    viewGroup.addView(h3Var, new ViewGroup.LayoutParams(1, 1));
                }
                aVar2 = aVar3;
            }
            cVar.f51161b = aVar2;
            return aVar2;
        }
        throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
    }
}
