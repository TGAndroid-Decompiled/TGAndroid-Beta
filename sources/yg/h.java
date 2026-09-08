package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import di.ea;
import java.util.ArrayList;
public final class h extends AnimatorListenerAdapter {
    public final int f50205a;
    public final ArrayList f50206b;
    public final ea f50207c;

    public h(ea eaVar, ArrayList arrayList, int i10) {
        this.f50205a = i10;
        this.f50207c = eaVar;
        this.f50206b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50205a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f50206b;
                    int size = arrayList.size();
                    ea eaVar = this.f50207c;
                    if (i10 < size) {
                        eaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        eaVar.getClass();
                        eaVar.h.clear();
                        eaVar.f7203b = null;
                        eaVar.f7204c = false;
                        ((i) eaVar.f7207n).f50209b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f50206b;
                    int size2 = arrayList2.size();
                    ea eaVar2 = this.f50207c;
                    if (i11 < size2) {
                        eaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        eaVar2.h.clear();
                        eaVar2.f7203b = null;
                        eaVar2.f7204c = false;
                        ((i) eaVar2.f7207n).f50209b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
