package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;
public final class v00 implements org.telegram.ui.Cells.n7 {
    public final w00 f42560a;

    public v00(w00 w00Var) {
        this.f42560a = w00Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        z00 z00Var = this.f42560a.f42846w;
        if (z10) {
            org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(z00Var.K, false, 1, null);
            h.O = str;
            h.P = false;
            eg.j jVar = new eg.j(8, this, str);
            h.L = new CharSequence[]{org.telegram.messenger.cd.L0(2131747833, null), org.telegram.messenger.cd.L0(2131751767, null)};
            h.K = jVar;
            z00Var.L.showDialog(h);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = z00.f43938s0;
        z00Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.jj jjVar) {
        z00 z00Var = this.f42560a.f42846w;
        SpannableStringBuilder[] spannableStringBuilderArr = z00.f43938s0;
        org.telegram.ui.Components.hu.K0(z00Var.L, jjVar, z00Var.f43949g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f42560a.f42846w.f43957o0.f();
    }
}
