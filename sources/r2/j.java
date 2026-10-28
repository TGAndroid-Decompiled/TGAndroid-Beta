package r2;

import a8.yb;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f47255a;
    public final i f47256b;
    public LoudnessCodecController f47257c;

    public j() {
        i iVar = i.f47253a;
        this.f47255a = new HashSet();
        this.f47256b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f47257c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        yb.p(this.f47255a.add(mediaCodec));
    }

    public final void b() {
        this.f47255a.clear();
        LoudnessCodecController loudnessCodecController = this.f47257c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f47255a.remove(mediaCodec) && (loudnessCodecController = this.f47257c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f47257c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f47257c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, k9.r.f16490a, new h(this));
        this.f47257c = create;
        Iterator it = this.f47255a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
