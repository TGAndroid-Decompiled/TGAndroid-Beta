package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import fi.j9;
import java.util.ArrayList;
public final class h extends AnimatorListenerAdapter {
    public final int f52873a;
    public final ArrayList f52874b;
    public final j9 f52875c;

    public h(j9 j9Var, ArrayList arrayList, int i10) {
        this.f52873a = i10;
        this.f52875c = j9Var;
        this.f52874b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52873a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f52874b;
                    int size = arrayList.size();
                    j9 j9Var = this.f52875c;
                    if (i10 < size) {
                        j9Var.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        j9Var.getClass();
                        j9Var.h.clear();
                        j9Var.f11066b = null;
                        j9Var.f11067c = false;
                        ((i) j9Var.f11069n).f52877b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f52874b;
                    int size2 = arrayList2.size();
                    j9 j9Var2 = this.f52875c;
                    if (i11 < size2) {
                        j9Var2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        j9Var2.h.clear();
                        j9Var2.f11066b = null;
                        j9Var2.f11067c = false;
                        ((i) j9Var2.f11069n).f52877b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
