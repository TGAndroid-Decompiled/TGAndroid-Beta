package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class xm extends org.telegram.ui.Components.sp0 {
    public final MessageObject X0;
    public final dn Y0;

    public xm(dn dnVar, Activity activity, rn rnVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, boolean z12, MessageObject messageObject) {
        super(activity, rnVar, arrayList, null, null, z10, null, null, false, false, z11, null, c6Var);
        this.Y0 = dnVar;
        this.X0 = messageObject;
        this.W = z12;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        dn dnVar = this.Y0;
        rn rnVar = dnVar.f37446a;
        int i11 = rn.Dc;
        rnVar.Q7();
        if (dnVar.f37446a.f42229u3 == null || !z10) {
            return;
        }
        if (hVar.m() != 1) {
            dnVar.f37446a.f42229u3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) hVar.n(0)).f22384id == dnVar.f37446a.getUserConfig().getClientUserId() && org.telegram.ui.Components.mc.a0(dnVar.f37446a).e0(i10, ((TLRPC.Dialog) hVar.n(0)).f22384id)) {
                return;
            }
            dnVar.f37446a.f42229u3.k(((TLRPC.Dialog) hVar.n(0)).f22384id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override
    public final void S0(final View view) {
        rn rnVar = this.Y0.f37446a;
        lh.lb lbVarB = view instanceof org.telegram.ui.Cells.b7 ? lh.nb.b((org.telegram.ui.Cells.b7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.X0;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) rnVar.f42219t6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final lh.sb sbVarE = lh.sb.E(rnVar.getParentActivity(), this.currentAccount);
        sbVarE.N = new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                lh.sb sbVar = sbVarE;
                lh.lb lbVarB2 = null;
                if (zBooleanValue) {
                    xm xmVar = this.f42667a;
                    AndroidUtilities.runOnUIThread(new rd(19, xmVar, l10));
                    xmVar.dismiss();
                    sbVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.b7) && view2.isAttachedToWindow()) {
                        lbVarB2 = lh.nb.b((org.telegram.ui.Cells.b7) view2);
                    }
                    sbVar.Y(lbVarB2);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        sbVarE.U(lbVarB, lh.z7.y(arrayList));
    }

    @Override
    public final void dismissInternal() {
        rn rnVar = this.Y0.f37446a;
        AndroidUtilities.requestAdjustResize(rnVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) rnVar).classGuid);
        super.dismissInternal();
        if (rnVar.U.getVisibility() == 0) {
            rnVar.fragmentView.requestLayout();
        }
    }
}
