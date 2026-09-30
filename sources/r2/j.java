package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f42349a;
    public final i f42350b;
    public LoudnessCodecController f42351c;

    public j() {
        i iVar = i.f42347a;
        this.f42349a = new HashSet();
        this.f42350b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f42351c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f42349a.add(mediaCodec));
    }

    public final void b() {
        this.f42349a.clear();
        LoudnessCodecController loudnessCodecController = this.f42351c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f42349a.remove(mediaCodec) && (loudnessCodecController = this.f42351c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f42351c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f42351c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f11053a, new h(this));
        this.f42351c = create;
        Iterator it = this.f42349a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
