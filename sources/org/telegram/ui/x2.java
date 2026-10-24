package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class x2 extends VideoPlayerHolderBase {
    public final y2 f43456a;

    public x2(y2 y2Var) {
        this.f43456a = y2Var;
    }

    @Override
    public final boolean needRepeat() {
        return true;
    }

    @Override
    public final void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
        if (!this.firstFrameRendered) {
            this.firstFrameRendered = true;
            y2 y2Var = this.f43456a;
            y2Var.f43734n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = y2Var.L;
            if (pageblockvideo != null) {
                f70 f70Var = y2Var.f43730a;
                a0.h hVar = f70Var.f37223y;
                long j10 = pageblockvideo.video_id;
                z2 a2 = z2.a(f70Var.f37221w, y2Var);
                y2Var.c(a2);
                hVar.k(a2, j10);
            }
        }
    }
}
