package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f44856a;
    public final i f44857b;
    public LoudnessCodecController f44858c;

    public j() {
        i iVar = i.f44854a;
        this.f44856a = new HashSet();
        this.f44857b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f44858c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f44856a.add(mediaCodec));
    }

    public final void b() {
        this.f44856a.clear();
        LoudnessCodecController loudnessCodecController = this.f44858c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f44856a.remove(mediaCodec) && (loudnessCodecController = this.f44858c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f44858c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f44858c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f11946a, new h(this));
        this.f44858c = create;
        Iterator it = this.f44856a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
