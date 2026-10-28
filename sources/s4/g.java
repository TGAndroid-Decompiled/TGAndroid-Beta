package s4;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class g implements Runnable {
    public final int f47793a;
    public final ArrayList f47794b;
    public final l f47795c;

    public g(l lVar, ArrayList arrayList, int i10) {
        this.f47793a = i10;
        this.f47795c = lVar;
        this.f47794b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f47793a) {
            case 0:
                ArrayList arrayList = this.f47794b;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    l lVar = this.f47795c;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        k kVar = (k) obj;
                        lVar.C(kVar.f47816a, kVar);
                        lVar.f47829w.add(kVar);
                    } else {
                        arrayList.clear();
                        lVar.f47828u.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f47794b;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    l lVar2 = this.f47795c;
                    if (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        j jVar = (j) obj2;
                        lVar2.B(jVar);
                        lVar2.f47830x.add(jVar);
                    } else {
                        arrayList2.clear();
                        lVar2.v.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList3 = this.f47794b;
                int i12 = Integer.MAX_VALUE;
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    i12 = Math.min(i12, ((e1) arrayList3.get(size3)).b());
                }
                int size4 = arrayList3.size();
                while (true) {
                    size4--;
                    l lVar3 = this.f47795c;
                    if (size4 >= 0) {
                        e1 e1Var = (e1) arrayList3.get(size4);
                        long b10 = (e1Var.b() - i12) * lVar3.D;
                        View view = e1Var.f47773a;
                        ViewPropertyAnimator animate = view.animate();
                        lVar3.f47831y.add(e1Var);
                        animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(lVar3.h()).setStartDelay(b10).setInterpolator(lVar3.h);
                        animate.setUpdateListener(new e(lVar3, e1Var, 1));
                        animate.setListener(new h(lVar3, e1Var, view, animate)).start();
                    } else {
                        arrayList3.clear();
                        lVar3.f47827t.remove(arrayList3);
                        return;
                    }
                }
        }
    }
}
