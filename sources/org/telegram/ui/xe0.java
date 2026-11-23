package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class xe0 extends LinearLayout implements org.telegram.messenger.fs {
    public final org.telegram.ui.Components.p9 f53956a;
    public final int f53957b;

    public xe0(Context context) {
        super(context);
        this.f53957b = org.telegram.messenger.i10.f24637t0;
        setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        setOrientation(1);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f53956a = p9Var;
        addView(p9Var, c8.na.t(104, 104, 49, 0, 2, 0, 0));
    }

    public final void a() {
        boolean z10;
        int i7 = this.f53957b;
        TLRPC.TL_messages_stickerSet r02 = org.telegram.messenger.ri.d0(i7).r0("tg_placeholders_android");
        if (r02 == null) {
            r02 = org.telegram.messenger.ri.d0(i7).p0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = r02;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 4) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
            this.f53956a.k(org.telegram.messenger.fc.b(document), "104_104", "tgs", org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.n6.f29394a7, 1.0f, null), tL_messages_stickerSet);
            return;
        }
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i7);
        if (tL_messages_stickerSet == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d02.f1("tg_placeholders_android", false, z10);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25324y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.ks.f(this.f53957b).c(this, org.telegram.messenger.ks.f25324y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.f53957b).n(this, org.telegram.messenger.ks.f25324y0);
    }
}
