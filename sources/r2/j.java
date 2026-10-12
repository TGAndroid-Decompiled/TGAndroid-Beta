package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f47114a;
    public final i f47115b;
    public LoudnessCodecController f47116c;

    public j() {
        i iVar = i.f47112a;
        this.f47114a = new HashSet();
        this.f47115b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f47116c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f47114a.add(mediaCodec));
    }

    public final void b() {
        this.f47114a.clear();
        LoudnessCodecController loudnessCodecController = this.f47116c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f47114a.remove(mediaCodec) && (loudnessCodecController = this.f47116c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f47116c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f47116c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f12073a, new h(this));
        this.f47116c = create;
        Iterator it = this.f47114a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
