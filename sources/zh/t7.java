package zh;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class t7 extends VideoPlayerHolderBase {
    public boolean f48904a;
    public final u7 f48905b;

    public t7(u7 u7Var, SurfaceView surfaceView, m7 m7Var) {
        this.f48905b = u7Var;
        if (u7Var.f48918a) {
            with(surfaceView);
        } else {
            with(m7Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f48905b.f48945m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        u7 u7Var = this.f48905b;
        k2.v vVar = u7Var.G0;
        if (vVar != null) {
            vVar.f12224a = true;
            this.firstFrameRendered = true;
            vVar.b();
            if (this.paused && u7Var.C0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.f48904a = true;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final t7 f48875b;

                    {
                        this.f48875b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                a3 t10 = this.f48875b.f48905b.t();
                                if (t10 != null) {
                                    z2 z2Var = t10.O1;
                                    if (z2Var.f49129a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        hc.b.q(z2Var.f49129a.f17435id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                a3 t11 = this.f48875b.f48905b.t();
                                if (t11 != null) {
                                    z2 z2Var2 = t11.O1;
                                    if (z2Var2.f49129a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        hc.b.q(z2Var2.f49129a.f17435id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f48904a && i10 == 3) {
                this.f48904a = false;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final t7 f48875b;

                    {
                        this.f48875b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                a3 t10 = this.f48875b.f48905b.t();
                                if (t10 != null) {
                                    z2 z2Var = t10.O1;
                                    if (z2Var.f49129a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        hc.b.q(z2Var.f49129a.f17435id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                a3 t11 = this.f48875b.f48905b.t();
                                if (t11 != null) {
                                    z2 z2Var2 = t11.O1;
                                    if (z2Var2.f49129a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        hc.b.q(z2Var2.f49129a.f17435id, sb3);
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
