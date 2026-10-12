package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
import v7.u6;
public final class j {
    public final HashSet f43840a;
    public final i f43841b;
    public LoudnessCodecController f43842c;

    public j() {
        i iVar = i.f43838a;
        this.f43840a = new HashSet();
        this.f43841b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f43842c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        u6.p(this.f43840a.add(mediaCodec));
    }

    public final void b() {
        this.f43840a.clear();
        LoudnessCodecController loudnessCodecController = this.f43842c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f43840a.remove(mediaCodec) && (loudnessCodecController = this.f43842c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f43842c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f43842c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, j9.r.f12940a, new h(this));
        this.f43842c = create;
        Iterator it = this.f43840a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
