package u2;

import a8.la;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f58379a;
    public final i f58380b;
    public LoudnessCodecController f58381c;

    public j() {
        i iVar = i.f58377a;
        this.f58379a = new HashSet();
        this.f58380b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f58381c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        la.p(this.f58379a.add(mediaCodec));
    }

    public final void b() {
        this.f58379a.clear();
        LoudnessCodecController loudnessCodecController = this.f58381c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f58379a.remove(mediaCodec) && (loudnessCodecController = this.f58381c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i7) {
        LoudnessCodecController loudnessCodecController = this.f58381c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f58381c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i7, m9.r.f20983a, new h(this));
        this.f58381c = create;
        Iterator it = this.f58379a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
