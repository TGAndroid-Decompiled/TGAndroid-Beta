package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class uj extends s4.u {
    public boolean S;
    public final wn T;

    public uj(wn wnVar, boolean z10) {
        super(z10);
        this.T = wnVar;
    }

    @Override
    public final boolean C1(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages k92;
        byte b10;
        wn wnVar = this.T;
        hm hmVar = wnVar.A0;
        int i12 = hmVar.J;
        if (i10 >= i12 && i10 < hmVar.K && (i11 = i10 - i12) >= 0 && i11 < hmVar.L().size() && (k92 = wnVar.k9((messageObject = (MessageObject) wnVar.A0.L().get(i11)))) != null) {
            MessageObject.GroupedMessagePosition position = k92.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = k92.posArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = k92.posArray.get(i13);
                    if (groupedMessagePosition != position) {
                        byte b11 = groupedMessagePosition.minY;
                        byte b12 = position.minY;
                        if (b11 <= b12 && groupedMessagePosition.maxY >= b12) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean D1(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            return !((org.telegram.ui.Cells.s1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override
    public final int G() {
        if (this.S) {
            return (int) this.T.I9;
        }
        return 0;
    }

    @Override
    public final int J() {
        if (this.S) {
            return (int) this.T.I9;
        }
        return F();
    }

    @Override
    public final int K() {
        if (this.S) {
            return (int) ((this.f47863n - this.T.I9) - C());
        }
        return super.K();
    }

    @Override
    public final int X0() {
        return (int) this.T.I9;
    }

    @Override
    public final void b0(rf.e eVar, s4.b1 b1Var) {
        rj rjVar;
        hm hmVar;
        int i10;
        wn wnVar = this.T;
        int i11 = wnVar.pb;
        if (i11 != 0 && wnVar.f45257qb != Integer.MIN_VALUE && (rjVar = wnVar.f45339x0) != null && (hmVar = wnVar.A0) != null && !hmVar.N && !rjVar.V1) {
            MessageObject messageObject = (MessageObject) wnVar.E6[0].get(i11);
            if (messageObject != null) {
                i10 = wnVar.K6.indexOf(messageObject);
            } else {
                i10 = -1;
            }
            if (i10 >= 0) {
                this.f47752y = wnVar.A0.J + i10;
                this.A = wnVar.f45257qb - wnVar.f45339x0.getPaddingTop();
                this.f47753z = false;
                s4.b0 b0Var = this.B;
                if (b0Var != null) {
                    b0Var.f47726a = -1;
                }
            }
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(eVar, b1Var);
            return;
        }
        try {
            super.b0(eVar, b1Var);
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new xi(this, 3));
        }
    }

    @Override
    public final void i1(int i10, int i11, boolean z10) {
        if (!z10) {
            i11 = (int) ((i11 - F()) + this.T.I9);
        }
        super.i1(i10, i11, z10);
    }

    @Override
    public final int j(s4.b1 b1Var) {
        this.S = true;
        int B0 = B0(b1Var);
        this.S = false;
        return B0;
    }

    @Override
    public final int k(s4.b1 b1Var) {
        this.S = true;
        int C0 = C0(b1Var);
        this.S = false;
        return C0;
    }

    @Override
    public final int l(s4.b1 b1Var) {
        this.S = true;
        int D0 = D0(b1Var);
        this.S = false;
        return D0;
    }

    @Override
    public final int o0(int r11, rf.e r12, s4.b1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uj.o0(int, rf.e, s4.b1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
        this.T.Ia = false;
        mi.n nVar = new mi.n(recyclerView.getContext(), 0);
        nVar.f47715a = i10;
        w0(nVar);
    }

    @Override
    public final boolean y0() {
        return true;
    }
}
