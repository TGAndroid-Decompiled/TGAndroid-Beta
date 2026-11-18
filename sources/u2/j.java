package u2;

import a8.la;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f58334a;
    public final i f58335b;
    public LoudnessCodecController f58336c;

    public j() {
        i iVar = i.f58332a;
        this.f58334a = new HashSet();
        this.f58335b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f58336c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        la.p(this.f58334a.add(mediaCodec));
    }

    public final void b() {
        this.f58334a.clear();
        LoudnessCodecController loudnessCodecController = this.f58336c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f58334a.remove(mediaCodec) && (loudnessCodecController = this.f58336c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i7) {
        LoudnessCodecController loudnessCodecController = this.f58336c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f58336c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i7, m9.r.f20952a, new h(this));
        this.f58336c = create;
        Iterator it = this.f58334a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
