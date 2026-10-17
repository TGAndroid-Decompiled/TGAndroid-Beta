package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
import v7.u6;
public final class j {
    public final HashSet f44955a;
    public final i f44956b;
    public LoudnessCodecController f44957c;

    public j() {
        i iVar = i.f44953a;
        this.f44955a = new HashSet();
        this.f44956b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f44957c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        u6.p(this.f44955a.add(mediaCodec));
    }

    public final void b() {
        this.f44955a.clear();
        LoudnessCodecController loudnessCodecController = this.f44957c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f44955a.remove(mediaCodec) && (loudnessCodecController = this.f44957c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f44957c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f44957c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, j9.r.f14351a, new h(this));
        this.f44957c = create;
        Iterator it = this.f44955a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
