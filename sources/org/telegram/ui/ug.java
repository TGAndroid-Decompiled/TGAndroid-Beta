package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ug implements RequestDelegate {
    public final int f50080a;
    public final wm f50081b;
    public final TLRPC.TL_attachMenuBot f50082c;
    public final TLRPC.User d;

    public ug(wm wmVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i3) {
        this.f50080a = i3;
        this.f50081b = wmVar;
        this.f50082c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50080a) {
            case 0:
                org.telegram.messenger.g0.h3(new vg(this.f50081b, this.f50082c, tL_error, this.d));
                return;
            default:
                org.telegram.messenger.g0.h3(new vg(this.f50081b, tL_error, this.f50082c, this.d));
                return;
        }
    }
}
