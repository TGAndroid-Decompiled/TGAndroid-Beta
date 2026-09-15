package y1;

import android.media.VolumeProvider;
import androidx.emoji2.text.o;
import m.e3;
public final class e extends VolumeProvider {
    public final o f46254a;

    public e(o oVar, int i10, int i11, int i12, String str) {
        super(i10, i11, i12, str);
        this.f46254a = oVar;
    }

    @Override
    public final void onAdjustVolume(int i10) {
        o oVar = this.f46254a;
        ((p4.e) ((e3) oVar.f2346f).d).f40552a.post(new p4.c(oVar, i10, 1));
    }

    @Override
    public final void onSetVolumeTo(int i10) {
        o oVar = this.f46254a;
        ((p4.e) ((e3) oVar.f2346f).d).f40552a.post(new p4.c(oVar, i10, 0));
    }
}
