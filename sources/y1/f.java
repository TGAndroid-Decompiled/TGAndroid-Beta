package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.o;
public final class f extends VolumeProvider {
    public final o f50162a;

    public f(o oVar, int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.f50162a = oVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        o oVar = this.f50162a;
        ((c2.e) ((androidx.biometric.e) oVar.f1369f).d).f2804a.post(new c2.c(oVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        o oVar = this.f50162a;
        ((c2.e) ((androidx.biometric.e) oVar.f1369f).d).f2804a.post(new c2.c(oVar, i10, 0));
    }
}
