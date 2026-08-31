package qh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
public final class n6 implements Runnable {
    public final int f45774a;
    public final s6 f45775b;
    public final org.telegram.ui.web.d1 f45776c;

    public n6(s6 s6Var, org.telegram.ui.web.d1 d1Var, int i10) {
        this.f45774a = i10;
        this.f45775b = s6Var;
        this.f45776c = d1Var;
    }

    @Override
    public final void run() {
        n6 n6Var;
        switch (this.f45774a) {
            case 0:
                org.telegram.ui.web.d1 d1Var = this.f45776c;
                s6 s6Var = this.f45775b;
                s6Var.getClass();
                try {
                    try {
                        r6 r6Var = s6Var.f46051d1;
                        r6 r6Var2 = r6Var;
                        if (r6Var == null) {
                            ?? obj = new Object();
                            s6Var.f46051d1 = obj;
                            r6Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(s6Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            r6Var2.f45983b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            r6Var2.f45982a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        s6Var.f46051d1 = s6Var.f46051d1;
                        n6Var = new n6(s6Var, d1Var, 1);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        s6Var.f46051d1 = s6Var.f46051d1;
                        n6Var = new n6(s6Var, d1Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(n6Var);
                    return;
                } catch (Throwable th2) {
                    s6Var.f46051d1 = s6Var.f46051d1;
                    AndroidUtilities.runOnUIThread(new n6(s6Var, d1Var, 1));
                    throw th2;
                }
            default:
                this.f45776c.run(this.f45775b.f46051d1);
                return;
        }
    }
}
