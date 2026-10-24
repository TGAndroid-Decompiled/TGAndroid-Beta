package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class xm extends org.telegram.ui.Components.hr0 {
    public final MessageObject f43639e1;
    public final dn f43640f1;

    public xm(dn dnVar, Activity activity, sn snVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.g6 g6Var, boolean z12, MessageObject messageObject) {
        super(activity, snVar, arrayList, null, null, z10, null, null, false, false, z11, null, g6Var);
        this.f43640f1 = dnVar;
        this.f43639e1 = messageObject;
        this.f27121b0 = z12;
    }

    @Override
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        dn dnVar = this.f43640f1;
        sn snVar = dnVar.f36651a;
        int i11 = sn.Vc;
        snVar.T7();
        if (dnVar.f36651a.K3 != null && z10) {
            if (hVar.m() == 1) {
                if (((TLRPC.Dialog) hVar.n(0)).f20348id != dnVar.f36651a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.vc.a0(dnVar.f36651a).g0(i10, ((TLRPC.Dialog) hVar.n(0)).f20348id)) {
                    dnVar.f36651a.K3.k(((TLRPC.Dialog) hVar.n(0)).f20348id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            dnVar.f36651a.K3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }

    @Override
    public final void X0(final View view) {
        ei.ob obVar;
        sn snVar = this.f43640f1.f36651a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.g7) {
            obVar = ei.qb.b((org.telegram.ui.Cells.g7) view);
        } else {
            obVar = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.f43639e1;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) snVar.J6.f(messageObject.getGroupId());
        }
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ei.vb D = ei.vb.D(snVar.getParentActivity(), this.currentAccount);
        D.R = new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ei.vb vbVar = D;
                ei.ob obVar2 = null;
                if (booleanValue) {
                    xm xmVar = xm.this;
                    AndroidUtilities.runOnUIThread(new eh(10, xmVar, l10));
                    xmVar.dismiss();
                    vbVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.g7) && view2.isAttachedToWindow()) {
                        obVar2 = ei.qb.b((org.telegram.ui.Cells.g7) view2);
                    }
                    vbVar.X(obVar2);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        D.T(obVar, ei.a8.y(arrayList));
    }

    @Override
    public final void dismissInternal() {
        int i10;
        sn snVar = this.f43640f1.f36651a;
        Activity parentActivity = snVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (snVar.Y.getVisibility() == 0) {
            snVar.fragmentView.requestLayout();
        }
    }
}
