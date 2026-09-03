package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class y7 extends AnimatorListenerAdapter {
    public final int f46374a;
    public final ArrayList f46375b;
    public final lg.j f46376c;

    public y7(lg.j jVar, ArrayList arrayList, int i10) {
        this.f46374a = i10;
        this.f46376c = jVar;
        this.f46375b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46374a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f46375b;
                    int size = arrayList.size();
                    lg.j jVar = this.f46376c;
                    if (i10 < size) {
                        jVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        jVar.getClass();
                        z7 z7Var = (z7) jVar.f12559n;
                        jVar.h.clear();
                        jVar.f12555b = null;
                        jVar.f12556c = false;
                        z7Var.f46412a.setAllowDrawCursor(true);
                        o7 o7Var = z7Var.f46416f;
                        if (o7Var != null) {
                            o7Var.run();
                        }
                        if (z7Var.H) {
                            z7Var.fullScroll(130);
                            z7Var.H = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f46375b;
                    int size2 = arrayList2.size();
                    lg.j jVar2 = this.f46376c;
                    if (i11 < size2) {
                        jVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = jVar2.h;
                        z7 z7Var2 = (z7) jVar2.f12559n;
                        arrayList3.clear();
                        jVar2.f12555b = null;
                        jVar2.f12556c = false;
                        z7Var2.f46412a.setAllowDrawCursor(true);
                        o7 o7Var2 = z7Var2.f46416f;
                        if (o7Var2 != null) {
                            o7Var2.run();
                        }
                        if (z7Var2.H) {
                            z7Var2.fullScroll(130);
                            z7Var2.H = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
