package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class t10 implements org.telegram.ui.Cells.n7 {
    public final u10 f37595a;

    public t10(u10 u10Var) {
        this.f37595a = u10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        x10 x10Var = this.f37595a.v;
        if (z10) {
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) x10Var.K, (org.telegram.ui.ActionBar.f6) null, false);
            f3Var.fixNavigationBar();
            f3Var.title = str;
            f3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            lg.j jVar = new lg.j(7, this, str);
            f3Var.items = charSequenceArr;
            f3Var.onClickListener = jVar;
            x10Var.L.showDialog(f3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = x10.f39291s0;
        x10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        x10 x10Var = this.f37595a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = x10.f39291s0;
        org.telegram.ui.Components.vu.J(x10Var.L, messageObject, x10Var.f39302g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean e() {
        return !this.f37595a.v.f39310o0.g();
    }
}
