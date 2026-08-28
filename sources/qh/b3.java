package qh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class b3 implements q4 {
    public final s f46310a;
    public final a f46311b;
    public final o3 f46312c;

    public b3(a aVar, s sVar, o3 o3Var) {
        this.f46312c = o3Var;
        this.f46310a = sVar;
        this.f46311b = aVar;
    }

    @Override
    public final void a(int i9, int i10) {
        if (i9 > 0 && i10 > 0) {
            s sVar = this.f46310a;
            sVar.f46675j = i9;
            sVar.f46676k = i10;
        }
        View z12 = this.f46312c.z1(this.f46311b);
        if (z12 instanceof l4) {
            z12.requestLayout();
            z12.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i9;
        int i10;
        s sVar = this.f46310a;
        sVar.f46673g = photo;
        sVar.f46668a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i9 = closestPhotoSizeWithSize.f22405w) > 0 && (i10 = closestPhotoSizeWithSize.h) > 0) {
            sVar.f46675j = i9;
            sVar.f46676k = i10;
        }
        a aVar = this.f46311b;
        TL_iv.PageBlock N3 = o3.N3(aVar, sVar);
        if (N3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) N3).photo_id = photo.f22404id;
        }
        o3 o3Var = this.f46312c;
        o3Var.V3.remove(sVar);
        o3Var.n4(aVar);
        o3Var.f46565d3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        s sVar = this.f46310a;
        sVar.h = document;
        sVar.f46668a = 2;
        a aVar = this.f46311b;
        TL_iv.PageBlock N3 = o3.N3(aVar, sVar);
        if (N3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) N3).video_id = document.f22386id;
        }
        o3 o3Var = this.f46312c;
        o3Var.V3.remove(sVar);
        o3Var.n4(aVar);
        o3Var.f46565d3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f46310a.f46672f = f10;
        a aVar = this.f46311b;
        o3 o3Var = this.f46312c;
        View z12 = o3Var.z1(aVar);
        if (z12 instanceof l4) {
            z12.requestLayout();
            z12.invalidate();
        }
        o3Var.f46565d3.onContentChanged();
    }

    @Override
    public final void onError() {
        s sVar = this.f46310a;
        sVar.f46668a = 3;
        o3 o3Var = this.f46312c;
        o3Var.V3.remove(sVar);
        o3Var.q4(this.f46311b, sVar);
        o3Var.f46565d3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}
