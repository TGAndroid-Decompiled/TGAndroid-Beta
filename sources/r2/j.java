package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
import v7.t6;
public final class j {
    public final HashSet f46237a;
    public final i f46238b;
    public LoudnessCodecController f46239c;

    public j() {
        i iVar = i.f46235a;
        this.f46237a = new HashSet();
        this.f46238b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f46239c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        t6.p(this.f46237a.add(mediaCodec));
    }

    public final void b() {
        this.f46237a.clear();
        LoudnessCodecController loudnessCodecController = this.f46239c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f46237a.remove(mediaCodec) && (loudnessCodecController = this.f46239c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f46239c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f46239c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, j9.r.f9763a, new h(this));
        this.f46239c = create;
        Iterator it = this.f46237a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
