package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t7 extends j7 {
    public final v7 f41601n;

    public t7(v7 v7Var) {
        super(v7Var, 3);
        this.f41601n = v7Var;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        boolean z11;
        float f7;
        n7 n7Var = (n7) b1Var.f45938a;
        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) n7Var.f39360b.getChildAt(0);
        bi.b bVar = ((p7) this.e.get(i10)).d;
        if (bVar == n7Var.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != this.e.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        n7Var.setTag(bVar);
        v7 v7Var = this.f41601n;
        if (bVar.f4430f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f20293id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(v7Var.d.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = bVar.f4427a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = bVar.f4428b;
            String fileExtension = FileLoader.getFileExtension(bVar.f4427a);
            TLRPC.Document document = tL_message.media.document;
            document.f20278id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = bVar.f4429c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (bVar.e == null) {
                ?? obj = new Object();
                bVar.e = obj;
                obj.f4426a = true;
                Utilities.globalQueue.postRunnable(new t1(v7Var, bVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = bVar.f4427a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(v7Var.d.getCurrentAccount(), tL_message, false, false);
            bVar.f4430f = messageObject;
            messageObject.mediaExists = true;
        }
        h7Var.f(bVar.f4430f, z11);
        boolean z12 = bVar.e.f4426a;
        boolean z13 = !z12;
        if (!z10) {
            if (!z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            h7Var.f22378g0 = f7;
        }
        if (h7Var.f22377f0 != z13) {
            h7Var.f22377f0 = z13;
            h7Var.invalidate();
        }
        n7Var.d = z11;
        n7Var.f39361c.setText(AndroidUtilities.formatFileSize(bVar.f4429c));
        n7Var.f39359a.a(this.f41601n.f42143f.f4438j.contains(bVar), z10);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        n7 n7Var = new n7(this, viewGroup.getContext(), 1);
        n7Var.e = 3;
        s7 s7Var = new s7(this, viewGroup.getContext(), n7Var);
        s7Var.setCheckForButtonPress(true);
        n7Var.f39360b.addView(s7Var);
        return new s4.b1(n7Var);
    }
}
