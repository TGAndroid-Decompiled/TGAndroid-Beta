package vh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class e3 implements t4 {
    public final s f45875a;
    public final a f45876b;
    public final r3 f45877c;

    public e3(a aVar, s sVar, r3 r3Var) {
        this.f45877c = r3Var;
        this.f45875a = sVar;
        this.f45876b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            s sVar = this.f45875a;
            sVar.f46156j = i10;
            sVar.f46157k = i11;
        }
        View z12 = this.f45877c.z1(this.f45876b);
        if (z12 instanceof o4) {
            z12.requestLayout();
            z12.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        s sVar = this.f45875a;
        sVar.f46154g = photo;
        sVar.f46150a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f19209w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            sVar.f46156j = i10;
            sVar.f46157k = i11;
        }
        a aVar = this.f45876b;
        TL_iv.PageBlock N3 = r3.N3(aVar, sVar);
        if (N3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) N3).photo_id = photo.f19208id;
        }
        r3 r3Var = this.f45877c;
        r3Var.W3.remove(sVar);
        r3Var.n4(aVar);
        r3Var.f46112e3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        s sVar = this.f45875a;
        sVar.h = document;
        sVar.f46150a = 2;
        a aVar = this.f45876b;
        TL_iv.PageBlock N3 = r3.N3(aVar, sVar);
        if (N3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) N3).video_id = document.f19190id;
        }
        r3 r3Var = this.f45877c;
        r3Var.W3.remove(sVar);
        r3Var.n4(aVar);
        r3Var.f46112e3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f45875a.f46153f = f10;
        a aVar = this.f45876b;
        r3 r3Var = this.f45877c;
        View z12 = r3Var.z1(aVar);
        if (z12 instanceof o4) {
            z12.requestLayout();
            z12.invalidate();
        }
        r3Var.f46112e3.onContentChanged();
    }

    @Override
    public final void onError() {
        s sVar = this.f45875a;
        sVar.f46150a = 3;
        r3 r3Var = this.f45877c;
        r3Var.W3.remove(sVar);
        r3Var.q4(this.f45876b, sVar);
        r3Var.f46112e3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}
