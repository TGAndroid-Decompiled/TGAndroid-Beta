package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.o;
import la.h;
public final class f extends VolumeProvider {
    public final o f51653a;

    public f(o oVar, int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.f51653a = oVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        o oVar = this.f51653a;
        ((p4.e) ((h) oVar.f2620f).d).f45325a.post(new p4.c(oVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        o oVar = this.f51653a;
        ((p4.e) ((h) oVar.f2620f).d).f45325a.post(new p4.c(oVar, i10, 0));
    }
}
