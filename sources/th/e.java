package th;

import a8.ng;
import ag.v;
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
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gq;
public final class e extends sh.e implements Drawable.Callback, oe.d {
    public final String f49192b;
    public final Drawable d;
    public final gq f49194f;
    public sh.d h;
    public TLRPC.WebPage f49195n;
    public final oe.b f49196r;
    public final oe.b f49197s;
    public final ng f49193c = new ng((char) 0, 17);
    public final Paint e = new Paint(1);

    public e(String str) {
        gq gqVar = new gq(-1);
        this.f49194f = gqVar;
        ds dsVar = ds.h;
        this.f49196r = new oe.b(0, this, dsVar, 320L, false);
        this.f49197s = new oe.b(0, this, dsVar, 320L, false);
        this.f49192b = str;
        this.f48666a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        gqVar.setCallback(this);
        gqVar.b(y6.x0(null, y6.f23562o7, false));
        gqVar.f28713a = AndroidUtilities.dp(15.0f);
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        sh.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (sh.d) view;
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
        ImageReceiver imageReceiver = this.f48666a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f7, f10);
        imageReceiver.draw(canvas);
        gq gqVar = this.f49194f;
        gqVar.setBounds(0, 0, i10, i11);
        int x02 = y6.x0(null, y6.f23300a7, false);
        oe.b bVar = this.f49197s;
        int f11 = i0.a.f(bVar.e, x02, 1073741824);
        Paint paint = this.e;
        paint.setColor(f11);
        canvas.drawRoundRect(0.0f, 0.0f, f7, f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int f12 = i0.a.f(bVar.e, y6.x0(null, y6.f23562o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ng ngVar = this.f49193c;
        ngVar.getClass();
        if (((PorterDuffColorFilter) ngVar.f640c) == null || ngVar.f639b != f12 || ((PorterDuff.Mode) ngVar.d) != mode) {
            ngVar.f640c = new PorterDuffColorFilter(f12, mode);
            ngVar.f639b = f12;
            ngVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) ngVar.f640c);
        v.e(this.d, f7 / 2.0f, f10 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        oe.b bVar2 = this.f49196r;
        v.b(canvas, drawable, 1.0f - bVar2.e);
        v.b(canvas, gqVar, bVar2.e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        sh.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void z(float f7, int i10) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
