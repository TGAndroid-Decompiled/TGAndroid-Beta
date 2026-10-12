package xg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ci.ba;
import java.util.ArrayList;
public final class h extends AnimatorListenerAdapter {
    public final int f51376a;
    public final ArrayList f51377b;
    public final ba f51378c;

    public h(ba baVar, ArrayList arrayList, int i10) {
        this.f51376a = i10;
        this.f51378c = baVar;
        this.f51377b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51376a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f51377b;
                    int size = arrayList.size();
                    ba baVar = this.f51378c;
                    if (i10 < size) {
                        baVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        baVar.getClass();
                        baVar.h.clear();
                        baVar.f4795b = null;
                        baVar.f4796c = false;
                        ((i) baVar.f4799n).f51380b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f51377b;
                    int size2 = arrayList2.size();
                    ba baVar2 = this.f51378c;
                    if (i11 < size2) {
                        baVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        baVar2.h.clear();
                        baVar2.f4795b = null;
                        baVar2.f4796c = false;
                        ((i) baVar2.f4799n).f51380b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
