package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;
public final class xz implements org.telegram.ui.Cells.j7 {
    public final yz f51843a;

    public xz(yz yzVar) {
        this.f51843a = yzVar;
    }

    @Override
    public final void a(String str, boolean z9) {
        b00 b00Var = this.f51843a.f52152w;
        if (z9) {
            org.telegram.ui.ActionBar.w2 h = org.telegram.messenger.camera.q.h(b00Var.K, false, 1, null);
            h.O = str;
            h.P = false;
            og.j jVar = new og.j(7, this, str);
            h.L = new CharSequence[]{org.telegram.messenger.id.M0(2131747817, null), org.telegram.messenger.id.M0(2131751767, null)};
            h.K = jVar;
            b00Var.L.showDialog(h);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = b00.f43859s0;
        b00Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar) {
        b00 b00Var = this.f51843a.f52152w;
        SpannableStringBuilder[] spannableStringBuilderArr = b00.f43859s0;
        org.telegram.ui.Components.vt.N0(b00Var.L, ijVar, b00Var.f43871g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean d() {
        return !this.f51843a.f52152w.f43879o0.i();
    }
}
