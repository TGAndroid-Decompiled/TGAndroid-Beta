package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
import v7.u6;
public final class j {
    public final HashSet f45353a;
    public final i f45354b;
    public LoudnessCodecController f45355c;

    public j() {
        i iVar = i.f45351a;
        this.f45353a = new HashSet();
        this.f45354b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f45355c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        u6.p(this.f45353a.add(mediaCodec));
    }

    public final void b() {
        this.f45353a.clear();
        LoudnessCodecController loudnessCodecController = this.f45355c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f45353a.remove(mediaCodec) && (loudnessCodecController = this.f45355c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f45355c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f45355c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, j9.r.f14401a, new h(this));
        this.f45355c = create;
        Iterator it = this.f45353a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
