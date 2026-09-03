package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class vj extends f2.x {
    public boolean S;
    public final zn T;

    public vj(zn znVar, boolean z4) {
        super(z4);
        this.T = znVar;
    }

    @Override
    public final boolean B1(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        byte b10;
        zn znVar = this.T;
        lm lmVar = znVar.f40800x0;
        int i12 = lmVar.G;
        if (i10 >= i12 && i10 < lmVar.H && (i11 = i10 - i12) >= 0 && i11 < lmVar.L().size() && (X8 = znVar.X8((messageObject = (MessageObject) znVar.f40800x0.L().get(i11)))) != null) {
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
        if (view instanceof org.telegram.ui.Cells.s1) {
            return !((org.telegram.ui.Cells.s1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override
    public final int G() {
        if (this.S) {
            return (int) this.T.f40707p9;
        }
        return 0;
    }

    @Override
    public final int J() {
        if (this.S) {
            return (int) this.T.f40707p9;
        }
        return F();
    }

    @Override
    public final int K() {
        if (this.S) {
            return (int) ((this.f5846n - this.T.f40707p9) - C());
        }
        return super.K();
    }

    @Override
    public final int X0() {
        return (int) this.T.f40707p9;
    }

    @Override
    public final void b0(af.h hVar, f2.i1 i1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(hVar, i1Var);
            return;
        }
        try {
            super.b0(hVar, i1Var);
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new bj(this, 2));
        }
    }

    @Override
    public final void i1(int i10, int i11, boolean z4) {
        if (!z4) {
            i11 = (int) ((i11 - F()) + this.T.f40707p9);
        }
        super.i1(i10, i11, z4);
    }

    @Override
    public final int j(f2.i1 i1Var) {
        this.S = true;
        int B0 = B0(i1Var);
        this.S = false;
        return B0;
    }

    @Override
    public final int k(f2.i1 i1Var) {
        this.S = true;
        int C0 = C0(i1Var);
        this.S = false;
        return C0;
    }

    @Override
    public final int l(f2.i1 i1Var) {
        this.S = true;
        int D0 = D0(i1Var);
        this.S = false;
        return D0;
    }

    @Override
    public final int o0(int r11, af.h r12, f2.i1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vj.o0(int, af.h, f2.i1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        this.T.f40708pa = false;
        wh.o oVar = new wh.o(recyclerView.getContext(), 0);
        oVar.f5712a = i10;
        w0(oVar);
    }

    @Override
    public final boolean y0() {
        return true;
    }
}
