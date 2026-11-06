package u2;

import a8.ia;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f56167a;
    public final i f56168b;
    public LoudnessCodecController f56169c;

    public j() {
        i iVar = i.f56165a;
        this.f56167a = new HashSet();
        this.f56168b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f56169c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        ia.p(this.f56167a.add(mediaCodec));
    }

    public final void b() {
        this.f56167a.clear();
        LoudnessCodecController loudnessCodecController = this.f56169c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f56167a.remove(mediaCodec) && (loudnessCodecController = this.f56169c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i7) {
        LoudnessCodecController loudnessCodecController = this.f56169c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f56169c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i7, m9.r.f19991a, new h(this));
        this.f56169c = create;
        Iterator it = this.f56167a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
