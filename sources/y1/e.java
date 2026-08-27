package y1;

import a5.n;
import ag.h1;
import android.media.VolumeProvider;

public final class e extends VolumeProvider {

    public final h1 f49450a;

    public e(h1 h1Var, int i10, int i11, int i12, String str) {
        super(i10, i11, i12, str);
        this.f49450a = h1Var;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        h1 h1Var = this.f49450a;
        ((c2.e) ((n) h1Var.f415f).d).f2251a.post(new c2.c(h1Var, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        h1 h1Var = this.f49450a;
        ((c2.e) ((n) h1Var.f415f).d).f2251a.post(new c2.c(h1Var, i10, 0));
    }
}
