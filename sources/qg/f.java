package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class f extends AnimatorListenerAdapter {
    public final int f45534a;
    public final ArrayList f45535b;
    public final g f45536c;

    public f(g gVar, ArrayList arrayList, int i10) {
        this.f45534a = i10;
        this.f45536c = gVar;
        this.f45535b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45534a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f45535b;
                    int size = arrayList.size();
                    g gVar = this.f45536c;
                    if (i10 < size) {
                        gVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        gVar.getClass();
                        gVar.h.clear();
                        gVar.f45538b = null;
                        gVar.f45539c = false;
                        ((h) gVar.f45541n).f45543b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f45535b;
                    int size2 = arrayList2.size();
                    g gVar2 = this.f45536c;
                    if (i11 < size2) {
                        gVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        gVar2.h.clear();
                        gVar2.f45538b = null;
                        gVar2.f45539c = false;
                        ((h) gVar2.f45541n).f45543b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
