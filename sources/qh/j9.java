package qh;

import org.telegram.messenger.AndroidUtilities;
public final class j9 implements c2 {
    public final ca f45505a;

    public j9(ca caVar) {
        this.f45505a = caVar;
    }

    @Override
    public final void setInvert(float f10) {
        boolean z4;
        ca caVar = this.f45505a;
        ba baVar = caVar.f45115n;
        boolean z10 = false;
        int i10 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
        if (i10 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        AndroidUtilities.setLightNavigationBar(baVar, z4);
        ba baVar2 = caVar.f45115n;
        if (i10 > 0) {
            z10 = true;
        }
        AndroidUtilities.setLightStatusBar(baVar2, z10);
    }

    @Override
    public final void invalidate() {
    }
}
