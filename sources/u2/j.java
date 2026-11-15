package u2;

import a8.ja;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f57766a;
    public final i f57767b;
    public LoudnessCodecController f57768c;

    public j() {
        i iVar = i.f57764a;
        this.f57766a = new HashSet();
        this.f57767b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f57768c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        ja.p(this.f57766a.add(mediaCodec));
    }

    public final void b() {
        this.f57766a.clear();
        LoudnessCodecController loudnessCodecController = this.f57768c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f57766a.remove(mediaCodec) && (loudnessCodecController = this.f57768c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i7) {
        LoudnessCodecController loudnessCodecController = this.f57768c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f57768c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i7, m9.r.f20591a, new h(this));
        this.f57768c = create;
        Iterator it = this.f57766a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
