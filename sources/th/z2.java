package th;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class z2 implements r4 {
    public final s f48921a;
    public final a f48922b;
    public final String f48923c;
    public final p3 d;

    public z2(p3 p3Var, s sVar, a aVar, String str) {
        this.d = p3Var;
        this.f48921a = sVar;
        this.f48922b = aVar;
        this.f48923c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f48923c;
        document.localPath = str;
        p3 p3Var = this.d;
        FileLoader.getInstance(p3Var.f48635b3).setLocalPathTo(document, str);
        s sVar = this.f48921a;
        sVar.h = document;
        sVar.f48712a = 2;
        TL_iv.PageBlock pageBlock = this.f48922b.f48328b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f22398id;
        }
        p3Var.V3.remove(sVar);
        p3Var.U2.N(false);
        p3Var.f48638d3.onContentChanged();
    }

    @Override
    public final void f(float f9) {
        this.f48921a.f48716f = f9;
        a aVar = this.f48922b;
        p3 p3Var = this.d;
        View z12 = p3Var.z1(aVar);
        if (z12 instanceof w0) {
            w0 w0Var = (w0) z12;
            w0Var.h(w0Var.i());
            w0Var.k();
            w0Var.l(false);
            w0Var.requestLayout();
            w0Var.invalidate();
        }
        p3Var.f48638d3.onContentChanged();
    }

    @Override
    public final void onError() {
        s sVar = this.f48921a;
        sVar.f48712a = 3;
        p3 p3Var = this.d;
        p3Var.V3.remove(sVar);
        p3Var.f48646h3.remove(this.f48922b);
        p3Var.U2.N(true);
        p3Var.f48638d3.onContentChanged();
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
