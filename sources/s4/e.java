package s4;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class e implements Runnable {
    public final int f47766a;
    public final ArrayList f47767b;
    public final j f47768c;

    public e(j jVar, ArrayList arrayList, int i10) {
        this.f47766a = i10;
        this.f47768c = jVar;
        this.f47767b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f47766a) {
            case 0:
                ArrayList arrayList = this.f47767b;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    j jVar = this.f47768c;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        i iVar = (i) obj;
                        jVar.C(iVar.f47798a, iVar);
                        jVar.f47815w.add(iVar);
                    } else {
                        arrayList.clear();
                        jVar.f47814u.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f47767b;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    j jVar2 = this.f47768c;
                    if (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        h hVar = (h) obj2;
                        jVar2.B(hVar);
                        jVar2.f47816x.add(hVar);
                    } else {
                        arrayList2.clear();
                        jVar2.v.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList3 = this.f47767b;
                int i12 = Integer.MAX_VALUE;
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    i12 = Math.min(i12, ((d1) arrayList3.get(size3)).b());
                }
                int size4 = arrayList3.size();
                while (true) {
                    size4--;
                    j jVar3 = this.f47768c;
                    if (size4 >= 0) {
                        d1 d1Var = (d1) arrayList3.get(size4);
                        long b10 = (d1Var.b() - i12) * jVar3.D;
                        View view = d1Var.f47748a;
                        ViewPropertyAnimator animate = view.animate();
                        jVar3.f47817y.add(d1Var);
                        animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(jVar3.h()).setStartDelay(b10).setInterpolator(jVar3.h);
                        animate.setUpdateListener(new c(jVar3, d1Var, 1));
                        animate.setListener(new f(jVar3, d1Var, view, animate)).start();
                    } else {
                        arrayList3.clear();
                        jVar3.f47813t.remove(arrayList3);
                        return;
                    }
                }
        }
    }
}
