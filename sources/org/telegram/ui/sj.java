package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class sj extends s4.t {
    public boolean S;
    public final sn T;

    public sj(sn snVar, boolean z10) {
        super(z10);
        this.T = snVar;
    }

    @Override
    public final boolean B1(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages c92;
        byte b10;
        sn snVar = this.T;
        fm fmVar = snVar.A0;
        int i12 = fmVar.J;
        if (i10 >= i12 && i10 < fmVar.K && (i11 = i10 - i12) >= 0 && i11 < fmVar.L().size() && (c92 = snVar.c9((messageObject = (MessageObject) snVar.A0.L().get(i11)))) != null) {
            MessageObject.GroupedMessagePosition position = c92.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = c92.posArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = c92.posArray.get(i13);
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
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            return !((org.telegram.ui.Cells.u1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override
    public final int G() {
        if (this.S) {
            return (int) this.T.f41398s9;
        }
        return 0;
    }

    @Override
    public final int J() {
        if (this.S) {
            return (int) this.T.f41398s9;
        }
        return F();
    }

    @Override
    public final int K() {
        if (this.S) {
            return (int) ((this.f46060n - this.T.f41398s9) - C());
        }
        return super.K();
    }

    @Override
    public final int X0() {
        return (int) this.T.f41398s9;
    }

    @Override
    public final void b0(qf.e eVar, s4.y0 y0Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(eVar, y0Var);
            return;
        }
        try {
            super.b0(eVar, y0Var);
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new vi(this, 3));
        }
    }

    @Override
    public final void i1(int i10, int i11, boolean z10) {
        if (!z10) {
            i11 = (int) ((i11 - F()) + this.T.f41398s9);
        }
        super.i1(i10, i11, z10);
    }

    @Override
    public final int j(s4.y0 y0Var) {
        this.S = true;
        int B0 = B0(y0Var);
        this.S = false;
        return B0;
    }

    @Override
    public final int k(s4.y0 y0Var) {
        this.S = true;
        int C0 = C0(y0Var);
        this.S = false;
        return C0;
    }

    @Override
    public final int l(s4.y0 y0Var) {
        this.S = true;
        int D0 = D0(y0Var);
        this.S = false;
        return D0;
    }

    @Override
    public final int o0(int r11, qf.e r12, s4.y0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sj.o0(int, qf.e, s4.y0):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        this.T.f41399sa = false;
        li.n nVar = new li.n(recyclerView.getContext(), 0);
        nVar.f46099a = i10;
        w0(nVar);
    }

    @Override
    public final boolean y0() {
        return true;
    }
}
