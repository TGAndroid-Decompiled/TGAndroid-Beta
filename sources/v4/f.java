package v4;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class f implements Runnable {
    public final int f57065a;
    public final ArrayList f57066b;
    public final k f57067c;

    public f(k kVar, ArrayList arrayList, int i7) {
        this.f57065a = i7;
        this.f57067c = kVar;
        this.f57066b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f57065a) {
            case 0:
                ArrayList arrayList = this.f57066b;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    k kVar = this.f57067c;
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        j jVar = (j) obj;
                        kVar.C(jVar.f57092a, jVar);
                        kVar.f57106w.add(jVar);
                    } else {
                        arrayList.clear();
                        kVar.f57105u.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f57066b;
                int size2 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    k kVar2 = this.f57067c;
                    if (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        i iVar = (i) obj2;
                        kVar2.B(iVar);
                        kVar2.f57107x.add(iVar);
                    } else {
                        arrayList2.clear();
                        kVar2.v.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList3 = this.f57066b;
                int i11 = Integer.MAX_VALUE;
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    i11 = Math.min(i11, ((d1) arrayList3.get(size3)).b());
                }
                int size4 = arrayList3.size();
                while (true) {
                    size4--;
                    k kVar3 = this.f57067c;
                    if (size4 >= 0) {
                        d1 d1Var = (d1) arrayList3.get(size4);
                        long b10 = (d1Var.b() - i11) * kVar3.D;
                        View view = d1Var.f57043a;
                        ViewPropertyAnimator animate = view.animate();
                        kVar3.f57108y.add(d1Var);
                        animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(kVar3.h()).setStartDelay(b10).setInterpolator(kVar3.h);
                        animate.setUpdateListener(new c(kVar3, d1Var, 1));
                        animate.setListener(new g(kVar3, d1Var, view, animate)).start();
                    } else {
                        arrayList3.clear();
                        kVar3.f57104t.remove(arrayList3);
                        return;
                    }
                }
        }
    }
}
