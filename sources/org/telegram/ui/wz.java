package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.ui.wz;
import org.telegram.ui.yz;
public final class wz extends org.telegram.ui.Components.oj0 {
    public final Context f51695c;
    public final yz d;

    public wz(yz yzVar, Context context) {
        this.d = yzVar;
        this.f51695c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        yz yzVar = this.d;
        ArrayList arrayList = yzVar.f52367f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / yzVar.f52382s)) + (!yzVar.N ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        yz yzVar = this.d;
        if (i7 < ((int) Math.ceil(yzVar.f52367f.size() / yzVar.f52382s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        boolean z10;
        yz yzVar = this.d;
        rz rzVar = yzVar.S;
        ArrayList arrayList = yzVar.f52367f;
        int i10 = d1Var.f57048f;
        View view = d1Var.f57044a;
        boolean z11 = true;
        if (i10 == 0) {
            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
            p7Var.setItemsCount(yzVar.f52382s);
            if (i7 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p7Var.setIsFirst(z10);
            int i11 = 0;
            while (true) {
                int i12 = yzVar.f52382s;
                if (i11 < i12) {
                    int i13 = (i12 * i7) + i11;
                    if (i13 < arrayList.size()) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i13);
                        p7Var.c(i11, arrayList.indexOf(ijVar), ijVar);
                        if (yzVar.f52377o0.i()) {
                            int f12 = ijVar.f1();
                            rzVar.f49568a = org.telegram.messenger.ij.B0(ijVar.f23262k);
                            rzVar.f49569b = f12;
                            p7Var.b(i11, yzVar.f52377o0.f(rzVar), true);
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
            t2Var.f30480s2 = z9;
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i7);
            if (t2Var.getMessage() == null || t2Var.getMessage().f1() != ijVar2.f1()) {
                z11 = false;
            }
            t2Var.O = yzVar.f52378p0;
            t2Var.d0(org.telegram.messenger.ij.B0(ijVar2.f23262k), ijVar2, ijVar2.f23262k.date, false, false);
            if (yzVar.f52377o0.i()) {
                int f13 = ijVar2.f1();
                rzVar.f49568a = org.telegram.messenger.ij.B0(ijVar2.f23262k);
                rzVar.f49569b = f13;
                t2Var.c0(yzVar.f52377o0.f(rzVar), z11);
                return;
            }
            t2Var.c0(false, z11);
        } else if (i10 == 1) {
            int i14 = yzVar.f52382s;
            ((org.telegram.ui.Components.mz) view).f36171w = i14 - ((((int) Math.ceil(arrayList.size() / yzVar.f52382s)) * i14) - arrayList.size());
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        mz mzVar;
        mz mzVar2;
        Context context = this.f51695c;
        if (i7 != 0) {
            if (i7 != 2) {
                mzVar2 = new mz(1, context, this);
                mzVar2.setIsSingleCell(true);
                mzVar2.setViewType(2);
                return jg.g.r(mzVar2, mzVar2, -1, -2);
            }
            ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
            x3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27872e7, false) & (-218103809));
            mzVar = x3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f29742n = paint;
            frameLayout.f29744s = org.telegram.messenger.p10.f24470s0;
            frameLayout.f29743r = 1;
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zi, false));
            frameLayout.f29738b = new org.telegram.messenger.ij[6];
            frameLayout.f29737a = new org.telegram.ui.Cells.m7[6];
            frameLayout.f29739c = new int[6];
            for (int i10 = 0; i10 < 6; i10++) {
                frameLayout.f29737a[i10] = new org.telegram.ui.Cells.m7(frameLayout, context);
                frameLayout.addView(frameLayout.f29737a[i10]);
                frameLayout.f29737a[i10].setVisibility(4);
                frameLayout.f29737a[i10].setTag(Integer.valueOf(i10));
                frameLayout.f29737a[i10].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f29737a[i10].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        p7 p7Var = p7.this;
                        if (p7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            n7 n7Var = p7Var.d;
                            int i11 = p7Var.f29739c[intValue];
                            ij ijVar = p7Var.f29738b[intValue];
                            org.telegram.ui.f fVar = (org.telegram.ui.f) n7Var;
                            yz yzVar = ((wz) fVar.f45409b).d;
                            if (yzVar.f52377o0.i()) {
                                yz yzVar2 = ((wz) fVar.f45409b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = yz.f52357s0;
                                yzVar2.f(i11, p7Var, ijVar, intValue);
                                return true;
                            }
                            yz.a(yzVar, ijVar, p7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new f(this, 16));
            mzVar = frameLayout;
        }
        mzVar2 = mzVar;
        return jg.g.r(mzVar2, mzVar2, -1, -2);
    }
}
