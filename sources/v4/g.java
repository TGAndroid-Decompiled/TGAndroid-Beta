package v4;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class g implements Runnable {
    public final int f59263a;
    public final ArrayList f59264b;
    public final l f59265c;

    public g(l lVar, ArrayList arrayList, int i7) {
        this.f59263a = i7;
        this.f59265c = lVar;
        this.f59264b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f59263a) {
            case 0:
                ArrayList arrayList = this.f59264b;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    l lVar = this.f59265c;
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        k kVar = (k) obj;
                        lVar.C(kVar.f59292a, kVar);
                        lVar.f59303w.add(kVar);
                    } else {
                        arrayList.clear();
                        lVar.f59302u.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f59264b;
                int size2 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    l lVar2 = this.f59265c;
                    if (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        j jVar = (j) obj2;
                        lVar2.B(jVar);
                        lVar2.f59304x.add(jVar);
                    } else {
                        arrayList2.clear();
                        lVar2.v.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList3 = this.f59264b;
                int i11 = Integer.MAX_VALUE;
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    i11 = Math.min(i11, ((f1) arrayList3.get(size3)).b());
                }
                int size4 = arrayList3.size();
                while (true) {
                    size4--;
                    l lVar3 = this.f59265c;
                    if (size4 >= 0) {
                        f1 f1Var = (f1) arrayList3.get(size4);
                        long b10 = (f1Var.b() - i11) * lVar3.D;
                        View view = f1Var.f59245a;
                        ViewPropertyAnimator animate = view.animate();
                        lVar3.f59305y.add(f1Var);
                        animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(lVar3.h()).setStartDelay(b10).setInterpolator(lVar3.h);
                        animate.setUpdateListener(new d(lVar3, f1Var, 1));
                        animate.setListener(new h(lVar3, f1Var, view, animate)).start();
                    } else {
                        arrayList3.clear();
                        lVar3.f59301t.remove(arrayList3);
                        return;
                    }
                }
        }
    }
}
