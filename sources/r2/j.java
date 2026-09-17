package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f41981a;
    public final i f41982b;
    public LoudnessCodecController f41983c;

    public j() {
        i iVar = i.f41979a;
        this.f41981a = new HashSet();
        this.f41982b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f41983c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f41981a.add(mediaCodec));
    }

    public final void b() {
        this.f41981a.clear();
        LoudnessCodecController loudnessCodecController = this.f41983c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f41981a.remove(mediaCodec) && (loudnessCodecController = this.f41983c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f41983c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f41983c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f11052a, new h(this));
        this.f41983c = create;
        Iterator it = this.f41981a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
