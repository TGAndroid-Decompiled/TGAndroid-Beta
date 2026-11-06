package r0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class h0 {
    public static final ArrayList d = new ArrayList();
    public WeakHashMap f54092a;
    public SparseArray f54093b;
    public WeakReference f54094c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f54092a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a10 = a(viewGroup.getChildAt(childCount));
                    if (a10 != null) {
                        return a10;
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
