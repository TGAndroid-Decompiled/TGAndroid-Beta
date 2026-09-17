package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f44828a;
    public final i f44829b;
    public LoudnessCodecController f44830c;

    public j() {
        i iVar = i.f44826a;
        this.f44828a = new HashSet();
        this.f44829b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f44830c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f44828a.add(mediaCodec));
    }

    public final void b() {
        this.f44828a.clear();
        LoudnessCodecController loudnessCodecController = this.f44830c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f44828a.remove(mediaCodec) && (loudnessCodecController = this.f44830c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f44830c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f44830c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f11920a, new h(this));
        this.f44830c = create;
        Iterator it = this.f44828a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
