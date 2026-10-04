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
public final class r50 extends Dialog {
    public final ai.n4 f39918a;
    public final n20 f39919b;
    public Bitmap f39920c;
    public Paint d;
    public BitmapShader f39921e;
    public final Matrix f39922f;
    public float h;
    public ValueAnimator f39923n;
    public boolean f39924r;

    public r50(Context context, n20 n20Var) {
        super(context, R.style.TransparentDialog);
        this.f39922f = new Matrix();
        this.f39919b = n20Var;
        n20Var.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new ft(4, this, n20Var), 14.0f);
        ai.n4 n4Var = new ai.n4(this, context, n20Var);
        this.f39918a = n4Var;
        n4Var.setOnClickListener(new a(this, 29));
    }

    public final void b(float f7, q50 q50Var) {
        ValueAnimator valueAnimator = this.f39923n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f39923n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f7);
        this.f39923n = ofFloat;
        ofFloat.addUpdateListener(new c3(this, 15));
        this.f39923n.addListener(new ai.t2(this, f7, q50Var, 3));
        this.f39923n.setDuration(420L);
        this.f39923n.setInterpolator(org.telegram.ui.Components.tr.h);
        this.f39923n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f39924r) {
            return;
        }
        this.f39924r = true;
        b(0.0f, new q50(this, 0));
        try {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f39918a, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new q50(this, 1), 16L);
    }
}
