package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zu0 implements Runnable {
    public final int f45334a = 1;
    public final iv0 f45335b;
    public final boolean f45336c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.o2 f45337e;
    public final ArrayList f45338f;

    public zu0(iv0 iv0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList) {
        this.f45335b = iv0Var;
        this.f45336c = z10;
        this.d = pollAnswer;
        this.f45337e = o2Var;
        this.f45338f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f45334a) {
            case 0:
                iv0 iv0Var = this.f45335b;
                iv0Var.getClass();
                boolean z10 = this.f45336c;
                org.telegram.ui.ActionBar.o2 o2Var = this.f45337e;
                if (!z10) {
                    o2Var.getSendMessagesHelper().sendVote(iv0Var.D, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f45338f;
                    arrayList.remove(this.d);
                    o2Var.getSendMessagesHelper().sendVote(iv0Var.D, arrayList, null);
                }
                iv0Var.c(true);
                return;
            default:
                iv0 iv0Var2 = this.f45335b;
                iv0Var2.getClass();
                boolean z11 = this.f45336c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = this.f45337e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    o2Var2.getSendMessagesHelper().sendVote(iv0Var2.D, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f45338f;
                    arrayList3.add(pollAnswer);
                    o2Var2.getSendMessagesHelper().sendVote(iv0Var2.D, arrayList3, null);
                }
                iv0Var2.c(true);
                return;
        }
    }

    public zu0(iv0 iv0Var, boolean z10, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f45335b = iv0Var;
        this.f45336c = z10;
        this.f45337e = o2Var;
        this.f45338f = arrayList;
        this.d = pollAnswer;
    }
}
