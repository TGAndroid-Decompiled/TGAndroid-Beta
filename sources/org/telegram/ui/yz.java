package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;
public final class yz implements org.telegram.ui.Cells.j7 {
    public final zz f54340a;

    public yz(zz zzVar) {
        this.f54340a = zzVar;
    }

    @Override
    public final void a(String str, boolean z10) {
        c00 c00Var = this.f54340a.f54619w;
        if (z10) {
            org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.n10.j(c00Var.L, false, 1, null);
            j3.P = str;
            j3.Q = false;
            og.j jVar = new og.j(7, this, str);
            j3.M = new CharSequence[]{org.telegram.messenger.gd.M0(2131747624, null), org.telegram.messenger.gd.M0(2131751756, null)};
            j3.L = jVar;
            c00Var.M.showDialog(j3);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = c00.f46328t0;
        c00Var.g(str);
    }

    @Override
    public final boolean b() {
        return !this.f54340a.f54619w.f46349p0.V1();
    }

    @Override
    public final void c(TLRPC.WebPage webPage, org.telegram.messenger.fj fjVar) {
        c00 c00Var = this.f54340a.f54619w;
        SpannableStringBuilder[] spannableStringBuilderArr = c00.f46328t0;
        org.telegram.ui.Components.gu.O0(c00Var.M, fjVar, c00Var.f46341h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }
}
