package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import di.ea;
import java.util.ArrayList;
public final class h extends AnimatorListenerAdapter {
    public final int f50176a;
    public final ArrayList f50177b;
    public final ea f50178c;

    public h(ea eaVar, ArrayList arrayList, int i10) {
        this.f50176a = i10;
        this.f50178c = eaVar;
        this.f50177b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50176a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f50177b;
                    int size = arrayList.size();
                    ea eaVar = this.f50178c;
                    if (i10 < size) {
                        eaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        eaVar.getClass();
                        eaVar.h.clear();
                        eaVar.f7175b = null;
                        eaVar.f7176c = false;
                        ((i) eaVar.f7179n).f50180b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f50177b;
                    int size2 = arrayList2.size();
                    ea eaVar2 = this.f50178c;
                    if (i11 < size2) {
                        eaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        eaVar2.h.clear();
                        eaVar2.f7175b = null;
                        eaVar2.f7176c = false;
                        ((i) eaVar2.f7179n).f50180b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
