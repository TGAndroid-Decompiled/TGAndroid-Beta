package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xv0 implements Runnable {
    public final int f40053a = 1;
    public final gw0 f40054b;
    public final boolean f40055c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.o2 e;
    public final ArrayList f40056f;

    public xv0(gw0 gw0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList) {
        this.f40054b = gw0Var;
        this.f40055c = z10;
        this.d = pollAnswer;
        this.e = o2Var;
        this.f40056f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f40053a) {
            case 0:
                gw0 gw0Var = this.f40054b;
                gw0Var.getClass();
                boolean z10 = this.f40055c;
                org.telegram.ui.ActionBar.o2 o2Var = this.e;
                if (!z10) {
                    o2Var.getSendMessagesHelper().sendVote(gw0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f40056f;
                    arrayList.remove(this.d);
                    o2Var.getSendMessagesHelper().sendVote(gw0Var.H, arrayList, null);
                }
                gw0Var.c(true);
                return;
            default:
                gw0 gw0Var2 = this.f40054b;
                gw0Var2.getClass();
                boolean z11 = this.f40055c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = this.e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    o2Var2.getSendMessagesHelper().sendVote(gw0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f40056f;
                    arrayList3.add(pollAnswer);
                    o2Var2.getSendMessagesHelper().sendVote(gw0Var2.H, arrayList3, null);
                }
                gw0Var2.c(true);
                return;
        }
    }

    public xv0(gw0 gw0Var, boolean z10, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f40054b = gw0Var;
        this.f40055c = z10;
        this.e = o2Var;
        this.f40056f = arrayList;
        this.d = pollAnswer;
    }
}
