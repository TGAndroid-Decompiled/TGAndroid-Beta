package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class zm extends org.telegram.ui.Components.mr0 {
    public final MessageObject f46325a1;
    public final fn f46326b1;

    public zm(fn fnVar, Activity activity, un unVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.u6 u6Var, boolean z12, MessageObject messageObject) {
        super(activity, unVar, arrayList, null, null, z10, null, null, false, false, z11, null, u6Var);
        this.f46326b1 = fnVar;
        this.f46325a1 = messageObject;
        this.f30699b0 = z12;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        fn fnVar = this.f46326b1;
        un unVar = fnVar.f39420a;
        int i11 = un.f44168bd;
        unVar.X7();
        if (fnVar.f39420a.K3 != null && z10) {
            if (hVar.m() == 1) {
                if (((TLRPC.Dialog) hVar.n(0)).f22031id != fnVar.f39420a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.wc.b0(fnVar.f39420a).h0(i10, ((TLRPC.Dialog) hVar.n(0)).f22031id)) {
                    fnVar.f39420a.K3.k(((TLRPC.Dialog) hVar.n(0)).f22031id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            fnVar.f39420a.K3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }

    @Override
    public final void U0(final View view) {
        fi.lb lbVar;
        un unVar = this.f46326b1.f39420a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.k7) {
            lbVar = fi.nb.b((org.telegram.ui.Cells.k7) view);
        } else {
            lbVar = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.f46325a1;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) unVar.J6.f(messageObject.getGroupId());
        }
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final fi.sb D = fi.sb.D(unVar.getParentActivity(), this.currentAccount);
        D.R = new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                fi.sb sbVar = D;
                fi.lb lbVar2 = null;
                if (booleanValue) {
                    zm zmVar = zm.this;
                    AndroidUtilities.runOnUIThread(new ed(21, zmVar, l10));
                    zmVar.dismiss();
                    sbVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.k7) && view2.isAttachedToWindow()) {
                        lbVar2 = fi.nb.b((org.telegram.ui.Cells.k7) view2);
                    }
                    sbVar.X(lbVar2);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        D.T(lbVar, fi.w7.y(arrayList));
    }

    @Override
    public final void dismissInternal() {
        int i10;
        un unVar = this.f46326b1.f39420a;
        Activity parentActivity = unVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (unVar.Y.getVisibility() == 0) {
            unVar.fragmentView.requestLayout();
        }
    }
}
