package u2;

import a8.ia;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f56142a;
    public final i f56143b;
    public LoudnessCodecController f56144c;

    public j() {
        i iVar = i.f56140a;
        this.f56142a = new HashSet();
        this.f56143b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f56144c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        ia.p(this.f56142a.add(mediaCodec));
    }

    public final void b() {
        this.f56142a.clear();
        LoudnessCodecController loudnessCodecController = this.f56144c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f56142a.remove(mediaCodec) && (loudnessCodecController = this.f56144c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i7) {
        LoudnessCodecController loudnessCodecController = this.f56144c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f56144c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i7, m9.r.f19991a, new h(this));
        this.f56144c = create;
        Iterator it = this.f56142a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
