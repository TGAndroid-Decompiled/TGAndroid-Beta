package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sr0 implements Runnable {
    public final int f52144a = 1;
    public final zr0 f52145b;
    public final boolean f52146c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.g2 f52147e;
    public final ArrayList f52148f;

    public sr0(zr0 zr0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList) {
        this.f52145b = zr0Var;
        this.f52146c = z10;
        this.d = pollAnswer;
        this.f52147e = g2Var;
        this.f52148f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f52144a) {
            case 0:
                zr0 zr0Var = this.f52145b;
                zr0Var.getClass();
                boolean z10 = this.f52146c;
                org.telegram.ui.ActionBar.g2 g2Var = this.f52147e;
                if (!z10) {
                    g2Var.getSendMessagesHelper().w0(zr0Var.I, null, null);
                } else {
                    ArrayList arrayList = this.f52148f;
                    arrayList.remove(this.d);
                    g2Var.getSendMessagesHelper().w0(zr0Var.I, arrayList, null);
                }
                zr0Var.c(true);
                return;
            default:
                zr0 zr0Var2 = this.f52145b;
                zr0Var2.getClass();
                boolean z11 = this.f52146c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.g2 g2Var2 = this.f52147e;
                if (!z11) {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    g2Var2.getSendMessagesHelper().w0(zr0Var2.I, arrayList2, null);
                } else {
                    ArrayList arrayList3 = this.f52148f;
                    arrayList3.add(pollAnswer);
                    g2Var2.getSendMessagesHelper().w0(zr0Var2.I, arrayList3, null);
                }
                zr0Var2.c(true);
                return;
        }
    }

    public sr0(zr0 zr0Var, boolean z10, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f52145b = zr0Var;
        this.f52146c = z10;
        this.f52147e = g2Var;
        this.f52148f = arrayList;
        this.d = pollAnswer;
    }
}
