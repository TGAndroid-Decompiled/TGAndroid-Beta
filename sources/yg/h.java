package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import di.aa;
import java.util.ArrayList;
public final class h extends AnimatorListenerAdapter {
    public final int f48763a;
    public final ArrayList f48764b;
    public final aa f48765c;

    public h(aa aaVar, ArrayList arrayList, int i10) {
        this.f48763a = i10;
        this.f48765c = aaVar;
        this.f48764b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48763a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f48764b;
                    int size = arrayList.size();
                    aa aaVar = this.f48765c;
                    if (i10 < size) {
                        aaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        aaVar.getClass();
                        aaVar.h.clear();
                        aaVar.f6636b = null;
                        aaVar.f6637c = false;
                        ((i) aaVar.f6639n).f48767b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f48764b;
                    int size2 = arrayList2.size();
                    aa aaVar2 = this.f48765c;
                    if (i11 < size2) {
                        aaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        aaVar2.h.clear();
                        aaVar2.f6636b = null;
                        aaVar2.f6637c = false;
                        ((i) aaVar2.f6639n).f48767b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
