package ph;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
public final class p6 implements Runnable {
    public final int f42166a;
    public final u6 f42167b;
    public final org.telegram.ui.web.y0 f42168c;

    public p6(u6 u6Var, org.telegram.ui.web.y0 y0Var, int i10) {
        this.f42166a = i10;
        this.f42167b = u6Var;
        this.f42168c = y0Var;
    }

    @Override
    public final void run() {
        p6 p6Var;
        switch (this.f42166a) {
            case 0:
                org.telegram.ui.web.y0 y0Var = this.f42168c;
                u6 u6Var = this.f42167b;
                u6Var.getClass();
                try {
                    try {
                        t6 t6Var = u6Var.f42408d1;
                        t6 t6Var2 = t6Var;
                        if (t6Var == null) {
                            ?? obj = new Object();
                            u6Var.f42408d1 = obj;
                            t6Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(u6Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            t6Var2.f42368b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            t6Var2.f42367a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        u6Var.f42408d1 = u6Var.f42408d1;
                        p6Var = new p6(u6Var, y0Var, 1);
                    } catch (Exception e) {
                        FileLog.e(e);
                        u6Var.f42408d1 = u6Var.f42408d1;
                        p6Var = new p6(u6Var, y0Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(p6Var);
                    return;
                } catch (Throwable th2) {
                    u6Var.f42408d1 = u6Var.f42408d1;
                    AndroidUtilities.runOnUIThread(new p6(u6Var, y0Var, 1));
                    throw th2;
                }
            default:
                this.f42168c.run(this.f42167b.f42408d1);
                return;
        }
    }
}
