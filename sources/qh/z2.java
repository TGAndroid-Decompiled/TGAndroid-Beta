package qh;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class z2 implements q4 {
    public final s f46868a;
    public final a f46869b;
    public final o3 f46870c;

    public z2(a aVar, s sVar, o3 o3Var) {
        this.f46870c = o3Var;
        this.f46868a = sVar;
        this.f46869b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        s sVar = this.f46868a;
        sVar.h = document;
        sVar.f46674i = document;
        sVar.f46668a = 2;
        TL_iv.PageBlock pageBlock = this.f46869b.f46269b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f22386id;
        }
        o3 o3Var = this.f46870c;
        o3Var.V3.remove(sVar);
        o3Var.U2.N(false);
        o3Var.f46565d3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f46868a.f46672f = f10;
        a aVar = this.f46869b;
        o3 o3Var = this.f46870c;
        View z12 = o3Var.z1(aVar);
        if (z12 instanceof x) {
            ((x) z12).m(false);
            z12.invalidate();
        }
        o3Var.f46565d3.onContentChanged();
    }

    @Override
    public final void onError() {
        s sVar = this.f46868a;
        sVar.f46668a = 3;
        o3 o3Var = this.f46870c;
        o3Var.V3.remove(sVar);
        int indexOf = o3Var.f46573h3.indexOf(this.f46869b);
        if (indexOf >= 0) {
            o3Var.f46573h3.remove(indexOf);
            o3Var.U2.N(true);
        }
        o3Var.f46565d3.onContentChanged();
    }

    @Override
    public final void b(TLRPC.Photo photo) {
    }

    @Override
    public final void c(TLRPC.Document document) {
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void a(int i9, int i10) {
    }
}
