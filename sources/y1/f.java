package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
import m.g3;
public final class f extends VolumeProvider {
    public final p f49888a;

    public f(p pVar, int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.f49888a = pVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        p pVar = this.f49888a;
        ((p4.e) ((g3) pVar.f3121f).d).f44092a.post(new p4.c(pVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        p pVar = this.f49888a;
        ((p4.e) ((g3) pVar.f3121f).d).f44092a.post(new p4.c(pVar, i10, 0));
    }
}
