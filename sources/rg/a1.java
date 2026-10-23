package rg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ei.q6;
import ei.r5;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.ja;
public final class a1 extends im0 {
    public final Context f45287c;
    public final ja d;
    public final q6 e;
    public final boolean f45288f;
    public final r5 h;

    public a1(r5 r5Var, Context context, ja jaVar, q6 q6Var, boolean z10) {
        this.h = r5Var;
        this.f45287c = context;
        this.d = jaVar;
        this.e = q6Var;
        this.f45288f = z10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.h.f45339s0.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.h.f45339s0;
        return ((MessageObject) arrayList.get((arrayList.size() - 1) - i10)).contentType;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        boolean z11;
        MessageObject.GroupedMessagePosition position;
        boolean z12;
        r5 r5Var = this.h;
        ArrayList arrayList = r5Var.f45339s0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = b1Var.f45921a;
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            MessageObject.GroupedMessages groupedMessages = r5Var.f45340t0;
            if (groupedMessages != null && (position = groupedMessages.getPosition(messageObject)) != null) {
                if (position.minY != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z10 = z12;
            } else {
                z10 = false;
            }
            MessageObject.GroupedMessages groupedMessages2 = r5Var.f45340t0;
            if (groupedMessages2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            u1Var.X3(messageObject, groupedMessages2, z11, z10, false, false);
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) view).setMessageObject(messageObject);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        com.google.firebase.messaging.l lVar = this.h.D0;
        Context context = this.f45287c;
        if (i10 == 1) {
            return new s4.b1(new y0(this, context, lVar));
        }
        z0 z0Var = new z0(this, context, UserConfig.selectedAccount, lVar);
        z0Var.N7 = true;
        return new s4.b1(z0Var);
    }
}
