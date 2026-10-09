package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class s10 implements org.telegram.ui.Cells.m7 {
    public final t10 f41555a;

    public s10(t10 t10Var) {
        this.f41555a = t10Var;
    }

    @Override
    public final void a(String str, boolean z10) {
        w10 w10Var = this.f41555a.v;
        if (z10) {
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) w10Var.K, (org.telegram.ui.ActionBar.e6) null, false);
            f3Var.fixNavigationBar();
            f3Var.title = str;
            f3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            lg.j jVar = new lg.j(7, this, str);
            f3Var.items = charSequenceArr;
            f3Var.onClickListener = jVar;
            w10Var.L.showDialog(f3Var);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = w10.f43041s0;
        w10Var.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        w10 w10Var = this.f41555a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = w10.f43041s0;
        org.telegram.ui.Components.lv.J(w10Var.L, messageObject, w10Var.f43053g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean e() {
        return !this.f41555a.v.f43061o0.g();
    }
}
