package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class a8 extends AnimatorListenerAdapter {
    public final int f41307a;
    public final ArrayList f41308b;
    public final kg.j f41309c;

    public a8(kg.j jVar, ArrayList arrayList, int i10) {
        this.f41307a = i10;
        this.f41309c = jVar;
        this.f41308b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41307a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f41308b;
                    int size = arrayList.size();
                    kg.j jVar = this.f41309c;
                    if (i10 < size) {
                        jVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        jVar.getClass();
                        b8 b8Var = (b8) jVar.f10544n;
                        jVar.h.clear();
                        jVar.f10541b = null;
                        jVar.f10542c = false;
                        b8Var.f41332a.setAllowDrawCursor(true);
                        q7 q7Var = b8Var.f41335f;
                        if (q7Var != null) {
                            q7Var.run();
                        }
                        if (b8Var.H) {
                            b8Var.fullScroll(130);
                            b8Var.H = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f41308b;
                    int size2 = arrayList2.size();
                    kg.j jVar2 = this.f41309c;
                    if (i11 < size2) {
                        jVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = jVar2.h;
                        b8 b8Var2 = (b8) jVar2.f10544n;
                        arrayList3.clear();
                        jVar2.f10541b = null;
                        jVar2.f10542c = false;
                        b8Var2.f41332a.setAllowDrawCursor(true);
                        q7 q7Var2 = b8Var2.f41335f;
                        if (q7Var2 != null) {
                            q7Var2.run();
                        }
                        if (b8Var2.H) {
                            b8Var2.fullScroll(130);
                            b8Var2.H = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
