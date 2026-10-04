package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s7 extends i7 {
    public final v7 f40374n;

    public s7(v7 v7Var) {
        super(v7Var, 3);
        this.f40374n = v7Var;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        float f7;
        m7 m7Var = (m7) c1Var.f46524a;
        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) m7Var.f38441b.getChildAt(0);
        zh.a aVar = ((o7) this.f36987e.get(i10)).d;
        if (aVar == m7Var.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != this.f36987e.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        m7Var.setTag(aVar);
        v7 v7Var = this.f40374n;
        if (aVar.f53555f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f20059id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(v7Var.d.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = aVar.f53551a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = aVar.f53552b;
            String fileExtension = FileLoader.getFileExtension(aVar.f53551a);
            TLRPC.Document document = tL_message.media.document;
            document.f20044id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = aVar.f53553c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (aVar.f53554e == null) {
                c3.j0 j0Var = new c3.j0();
                aVar.f53554e = j0Var;
                j0Var.f4081b = true;
                Utilities.globalQueue.postRunnable(new r1(v7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.f53551a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(v7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f53555f = messageObject;
            messageObject.mediaExists = true;
        }
        j7Var.f(aVar.f53555f, z11);
        boolean z12 = aVar.f53554e.f4081b;
        boolean z13 = !z12;
        if (!z10) {
            if (!z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            j7Var.f22348g0 = f7;
        }
        if (j7Var.f22347f0 != z13) {
            j7Var.f22347f0 = z13;
            j7Var.invalidate();
        }
        m7Var.d = z11;
        m7Var.f38442c.setText(AndroidUtilities.formatFileSize(aVar.f53553c));
        m7Var.f38440a.a(this.f40374n.f41574f.f53564j.contains(aVar), z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        m7 m7Var = new m7(this, viewGroup.getContext(), 1);
        m7Var.f38443e = 3;
        r7 r7Var = new r7(this, viewGroup.getContext(), m7Var);
        r7Var.setCheckForButtonPress(true);
        m7Var.f38441b.addView(r7Var);
        return new s4.c1(m7Var);
    }
}
