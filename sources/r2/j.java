package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f42244a;
    public final i f42245b;
    public LoudnessCodecController f42246c;

    public j() {
        i iVar = i.f42242a;
        this.f42244a = new HashSet();
        this.f42245b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f42246c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f42244a.add(mediaCodec));
    }

    public final void b() {
        this.f42244a.clear();
        LoudnessCodecController loudnessCodecController = this.f42246c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f42244a.remove(mediaCodec) && (loudnessCodecController = this.f42246c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f42246c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f42246c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f11039a, new h(this));
        this.f42246c = create;
        Iterator it = this.f42244a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
