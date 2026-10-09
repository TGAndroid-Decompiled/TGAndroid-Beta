package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class k {
    public final HashSet f46890a;
    public final j f46891b;
    public LoudnessCodecController f46892c;

    public k() {
        j jVar = j.f46888a;
        this.f46890a = new HashSet();
        this.f46891b = jVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f46892c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f46890a.add(mediaCodec));
    }

    public final void b() {
        this.f46890a.clear();
        LoudnessCodecController loudnessCodecController = this.f46892c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f46890a.remove(mediaCodec) && (loudnessCodecController = this.f46892c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f46892c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f46892c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f12075a, new i(this));
        this.f46892c = create;
        Iterator it = this.f46890a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
