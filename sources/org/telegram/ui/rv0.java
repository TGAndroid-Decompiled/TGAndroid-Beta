package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rv0 implements Runnable {
    public final int f43178a = 1;
    public final zv0 f43179b;
    public final boolean f43180c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.r2 e;
    public final ArrayList f43181f;

    public rv0(zv0 zv0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.r2 r2Var, ArrayList arrayList) {
        this.f43179b = zv0Var;
        this.f43180c = z10;
        this.d = pollAnswer;
        this.e = r2Var;
        this.f43181f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f43178a) {
            case 0:
                zv0 zv0Var = this.f43179b;
                zv0Var.getClass();
                boolean z10 = this.f43180c;
                org.telegram.ui.ActionBar.r2 r2Var = this.e;
                if (!z10) {
                    r2Var.getSendMessagesHelper().sendVote(zv0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f43181f;
                    arrayList.remove(this.d);
                    r2Var.getSendMessagesHelper().sendVote(zv0Var.H, arrayList, null);
                }
                zv0Var.c(true);
                return;
            default:
                zv0 zv0Var2 = this.f43179b;
                zv0Var2.getClass();
                boolean z11 = this.f43180c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.r2 r2Var2 = this.e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    r2Var2.getSendMessagesHelper().sendVote(zv0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f43181f;
                    arrayList3.add(pollAnswer);
                    r2Var2.getSendMessagesHelper().sendVote(zv0Var2.H, arrayList3, null);
                }
                zv0Var2.c(true);
                return;
        }
    }

    public rv0(zv0 zv0Var, boolean z10, org.telegram.ui.ActionBar.r2 r2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f43179b = zv0Var;
        this.f43180c = z10;
        this.e = r2Var;
        this.f43181f = arrayList;
        this.d = pollAnswer;
    }
}
