package vh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements u4 {
    public final t f45972a;
    public final a f45973b;
    public final s3 f45974c;

    public f3(a aVar, t tVar, s3 s3Var) {
        this.f45974c = s3Var;
        this.f45972a = tVar;
        this.f45973b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            t tVar = this.f45972a;
            tVar.f46253j = i10;
            tVar.f46254k = i11;
        }
        View y12 = this.f45974c.y1(this.f45973b);
        if (y12 instanceof p4) {
            y12.requestLayout();
            y12.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        t tVar = this.f45972a;
        tVar.f46251g = photo;
        tVar.f46247a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f19184w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            tVar.f46253j = i10;
            tVar.f46254k = i11;
        }
        a aVar = this.f45973b;
        TL_iv.PageBlock M3 = s3.M3(aVar, tVar);
        if (M3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) M3).photo_id = photo.f19183id;
        }
        s3 s3Var = this.f45974c;
        s3Var.W3.remove(tVar);
        s3Var.m4(aVar);
        s3Var.f46209e3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        t tVar = this.f45972a;
        tVar.h = document;
        tVar.f46247a = 2;
        a aVar = this.f45973b;
        TL_iv.PageBlock M3 = s3.M3(aVar, tVar);
        if (M3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) M3).video_id = document.f19165id;
        }
        s3 s3Var = this.f45974c;
        s3Var.W3.remove(tVar);
        s3Var.m4(aVar);
        s3Var.f46209e3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f45972a.f46250f = f10;
        a aVar = this.f45973b;
        s3 s3Var = this.f45974c;
        View y12 = s3Var.y1(aVar);
        if (y12 instanceof p4) {
            y12.requestLayout();
            y12.invalidate();
        }
        s3Var.f46209e3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f45972a;
        tVar.f46247a = 3;
        s3 s3Var = this.f45974c;
        s3Var.W3.remove(tVar);
        s3Var.p4(this.f45973b, tVar);
        s3Var.f46209e3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}
