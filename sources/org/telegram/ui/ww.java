package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ww extends tf.k {
    public final ny f39802a0;
    public final oy f39803b0;

    public ww(oy oyVar, oy oyVar2, Context context, int i10, int i11, boolean z4, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, ny nyVar) {
        super(oyVar2, context, i10, i11, z4, arrayList, i12, requestPeerType);
        this.f39803b0 = oyVar;
        this.f39802a0 = nyVar;
    }

    @Override
    public final void J() {
        this.f39803b0.presentFragment(new n());
    }

    @Override
    public final void K() {
        int i10;
        oy oyVar = this.f39803b0;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(oyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = oyVar.D;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle h = android.support.v4.media.a.h(0, "step");
            Boolean bool = oyVar.D.has_username;
            if (bool != null) {
                h.putBoolean("forcePublic", bool.booleanValue());
            }
            nd ndVar = new nd(h);
            ndVar.f36596q0 = new p6(oyVar, ndVar, d2Var, 2);
            oyVar.presentFragment(ndVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = oyVar.D.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{oyVar.getUserConfig().getClientUserId()} : new long[]{oyVar.getUserConfig().getClientUserId(), oyVar.E});
            Boolean bool3 = oyVar.D.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i10 = 5;
            } else {
                i10 = 4;
            }
            bundle.putInt("chatType", i10);
            bundle.putBoolean("canToggleTopics", false);
            e70 e70Var = new e70(bundle);
            e70Var.V = new ox(oyVar, d2Var);
            oyVar.presentFragment(e70Var);
        }
    }

    @Override
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.p2) this.f39803b0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override
    public final boolean S() {
        if (this.f39803b0.O0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
        ny nyVar = this.f39802a0;
        nyVar.f36741a.getClass();
        this.f39803b0.o4(r2Var, RecyclerView.R(r2Var), 0.0f, nyVar.d);
    }

    @Override
    public final void d(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        if (r2Var.getMessage() != null) {
            oy oyVar = this.f39803b0;
            i10 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = oyVar.getMessagesController().getTopicsController().findTopic(-r2Var.getDialogId(), MessageObject.getTopicId(i10, r2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (oyVar.f37047i2) {
                    oyVar.O3(r2Var.getDialogId(), findTopic.f19236id, false, null);
                } else {
                    ag.f.m(oyVar, -r2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override
    public final void l() {
        int i10;
        h();
        int i11 = ny.I;
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        oy oyVar = this.f39803b0;
        if (oyVar.O0 == 15) {
            org.telegram.ui.ActionBar.w0 w0Var = oyVar.f37035g0;
            if (this.R) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            w0Var.setVisibility(i10);
        }
    }
}
