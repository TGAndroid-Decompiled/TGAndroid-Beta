package u2;

import a8.la;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f58333a;
    public final i f58334b;
    public LoudnessCodecController f58335c;

    public j() {
        i iVar = i.f58331a;
        this.f58333a = new HashSet();
        this.f58334b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f58335c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        la.p(this.f58333a.add(mediaCodec));
    }

    public final void b() {
        this.f58333a.clear();
        LoudnessCodecController loudnessCodecController = this.f58335c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f58333a.remove(mediaCodec) && (loudnessCodecController = this.f58335c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i7) {
        LoudnessCodecController loudnessCodecController = this.f58335c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f58335c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i7, m9.r.f20955a, new h(this));
        this.f58335c = create;
        Iterator it = this.f58333a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
