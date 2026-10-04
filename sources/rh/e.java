package rh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.wp;
import yf.p;
public final class e extends qh.e implements Drawable.Callback, le.d {
    public final String f46421b;
    public final Drawable d;
    public final wp f46424f;
    public qh.d h;
    public TLRPC.WebPage f46425n;
    public final le.b f46426r;
    public final le.b f46427s;
    public final a5.a f46422c = new a5.a((char) 0, 14);
    public final Paint f46423e = new Paint(1);

    public e(String str) {
        wp wpVar = new wp(-1);
        this.f46424f = wpVar;
        tr trVar = tr.h;
        this.f46426r = new le.b(0, this, trVar, 320L, false);
        this.f46427s = new le.b(0, this, trVar, 320L, false);
        this.f46421b = str;
        this.f45458a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        wpVar.setCallback(this);
        wpVar.b(i6.w0(null, i6.f21021o7, false));
        wpVar.f32589a = AndroidUtilities.dp(15.0f);
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (qh.d) view;
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        qh.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        float f7 = i10;
        float f10 = i11;
        ImageReceiver imageReceiver = this.f45458a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f7, f10);
        imageReceiver.draw(canvas);
        wp wpVar = this.f46424f;
        wpVar.setBounds(0, 0, i10, i11);
        int w02 = i6.w0(null, i6.f20761a7, false);
        le.b bVar = this.f46427s;
        int d = i0.a.d(bVar.f15434e, w02, 1073741824);
        Paint paint = this.f46423e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f7, f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d10 = i0.a.d(bVar.f15434e, i6.w0(null, i6.f21021o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a5.a aVar = this.f46422c;
        aVar.getClass();
        if (((PorterDuffColorFilter) aVar.f300c) == null || aVar.f299b != d10 || ((PorterDuff.Mode) aVar.d) != mode) {
            aVar.f300c = new PorterDuffColorFilter(d10, mode);
            aVar.f299b = d10;
            aVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) aVar.f300c);
        p.e(this.d, f7 / 2.0f, f10 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        le.b bVar2 = this.f46426r;
        p.b(canvas, drawable, 1.0f - bVar2.f15434e);
        p.b(canvas, wpVar, bVar2.f15434e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        qh.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override
    public final void V(float f7, int i10) {
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
