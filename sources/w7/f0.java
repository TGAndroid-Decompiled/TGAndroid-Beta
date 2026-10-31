package w7;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class f0 {
    public static nf.b a(View view, nf.d dVar) {
        nf.b bVar = dVar.f13752b;
        if (bVar != null) {
            return bVar;
        }
        View rootView = view.getRootView();
        if (view != rootView) {
            if (!(rootView instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) rootView;
            nf.b bVar2 = (nf.b) viewGroup.getTag(2131296696);
            if (bVar2 == null) {
                ih.c cVar = new ih.c(viewGroup.getContext(), 1);
                nf.b bVar3 = new nf.b(cVar);
                viewGroup.setTag(2131296696, bVar3);
                if (viewGroup instanceof FrameLayout) {
                    viewGroup.addView(cVar, new FrameLayout.LayoutParams(1, 1, 17));
                } else {
                    viewGroup.addView(cVar, new ViewGroup.LayoutParams(1, 1));
                }
                bVar2 = bVar3;
            }
            dVar.f13752b = bVar2;
            return bVar2;
        }
        throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
    }
}
