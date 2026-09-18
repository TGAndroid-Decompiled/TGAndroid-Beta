package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class t50 extends Dialog {
    public final ai.n4 f37659a;
    public final u50 f37660b;
    public Bitmap f37661c;
    public Paint d;
    public BitmapShader e;
    public final Matrix f37662f;
    public float h;
    public ValueAnimator f37663n;
    public boolean f37664r;

    public t50(Context context, u50 u50Var) {
        super(context, R.style.TransparentDialog);
        this.f37662f = new Matrix();
        this.f37660b = u50Var;
        u50Var.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new pf(27, this, u50Var), 14.0f);
        ai.n4 n4Var = new ai.n4(this, context, u50Var);
        this.f37659a = n4Var;
        n4Var.setOnClickListener(new a(this, 29));
    }

    public final void b(float f7, s50 s50Var) {
        ValueAnimator valueAnimator = this.f37663n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37663n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f7);
        this.f37663n = ofFloat;
        ofFloat.addUpdateListener(new b3(this, 15));
        this.f37663n.addListener(new ai.t2(this, f7, s50Var, 3));
        this.f37663n.setDuration(420L);
        this.f37663n.setInterpolator(org.telegram.ui.Components.qr.h);
        this.f37663n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f37664r) {
            return;
        }
        this.f37664r = true;
        b(0.0f, new s50(this, 0));
        try {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f37659a, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i10;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            attributes.flags = i10 | (-2013060864);
            AndroidUtilities.logFlagSecure();
        }
        attributes.flags |= 1152;
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
    }

    @Override
    public final void show() {
        super.show();
        b(1.0f, null);
        AndroidUtilities.runOnUIThread(new s50(this, 1), 16L);
    }
}
