package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class rl extends org.telegram.ui.Cells.j9 {
    public cn f49432w0;

    @Override
    public final void I(int i7, int i10, org.telegram.messenger.ij ijVar) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.messenger.dj T8;
        cn cnVar = this.f49432w0;
        if (cnVar != null) {
            int min = Math.min(i10, cnVar.getMessagesController().o4 + i7);
            if (ijVar.c1() != 0 && (T8 = this.f49432w0.T8(ijVar.c1())) != null && !T8.f22044i) {
                ijVar = T8.h;
            }
            if (ijVar != null) {
                sm b10 = sm.b(i7, min, ijVar);
                if (b10.f49885i != null) {
                    sj sjVar = this.f49432w0.Z;
                    boolean z9 = false;
                    if (sjVar != null && sjVar.getVisibility() == 0) {
                        lVar = ((org.telegram.ui.ActionBar.f2) this.f49432w0).actionBar;
                        if (lVar != null) {
                            lVar2 = ((org.telegram.ui.ActionBar.f2) this.f49432w0).actionBar;
                            if (lVar2.x()) {
                                this.f49432w0.O7(false);
                            }
                        }
                        this.f49432w0.ic(ijVar, b10);
                        sj sjVar2 = this.f49432w0.Z;
                        if (sjVar2 != null) {
                            sjVar2.H0();
                            return;
                        }
                        return;
                    }
                    cn cnVar2 = this.f49432w0;
                    cnVar2.B5 = b10;
                    cnVar2.D5 = ijVar;
                    if (cnVar2.h != null) {
                        z9 = true;
                    }
                    cnVar2.f44694v5 = new org.telegram.messenger.mj(z9, cnVar2.V9(), org.telegram.messenger.t3.p0(this.f49432w0.f44473e));
                    cn cnVar3 = this.f49432w0;
                    cnVar3.f44694v5.f(cnVar3.D5, cnVar3.T8(ijVar.c1()), this.f49432w0.a(), this.f49432w0.B5);
                    Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
                    h.putBoolean("quote", true);
                    h.putInt("messagesCount", 1);
                    h.putBoolean("canSelectTopics", true);
                    zw zwVar = new zw(h);
                    cn cnVar4 = this.f49432w0;
                    zwVar.D2 = cnVar4;
                    cnVar4.presentFragment(zwVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        cn cnVar;
        cn cnVar2 = this.f49432w0;
        if ((cnVar2 == null || cnVar2.a() != 489000) && (cnVar = this.f49432w0) != null) {
            if (org.telegram.messenger.m5.C(cnVar.a()) || !this.f49432w0.V9()) {
                org.telegram.ui.Cells.q9 q9Var = this.W;
                if (q9Var != null && ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f23266k != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f23266k.noforwards) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void d0(cn cnVar) {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f29392p0;
            if (i7 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i7))).cancel();
                i7++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.f49432w0 = cnVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.q9 q9Var;
        boolean z9;
        cn cnVar;
        org.telegram.ui.Cells.q9 q9Var2;
        TLRPC.Chat chat;
        cn cnVar2 = this.f49432w0;
        if (cnVar2 == null || cnVar2.a() != 489000) {
            cn cnVar3 = this.f49432w0;
            if ((cnVar3 != null && cnVar3.V9()) || ((q9Var = this.W) != null && ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f23266k != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f23266k.noforwards)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!this.f29395s0 && (cnVar = this.f49432w0) != null && cnVar.h == null && (((q9Var2 = this.W) == null || (((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().D != 23 && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().T4() && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().z3() && ((((org.telegram.ui.Cells.q1) this.W).getMessageObject().f23313w2 == null || org.telegram.messenger.ov.c(((org.telegram.ui.Cells.q1) this.W).getMessageObject())) && !this.f49432w0.s9.f29393q0))) && !this.f49432w0.getMessagesController().f24900s7.B(this.f49432w0.f44545j6) && !org.telegram.messenger.t10.A(this.f49432w0.f44545j6) && (!z9 || (chat = this.f49432w0.f44473e) == null || org.telegram.messenger.t3.B(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int o() {
        cn cnVar = this.f49432w0;
        if (cnVar == null) {
            return 0;
        }
        return cnVar.Wa;
    }

    @Override
    public final int p() {
        cn cnVar = this.f49432w0;
        if (cnVar == null) {
            return 0;
        }
        return (int) cnVar.N9;
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 q() {
        cn cnVar = this.f49432w0;
        if (cnVar != null) {
            return cnVar.f44750za;
        }
        return null;
    }

    @Override
    public final int t(int i7) {
        return org.telegram.ui.ActionBar.m6.w0(i7, this.f49432w0.f44750za);
    }
}
