package qh;

import org.telegram.messenger.AndroidUtilities;
public final class i9 implements b2 {
    public final ba f45499a;

    public i9(ba baVar) {
        this.f45499a = baVar;
    }

    @Override
    public final void setInvert(float f10) {
        boolean z4;
        ba baVar = this.f45499a;
        aa aaVar = baVar.f45081n;
        boolean z10 = false;
        int i10 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
        if (i10 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        AndroidUtilities.setLightNavigationBar(aaVar, z4);
        aa aaVar2 = baVar.f45081n;
        if (i10 > 0) {
            z10 = true;
        }
        AndroidUtilities.setLightStatusBar(aaVar2, z10);
    }

    @Override
    public final void invalidate() {
    }
}
