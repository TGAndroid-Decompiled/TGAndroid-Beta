package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;
public final class u00 implements org.telegram.ui.Cells.n7 {
    public final v00 f41760a;

    public u00(v00 v00Var) {
        this.f41760a = v00Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        y00 y00Var = this.f41760a.f42375w;
        if (z10) {
            org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.a30.h(y00Var.K, false, 1, null);
            h.O = str;
            h.P = false;
            eg.j jVar = new eg.j(8, this, str);
            h.L = new CharSequence[]{org.telegram.messenger.dd.L0(2131747833, null), org.telegram.messenger.dd.L0(2131751767, null)};
            h.K = jVar;
            y00Var.L.showDialog(h);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = y00.f43495s0;
        y00Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.kj kjVar) {
        y00 y00Var = this.f41760a.f42375w;
        SpannableStringBuilder[] spannableStringBuilderArr = y00.f43495s0;
        org.telegram.ui.Components.hu.K0(y00Var.L, kjVar, y00Var.f43506g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f41760a.f42375w.f43514o0.f();
    }
}
