package xg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ci.ea;
import java.util.ArrayList;
public final class h extends AnimatorListenerAdapter {
    public final int f45792a;
    public final ArrayList f45793b;
    public final ea f45794c;

    public h(ea eaVar, ArrayList arrayList, int i10) {
        this.f45792a = i10;
        this.f45794c = eaVar;
        this.f45793b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45792a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f45793b;
                    int size = arrayList.size();
                    ea eaVar = this.f45794c;
                    if (i10 < size) {
                        eaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        eaVar.getClass();
                        eaVar.h.clear();
                        eaVar.f4608b = null;
                        eaVar.f4609c = false;
                        ((i) eaVar.f4611n).f45796b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f45793b;
                    int size2 = arrayList2.size();
                    ea eaVar2 = this.f45794c;
                    if (i11 < size2) {
                        eaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        eaVar2.h.clear();
                        eaVar2.f4608b = null;
                        eaVar2.f4609c = false;
                        ((i) eaVar2.f4611n).f45796b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
