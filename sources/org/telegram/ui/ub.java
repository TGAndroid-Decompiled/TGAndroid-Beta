package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ub implements org.telegram.ui.Cells.t0 {
    public final wb f40360a;

    public ub(wb wbVar) {
        this.f40360a = wbVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.m2 M0() {
        return this.f40360a.f40914n;
    }

    @Override
    public final void O0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        int i10;
        ac acVar = this.f40360a.f40914n;
        if (acVar.A0) {
            return;
        }
        if (acVar.f33867y0.containsKey(tL_chatInviteExported.link)) {
            obj = acVar.f33867y0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = acVar.getMessagesController().getInputPeer(-acVar.f33842f.f18916id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            acVar.A0 = true;
            final boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(acVar.getParentActivity(), 3, null);
            a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    ub.this.f40360a.f40914n.A0 = false;
                    zArr[0] = true;
                }
            });
            a2Var.q(300L);
            int sendRequest = acVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new bi.f3(this, tL_chatInviteExported, zArr, a2Var, 4));
            ConnectionsManager connectionsManager = acVar.getConnectionsManager();
            i10 = ((org.telegram.ui.ActionBar.m2) acVar).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            ac.A0(acVar, (TLRPC.TL_messages_exportedChatInvite) obj, acVar.f33868z0);
        } else {
            org.telegram.messenger.g0.q(R.string.LinkHashExpired, org.telegram.ui.Components.zc.a0(acVar), R.raw.linkbroken, 36);
        }
    }

    @Override
    public final long a() {
        return -this.f40360a.f40914n.f33842f.f18916id;
    }

    @Override
    public final long d() {
        return 0L;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void k0(org.telegram.ui.Cells.w0 w0Var) {
        ac acVar = this.f40360a.f40914n;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject.type == 22) {
            gd gdVar = new gd(a());
            gdVar.f36152l0 = acVar;
            acVar.presentFragment(gdVar);
            return;
        }
        PhotoViewer.t1().K2(null, acVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().e2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), acVar.B0);
            return;
        }
        PhotoViewer.t1().d2(messageObject, null, 0L, 0L, 0L, acVar.B0);
    }

    @Override
    public final boolean k2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        ac acVar = this.f40360a.f40914n;
        int i10 = ac.Q0;
        return acVar.P0(w0Var, 0.0f, 0.0f);
    }

    @Override
    public final void t1(long j10) {
        int i10;
        int i11;
        ac acVar = this.f40360a.f40914n;
        if (j10 >= 0) {
            i10 = ((org.telegram.ui.ActionBar.m2) acVar).currentAccount;
            if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
                Bundle e = t8.b.e(j10, "user_id");
                ac.p0(acVar, e, j10);
                ProfileActivity profileActivity = new ProfileActivity(e, null);
                profileActivity.N4(0);
                acVar.presentFragment(profileActivity);
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -j10);
        i11 = ((org.telegram.ui.ActionBar.m2) acVar).currentAccount;
        if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, acVar)) {
            acVar.presentFragment(new fo(bundle), true);
        }
    }

    @Override
    public final void b0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void u1(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void W(org.telegram.ui.Cells.w0 w0Var, int i10) {
    }

    @Override
    public final void a2(org.telegram.ui.Cells.w0 w0Var, String str) {
    }

    @Override
    public final void D1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void d1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
    }

    @Override
    public final void o2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
