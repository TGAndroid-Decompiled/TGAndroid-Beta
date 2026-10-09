package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.o;
import la.h;
public final class e extends VolumeProvider {
    public final o f51652a;

    public e(o oVar, int i10, int i11, int i12, String str) {
        super(i10, i11, i12, str);
        this.f51652a = oVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        o oVar = this.f51652a;
        ((p4.e) ((h) oVar.f2620f).d).f45325a.post(new p4.c(oVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        o oVar = this.f51652a;
        ((p4.e) ((h) oVar.f2620f).d).f45325a.post(new p4.c(oVar, i10, 0));
    }
}
