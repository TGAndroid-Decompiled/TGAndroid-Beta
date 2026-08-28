package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class s30 implements org.telegram.ui.ActionBar.z2 {
    public final o50 f42548a;

    public s30(o50 o50Var) {
        this.f42548a = o50Var;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void onOpenAnimationEnd() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        o50 o50Var = this.f42548a;
        if (o50Var.B1 == 6) {
            o50.A0(o50Var);
        }
    }
}
