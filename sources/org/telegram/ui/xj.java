package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class xj extends s4.t {
    public boolean S;
    public final co T;

    public xj(co coVar, boolean z10) {
        super(z10);
        this.T = coVar;
    }

    @Override
    public final boolean B1(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        byte b10;
        co coVar = this.T;
        om omVar = coVar.A0;
        int i12 = omVar.J;
        if (i10 >= i12 && i10 < omVar.K && (i11 = i10 - i12) >= 0 && i11 < omVar.L().size() && (X8 = coVar.X8((messageObject = (MessageObject) coVar.A0.L().get(i11)))) != null) {
            MessageObject.GroupedMessagePosition position = X8.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = X8.posArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = X8.posArray.get(i13);
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
        if (view instanceof org.telegram.ui.Cells.t1) {
            return !((org.telegram.ui.Cells.t1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override
    public final int G() {
        if (this.S) {
            return (int) this.T.f35418s9;
        }
        return 0;
    }

    @Override
    public final int J() {
        if (this.S) {
            return (int) this.T.f35418s9;
        }
        return F();
    }

    @Override
    public final int K() {
        if (this.S) {
            return (int) ((this.f45852n - this.T.f35418s9) - C());
        }
        return super.K();
    }

    @Override
    public final int X0() {
        return (int) this.T.f35418s9;
    }

    @Override
    public final void b0(pf.e eVar, s4.z0 z0Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(eVar, z0Var);
            return;
        }
        try {
            super.b0(eVar, z0Var);
        } catch (Exception e7) {
            FileLog.e(e7);
            AndroidUtilities.runOnUIThread(new dj(this, 2));
        }
    }

    @Override
    public final void i1(int i10, int i11, boolean z10) {
        if (!z10) {
            i11 = (int) ((i11 - F()) + this.T.f35418s9);
        }
        super.i1(i10, i11, z10);
    }

    @Override
    public final int j(s4.z0 z0Var) {
        this.S = true;
        int B0 = B0(z0Var);
        this.S = false;
        return B0;
    }

    @Override
    public final int k(s4.z0 z0Var) {
        this.S = true;
        int C0 = C0(z0Var);
        this.S = false;
        return C0;
    }

    @Override
    public final int l(s4.z0 z0Var) {
        this.S = true;
        int D0 = D0(z0Var);
        this.S = false;
        return D0;
    }

    @Override
    public final int o0(int r11, pf.e r12, s4.z0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xj.o0(int, pf.e, s4.z0):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        this.T.f35419sa = false;
        ki.p pVar = new ki.p(recyclerView.getContext(), 0);
        pVar.f45906a = i10;
        w0(pVar);
    }

    @Override
    public final boolean y0() {
        return true;
    }
}
