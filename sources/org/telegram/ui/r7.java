package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r7 extends h7 {
    public final u7 f49113n;

    public r7(u7 u7Var) {
        super(u7Var, 3);
        this.f49113n = u7Var;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        boolean z11;
        float f10;
        l7 l7Var = (l7) d1Var.f55540a;
        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) l7Var.f47127b.getChildAt(0);
        di.b bVar = ((n7) this.f45561e.get(i3)).d;
        if (bVar == l7Var.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i3 != this.f45561e.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        l7Var.setTag(bVar);
        u7 u7Var = this.f49113n;
        if (bVar.f9184f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f27022id = i3;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long e10 = org.telegram.messenger.h10.i(u7Var.f49999e.getCurrentAccount()).e();
            tL_peerUser.user_id = e10;
            peer.user_id = e10;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = bVar.f9180a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = bVar.f9181b;
            String D = org.telegram.messenger.w7.D(bVar.f9180a);
            TLRPC.Document document = tL_message.media.document;
            document.f27007id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (D.length() <= 0) {
                D = "mp3";
            }
            document.mime_type = "audio/".concat(D);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = bVar.f9182c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (bVar.f9183e == null) {
                ?? obj = new Object();
                bVar.f9183e = obj;
                obj.f9179a = true;
                Utilities.f21387e.c(new p1(u7Var, bVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = bVar.f9180a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(u7Var.f49999e.getCurrentAccount(), tL_message, false, false);
            bVar.f9184f = ziVar;
            ziVar.f26917x0 = true;
        }
        f7Var.f(bVar.f9184f, z11);
        boolean z12 = bVar.f9183e.f9179a;
        boolean z13 = !z12;
        if (!z10) {
            if (!z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            f7Var.f29224h0 = f10;
        }
        if (f7Var.f29223g0 != z13) {
            f7Var.f29223g0 = z13;
            f7Var.invalidate();
        }
        l7Var.d = z11;
        l7Var.f47128c.setText(org.telegram.messenger.g0.i0(bVar.f9182c, false, false));
        l7Var.f47126a.a(this.f49113n.h.f9193j.contains(bVar), z10);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        l7 l7Var = new l7(this, viewGroup.getContext(), 1);
        l7Var.f47129e = 3;
        q7 q7Var = new q7(this, viewGroup.getContext(), l7Var);
        q7Var.setCheckForButtonPress(true);
        l7Var.f47127b.addView(q7Var);
        return new u4.d1(l7Var);
    }
}
