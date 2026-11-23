package yg;

import android.content.Context;
import c8.na;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
public class d extends c {
    public static final int f61239w = 0;
    public int f61240s;

    public d(Context context, h6 h6Var) {
        super(context, h6Var);
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
        if (hd.f24408a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        this.f61223c.setLayoutParams(na.d(40, 40.0f, i7 | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z10 = hd.f24408a0;
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
        this.d.setLayoutParams(na.d(-1, -2.0f, i13, f10, 0.0f, f11, 0.0f));
        boolean z11 = hd.f24408a0;
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
        this.f61224e.setLayoutParams(na.d(-1, -2.0f, i14, f12, 0.0f, f13, 0.0f));
        if (hd.f24408a0) {
            i12 = 5;
        }
        this.f61225f.setLayoutParams(na.d(22, 22.0f, i12 | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.f61240s;
    }
}
