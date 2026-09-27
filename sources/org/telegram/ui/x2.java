package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class x2 extends VideoPlayerHolderBase {
    public final y2 f39498a;

    public x2(y2 y2Var) {
        this.f39498a = y2Var;
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
            y2 y2Var = this.f39498a;
            y2Var.f40103n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = y2Var.L;
            if (pageblockvideo != null) {
                s70 s70Var = y2Var.f40099a;
                a0.i iVar = s70Var.f37328y;
                long j3 = pageblockvideo.video_id;
                z2 a2 = z2.a(s70Var.f37326w, y2Var);
                y2Var.c(a2);
                iVar.k(a2, j3);
            }
        }
    }
}
