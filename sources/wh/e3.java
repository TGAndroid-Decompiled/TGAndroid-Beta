package wh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class e3 implements t4 {
    public final t f49723a;
    public final a f49724b;
    public final r3 f49725c;

    public e3(a aVar, t tVar, r3 r3Var) {
        this.f49725c = r3Var;
        this.f49723a = tVar;
        this.f49724b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            t tVar = this.f49723a;
            tVar.f50037j = i10;
            tVar.f50038k = i11;
        }
        View z12 = this.f49725c.z1(this.f49724b);
        if (z12 instanceof o4) {
            z12.requestLayout();
            z12.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        t tVar = this.f49723a;
        tVar.f50035g = photo;
        tVar.f50030a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f20868w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            tVar.f50037j = i10;
            tVar.f50038k = i11;
        }
        a aVar = this.f49724b;
        TL_iv.PageBlock N3 = r3.N3(aVar, tVar);
        if (N3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) N3).photo_id = photo.f20867id;
        }
        r3 r3Var = this.f49725c;
        r3Var.W3.remove(tVar);
        r3Var.n4(aVar);
        r3Var.f49980e3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        t tVar = this.f49723a;
        tVar.h = document;
        tVar.f50030a = 2;
        a aVar = this.f49724b;
        TL_iv.PageBlock N3 = r3.N3(aVar, tVar);
        if (N3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) N3).video_id = document.f20849id;
        }
        r3 r3Var = this.f49725c;
        r3Var.W3.remove(tVar);
        r3Var.n4(aVar);
        r3Var.f49980e3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f49723a.f50034f = f10;
        a aVar = this.f49724b;
        r3 r3Var = this.f49725c;
        View z12 = r3Var.z1(aVar);
        if (z12 instanceof o4) {
            z12.requestLayout();
            z12.invalidate();
        }
        r3Var.f49980e3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f49723a;
        tVar.f50030a = 3;
        r3 r3Var = this.f49725c;
        r3Var.W3.remove(tVar);
        r3Var.q4(this.f49724b, tVar);
        r3Var.f49980e3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}
