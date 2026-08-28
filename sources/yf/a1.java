package yf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kh.q6;
import kh.s5;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.vk0;
public final class a1 extends vk0 {
    public final Context f49738c;
    public final ba d;
    public final q6 f49739e;
    public final boolean f49740f;
    public final s5 h;

    public a1(s5 s5Var, Context context, ba baVar, q6 q6Var, boolean z10) {
        this.h = s5Var;
        this.f49738c = context;
        this.d = baVar;
        this.f49739e = q6Var;
        this.f49740f = z10;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.h.f49794o0.size();
    }

    @Override
    public final int j(int i9) {
        ArrayList arrayList = this.h.f49794o0;
        return ((MessageObject) arrayList.get((arrayList.size() - 1) - i9)).contentType;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        boolean z11;
        MessageObject.GroupedMessagePosition position;
        boolean z12;
        s5 s5Var = this.h;
        ArrayList arrayList = s5Var.f49794o0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i9);
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject.GroupedMessages groupedMessages = s5Var.f49795p0;
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
            MessageObject.GroupedMessages groupedMessages2 = s5Var.f49795p0;
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
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        com.google.firebase.messaging.m mVar = this.h.f49805z0;
        Context context = this.f49738c;
        if (i9 == 1) {
            return new f2.q1(new y0(this, context, mVar));
        }
        z0 z0Var = new z0(this, context, UserConfig.selectedAccount, mVar);
        z0Var.J7 = true;
        return new f2.q1(z0Var);
    }
}
