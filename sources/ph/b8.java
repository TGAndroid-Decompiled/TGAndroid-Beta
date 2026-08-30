package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class b8 extends AnimatorListenerAdapter {
    public final int f41299a;
    public final ArrayList f41300b;
    public final kg.j f41301c;

    public b8(kg.j jVar, ArrayList arrayList, int i10) {
        this.f41299a = i10;
        this.f41301c = jVar;
        this.f41300b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41299a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f41300b;
                    int size = arrayList.size();
                    kg.j jVar = this.f41301c;
                    if (i10 < size) {
                        jVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        jVar.getClass();
                        c8 c8Var = (c8) jVar.f10434n;
                        jVar.h.clear();
                        jVar.f10431b = null;
                        jVar.f10432c = false;
                        c8Var.f41381a.setAllowDrawCursor(true);
                        r7 r7Var = c8Var.f41384f;
                        if (r7Var != null) {
                            r7Var.run();
                        }
                        if (c8Var.H) {
                            c8Var.fullScroll(130);
                            c8Var.H = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f41300b;
                    int size2 = arrayList2.size();
                    kg.j jVar2 = this.f41301c;
                    if (i11 < size2) {
                        jVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = jVar2.h;
                        c8 c8Var2 = (c8) jVar2.f10434n;
                        arrayList3.clear();
                        jVar2.f10431b = null;
                        jVar2.f10432c = false;
                        c8Var2.f41381a.setAllowDrawCursor(true);
                        r7 r7Var2 = c8Var2.f41384f;
                        if (r7Var2 != null) {
                            r7Var2.run();
                        }
                        if (c8Var2.H) {
                            c8Var2.fullScroll(130);
                            c8Var2.H = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
