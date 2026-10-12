package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class u10 implements org.telegram.ui.Cells.m7 {
    public final v10 f42339a;

    public u10(v10 v10Var) {
        this.f42339a = v10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        y10 y10Var = this.f42339a.v;
        if (z10) {
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) y10Var.K, (org.telegram.ui.ActionBar.c6) null, false);
            e3Var.fixNavigationBar();
            e3Var.title = str;
            e3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            lg.j jVar = new lg.j(7, this, str);
            e3Var.items = charSequenceArr;
            e3Var.onClickListener = jVar;
            y10Var.L.showDialog(e3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = y10.f44240s0;
        y10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        y10 y10Var = this.f42339a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = y10.f44240s0;
        org.telegram.ui.Components.ov.J(y10Var.L, messageObject, y10Var.f44252g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean e() {
        return !this.f42339a.v.f44260o0.g();
    }
}
