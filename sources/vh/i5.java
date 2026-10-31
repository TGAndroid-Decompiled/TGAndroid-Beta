package vh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;
public final class i5 implements Runnable {
    public final int f51279a;
    public final n5 f51280b;
    public final ph.h1 f51281c;

    public i5(n5 n5Var, ph.h1 h1Var, int i10) {
        this.f51279a = i10;
        this.f51280b = n5Var;
        this.f51281c = h1Var;
    }

    @Override
    public final void run() {
        i5 i5Var;
        switch (this.f51279a) {
            case 0:
                ph.h1 h1Var = this.f51281c;
                n5 n5Var = this.f51280b;
                n5Var.getClass();
                try {
                    try {
                        m5 m5Var = n5Var.f51524d1;
                        m5 m5Var2 = m5Var;
                        if (m5Var == null) {
                            ?? obj = new Object();
                            n5Var.f51524d1 = obj;
                            m5Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(n5Var.L.getAbsolutePath());
                        int w9 = MediaController.w(mediaExtractor, false);
                        mediaExtractor.selectTrack(w9);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(w9);
                        if (trackFormat.containsKey("color-transfer")) {
                            m5Var2.f51483b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            m5Var2.f51482a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        n5Var.f51524d1 = n5Var.f51524d1;
                        i5Var = new i5(n5Var, h1Var, 1);
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        n5Var.f51524d1 = n5Var.f51524d1;
                        i5Var = new i5(n5Var, h1Var, 1);
                    }
                    org.telegram.messenger.i0.g3(i5Var);
                    return;
                } catch (Throwable th2) {
                    n5Var.f51524d1 = n5Var.f51524d1;
                    org.telegram.messenger.i0.g3(new i5(n5Var, h1Var, 1));
                    throw th2;
                }
            default:
                this.f51281c.a(this.f51280b.f51524d1);
                return;
        }
    }
}
