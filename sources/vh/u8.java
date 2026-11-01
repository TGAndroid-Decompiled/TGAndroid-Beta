package vh;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.gr;
public final class u8 {
    public int f52030a;
    public boolean f52031b;
    public x8 f52032c;
    public String d;
    public long e;
    public long f52033f;
    public float f52034g;
    public float h;
    public float f52035i;
    public final RectF f52036j = new RectF();
    public final org.telegram.ui.Components.t5 f52037k;
    public final z8 f52038l;

    public u8(z8 z8Var) {
        this.f52038l = z8Var;
        this.f52037k = new org.telegram.ui.Components.t5(z8Var, 360L, gr.h);
    }

    public static void a(u8 u8Var, boolean z10) {
        z8 z8Var = u8Var.f52038l;
        if (z8Var.getMeasuredWidth() > 0) {
            x8 x8Var = u8Var.f52032c;
            if (x8Var == null || z10) {
                Long l4 = null;
                if (x8Var != null) {
                    x8Var.b();
                    u8Var.f52032c = null;
                }
                z8 z8Var2 = u8Var.f52038l;
                boolean z11 = u8Var.f52031b;
                String str = u8Var.d;
                int i10 = z8Var2.f52323v1;
                int i11 = z8Var2.f52332y1;
                int i12 = (i10 - i11) - i11;
                int L = org.telegram.messenger.i0.L(38.0f);
                long j10 = u8Var.e;
                if (j10 > 2) {
                    l4 = Long.valueOf(j10);
                }
                u8Var.f52032c = new x8(z8Var2, z11, str, i12, L, l4, z8Var.getMaxScrollDuration(), z8Var.Z0, z8Var.f52277a1, new d0(u8Var, 21));
            }
        }
    }

    public static void b(u8 u8Var) {
        z8 z8Var = u8Var.f52038l;
        int i10 = u8Var.f52030a;
        if (i10 >= 0) {
            ArrayList arrayList = z8Var.f52312r;
            if (i10 < arrayList.size()) {
                s8 s8Var = (s8) arrayList.get(u8Var.f52030a);
                if (z8Var.getMeasuredWidth() > 0 && s8Var == null) {
                    if (s8Var != null) {
                        s8Var.a();
                    }
                    arrayList.set(u8Var.f52030a, new s8(z8Var, u8Var.d, (z8Var.getMeasuredWidth() - z8Var.getPaddingLeft()) - z8Var.getPaddingRight()));
                }
            }
        }
    }
}
