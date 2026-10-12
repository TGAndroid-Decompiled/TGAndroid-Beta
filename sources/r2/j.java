package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f47106a;
    public final i f47107b;
    public LoudnessCodecController f47108c;

    public j() {
        i iVar = i.f47104a;
        this.f47106a = new HashSet();
        this.f47107b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f47108c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f47106a.add(mediaCodec));
    }

    public final void b() {
        this.f47106a.clear();
        LoudnessCodecController loudnessCodecController = this.f47108c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f47106a.remove(mediaCodec) && (loudnessCodecController = this.f47108c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f47108c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f47108c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f12073a, new h(this));
        this.f47108c = create;
        Iterator it = this.f47106a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
