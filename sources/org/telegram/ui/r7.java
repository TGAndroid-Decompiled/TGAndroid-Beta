package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r7 extends h7 {
    public final t7 f37057n;

    public r7(t7 t7Var) {
        super(t7Var, 3);
        this.f37057n = t7Var;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        float f7;
        l7 l7Var = (l7) c1Var.f42974a;
        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) l7Var.f35331b.getChildAt(0);
        zh.a aVar = ((n7) this.e.get(i10)).d;
        if (aVar == l7Var.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != this.e.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        l7Var.setTag(aVar);
        t7 t7Var = this.f37057n;
        if (aVar.f49494f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f18349id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(t7Var.d.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = aVar.f49491a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = aVar.f49492b;
            String fileExtension = FileLoader.getFileExtension(aVar.f49491a);
            TLRPC.Document document = tL_message.media.document;
            document.f18334id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = aVar.f49493c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (aVar.e == null) {
                c3.k0 k0Var = new c3.k0();
                aVar.e = k0Var;
                k0Var.f3787b = true;
                Utilities.globalQueue.postRunnable(new q1(t7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.f49491a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(t7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f49494f = messageObject;
            messageObject.mediaExists = true;
        }
        k7Var.f(aVar.f49494f, z11);
        boolean z12 = aVar.e.f3787b;
        boolean z13 = !z12;
        if (!z10) {
            if (!z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            k7Var.f20564g0 = f7;
        }
        if (k7Var.f20563f0 != z13) {
            k7Var.f20563f0 = z13;
            k7Var.invalidate();
        }
        l7Var.d = z11;
        l7Var.f35332c.setText(AndroidUtilities.formatFileSize(aVar.f49493c));
        l7Var.f35330a.a(this.f37057n.f37648f.f49502j.contains(aVar), z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        l7 l7Var = new l7(this, viewGroup.getContext(), 1);
        l7Var.e = 3;
        q7 q7Var = new q7(this, viewGroup.getContext(), l7Var);
        q7Var.setCheckForButtonPress(true);
        l7Var.f35331b.addView(q7Var);
        return new s4.c1(l7Var);
    }
}
