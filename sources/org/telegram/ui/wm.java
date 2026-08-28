package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class wm extends org.telegram.ui.Components.rp0 {
    public final MessageObject X0;
    public final cn Y0;

    public wm(cn cnVar, Activity activity, qn qnVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.b6 b6Var, boolean z12, MessageObject messageObject) {
        super(activity, qnVar, arrayList, null, null, z10, null, null, false, false, z11, null, b6Var);
        this.Y0 = cnVar;
        this.X0 = messageObject;
        this.W = z12;
    }

    @Override
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        cn cnVar = this.Y0;
        qn qnVar = cnVar.f37236a;
        int i10 = qn.Dc;
        qnVar.Q7();
        if (cnVar.f37236a.f42093u3 != null && z10) {
            if (hVar.m() == 1) {
                if (((TLRPC.Dialog) hVar.n(0)).f22384id != cnVar.f37236a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.oc.a0(cnVar.f37236a).e0(i9, ((TLRPC.Dialog) hVar.n(0)).f22384id)) {
                    cnVar.f37236a.f42093u3.k(((TLRPC.Dialog) hVar.n(0)).f22384id, 53, Integer.valueOf(i9), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            cnVar.f37236a.f42093u3.k(0L, 53, Integer.valueOf(i9), Integer.valueOf(hVar.m()), null, null);
        }
    }

    @Override
    public final void S0(final View view) {
        kh.pb pbVar;
        qn qnVar = this.Y0.f37236a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.e7) {
            pbVar = kh.rb.b((org.telegram.ui.Cells.e7) view);
        } else {
            pbVar = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.X0;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) qnVar.f42083t6.f(messageObject.getGroupId());
        }
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final kh.wb E = kh.wb.E(qnVar.getParentActivity(), this.currentAccount);
        E.N = new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l11 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                kh.wb wbVar = E;
                kh.pb pbVar2 = null;
                if (booleanValue) {
                    wm wmVar = wm.this;
                    AndroidUtilities.runOnUIThread(new rd(19, wmVar, l11));
                    wmVar.dismiss();
                    wbVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.e7) && view2.isAttachedToWindow()) {
                        pbVar2 = kh.rb.b((org.telegram.ui.Cells.e7) view2);
                    }
                    wbVar.Y(pbVar2);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(pbVar, kh.a8.y(arrayList));
    }

    @Override
    public final void dismissInternal() {
        int i9;
        qn qnVar = this.Y0.f37236a;
        Activity parentActivity = qnVar.getParentActivity();
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i9);
        super.dismissInternal();
        if (qnVar.U.getVisibility() == 0) {
            qnVar.fragmentView.requestLayout();
        }
    }
}
