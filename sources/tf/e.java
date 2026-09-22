package tf;

import ai.n4;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
public abstract class e {
    public static b a(View view, d dVar) {
        b bVar = dVar.f43054b;
        if (bVar != null) {
            return bVar;
        }
        View rootView = view.getRootView();
        if (view != rootView) {
            if (!(rootView instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) rootView;
            b bVar2 = (b) viewGroup.getTag(R.id.tag_view_on_post_draw_root_state);
            if (bVar2 == null) {
                n4 n4Var = new n4(viewGroup.getContext());
                b bVar3 = new b(n4Var);
                viewGroup.setTag(R.id.tag_view_on_post_draw_root_state, bVar3);
                if (viewGroup instanceof FrameLayout) {
                    viewGroup.addView(n4Var, new FrameLayout.LayoutParams(1, 1, 17));
                } else {
                    viewGroup.addView(n4Var, new ViewGroup.LayoutParams(1, 1));
                }
                bVar2 = bVar3;
            }
            dVar.f43054b = bVar2;
            return bVar2;
        }
        throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
    }
}
