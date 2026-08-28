package y1;

import a5.m;
import android.media.VolumeProvider;
import androidx.emoji2.text.o;
public final class f extends VolumeProvider {
    public final o f49461a;

    public f(o oVar, int i9, int i10, int i11) {
        super(i9, i10, i11);
        this.f49461a = oVar;
    }

    @Override
    public final void onAdjustVolume(int i9) {
        o oVar = this.f49461a;
        ((c2.e) ((m) oVar.f873f).d).f2134a.post(new c2.c(oVar, i9, 1));
    }

    @Override
    public final void onSetVolumeTo(int i9) {
        o oVar = this.f49461a;
        ((c2.e) ((m) oVar.f873f).d).f2134a.post(new c2.c(oVar, i9, 0));
    }
}
