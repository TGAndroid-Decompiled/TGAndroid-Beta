package xg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ci.ba;
import java.util.ArrayList;
public final class h extends AnimatorListenerAdapter {
    public final int f45719a;
    public final ArrayList f45720b;
    public final ba f45721c;

    public h(ba baVar, ArrayList arrayList, int i10) {
        this.f45719a = i10;
        this.f45721c = baVar;
        this.f45720b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45719a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f45720b;
                    int size = arrayList.size();
                    ba baVar = this.f45721c;
                    if (i10 < size) {
                        baVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        baVar.getClass();
                        baVar.h.clear();
                        baVar.f4417b = null;
                        baVar.f4418c = false;
                        ((i) baVar.f4420n).f45723b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f45720b;
                    int size2 = arrayList2.size();
                    ba baVar2 = this.f45721c;
                    if (i11 < size2) {
                        baVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        baVar2.h.clear();
                        baVar2.f4417b = null;
                        baVar2.f4418c = false;
                        ((i) baVar2.f4420n).f45723b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
