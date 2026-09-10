package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class v10 implements org.telegram.ui.Cells.n7 {
    public final w10 f37389a;

    public v10(w10 w10Var) {
        this.f37389a = w10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        z10 z10Var = this.f37389a.v;
        if (z10) {
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) z10Var.K, (org.telegram.ui.ActionBar.f6) null, false);
            h3Var.fixNavigationBar();
            h3Var.title = str;
            h3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            kg.j jVar = new kg.j(8, this, str);
            h3Var.items = charSequenceArr;
            h3Var.onClickListener = jVar;
            z10Var.L.showDialog(h3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = z10.f39159s0;
        z10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        z10 z10Var = this.f37389a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = z10.f39159s0;
        org.telegram.ui.Components.zu.J(z10Var.L, messageObject, z10Var.f39170g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean e() {
        return !this.f37389a.v.f39178o0.f();
    }
}
