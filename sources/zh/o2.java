package zh;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.bp0;
public final class o2 implements Utilities.Callback5, bm0 {
    public final org.telegram.ui.ActionBar.k3 f53235a;
    public final Object f53236b;

    public o2(org.telegram.ui.ActionBar.k3 k3Var, Object obj) {
        this.f53235a = k3Var;
        this.f53236b = obj;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        g4.Q((g4) this.f53235a, (f4) this.f53236b, i10);
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        boolean z11;
        q2 q2Var = (q2) this.f53235a;
        fi.d dVar = (fi.d) this.f53236b;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        q2Var.getClass();
        long j10 = ((TL_stars.SavedStarGift) ((u61) obj).G).gift.f22257id;
        if (q2Var.f53281b == j10) {
            q2Var.f53281b = 0L;
        } else {
            q2Var.f53281b = j10;
        }
        if (q2Var.f53281b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof bp0) {
                    bp0 bp0Var = (bp0) childAt;
                    if (q2Var.f53281b == bp0Var.getGiftId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bp0Var.b(z11, true);
                }
            }
        }
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
