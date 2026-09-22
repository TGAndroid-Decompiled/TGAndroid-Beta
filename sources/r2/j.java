package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f42279a;
    public final i f42280b;
    public LoudnessCodecController f42281c;

    public j() {
        i iVar = i.f42277a;
        this.f42279a = new HashSet();
        this.f42280b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f42281c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        e2.d.g(this.f42279a.add(mediaCodec));
    }

    public final void b() {
        this.f42279a.clear();
        LoudnessCodecController loudnessCodecController = this.f42281c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f42279a.remove(mediaCodec) && (loudnessCodecController = this.f42281c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f42281c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f42281c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, i9.q.f11053a, new h(this));
        this.f42281c = create;
        Iterator it = this.f42279a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
