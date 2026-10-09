package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class k {
    public final HashSet f46892a;
    public final j f46893b;
    public LoudnessCodecController f46894c;

    public k() {
        j jVar = j.f46890a;
        this.f46892a = new HashSet();
        this.f46893b = jVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f46894c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f46892a.add(mediaCodec));
    }

    public final void b() {
        this.f46892a.clear();
        LoudnessCodecController loudnessCodecController = this.f46894c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f46892a.remove(mediaCodec) && (loudnessCodecController = this.f46894c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f46894c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f46894c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f12075a, new i(this));
        this.f46894c = create;
        Iterator it = this.f46892a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
