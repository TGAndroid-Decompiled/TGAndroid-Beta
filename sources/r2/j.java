package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
import v7.u6;
public final class j {
    public final HashSet f44941a;
    public final i f44942b;
    public LoudnessCodecController f44943c;

    public j() {
        i iVar = i.f44939a;
        this.f44941a = new HashSet();
        this.f44942b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f44943c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        u6.p(this.f44941a.add(mediaCodec));
    }

    public final void b() {
        this.f44941a.clear();
        LoudnessCodecController loudnessCodecController = this.f44943c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f44941a.remove(mediaCodec) && (loudnessCodecController = this.f44943c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f44943c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f44943c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, j9.r.f14356a, new h(this));
        this.f44943c = create;
        Iterator it = this.f44941a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
