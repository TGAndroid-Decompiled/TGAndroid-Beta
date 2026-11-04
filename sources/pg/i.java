package pg;

import android.view.ViewTreeObserver;
import org.telegram.messenger.re;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class i implements ViewTreeObserver.OnPreDrawListener {
    public final int f53493a;
    public final re f53494b;
    public final int f53495c;
    public final int d;
    public final m f53496e;

    public i(m mVar, re reVar, int i3, int i10, int i11) {
        this.f53493a = i11;
        this.f53496e = mVar;
        this.f53494b = reVar;
        this.f53495c = i3;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        float f11;
        boolean z10;
        float f12;
        float f13;
        boolean z11;
        switch (this.f53493a) {
            case 0:
                m mVar = this.f53496e;
                mVar.l(false);
                CropAreaView cropAreaView = mVar.f53511a;
                re reVar = this.f53494b;
                if (reVar != null) {
                    float f14 = reVar.v;
                    if (f14 > 1.0E-4f) {
                        cropAreaView.setLockedAspectRatio(f14);
                        l lVar = mVar.N;
                        if (lVar != null) {
                            lVar.A(true);
                        }
                    }
                    mVar.setFreeform(reVar.f25124u);
                    float aspectRatio = cropAreaView.getAspectRatio();
                    int i3 = reVar.f25117k;
                    int i10 = this.f53495c;
                    int i11 = this.d;
                    if (i3 != 90 && i3 != 270) {
                        k kVar = mVar.M;
                        f10 = kVar.f53501a;
                        f11 = kVar.f53502b;
                        i11 = i10;
                        i10 = i11;
                    } else {
                        aspectRatio = 1.0f / aspectRatio;
                        k kVar2 = mVar.M;
                        f10 = kVar2.f53502b;
                        f11 = kVar2.f53501a;
                    }
                    if (mVar.f53521y && cropAreaView.getLockAspectRatio() > 0.0f) {
                        cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                        cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
                    } else {
                        int currentWidth = mVar.getCurrentWidth();
                        int currentHeight = mVar.getCurrentHeight();
                        if ((i3 + mVar.M.f53506g) % 180.0f != 0.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        cropAreaView.e(currentWidth, currentHeight, z10, mVar.f53521y);
                    }
                    k.d(mVar.M, i3);
                    cropAreaView.setActualRect((aspectRatio * reVar.f25113e) / reVar.f25114f);
                    k kVar3 = mVar.M;
                    kVar3.f53508j = reVar.f25118l;
                    k.e(kVar3, reVar.d);
                    k kVar4 = mVar.M;
                    float f15 = reVar.f25110a * i10;
                    float f16 = kVar4.f53505f;
                    k.f(kVar4, f15 * f16, reVar.f25111b * i11 * f16);
                    float max = Math.max(cropAreaView.getCropWidth() / f10, cropAreaView.getCropHeight() / f11);
                    k kVar5 = mVar.M;
                    k.g(kVar5, reVar.f25112c * (max / kVar5.f53505f), 0.0f, 0.0f);
                    mVar.r(false);
                    l lVar2 = mVar.N;
                    if (lVar2 != null) {
                        lVar2.Q(false);
                    }
                }
                cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            default:
                m mVar2 = this.f53496e;
                mVar2.l(false);
                CropAreaView cropAreaView2 = mVar2.f53511a;
                re reVar2 = this.f53494b;
                if (reVar2 != null) {
                    float f17 = reVar2.v;
                    if (f17 > 1.0E-4f) {
                        cropAreaView2.setLockedAspectRatio(f17);
                        l lVar3 = mVar2.N;
                        if (lVar3 != null) {
                            lVar3.A(true);
                        }
                    }
                    mVar2.setFreeform(reVar2.f25124u);
                    float aspectRatio2 = cropAreaView2.getAspectRatio();
                    int i12 = reVar2.f25117k;
                    int i13 = this.f53495c;
                    int i14 = this.d;
                    if (i12 != 90 && i12 != 270) {
                        k kVar6 = mVar2.M;
                        f12 = kVar6.f53501a;
                        f13 = kVar6.f53502b;
                        i14 = i13;
                        i13 = i14;
                    } else {
                        aspectRatio2 = 1.0f / aspectRatio2;
                        k kVar7 = mVar2.M;
                        f12 = kVar7.f53502b;
                        f13 = kVar7.f53501a;
                    }
                    if (mVar2.f53521y && cropAreaView2.getLockAspectRatio() > 0.0f) {
                        cropAreaView2.setLockedAspectRatio(1.0f / cropAreaView2.getLockAspectRatio());
                        cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
                    } else {
                        int currentWidth2 = mVar2.getCurrentWidth();
                        int currentHeight2 = mVar2.getCurrentHeight();
                        if ((i12 + mVar2.M.f53506g) % 180.0f != 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        cropAreaView2.e(currentWidth2, currentHeight2, z11, mVar2.f53521y);
                    }
                    k.d(mVar2.M, i12);
                    cropAreaView2.setActualRect((aspectRatio2 * reVar2.f25113e) / reVar2.f25114f);
                    k kVar8 = mVar2.M;
                    kVar8.f53508j = reVar2.f25118l;
                    k.e(kVar8, reVar2.d);
                    k kVar9 = mVar2.M;
                    float f18 = reVar2.f25110a * i13;
                    float f19 = kVar9.f53505f;
                    k.f(kVar9, f18 * f19, reVar2.f25111b * i14 * f19);
                    float max2 = Math.max(cropAreaView2.getCropWidth() / f12, cropAreaView2.getCropHeight() / f13);
                    k kVar10 = mVar2.M;
                    k.g(kVar10, reVar2.f25112c * (max2 / kVar10.f53505f), 0.0f, 0.0f);
                    mVar2.r(false);
                    l lVar4 = mVar2.N;
                    if (lVar4 != null) {
                        lVar4.Q(false);
                    }
                }
                cropAreaView2.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
        }
    }
}
