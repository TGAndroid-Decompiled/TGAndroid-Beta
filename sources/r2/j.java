package r2;

import a8.yb;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f47217a;
    public final i f47218b;
    public LoudnessCodecController f47219c;

    public j() {
        i iVar = i.f47215a;
        this.f47217a = new HashSet();
        this.f47218b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f47219c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        yb.p(this.f47217a.add(mediaCodec));
    }

    public final void b() {
        this.f47217a.clear();
        LoudnessCodecController loudnessCodecController = this.f47219c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f47217a.remove(mediaCodec) && (loudnessCodecController = this.f47219c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f47219c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f47219c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, k9.r.f16491a, new h(this));
        this.f47219c = create;
        Iterator it = this.f47217a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
