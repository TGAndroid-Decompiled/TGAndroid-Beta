package u2;

import a8.ia;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f56256a;
    public final i f56257b;
    public LoudnessCodecController f56258c;

    public j() {
        i iVar = i.f56254a;
        this.f56256a = new HashSet();
        this.f56257b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f56258c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        ia.p(this.f56256a.add(mediaCodec));
    }

    public final void b() {
        this.f56256a.clear();
        LoudnessCodecController loudnessCodecController = this.f56258c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f56256a.remove(mediaCodec) && (loudnessCodecController = this.f56258c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i7) {
        LoudnessCodecController loudnessCodecController = this.f56258c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f56258c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i7, m9.r.f19994a, new h(this));
        this.f56258c = create;
        Iterator it = this.f56256a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
