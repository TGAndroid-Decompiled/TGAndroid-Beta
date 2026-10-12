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
public final class sb implements org.telegram.ui.Cells.t0 {
    public final ub f41885a;

    public sb(ub ubVar) {
        this.f41885a = ubVar;
    }

    @Override
    public final void E1(long j3) {
        yb ybVar = this.f41885a.f42479n;
        if (j3 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            if (MessagesController.getInstance(yb.x0(ybVar)).checkCanOpenChat(bundle, ybVar)) {
                ybVar.presentFragment(new eo(bundle), true);
            }
        } else if (j3 != UserConfig.getInstance(yb.y0(ybVar)).getClientUserId()) {
            Bundle f7 = sc.v.f(j3, "user_id");
            yb.p0(ybVar, f7, j3);
            ProfileActivity profileActivity = new ProfileActivity(f7, null);
            profileActivity.N4(0);
            ybVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.m2 T0() {
        return this.f41885a.f42479n;
    }

    @Override
    public final void V0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        yb ybVar = this.f41885a.f42479n;
        if (ybVar.A0) {
            return;
        }
        if (ybVar.f44439y0.containsKey(tL_chatInviteExported.link)) {
            obj = ybVar.f44439y0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = ybVar.getMessagesController().getInputPeer(-ybVar.f44414f.f19802id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            ybVar.A0 = true;
            final boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(ybVar.getParentActivity(), 3, null);
            a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    sb.this.f41885a.f42479n.A0 = false;
                    zArr[0] = true;
                }
            });
            a2Var.q(300L);
            ybVar.getConnectionsManager().bindRequestToGuid(ybVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new ai.q3(this, tL_chatInviteExported, zArr, a2Var, 4)), yb.z0(ybVar));
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            yb.A0(ybVar, (TLRPC.TL_messages_exportedChatInvite) obj, ybVar.f44440z0);
        } else {
            org.telegram.messenger.v0.q(R.string.LinkHashExpired, org.telegram.ui.Components.zc.a0(ybVar), R.raw.linkbroken, 36);
        }
    }

    @Override
    public final long a() {
        return -this.f41885a.f42479n.f44414f.f19802id;
    }

    @Override
    public final long d() {
        return 0L;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final void n0(org.telegram.ui.Cells.w0 w0Var) {
        yb ybVar = this.f41885a.f42479n;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject.type == 22) {
            fd fdVar = new fd(a());
            fdVar.f37736l0 = ybVar;
            ybVar.presentFragment(fdVar);
            return;
        }
        PhotoViewer.t1().K2(null, ybVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().e2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), ybVar.B0);
            return;
        }
        PhotoViewer.t1().d2(messageObject, null, 0L, 0L, 0L, ybVar.B0);
    }

    @Override
    public final boolean y2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        yb ybVar = this.f41885a.f42479n;
        int i10 = yb.Q0;
        return ybVar.P0(w0Var, 0.0f, 0.0f);
    }

    @Override
    public final void F1(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void b0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void v0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void U(org.telegram.ui.Cells.w0 w0Var, int i10) {
    }

    @Override
    public final void n2(org.telegram.ui.Cells.w0 w0Var, String str) {
    }

    @Override
    public final void P1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
    }

    @Override
    public final void m1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void B2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
