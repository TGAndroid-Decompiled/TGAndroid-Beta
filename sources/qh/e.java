package qh;

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
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zp;
import xf.p;
public final class e extends ph.e implements Drawable.Callback, le.d {
    public final String f41017b;
    public final Drawable d;
    public final zp f41019f;
    public ph.d h;
    public TLRPC.WebPage f41020n;
    public final le.b f41021r;
    public final le.b f41022s;
    public final a5.a f41018c = new a5.a((char) 0, 15);
    public final Paint e = new Paint(1);

    public e(String str) {
        zp zpVar = new zp(-1);
        this.f41019f = zpVar;
        wr wrVar = wr.h;
        this.f41021r = new le.b(0, this, wrVar, 320L, false);
        this.f41022s = new le.b(0, this, wrVar, 320L, false);
        this.f41017b = str;
        this.f40408a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        zpVar.setCallback(this);
        zpVar.b(j6.w0(null, j6.f18127o7, false));
        zpVar.f29781a = AndroidUtilities.dp(15.0f);
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        ph.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (ph.d) view;
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
        ImageReceiver imageReceiver = this.f40408a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f7, f10);
        imageReceiver.draw(canvas);
        zp zpVar = this.f41019f;
        zpVar.setBounds(0, 0, i10, i11);
        int w02 = j6.w0(null, j6.f17872a7, false);
        le.b bVar = this.f41022s;
        int d = i0.a.d(bVar.e, w02, 1073741824);
        Paint paint = this.e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f7, f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d10 = i0.a.d(bVar.e, j6.w0(null, j6.f18127o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a5.a aVar = this.f41018c;
        aVar.getClass();
        if (((PorterDuffColorFilter) aVar.f276c) == null || aVar.f275b != d10 || ((PorterDuff.Mode) aVar.d) != mode) {
            aVar.f276c = new PorterDuffColorFilter(d10, mode);
            aVar.f275b = d10;
            aVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) aVar.f276c);
        p.e(this.d, f7 / 2.0f, f10 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        le.b bVar2 = this.f41021r;
        p.b(canvas, drawable, 1.0f - bVar2.e);
        p.b(canvas, zpVar, bVar2.e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        ph.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override
    public final void B(float f7, int i10) {
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
