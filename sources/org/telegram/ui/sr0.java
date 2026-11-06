package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sr0 implements Runnable {
    public final int f49819a = 1;
    public final zr0 f49820b;
    public final boolean f49821c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.f2 f49822e;
    public final ArrayList f49823f;

    public sr0(zr0 zr0Var, boolean z9, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList) {
        this.f49820b = zr0Var;
        this.f49821c = z9;
        this.d = pollAnswer;
        this.f49822e = f2Var;
        this.f49823f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f49819a) {
            case 0:
                zr0 zr0Var = this.f49820b;
                zr0Var.getClass();
                boolean z9 = this.f49821c;
                org.telegram.ui.ActionBar.f2 f2Var = this.f49822e;
                if (!z9) {
                    f2Var.getSendMessagesHelper().w0(zr0Var.H, null, null);
                } else {
                    ArrayList arrayList = this.f49823f;
                    arrayList.remove(this.d);
                    f2Var.getSendMessagesHelper().w0(zr0Var.H, arrayList, null);
                }
                zr0Var.c(true);
                return;
            default:
                zr0 zr0Var2 = this.f49820b;
                zr0Var2.getClass();
                boolean z10 = this.f49821c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.f2 f2Var2 = this.f49822e;
                if (!z10) {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    f2Var2.getSendMessagesHelper().w0(zr0Var2.H, arrayList2, null);
                } else {
                    ArrayList arrayList3 = this.f49823f;
                    arrayList3.add(pollAnswer);
                    f2Var2.getSendMessagesHelper().w0(zr0Var2.H, arrayList3, null);
                }
                zr0Var2.c(true);
                return;
        }
    }

    public sr0(zr0 zr0Var, boolean z9, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f49820b = zr0Var;
        this.f49821c = z9;
        this.f49822e = f2Var;
        this.f49823f = arrayList;
        this.d = pollAnswer;
    }
}
