package th;

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n7 extends VideoPlayerHolderBase {
    public boolean f49266a;
    public final o7 f49267b;

    public n7(o7 o7Var, SurfaceView surfaceView, g7 g7Var) {
        this.f49267b = o7Var;
        if (o7Var.f49290a) {
            with(surfaceView);
        } else {
            with(g7Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f49267b.f49317m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        o7 o7Var = this.f49267b;
        k2.t0 t0Var = o7Var.G0;
        if (t0Var != null) {
            t0Var.f10767b = true;
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
                this.f49266a = true;
                org.telegram.messenger.i0.g3(new Runnable(this) {
                    public final n7 f49245b;

                    {
                        this.f49245b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                z2 H = this.f49245b.f49267b.H();
                                if (H != null) {
                                    y2 y2Var = H.f49776x1;
                                    if (y2Var.f49661a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(H.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i0.a.p(y2Var.f49661a.f20031id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                z2 H2 = this.f49245b.f49267b.H();
                                if (H2 != null) {
                                    y2 y2Var2 = H2.f49776x1;
                                    if (y2Var2.f49661a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(H2.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i0.a.p(y2Var2.f49661a.f20031id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f49266a && i10 == 3) {
                this.f49266a = false;
                org.telegram.messenger.i0.g3(new Runnable(this) {
                    public final n7 f49245b;

                    {
                        this.f49245b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                z2 H = this.f49245b.f49267b.H();
                                if (H != null) {
                                    y2 y2Var = H.f49776x1;
                                    if (y2Var.f49661a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(H.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i0.a.p(y2Var.f49661a.f20031id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                z2 H2 = this.f49245b.f49267b.H();
                                if (H2 != null) {
                                    y2 y2Var2 = H2.f49776x1;
                                    if (y2Var2.f49661a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(H2.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i0.a.p(y2Var2.f49661a.f20031id, sb3);
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
