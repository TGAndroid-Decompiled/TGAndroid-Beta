package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class v30 implements org.telegram.ui.ActionBar.z2 {
    public final s50 f42109a;

    public v30(s50 s50Var) {
        this.f42109a = s50Var;
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
        s50 s50Var = this.f42109a;
        if (s50Var.F1 == 6) {
            s50.C0(s50Var);
        }
    }
}
