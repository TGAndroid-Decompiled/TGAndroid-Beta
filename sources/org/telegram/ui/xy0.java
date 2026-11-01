package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public final class xy0 extends org.telegram.ui.Components.p71 {
    public boolean f43482a;
    public final org.telegram.ui.Components.ar0 f43483b;

    public xy0(org.telegram.ui.Components.ar0 ar0Var) {
        this.f43483b = ar0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.ar0 ar0Var = this.f43483b;
        vv0 vv0Var = ar0Var.f43754w;
        org.telegram.ui.Components.w71 w71Var = ar0Var.f43748b;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2 && intValue != 0) {
                arrayList2.add(num);
            }
        }
        int f7 = f(w71Var.getCurrentPosition());
        th.t4 t4Var = ar0Var.f43749c;
        t4Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = t4Var.h;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            th.y4 y4Var = (th.y4) obj2;
            hashMap.put(Integer.valueOf(y4Var.f49694a), y4Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i10 < size3) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            th.y4 y4Var2 = (th.y4) hashMap.get(num2);
            if (y4Var2 != null) {
                arrayList4.add(y4Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f7 >= 0) {
            int i13 = i(f7);
            w71Var.e(0.0f, i13, i13);
        }
        org.telegram.messenger.i0.r(vv0Var);
        org.telegram.messenger.i0.h3(vv0Var, 1000L);
    }

    @Override
    public final boolean c(int i10) {
        if (i10 == 0) {
            return false;
        }
        if (this.f43482a && i10 == e() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new View(this.f43483b.getContext());
    }

    @Override
    public final int e() {
        return this.f43483b.f43749c.h.size() + 1 + (this.f43482a ? 1 : 0);
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f43482a && i10 == e() - 1) {
            return -1;
        }
        return ((th.y4) this.f43483b.f43749c.h.get(i10 - 1)).f49694a;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return org.telegram.messenger.dd.L0(2131744804, null);
        }
        if (this.f43482a && i10 == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131744825, null));
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131232557, 0);
            dqVar.G = 0.8f;
            spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((th.y4) this.f43483b.f43749c.h.get(i10 - 1)).f49695b;
    }

    @Override
    public final int h(int i10) {
        if (this.f43482a && i10 == e() - 1) {
            return -1;
        }
        return i10;
    }

    public final int i(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int c10 = this.f43483b.f43749c.c(i10);
        if (c10 == -1) {
            return -1;
        }
        return c10 + 1;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
