package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class r0 extends VoIPService.ProxyVideoSink {
    public final t0 f48821a;

    public r0(t0 t0Var) {
        this.f48821a = t0Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f48821a.f48884s) {
            AndroidUtilities.runOnUIThread(new xh.x(this, 19));
        }
    }
}
