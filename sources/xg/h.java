package xg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ci.ea;
import java.util.ArrayList;
public final class h extends AnimatorListenerAdapter {
    public final int f46020a;
    public final ArrayList f46021b;
    public final ea f46022c;

    public h(ea eaVar, ArrayList arrayList, int i10) {
        this.f46020a = i10;
        this.f46022c = eaVar;
        this.f46021b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46020a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f46021b;
                    int size = arrayList.size();
                    ea eaVar = this.f46022c;
                    if (i10 < size) {
                        eaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        eaVar.getClass();
                        eaVar.h.clear();
                        eaVar.f4608b = null;
                        eaVar.f4609c = false;
                        ((i) eaVar.f4611n).f46024b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f46021b;
                    int size2 = arrayList2.size();
                    ea eaVar2 = this.f46022c;
                    if (i11 < size2) {
                        eaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        eaVar2.h.clear();
                        eaVar2.f4608b = null;
                        eaVar2.f4609c = false;
                        ((i) eaVar2.f4611n).f46024b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
