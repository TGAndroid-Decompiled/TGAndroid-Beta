package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class wm extends org.telegram.ui.Components.er0 {
    public final MessageObject f42892c1;
    public final cn f42893d1;

    public wm(cn cnVar, Activity activity, qn qnVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, boolean z12, MessageObject messageObject) {
        super(activity, qnVar, arrayList, null, null, z10, null, null, false, false, z11, null, d6Var);
        this.f42893d1 = cnVar;
        this.f42892c1 = messageObject;
        this.f25980b0 = z12;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        cn cnVar = this.f42893d1;
        qn qnVar = cnVar.f36032a;
        int i11 = qn.Ic;
        qnVar.T7();
        if (cnVar.f36032a.y3 != null && z10) {
            if (hVar.m() == 1) {
                if (((TLRPC.Dialog) hVar.n(0)).f20279id != cnVar.f36032a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.xc.a0(cnVar.f36032a).g0(i10, ((TLRPC.Dialog) hVar.n(0)).f20279id)) {
                    cnVar.f36032a.y3.k(((TLRPC.Dialog) hVar.n(0)).f20279id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            cnVar.f36032a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }

    @Override
    public final void U0(final View view) {
        ei.ob obVar;
        qn qnVar = this.f42893d1.f36032a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.e7) {
            obVar = ei.qb.b((org.telegram.ui.Cells.e7) view);
        } else {
            obVar = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.f42892c1;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) qnVar.f40909x6.f(messageObject.getGroupId());
        }
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ei.vb D = ei.vb.D(qnVar.getParentActivity(), this.currentAccount);
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
                    wm wmVar = wm.this;
                    AndroidUtilities.runOnUIThread(new eh(10, wmVar, l10));
                    wmVar.dismiss();
                    vbVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.e7) && view2.isAttachedToWindow()) {
                        obVar2 = ei.qb.b((org.telegram.ui.Cells.e7) view2);
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
        qn qnVar = this.f42893d1.f36032a;
        Activity parentActivity = qnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (qnVar.Y.getVisibility() == 0) {
            qnVar.fragmentView.requestLayout();
        }
    }
}
