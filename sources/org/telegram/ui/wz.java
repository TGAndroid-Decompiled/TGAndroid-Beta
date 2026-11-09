package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;
public final class wz implements org.telegram.ui.Cells.j7 {
    public final xz f51505a;

    public wz(xz xzVar) {
        this.f51505a = xzVar;
    }

    @Override
    public final void a(String str, boolean z9) {
        a00 a00Var = this.f51505a.f51795w;
        if (z9) {
            org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(a00Var.K, false, 1, null);
            h.O = str;
            h.P = false;
            og.j jVar = new og.j(7, this, str);
            h.L = new CharSequence[]{org.telegram.messenger.id.M0(2131747817, null), org.telegram.messenger.id.M0(2131751767, null)};
            h.K = jVar;
            a00Var.L.showDialog(h);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = a00.f43509s0;
        a00Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar) {
        a00 a00Var = this.f51505a.f51795w;
        SpannableStringBuilder[] spannableStringBuilderArr = a00.f43509s0;
        org.telegram.ui.Components.wt.N0(a00Var.L, ijVar, a00Var.f43521g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean d() {
        return !this.f51505a.f51795w.f43529o0.i();
    }
}
