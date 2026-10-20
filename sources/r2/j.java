package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
import v7.u6;
public final class j {
    public final HashSet f44937a;
    public final i f44938b;
    public LoudnessCodecController f44939c;

    public j() {
        i iVar = i.f44935a;
        this.f44937a = new HashSet();
        this.f44938b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f44939c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        u6.p(this.f44937a.add(mediaCodec));
    }

    public final void b() {
        this.f44937a.clear();
        LoudnessCodecController loudnessCodecController = this.f44939c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f44937a.remove(mediaCodec) && (loudnessCodecController = this.f44939c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f44939c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f44939c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, j9.r.f14356a, new h(this));
        this.f44939c = create;
        Iterator it = this.f44937a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
