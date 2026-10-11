package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class k {
    public final HashSet f46982a;
    public final j f46983b;
    public LoudnessCodecController f46984c;

    public k() {
        j jVar = j.f46980a;
        this.f46982a = new HashSet();
        this.f46983b = jVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f46984c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f46982a.add(mediaCodec));
    }

    public final void b() {
        this.f46982a.clear();
        LoudnessCodecController loudnessCodecController = this.f46984c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f46982a.remove(mediaCodec) && (loudnessCodecController = this.f46984c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f46984c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f46984c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f12074a, new i(this));
        this.f46984c = create;
        Iterator it = this.f46982a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
