package u2;

import a8.ma;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f58459a;
    public final i f58460b;
    public LoudnessCodecController f58461c;

    public j() {
        i iVar = i.f58457a;
        this.f58459a = new HashSet();
        this.f58460b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f58461c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        ma.p(this.f58459a.add(mediaCodec));
    }

    public final void b() {
        this.f58459a.clear();
        LoudnessCodecController loudnessCodecController = this.f58461c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f58459a.remove(mediaCodec) && (loudnessCodecController = this.f58461c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i7) {
        LoudnessCodecController loudnessCodecController = this.f58461c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f58461c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i7, m9.r.f21045a, new h(this));
        this.f58461c = create;
        Iterator it = this.f58459a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
