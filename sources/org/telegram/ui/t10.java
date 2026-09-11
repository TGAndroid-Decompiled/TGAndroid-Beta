package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class t10 implements org.telegram.ui.Cells.m7 {
    public final u10 f40597a;

    public t10(u10 u10Var) {
        this.f40597a = u10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        x10 x10Var = this.f40597a.v;
        if (z10) {
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) x10Var.K, (org.telegram.ui.ActionBar.f6) null, false);
            f3Var.fixNavigationBar();
            f3Var.title = str;
            f3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            mg.j jVar = new mg.j(7, this, str);
            f3Var.items = charSequenceArr;
            f3Var.onClickListener = jVar;
            x10Var.L.showDialog(f3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = x10.f42534s0;
        x10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        x10 x10Var = this.f40597a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = x10.f42534s0;
        org.telegram.ui.Components.tu.J(x10Var.L, messageObject, x10Var.f42546g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean c() {
        return !this.f40597a.v.f42554o0.g();
    }
}
