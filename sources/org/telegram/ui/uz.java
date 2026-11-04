package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.zi;
import org.telegram.ui.uz;
import org.telegram.ui.wz;
public final class uz extends org.telegram.ui.Components.sj0 {
    public final Context f50352c;
    public final wz d;

    public uz(wz wzVar, Context context) {
        this.d = wzVar;
        this.f50352c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        wz wzVar = this.d;
        ArrayList arrayList = wzVar.f51645f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / wzVar.f51660s)) + (!wzVar.O ? 1 : 0);
    }

    @Override
    public final int d(int i3) {
        wz wzVar = this.d;
        if (i3 < ((int) Math.ceil(wzVar.f51645f.size() / wzVar.f51660s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        boolean z11;
        wz wzVar = this.d;
        pz pzVar = wzVar.T;
        ArrayList arrayList = wzVar.f51645f;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        boolean z12 = true;
        if (i10 == 0) {
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            o7Var.setItemsCount(wzVar.f51660s);
            if (i3 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            o7Var.setIsFirst(z11);
            int i11 = 0;
            while (true) {
                int i12 = wzVar.f51660s;
                if (i11 < i12) {
                    int i13 = (i12 * i3) + i11;
                    if (i13 < arrayList.size()) {
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i13);
                        o7Var.c(i11, arrayList.indexOf(ziVar), ziVar);
                        if (wzVar.f51656p0.I()) {
                            int f12 = ziVar.f1();
                            pzVar.f48707a = org.telegram.messenger.zi.B0(ziVar.f26868k);
                            pzVar.f48708b = f12;
                            o7Var.b(i11, wzVar.f51656p0.n(pzVar), true);
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
            if (i3 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            t2Var.f30561t2 = z10;
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(i3);
            if (t2Var.getMessage() == null || t2Var.getMessage().f1() != ziVar2.f1()) {
                z12 = false;
            }
            t2Var.P = wzVar.f51657q0;
            t2Var.d0(org.telegram.messenger.zi.B0(ziVar2.f26868k), ziVar2, ziVar2.f26868k.date, false, false);
            if (wzVar.f51656p0.I()) {
                int f13 = ziVar2.f1();
                pzVar.f48707a = org.telegram.messenger.zi.B0(ziVar2.f26868k);
                pzVar.f48708b = f13;
                t2Var.c0(wzVar.f51656p0.n(pzVar), z12);
                return;
            }
            t2Var.c0(false, z12);
        } else if (i10 == 1) {
            int i14 = wzVar.f51660s;
            ((org.telegram.ui.Components.iz) view).f34868w = i14 - ((((int) Math.ceil(arrayList.size() / wzVar.f51660s)) * i14) - arrayList.size());
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        kz kzVar;
        kz kzVar2;
        Context context = this.f50352c;
        if (i3 != 0) {
            if (i3 != 2) {
                kzVar2 = new kz(1, context, this);
                kzVar2.setIsSingleCell(true);
                kzVar2.setViewType(2);
                return k2.p1.p(kzVar2, kzVar2, -1, -2);
            }
            ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
            x3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27899e7, false) & (-218103809));
            kzVar = x3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f29755n = paint;
            frameLayout.f29757s = org.telegram.messenger.h10.f22829t0;
            frameLayout.f29756r = 1;
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zi, false));
            frameLayout.f29751b = new org.telegram.messenger.zi[6];
            frameLayout.f29750a = new org.telegram.ui.Cells.l7[6];
            frameLayout.f29752c = new int[6];
            for (int i10 = 0; i10 < 6; i10++) {
                frameLayout.f29750a[i10] = new org.telegram.ui.Cells.l7(frameLayout, context);
                frameLayout.addView(frameLayout.f29750a[i10]);
                frameLayout.f29750a[i10].setVisibility(4);
                frameLayout.f29750a[i10].setTag(Integer.valueOf(i10));
                frameLayout.f29750a[i10].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f29750a[i10].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        o7 o7Var = o7.this;
                        if (o7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            m7 m7Var = o7Var.d;
                            int i11 = o7Var.f29752c[intValue];
                            zi ziVar = o7Var.f29751b[intValue];
                            org.telegram.ui.f fVar = (org.telegram.ui.f) m7Var;
                            wz wzVar = ((uz) fVar.f45115b).d;
                            if (wzVar.f51656p0.I()) {
                                wz wzVar2 = ((uz) fVar.f45115b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = wz.f51635t0;
                                wzVar2.f(i11, o7Var, ziVar, intValue);
                                return true;
                            }
                            wz.a(wzVar, ziVar, o7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new f(this, 16));
            kzVar = frameLayout;
        }
        kzVar2 = kzVar;
        return k2.p1.p(kzVar2, kzVar2, -1, -2);
    }
}
