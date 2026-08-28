package tf;

import android.view.ViewTreeObserver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class i implements ViewTreeObserver.OnPreDrawListener {
    public final MediaController.CropState f47884a;
    public final int f47885b;
    public final int f47886c;
    public final n d;

    public i(n nVar, MediaController.CropState cropState, int i9, int i10) {
        this.d = nVar;
        this.f47884a = cropState;
        this.f47885b = i9;
        this.f47886c = i10;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        float f11;
        boolean z10;
        n nVar = this.d;
        nVar.l(false);
        CropAreaView cropAreaView = nVar.f47904a;
        MediaController.CropState cropState = this.f47884a;
        if (cropState != null) {
            float f12 = cropState.lockedAspectRatio;
            if (f12 > 1.0E-4f) {
                cropAreaView.setLockedAspectRatio(f12);
                m mVar = nVar.I;
                if (mVar != null) {
                    mVar.v(true);
                }
            }
            nVar.setFreeform(cropState.freeform);
            float aspectRatio = cropAreaView.getAspectRatio();
            int i9 = cropState.transformRotation;
            int i10 = this.f47885b;
            int i11 = this.f47886c;
            if (i9 != 90 && i9 != 270) {
                l lVar = nVar.H;
                f10 = lVar.f47894a;
                f11 = lVar.f47895b;
                i11 = i10;
                i10 = i11;
            } else {
                aspectRatio = 1.0f / aspectRatio;
                l lVar2 = nVar.H;
                f10 = lVar2.f47895b;
                f11 = lVar2.f47894a;
            }
            if (nVar.f47913x && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = nVar.getCurrentWidth();
                int currentHeight = nVar.getCurrentHeight();
                if ((i9 + nVar.H.f47899g) % 180.0f != 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z10, nVar.f47913x);
            }
            l.d(nVar.H, i9);
            cropAreaView.setActualRect((aspectRatio * cropState.cropPw) / cropState.cropPh);
            l lVar3 = nVar.H;
            lVar3.f47901j = cropState.mirrored;
            l.e(lVar3, cropState.cropRotate);
            l lVar4 = nVar.H;
            float f13 = cropState.cropPx * i10;
            float f14 = lVar4.f47898f;
            l.f(lVar4, f13 * f14, cropState.cropPy * i11 * f14);
            float max = Math.max(cropAreaView.getCropWidth() / f10, cropAreaView.getCropHeight() / f11);
            l lVar5 = nVar.H;
            l.g(lVar5, cropState.cropScale * (max / lVar5.f47898f), 0.0f, 0.0f);
            nVar.r(false);
            m mVar2 = nVar.I;
            if (mVar2 != null) {
                mVar2.C(false);
            }
        }
        cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
