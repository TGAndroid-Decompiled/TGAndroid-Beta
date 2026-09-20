package xg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ci.ea;
import java.util.ArrayList;
public final class h extends AnimatorListenerAdapter {
    public final int f46067a;
    public final ArrayList f46068b;
    public final ea f46069c;

    public h(ea eaVar, ArrayList arrayList, int i10) {
        this.f46067a = i10;
        this.f46069c = eaVar;
        this.f46068b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46067a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f46068b;
                    int size = arrayList.size();
                    ea eaVar = this.f46069c;
                    if (i10 < size) {
                        eaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        eaVar.getClass();
                        eaVar.h.clear();
                        eaVar.f4609b = null;
                        eaVar.f4610c = false;
                        ((i) eaVar.f4612n).f46071b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f46068b;
                    int size2 = arrayList2.size();
                    ea eaVar2 = this.f46069c;
                    if (i11 < size2) {
                        eaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        eaVar2.h.clear();
                        eaVar2.f4609b = null;
                        eaVar2.f4610c = false;
                        ((i) eaVar2.f4612n).f46071b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
