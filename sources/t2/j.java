package t2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import b8.zb;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f54848a;
    public final i f54849b;
    public LoudnessCodecController f54850c;

    public j() {
        i iVar = i.f54846a;
        this.f54848a = new HashSet();
        this.f54849b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f54850c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        zb.p(this.f54848a.add(mediaCodec));
    }

    public final void b() {
        this.f54848a.clear();
        LoudnessCodecController loudnessCodecController = this.f54850c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f54848a.remove(mediaCodec) && (loudnessCodecController = this.f54850c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i3) {
        LoudnessCodecController loudnessCodecController = this.f54850c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f54850c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i3, l9.r.f18162a, new h(this));
        this.f54850c = create;
        Iterator it = this.f54848a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
