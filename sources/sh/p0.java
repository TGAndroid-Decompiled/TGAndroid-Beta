package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.z8;
public final class p0 extends Drawable implements s6 {
    public final Paint f47610a;
    public final Paint f47611b;
    public final Paint f47612c;
    public final ImageReceiver d;
    public final ImageReceiver f47613e;
    public final Drawable f47614f;

    public p0(Context context, TLRPC.User user, TLRPC.User user2) {
        Paint paint = new Paint(1);
        this.f47610a = paint;
        this.f47611b = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f47612c = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.d = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.f47613e = imageReceiver2;
        new RectF();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-1);
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_location).mutate();
        this.f47614f = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(k6.w0(null, k6.L5, false), PorterDuff.Mode.SRC_IN));
        z8 z8Var = new z8((g6) null);
        z8Var.r(user);
        imageReceiver.setForUserOrChat(user, z8Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(25.0f));
        z8 z8Var2 = new z8((g6) null);
        z8Var2.r(user2);
        imageReceiver2.setForUserOrChat(user2, z8Var2);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(25.0f));
    }

    @Override
    public final void a(kj0 kj0Var) {
        this.f47613e.setParentView(kj0Var);
        this.d.setParentView(kj0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.d.onDetachedFromWindow();
        this.f47613e.onDetachedFromWindow();
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.d.onAttachedToWindow();
        this.f47613e.onAttachedToWindow();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int w02 = k6.w0(null, k6.L5, false);
        Paint paint = this.f47611b;
        paint.setColor(w02);
        float dp = AndroidUtilities.dp(136.0f) / 2.0f;
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(bounds.centerX() - dp, bounds.centerY() - AndroidUtilities.dp(25.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
        imageReceiver.draw(canvas);
        float centerX = (bounds.centerX() - dp) + AndroidUtilities.dp(41.0f);
        float dp2 = AndroidUtilities.dp(16.0f) + bounds.centerY();
        canvas.drawCircle(centerX, dp2, AndroidUtilities.dp(14.0f), paint);
        canvas.drawCircle(centerX, dp2, AndroidUtilities.dp(12.0f), this.f47612c);
        int dp3 = (int) (dp2 + AndroidUtilities.dp(9.0f));
        Drawable drawable = this.f47614f;
        drawable.setBounds((int) (centerX - AndroidUtilities.dp(9.0f)), (int) (dp2 - AndroidUtilities.dp(9.0f)), (int) (centerX + AndroidUtilities.dp(9.0f)), dp3);
        drawable.draw(canvas);
        int centerX2 = bounds.centerX();
        Paint paint2 = this.f47610a;
        canvas.drawLine(bounds.centerX() - AndroidUtilities.dp(3.33f), bounds.centerY() - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(3.33f) + centerX2, bounds.centerY(), paint2);
        canvas.drawLine(bounds.centerX() - AndroidUtilities.dp(3.33f), AndroidUtilities.dp(7.0f) + bounds.centerY(), AndroidUtilities.dp(3.33f) + bounds.centerX(), bounds.centerY(), paint2);
        ImageReceiver imageReceiver2 = this.f47613e;
        imageReceiver2.setImageCoords((bounds.centerX() + dp) - AndroidUtilities.dp(50.0f), bounds.centerY() - AndroidUtilities.dp(25.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
        imageReceiver2.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
