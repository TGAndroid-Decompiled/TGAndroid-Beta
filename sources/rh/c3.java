package rh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public final class c3 implements r4 {

    public final s f47085a;

    public final a f47086b;

    public final p3 f47087c;

    public c3(a aVar, s sVar, p3 p3Var) {
        this.f47087c = p3Var;
        this.f47085a = sVar;
        this.f47086b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            s sVar = this.f47085a;
            sVar.f47421j = i10;
            sVar.f47422k = i11;
        }
        View viewZ1 = this.f47087c.z1(this.f47086b);
        if (viewZ1 instanceof m4) {
            viewZ1.requestLayout();
            viewZ1.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        s sVar = this.f47085a;
        sVar.f47419g = photo;
        sVar.f47414a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f22405w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            sVar.f47421j = i10;
            sVar.f47422k = i11;
        }
        a aVar = this.f47086b;
        TL_iv.PageBlock pageBlockN3 = p3.N3(aVar, sVar);
        if (pageBlockN3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) pageBlockN3).photo_id = photo.f22404id;
        }
        p3 p3Var = this.f47087c;
        p3Var.V3.remove(sVar);
        p3Var.n4(aVar);
        p3Var.f47340d3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        s sVar = this.f47085a;
        sVar.h = document;
        sVar.f47414a = 2;
        a aVar = this.f47086b;
        TL_iv.PageBlock pageBlockN3 = p3.N3(aVar, sVar);
        if (pageBlockN3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) pageBlockN3).video_id = document.f22386id;
        }
        p3 p3Var = this.f47087c;
        p3Var.V3.remove(sVar);
        p3Var.n4(aVar);
        p3Var.f47340d3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f47085a.f47418f = f10;
        a aVar = this.f47086b;
        p3 p3Var = this.f47087c;
        View viewZ1 = p3Var.z1(aVar);
        if (viewZ1 instanceof m4) {
            viewZ1.requestLayout();
            viewZ1.invalidate();
        }
        p3Var.f47340d3.onContentChanged();
    }

    @Override
    public final void onError() {
        s sVar = this.f47085a;
        sVar.f47414a = 3;
        p3 p3Var = this.f47087c;
        p3Var.V3.remove(sVar);
        p3Var.q4(this.f47086b, sVar);
        p3Var.f47340d3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}
