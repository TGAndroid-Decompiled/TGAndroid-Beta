package sg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import fi.n6;
import fi.q5;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.lm0;
public final class b1 extends lm0 {
    public final Context f48157c;
    public final la d;
    public final n6 e;
    public final boolean f48158f;
    public final q5 h;

    public b1(q5 q5Var, Context context, la laVar, n6 n6Var, boolean z10) {
        this.h = q5Var;
        this.f48157c = context;
        this.d = laVar;
        this.e = n6Var;
        this.f48158f = z10;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.h.f48211s0.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.h.f48211s0;
        return ((MessageObject) arrayList.get((arrayList.size() - 1) - i10)).contentType;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        boolean z11;
        MessageObject.GroupedMessagePosition position;
        boolean z12;
        q5 q5Var = this.h;
        ArrayList arrayList = q5Var.f48211s0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = e1Var.f47735a;
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject.GroupedMessages groupedMessages = q5Var.f48212t0;
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
            MessageObject.GroupedMessages groupedMessages2 = q5Var.f48212t0;
            if (groupedMessages2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            s1Var.Z3(messageObject, groupedMessages2, z11, z10, false, false);
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        f1 f1Var = this.h.D0;
        Context context = this.f48157c;
        if (i10 == 1) {
            return new s4.e1(new z0(this, context, f1Var));
        }
        a1 a1Var = new a1(this, context, UserConfig.selectedAccount, f1Var);
        a1Var.N7 = true;
        return new s4.e1(a1Var);
    }
}
