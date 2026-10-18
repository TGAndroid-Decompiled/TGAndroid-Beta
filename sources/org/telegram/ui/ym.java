package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ym extends org.telegram.ui.Components.dr0 {
    public final MessageObject f43449b1;
    public final en f43450c1;

    public ym(en enVar, Activity activity, sn snVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, boolean z12, MessageObject messageObject) {
        super(activity, snVar, arrayList, null, null, z10, null, null, false, false, z11, null, d6Var);
        this.f43450c1 = enVar;
        this.f43449b1 = messageObject;
        this.f25659a0 = z12;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        en enVar = this.f43450c1;
        sn snVar = enVar.f36573a;
        int i11 = sn.Hc;
        snVar.T7();
        if (enVar.f36573a.y3 != null && z10) {
            if (hVar.m() == 1) {
                if (((TLRPC.Dialog) hVar.n(0)).f20283id != enVar.f36573a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.xc.a0(enVar.f36573a).g0(i10, ((TLRPC.Dialog) hVar.n(0)).f20283id)) {
                    enVar.f36573a.y3.k(((TLRPC.Dialog) hVar.n(0)).f20283id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            enVar.f36573a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }

    @Override
    public final void T0(final View view) {
        ei.ob obVar;
        sn snVar = this.f43450c1.f36573a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.e7) {
            obVar = ei.qb.b((org.telegram.ui.Cells.e7) view);
        } else {
            obVar = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.f43449b1;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) snVar.f41460x6.f(messageObject.getGroupId());
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
                    ym ymVar = ym.this;
                    AndroidUtilities.runOnUIThread(new gh(10, ymVar, l10));
                    ymVar.dismiss();
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
        sn snVar = this.f43450c1.f36573a;
        Activity parentActivity = snVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (snVar.Y.getVisibility() == 0) {
            snVar.fragmentView.requestLayout();
        }
    }
}
