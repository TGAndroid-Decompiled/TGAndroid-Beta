package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.o;
import m.e3;
public final class f extends VolumeProvider {
    public final o f46255a;

    public f(o oVar, int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.f46255a = oVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        o oVar = this.f46255a;
        ((p4.e) ((e3) oVar.f2346f).d).f40552a.post(new p4.c(oVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        o oVar = this.f46255a;
        ((p4.e) ((e3) oVar.f2346f).d).f40552a.post(new p4.c(oVar, i10, 0));
    }
}
