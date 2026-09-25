package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class xw extends gg.m {
    public final py f40004d0;
    public final qy f40005e0;

    public xw(qy qyVar, qy qyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, py pyVar) {
        super(qyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.f40005e0 = qyVar;
        this.f40004d0 = pyVar;
    }

    @Override
    public final void J() {
        this.f40005e0.presentFragment(new l());
    }

    @Override
    public final void K() {
        int i10;
        qy qyVar = this.f40005e0;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(qyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = qyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle g10 = org.telegram.ui.Cells.c1.g(0, "step");
            Boolean bool = qyVar.G.has_username;
            if (bool != null) {
                g10.putBoolean("forcePublic", bool.booleanValue());
            }
            ld ldVar = new ld(g10);
            ldVar.f35325t0 = new l6(qyVar, ldVar, a2Var, 2);
            qyVar.presentFragment(ldVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = qyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{qyVar.getUserConfig().getClientUserId()} : new long[]{qyVar.getUserConfig().getClientUserId(), qyVar.H});
            Boolean bool3 = qyVar.G.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i10 = 5;
            } else {
                i10 = 4;
            }
            bundle.putInt("chatType", i10);
            bundle.putBoolean("canToggleTopics", false);
            g70 g70Var = new g70(bundle);
            g70Var.Y = new px(qyVar, a2Var);
            qyVar.presentFragment(g70Var);
        }
    }

    @Override
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.m2) this.f40005e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override
    public final boolean S() {
        if (this.f40005e0.R0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.s2 s2Var) {
        py pyVar = this.f40004d0;
        pyVar.f36695a.getClass();
        this.f40005e0.o4(s2Var, RecyclerView.R(s2Var), 0.0f, pyVar.d);
    }

    @Override
    public final void d(org.telegram.ui.Cells.s2 s2Var) {
        int i10;
        if (s2Var.getMessage() != null) {
            qy qyVar = this.f40005e0;
            i10 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = qyVar.getMessagesController().getTopicsController().findTopic(-s2Var.getDialogId(), MessageObject.getTopicId(i10, s2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (qyVar.f37070l2) {
                    qyVar.O3(s2Var.getDialogId(), findTopic.f18388id, false, null);
                } else {
                    ng.d.m(qyVar, -s2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override
    public final void l() {
        int i10;
        h();
        int i11 = py.L;
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        qy qyVar = this.f40005e0;
        if (qyVar.R0 == 15) {
            org.telegram.ui.ActionBar.u0 u0Var = qyVar.f37060j0;
            if (this.U) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            u0Var.setVisibility(i10);
        }
    }
}
