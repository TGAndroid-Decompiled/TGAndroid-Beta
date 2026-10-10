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
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.jq;
import yf.p;
public final class e extends qh.e implements Drawable.Callback, me.d {
    public final String f47597b;
    public final Drawable d;
    public final jq f47600f;
    public qh.d h;
    public TLRPC.WebPage f47601n;
    public final me.b f47602r;
    public final me.b f47603s;
    public final a5.a f47598c = new a5.a((char) 0, 15);
    public final Paint f47599e = new Paint(1);

    public e(String str) {
        jq jqVar = new jq(-1);
        this.f47600f = jqVar;
        is isVar = is.h;
        this.f47602r = new me.b(0, this, isVar, 320L, false);
        this.f47603s = new me.b(0, this, isVar, 320L, false);
        this.f47597b = str;
        this.f46721a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        jqVar.setCallback(this);
        jqVar.b(i6.x0(null, i6.f21005o7, false));
        jqVar.f27748a = AndroidUtilities.dp(15.0f);
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
        ImageReceiver imageReceiver = this.f46721a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f7, f10);
        imageReceiver.draw(canvas);
        jq jqVar = this.f47600f;
        jqVar.setBounds(0, 0, i10, i11);
        int x02 = i6.x0(null, i6.f20745a7, false);
        me.b bVar = this.f47603s;
        int d = i0.a.d(bVar.f16341e, x02, 1073741824);
        Paint paint = this.f47599e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f7, f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d10 = i0.a.d(bVar.f16341e, i6.x0(null, i6.f21005o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a5.a aVar = this.f47598c;
        aVar.getClass();
        if (((PorterDuffColorFilter) aVar.f300c) == null || aVar.f299b != d10 || ((PorterDuff.Mode) aVar.d) != mode) {
            aVar.f300c = new PorterDuffColorFilter(d10, mode);
            aVar.f299b = d10;
            aVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) aVar.f300c);
        p.e(this.d, f7 / 2.0f, f10 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        me.b bVar2 = this.f47602r;
        p.b(canvas, drawable, 1.0f - bVar2.f16341e);
        p.b(canvas, jqVar, bVar2.f16341e);
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
    public final void A(float f7, int i10) {
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
