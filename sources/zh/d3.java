package zh;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.s01;
import org.telegram.ui.vz0;
public final class d3 implements q7 {
    public final Object f48346a;

    public d3(Object obj) {
        this.f48346a = obj;
    }

    @Override
    public void H0(long j3, int i10, j2 j2Var) {
        int i11 = ProfileStoriesView.f30630s0;
        ((vz0) this.f48346a).f(true, false);
        j2Var.run();
    }

    @Override
    public boolean y0(long j3, int i10, int i11, int i12, r7 r7Var) {
        ImageReceiver imageReceiver;
        e3 e3Var;
        e3 e3Var2;
        e3 e3Var3;
        e3 e3Var4;
        r7Var.f48842b = null;
        r7Var.f48843c = null;
        vz0 vz0Var = (vz0) this.f48346a;
        s01 s01Var = vz0Var.h;
        ArrayList arrayList = vz0Var.f30655w;
        if (vz0Var.N < 0.2f) {
            r7Var.f48842b = s01Var.getImageReceiver();
            r7Var.f48843c = null;
            r7Var.f48841a = s01Var;
            r7Var.h = 0.0f;
            r7Var.f48846i = AndroidUtilities.displaySize.y;
            r7Var.f48845g = (View) vz0Var.getParent();
            r7Var.d = vz0Var.f30657y;
            r7Var.f48851n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 < arrayList.size()) {
                e3 e3Var5 = (e3) arrayList.get(i13);
                if (e3Var5.e >= 1.0f && e3Var5.f48369a == i11) {
                    int i14 = i13 - 1;
                    if (i14 >= 0) {
                        e3Var3 = (e3) arrayList.get(i14);
                    } else {
                        e3Var3 = null;
                    }
                    int i15 = i13 - 2;
                    if (i15 >= 0) {
                        e3Var4 = (e3) arrayList.get(i15);
                    } else {
                        e3Var4 = null;
                    }
                    e3 d = ProfileStoriesView.d(e3Var3, e3Var4, e3Var5);
                    imageReceiver = e3Var5.f48370b;
                    e3Var2 = d;
                    e3Var = e3Var5;
                }
                i13++;
            } else {
                imageReceiver = null;
                e3Var = null;
                e3Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        r7Var.f48843c = imageReceiver;
        r7Var.f48842b = null;
        r7Var.f48841a = vz0Var;
        r7Var.h = 0.0f;
        r7Var.f48846i = AndroidUtilities.displaySize.y;
        r7Var.f48845g = (View) vz0Var.getParent();
        if (e3Var != null && e3Var2 != null) {
            r7Var.f48844f = new f1.a(this, new RectF(e3Var.f48378m), e3Var, new RectF(e3Var2.f48378m), e3Var2);
            return true;
        }
        r7Var.f48844f = null;
        return true;
    }

    @Override
    public void b(boolean z10) {
    }
}
