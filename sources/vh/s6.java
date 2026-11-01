package vh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class s6 extends AnimatorListenerAdapter {
    public final int f51944a;
    public final ArrayList f51945b;
    public final qg.g f51946c;

    public s6(qg.g gVar, ArrayList arrayList, int i10) {
        this.f51944a = i10;
        this.f51946c = gVar;
        this.f51945b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51944a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f51945b;
                    int size = arrayList.size();
                    qg.g gVar = this.f51946c;
                    if (i10 < size) {
                        gVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        gVar.getClass();
                        t6 t6Var = (t6) gVar.f45552n;
                        gVar.h.clear();
                        gVar.f45549b = null;
                        gVar.f45550c = false;
                        t6Var.f51988b.setAllowDrawCursor(true);
                        i6 i6Var = t6Var.h;
                        if (i6Var != null) {
                            i6Var.run();
                        }
                        if (t6Var.L) {
                            t6Var.fullScroll(130);
                            t6Var.L = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f51945b;
                    int size2 = arrayList2.size();
                    qg.g gVar2 = this.f51946c;
                    if (i11 < size2) {
                        gVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = gVar2.h;
                        t6 t6Var2 = (t6) gVar2.f45552n;
                        arrayList3.clear();
                        gVar2.f45549b = null;
                        gVar2.f45550c = false;
                        t6Var2.f51988b.setAllowDrawCursor(true);
                        i6 i6Var2 = t6Var2.h;
                        if (i6Var2 != null) {
                            i6Var2.run();
                        }
                        if (t6Var2.L) {
                            t6Var2.fullScroll(130);
                            t6Var2.L = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
