package xg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ci.aa;
import java.util.ArrayList;
public final class h extends AnimatorListenerAdapter {
    public final int f46093a;
    public final ArrayList f46094b;
    public final aa f46095c;

    public h(aa aaVar, ArrayList arrayList, int i10) {
        this.f46093a = i10;
        this.f46095c = aaVar;
        this.f46094b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46093a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f46094b;
                    int size = arrayList.size();
                    aa aaVar = this.f46095c;
                    if (i10 < size) {
                        aaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        aaVar.getClass();
                        aaVar.h.clear();
                        aaVar.f4357b = null;
                        aaVar.f4358c = false;
                        ((i) aaVar.f4360n).f46097b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f46094b;
                    int size2 = arrayList2.size();
                    aa aaVar2 = this.f46095c;
                    if (i11 < size2) {
                        aaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        aaVar2.h.clear();
                        aaVar2.f4357b = null;
                        aaVar2.f4358c = false;
                        ((i) aaVar2.f4360n).f46097b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
