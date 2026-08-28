package y1;

import a5.m;
import android.media.VolumeProvider;
import androidx.emoji2.text.o;
public final class e extends VolumeProvider {
    public final o f49460a;

    public e(o oVar, int i9, int i10, int i11, String str) {
        super(i9, i10, i11, str);
        this.f49460a = oVar;
    }

    @Override
    public final void onAdjustVolume(int i9) {
        o oVar = this.f49460a;
        ((c2.e) ((m) oVar.f873f).d).f2134a.post(new c2.c(oVar, i9, 1));
    }

    @Override
    public final void onSetVolumeTo(int i9) {
        o oVar = this.f49460a;
        ((c2.e) ((m) oVar.f873f).d).f2134a.post(new c2.c(oVar, i9, 0));
    }
}
