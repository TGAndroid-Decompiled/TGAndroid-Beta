package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class rz extends v4.u0 {
    public final c00 f51792a;

    public rz(c00 c00Var) {
        this.f51792a = c00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            org.telegram.messenger.g0.v1(this.f51792a.L.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.fj fjVar;
        c00 c00Var = this.f51792a;
        uz uzVar = c00Var.f46361n0;
        v4.c0 c0Var = c00Var.f46358k0;
        te.a aVar = c00Var.f46343a;
        lz lzVar = c00Var.f46362o0;
        if (recyclerView.getAdapter() != null && c00Var.d != null) {
            int L0 = c0Var.L0();
            int N0 = c0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int b10 = recyclerView.getAdapter().b();
            if (!c00Var.N && abs > 0 && N0 >= b10 - 10 && !c00Var.O) {
                org.telegram.messenger.g0.g3(new lz(this, 1));
            }
            if (c00Var.d == c00Var.V) {
                if (i10 != 0 && !c00Var.f46352f.isEmpty() && TextUtils.isEmpty(c00Var.R)) {
                    org.telegram.messenger.g0.r(lzVar);
                    org.telegram.messenger.g0.h3(lzVar, 1650L);
                    aVar.a(true, true);
                }
                v4.f1 K = recyclerView.K(L0);
                if (K != null && K.f59165f == 0) {
                    View view = K.f59161a;
                    if (view instanceof org.telegram.ui.Cells.q7) {
                        org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
                        if (q7Var.f31322e <= 0) {
                            fjVar = null;
                        } else {
                            fjVar = q7Var.f31320b[0];
                        }
                        if (fjVar != null) {
                            int i11 = fjVar.f23993k.date;
                            uzVar.getClass();
                            String u10 = org.telegram.messenger.gd.u(i11, false);
                            if (!TextUtils.equals(uzVar.f52652c, u10)) {
                                uzVar.f52652c = u10;
                                uzVar.f52650a.t(u10, true, true);
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
            View pinnedHeader = c00Var.f46345b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.y3) {
                org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) pinnedHeader;
                CharSequence text = y3Var.getText();
                if (!TextUtils.isEmpty(text) && y3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(uzVar.f52652c, charSequence)) {
                        uzVar.f52652c = charSequence;
                        uzVar.f52650a.t(charSequence, true, true);
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
