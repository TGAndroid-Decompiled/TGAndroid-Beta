package vh;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class c3 implements u4 {
    public final t f45916a;
    public final a f45917b;
    public final String f45918c;
    public final s3 d;

    public c3(s3 s3Var, t tVar, a aVar, String str) {
        this.d = s3Var;
        this.f45916a = tVar;
        this.f45917b = aVar;
        this.f45918c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f45918c;
        document.localPath = str;
        s3 s3Var = this.d;
        FileLoader.getInstance(s3Var.c3).setLocalPathTo(document, str);
        t tVar = this.f45916a;
        tVar.h = document;
        tVar.f46247a = 2;
        TL_iv.PageBlock pageBlock = this.f45917b.f45853b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f19165id;
        }
        s3Var.W3.remove(tVar);
        s3Var.V2.N(false);
        s3Var.f46209e3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f45916a.f46250f = f10;
        a aVar = this.f45917b;
        s3 s3Var = this.d;
        View y12 = s3Var.y1(aVar);
        if (y12 instanceof x0) {
            x0 x0Var = (x0) y12;
            x0Var.h(x0Var.i());
            x0Var.k();
            x0Var.l(false);
            x0Var.requestLayout();
            x0Var.invalidate();
        }
        s3Var.f46209e3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f45916a;
        tVar.f46247a = 3;
        s3 s3Var = this.d;
        s3Var.W3.remove(tVar);
        s3Var.f46217i3.remove(this.f45917b);
        s3Var.V2.N(true);
        s3Var.f46209e3.onContentChanged();
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
