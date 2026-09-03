package qh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
public final class m6 implements Runnable {
    public final int f45751a;
    public final r6 f45752b;
    public final org.telegram.ui.web.d1 f45753c;

    public m6(r6 r6Var, org.telegram.ui.web.d1 d1Var, int i10) {
        this.f45751a = i10;
        this.f45752b = r6Var;
        this.f45753c = d1Var;
    }

    @Override
    public final void run() {
        m6 m6Var;
        switch (this.f45751a) {
            case 0:
                org.telegram.ui.web.d1 d1Var = this.f45753c;
                r6 r6Var = this.f45752b;
                r6Var.getClass();
                try {
                    try {
                        q6 q6Var = r6Var.f46002d1;
                        q6 q6Var2 = q6Var;
                        if (q6Var == null) {
                            ?? obj = new Object();
                            r6Var.f46002d1 = obj;
                            q6Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(r6Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            q6Var2.f45962b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            q6Var2.f45961a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        r6Var.f46002d1 = r6Var.f46002d1;
                        m6Var = new m6(r6Var, d1Var, 1);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        r6Var.f46002d1 = r6Var.f46002d1;
                        m6Var = new m6(r6Var, d1Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(m6Var);
                    return;
                } catch (Throwable th2) {
                    r6Var.f46002d1 = r6Var.f46002d1;
                    AndroidUtilities.runOnUIThread(new m6(r6Var, d1Var, 1));
                    throw th2;
                }
            default:
                this.f45753c.run(this.f45752b.f46002d1);
                return;
        }
    }
}
