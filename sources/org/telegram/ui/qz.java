package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class qz extends v4.u0 {
    public final b00 f51560a;

    public qz(b00 b00Var) {
        this.f51560a = b00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            org.telegram.messenger.g0.v1(this.f51560a.L.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.fj fjVar;
        b00 b00Var = this.f51560a;
        tz tzVar = b00Var.f45861n0;
        v4.c0 c0Var = b00Var.f45858k0;
        te.a aVar = b00Var.f45843a;
        kz kzVar = b00Var.f45862o0;
        if (recyclerView.getAdapter() != null && b00Var.d != null) {
            int L0 = c0Var.L0();
            int N0 = c0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int b10 = recyclerView.getAdapter().b();
            if (!b00Var.N && abs > 0 && N0 >= b10 - 10 && !b00Var.O) {
                org.telegram.messenger.g0.g3(new kz(this, 1));
            }
            if (b00Var.d == b00Var.V) {
                if (i10 != 0 && !b00Var.f45852f.isEmpty() && TextUtils.isEmpty(b00Var.R)) {
                    org.telegram.messenger.g0.r(kzVar);
                    org.telegram.messenger.g0.h3(kzVar, 1650L);
                    aVar.a(true, true);
                }
                v4.f1 K = recyclerView.K(L0);
                if (K != null && K.f59249f == 0) {
                    View view = K.f59245a;
                    if (view instanceof org.telegram.ui.Cells.p7) {
                        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                        if (p7Var.f31330e <= 0) {
                            fjVar = null;
                        } else {
                            fjVar = p7Var.f31328b[0];
                        }
                        if (fjVar != null) {
                            int i11 = fjVar.f24073k.date;
                            tzVar.getClass();
                            String u10 = org.telegram.messenger.gd.u(i11, false);
                            if (!TextUtils.equals(tzVar.f52499c, u10)) {
                                tzVar.f52499c = u10;
                                tzVar.f52497a.t(u10, true, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            View pinnedHeader = b00Var.f45845b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.y3) {
                org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) pinnedHeader;
                CharSequence text = y3Var.getText();
                if (!TextUtils.isEmpty(text) && y3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(tzVar.f52499c, charSequence)) {
                        tzVar.f52499c = charSequence;
                        tzVar.f52497a.t(charSequence, true, true);
                    }
                    if (i10 != 0) {
                        org.telegram.messenger.g0.r(kzVar);
                        org.telegram.messenger.g0.h3(kzVar, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            org.telegram.messenger.g0.r(kzVar);
            aVar.a(false, true);
        }
    }
}
