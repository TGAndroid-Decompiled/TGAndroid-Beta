package ph;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
public final class o6 implements Runnable {
    public final int f42100a;
    public final t6 f42101b;
    public final org.telegram.ui.web.a1 f42102c;

    public o6(t6 t6Var, org.telegram.ui.web.a1 a1Var, int i10) {
        this.f42100a = i10;
        this.f42101b = t6Var;
        this.f42102c = a1Var;
    }

    @Override
    public final void run() {
        o6 o6Var;
        switch (this.f42100a) {
            case 0:
                org.telegram.ui.web.a1 a1Var = this.f42102c;
                t6 t6Var = this.f42101b;
                t6Var.getClass();
                try {
                    try {
                        s6 s6Var = t6Var.f42409d1;
                        s6 s6Var2 = s6Var;
                        if (s6Var == null) {
                            ?? obj = new Object();
                            t6Var.f42409d1 = obj;
                            s6Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(t6Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            s6Var2.f42374b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            s6Var2.f42373a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        t6Var.f42409d1 = t6Var.f42409d1;
                        o6Var = new o6(t6Var, a1Var, 1);
                    } catch (Exception e) {
                        FileLog.e(e);
                        t6Var.f42409d1 = t6Var.f42409d1;
                        o6Var = new o6(t6Var, a1Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(o6Var);
                    return;
                } catch (Throwable th2) {
                    t6Var.f42409d1 = t6Var.f42409d1;
                    AndroidUtilities.runOnUIThread(new o6(t6Var, a1Var, 1));
                    throw th2;
                }
            default:
                this.f42102c.run(this.f42101b.f42409d1);
                return;
        }
    }
}
