package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class u7 extends k7 {
    public final x7 f44029n;

    public u7(x7 x7Var) {
        super(x7Var, 3);
        this.f44029n = x7Var;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        boolean z11;
        float f7;
        o7 o7Var = (o7) e1Var.f47735a;
        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) o7Var.f42107b.getChildAt(0);
        ci.a aVar = ((q7) this.e.get(i10)).d;
        if (aVar == o7Var.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != this.e.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        o7Var.setTag(aVar);
        x7 x7Var = this.f44029n;
        if (aVar.f6367f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f22048id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(x7Var.e.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = aVar.f6364a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = aVar.f6365b;
            String fileExtension = FileLoader.getFileExtension(aVar.f6364a);
            TLRPC.Document document = tL_message.media.document;
            document.f22033id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = aVar.f6366c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (aVar.e == null) {
                ?? obj = new Object();
                aVar.e = obj;
                obj.f6089a = true;
                Utilities.globalQueue.postRunnable(new q1(x7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.f6364a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(x7Var.e.getCurrentAccount(), tL_message, false, false);
            aVar.f6367f = messageObject;
            messageObject.mediaExists = true;
        }
        n7Var.f(aVar.f6367f, z11);
        boolean z12 = aVar.e.f6089a;
        boolean z13 = !z12;
        if (!z10) {
            if (!z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            n7Var.f24551g0 = f7;
        }
        if (n7Var.f24550f0 != z13) {
            n7Var.f24550f0 = z13;
            n7Var.invalidate();
        }
        o7Var.d = z11;
        o7Var.f42108c.setText(AndroidUtilities.formatFileSize(aVar.f6366c));
        o7Var.f42106a.a(this.f44029n.h.f6375j.contains(aVar), z10);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        o7 o7Var = new o7(this, viewGroup.getContext(), 1);
        o7Var.e = 3;
        t7 t7Var = new t7(this, viewGroup.getContext(), o7Var);
        t7Var.setCheckForButtonPress(true);
        o7Var.f42107b.addView(t7Var);
        return new s4.e1(o7Var);
    }
}
