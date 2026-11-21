package u2;

import a8.la;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f58375a;
    public final i f58376b;
    public LoudnessCodecController f58377c;

    public j() {
        i iVar = i.f58373a;
        this.f58375a = new HashSet();
        this.f58376b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f58377c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        la.p(this.f58375a.add(mediaCodec));
    }

    public final void b() {
        this.f58375a.clear();
        LoudnessCodecController loudnessCodecController = this.f58377c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f58375a.remove(mediaCodec) && (loudnessCodecController = this.f58377c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i7) {
        LoudnessCodecController loudnessCodecController = this.f58377c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f58377c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i7, m9.r.f20980a, new h(this));
        this.f58377c = create;
        Iterator it = this.f58375a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
