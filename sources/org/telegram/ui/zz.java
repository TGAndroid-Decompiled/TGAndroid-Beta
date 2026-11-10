package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.ui.b00;
import org.telegram.ui.zz;
public final class zz extends org.telegram.ui.Components.oj0 {
    public final Context f52712c;
    public final b00 d;

    public zz(b00 b00Var, Context context) {
        this.d = b00Var;
        this.f52712c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        b00 b00Var = this.d;
        ArrayList arrayList = b00Var.f43869f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / b00Var.f43884s)) + (!b00Var.N ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        b00 b00Var = this.d;
        if (i7 < ((int) Math.ceil(b00Var.f43869f.size() / b00Var.f43884s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        boolean z10;
        b00 b00Var = this.d;
        uz uzVar = b00Var.S;
        ArrayList arrayList = b00Var.f43869f;
        int i10 = d1Var.f57056f;
        View view = d1Var.f57052a;
        boolean z11 = true;
        if (i10 == 0) {
            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
            p7Var.setItemsCount(b00Var.f43884s);
            if (i7 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p7Var.setIsFirst(z10);
            int i11 = 0;
            while (true) {
                int i12 = b00Var.f43884s;
                if (i11 < i12) {
                    int i13 = (i12 * i7) + i11;
                    if (i13 < arrayList.size()) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i13);
                        p7Var.c(i11, arrayList.indexOf(ijVar), ijVar);
                        if (b00Var.f43879o0.i()) {
                            int e12 = ijVar.e1();
                            uzVar.f50595a = org.telegram.messenger.ij.B0(ijVar.f23266k);
                            uzVar.f50596b = e12;
                            p7Var.b(i11, b00Var.f43879o0.f(uzVar), true);
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
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            if (i7 != b() - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            t2Var.f30495s2 = z9;
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i7);
            if (t2Var.getMessage() == null || t2Var.getMessage().e1() != ijVar2.e1()) {
                z11 = false;
            }
            t2Var.O = b00Var.f43880p0;
            t2Var.d0(org.telegram.messenger.ij.B0(ijVar2.f23266k), ijVar2, ijVar2.f23266k.date, false, false);
            if (b00Var.f43879o0.i()) {
                int e13 = ijVar2.e1();
                uzVar.f50595a = org.telegram.messenger.ij.B0(ijVar2.f23266k);
                uzVar.f50596b = e13;
                t2Var.c0(b00Var.f43879o0.f(uzVar), z11);
                return;
            }
            t2Var.c0(false, z11);
        } else if (i10 == 1) {
            int i14 = b00Var.f43884s;
            ((org.telegram.ui.Components.lz) view).f35773w = i14 - ((((int) Math.ceil(arrayList.size() / b00Var.f43884s)) * i14) - arrayList.size());
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        pz pzVar;
        pz pzVar2;
        Context context = this.f52712c;
        if (i7 != 0) {
            if (i7 != 2) {
                pzVar2 = new pz(1, context, this);
                pzVar2.setIsSingleCell(true);
                pzVar2.setViewType(2);
                return jg.g.r(pzVar2, pzVar2, -1, -2);
            }
            ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
            x3Var.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27910e7, false) & (-218103809));
            pzVar = x3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f29757n = paint;
            frameLayout.f29759s = org.telegram.messenger.p10.f24474s0;
            frameLayout.f29758r = 1;
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.zi, false));
            frameLayout.f29753b = new org.telegram.messenger.ij[6];
            frameLayout.f29752a = new org.telegram.ui.Cells.m7[6];
            frameLayout.f29754c = new int[6];
            for (int i10 = 0; i10 < 6; i10++) {
                frameLayout.f29752a[i10] = new org.telegram.ui.Cells.m7(frameLayout, context);
                frameLayout.addView(frameLayout.f29752a[i10]);
                frameLayout.f29752a[i10].setVisibility(4);
                frameLayout.f29752a[i10].setTag(Integer.valueOf(i10));
                frameLayout.f29752a[i10].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f29752a[i10].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        p7 p7Var = p7.this;
                        if (p7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            n7 n7Var = p7Var.d;
                            int i11 = p7Var.f29754c[intValue];
                            ij ijVar = p7Var.f29753b[intValue];
                            org.telegram.ui.f fVar = (org.telegram.ui.f) n7Var;
                            b00 b00Var = ((zz) fVar.f45464b).d;
                            if (b00Var.f43879o0.i()) {
                                b00 b00Var2 = ((zz) fVar.f45464b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = b00.f43859s0;
                                b00Var2.f(i11, p7Var, ijVar, intValue);
                                return true;
                            }
                            b00.a(b00Var, ijVar, p7Var, intValue);
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
        return jg.g.r(pzVar2, pzVar2, -1, -2);
    }
}
