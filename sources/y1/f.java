package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.o;
import lf.h;
public final class f extends VolumeProvider {
    public final o f46578a;

    public f(o oVar, int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.f46578a = oVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        o oVar = this.f46578a;
        ((p4.e) ((h) oVar.f2350f).d).f40867a.post(new p4.c(oVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        o oVar = this.f46578a;
        ((p4.e) ((h) oVar.f2350f).d).f40867a.post(new p4.c(oVar, i10, 0));
    }
}
