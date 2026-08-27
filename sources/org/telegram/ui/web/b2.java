package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class b2 implements Utilities.Callback {

    public final int f43785a;

    public final c2 f43786b;

    public b2(c2 c2Var, int i10) {
        this.f43785a = i10;
        this.f43786b = c2Var;
    }

    @Override
    public final void run(Object obj) {
        e2 e2Var = (e2) obj;
        switch (this.f43785a) {
            case 0:
                c2 c2Var = this.f43786b;
                c2Var.f43803l = null;
                c2Var.f43800i = true;
                TLRPC.TL_webPage tL_webPage = c2Var.f43801j;
                if (tL_webPage != null) {
                    e2.o(tL_webPage);
                }
                c2Var.f43801j = e2Var.f43826c;
                c2Var.c();
                break;
            default:
                c2 c2Var2 = this.f43786b;
                c2Var2.f43803l = null;
                c2Var2.f43800i = true;
                TLRPC.TL_webPage tL_webPage2 = c2Var2.f43801j;
                if (tL_webPage2 != null) {
                    e2.o(tL_webPage2);
                }
                c2Var2.f43801j = e2Var.f43826c;
                c2Var2.c();
                break;
        }
    }
}
