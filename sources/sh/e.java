package sh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gq;
import zf.q;
public final class e extends rh.e implements Drawable.Callback, ne.d {
    public final String f45464b;
    public final Drawable d;
    public final gq f45466f;
    public rh.d h;
    public TLRPC.WebPage f45467n;
    public final ne.b f45468r;
    public final ne.b f45469s;
    public final a5.a f45465c = new a5.a((char) 0, 15);
    public final Paint e = new Paint(1);

    public e(String str) {
        gq gqVar = new gq(-1);
        this.f45466f = gqVar;
        es esVar = es.h;
        this.f45468r = new ne.b(0, this, esVar, 320L, false);
        this.f45469s = new ne.b(0, this, esVar, 320L, false);
        this.f45464b = str;
        this.f44424a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        gqVar.setCallback(this);
        gqVar.b(g6.x0(null, g6.f19805o7, false));
        gqVar.f25084a = AndroidUtilities.dp(15.0f);
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (rh.d) view;
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
        ImageReceiver imageReceiver = this.f44424a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f7, f10);
        imageReceiver.draw(canvas);
        gq gqVar = this.f45466f;
        gqVar.setBounds(0, 0, i10, i11);
        int x02 = g6.x0(null, g6.f19543a7, false);
        ne.b bVar = this.f45469s;
        int d = i0.a.d(bVar.e, x02, 1073741824);
        Paint paint = this.e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f7, f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d10 = i0.a.d(bVar.e, g6.x0(null, g6.f19805o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a5.a aVar = this.f45465c;
        aVar.getClass();
        if (((PorterDuffColorFilter) aVar.f282c) == null || aVar.f281b != d10 || ((PorterDuff.Mode) aVar.d) != mode) {
            aVar.f282c = new PorterDuffColorFilter(d10, mode);
            aVar.f281b = d10;
            aVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) aVar.f282c);
        q.e(this.d, f7 / 2.0f, f10 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        ne.b bVar2 = this.f45468r;
        q.b(canvas, drawable, 1.0f - bVar2.e);
        q.b(canvas, gqVar, bVar2.e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        rh.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        rh.d dVar = this.h;
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
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
