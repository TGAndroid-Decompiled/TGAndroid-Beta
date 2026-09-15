package xg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ci.ea;
import java.util.ArrayList;
public final class h extends AnimatorListenerAdapter {
    public final int f45769a;
    public final ArrayList f45770b;
    public final ea f45771c;

    public h(ea eaVar, ArrayList arrayList, int i10) {
        this.f45769a = i10;
        this.f45771c = eaVar;
        this.f45770b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45769a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f45770b;
                    int size = arrayList.size();
                    ea eaVar = this.f45771c;
                    if (i10 < size) {
                        eaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        eaVar.getClass();
                        eaVar.h.clear();
                        eaVar.f4603b = null;
                        eaVar.f4604c = false;
                        ((i) eaVar.f4606n).f45773b.setAllowDrawCursor(true);
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f45770b;
                    int size2 = arrayList2.size();
                    ea eaVar2 = this.f45771c;
                    if (i11 < size2) {
                        eaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        eaVar2.h.clear();
                        eaVar2.f4603b = null;
                        eaVar2.f4604c = false;
                        ((i) eaVar2.f4606n).f45773b.setAllowDrawCursor(true);
                        return;
                    }
                }
        }
    }
}
