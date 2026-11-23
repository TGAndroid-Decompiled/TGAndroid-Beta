package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.ui.b00;
import org.telegram.ui.zz;
public final class zz extends org.telegram.ui.Components.dk0 {
    public final Context f54752c;
    public final b00 d;

    public zz(b00 b00Var, Context context) {
        this.d = b00Var;
        this.f54752c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final int b() {
        b00 b00Var = this.d;
        ArrayList arrayList = b00Var.f45852f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / b00Var.f45867s)) + (!b00Var.O ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        b00 b00Var = this.d;
        if (i7 < ((int) Math.ceil(b00Var.f45852f.size() / b00Var.f45867s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        b00 b00Var = this.d;
        uz uzVar = b00Var.T;
        ArrayList arrayList = b00Var.f45852f;
        int i10 = f1Var.f59249f;
        View view = f1Var.f59245a;
        boolean z12 = true;
        if (i10 == 0) {
            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
            p7Var.setItemsCount(b00Var.f45867s);
            if (i7 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            p7Var.setIsFirst(z11);
            int i11 = 0;
            while (true) {
                int i12 = b00Var.f45867s;
                if (i11 < i12) {
                    int i13 = (i12 * i7) + i11;
                    if (i13 < arrayList.size()) {
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i13);
                        p7Var.c(i11, arrayList.indexOf(fjVar), fjVar);
                        if (b00Var.f45863p0.i0()) {
                            int e12 = fjVar.e1();
                            uzVar.f52761a = org.telegram.messenger.fj.B0(fjVar.f24073k);
                            uzVar.f52762b = e12;
                            p7Var.b(i11, b00Var.f45863p0.j(uzVar), true);
                        } else {
                            p7Var.b(i11, false, true);
                        }
                    } else {
                        p7Var.c(i11, i13, null);
                    }
                    i11++;
                } else {
                    p7Var.requestLayout();
                    return;
                }
            }
        } else if (i10 == 3) {
            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
            if (i7 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            u2Var.f32068t2 = z10;
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(i7);
            if (u2Var.getMessage() == null || u2Var.getMessage().e1() != fjVar2.e1()) {
                z12 = false;
            }
            u2Var.P = b00Var.f45864q0;
            u2Var.f0(org.telegram.messenger.fj.B0(fjVar2.f24073k), fjVar2, fjVar2.f24073k.date, false, false);
            if (b00Var.f45863p0.i0()) {
                int e13 = fjVar2.e1();
                uzVar.f52761a = org.telegram.messenger.fj.B0(fjVar2.f24073k);
                uzVar.f52762b = e13;
                u2Var.e0(b00Var.f45863p0.j(uzVar), z12);
                return;
            }
            u2Var.e0(false, z12);
        } else if (i10 == 1) {
            int i14 = b00Var.f45867s;
            ((org.telegram.ui.Components.vz) view).f41456w = i14 - ((((int) Math.ceil(arrayList.size() / b00Var.f45867s)) * i14) - arrayList.size());
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        pz pzVar;
        pz pzVar2;
        Context context = this.f54752c;
        if (i7 != 0) {
            if (i7 != 2) {
                pzVar2 = new pz(1, context, this);
                pzVar2.setIsSingleCell(true);
                pzVar2.setViewType(2);
                return i5.c.q(pzVar2, pzVar2, -1, -2);
            }
            ?? y3Var = new org.telegram.ui.Cells.y3(context, null);
            y3Var.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29471e7, false) & (-218103809));
            pzVar = y3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f31332n = paint;
            frameLayout.f31334s = org.telegram.messenger.i10.f24637t0;
            frameLayout.f31333r = 1;
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ci, false));
            frameLayout.f31328b = new org.telegram.messenger.fj[6];
            frameLayout.f31327a = new org.telegram.ui.Cells.m7[6];
            frameLayout.f31329c = new int[6];
            for (int i10 = 0; i10 < 6; i10++) {
                frameLayout.f31327a[i10] = new org.telegram.ui.Cells.m7(frameLayout, context);
                frameLayout.addView(frameLayout.f31327a[i10]);
                frameLayout.f31327a[i10].setVisibility(4);
                frameLayout.f31327a[i10].setTag(Integer.valueOf(i10));
                frameLayout.f31327a[i10].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f31327a[i10].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        p7 p7Var = p7.this;
                        if (p7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            n7 n7Var = p7Var.d;
                            int i11 = p7Var.f31329c[intValue];
                            fj fjVar = p7Var.f31328b[intValue];
                            org.telegram.ui.f fVar = (org.telegram.ui.f) n7Var;
                            b00 b00Var = ((zz) fVar.f47651b).d;
                            if (b00Var.f45863p0.i0()) {
                                b00 b00Var2 = ((zz) fVar.f47651b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = b00.f45842t0;
                                b00Var2.f(i11, p7Var, fjVar, intValue);
                                return true;
                            }
                            b00.a(b00Var, fjVar, p7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new f(this, 16));
            pzVar = frameLayout;
        }
        pzVar2 = pzVar;
        return i5.c.q(pzVar2, pzVar2, -1, -2);
    }
}
