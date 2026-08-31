package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class xw extends uf.k {
    public final oy f43486a0;
    public final py f43487b0;

    public xw(py pyVar, py pyVar2, Context context, int i10, int i11, boolean z4, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, oy oyVar) {
        super(pyVar2, context, i10, i11, z4, arrayList, i12, requestPeerType);
        this.f43487b0 = pyVar;
        this.f43486a0 = oyVar;
    }

    @Override
    public final void J() {
        this.f43487b0.presentFragment(new n());
    }

    @Override
    public final void K() {
        int i10;
        py pyVar = this.f43487b0;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(pyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = pyVar.D;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle h = android.support.v4.media.a.h(0, "step");
            Boolean bool = pyVar.D.has_username;
            if (bool != null) {
                h.putBoolean("forcePublic", bool.booleanValue());
            }
            nd ndVar = new nd(h);
            ndVar.f39404q0 = new p6(pyVar, ndVar, d2Var, 2);
            pyVar.presentFragment(ndVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = pyVar.D.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{pyVar.getUserConfig().getClientUserId()} : new long[]{pyVar.getUserConfig().getClientUserId(), pyVar.E});
            Boolean bool3 = pyVar.D.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i10 = 5;
            } else {
                i10 = 4;
            }
            bundle.putInt("chatType", i10);
            bundle.putBoolean("canToggleTopics", false);
            f70 f70Var = new f70(bundle);
            f70Var.V = new px(pyVar, d2Var);
            pyVar.presentFragment(f70Var);
        }
    }

    @Override
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.p2) this.f43487b0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override
    public final boolean S() {
        if (this.f43487b0.O0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
        oy oyVar = this.f43486a0;
        oyVar.f39866a.getClass();
        this.f43487b0.o4(r2Var, RecyclerView.R(r2Var), 0.0f, oyVar.d);
    }

    @Override
    public final void d(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        if (r2Var.getMessage() != null) {
            py pyVar = this.f43487b0;
            i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = pyVar.getMessagesController().getTopicsController().findTopic(-r2Var.getDialogId(), MessageObject.getTopicId(i10, r2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (pyVar.f40224i2) {
                    pyVar.O3(r2Var.getDialogId(), findTopic.f20895id, false, null);
                } else {
                    bg.e.m(pyVar, -r2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override
    public final void l() {
        int i10;
        h();
        int i11 = oy.I;
        try {
            super.l();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        py pyVar = this.f43487b0;
        if (pyVar.O0 == 15) {
            org.telegram.ui.ActionBar.w0 w0Var = pyVar.f40212g0;
            if (this.R) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            w0Var.setVisibility(i10);
        }
    }
}
