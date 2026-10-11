package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class r10 implements org.telegram.ui.Cells.m7 {
    public final s10 f41330a;

    public r10(s10 s10Var) {
        this.f41330a = s10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        v10 v10Var = this.f41330a.v;
        if (z10) {
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) v10Var.K, (org.telegram.ui.ActionBar.d6) null, false);
            e3Var.fixNavigationBar();
            e3Var.title = str;
            e3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            lg.j jVar = new lg.j(7, this, str);
            e3Var.items = charSequenceArr;
            e3Var.onClickListener = jVar;
            v10Var.L.showDialog(e3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = v10.f42861s0;
        v10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        v10 v10Var = this.f41330a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = v10.f42861s0;
        org.telegram.ui.Components.mv.J(v10Var.L, messageObject, v10Var.f42873g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean e() {
        return !this.f41330a.v.f42881o0.g();
    }
}
