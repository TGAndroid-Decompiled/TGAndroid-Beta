package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f42214a;
    public final i f42215b;
    public LoudnessCodecController f42216c;

    public j() {
        i iVar = i.f42212a;
        this.f42214a = new HashSet();
        this.f42215b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f42216c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f42214a.add(mediaCodec));
    }

    public final void b() {
        this.f42214a.clear();
        LoudnessCodecController loudnessCodecController = this.f42216c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f42214a.remove(mediaCodec) && (loudnessCodecController = this.f42216c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f42216c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f42216c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f11052a, new h(this));
        this.f42216c = create;
        Iterator it = this.f42214a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
