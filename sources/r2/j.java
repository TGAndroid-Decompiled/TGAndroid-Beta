package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
import v7.u6;
public final class j {
    public final HashSet f44929a;
    public final i f44930b;
    public LoudnessCodecController f44931c;

    public j() {
        i iVar = i.f44927a;
        this.f44929a = new HashSet();
        this.f44930b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f44931c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        u6.p(this.f44929a.add(mediaCodec));
    }

    public final void b() {
        this.f44929a.clear();
        LoudnessCodecController loudnessCodecController = this.f44931c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f44929a.remove(mediaCodec) && (loudnessCodecController = this.f44931c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f44931c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f44931c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, j9.r.f14356a, new h(this));
        this.f44931c = create;
        Iterator it = this.f44929a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
