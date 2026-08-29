package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class v30 implements org.telegram.ui.ActionBar.z2 {
    public final r50 f43413a;

    public v30(r50 r50Var) {
        this.f43413a = r50Var;
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
        r50 r50Var = this.f43413a;
        if (r50Var.B1 == 6) {
            r50.B0(r50Var);
        }
    }
}
