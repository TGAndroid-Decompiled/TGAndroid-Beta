package r0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class i0 {
    public static final ArrayList d = new ArrayList();
    public WeakHashMap f46824a;
    public SparseArray f46825b;
    public WeakReference f46826c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f46824a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a2 = a(viewGroup.getChildAt(childCount));
                    if (a2 != null) {
                        return a2;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(2131296695);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
            return null;
        }
        return null;
    }
}
