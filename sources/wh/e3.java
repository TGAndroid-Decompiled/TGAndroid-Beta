package wh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class e3 implements t4 {
    public final t f49722a;
    public final a f49723b;
    public final r3 f49724c;

    public e3(a aVar, t tVar, r3 r3Var) {
        this.f49724c = r3Var;
        this.f49722a = tVar;
        this.f49723b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            t tVar = this.f49722a;
            tVar.f50036j = i10;
            tVar.f50037k = i11;
        }
        View z12 = this.f49724c.z1(this.f49723b);
        if (z12 instanceof o4) {
            z12.requestLayout();
            z12.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        t tVar = this.f49722a;
        tVar.f50034g = photo;
        tVar.f50029a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f20868w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            tVar.f50036j = i10;
            tVar.f50037k = i11;
        }
        a aVar = this.f49723b;
        TL_iv.PageBlock N3 = r3.N3(aVar, tVar);
        if (N3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) N3).photo_id = photo.f20867id;
        }
        r3 r3Var = this.f49724c;
        r3Var.W3.remove(tVar);
        r3Var.n4(aVar);
        r3Var.f49979e3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        t tVar = this.f49722a;
        tVar.h = document;
        tVar.f50029a = 2;
        a aVar = this.f49723b;
        TL_iv.PageBlock N3 = r3.N3(aVar, tVar);
        if (N3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) N3).video_id = document.f20849id;
        }
        r3 r3Var = this.f49724c;
        r3Var.W3.remove(tVar);
        r3Var.n4(aVar);
        r3Var.f49979e3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f49722a.f50033f = f10;
        a aVar = this.f49723b;
        r3 r3Var = this.f49724c;
        View z12 = r3Var.z1(aVar);
        if (z12 instanceof o4) {
            z12.requestLayout();
            z12.invalidate();
        }
        r3Var.f49979e3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f49722a;
        tVar.f50029a = 3;
        r3 r3Var = this.f49724c;
        r3Var.W3.remove(tVar);
        r3Var.q4(this.f49723b, tVar);
        r3Var.f49979e3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}
