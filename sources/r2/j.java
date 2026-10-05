package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f45740a;
    public final i f45741b;
    public LoudnessCodecController f45742c;

    public j() {
        i iVar = i.f45738a;
        this.f45740a = new HashSet();
        this.f45741b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f45742c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f45740a.add(mediaCodec));
    }

    public final void b() {
        this.f45740a.clear();
        LoudnessCodecController loudnessCodecController = this.f45742c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f45740a.remove(mediaCodec) && (loudnessCodecController = this.f45742c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f45742c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f45742c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f12025a, new h(this));
        this.f45742c = create;
        Iterator it = this.f45740a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
