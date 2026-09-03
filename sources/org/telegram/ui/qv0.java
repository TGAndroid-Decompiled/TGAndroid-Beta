package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qv0 implements Runnable {
    public final int f40698a = 1;
    public final yv0 f40699b;
    public final boolean f40700c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.p2 f40701e;
    public final ArrayList f40702f;

    public qv0(yv0 yv0Var, boolean z4, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList) {
        this.f40699b = yv0Var;
        this.f40700c = z4;
        this.d = pollAnswer;
        this.f40701e = p2Var;
        this.f40702f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f40698a) {
            case 0:
                yv0 yv0Var = this.f40699b;
                yv0Var.getClass();
                boolean z4 = this.f40700c;
                org.telegram.ui.ActionBar.p2 p2Var = this.f40701e;
                if (!z4) {
                    p2Var.getSendMessagesHelper().sendVote(yv0Var.E, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f40702f;
                    arrayList.remove(this.d);
                    p2Var.getSendMessagesHelper().sendVote(yv0Var.E, arrayList, null);
                }
                yv0Var.c(true);
                return;
            default:
                yv0 yv0Var2 = this.f40699b;
                yv0Var2.getClass();
                boolean z10 = this.f40700c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = this.f40701e;
                if (!z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    p2Var2.getSendMessagesHelper().sendVote(yv0Var2.E, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f40702f;
                    arrayList3.add(pollAnswer);
                    p2Var2.getSendMessagesHelper().sendVote(yv0Var2.E, arrayList3, null);
                }
                yv0Var2.c(true);
                return;
        }
    }

    public qv0(yv0 yv0Var, boolean z4, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f40699b = yv0Var;
        this.f40700c = z4;
        this.f40701e = p2Var;
        this.f40702f = arrayList;
        this.d = pollAnswer;
    }
}
