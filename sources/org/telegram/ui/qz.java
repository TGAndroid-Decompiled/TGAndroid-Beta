package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class qz extends v4.s0 {
    public final b00 f49179a;

    public qz(b00 b00Var) {
        this.f49179a = b00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            org.telegram.messenger.g0.v1(this.f49179a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.ij ijVar;
        b00 b00Var = this.f49179a;
        tz tzVar = b00Var.m0;
        v4.b0 b0Var = b00Var.f43874j0;
        te.a aVar = b00Var.f43860a;
        kz kzVar = b00Var.f43878n0;
        if (recyclerView.getAdapter() != null && b00Var.d != null) {
            int L0 = b0Var.L0();
            int N0 = b0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int b10 = recyclerView.getAdapter().b();
            if (!b00Var.M && abs > 0 && N0 >= b10 - 10 && !b00Var.N) {
                org.telegram.messenger.g0.h3(new kz(this, 1));
            }
            if (b00Var.d == b00Var.U) {
                if (i10 != 0 && !b00Var.f43869f.isEmpty() && TextUtils.isEmpty(b00Var.Q)) {
                    org.telegram.messenger.g0.r(kzVar);
                    org.telegram.messenger.g0.i3(kzVar, 1650L);
                    aVar.a(true, true);
                }
                v4.d1 K = recyclerView.K(L0);
                if (K != null && K.f57056f == 0) {
                    View view = K.f57052a;
                    if (view instanceof org.telegram.ui.Cells.p7) {
                        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                        if (p7Var.f29755e <= 0) {
                            ijVar = null;
                        } else {
                            ijVar = p7Var.f29753b[0];
                        }
                        if (ijVar != null) {
                            int i11 = ijVar.f23266k.date;
                            tzVar.getClass();
                            String u10 = org.telegram.messenger.id.u(i11, false);
                            if (!TextUtils.equals(tzVar.f50359c, u10)) {
                                tzVar.f50359c = u10;
                                tzVar.f50357a.t(u10, true, true);
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
            View pinnedHeader = b00Var.f43862b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) pinnedHeader;
                CharSequence text = x3Var.getText();
                if (!TextUtils.isEmpty(text) && x3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(tzVar.f50359c, charSequence)) {
                        tzVar.f50359c = charSequence;
                        tzVar.f50357a.t(charSequence, true, true);
                    }
                    if (i10 != 0) {
                        org.telegram.messenger.g0.r(kzVar);
                        org.telegram.messenger.g0.i3(kzVar, 1650L);
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
