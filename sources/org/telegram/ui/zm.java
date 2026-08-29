package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class zm extends org.telegram.ui.Components.dq0 {
    public final MessageObject X0;
    public final fn Y0;

    public zm(fn fnVar, Activity activity, tn tnVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, boolean z12, MessageObject messageObject) {
        super(activity, tnVar, arrayList, null, null, z10, null, null, false, false, z11, null, c6Var);
        this.Y0 = fnVar;
        this.X0 = messageObject;
        this.W = z12;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        fn fnVar = this.Y0;
        tn tnVar = fnVar.f38212a;
        int i11 = tn.Dc;
        tnVar.Q7();
        if (fnVar.f38212a.f42989u3 != null && z10) {
            if (hVar.m() == 1) {
                if (((TLRPC.Dialog) hVar.n(0)).f22396id != fnVar.f38212a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.tc.a0(fnVar.f38212a).e0(i10, ((TLRPC.Dialog) hVar.n(0)).f22396id)) {
                    fnVar.f38212a.f42989u3.k(((TLRPC.Dialog) hVar.n(0)).f22396id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            fnVar.f38212a.f42989u3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }

    @Override
    public final void S0(final View view) {
        nh.za zaVar;
        tn tnVar = this.Y0.f38212a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.c7) {
            zaVar = nh.bb.b((org.telegram.ui.Cells.c7) view);
        } else {
            zaVar = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.X0;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) tnVar.f42979t6.f(messageObject.getGroupId());
        }
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final nh.gb E = nh.gb.E(tnVar.getParentActivity(), this.currentAccount);
        E.N = new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l11 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                nh.gb gbVar = E;
                nh.za zaVar2 = null;
                if (booleanValue) {
                    zm zmVar = zm.this;
                    AndroidUtilities.runOnUIThread(new vf(16, zmVar, l11));
                    zmVar.dismiss();
                    gbVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.c7) && view2.isAttachedToWindow()) {
                        zaVar2 = nh.bb.b((org.telegram.ui.Cells.c7) view2);
                    }
                    gbVar.Y(zaVar2);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(zaVar, nh.o7.y(arrayList));
    }

    @Override
    public final void dismissInternal() {
        int i10;
        tn tnVar = this.Y0.f38212a;
        Activity parentActivity = tnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (tnVar.U.getVisibility() == 0) {
            tnVar.fragmentView.requestLayout();
        }
    }
}
