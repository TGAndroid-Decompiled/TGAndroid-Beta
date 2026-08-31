package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s7 extends i7 {
    public final u7 f41148n;

    public s7(u7 u7Var) {
        super(u7Var, 3);
        this.f41148n = u7Var;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        boolean z10;
        float f10;
        m7 m7Var = (m7) m1Var.f5875a;
        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) m7Var.f38981b.getChildAt(0);
        nh.a aVar = ((o7) this.f37339e.get(i10)).d;
        if (aVar == m7Var.getTag()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 != this.f37339e.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        m7Var.setTag(aVar);
        u7 u7Var = this.f41148n;
        if (aVar.f16247f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f20864id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(u7Var.d.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = aVar.f16243a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = aVar.f16244b;
            String fileExtension = FileLoader.getFileExtension(aVar.f16243a);
            TLRPC.Document document = tL_message.media.document;
            document.f20849id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = aVar.f16245c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (aVar.f16246e == null) {
                ?? obj = new Object();
                aVar.f16246e = obj;
                obj.f7233a = true;
                Utilities.globalQueue.postRunnable(new s1(u7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.f16243a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(u7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f16247f = messageObject;
            messageObject.mediaExists = true;
        }
        h7Var.f(aVar.f16247f, z10);
        boolean z11 = aVar.f16246e.f7233a;
        boolean z12 = !z11;
        if (!z4) {
            if (!z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            h7Var.f22929d0 = f10;
        }
        if (h7Var.f22928c0 != z12) {
            h7Var.f22928c0 = z12;
            h7Var.invalidate();
        }
        m7Var.d = z10;
        m7Var.f38982c.setText(AndroidUtilities.formatFileSize(aVar.f16245c));
        m7Var.f38980a.a(this.f41148n.f41804f.f16256j.contains(aVar), z4);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        m7 m7Var = new m7(this, viewGroup.getContext(), 1);
        m7Var.f38983e = 3;
        r7 r7Var = new r7(this, viewGroup.getContext(), m7Var);
        r7Var.setCheckForButtonPress(true);
        m7Var.f38981b.addView(r7Var);
        return new f2.m1(m7Var);
    }
}
