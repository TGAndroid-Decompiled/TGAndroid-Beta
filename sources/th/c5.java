package th;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b8;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.messenger.y20;
import org.telegram.tgnet.TLRPC;
public final class c5 implements r20 {
    public final int f48856a;
    public final d5 f48857b;

    public c5(d5 d5Var, int i10) {
        this.f48856a = i10;
        this.f48857b = d5Var;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f48856a;
        d5 d5Var = this.f48857b;
        switch (i10) {
            case 0:
                vh.n5 n5Var = d5Var.f48892c;
                n5Var.f51536c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = n5Var.f51536c0;
                int i11 = wp.D8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f19806id = document.f19800id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                d5Var.c(tL_inputFileStoryDocument);
                return;
            default:
                y20 y20Var = (y20) obj;
                d5Var.F = y20Var;
                d5Var.E.f16709p0 = y20Var;
                d5Var.D = y20Var.f19542r / 1000;
                if (y20Var.c()) {
                    MediaController.B().h0(d5Var.E, false, false, false);
                    return;
                } else if (new File(d5Var.E.f16709p0.f19539o).renameTo(new File(d5Var.e))) {
                    b8.G(d5Var.M.f48918a).i0(false, 33554432, d5Var.e, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
