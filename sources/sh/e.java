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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sp;
import yf.p;
public final class e extends rh.e implements Drawable.Callback, le.d {
    public final String f46400b;
    public final Drawable d;
    public final sp f46403f;
    public rh.d h;
    public TLRPC.WebPage f46404n;
    public final le.b f46405r;
    public final le.b f46406s;
    public final a5.a f46401c = new a5.a((char) 0, 14);
    public final Paint f46402e = new Paint(1);

    public e(String str) {
        sp spVar = new sp(-1);
        this.f46403f = spVar;
        pr prVar = pr.h;
        this.f46405r = new le.b(0, this, prVar, 320L, false);
        this.f46406s = new le.b(0, this, prVar, 320L, false);
        this.f46400b = str;
        this.f45618a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        spVar.setCallback(this);
        spVar.b(j6.w0(null, j6.f20864o7, false));
        spVar.f30383a = AndroidUtilities.dp(15.0f);
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        rh.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
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
        ImageReceiver imageReceiver = this.f45618a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f7, f10);
        imageReceiver.draw(canvas);
        sp spVar = this.f46403f;
        spVar.setBounds(0, 0, i10, i11);
        int w02 = j6.w0(null, j6.f20608a7, false);
        le.b bVar = this.f46406s;
        int d = i0.a.d(bVar.f15368e, w02, 1073741824);
        Paint paint = this.f46402e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f7, f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d10 = i0.a.d(bVar.f15368e, j6.w0(null, j6.f20864o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a5.a aVar = this.f46401c;
        aVar.getClass();
        if (((PorterDuffColorFilter) aVar.f286c) == null || aVar.f285b != d10 || ((PorterDuff.Mode) aVar.d) != mode) {
            aVar.f286c = new PorterDuffColorFilter(d10, mode);
            aVar.f285b = d10;
            aVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) aVar.f286c);
        p.e(this.d, f7 / 2.0f, f10 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        le.b bVar2 = this.f46405r;
        p.b(canvas, drawable, 1.0f - bVar2.f15368e);
        p.b(canvas, spVar, bVar2.f15368e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        rh.d dVar = this.h;
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
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
