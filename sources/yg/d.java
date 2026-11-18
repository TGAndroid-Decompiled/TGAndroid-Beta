package yg;

import android.content.Context;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
public class d extends c {
    public static final int f61229w = 0;
    public int f61230s;

    public d(Context context, i6 i6Var) {
        super(context, i6Var);
        this.d.setTypeface(g0.o());
    }

    @Override
    public boolean b() {
        return !(this instanceof e);
    }

    @Override
    public void d() {
        int i7;
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        int i12 = 3;
        if (gd.f24213a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        this.f61213c.setLayoutParams(ma.d(40, 40.0f, i7 | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z10 = gd.f24213a0;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i13 = i10 | 16;
        if (z10) {
            f10 = 20.0f;
        } else {
            f10 = 109.0f;
        }
        if (z10) {
            f11 = 109.0f;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(ma.d(-1, -2.0f, i13, f10, 0.0f, f11, 0.0f));
        boolean z11 = gd.f24213a0;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 16;
        if (z11) {
            f12 = 20.0f;
        } else {
            f12 = 109.0f;
        }
        if (z11) {
            f13 = 109.0f;
        } else {
            f13 = 20.0f;
        }
        this.f61214e.setLayoutParams(ma.d(-1, -2.0f, i14, f12, 0.0f, f13, 0.0f));
        if (gd.f24213a0) {
            i12 = 5;
        }
        this.f61215f.setLayoutParams(ma.d(22, 22.0f, i12 | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.f61230s;
    }
}
