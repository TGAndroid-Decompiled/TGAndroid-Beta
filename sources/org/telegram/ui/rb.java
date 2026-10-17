package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class rb implements org.telegram.ui.Cells.u0 {
    public final tb f40684a;

    public rb(tb tbVar) {
        this.f40684a = tbVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 L0() {
        return this.f40684a.f41642n;
    }

    @Override
    public final void N0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        xb xbVar = this.f40684a.f41642n;
        if (xbVar.A0) {
            return;
        }
        if (xbVar.f43075y0.containsKey(tL_chatInviteExported.link)) {
            obj = xbVar.f43075y0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = xbVar.getMessagesController().getInputPeer(-xbVar.f43050f.f20272id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            xbVar.A0 = true;
            final boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(xbVar.getParentActivity(), 3, null);
            b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    rb.this.f40684a.f41642n.A0 = false;
                    zArr[0] = true;
                }
            });
            b2Var.q(300L);
            xbVar.getConnectionsManager().bindRequestToGuid(xbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new ai.x2(this, tL_chatInviteExported, zArr, b2Var, 9)), xb.z0(xbVar));
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            xb.A0(xbVar, (TLRPC.TL_messages_exportedChatInvite) obj, xbVar.f43076z0);
        } else {
            org.telegram.messenger.q.q(R.string.LinkHashExpired, org.telegram.ui.Components.xc.a0(xbVar), R.raw.linkbroken, 36);
        }
    }

    @Override
    public final long a() {
        return -this.f40684a.f41642n.f43050f.f20272id;
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
    public final boolean h2(org.telegram.ui.Cells.x0 x0Var, float f7, float f10) {
        xb xbVar = this.f40684a.f41642n;
        int i10 = xb.Q0;
        return xbVar.P0(x0Var, 0.0f, 0.0f);
    }

    @Override
    public final void k0(org.telegram.ui.Cells.x0 x0Var) {
        xb xbVar = this.f40684a.f41642n;
        MessageObject messageObject = x0Var.getMessageObject();
        if (messageObject.type == 22) {
            dd ddVar = new dd(a());
            ddVar.f36151l0 = xbVar;
            xbVar.presentFragment(ddVar);
            return;
        }
        PhotoViewer.t1().K2(null, xbVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().e2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), xbVar.B0);
            return;
        }
        PhotoViewer.t1().d2(messageObject, null, 0L, 0L, 0L, xbVar.B0);
    }

    @Override
    public final void s1(long j10) {
        xb xbVar = this.f40684a.f41642n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            if (MessagesController.getInstance(xb.x0(xbVar)).checkCanOpenChat(bundle, xbVar)) {
                xbVar.presentFragment(new sn(bundle), true);
            }
        } else if (j10 != UserConfig.getInstance(xb.y0(xbVar)).getClientUserId()) {
            Bundle a2 = z7.g5.a(j10, "user_id");
            xb.p0(xbVar, a2, j10);
            ProfileActivity profileActivity = new ProfileActivity(a2, null);
            profileActivity.N4(0);
            xbVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void b0(org.telegram.ui.Cells.x0 x0Var) {
    }

    @Override
    public final void r0(org.telegram.ui.Cells.x0 x0Var) {
    }

    @Override
    public final void t1(org.telegram.ui.Cells.x0 x0Var) {
    }

    @Override
    public final void X(org.telegram.ui.Cells.x0 x0Var, int i10) {
    }

    @Override
    public final void X1(org.telegram.ui.Cells.x0 x0Var, String str) {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.x0 x0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void c1(org.telegram.ui.Cells.x0 x0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.x0 x0Var, int i10, int i11) {
    }

    @Override
    public final void k2(org.telegram.ui.Cells.x0 x0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
