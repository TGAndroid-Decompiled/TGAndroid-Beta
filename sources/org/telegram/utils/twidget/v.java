package org.telegram.utils.twidget;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import bi.v6;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.r20;
import org.telegram.messenger.vi;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.ProfileActivity;
import rh.e6;
import th.e5;
import vh.n5;
import vh.o8;
import vh.u1;
public final class v implements Runnable {
    public final int f44459a;
    public final int f44460b;
    public final Object f44461c;

    public v(int i10, Object obj, int i11) {
        this.f44459a = i11;
        this.f44460b = i10;
        this.f44461c = obj;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        int i10;
        int i11 = this.f44459a;
        boolean z11 = false;
        int i12 = this.f44460b;
        Object obj = this.f44461c;
        switch (i11) {
            case 0:
                try {
                    ((k0) obj).e(i12);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", e20.i(i12).f15524n);
                ((z4) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                ConnectionsManager.getInstance(((e6) obj).f46863a).cancelRequest(i12, true);
                return;
            case 3:
                sg.f fVar = (sg.f) obj;
                if (fVar.f48336b) {
                    r20 r20Var = fVar.d;
                    if (r20Var != null) {
                        if (i12 < 300) {
                            z11 = true;
                        }
                        r20Var.a(Boolean.valueOf(z11));
                        try {
                            fVar.f48335a.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    fVar.f48337c = true;
                    int max = Math.max(50, i12 - 100);
                    org.telegram.messenger.i0.h3(new v(fVar, max, 3), max);
                    return;
                }
                return;
            case 4:
                e5 e5Var = (e5) obj;
                ArrayList arrayList3 = e5Var.f48922g;
                e5Var.v(arrayList3);
                v6 v6Var = e5Var.J;
                Collections.sort(arrayList3, v6Var);
                ArrayList arrayList4 = e5Var.h;
                e5Var.v(arrayList4);
                Collections.sort(arrayList4, v6Var);
                at.f(i12).k(324, new Object[0]);
                return;
            case 5:
                ((vh.m) obj).a(Integer.valueOf(i12));
                return;
            case 6:
                ((r20) obj).a(Integer.valueOf(i12));
                return;
            case 7:
                ((u1) obj).M0(i12);
                return;
            case 8:
                wp.r1(i12).V3((ArrayList) obj, true);
                return;
            case 9:
                o8 o8Var = (o8) obj;
                int i13 = o8Var.f51626c;
                o8Var.l();
                o8Var.X1 = false;
                File file = o8Var.K1.O0;
                if (file != null) {
                    file.delete();
                    o8Var.K1.O0 = null;
                }
                o8Var.V(o8Var.K1, true);
                CharSequence[] charSequenceArr = {o8Var.f51628c1.getText()};
                if (wp.r1(i13).U4()) {
                    arrayList = vi.b0(i13).W(charSequenceArr, true, true);
                } else {
                    arrayList = new ArrayList();
                }
                CharSequence[] charSequenceArr2 = {o8Var.K1.C0};
                if (wp.r1(i13).U4()) {
                    arrayList2 = vi.b0(i13).W(charSequenceArr2, true, true);
                } else {
                    arrayList2 = new ArrayList();
                }
                n5 n5Var = o8Var.K1;
                if (TextUtils.equals(n5Var.C0, charSequenceArr[0]) && vi.K(arrayList, arrayList2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                n5Var.f51551k = z10;
                o8Var.K1.C0 = new SpannableString(o8Var.f51628c1.getText());
                o8Var.y();
                o8Var.x();
                n5 n5Var2 = o8Var.K1;
                if (n5Var2 != null && n5Var2.K) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                o8Var.O1 = i10;
                o8Var.K1 = (n5) o8Var.H1.get(i12);
                o8Var.N(0, 1);
                o8Var.M(0, 1);
                o8Var.f51631d1.f52207b.f31183f3.O(false);
                o8Var.f51628c1.setText(o8Var.K1.C0);
                return;
            case 10:
                ((zf.z) obj).g(i12);
                return;
            default:
                s4.f0 f0Var = (s4.f0) obj;
                f0Var.getClass();
                try {
                    f0Var.f47937a.scrollBy(0, i12);
                    return;
                } catch (Throwable th2) {
                    f8.g(th2, true);
                    return;
                }
        }
    }

    public v(Object obj, int i10, int i11) {
        this.f44459a = i11;
        this.f44461c = obj;
        this.f44460b = i10;
    }
}
