package zg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import ff.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jp;
public final class e extends yg.e implements Drawable.Callback, td.b {
    public final String f50832b;
    public final Drawable d;
    public final jp f50835f;
    public yg.d h;
    public TLRPC.WebPage f50836n;
    public final td.a f50837r;
    public final td.a f50838s;
    public final a6.a f50833c = new a6.a((char) 0, 19);
    public final Paint f50834e = new Paint(1);

    public e(String str) {
        jp jpVar = new jp(-1);
        this.f50835f = jpVar;
        gr grVar = gr.h;
        this.f50837r = new td.a(0, this, grVar, 320L, false);
        this.f50838s = new td.a(0, this, grVar, 320L, false);
        this.f50832b = str;
        this.f50222a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        jpVar.setCallback(this);
        jpVar.b(f6.w0(null, f6.f23197o7, false));
        jpVar.f29810a = AndroidUtilities.dp(15.0f);
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        yg.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (yg.d) view;
    }

    @Override
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override
    public final void c(Canvas canvas, int i9, int i10) {
        float f10 = i9;
        float f11 = i10;
        ImageReceiver imageReceiver = this.f50222a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f10, f11);
        imageReceiver.draw(canvas);
        jp jpVar = this.f50835f;
        jpVar.setBounds(0, 0, i9, i10);
        int w02 = f6.w0(null, f6.f22947a7, false);
        td.a aVar = this.f50838s;
        int d = i0.a.d(aVar.f47775e, w02, 1073741824);
        Paint paint = this.f50834e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d9 = i0.a.d(aVar.f47775e, f6.w0(null, f6.f23197o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a6.a aVar2 = this.f50833c;
        aVar2.getClass();
        if (((PorterDuffColorFilter) aVar2.f101b) == null || aVar2.f102c != d9 || ((PorterDuff.Mode) aVar2.d) != mode) {
            aVar2.f101b = new PorterDuffColorFilter(d9, mode);
            aVar2.f102c = d9;
            aVar2.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) aVar2.f101b);
        s.e(this.d, f10 / 2.0f, f11 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        td.a aVar3 = this.f50837r;
        s.b(canvas, drawable, 1.0f - aVar3.f47775e);
        s.b(canvas, jpVar, aVar3.f47775e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        yg.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override
    public final void B(float f10, int i9) {
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
