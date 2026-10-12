package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import di.aa;
import java.util.ArrayList;
public final class h extends AnimatorListenerAdapter {
    public final int f48764a;
    public final ArrayList f48765b;
    public final aa f48766c;

    public h(aa aaVar, ArrayList arrayList, int i10) {
        this.f48764a = i10;
        this.f48766c = aaVar;
        this.f48765b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48764a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f48765b;
                    int size = arrayList.size();
                    aa aaVar = this.f48766c;
                    if (i10 < size) {
                        aaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        aaVar.getClass();
                        aaVar.h.clear();
                        aaVar.f6633b = null;
                        aaVar.f6634c = false;
                        ((i) aaVar.f6636n).f48768b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f48765b;
                    int size2 = arrayList2.size();
                    aa aaVar2 = this.f48766c;
                    if (i11 < size2) {
                        aaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        aaVar2.h.clear();
                        aaVar2.f6633b = null;
                        aaVar2.f6634c = false;
                        ((i) aaVar2.f6636n).f48768b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
