package qg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ci.a7;
import ci.b6;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.ll0;
public final class d1 extends ll0 {
    public final Context f41281c;
    public final ja d;
    public final a7 e;
    public final boolean f41282f;
    public final b6 h;

    public d1(b6 b6Var, Context context, ja jaVar, a7 a7Var, boolean z10) {
        this.h = b6Var;
        this.f41281c = context;
        this.d = jaVar;
        this.e = a7Var;
        this.f41282f = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.h.f41324s0.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.h.f41324s0;
        return ((MessageObject) arrayList.get((arrayList.size() - 1) - i10)).contentType;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        MessageObject.GroupedMessagePosition position;
        boolean z12;
        b6 b6Var = this.h;
        ArrayList arrayList = b6Var.f41324s0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = c1Var.f42627a;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject.GroupedMessages groupedMessages = b6Var.f41325t0;
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
            MessageObject.GroupedMessages groupedMessages2 = b6Var.f41325t0;
            if (groupedMessages2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            t1Var.X3(messageObject, groupedMessages2, z11, z10, false, false);
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) view).setMessageObject(messageObject);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        com.google.firebase.messaging.n nVar = this.h.D0;
        Context context = this.f41281c;
        if (i10 == 1) {
            return new s4.c1(new b1(this, context, nVar));
        }
        c1 c1Var = new c1(this, context, UserConfig.selectedAccount, nVar);
        c1Var.N7 = true;
        return new s4.c1(c1Var);
    }
}
