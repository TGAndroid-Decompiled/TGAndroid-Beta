package vh;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class b3 implements t4 {
    public final s f45816a;
    public final a f45817b;
    public final String f45818c;
    public final r3 d;

    public b3(r3 r3Var, s sVar, a aVar, String str) {
        this.d = r3Var;
        this.f45816a = sVar;
        this.f45817b = aVar;
        this.f45818c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f45818c;
        document.localPath = str;
        r3 r3Var = this.d;
        FileLoader.getInstance(r3Var.c3).setLocalPathTo(document, str);
        s sVar = this.f45816a;
        sVar.h = document;
        sVar.f46150a = 2;
        TL_iv.PageBlock pageBlock = this.f45817b.f45775b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f19190id;
        }
        r3Var.W3.remove(sVar);
        r3Var.V2.N(false);
        r3Var.f46112e3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f45816a.f46153f = f10;
        a aVar = this.f45817b;
        r3 r3Var = this.d;
        View z12 = r3Var.z1(aVar);
        if (z12 instanceof w0) {
            w0 w0Var = (w0) z12;
            w0Var.h(w0Var.i());
            w0Var.k();
            w0Var.l(false);
            w0Var.requestLayout();
            w0Var.invalidate();
        }
        r3Var.f46112e3.onContentChanged();
    }

    @Override
    public final void onError() {
        s sVar = this.f45816a;
        sVar.f46150a = 3;
        r3 r3Var = this.d;
        r3Var.W3.remove(sVar);
        r3Var.f46120i3.remove(this.f45817b);
        r3Var.V2.N(true);
        r3Var.f46112e3.onContentChanged();
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
