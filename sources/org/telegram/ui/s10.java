package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class s10 implements org.telegram.ui.Cells.m7 {
    public final t10 f37266a;

    public s10(t10 t10Var) {
        this.f37266a = t10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        w10 w10Var = this.f37266a.v;
        if (z10) {
            org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, (Context) w10Var.K, (org.telegram.ui.ActionBar.e6) null, false);
            g3Var.fixNavigationBar();
            g3Var.title = str;
            g3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            lg.j jVar = new lg.j(7, this, str);
            g3Var.items = charSequenceArr;
            g3Var.onClickListener = jVar;
            w10Var.L.showDialog(g3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = w10.f38754s0;
        w10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        w10 w10Var = this.f37266a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = w10.f38754s0;
        org.telegram.ui.Components.xu.J(w10Var.L, messageObject, w10Var.f38765g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean e() {
        return !this.f37266a.v.f38773o0.g();
    }
}
