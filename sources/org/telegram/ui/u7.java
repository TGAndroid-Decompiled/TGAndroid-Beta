package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class u7 extends k7 {
    public final w7 f40281n;

    public u7(w7 w7Var) {
        super(w7Var, 3);
        this.f40281n = w7Var;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        boolean z11;
        float f7;
        o7 o7Var = (o7) b1Var.f44838a;
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) o7Var.f38560b.getChildAt(0);
        ai.b bVar = ((q7) this.e.get(i10)).d;
        if (bVar == o7Var.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != this.e.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        o7Var.setTag(bVar);
        w7 w7Var = this.f40281n;
        if (bVar.f922f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f18937id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(w7Var.d.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = bVar.f919a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = bVar.f920b;
            String fileExtension = FileLoader.getFileExtension(bVar.f919a);
            TLRPC.Document document = tL_message.media.document;
            document.f18922id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = bVar.f921c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (bVar.e == null) {
                ?? obj = new Object();
                bVar.e = obj;
                obj.f918a = true;
                Utilities.globalQueue.postRunnable(new t1(w7Var, bVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = bVar.f919a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(w7Var.d.getCurrentAccount(), tL_message, false, false);
            bVar.f922f = messageObject;
            messageObject.mediaExists = true;
        }
        i7Var.f(bVar.f922f, z11);
        boolean z12 = bVar.e.f918a;
        boolean z13 = !z12;
        if (!z10) {
            if (!z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            i7Var.f21052g0 = f7;
        }
        if (i7Var.f21051f0 != z13) {
            i7Var.f21051f0 = z13;
            i7Var.invalidate();
        }
        o7Var.d = z11;
        o7Var.f38561c.setText(AndroidUtilities.formatFileSize(bVar.f921c));
        o7Var.f38559a.a(this.f40281n.f40880f.f930j.contains(bVar), z10);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        o7 o7Var = new o7(this, viewGroup.getContext(), 1);
        o7Var.e = 3;
        t7 t7Var = new t7(this, viewGroup.getContext(), o7Var);
        t7Var.setCheckForButtonPress(true);
        o7Var.f38560b.addView(t7Var);
        return new s4.b1(o7Var);
    }
}
