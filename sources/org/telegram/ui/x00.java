package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.jj;
import org.telegram.ui.x00;
import org.telegram.ui.z00;
public final class x00 extends org.telegram.ui.Components.sk0 {
    public final Context f43408c;
    public final z00 d;

    public x00(z00 z00Var, Context context) {
        this.d = z00Var;
        this.f43408c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int b() {
        z00 z00Var = this.d;
        ArrayList arrayList = z00Var.f43947f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / z00Var.f43962s)) + (!z00Var.N ? 1 : 0);
    }

    @Override
    public final int d(int i10) {
        z00 z00Var = this.d;
        if (i10 < ((int) Math.ceil(z00Var.f43947f.size() / z00Var.f43962s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        z00 z00Var = this.d;
        s00 s00Var = z00Var.S;
        ArrayList arrayList = z00Var.f43947f;
        int i11 = c1Var.f47901f;
        View view = c1Var.f47898a;
        boolean z12 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            t7Var.setItemsCount(z00Var.f43962s);
            if (i10 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            t7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = z00Var.f43962s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i14);
                        t7Var.c(i12, arrayList.indexOf(jjVar), jjVar);
                        if (z00Var.f43957o0.f()) {
                            int f12 = jjVar.f1();
                            s00Var.f41322a = org.telegram.messenger.jj.B0(jjVar.f16337k);
                            s00Var.f41323b = f12;
                            t7Var.b(i12, z00Var.f43957o0.b(s00Var), true);
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
            v2Var.f23265s2 = z10;
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList.get(i10);
            if (v2Var.getMessage() == null || v2Var.getMessage().f1() != jjVar2.f1()) {
                z12 = false;
            }
            v2Var.O = z00Var.f43958p0;
            v2Var.d0(org.telegram.messenger.jj.B0(jjVar2.f16337k), jjVar2, jjVar2.f16337k.date, false, false);
            if (z00Var.f43957o0.f()) {
                int f13 = jjVar2.f1();
                s00Var.f41322a = org.telegram.messenger.jj.B0(jjVar2.f16337k);
                s00Var.f41323b = f13;
                v2Var.c0(z00Var.f43957o0.b(s00Var), z12);
                return;
            }
            v2Var.c0(false, z12);
        } else if (i11 == 1) {
            int i15 = z00Var.f43962s;
            ((org.telegram.ui.Components.zz) view).f33273w = i15 - ((((int) Math.ceil(arrayList.size() / z00Var.f43962s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        n00 n00Var;
        n00 n00Var2;
        Context context = this.f43408c;
        if (i10 != 0) {
            if (i10 != 2) {
                n00Var2 = new n00(this, context, 1);
                n00Var2.setIsSingleCell(true);
                n00Var2.setViewType(2);
                return sc.e.o(n00Var2, n00Var2, -1, -2);
            }
            ?? z3Var = new org.telegram.ui.Cells.z3(context, null);
            z3Var.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.e7, false) & (-218103809));
            n00Var = z3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f23096n = paint;
            frameLayout.f23098s = org.telegram.messenger.d20.f15147s0;
            frameLayout.f23097r = 1;
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zi, false));
            frameLayout.f23093b = new org.telegram.messenger.jj[6];
            frameLayout.f23092a = new org.telegram.ui.Cells.q7[6];
            frameLayout.f23094c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f23092a[i11] = new org.telegram.ui.Cells.q7(frameLayout, context);
                frameLayout.addView(frameLayout.f23092a[i11]);
                frameLayout.f23092a[i11].setVisibility(4);
                frameLayout.f23092a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f23092a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f23092a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        t7 t7Var = t7.this;
                        if (t7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            r7 r7Var = t7Var.d;
                            int i12 = t7Var.f23094c[intValue];
                            jj jjVar = t7Var.f23093b[intValue];
                            org.telegram.ui.e eVar = (org.telegram.ui.e) r7Var;
                            z00 z00Var = ((x00) eVar.f36877b).d;
                            if (z00Var.f43957o0.f()) {
                                z00 z00Var2 = ((x00) eVar.f36877b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = z00.f43938s0;
                                z00Var2.f(i12, t7Var, jjVar, intValue);
                                return true;
                            }
                            z00.a(z00Var, jjVar, t7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new e(this, 16));
            n00Var = frameLayout;
        }
        n00Var2 = n00Var;
        return sc.e.o(n00Var2, n00Var2, -1, -2);
    }
}
