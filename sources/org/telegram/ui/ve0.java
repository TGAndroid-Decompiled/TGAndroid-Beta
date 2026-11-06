package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class ve0 extends LinearLayout implements org.telegram.messenger.ls {
    public final org.telegram.ui.Components.l9 f50714a;
    public final int f50715b;

    public ve0(Context context) {
        super(context);
        this.f50715b = org.telegram.messenger.p10.f24459s0;
        setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        setOrientation(1);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f50714a = l9Var;
        addView(l9Var, c8.ha.t(104, 104, 49, 0, 2, 0, 0));
    }

    public final void a() {
        boolean z9;
        int i7 = this.f50715b;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.ui.b0(i7).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = org.telegram.messenger.ui.b0(i7).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 4) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
            this.f50714a.k(org.telegram.messenger.hc.b(document), "104_104", "tgs", org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.f27792a7, 1.0f, null), tL_messages_stickerSet);
            return;
        }
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i7);
        if (tL_messages_stickerSet == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        b02.c1("tg_placeholders_android", false, z9);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25094y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.qs.f(this.f50715b).c(this, org.telegram.messenger.qs.f25094y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.f50715b).n(this, org.telegram.messenger.qs.f25094y0);
    }
}
