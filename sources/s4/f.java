package s4;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class f implements Runnable {
    public final int f45957a;
    public final ArrayList f45958b;
    public final k f45959c;

    public f(k kVar, ArrayList arrayList, int i10) {
        this.f45957a = i10;
        this.f45959c = kVar;
        this.f45958b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f45957a) {
            case 0:
                ArrayList arrayList = this.f45958b;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    k kVar = this.f45959c;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        j jVar = (j) obj;
                        kVar.C(jVar.f45981a, jVar);
                        kVar.f45991w.add(jVar);
                    } else {
                        arrayList.clear();
                        kVar.f45990u.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f45958b;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    k kVar2 = this.f45959c;
                    if (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        i iVar = (i) obj2;
                        kVar2.B(iVar);
                        kVar2.f45992x.add(iVar);
                    } else {
                        arrayList2.clear();
                        kVar2.v.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList3 = this.f45958b;
                int i12 = Integer.MAX_VALUE;
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    i12 = Math.min(i12, ((b1) arrayList3.get(size3)).b());
                }
                int size4 = arrayList3.size();
                while (true) {
                    size4--;
                    k kVar3 = this.f45959c;
                    if (size4 >= 0) {
                        b1 b1Var = (b1) arrayList3.get(size4);
                        long b10 = (b1Var.b() - i12) * kVar3.D;
                        View view = b1Var.f45921a;
                        ViewPropertyAnimator animate = view.animate();
                        kVar3.f45993y.add(b1Var);
                        animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(kVar3.h()).setStartDelay(b10).setInterpolator(kVar3.h);
                        animate.setUpdateListener(new d(kVar3, b1Var, 1));
                        animate.setListener(new g(kVar3, b1Var, view, animate)).start();
                    } else {
                        arrayList3.clear();
                        kVar3.f45989t.remove(arrayList3);
                        return;
                    }
                }
        }
    }
}
