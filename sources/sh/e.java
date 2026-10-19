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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dq;
import zf.p;
public final class e extends rh.e implements Drawable.Callback, ne.d {
    public final String f46536b;
    public final Drawable d;
    public final dq f46538f;
    public rh.d h;
    public TLRPC.WebPage f46539n;
    public final ne.b f46540r;
    public final ne.b f46541s;
    public final a5.a f46537c = new a5.a((char) 0, 15);
    public final Paint e = new Paint(1);

    public e(String str) {
        dq dqVar = new dq(-1);
        this.f46538f = dqVar;
        bs bsVar = bs.h;
        this.f46540r = new ne.b(0, this, bsVar, 320L, false);
        this.f46541s = new ne.b(0, this, bsVar, 320L, false);
        this.f46536b = str;
        this.f45747a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        dqVar.setCallback(this);
        dqVar.b(h6.x0(null, h6.f21191o7, false));
        dqVar.f25608a = AndroidUtilities.dp(15.0f);
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
        ImageReceiver imageReceiver = this.f45747a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f7, f10);
        imageReceiver.draw(canvas);
        dq dqVar = this.f46538f;
        dqVar.setBounds(0, 0, i10, i11);
        int x02 = h6.x0(null, h6.f20929a7, false);
        ne.b bVar = this.f46541s;
        int f11 = i0.a.f(bVar.e, x02, 1073741824);
        Paint paint = this.e;
        paint.setColor(f11);
        canvas.drawRoundRect(0.0f, 0.0f, f7, f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int f12 = i0.a.f(bVar.e, h6.x0(null, h6.f21191o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a5.a aVar = this.f46537c;
        aVar.getClass();
        if (((PorterDuffColorFilter) aVar.f282c) == null || aVar.f281b != f12 || ((PorterDuff.Mode) aVar.d) != mode) {
            aVar.f282c = new PorterDuffColorFilter(f12, mode);
            aVar.f281b = f12;
            aVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) aVar.f282c);
        p.e(this.d, f7 / 2.0f, f10 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        ne.b bVar2 = this.f46540r;
        p.b(canvas, drawable, 1.0f - bVar2.e);
        p.b(canvas, dqVar, bVar2.e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        rh.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        rh.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override
    public final void H(float f7, int i10) {
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
