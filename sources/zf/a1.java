package zf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import lh.p6;
import lh.r5;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.z9;

public final class a1 extends yk0 {

    public final Context f50333c;
    public final z9 d;

    public final p6 f50334e;

    public final boolean f50335f;
    public final r5 h;

    public a1(r5 r5Var, Context context, z9 z9Var, p6 p6Var, boolean z10) {
        this.h = r5Var;
        this.f50333c = context;
        this.d = z9Var;
        this.f50334e = p6Var;
        this.f50335f = z10;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.h.f50389o0.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.h.f50389o0;
        return ((MessageObject) arrayList.get((arrayList.size() - 1) - i10)).contentType;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        boolean z10;
        MessageObject.GroupedMessagePosition position;
        r5 r5Var = this.h;
        ArrayList arrayList = r5Var.f50389o0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = o1Var.f5789a;
        if (!(view instanceof org.telegram.ui.Cells.s1)) {
            if (view instanceof org.telegram.ui.Cells.v0) {
                ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
        MessageObject.GroupedMessages groupedMessages = r5Var.f50390p0;
        if (groupedMessages == null || (position = groupedMessages.getPosition(messageObject)) == null) {
            z10 = false;
        } else {
            z10 = position.minY != 0;
        }
        MessageObject.GroupedMessages groupedMessages2 = r5Var.f50390p0;
        s1Var.W3(messageObject, groupedMessages2, groupedMessages2 != null, z10, false, false);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        com.google.firebase.messaging.m mVar = this.h.f50400z0;
        Context context = this.f50333c;
        if (i10 == 1) {
            return new lk0(new y0(this, context, mVar));
        }
        z0 z0Var = new z0(this, context, UserConfig.selectedAccount, mVar);
        z0Var.J7 = true;
        return new lk0(z0Var);
    }
}
