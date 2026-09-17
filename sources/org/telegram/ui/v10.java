package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class v10 implements org.telegram.ui.Cells.m7 {
    public final w10 f38261a;

    public v10(w10 w10Var) {
        this.f38261a = w10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        z10 z10Var = this.f38261a.v;
        if (z10) {
            org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, (Context) z10Var.K, (org.telegram.ui.ActionBar.f6) null, false);
            g3Var.fixNavigationBar();
            g3Var.title = str;
            g3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            lg.j jVar = new lg.j(7, this, str);
            g3Var.items = charSequenceArr;
            g3Var.onClickListener = jVar;
            z10Var.L.showDialog(g3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = z10.f40068s0;
        z10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        z10 z10Var = this.f38261a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = z10.f40068s0;
        org.telegram.ui.Components.vu.J(z10Var.L, messageObject, z10Var.f40079g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean e() {
        return !this.f38261a.v.f40087o0.g();
    }
}
