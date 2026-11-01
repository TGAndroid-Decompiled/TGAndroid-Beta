package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
import v7.t6;
public final class j {
    public final HashSet f46248a;
    public final i f46249b;
    public LoudnessCodecController f46250c;

    public j() {
        i iVar = i.f46246a;
        this.f46248a = new HashSet();
        this.f46249b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f46250c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        t6.p(this.f46248a.add(mediaCodec));
    }

    public final void b() {
        this.f46248a.clear();
        LoudnessCodecController loudnessCodecController = this.f46250c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f46248a.remove(mediaCodec) && (loudnessCodecController = this.f46250c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f46250c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f46250c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, j9.r.f9764a, new h(this));
        this.f46250c = create;
        Iterator it = this.f46248a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
