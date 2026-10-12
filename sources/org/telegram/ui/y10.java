package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class y10 implements org.telegram.ui.Cells.m7 {
    public final z10 f42006a;

    public y10(z10 z10Var) {
        this.f42006a = z10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        c20 c20Var = this.f42006a.v;
        if (z10) {
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) c20Var.K, (org.telegram.ui.ActionBar.c6) null, false);
            e3Var.fixNavigationBar();
            e3Var.title = str;
            e3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            mg.j jVar = new mg.j(7, this, str);
            e3Var.items = charSequenceArr;
            e3Var.onClickListener = jVar;
            c20Var.L.showDialog(e3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = c20.f34678s0;
        c20Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        c20 c20Var = this.f42006a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = c20.f34678s0;
        org.telegram.ui.Components.hv.J(c20Var.L, messageObject, c20Var.f34689g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f42006a.v.f34697o0.g();
    }
}
