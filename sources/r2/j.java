package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
import v7.u6;
public final class j {
    public final HashSet f45352a;
    public final i f45353b;
    public LoudnessCodecController f45354c;

    public j() {
        i iVar = i.f45350a;
        this.f45352a = new HashSet();
        this.f45353b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f45354c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        u6.p(this.f45352a.add(mediaCodec));
    }

    public final void b() {
        this.f45352a.clear();
        LoudnessCodecController loudnessCodecController = this.f45354c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f45352a.remove(mediaCodec) && (loudnessCodecController = this.f45354c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f45354c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f45354c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, j9.r.f14401a, new h(this));
        this.f45354c = create;
        Iterator it = this.f45352a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
