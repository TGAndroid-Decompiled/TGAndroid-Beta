package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;
public final class uz implements org.telegram.ui.Cells.j7 {
    public final vz f50533a;

    public uz(vz vzVar) {
        this.f50533a = vzVar;
    }

    @Override
    public final void a(String str, boolean z9) {
        yz yzVar = this.f50533a.f50858w;
        if (z9) {
            org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(yzVar.K, false, 1, null);
            h.O = str;
            h.P = false;
            og.j jVar = new og.j(7, this, str);
            h.L = new CharSequence[]{org.telegram.messenger.hd.M0(2131747816, null), org.telegram.messenger.hd.M0(2131751767, null)};
            h.K = jVar;
            yzVar.L.showDialog(h);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = yz.f52379s0;
        yzVar.g(str);
    }

    @Override
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar) {
        yz yzVar = this.f50533a.f50858w;
        SpannableStringBuilder[] spannableStringBuilderArr = yz.f52379s0;
        org.telegram.ui.Components.vt.N0(yzVar.L, ijVar, yzVar.f52391g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean d() {
        return !this.f50533a.f50858w.f52399o0.i();
    }
}
