package zh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.pk0;
public final class c6 extends z4.a {
    public final ArrayList f48326c = new ArrayList();
    public final Context d;
    public final u7 e;
    public final org.telegram.ui.ActionBar.f6 f48327f;
    public final k7 f48328g;

    public c6(k7 k7Var, Context context, u7 u7Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f48328g = k7Var;
        this.d = context;
        this.e = u7Var;
        this.f48327f = f6Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        a3 a3Var = (a3) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(a3Var);
        this.f48326c.add(a3Var);
    }

    @Override
    public final int b() {
        k7 k7Var = this.f48328g;
        ArrayList arrayList = k7Var.f48418x0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return k7Var.A0.size();
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        a3 b6Var;
        long dialogId;
        Context context = this.d;
        k7 k7Var = this.f48328g;
        e6 e6Var = new e6(k7Var, context);
        ArrayList arrayList = this.f48326c;
        boolean isEmpty = arrayList.isEmpty();
        u7 u7Var = this.e;
        if (!isEmpty) {
            b6Var = (a3) arrayList.remove(0);
            b6Var.f48196o1.f49036a.getImageReceiver().setVisible(true, true);
            if (b6Var.f48169e2 != null) {
                b6Var.f48157b2.P0();
                b6Var.f48157b2.setAlpha(1.0f - b6Var.f48167d4);
            }
            pk0 pk0Var = b6Var.f48172f2;
            if (pk0Var != null) {
                pk0Var.n();
            }
            pk0 pk0Var2 = b6Var.f48207r3;
            if (pk0Var2 != null) {
                pk0Var2.n();
            }
            f60 f60Var = b6Var.J2;
            if (f60Var != null) {
                AndroidUtilities.removeFromParent(f60Var);
                b6Var.J2.h(true);
                b6Var.J2 = null;
            }
            b6Var.setActive(false);
            b6Var.setIsVisible(false);
            b6Var.L2 = false;
            b6Var.O2.d(0.0f, false);
            b6Var.l1 = null;
            b6Var.f48182i3 = false;
            b6Var.p0();
        } else {
            b6Var = new b6(this, this.d, u7Var, k7Var.H0, this.f48327f);
        }
        e6Var.f48384a = b6Var;
        b6Var.setAccount(k7Var.f48419y0);
        b6Var.setDelegate(k7Var.B0);
        b6Var.setLongpressed(u7Var.f48920a1);
        e6Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = k7Var.f48418x0;
        if (arrayList2 != null) {
            if (u7Var.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            e6Var.f48386c = arrayList3;
            a5 a5Var = u7Var.O0;
            if (!(a5Var instanceof u4) && !(a5Var instanceof c5)) {
                e6Var.f48385b = k7Var.f48417w0;
            } else {
                MessageObject f7 = a5Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f7 == null) {
                    dialogId = k7Var.f48417w0;
                } else {
                    dialogId = f7.getDialogId();
                }
                e6Var.f48385b = dialogId;
            }
        } else {
            e6Var.f48386c = null;
            e6Var.f48385b = ((Long) k7Var.A0.get(i10)).longValue();
        }
        e6Var.addView(b6Var);
        b6Var.requestLayout();
        gVar.addView(e6Var);
        return e6Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
