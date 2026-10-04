package xg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ci.aa;
import java.util.ArrayList;
public final class h extends AnimatorListenerAdapter {
    public final int f49847a;
    public final ArrayList f49848b;
    public final aa f49849c;

    public h(aa aaVar, ArrayList arrayList, int i10) {
        this.f49847a = i10;
        this.f49849c = aaVar;
        this.f49848b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49847a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f49848b;
                    int size = arrayList.size();
                    aa aaVar = this.f49849c;
                    if (i10 < size) {
                        aaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        aaVar.getClass();
                        aaVar.h.clear();
                        aaVar.f4709b = null;
                        aaVar.f4710c = false;
                        ((i) aaVar.f4713n).f49851b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f49848b;
                    int size2 = arrayList2.size();
                    aa aaVar2 = this.f49849c;
                    if (i11 < size2) {
                        aaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        aaVar2.h.clear();
                        aaVar2.f4709b = null;
                        aaVar2.f4710c = false;
                        ((i) aaVar2.f4713n).f49851b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
