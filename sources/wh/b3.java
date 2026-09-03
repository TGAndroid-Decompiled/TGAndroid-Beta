package wh;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class b3 implements t4 {
    public final t f49697a;
    public final a f49698b;
    public final String f49699c;
    public final r3 d;

    public b3(r3 r3Var, t tVar, a aVar, String str) {
        this.d = r3Var;
        this.f49697a = tVar;
        this.f49698b = aVar;
        this.f49699c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f49699c;
        document.localPath = str;
        r3 r3Var = this.d;
        FileLoader.getInstance(r3Var.c3).setLocalPathTo(document, str);
        t tVar = this.f49697a;
        tVar.h = document;
        tVar.f50066a = 2;
        TL_iv.PageBlock pageBlock = this.f49698b.f49653b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f20851id;
        }
        r3Var.W3.remove(tVar);
        r3Var.V2.N(false);
        r3Var.f50016e3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f49697a.f50070f = f10;
        a aVar = this.f49698b;
        r3 r3Var = this.d;
        View y12 = r3Var.y1(aVar);
        if (y12 instanceof x0) {
            x0 x0Var = (x0) y12;
            x0Var.h(x0Var.i());
            x0Var.k();
            x0Var.l(false);
            x0Var.requestLayout();
            x0Var.invalidate();
        }
        r3Var.f50016e3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f49697a;
        tVar.f50066a = 3;
        r3 r3Var = this.d;
        r3Var.W3.remove(tVar);
        r3Var.f50024i3.remove(this.f49698b);
        r3Var.V2.N(true);
        r3Var.f50016e3.onContentChanged();
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
