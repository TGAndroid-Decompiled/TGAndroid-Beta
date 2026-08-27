package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

public final class v30 implements org.telegram.ui.ActionBar.y2 {

    public final s50 f43339a;

    public v30(s50 s50Var) {
        this.f43339a = s50Var;
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
        s50 s50Var = this.f43339a;
        if (s50Var.B1 == 6) {
            s50.B0(s50Var);
        }
    }
}
