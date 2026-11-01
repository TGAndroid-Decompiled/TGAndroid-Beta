package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class c3 extends View {
    public final p3 f46718a;
    public final ImageReceiver f46719b;
    public final Drawable f46720c;

    public c3(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
        super(context);
        p3 p3Var = new p3(this, starGift, 60, 0.27f);
        this.f46718a = p3Var;
        p3Var.K = 3;
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.l(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f46719b = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(30.0f));
        imageReceiver.i0(tLObject, r8Var, null);
        Drawable mutate = context.getDrawable(2131231001).mutate();
        this.f46720c = mutate;
        org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.f21331z6, null, PorterDuff.Mode.MULTIPLY);
        mutate.setBounds(org.telegram.messenger.i0.L(-12.0f), org.telegram.messenger.i0.L(-12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46719b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46719b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (org.telegram.messenger.i0.L(156.0f) / 2);
        int height = (getHeight() / 2) - org.telegram.messenger.i0.L(30.0f);
        p3 p3Var = this.f46718a;
        p3Var.setBounds(width, height, org.telegram.messenger.i0.L(60.0f) + width, org.telegram.messenger.i0.L(60.0f) + height);
        p3Var.draw(canvas);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        this.f46720c.draw(canvas);
        canvas.restore();
        ImageReceiver imageReceiver = this.f46719b;
        imageReceiver.y0(org.telegram.messenger.i0.L(96.0f) + width, height, org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), 1073741824));
    }
}
