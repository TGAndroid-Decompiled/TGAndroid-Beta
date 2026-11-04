package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;
public final class sz implements org.telegram.ui.Cells.i7 {
    public final tz f49648a;

    public sz(tz tzVar) {
        this.f49648a = tzVar;
    }

    @Override
    public final void a(String str, boolean z10) {
        wz wzVar = this.f49648a.f49926w;
        if (z10) {
            org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(wzVar.L, false, 1, null);
            h.P = str;
            h.Q = false;
            u uVar = new u(6, this, str);
            h.M = new CharSequence[]{org.telegram.messenger.bd.M0(2131747825, null), org.telegram.messenger.bd.M0(2131751767, null)};
            h.L = uVar;
            wzVar.M.showDialog(h);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = wz.f51635t0;
        wzVar.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.zi ziVar) {
        wz wzVar = this.f49648a.f49926w;
        SpannableStringBuilder[] spannableStringBuilderArr = wz.f51635t0;
        org.telegram.ui.Components.ut.K0(wzVar.M, ziVar, wzVar.f51648h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f49648a.f49926w.f51656p0.I();
    }
}
