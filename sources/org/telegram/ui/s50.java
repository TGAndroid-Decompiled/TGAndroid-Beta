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
public final class s50 extends Dialog {
    public final bi.a4 f40330a;
    public final t50 f40331b;
    public Bitmap f40332c;
    public Paint d;
    public BitmapShader f40333e;
    public final Matrix f40334f;
    public float h;
    public ValueAnimator f40335n;
    public boolean f40336r;

    public s50(Context context, t50 t50Var) {
        super(context, R.style.TransparentDialog);
        this.f40334f = new Matrix();
        this.f40331b = t50Var;
        t50Var.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new nf(27, this, t50Var), 14.0f);
        bi.a4 a4Var = new bi.a4(this, context, t50Var);
        this.f40330a = a4Var;
        a4Var.setOnClickListener(new a(this, 29));
    }

    public final void b(float f7, r50 r50Var) {
        ValueAnimator valueAnimator = this.f40335n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f40335n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f7);
        this.f40335n = ofFloat;
        ofFloat.addUpdateListener(new c3(this, 16));
        this.f40335n.addListener(new bi.h2(this, f7, r50Var, 3));
        this.f40335n.setDuration(420L);
        this.f40335n.setInterpolator(org.telegram.ui.Components.pr.h);
        this.f40335n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f40336r) {
            return;
        }
        this.f40336r = true;
        b(0.0f, new r50(this, 0));
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
        setContentView(this.f40330a, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new r50(this, 1), 16L);
    }
}
