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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.lq;
import yf.p;
public final class e extends qh.e implements Drawable.Callback, me.d {
    public final String f47767b;
    public final Drawable d;
    public final lq f47770f;
    public qh.d h;
    public TLRPC.WebPage f47771n;
    public final me.b f47772r;
    public final me.b f47773s;
    public final a5.a f47768c = new a5.a((char) 0, 15);
    public final Paint f47769e = new Paint(1);

    public e(String str) {
        lq lqVar = new lq(-1);
        this.f47770f = lqVar;
        js jsVar = js.h;
        this.f47772r = new me.b(0, this, jsVar, 320L, false);
        this.f47773s = new me.b(0, this, jsVar, 320L, false);
        this.f47767b = str;
        this.f46614a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        lqVar.setCallback(this);
        lqVar.b(h6.x0(null, h6.f20763o7, false));
        lqVar.f28260a = AndroidUtilities.dp(15.0f);
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (qh.d) view;
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
        ImageReceiver imageReceiver = this.f46614a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f7, f10);
        imageReceiver.draw(canvas);
        lq lqVar = this.f47770f;
        lqVar.setBounds(0, 0, i10, i11);
        int x02 = h6.x0(null, h6.f20503a7, false);
        me.b bVar = this.f47773s;
        int d = i0.a.d(bVar.f16087e, x02, 1073741824);
        Paint paint = this.f47769e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f7, f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d10 = i0.a.d(bVar.f16087e, h6.x0(null, h6.f20763o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a5.a aVar = this.f47768c;
        aVar.getClass();
        if (((PorterDuffColorFilter) aVar.f300c) == null || aVar.f299b != d10 || ((PorterDuff.Mode) aVar.d) != mode) {
            aVar.f300c = new PorterDuffColorFilter(d10, mode);
            aVar.f299b = d10;
            aVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) aVar.f300c);
        p.e(this.d, f7 / 2.0f, f10 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        me.b bVar2 = this.f47772r;
        p.b(canvas, drawable, 1.0f - bVar2.f16087e);
        p.b(canvas, lqVar, bVar2.f16087e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        qh.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        qh.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
