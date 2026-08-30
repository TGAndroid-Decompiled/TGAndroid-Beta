package ph;

import org.telegram.messenger.AndroidUtilities;
public final class l9 implements c2 {
    public final da f41919a;

    public l9(da daVar) {
        this.f41919a = daVar;
    }

    @Override
    public final void setInvert(float f10) {
        boolean z4;
        da daVar = this.f41919a;
        ca caVar = daVar.f41512n;
        boolean z10 = false;
        int i10 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
        if (i10 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        AndroidUtilities.setLightNavigationBar(caVar, z4);
        ca caVar2 = daVar.f41512n;
        if (i10 > 0) {
            z10 = true;
        }
        AndroidUtilities.setLightStatusBar(caVar2, z10);
    }

    @Override
    public final void invalidate() {
    }
}
