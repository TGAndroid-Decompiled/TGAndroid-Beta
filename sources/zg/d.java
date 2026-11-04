package zg;

import android.content.Context;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
public class d extends c {
    public static final int f60490w = 0;
    public int f60491s;

    public d(Context context, e6 e6Var) {
        super(context, e6Var);
        this.d.setTypeface(g0.o());
    }

    @Override
    public boolean b() {
        return !(this instanceof e);
    }

    @Override
    public void d() {
        int i3;
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        int i12 = 3;
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        this.f60474c.setLayoutParams(mf.d(40, 40.0f, i3 | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z10 = bd.f21784a0;
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
        this.d.setLayoutParams(mf.d(-1, -2.0f, i13, f10, 0.0f, f11, 0.0f));
        boolean z11 = bd.f21784a0;
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
        this.f60475e.setLayoutParams(mf.d(-1, -2.0f, i14, f12, 0.0f, f13, 0.0f));
        if (bd.f21784a0) {
            i12 = 5;
        }
        this.f60476f.setLayoutParams(mf.d(22, 22.0f, i12 | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.f60491s;
    }
}
