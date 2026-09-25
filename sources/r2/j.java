package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f42245a;
    public final i f42246b;
    public LoudnessCodecController f42247c;

    public j() {
        i iVar = i.f42243a;
        this.f42245a = new HashSet();
        this.f42246b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f42247c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f42245a.add(mediaCodec));
    }

    public final void b() {
        this.f42245a.clear();
        LoudnessCodecController loudnessCodecController = this.f42247c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f42245a.remove(mediaCodec) && (loudnessCodecController = this.f42247c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f42247c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f42247c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f11039a, new h(this));
        this.f42247c = create;
        Iterator it = this.f42245a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
