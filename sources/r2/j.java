package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f45733a;
    public final i f45734b;
    public LoudnessCodecController f45735c;

    public j() {
        i iVar = i.f45731a;
        this.f45733a = new HashSet();
        this.f45734b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f45735c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f45733a.add(mediaCodec));
    }

    public final void b() {
        this.f45733a.clear();
        LoudnessCodecController loudnessCodecController = this.f45735c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f45733a.remove(mediaCodec) && (loudnessCodecController = this.f45735c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f45735c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f45735c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f12025a, new h(this));
        this.f45735c = create;
        Iterator it = this.f45733a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
