package uf;

import android.view.ViewTreeObserver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;

public final class j implements ViewTreeObserver.OnPreDrawListener {

    public final MediaController.CropState f48609a;

    public final int f48610b;

    public final int f48611c;
    public final n d;

    public j(n nVar, MediaController.CropState cropState, int i10, int i11) {
        this.d = nVar;
        this.f48609a = cropState;
        this.f48610b = i10;
        this.f48611c = i11;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        float f11;
        n nVar = this.d;
        nVar.l(false);
        CropAreaView cropAreaView = nVar.f48626a;
        MediaController.CropState cropState = this.f48609a;
        if (cropState != null) {
            float f12 = cropState.lockedAspectRatio;
            if (f12 > 1.0E-4f) {
                cropAreaView.setLockedAspectRatio(f12);
                m mVar = nVar.I;
                if (mVar != null) {
                    mVar.q(true);
                }
            }
            nVar.setFreeform(cropState.freeform);
            float aspectRatio = cropAreaView.getAspectRatio();
            int i10 = cropState.transformRotation;
            int i11 = this.f48610b;
            int i12 = this.f48611c;
            if (i10 == 90 || i10 == 270) {
                aspectRatio = 1.0f / aspectRatio;
                l lVar = nVar.H;
                f10 = lVar.f48617b;
                f11 = lVar.f48616a;
            } else {
                l lVar2 = nVar.H;
                f10 = lVar2.f48616a;
                f11 = lVar2.f48617b;
                i12 = i11;
                i11 = i12;
            }
            if (!nVar.f48635x || cropAreaView.getLockAspectRatio() <= 0.0f) {
                cropAreaView.e(nVar.getCurrentWidth(), nVar.getCurrentHeight(), (((float) i10) + nVar.H.f48621g) % 180.0f != 0.0f, nVar.f48635x);
            } else {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            }
            l.d(nVar.H, i10);
            cropAreaView.setActualRect((aspectRatio * cropState.cropPw) / cropState.cropPh);
            l lVar3 = nVar.H;
            lVar3.f48623j = cropState.mirrored;
            l.e(lVar3, cropState.cropRotate);
            l lVar4 = nVar.H;
            float f13 = cropState.cropPx * i11;
            float f14 = lVar4.f48620f;
            l.f(lVar4, f13 * f14, cropState.cropPy * i12 * f14);
            float fMax = Math.max(cropAreaView.getCropWidth() / f10, cropAreaView.getCropHeight() / f11);
            l lVar5 = nVar.H;
            l.g(lVar5, cropState.cropScale * (fMax / lVar5.f48620f), 0.0f, 0.0f);
            nVar.r(false);
            m mVar2 = nVar.I;
            if (mVar2 != null) {
                mVar2.D(false);
            }
        }
        cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
