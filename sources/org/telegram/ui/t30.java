package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class t30 implements org.telegram.ui.ActionBar.z2 {
    public final q50 f41582a;

    public t30(q50 q50Var) {
        this.f41582a = q50Var;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void onOpenAnimationEnd() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        q50 q50Var = this.f41582a;
        if (q50Var.F1 == 6) {
            q50.C0(q50Var);
        }
    }
}
