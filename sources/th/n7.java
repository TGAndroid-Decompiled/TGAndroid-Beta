package th;

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n7 extends VideoPlayerHolderBase {
    public boolean f49280a;
    public final o7 f49281b;

    public n7(o7 o7Var, SurfaceView surfaceView, g7 g7Var) {
        this.f49281b = o7Var;
        if (o7Var.f49304a) {
            with(surfaceView);
        } else {
            with(g7Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f49281b.f49331m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        o7 o7Var = this.f49281b;
        k2.t0 t0Var = o7Var.G0;
        if (t0Var != null) {
            t0Var.f10768b = true;
            this.firstFrameRendered = true;
            t0Var.b();
            if (this.paused && o7Var.C0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.f49280a = true;
                org.telegram.messenger.i0.g3(new Runnable(this) {
                    public final n7 f49259b;

                    {
                        this.f49259b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                z2 H = this.f49259b.f49281b.H();
                                if (H != null) {
                                    y2 y2Var = H.f49790x1;
                                    if (y2Var.f49675a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(H.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i0.a.p(y2Var.f49675a.f20032id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                z2 H2 = this.f49259b.f49281b.H();
                                if (H2 != null) {
                                    y2 y2Var2 = H2.f49790x1;
                                    if (y2Var2.f49675a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(H2.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i0.a.p(y2Var2.f49675a.f20032id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f49280a && i10 == 3) {
                this.f49280a = false;
                org.telegram.messenger.i0.g3(new Runnable(this) {
                    public final n7 f49259b;

                    {
                        this.f49259b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                z2 H = this.f49259b.f49281b.H();
                                if (H != null) {
                                    y2 y2Var = H.f49790x1;
                                    if (y2Var.f49675a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(H.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i0.a.p(y2Var.f49675a.f20032id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                z2 H2 = this.f49259b.f49281b.H();
                                if (H2 != null) {
                                    y2 y2Var2 = H2.f49790x1;
                                    if (y2Var2.f49675a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(H2.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i0.a.p(y2Var2.f49675a.f20032id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
    }
}
