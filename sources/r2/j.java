package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
import v7.u6;
public final class j {
    public final HashSet f44940a;
    public final i f44941b;
    public LoudnessCodecController f44942c;

    public j() {
        i iVar = i.f44938a;
        this.f44940a = new HashSet();
        this.f44941b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f44942c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        u6.p(this.f44940a.add(mediaCodec));
    }

    public final void b() {
        this.f44940a.clear();
        LoudnessCodecController loudnessCodecController = this.f44942c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f44940a.remove(mediaCodec) && (loudnessCodecController = this.f44942c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f44942c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f44942c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, j9.r.f14356a, new h(this));
        this.f44942c = create;
        Iterator it = this.f44940a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
