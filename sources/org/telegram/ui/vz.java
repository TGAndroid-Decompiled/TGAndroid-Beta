package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;
public final class vz implements org.telegram.ui.Cells.i7 {
    public final wz f52329a;

    public vz(wz wzVar) {
        this.f52329a = wzVar;
    }

    @Override
    public final void a(String str, boolean z10) {
        zz zzVar = this.f52329a.f53031w;
        if (z10) {
            org.telegram.ui.ActionBar.u2 i7 = org.telegram.messenger.i20.i(zzVar.L, false, 1, null);
            i7.P = str;
            i7.Q = false;
            og.j jVar = new og.j(7, this, str);
            i7.M = new CharSequence[]{org.telegram.messenger.hd.M0(2131747817, null), org.telegram.messenger.hd.M0(2131751767, null)};
            i7.L = jVar;
            zzVar.M.showDialog(i7);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = zz.f54072t0;
        zzVar.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.gj gjVar) {
        zz zzVar = this.f52329a.f53031w;
        SpannableStringBuilder[] spannableStringBuilderArr = zz.f54072t0;
        org.telegram.ui.Components.bu.N0(zzVar.M, gjVar, zzVar.f54085h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f52329a.f53031w.f54093p0.g0();
    }
}
