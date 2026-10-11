package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class k {
    public final HashSet f47016a;
    public final j f47017b;
    public LoudnessCodecController f47018c;

    public k() {
        j jVar = j.f47014a;
        this.f47016a = new HashSet();
        this.f47017b = jVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f47018c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f47016a.add(mediaCodec));
    }

    public final void b() {
        this.f47016a.clear();
        LoudnessCodecController loudnessCodecController = this.f47018c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f47016a.remove(mediaCodec) && (loudnessCodecController = this.f47018c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f47018c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f47018c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f12074a, new i(this));
        this.f47018c = create;
        Iterator it = this.f47016a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
