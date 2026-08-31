package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class z7 extends AnimatorListenerAdapter {
    public final int f46392a;
    public final ArrayList f46393b;
    public final lg.j f46394c;

    public z7(lg.j jVar, ArrayList arrayList, int i10) {
        this.f46392a = i10;
        this.f46394c = jVar;
        this.f46393b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46392a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f46393b;
                    int size = arrayList.size();
                    lg.j jVar = this.f46394c;
                    if (i10 < size) {
                        jVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        jVar.getClass();
                        a8 a8Var = (a8) jVar.f12557n;
                        jVar.h.clear();
                        jVar.f12553b = null;
                        jVar.f12554c = false;
                        a8Var.f44917a.setAllowDrawCursor(true);
                        p7 p7Var = a8Var.f44921f;
                        if (p7Var != null) {
                            p7Var.run();
                        }
                        if (a8Var.H) {
                            a8Var.fullScroll(130);
                            a8Var.H = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f46393b;
                    int size2 = arrayList2.size();
                    lg.j jVar2 = this.f46394c;
                    if (i11 < size2) {
                        jVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = jVar2.h;
                        a8 a8Var2 = (a8) jVar2.f12557n;
                        arrayList3.clear();
                        jVar2.f12553b = null;
                        jVar2.f12554c = false;
                        a8Var2.f44917a.setAllowDrawCursor(true);
                        p7 p7Var2 = a8Var2.f44921f;
                        if (p7Var2 != null) {
                            p7Var2.run();
                        }
                        if (a8Var2.H) {
                            a8Var2.fullScroll(130);
                            a8Var2.H = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
