package th;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b8;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.x20;
import org.telegram.tgnet.TLRPC;
public final class c5 implements q20 {
    public final int f48842a;
    public final d5 f48843b;

    public c5(d5 d5Var, int i10) {
        this.f48842a = i10;
        this.f48843b = d5Var;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f48842a;
        d5 d5Var = this.f48843b;
        switch (i10) {
            case 0:
                vh.n5 n5Var = d5Var.f48878c;
                n5Var.f51521c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = n5Var.f51521c0;
                int i11 = vp.D8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f19805id = document.f19799id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                d5Var.c(tL_inputFileStoryDocument);
                return;
            default:
                x20 x20Var = (x20) obj;
                d5Var.F = x20Var;
                d5Var.E.f16356p0 = x20Var;
                d5Var.D = x20Var.f19199r / 1000;
                if (x20Var.c()) {
                    MediaController.B().h0(d5Var.E, false, false, false);
                    return;
                } else if (new File(d5Var.E.f16356p0.f19196o).renameTo(new File(d5Var.e))) {
                    b8.G(d5Var.M.f48904a).i0(false, 33554432, d5Var.e, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
