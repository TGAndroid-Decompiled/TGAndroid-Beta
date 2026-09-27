package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f42289a;
    public final i f42290b;
    public LoudnessCodecController f42291c;

    public j() {
        i iVar = i.f42287a;
        this.f42289a = new HashSet();
        this.f42290b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f42291c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f42289a.add(mediaCodec));
    }

    public final void b() {
        this.f42289a.clear();
        LoudnessCodecController loudnessCodecController = this.f42291c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f42289a.remove(mediaCodec) && (loudnessCodecController = this.f42291c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f42291c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f42291c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f11042a, new h(this));
        this.f42291c = create;
        Iterator it = this.f42289a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
