package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.ui.a00;
import org.telegram.ui.yz;
public final class yz extends org.telegram.ui.Components.pj0 {
    public final Context f52362c;
    public final a00 d;

    public yz(a00 a00Var, Context context) {
        this.d = a00Var;
        this.f52362c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        a00 a00Var = this.d;
        ArrayList arrayList = a00Var.f43519f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / a00Var.f43534s)) + (!a00Var.N ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        a00 a00Var = this.d;
        if (i7 < ((int) Math.ceil(a00Var.f43519f.size() / a00Var.f43534s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        boolean z10;
        a00 a00Var = this.d;
        tz tzVar = a00Var.S;
        ArrayList arrayList = a00Var.f43519f;
        int i10 = d1Var.f57060f;
        View view = d1Var.f57056a;
        boolean z11 = true;
        if (i10 == 0) {
            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
            p7Var.setItemsCount(a00Var.f43534s);
            if (i7 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p7Var.setIsFirst(z10);
            int i11 = 0;
            while (true) {
                int i12 = a00Var.f43534s;
                if (i11 < i12) {
                    int i13 = (i12 * i7) + i11;
                    if (i13 < arrayList.size()) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i13);
                        p7Var.c(i11, arrayList.indexOf(ijVar), ijVar);
                        if (a00Var.f43529o0.i()) {
                            int e12 = ijVar.e1();
                            tzVar.f50267a = org.telegram.messenger.ij.B0(ijVar.f23262k);
                            tzVar.f50268b = e12;
                            p7Var.b(i11, a00Var.f43529o0.f(tzVar), true);
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
            t2Var.f30484s2 = z9;
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i7);
            if (t2Var.getMessage() == null || t2Var.getMessage().e1() != ijVar2.e1()) {
                z11 = false;
            }
            t2Var.O = a00Var.f43530p0;
            t2Var.d0(org.telegram.messenger.ij.B0(ijVar2.f23262k), ijVar2, ijVar2.f23262k.date, false, false);
            if (a00Var.f43529o0.i()) {
                int e13 = ijVar2.e1();
                tzVar.f50267a = org.telegram.messenger.ij.B0(ijVar2.f23262k);
                tzVar.f50268b = e13;
                t2Var.c0(a00Var.f43529o0.f(tzVar), z11);
                return;
            }
            t2Var.c0(false, z11);
        } else if (i10 == 1) {
            int i14 = a00Var.f43534s;
            ((org.telegram.ui.Components.mz) view).f36180w = i14 - ((((int) Math.ceil(arrayList.size() / a00Var.f43534s)) * i14) - arrayList.size());
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        oz ozVar;
        oz ozVar2;
        Context context = this.f52362c;
        if (i7 != 0) {
            if (i7 != 2) {
                ozVar2 = new oz(1, context, this);
                ozVar2.setIsSingleCell(true);
                ozVar2.setViewType(2);
                return jg.g.r(ozVar2, ozVar2, -1, -2);
            }
            ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
            x3Var.setBackgroundColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27885e7, false) & (-218103809));
            ozVar = x3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f29746n = paint;
            frameLayout.f29748s = org.telegram.messenger.p10.f24470s0;
            frameLayout.f29747r = 1;
            paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.zi, false));
            frameLayout.f29742b = new org.telegram.messenger.ij[6];
            frameLayout.f29741a = new org.telegram.ui.Cells.m7[6];
            frameLayout.f29743c = new int[6];
            for (int i10 = 0; i10 < 6; i10++) {
                frameLayout.f29741a[i10] = new org.telegram.ui.Cells.m7(frameLayout, context);
                frameLayout.addView(frameLayout.f29741a[i10]);
                frameLayout.f29741a[i10].setVisibility(4);
                frameLayout.f29741a[i10].setTag(Integer.valueOf(i10));
                frameLayout.f29741a[i10].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f29741a[i10].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        p7 p7Var = p7.this;
                        if (p7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            n7 n7Var = p7Var.d;
                            int i11 = p7Var.f29743c[intValue];
                            ij ijVar = p7Var.f29742b[intValue];
                            org.telegram.ui.f fVar = (org.telegram.ui.f) n7Var;
                            a00 a00Var = ((yz) fVar.f45545b).d;
                            if (a00Var.f43529o0.i()) {
                                a00 a00Var2 = ((yz) fVar.f45545b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = a00.f43509s0;
                                a00Var2.f(i11, p7Var, ijVar, intValue);
                                return true;
                            }
                            a00.a(a00Var, ijVar, p7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new f(this, 16));
            ozVar = frameLayout;
        }
        ozVar2 = ozVar;
        return jg.g.r(ozVar2, ozVar2, -1, -2);
    }
}
