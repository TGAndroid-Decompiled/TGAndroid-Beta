package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class yw extends gg.m {
    public final qy f39909d0;
    public final ry f39910e0;

    public yw(ry ryVar, ry ryVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, qy qyVar) {
        super(ryVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.f39910e0 = ryVar;
        this.f39909d0 = qyVar;
    }

    @Override
    public final void J() {
        this.f39910e0.presentFragment(new l());
    }

    @Override
    public final void K() {
        int i10;
        ry ryVar = this.f39910e0;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ryVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = ryVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle e = org.telegram.ui.Cells.q3.e(0, "step");
            Boolean bool = ryVar.G.has_username;
            if (bool != null) {
                e.putBoolean("forcePublic", bool.booleanValue());
            }
            ld ldVar = new ld(e);
            ldVar.f34940t0 = new m6(ryVar, ldVar, b2Var, 2);
            ryVar.presentFragment(ldVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = ryVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{ryVar.getUserConfig().getClientUserId()} : new long[]{ryVar.getUserConfig().getClientUserId(), ryVar.H});
            Boolean bool3 = ryVar.G.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i10 = 5;
            } else {
                i10 = 4;
            }
            bundle.putInt("chatType", i10);
            bundle.putBoolean("canToggleTopics", false);
            i70 i70Var = new i70(bundle);
            i70Var.Y = new qx(ryVar, b2Var);
            ryVar.presentFragment(i70Var);
        }
    }

    @Override
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.n2) this.f39910e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override
    public final boolean S() {
        if (this.f39910e0.R0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
        qy qyVar = this.f39909d0;
        qyVar.f36629a.getClass();
        this.f39910e0.o4(r2Var, RecyclerView.R(r2Var), 0.0f, qyVar.d);
    }

    @Override
    public final void d(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        if (r2Var.getMessage() != null) {
            ry ryVar = this.f39910e0;
            i10 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = ryVar.getMessagesController().getTopicsController().findTopic(-r2Var.getDialogId(), MessageObject.getTopicId(i10, r2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (ryVar.f37014l2) {
                    ryVar.O3(r2Var.getDialogId(), findTopic.f18135id, false, null);
                } else {
                    ng.d.m(ryVar, -r2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override
    public final void l() {
        int i10;
        h();
        int i11 = qy.L;
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        ry ryVar = this.f39910e0;
        if (ryVar.R0 == 15) {
            org.telegram.ui.ActionBar.v0 v0Var = ryVar.f37004j0;
            if (this.U) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            v0Var.setVisibility(i10);
        }
    }
}
