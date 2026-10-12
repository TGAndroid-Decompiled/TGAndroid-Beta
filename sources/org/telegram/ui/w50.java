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
public final class w50 extends Dialog {
    public final bi.d4 f41154a;
    public final x50 f41155b;
    public Bitmap f41156c;
    public Paint d;
    public BitmapShader e;
    public final Matrix f41157f;
    public float h;
    public ValueAnimator f41158n;
    public boolean f41159r;

    public w50(Context context, x50 x50Var) {
        super(context, R.style.TransparentDialog);
        this.f41157f = new Matrix();
        this.f41155b = x50Var;
        x50Var.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new mt(4, this, x50Var), 14.0f);
        bi.d4 d4Var = new bi.d4(this, context, x50Var);
        this.f41154a = d4Var;
        d4Var.setOnClickListener(new a(this, 28));
    }

    public final void b(float f7, v50 v50Var) {
        ValueAnimator valueAnimator = this.f41158n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f41158n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f7);
        this.f41158n = ofFloat;
        ofFloat.addUpdateListener(new e3(this, 16));
        this.f41158n.addListener(new bi.i2(this, f7, v50Var, 3));
        this.f41158n.setDuration(420L);
        this.f41158n.setInterpolator(org.telegram.ui.Components.es.h);
        this.f41158n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f41159r) {
            return;
        }
        this.f41159r = true;
        b(0.0f, new v50(this, 0));
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
        setContentView(this.f41154a, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new v50(this, 1), 16L);
    }
}
