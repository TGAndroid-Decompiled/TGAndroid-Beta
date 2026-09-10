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
    public final u7 f36550a;
    public final t50 f36551b;
    public Bitmap f36552c;
    public Paint d;
    public BitmapShader e;
    public final Matrix f36553f;
    public float h;
    public ValueAnimator f36554n;
    public boolean f36555r;

    public s50(Context context, t50 t50Var) {
        super(context, R.style.TransparentDialog);
        this.f36553f = new Matrix();
        this.f36551b = t50Var;
        t50Var.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new pf(27, this, t50Var), 14.0f);
        u7 u7Var = new u7(this, context, t50Var);
        this.f36550a = u7Var;
        u7Var.setOnClickListener(new a(this, 29));
    }

    public final void b(float f7, r50 r50Var) {
        ValueAnimator valueAnimator = this.f36554n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36554n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f7);
        this.f36554n = ofFloat;
        ofFloat.addUpdateListener(new d3(this, 16));
        this.f36554n.addListener(new bi.j3(this, f7, r50Var, 2));
        this.f36554n.setDuration(420L);
        this.f36554n.setInterpolator(org.telegram.ui.Components.wr.h);
        this.f36554n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f36555r) {
            return;
        }
        this.f36555r = true;
        b(0.0f, new r50(this, 0));
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
        setContentView(this.f36550a, new ViewGroup.LayoutParams(-1, -1));
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
