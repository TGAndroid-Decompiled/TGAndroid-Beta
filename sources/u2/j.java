package u2;

import a8.ma;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class j {
    public final HashSet f58344a;
    public final i f58345b;
    public LoudnessCodecController f58346c;

    public j() {
        i iVar = i.f58342a;
        this.f58344a = new HashSet();
        this.f58345b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f58346c;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        ma.p(this.f58344a.add(mediaCodec));
    }

    public final void b() {
        this.f58344a.clear();
        LoudnessCodecController loudnessCodecController = this.f58346c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f58344a.remove(mediaCodec) && (loudnessCodecController = this.f58346c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i7) {
        LoudnessCodecController loudnessCodecController = this.f58346c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f58346c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i7, m9.r.f20949a, new h(this));
        this.f58346c = create;
        Iterator it = this.f58344a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
