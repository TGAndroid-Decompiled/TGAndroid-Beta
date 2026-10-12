package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s7 extends i7 {
    public final u7 f41825n;

    public s7(u7 u7Var) {
        super(u7Var, 3);
        this.f41825n = u7Var;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        boolean z11;
        float f7;
        m7 m7Var = (m7) d1Var.f47897a;
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) m7Var.f39936b.getChildAt(0);
        zh.a aVar = ((o7) this.f38270e.get(i10)).d;
        if (aVar == m7Var.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != this.f38270e.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        m7Var.setTag(aVar);
        u7 u7Var = this.f41825n;
        if (aVar.f54930f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f19824id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(u7Var.d.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = aVar.f54926a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = aVar.f54927b;
            String fileExtension = FileLoader.getFileExtension(aVar.f54926a);
            TLRPC.Document document = tL_message.media.document;
            document.f19809id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = aVar.f54928c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (aVar.f54929e == null) {
                c3.j0 j0Var = new c3.j0();
                aVar.f54929e = j0Var;
                j0Var.f4130b = true;
                Utilities.globalQueue.postRunnable(new r1(u7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.f54926a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(u7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f54930f = messageObject;
            messageObject.mediaExists = true;
        }
        i7Var.f(aVar.f54930f, z11);
        boolean z12 = aVar.f54929e.f4130b;
        boolean z13 = !z12;
        if (!z10) {
            if (!z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            i7Var.f22049g0 = f7;
        }
        if (i7Var.f22048f0 != z13) {
            i7Var.f22048f0 = z13;
            i7Var.invalidate();
        }
        m7Var.d = z11;
        m7Var.f39937c.setText(AndroidUtilities.formatFileSize(aVar.f54928c));
        m7Var.f39935a.a(this.f41825n.f42384f.f54939j.contains(aVar), z10);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        m7 m7Var = new m7(this, viewGroup.getContext(), 1);
        m7Var.f39938e = 3;
        r7 r7Var = new r7(this, viewGroup.getContext(), m7Var);
        r7Var.setCheckForButtonPress(true);
        m7Var.f39936b.addView(r7Var);
        return new s4.d1(m7Var);
    }
}
