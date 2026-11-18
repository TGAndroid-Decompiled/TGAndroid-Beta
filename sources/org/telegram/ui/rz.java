package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class rz extends v4.u0 {
    public final c00 f51828a;

    public rz(c00 c00Var) {
        this.f51828a = c00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            org.telegram.messenger.g0.v1(this.f51828a.L.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.fj fjVar;
        c00 c00Var = this.f51828a;
        uz uzVar = c00Var.f46347n0;
        v4.c0 c0Var = c00Var.f46344k0;
        te.a aVar = c00Var.f46329a;
        lz lzVar = c00Var.f46348o0;
        if (recyclerView.getAdapter() != null && c00Var.d != null) {
            int L0 = c0Var.L0();
            int N0 = c0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int b10 = recyclerView.getAdapter().b();
            if (!c00Var.N && abs > 0 && N0 >= b10 - 10 && !c00Var.O) {
                org.telegram.messenger.g0.g3(new lz(this, 1));
            }
            if (c00Var.d == c00Var.V) {
                if (i10 != 0 && !c00Var.f46338f.isEmpty() && TextUtils.isEmpty(c00Var.R)) {
                    org.telegram.messenger.g0.r(lzVar);
                    org.telegram.messenger.g0.h3(lzVar, 1650L);
                    aVar.a(true, true);
                }
                v4.f1 K = recyclerView.K(L0);
                if (K != null && K.f59126f == 0) {
                    View view = K.f59122a;
                    if (view instanceof org.telegram.ui.Cells.p7) {
                        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                        if (p7Var.f31244e <= 0) {
                            fjVar = null;
                        } else {
                            fjVar = p7Var.f31242b[0];
                        }
                        if (fjVar != null) {
                            int i11 = fjVar.f23968k.date;
                            uzVar.getClass();
                            String u10 = org.telegram.messenger.gd.u(i11, false);
                            if (!TextUtils.equals(uzVar.f52644c, u10)) {
                                uzVar.f52644c = u10;
                                uzVar.f52642a.t(u10, true, true);
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
            View pinnedHeader = c00Var.f46331b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) pinnedHeader;
                CharSequence text = x3Var.getText();
                if (!TextUtils.isEmpty(text) && x3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(uzVar.f52644c, charSequence)) {
                        uzVar.f52644c = charSequence;
                        uzVar.f52642a.t(charSequence, true, true);
                    }
                    if (i10 != 0) {
                        org.telegram.messenger.g0.r(lzVar);
                        org.telegram.messenger.g0.h3(lzVar, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            org.telegram.messenger.g0.r(lzVar);
            aVar.a(false, true);
        }
    }
}
