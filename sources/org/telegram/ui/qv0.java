package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qv0 implements Runnable {
    public final int f37505a = 1;
    public final yv0 f37506b;
    public final boolean f37507c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.p2 e;
    public final ArrayList f37508f;

    public qv0(yv0 yv0Var, boolean z4, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList) {
        this.f37506b = yv0Var;
        this.f37507c = z4;
        this.d = pollAnswer;
        this.e = p2Var;
        this.f37508f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f37505a) {
            case 0:
                yv0 yv0Var = this.f37506b;
                yv0Var.getClass();
                boolean z4 = this.f37507c;
                org.telegram.ui.ActionBar.p2 p2Var = this.e;
                if (!z4) {
                    p2Var.getSendMessagesHelper().sendVote(yv0Var.E, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f37508f;
                    arrayList.remove(this.d);
                    p2Var.getSendMessagesHelper().sendVote(yv0Var.E, arrayList, null);
                }
                yv0Var.c(true);
                return;
            default:
                yv0 yv0Var2 = this.f37506b;
                yv0Var2.getClass();
                boolean z10 = this.f37507c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = this.e;
                if (!z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    p2Var2.getSendMessagesHelper().sendVote(yv0Var2.E, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f37508f;
                    arrayList3.add(pollAnswer);
                    p2Var2.getSendMessagesHelper().sendVote(yv0Var2.E, arrayList3, null);
                }
                yv0Var2.c(true);
                return;
        }
    }

    public qv0(yv0 yv0Var, boolean z4, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f37506b = yv0Var;
        this.f37507c = z4;
        this.e = p2Var;
        this.f37508f = arrayList;
        this.d = pollAnswer;
    }
}
