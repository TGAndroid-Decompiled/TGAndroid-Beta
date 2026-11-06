package u2;

import a8.ia;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f56166a;
    public final i f56167b;
    public LoudnessCodecController f56168c;

    public j() {
        i iVar = i.f56164a;
        this.f56166a = new HashSet();
        this.f56167b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f56168c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        ia.p(this.f56166a.add(mediaCodec));
    }

    public final void b() {
        this.f56166a.clear();
        LoudnessCodecController loudnessCodecController = this.f56168c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f56166a.remove(mediaCodec) && (loudnessCodecController = this.f56168c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i7) {
        LoudnessCodecController loudnessCodecController = this.f56168c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f56168c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i7, m9.r.f19991a, new h(this));
        this.f56168c = create;
        Iterator it = this.f56166a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
