package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class f extends AnimatorListenerAdapter {
    public final int f45545a;
    public final ArrayList f45546b;
    public final g f45547c;

    public f(g gVar, ArrayList arrayList, int i10) {
        this.f45545a = i10;
        this.f45547c = gVar;
        this.f45546b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45545a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f45546b;
                    int size = arrayList.size();
                    g gVar = this.f45547c;
                    if (i10 < size) {
                        gVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        gVar.getClass();
                        gVar.h.clear();
                        gVar.f45549b = null;
                        gVar.f45550c = false;
                        ((h) gVar.f45552n).f45554b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f45546b;
                    int size2 = arrayList2.size();
                    g gVar2 = this.f45547c;
                    if (i11 < size2) {
                        gVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        gVar2.h.clear();
                        gVar2.f45549b = null;
                        gVar2.f45550c = false;
                        ((h) gVar2.f45552n).f45554b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
