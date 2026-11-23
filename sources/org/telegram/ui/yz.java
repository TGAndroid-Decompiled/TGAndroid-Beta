package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;
public final class yz implements org.telegram.ui.Cells.k7 {
    public final zz f54345a;

    public yz(zz zzVar) {
        this.f54345a = zzVar;
    }

    @Override
    public final void a(String str, boolean z10) {
        c00 c00Var = this.f54345a.f54671w;
        if (z10) {
            org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.o10.j(c00Var.L, false, 1, null);
            j3.P = str;
            j3.Q = false;
            og.j jVar = new og.j(7, this, str);
            j3.M = new CharSequence[]{org.telegram.messenger.hd.N0(2131747623, null), org.telegram.messenger.hd.N0(2131751755, null)};
            j3.L = jVar;
            c00Var.M.showDialog(j3);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = c00.f46345t0;
        c00Var.g(str);
    }

    @Override
    public final boolean b() {
        return !this.f54345a.f54671w.f46366p0.V1();
    }

    @Override
    public final void c(TLRPC.WebPage webPage, org.telegram.messenger.gj gjVar) {
        c00 c00Var = this.f54345a.f54671w;
        SpannableStringBuilder[] spannableStringBuilderArr = c00.f46345t0;
        org.telegram.ui.Components.iu.O0(c00Var.M, gjVar, c00Var.f46358h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }
}
