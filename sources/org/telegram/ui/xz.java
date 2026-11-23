package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;
public final class xz implements org.telegram.ui.Cells.j7 {
    public final yz f54130a;

    public xz(yz yzVar) {
        this.f54130a = yzVar;
    }

    @Override
    public final void a(String str, boolean z10) {
        b00 b00Var = this.f54130a.f54454w;
        if (z10) {
            org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.m10.j(b00Var.L, false, 1, null);
            j3.P = str;
            j3.Q = false;
            og.j jVar = new og.j(7, this, str);
            j3.M = new CharSequence[]{org.telegram.messenger.gd.N0(2131747623, null), org.telegram.messenger.gd.N0(2131751755, null)};
            j3.L = jVar;
            b00Var.M.showDialog(j3);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = b00.f45842t0;
        b00Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.fj fjVar) {
        b00 b00Var = this.f54130a.f54454w;
        SpannableStringBuilder[] spannableStringBuilderArr = b00.f45842t0;
        org.telegram.ui.Components.gu.O0(b00Var.M, fjVar, b00Var.f45855h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean d() {
        return !this.f54130a.f54454w.f45863p0.i0();
    }
}
