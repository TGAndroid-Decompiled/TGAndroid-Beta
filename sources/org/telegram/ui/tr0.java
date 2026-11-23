package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tr0 implements Runnable {
    public final int f52334a = 1;
    public final bs0 f52335b;
    public final boolean f52336c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.g2 f52337e;
    public final ArrayList f52338f;

    public tr0(bs0 bs0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList) {
        this.f52335b = bs0Var;
        this.f52336c = z10;
        this.d = pollAnswer;
        this.f52337e = g2Var;
        this.f52338f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f52334a) {
            case 0:
                bs0 bs0Var = this.f52335b;
                bs0Var.getClass();
                boolean z10 = this.f52336c;
                org.telegram.ui.ActionBar.g2 g2Var = this.f52337e;
                if (!z10) {
                    g2Var.getSendMessagesHelper().w0(bs0Var.I, null, null);
                } else {
                    ArrayList arrayList = this.f52338f;
                    arrayList.remove(this.d);
                    g2Var.getSendMessagesHelper().w0(bs0Var.I, arrayList, null);
                }
                bs0Var.c(true);
                return;
            default:
                bs0 bs0Var2 = this.f52335b;
                bs0Var2.getClass();
                boolean z11 = this.f52336c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.g2 g2Var2 = this.f52337e;
                if (!z11) {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    g2Var2.getSendMessagesHelper().w0(bs0Var2.I, arrayList2, null);
                } else {
                    ArrayList arrayList3 = this.f52338f;
                    arrayList3.add(pollAnswer);
                    g2Var2.getSendMessagesHelper().w0(bs0Var2.I, arrayList3, null);
                }
                bs0Var2.c(true);
                return;
        }
    }

    public tr0(bs0 bs0Var, boolean z10, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f52335b = bs0Var;
        this.f52336c = z10;
        this.f52337e = g2Var;
        this.f52338f = arrayList;
        this.d = pollAnswer;
    }
}
