package yf;

import android.view.ViewTreeObserver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class i implements ViewTreeObserver.OnPreDrawListener {
    public final MediaController.CropState f47292a;
    public final int f47293b;
    public final int f47294c;
    public final n d;

    public i(n nVar, MediaController.CropState cropState, int i10, int i11) {
        this.d = nVar;
        this.f47292a = cropState;
        this.f47293b = i10;
        this.f47294c = i11;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        float f11;
        boolean z4;
        n nVar = this.d;
        nVar.l(false);
        CropAreaView cropAreaView = nVar.f47310a;
        MediaController.CropState cropState = this.f47292a;
        if (cropState != null) {
            float f12 = cropState.lockedAspectRatio;
            if (f12 > 1.0E-4f) {
                cropAreaView.setLockedAspectRatio(f12);
                m mVar = nVar.J;
                if (mVar != null) {
                    mVar.M0(true);
                }
            }
            nVar.setFreeform(cropState.freeform);
            float aspectRatio = cropAreaView.getAspectRatio();
            int i10 = cropState.transformRotation;
            int i11 = this.f47293b;
            int i12 = this.f47294c;
            if (i10 != 90 && i10 != 270) {
                l lVar = nVar.I;
                f10 = lVar.f47301a;
                f11 = lVar.f47302b;
                i12 = i11;
                i11 = i12;
            } else {
                aspectRatio = 1.0f / aspectRatio;
                l lVar2 = nVar.I;
                f10 = lVar2.f47302b;
                f11 = lVar2.f47301a;
            }
            if (nVar.f47318x && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = nVar.getCurrentWidth();
                int currentHeight = nVar.getCurrentHeight();
                if ((i10 + nVar.I.f47305g) % 180.0f != 0.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z4, nVar.f47318x);
            }
            l.d(nVar.I, i10);
            cropAreaView.setActualRect((aspectRatio * cropState.cropPw) / cropState.cropPh);
            l lVar3 = nVar.I;
            lVar3.f47307j = cropState.mirrored;
            l.e(lVar3, cropState.cropRotate);
            l lVar4 = nVar.I;
            float f13 = cropState.cropPx * i11;
            float f14 = lVar4.f47304f;
            l.f(lVar4, f13 * f14, cropState.cropPy * i12 * f14);
            float max = Math.max(cropAreaView.getCropWidth() / f10, cropAreaView.getCropHeight() / f11);
            l lVar5 = nVar.I;
            l.g(lVar5, cropState.cropScale * (max / lVar5.f47304f), 0.0f, 0.0f);
            nVar.r(false);
            m mVar2 = nVar.J;
            if (mVar2 != null) {
                mVar2.G1(false);
            }
        }
        cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
