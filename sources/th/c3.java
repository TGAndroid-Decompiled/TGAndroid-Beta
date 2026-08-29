package th;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class c3 implements r4 {
    public final s f48385a;
    public final a f48386b;
    public final p3 f48387c;

    public c3(a aVar, s sVar, p3 p3Var) {
        this.f48387c = p3Var;
        this.f48385a = sVar;
        this.f48386b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            s sVar = this.f48385a;
            sVar.f48719j = i10;
            sVar.f48720k = i11;
        }
        View z12 = this.f48387c.z1(this.f48386b);
        if (z12 instanceof m4) {
            z12.requestLayout();
            z12.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        s sVar = this.f48385a;
        sVar.f48717g = photo;
        sVar.f48712a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f22417w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            sVar.f48719j = i10;
            sVar.f48720k = i11;
        }
        a aVar = this.f48386b;
        TL_iv.PageBlock N3 = p3.N3(aVar, sVar);
        if (N3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) N3).photo_id = photo.f22416id;
        }
        p3 p3Var = this.f48387c;
        p3Var.V3.remove(sVar);
        p3Var.n4(aVar);
        p3Var.f48638d3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        s sVar = this.f48385a;
        sVar.h = document;
        sVar.f48712a = 2;
        a aVar = this.f48386b;
        TL_iv.PageBlock N3 = p3.N3(aVar, sVar);
        if (N3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) N3).video_id = document.f22398id;
        }
        p3 p3Var = this.f48387c;
        p3Var.V3.remove(sVar);
        p3Var.n4(aVar);
        p3Var.f48638d3.onContentChanged();
    }

    @Override
    public final void f(float f9) {
        this.f48385a.f48716f = f9;
        a aVar = this.f48386b;
        p3 p3Var = this.f48387c;
        View z12 = p3Var.z1(aVar);
        if (z12 instanceof m4) {
            z12.requestLayout();
            z12.invalidate();
        }
        p3Var.f48638d3.onContentChanged();
    }

    @Override
    public final void onError() {
        s sVar = this.f48385a;
        sVar.f48712a = 3;
        p3 p3Var = this.f48387c;
        p3Var.V3.remove(sVar);
        p3Var.q4(this.f48386b, sVar);
        p3Var.f48638d3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}
