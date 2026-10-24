package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class w30 implements org.telegram.ui.ActionBar.a3 {
    public final u50 f42894a;

    public w30(u50 u50Var) {
        this.f42894a = u50Var;
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
        u50 u50Var = this.f42894a;
        if (u50Var.F1 == 6) {
            u50.B0(u50Var);
        }
    }
}
