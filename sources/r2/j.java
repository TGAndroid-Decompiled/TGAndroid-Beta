package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
import v7.u6;
public final class j {
    public final HashSet f44927a;
    public final i f44928b;
    public LoudnessCodecController f44929c;

    public j() {
        i iVar = i.f44925a;
        this.f44927a = new HashSet();
        this.f44928b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f44929c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        u6.p(this.f44927a.add(mediaCodec));
    }

    public final void b() {
        this.f44927a.clear();
        LoudnessCodecController loudnessCodecController = this.f44929c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f44927a.remove(mediaCodec) && (loudnessCodecController = this.f44929c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f44929c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f44929c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, j9.r.f14358a, new h(this));
        this.f44929c = create;
        Iterator it = this.f44927a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
