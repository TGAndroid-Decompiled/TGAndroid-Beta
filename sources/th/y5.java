package th;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.kj;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.nj0;
public final class y5 extends z4.a {
    public final Context f49697c;
    public final o7 d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final q f49698f;

    public y5(q qVar, Context context, o7 o7Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f49698f = qVar;
        this.f49697c = context;
        this.d = o7Var;
        this.e = p6Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        z2 z2Var = (z2) frameLayout.getChildAt(0);
        org.telegram.messenger.i0.E2(z2Var);
        this.f49698f.P0.add(z2Var);
    }

    @Override
    public final int b() {
        q qVar = this.f49698f;
        ArrayList arrayList = qVar.f48799x0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return qVar.A0.size();
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        z2 x5Var;
        long B0;
        Context context = this.f49697c;
        q qVar = this.f49698f;
        z5 z5Var = new z5(qVar, context);
        ArrayList arrayList = qVar.P0;
        boolean isEmpty = arrayList.isEmpty();
        o7 o7Var = this.d;
        if (!isEmpty) {
            x5Var = (z2) arrayList.remove(0);
            x5Var.X0.f49574a.getImageReceiver().O0(true, true);
            if (x5Var.N1 != null) {
                x5Var.K1.N0();
                x5Var.K1.setAlpha(1.0f - x5Var.N3);
            }
            nj0 nj0Var = x5Var.O1;
            if (nj0Var != null) {
                nj0Var.n();
            }
            nj0 nj0Var2 = x5Var.f49706a3;
            if (nj0Var2 != null) {
                nj0Var2.n();
            }
            e50 e50Var = x5Var.f49771s2;
            if (e50Var != null) {
                org.telegram.messenger.i0.E2(e50Var);
                x5Var.f49771s2.c(true);
                x5Var.f49771s2 = null;
            }
            x5Var.setActive(false);
            x5Var.setIsVisible(false);
            x5Var.f49779u2 = false;
            x5Var.f49791x2.e(false, 0.0f);
            x5Var.U0 = null;
            x5Var.R2 = false;
            x5Var.n0();
        } else {
            x5Var = new x5(this, this.f49697c, o7Var, qVar.H0, this.e);
        }
        z5Var.f49800a = x5Var;
        x5Var.setAccount(qVar.f48800y0);
        x5Var.setDelegate(qVar.B0);
        x5Var.setLongpressed(o7Var.f49306a1);
        z5Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = qVar.f48799x0;
        if (arrayList2 != null) {
            if (o7Var.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            z5Var.f49802c = arrayList3;
            x4 x4Var = o7Var.O0;
            if (!(x4Var instanceof r4) && !(x4Var instanceof z4)) {
                z5Var.f49801b = qVar.f48798w0;
            } else {
                kj f7 = x4Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f7 == null) {
                    B0 = qVar.f48798w0;
                } else {
                    B0 = kj.B0(f7.f16690k);
                }
                z5Var.f49801b = B0;
            }
        } else {
            z5Var.f49802c = null;
            z5Var.f49801b = ((Long) qVar.A0.get(i10)).longValue();
        }
        z5Var.addView(x5Var);
        x5Var.requestLayout();
        gVar.addView(z5Var);
        return z5Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
