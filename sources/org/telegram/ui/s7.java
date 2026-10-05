package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s7 extends i7 {
    public final v7 f40359n;

    public s7(v7 v7Var) {
        super(v7Var, 3);
        this.f40359n = v7Var;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        float f7;
        m7 m7Var = (m7) c1Var.f46538a;
        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) m7Var.f38493b.getChildAt(0);
        zh.a aVar = ((o7) this.f37016e.get(i10)).d;
        if (aVar == m7Var.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != this.f37016e.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        m7Var.setTag(aVar);
        v7 v7Var = this.f40359n;
        if (aVar.f53577f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f20068id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(v7Var.d.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = aVar.f53573a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = aVar.f53574b;
            String fileExtension = FileLoader.getFileExtension(aVar.f53573a);
            TLRPC.Document document = tL_message.media.document;
            document.f20053id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = aVar.f53575c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (aVar.f53576e == null) {
                c3.j0 j0Var = new c3.j0();
                aVar.f53576e = j0Var;
                j0Var.f4082b = true;
                Utilities.globalQueue.postRunnable(new r1(v7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.f53573a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(v7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f53577f = messageObject;
            messageObject.mediaExists = true;
        }
        j7Var.f(aVar.f53577f, z11);
        boolean z12 = aVar.f53576e.f4082b;
        boolean z13 = !z12;
        if (!z10) {
            if (!z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            j7Var.f22356g0 = f7;
        }
        if (j7Var.f22355f0 != z13) {
            j7Var.f22355f0 = z13;
            j7Var.invalidate();
        }
        m7Var.d = z11;
        m7Var.f38494c.setText(AndroidUtilities.formatFileSize(aVar.f53575c));
        m7Var.f38492a.a(this.f40359n.f41622f.f53586j.contains(aVar), z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        m7 m7Var = new m7(this, viewGroup.getContext(), 1);
        m7Var.f38495e = 3;
        r7 r7Var = new r7(this, viewGroup.getContext(), m7Var);
        r7Var.setCheckForButtonPress(true);
        m7Var.f38493b.addView(r7Var);
        return new s4.c1(m7Var);
    }
}
