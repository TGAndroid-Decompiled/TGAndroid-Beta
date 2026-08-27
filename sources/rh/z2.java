package rh;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public final class z2 implements r4 {

    public final s f47623a;

    public final a f47624b;

    public final String f47625c;
    public final p3 d;

    public z2(p3 p3Var, s sVar, a aVar, String str) {
        this.d = p3Var;
        this.f47623a = sVar;
        this.f47624b = aVar;
        this.f47625c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f47625c;
        document.localPath = str;
        p3 p3Var = this.d;
        FileLoader.getInstance(p3Var.f47336b3).setLocalPathTo(document, str);
        s sVar = this.f47623a;
        sVar.h = document;
        sVar.f47414a = 2;
        TL_iv.PageBlock pageBlock = this.f47624b.f47028b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f22386id;
        }
        p3Var.V3.remove(sVar);
        p3Var.U2.N(false);
        p3Var.f47340d3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f47623a.f47418f = f10;
        a aVar = this.f47624b;
        p3 p3Var = this.d;
        View viewZ1 = p3Var.z1(aVar);
        if (viewZ1 instanceof w0) {
            w0 w0Var = (w0) viewZ1;
            w0Var.h(w0Var.i());
            w0Var.k();
            w0Var.l(false);
            w0Var.requestLayout();
            w0Var.invalidate();
        }
        p3Var.f47340d3.onContentChanged();
    }

    @Override
    public final void onError() {
        s sVar = this.f47623a;
        sVar.f47414a = 3;
        p3 p3Var = this.d;
        p3Var.V3.remove(sVar);
        p3Var.f47348h3.remove(this.f47624b);
        p3Var.U2.N(true);
        p3Var.f47340d3.onContentChanged();
    }

    @Override
    public final void b(TLRPC.Photo photo) {
    }

    @Override
    public final void c(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void a(int i10, int i11) {
    }
}
