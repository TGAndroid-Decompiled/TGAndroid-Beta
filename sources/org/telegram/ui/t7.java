package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t7 extends j7 {
    public final v7 f37667n;

    public t7(v7 v7Var) {
        super(v7Var, 3);
        this.f37667n = v7Var;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        float f7;
        n7 n7Var = (n7) c1Var.f43005a;
        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) n7Var.f35834b.getChildAt(0);
        zh.a aVar = ((p7) this.e.get(i10)).d;
        if (aVar == n7Var.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != this.e.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        n7Var.setTag(aVar);
        v7 v7Var = this.f37667n;
        if (aVar.f49513f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f18350id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(v7Var.d.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = aVar.f49510a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = aVar.f49511b;
            String fileExtension = FileLoader.getFileExtension(aVar.f49510a);
            TLRPC.Document document = tL_message.media.document;
            document.f18335id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = aVar.f49512c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (aVar.e == null) {
                c3.k0 k0Var = new c3.k0();
                aVar.e = k0Var;
                k0Var.f3781b = true;
                Utilities.globalQueue.postRunnable(new s1(v7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.f49510a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(v7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f49513f = messageObject;
            messageObject.mediaExists = true;
        }
        j7Var.f(aVar.f49513f, z11);
        boolean z12 = aVar.e.f3781b;
        boolean z13 = !z12;
        if (!z10) {
            if (!z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            j7Var.f20530g0 = f7;
        }
        if (j7Var.f20529f0 != z13) {
            j7Var.f20529f0 = z13;
            j7Var.invalidate();
        }
        n7Var.d = z11;
        n7Var.f35835c.setText(AndroidUtilities.formatFileSize(aVar.f49512c));
        n7Var.f35833a.a(this.f37667n.f38466f.f49521j.contains(aVar), z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        n7 n7Var = new n7(this, viewGroup.getContext(), 1);
        n7Var.e = 3;
        s7 s7Var = new s7(this, viewGroup.getContext(), n7Var);
        s7Var.setCheckForButtonPress(true);
        n7Var.f35834b.addView(s7Var);
        return new s4.c1(n7Var);
    }
}
