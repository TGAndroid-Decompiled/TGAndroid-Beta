package wh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class e3 implements t4 {
    public final t f49759a;
    public final a f49760b;
    public final r3 f49761c;

    public e3(a aVar, t tVar, r3 r3Var) {
        this.f49761c = r3Var;
        this.f49759a = tVar;
        this.f49760b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            t tVar = this.f49759a;
            tVar.f50073j = i10;
            tVar.f50074k = i11;
        }
        View y12 = this.f49761c.y1(this.f49760b);
        if (y12 instanceof o4) {
            y12.requestLayout();
            y12.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        t tVar = this.f49759a;
        tVar.f50071g = photo;
        tVar.f50066a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f20870w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            tVar.f50073j = i10;
            tVar.f50074k = i11;
        }
        a aVar = this.f49760b;
        TL_iv.PageBlock M3 = r3.M3(aVar, tVar);
        if (M3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) M3).photo_id = photo.f20869id;
        }
        r3 r3Var = this.f49761c;
        r3Var.W3.remove(tVar);
        r3Var.m4(aVar);
        r3Var.f50016e3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        t tVar = this.f49759a;
        tVar.h = document;
        tVar.f50066a = 2;
        a aVar = this.f49760b;
        TL_iv.PageBlock M3 = r3.M3(aVar, tVar);
        if (M3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) M3).video_id = document.f20851id;
        }
        r3 r3Var = this.f49761c;
        r3Var.W3.remove(tVar);
        r3Var.m4(aVar);
        r3Var.f50016e3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f49759a.f50070f = f10;
        a aVar = this.f49760b;
        r3 r3Var = this.f49761c;
        View y12 = r3Var.y1(aVar);
        if (y12 instanceof o4) {
            y12.requestLayout();
            y12.invalidate();
        }
        r3Var.f50016e3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f49759a;
        tVar.f50066a = 3;
        r3 r3Var = this.f49761c;
        r3Var.W3.remove(tVar);
        r3Var.p4(this.f49760b, tVar);
        r3Var.f50016e3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}
