package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class u7 extends k7 {
    public final w7 f38698n;

    public u7(w7 w7Var) {
        super(w7Var, 3);
        this.f38698n = w7Var;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        boolean z10;
        float f10;
        o7 o7Var = (o7) l1Var.f5774a;
        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) o7Var.f36667b.getChildAt(0);
        mh.a aVar = ((q7) this.e.get(i10)).d;
        if (aVar == o7Var.getTag()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 != this.e.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        o7Var.setTag(aVar);
        w7 w7Var = this.f38698n;
        if (aVar.f14160f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f19180id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(w7Var.d.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = aVar.f14157a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = aVar.f14158b;
            String fileExtension = FileLoader.getFileExtension(aVar.f14157a);
            TLRPC.Document document = tL_message.media.document;
            document.f19165id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = aVar.f14159c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (aVar.e == null) {
                ?? obj = new Object();
                aVar.e = obj;
                obj.f6920a = true;
                Utilities.globalQueue.postRunnable(new u1(w7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.f14157a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(w7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f14160f = messageObject;
            messageObject.mediaExists = true;
        }
        g7Var.f(aVar.f14160f, z10);
        boolean z11 = aVar.e.f6920a;
        boolean z12 = !z11;
        if (!z4) {
            if (!z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            g7Var.f21099d0 = f10;
        }
        if (g7Var.f21098c0 != z12) {
            g7Var.f21098c0 = z12;
            g7Var.invalidate();
        }
        o7Var.d = z10;
        o7Var.f36668c.setText(AndroidUtilities.formatFileSize(aVar.f14159c));
        o7Var.f36666a.a(this.f38698n.f39283f.f14168j.contains(aVar), z4);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        o7 o7Var = new o7(this, viewGroup.getContext(), 1);
        o7Var.e = 3;
        t7 t7Var = new t7(this, viewGroup.getContext(), o7Var);
        t7Var.setCheckForButtonPress(true);
        o7Var.f36667b.addView(t7Var);
        return new f2.l1(o7Var);
    }
}
