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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;
import yf.p;
public final class e extends qh.e implements Drawable.Callback, le.d {
    public final String f42847b;
    public final Drawable d;
    public final tp f42849f;
    public qh.d h;
    public TLRPC.WebPage f42850n;
    public final le.b f42851r;
    public final le.b f42852s;
    public final a5.a f42848c = new a5.a((char) 0, 14);
    public final Paint e = new Paint(1);

    public e(String str) {
        tp tpVar = new tp(-1);
        this.f42849f = tpVar;
        qr qrVar = qr.h;
        this.f42851r = new le.b(0, this, qrVar, 320L, false);
        this.f42852s = new le.b(0, this, qrVar, 320L, false);
        this.f42847b = str;
        this.f42019a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        tpVar.setCallback(this);
        tpVar.b(j6.w0(null, j6.f19265o7, false));
        tpVar.f28456a = AndroidUtilities.dp(15.0f);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        qh.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
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
        ImageReceiver imageReceiver = this.f42019a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f7, f10);
        imageReceiver.draw(canvas);
        tp tpVar = this.f42849f;
        tpVar.setBounds(0, 0, i10, i11);
        int w02 = j6.w0(null, j6.f19006a7, false);
        le.b bVar = this.f42852s;
        int d = i0.a.d(bVar.e, w02, 1073741824);
        Paint paint = this.e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f7, f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d10 = i0.a.d(bVar.e, j6.w0(null, j6.f19265o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a5.a aVar = this.f42848c;
        aVar.getClass();
        if (((PorterDuffColorFilter) aVar.f278c) == null || aVar.f277b != d10 || ((PorterDuff.Mode) aVar.d) != mode) {
            aVar.f278c = new PorterDuffColorFilter(d10, mode);
            aVar.f277b = d10;
            aVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) aVar.f278c);
        p.e(this.d, f7 / 2.0f, f10 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        le.b bVar2 = this.f42851r;
        p.b(canvas, drawable, 1.0f - bVar2.e);
        p.b(canvas, tpVar, bVar2.e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
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
