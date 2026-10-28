package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class v2 extends VideoPlayerHolderBase {
    public final w2 f44162a;

    public v2(w2 w2Var) {
        this.f44162a = w2Var;
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
            w2 w2Var = this.f44162a;
            w2Var.f44492n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = w2Var.L;
            if (pageblockvideo != null) {
                j70 j70Var = w2Var.f44488a;
                a0.h hVar = j70Var.f40457y;
                long j10 = pageblockvideo.video_id;
                x2 a2 = x2.a(j70Var.f40455w, w2Var);
                w2Var.c(a2);
                hVar.k(a2, j10);
            }
        }
    }
}
