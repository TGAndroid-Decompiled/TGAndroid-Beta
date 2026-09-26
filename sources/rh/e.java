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
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.vp;
import yf.p;
public final class e extends qh.e implements Drawable.Callback, le.e {
    public final String f42876b;
    public final Drawable d;
    public final vp f42878f;
    public qh.d h;
    public TLRPC.WebPage f42879n;
    public final le.c f42880r;
    public final le.c f42881s;
    public final a5.a f42877c = new a5.a((char) 0, 14);
    public final Paint e = new Paint(1);

    public e(String str) {
        vp vpVar = new vp(-1);
        this.f42878f = vpVar;
        sr srVar = sr.h;
        this.f42880r = new le.c(0, this, srVar, 320L, false);
        this.f42881s = new le.c(0, this, srVar, 320L, false);
        this.f42876b = str;
        this.f42049a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        vpVar.setCallback(this);
        vpVar.b(h6.w0(null, h6.f19261o7, false));
        vpVar.f29700a = AndroidUtilities.dp(15.0f);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
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
        ImageReceiver imageReceiver = this.f42049a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f7, f10);
        imageReceiver.draw(canvas);
        vp vpVar = this.f42878f;
        vpVar.setBounds(0, 0, i10, i11);
        int w02 = h6.w0(null, h6.f19003a7, false);
        le.c cVar = this.f42881s;
        int d = i0.a.d(cVar.e, w02, 1073741824);
        Paint paint = this.e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f7, f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d10 = i0.a.d(cVar.e, h6.w0(null, h6.f19261o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a5.a aVar = this.f42877c;
        aVar.getClass();
        if (((PorterDuffColorFilter) aVar.f278c) == null || aVar.f277b != d10 || ((PorterDuff.Mode) aVar.d) != mode) {
            aVar.f278c = new PorterDuffColorFilter(d10, mode);
            aVar.f277b = d10;
            aVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) aVar.f278c);
        p.e(this.d, f7 / 2.0f, f10 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        le.c cVar2 = this.f42880r;
        p.b(canvas, drawable, 1.0f - cVar2.e);
        p.b(canvas, vpVar, cVar2.e);
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
