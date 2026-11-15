package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class ve0 extends LinearLayout implements org.telegram.messenger.is {
    public final org.telegram.ui.Components.i9 f52208a;
    public final int f52209b;

    public ve0(Context context) {
        super(context);
        this.f52209b = org.telegram.messenger.m10.f24934t0;
        setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        setOrientation(1);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f52208a = i9Var;
        addView(i9Var, c8.ja.t(104, 104, 49, 0, 2, 0, 0));
    }

    public final void a() {
        boolean z10;
        int i7 = this.f52209b;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.si.b0(i7).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = org.telegram.messenger.si.b0(i7).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 4) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
            this.f52208a.k(org.telegram.messenger.gc.b(document), "104_104", "tgs", org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.j6.f28792a7, 1.0f, null), tL_messages_stickerSet);
            return;
        }
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i7);
        if (tL_messages_stickerSet == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b02.c1("tg_placeholders_android", false, z10);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25607y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.ns.f(this.f52209b).c(this, org.telegram.messenger.ns.f25607y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.f(this.f52209b).n(this, org.telegram.messenger.ns.f25607y0);
    }
}
