package qh;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class y2 implements q4 {
    public final s f46845a;
    public final a f46846b;
    public final String f46847c;
    public final o3 d;

    public y2(o3 o3Var, s sVar, a aVar, String str) {
        this.d = o3Var;
        this.f46845a = sVar;
        this.f46846b = aVar;
        this.f46847c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f46847c;
        document.localPath = str;
        o3 o3Var = this.d;
        FileLoader.getInstance(o3Var.f46561b3).setLocalPathTo(document, str);
        s sVar = this.f46845a;
        sVar.h = document;
        sVar.f46668a = 2;
        TL_iv.PageBlock pageBlock = this.f46846b.f46269b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f22386id;
        }
        o3Var.V3.remove(sVar);
        o3Var.U2.N(false);
        o3Var.f46565d3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f46845a.f46672f = f10;
        a aVar = this.f46846b;
        o3 o3Var = this.d;
        View z12 = o3Var.z1(aVar);
        if (z12 instanceof w0) {
            w0 w0Var = (w0) z12;
            w0Var.h(w0Var.i());
            w0Var.k();
            w0Var.l(false);
            w0Var.requestLayout();
            w0Var.invalidate();
        }
        o3Var.f46565d3.onContentChanged();
    }

    @Override
    public final void onError() {
        s sVar = this.f46845a;
        sVar.f46668a = 3;
        o3 o3Var = this.d;
        o3Var.V3.remove(sVar);
        o3Var.f46573h3.remove(this.f46846b);
        o3Var.U2.N(true);
        o3Var.f46565d3.onContentChanged();
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
    public final void a(int i9, int i10) {
    }
}
