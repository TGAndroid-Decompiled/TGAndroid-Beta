package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.kj;
import org.telegram.ui.w00;
import org.telegram.ui.y00;
public final class w00 extends org.telegram.ui.Components.tk0 {
    public final Context f42645c;
    public final y00 d;

    public w00(y00 y00Var, Context context) {
        this.d = y00Var;
        this.f42645c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int b() {
        y00 y00Var = this.d;
        ArrayList arrayList = y00Var.f43504f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / y00Var.f43519s)) + (!y00Var.N ? 1 : 0);
    }

    @Override
    public final int d(int i10) {
        y00 y00Var = this.d;
        if (i10 < ((int) Math.ceil(y00Var.f43504f.size() / y00Var.f43519s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        y00 y00Var = this.d;
        r00 r00Var = y00Var.S;
        ArrayList arrayList = y00Var.f43504f;
        int i11 = c1Var.f47912f;
        View view = c1Var.f47909a;
        boolean z12 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            t7Var.setItemsCount(y00Var.f43519s);
            if (i10 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            t7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = y00Var.f43519s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i14);
                        t7Var.c(i12, arrayList.indexOf(kjVar), kjVar);
                        if (y00Var.f43514o0.f()) {
                            int f12 = kjVar.f1();
                            r00Var.f40933a = org.telegram.messenger.kj.B0(kjVar.f16690k);
                            r00Var.f40934b = f12;
                            t7Var.b(i12, y00Var.f43514o0.b(r00Var), true);
                        } else {
                            t7Var.b(i12, false, true);
                        }
                    } else {
                        t7Var.c(i12, i14, null);
                    }
                    i12++;
                } else {
                    t7Var.requestLayout();
                    return;
                }
            }
        } else if (i11 == 3) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
            if (i10 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            v2Var.f23266s2 = z10;
            org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList.get(i10);
            if (v2Var.getMessage() == null || v2Var.getMessage().f1() != kjVar2.f1()) {
                z12 = false;
            }
            v2Var.O = y00Var.f43515p0;
            v2Var.d0(org.telegram.messenger.kj.B0(kjVar2.f16690k), kjVar2, kjVar2.f16690k.date, false, false);
            if (y00Var.f43514o0.f()) {
                int f13 = kjVar2.f1();
                r00Var.f40933a = org.telegram.messenger.kj.B0(kjVar2.f16690k);
                r00Var.f40934b = f13;
                v2Var.c0(y00Var.f43514o0.b(r00Var), z12);
                return;
            }
            v2Var.c0(false, z12);
        } else if (i11 == 1) {
            int i15 = y00Var.f43519s;
            ((org.telegram.ui.Components.zz) view).f33279w = i15 - ((((int) Math.ceil(arrayList.size() / y00Var.f43519s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        m00 m00Var;
        m00 m00Var2;
        Context context = this.f42645c;
        if (i10 != 0) {
            if (i10 != 2) {
                m00Var2 = new m00(this, context, 1);
                m00Var2.setIsSingleCell(true);
                m00Var2.setViewType(2);
                return sc.e.o(m00Var2, m00Var2, -1, -2);
            }
            ?? z3Var = new org.telegram.ui.Cells.z3(context, null);
            z3Var.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.e7, false) & (-218103809));
            m00Var = z3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f23097n = paint;
            frameLayout.f23099s = org.telegram.messenger.e20.f15506s0;
            frameLayout.f23098r = 1;
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zi, false));
            frameLayout.f23094b = new org.telegram.messenger.kj[6];
            frameLayout.f23093a = new org.telegram.ui.Cells.q7[6];
            frameLayout.f23095c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f23093a[i11] = new org.telegram.ui.Cells.q7(frameLayout, context);
                frameLayout.addView(frameLayout.f23093a[i11]);
                frameLayout.f23093a[i11].setVisibility(4);
                frameLayout.f23093a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f23093a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f23093a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        t7 t7Var = t7.this;
                        if (t7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            r7 r7Var = t7Var.d;
                            int i12 = t7Var.f23095c[intValue];
                            kj kjVar = t7Var.f23094b[intValue];
                            org.telegram.ui.e eVar = (org.telegram.ui.e) r7Var;
                            y00 y00Var = ((w00) eVar.f36703b).d;
                            if (y00Var.f43514o0.f()) {
                                y00 y00Var2 = ((w00) eVar.f36703b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = y00.f43495s0;
                                y00Var2.f(i12, t7Var, kjVar, intValue);
                                return true;
                            }
                            y00.a(y00Var, kjVar, t7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new e(this, 16));
            m00Var = frameLayout;
        }
        m00Var2 = m00Var;
        return sc.e.o(m00Var2, m00Var2, -1, -2);
    }
}
