package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
import v7.u6;
public final class j {
    public final HashSet f44975a;
    public final i f44976b;
    public LoudnessCodecController f44977c;

    public j() {
        i iVar = i.f44973a;
        this.f44975a = new HashSet();
        this.f44976b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f44977c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        u6.p(this.f44975a.add(mediaCodec));
    }

    public final void b() {
        this.f44975a.clear();
        LoudnessCodecController loudnessCodecController = this.f44977c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f44975a.remove(mediaCodec) && (loudnessCodecController = this.f44977c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f44977c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f44977c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, j9.r.f14358a, new h(this));
        this.f44977c = create;
        Iterator it = this.f44975a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
