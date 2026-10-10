package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.e6;
import w7.x5;
public class d extends c {
    public static final int v = 0;
    public int f49636s;

    public d(Context context, e6 e6Var) {
        super(context, e6Var);
        this.d.setTypeface(AndroidUtilities.bold());
    }

    @Override
    public boolean b() {
        return !(this instanceof e);
    }

    @Override
    public void d() {
        int i10;
        int i11;
        float f7;
        float f10;
        int i12;
        float f11;
        float f12;
        int i13 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        this.f49620c.setLayoutParams(x5.a(40.0f, 57.0f, 0.0f, 57.0f, 0.0f, 40, i10 | 16));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 16;
        if (z10) {
            f7 = 20.0f;
        } else {
            f7 = 109.0f;
        }
        if (z10) {
            f10 = 109.0f;
        } else {
            f10 = 20.0f;
        }
        this.d.setLayoutParams(x5.a(-2.0f, f7, 0.0f, f10, 0.0f, -1, i14));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i15 = i12 | 16;
        if (z11) {
            f11 = 20.0f;
        } else {
            f11 = 109.0f;
        }
        if (z11) {
            f12 = 109.0f;
        } else {
            f12 = 20.0f;
        }
        this.f49621e.setLayoutParams(x5.a(-2.0f, f11, 0.0f, f12, 0.0f, -1, i15));
        if (LocaleController.isRTL) {
            i13 = 5;
        }
        this.f49622f.setLayoutParams(x5.a(22.0f, 16.0f, 0.0f, 15.0f, 0.0f, 22, i13 | 16));
    }

    public int getSelectedType() {
        return this.f49636s;
    }
}
