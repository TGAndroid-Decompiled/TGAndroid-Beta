package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qr0 implements Runnable {
    public final int f50781a = 1;
    public final xr0 f50782b;
    public final boolean f50783c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.e2 f50784e;
    public final ArrayList f50785f;

    public qr0(xr0 xr0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.e2 e2Var, ArrayList arrayList) {
        this.f50782b = xr0Var;
        this.f50783c = z10;
        this.d = pollAnswer;
        this.f50784e = e2Var;
        this.f50785f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f50781a) {
            case 0:
                xr0 xr0Var = this.f50782b;
                xr0Var.getClass();
                boolean z10 = this.f50783c;
                org.telegram.ui.ActionBar.e2 e2Var = this.f50784e;
                if (!z10) {
                    e2Var.getSendMessagesHelper().w0(xr0Var.I, null, null);
                } else {
                    ArrayList arrayList = this.f50785f;
                    arrayList.remove(this.d);
                    e2Var.getSendMessagesHelper().w0(xr0Var.I, arrayList, null);
                }
                xr0Var.c(true);
                return;
            default:
                xr0 xr0Var2 = this.f50782b;
                xr0Var2.getClass();
                boolean z11 = this.f50783c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.e2 e2Var2 = this.f50784e;
                if (!z11) {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    e2Var2.getSendMessagesHelper().w0(xr0Var2.I, arrayList2, null);
                } else {
                    ArrayList arrayList3 = this.f50785f;
                    arrayList3.add(pollAnswer);
                    e2Var2.getSendMessagesHelper().w0(xr0Var2.I, arrayList3, null);
                }
                xr0Var2.c(true);
                return;
        }
    }

    public qr0(xr0 xr0Var, boolean z10, org.telegram.ui.ActionBar.e2 e2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f50782b = xr0Var;
        this.f50783c = z10;
        this.f50784e = e2Var;
        this.f50785f = arrayList;
        this.d = pollAnswer;
    }
}
