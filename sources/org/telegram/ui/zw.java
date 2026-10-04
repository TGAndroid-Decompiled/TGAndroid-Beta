package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class zw extends gg.m {
    public final ty f43917d0;
    public final uy f43918e0;

    public zw(uy uyVar, uy uyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, ty tyVar) {
        super(uyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.f43918e0 = uyVar;
        this.f43917d0 = tyVar;
    }

    @Override
    public final void J() {
        this.f43918e0.presentFragment(new l());
    }

    @Override
    public final void K() {
        int i10;
        uy uyVar = this.f43918e0;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(uyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = uyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle h = org.telegram.ui.Cells.c1.h(0, "step");
            Boolean bool = uyVar.G.has_username;
            if (bool != null) {
                h.putBoolean("forcePublic", bool.booleanValue());
            }
            nd ndVar = new nd(h);
            ndVar.f38935t0 = new o6(uyVar, ndVar, b2Var, 2);
            uyVar.presentFragment(ndVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = uyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{uyVar.getUserConfig().getClientUserId()} : new long[]{uyVar.getUserConfig().getClientUserId(), uyVar.H});
            Boolean bool3 = uyVar.G.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i10 = 5;
            } else {
                i10 = 4;
            }
            bundle.putInt("chatType", i10);
            bundle.putBoolean("canToggleTopics", false);
            k70 k70Var = new k70(bundle);
            k70Var.Y = new rx(uyVar, b2Var);
            uyVar.presentFragment(k70Var);
        }
    }

    @Override
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.n2) this.f43918e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override
    public final boolean S() {
        if (this.f43918e0.R0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.s2 s2Var) {
        ty tyVar = this.f43917d0;
        tyVar.f40990a.getClass();
        this.f43918e0.x4(s2Var, RecyclerView.R(s2Var), 0.0f, tyVar.d);
    }

    @Override
    public final void d(org.telegram.ui.Cells.s2 s2Var) {
        int i10;
        if (s2Var.getMessage() != null) {
            uy uyVar = this.f43918e0;
            i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = uyVar.getMessagesController().getTopicsController().findTopic(-s2Var.getDialogId(), MessageObject.getTopicId(i10, s2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (uyVar.f41436l2) {
                    uyVar.X3(s2Var.getDialogId(), findTopic.f20094id, false, null);
                } else {
                    ng.d.m(uyVar, -s2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override
    public final void l() {
        int i10;
        h();
        int i11 = ty.L;
        try {
            super.l();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        uy uyVar = this.f43918e0;
        if (uyVar.R0 == 15) {
            org.telegram.ui.ActionBar.v0 v0Var = uyVar.f41426j0;
            if (this.U) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            v0Var.setVisibility(i10);
        }
    }
}
