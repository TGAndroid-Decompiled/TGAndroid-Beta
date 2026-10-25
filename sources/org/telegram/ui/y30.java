package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class y30 implements org.telegram.ui.ActionBar.d3 {
    public final v50 f45947a;

    public y30(v50 v50Var) {
        this.f45947a = v50Var;
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
        v50 v50Var = this.f45947a;
        if (v50Var.F1 == 6) {
            v50.B0(v50Var);
        }
    }
}
