package wf;

import android.view.ViewTreeObserver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class i implements ViewTreeObserver.OnPreDrawListener {
    public final MediaController.CropState f49933a;
    public final int f49934b;
    public final int f49935c;
    public final n d;

    public i(n nVar, MediaController.CropState cropState, int i10, int i11) {
        this.d = nVar;
        this.f49933a = cropState;
        this.f49934b = i10;
        this.f49935c = i11;
    }

    @Override
    public final boolean onPreDraw() {
        float f9;
        float f10;
        boolean z10;
        n nVar = this.d;
        nVar.l(false);
        CropAreaView cropAreaView = nVar.f49953a;
        MediaController.CropState cropState = this.f49933a;
        if (cropState != null) {
            float f11 = cropState.lockedAspectRatio;
            if (f11 > 1.0E-4f) {
                cropAreaView.setLockedAspectRatio(f11);
                m mVar = nVar.I;
                if (mVar != null) {
                    mVar.C(true);
                }
            }
            nVar.setFreeform(cropState.freeform);
            float aspectRatio = cropAreaView.getAspectRatio();
            int i10 = cropState.transformRotation;
            int i11 = this.f49934b;
            int i12 = this.f49935c;
            if (i10 != 90 && i10 != 270) {
                l lVar = nVar.H;
                f9 = lVar.f49943a;
                f10 = lVar.f49944b;
                i12 = i11;
                i11 = i12;
            } else {
                aspectRatio = 1.0f / aspectRatio;
                l lVar2 = nVar.H;
                f9 = lVar2.f49944b;
                f10 = lVar2.f49943a;
            }
            if (nVar.f49962x && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = nVar.getCurrentWidth();
                int currentHeight = nVar.getCurrentHeight();
                if ((i10 + nVar.H.f49948g) % 180.0f != 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z10, nVar.f49962x);
            }
            l.d(nVar.H, i10);
            cropAreaView.setActualRect((aspectRatio * cropState.cropPw) / cropState.cropPh);
            l lVar3 = nVar.H;
            lVar3.f49950j = cropState.mirrored;
            l.e(lVar3, cropState.cropRotate);
            l lVar4 = nVar.H;
            float f12 = cropState.cropPx * i11;
            float f13 = lVar4.f49947f;
            l.f(lVar4, f12 * f13, cropState.cropPy * i12 * f13);
            float max = Math.max(cropAreaView.getCropWidth() / f9, cropAreaView.getCropHeight() / f10);
            l lVar5 = nVar.H;
            l.g(lVar5, cropState.cropScale * (max / lVar5.f49947f), 0.0f, 0.0f);
            nVar.r(false);
            m mVar2 = nVar.I;
            if (mVar2 != null) {
                mVar2.P(false);
            }
        }
        cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
