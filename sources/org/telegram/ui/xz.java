package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.ui.xz;
import org.telegram.ui.zz;
public final class xz extends org.telegram.ui.Components.tj0 {
    public final Context f53355c;
    public final zz d;

    public xz(zz zzVar, Context context) {
        this.d = zzVar;
        this.f53355c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override
    public final int b() {
        zz zzVar = this.d;
        ArrayList arrayList = zzVar.f54082f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / zzVar.f54097s)) + (!zzVar.O ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        zz zzVar = this.d;
        if (i7 < ((int) Math.ceil(zzVar.f54082f.size() / zzVar.f54097s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        boolean z11;
        zz zzVar = this.d;
        sz szVar = zzVar.T;
        ArrayList arrayList = zzVar.f54082f;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        boolean z12 = true;
        if (i10 == 0) {
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            o7Var.setItemsCount(zzVar.f54097s);
            if (i7 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            o7Var.setIsFirst(z11);
            int i11 = 0;
            while (true) {
                int i12 = zzVar.f54097s;
                if (i11 < i12) {
                    int i13 = (i12 * i7) + i11;
                    if (i13 < arrayList.size()) {
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i13);
                        o7Var.c(i11, arrayList.indexOf(gjVar), gjVar);
                        if (zzVar.f54093p0.g0()) {
                            int e12 = gjVar.e1();
                            szVar.f51306a = org.telegram.messenger.gj.B0(gjVar.f23819k);
                            szVar.f51307b = e12;
                            o7Var.b(i11, zzVar.f54093p0.l(szVar), true);
                        } else {
                            o7Var.b(i11, false, true);
                        }
                    } else {
                        o7Var.c(i11, i13, null);
                    }
                    i11++;
                } else {
                    o7Var.requestLayout();
                    return;
                }
            }
        } else if (i10 == 3) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            if (i7 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            t2Var.f31637t2 = z10;
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(i7);
            if (t2Var.getMessage() == null || t2Var.getMessage().e1() != gjVar2.e1()) {
                z12 = false;
            }
            t2Var.P = zzVar.f54094q0;
            t2Var.f0(org.telegram.messenger.gj.B0(gjVar2.f23819k), gjVar2, gjVar2.f23819k.date, false, false);
            if (zzVar.f54093p0.g0()) {
                int e13 = gjVar2.e1();
                szVar.f51306a = org.telegram.messenger.gj.B0(gjVar2.f23819k);
                szVar.f51307b = e13;
                t2Var.e0(zzVar.f54093p0.l(szVar), z12);
                return;
            }
            t2Var.e0(false, z12);
        } else if (i10 == 1) {
            int i14 = zzVar.f54097s;
            ((org.telegram.ui.Components.pz) view).f38447w = i14 - ((((int) Math.ceil(arrayList.size() / zzVar.f54097s)) * i14) - arrayList.size());
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        nz nzVar;
        nz nzVar2;
        Context context = this.f53355c;
        if (i7 != 0) {
            if (i7 != 2) {
                nzVar2 = new nz(1, context, this);
                nzVar2.setIsSingleCell(true);
                nzVar2.setViewType(2);
                return i5.c.q(nzVar2, nzVar2, -1, -2);
            }
            ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
            x3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28869e7, false) & (-218103809));
            nzVar = x3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f30816n = paint;
            frameLayout.f30818s = org.telegram.messenger.m10.f24940t0;
            frameLayout.f30817r = 1;
            paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ci, false));
            frameLayout.f30812b = new org.telegram.messenger.gj[6];
            frameLayout.f30811a = new org.telegram.ui.Cells.l7[6];
            frameLayout.f30813c = new int[6];
            for (int i10 = 0; i10 < 6; i10++) {
                frameLayout.f30811a[i10] = new org.telegram.ui.Cells.l7(frameLayout, context);
                frameLayout.addView(frameLayout.f30811a[i10]);
                frameLayout.f30811a[i10].setVisibility(4);
                frameLayout.f30811a[i10].setTag(Integer.valueOf(i10));
                frameLayout.f30811a[i10].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f30811a[i10].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        o7 o7Var = o7.this;
                        if (o7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            m7 m7Var = o7Var.d;
                            int i11 = o7Var.f30813c[intValue];
                            gj gjVar = o7Var.f30812b[intValue];
                            org.telegram.ui.f fVar = (org.telegram.ui.f) m7Var;
                            zz zzVar = ((xz) fVar.f46930b).d;
                            if (zzVar.f54093p0.g0()) {
                                zz zzVar2 = ((xz) fVar.f46930b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = zz.f54072t0;
                                zzVar2.f(i11, o7Var, gjVar, intValue);
                                return true;
                            }
                            zz.a(zzVar, gjVar, o7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new f(this, 16));
            nzVar = frameLayout;
        }
        nzVar2 = nzVar;
        return i5.c.q(nzVar2, nzVar2, -1, -2);
    }
}
