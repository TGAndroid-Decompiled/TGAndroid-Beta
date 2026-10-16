package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
import v7.u6;
public final class j {
    public final HashSet f43599a;
    public final i f43600b;
    public LoudnessCodecController f43601c;

    public j() {
        i iVar = i.f43597a;
        this.f43599a = new HashSet();
        this.f43600b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f43601c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        u6.p(this.f43599a.add(mediaCodec));
    }

    public final void b() {
        this.f43599a.clear();
        LoudnessCodecController loudnessCodecController = this.f43601c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f43599a.remove(mediaCodec) && (loudnessCodecController = this.f43601c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f43601c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f43601c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, j9.r.f12944a, new h(this));
        this.f43601c = create;
        Iterator it = this.f43599a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
