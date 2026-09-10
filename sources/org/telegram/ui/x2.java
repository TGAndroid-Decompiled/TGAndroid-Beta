package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class x2 extends VideoPlayerHolderBase {
    public final y2 f38559a;

    public x2(y2 y2Var) {
        this.f38559a = y2Var;
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
            y2 y2Var = this.f38559a;
            y2Var.f38878n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = y2Var.L;
            if (pageblockvideo != null) {
                t70 t70Var = y2Var.f38874a;
                a0.i iVar = t70Var.f36863y;
                long j3 = pageblockvideo.video_id;
                z2 a2 = z2.a(t70Var.f36861w, y2Var);
                y2Var.c(a2);
                iVar.k(a2, j3);
            }
        }
    }
}
