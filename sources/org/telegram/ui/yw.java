package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class yw extends tf.k {
    public final py f40346a0;
    public final qy f40347b0;

    public yw(qy qyVar, qy qyVar2, Context context, int i10, int i11, boolean z4, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, py pyVar) {
        super(qyVar2, context, i10, i11, z4, arrayList, i12, requestPeerType);
        this.f40347b0 = qyVar;
        this.f40346a0 = pyVar;
    }

    @Override
    public final void J() {
        this.f40347b0.presentFragment(new n());
    }

    @Override
    public final void K() {
        int i10;
        qy qyVar = this.f40347b0;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(qyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = qyVar.D;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle h = android.support.v4.media.a.h(0, "step");
            Boolean bool = qyVar.D.has_username;
            if (bool != null) {
                h.putBoolean("forcePublic", bool.booleanValue());
            }
            pd pdVar = new pd(h);
            pdVar.f37095q0 = new r6(qyVar, pdVar, d2Var, 2);
            qyVar.presentFragment(pdVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = qyVar.D.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{qyVar.getUserConfig().getClientUserId()} : new long[]{qyVar.getUserConfig().getClientUserId(), qyVar.E});
            Boolean bool3 = qyVar.D.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i10 = 5;
            } else {
                i10 = 4;
            }
            bundle.putInt("chatType", i10);
            bundle.putBoolean("canToggleTopics", false);
            g70 g70Var = new g70(bundle);
            g70Var.V = new qx(qyVar, d2Var);
            qyVar.presentFragment(g70Var);
        }
    }

    @Override
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.p2) this.f40347b0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override
    public final boolean S() {
        if (this.f40347b0.O0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.q2 q2Var) {
        py pyVar = this.f40346a0;
        pyVar.f37246a.getClass();
        this.f40347b0.o4(q2Var, RecyclerView.R(q2Var), 0.0f, pyVar.d);
    }

    @Override
    public final void d(org.telegram.ui.Cells.q2 q2Var) {
        int i10;
        if (q2Var.getMessage() != null) {
            qy qyVar = this.f40347b0;
            i10 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = qyVar.getMessagesController().getTopicsController().findTopic(-q2Var.getDialogId(), MessageObject.getTopicId(i10, q2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (qyVar.f37565i2) {
                    qyVar.O3(q2Var.getDialogId(), findTopic.f19211id, false, null);
                } else {
                    ag.f.m(qyVar, -q2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override
    public final void l() {
        int i10;
        h();
        int i11 = py.I;
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        qy qyVar = this.f40347b0;
        if (qyVar.O0 == 15) {
            org.telegram.ui.ActionBar.w0 w0Var = qyVar.f37553g0;
            if (this.R) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            w0Var.setVisibility(i10);
        }
    }
}
