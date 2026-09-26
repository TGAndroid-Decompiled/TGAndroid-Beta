package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f42243a;
    public final i f42244b;
    public LoudnessCodecController f42245c;

    public j() {
        i iVar = i.f42241a;
        this.f42243a = new HashSet();
        this.f42244b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f42245c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f42243a.add(mediaCodec));
    }

    public final void b() {
        this.f42243a.clear();
        LoudnessCodecController loudnessCodecController = this.f42245c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f42243a.remove(mediaCodec) && (loudnessCodecController = this.f42245c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f42245c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f42245c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f11039a, new h(this));
        this.f42245c = create;
        Iterator it = this.f42243a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
