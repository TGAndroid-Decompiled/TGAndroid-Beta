package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import bi.nb;
import java.util.ArrayList;
public final class g extends AnimatorListenerAdapter {
    public final int f43995a;
    public final ArrayList f43996b;
    public final nb f43997c;

    public g(nb nbVar, ArrayList arrayList, int i10) {
        this.f43995a = i10;
        this.f43997c = nbVar;
        this.f43996b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43995a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f43996b;
                    int size = arrayList.size();
                    nb nbVar = this.f43997c;
                    if (i10 < size) {
                        nbVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        nbVar.getClass();
                        nbVar.h.clear();
                        nbVar.f3248b = null;
                        nbVar.f3249c = false;
                        ((h) nbVar.f3251n).f43999b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f43996b;
                    int size2 = arrayList2.size();
                    nb nbVar2 = this.f43997c;
                    if (i11 < size2) {
                        nbVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        nbVar2.h.clear();
                        nbVar2.f3248b = null;
                        nbVar2.f3249c = false;
                        ((h) nbVar2.f3251n).f43999b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
