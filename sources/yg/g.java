package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ei.n9;
import java.util.ArrayList;
public final class g extends AnimatorListenerAdapter {
    public final int f50144a;
    public final ArrayList f50145b;
    public final n9 f50146c;

    public g(n9 n9Var, ArrayList arrayList, int i10) {
        this.f50144a = i10;
        this.f50146c = n9Var;
        this.f50145b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50144a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f50145b;
                    int size = arrayList.size();
                    n9 n9Var = this.f50146c;
                    if (i10 < size) {
                        n9Var.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        n9Var.getClass();
                        n9Var.h.clear();
                        n9Var.f9525b = null;
                        n9Var.f9526c = false;
                        ((h) n9Var.f9528n).f50148b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f50145b;
                    int size2 = arrayList2.size();
                    n9 n9Var2 = this.f50146c;
                    if (i11 < size2) {
                        n9Var2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        n9Var2.h.clear();
                        n9Var2.f9525b = null;
                        n9Var2.f9526c = false;
                        ((h) n9Var2.f9528n).f50148b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
