package u2;

import a8.ia;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f56268a;
    public final i f56269b;
    public LoudnessCodecController f56270c;

    public j() {
        i iVar = i.f56266a;
        this.f56268a = new HashSet();
        this.f56269b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f56270c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        ia.p(this.f56268a.add(mediaCodec));
    }

    public final void b() {
        this.f56268a.clear();
        LoudnessCodecController loudnessCodecController = this.f56270c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f56268a.remove(mediaCodec) && (loudnessCodecController = this.f56270c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i7) {
        LoudnessCodecController loudnessCodecController = this.f56270c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f56270c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i7, m9.r.f19994a, new h(this));
        this.f56270c = create;
        Iterator it = this.f56268a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
