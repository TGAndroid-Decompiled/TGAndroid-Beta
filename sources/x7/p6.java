package x7;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class p6 {
    public static yf.a a(View view, yf.c cVar) {
        yf.a aVar = cVar.f59420b;
        if (aVar != null) {
            return aVar;
        }
        View rootView = view.getRootView();
        if (view != rootView) {
            if (!(rootView instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) rootView;
            yf.a aVar2 = (yf.a) viewGroup.getTag(2131296696);
            if (aVar2 == null) {
                ei.e3 e3Var = new ei.e3(viewGroup.getContext(), 8);
                yf.a aVar3 = new yf.a(e3Var);
                viewGroup.setTag(2131296696, aVar3);
                if (viewGroup instanceof FrameLayout) {
                    viewGroup.addView(e3Var, new FrameLayout.LayoutParams(1, 1, 17));
                } else {
                    viewGroup.addView(e3Var, new ViewGroup.LayoutParams(1, 1));
                }
                aVar2 = aVar3;
            }
            cVar.f59420b = aVar2;
            return aVar2;
        }
        throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
    }
}
