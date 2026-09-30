package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f42246a;
    public final i f42247b;
    public LoudnessCodecController f42248c;

    public j() {
        i iVar = i.f42244a;
        this.f42246a = new HashSet();
        this.f42247b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f42248c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f42246a.add(mediaCodec));
    }

    public final void b() {
        this.f42246a.clear();
        LoudnessCodecController loudnessCodecController = this.f42248c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f42246a.remove(mediaCodec) && (loudnessCodecController = this.f42248c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f42248c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f42248c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f11039a, new h(this));
        this.f42248c = create;
        Iterator it = this.f42246a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
