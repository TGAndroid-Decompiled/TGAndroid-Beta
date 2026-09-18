package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f41986a;
    public final i f41987b;
    public LoudnessCodecController f41988c;

    public j() {
        i iVar = i.f41984a;
        this.f41986a = new HashSet();
        this.f41987b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f41988c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f41986a.add(mediaCodec));
    }

    public final void b() {
        this.f41986a.clear();
        LoudnessCodecController loudnessCodecController = this.f41988c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f41986a.remove(mediaCodec) && (loudnessCodecController = this.f41988c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f41988c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f41988c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f11052a, new h(this));
        this.f41988c = create;
        Iterator it = this.f41986a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
