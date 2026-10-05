package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.o;
import la.h;
public final class f extends VolumeProvider {
    public final o f50374a;

    public f(o oVar, int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.f50374a = oVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        o oVar = this.f50374a;
        ((p4.e) ((h) oVar.f2541f).d).f44161a.post(new p4.c(oVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        o oVar = this.f50374a;
        ((p4.e) ((h) oVar.f2541f).d).f44161a.post(new p4.c(oVar, i10, 0));
    }
}
