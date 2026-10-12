package rg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import di.a6;
import di.z6;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.lm0;
public final class c1 extends lm0 {
    public final Context f44213c;
    public final la d;
    public final z6 e;
    public final boolean f44214f;
    public final a6 h;

    public c1(a6 a6Var, Context context, la laVar, z6 z6Var, boolean z10) {
        this.h = a6Var;
        this.f44213c = context;
        this.d = laVar;
        this.e = z6Var;
        this.f44214f = z10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.h.f44260s0.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.h.f44260s0;
        return ((MessageObject) arrayList.get((arrayList.size() - 1) - i10)).contentType;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        boolean z11;
        MessageObject.GroupedMessagePosition position;
        boolean z12;
        a6 a6Var = this.h;
        ArrayList arrayList = a6Var.f44260s0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = b1Var.f44838a;
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            MessageObject.GroupedMessages groupedMessages = a6Var.f44261t0;
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
            MessageObject.GroupedMessages groupedMessages2 = a6Var.f44261t0;
            if (groupedMessages2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            u1Var.X3(messageObject, groupedMessages2, z11, z10, false, false);
        } else if (view instanceof org.telegram.ui.Cells.x0) {
            ((org.telegram.ui.Cells.x0) view).setMessageObject(messageObject);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        com.google.firebase.messaging.m mVar = this.h.D0;
        Context context = this.f44213c;
        if (i10 == 1) {
            return new s4.b1(new a1(this, context, mVar));
        }
        b1 b1Var = new b1(this, context, UserConfig.selectedAccount, mVar);
        b1Var.N7 = true;
        return new s4.b1(b1Var);
    }
}
