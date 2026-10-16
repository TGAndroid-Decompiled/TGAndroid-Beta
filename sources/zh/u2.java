package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k9;
public final class u2 extends View {
    public final g3 f51213a;
    public final ImageReceiver f51214b;
    public final Path f51215c;
    public final Paint d;

    public u2(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
        super(context);
        Path path = new Path();
        this.f51215c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        g3 g3Var = new g3(this, starGift, 60, 0.27f);
        this.f51213a = g3Var;
        g3Var.K = 3;
        k9 k9Var = new k9((org.telegram.ui.ActionBar.c6) null);
        k9Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f51214b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, k9Var);
        paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        path.rewind();
        path.moveTo(0.0f, -AndroidUtilities.dp(8.0f));
        path.lineTo(AndroidUtilities.dp(6.166f), 0.0f);
        path.lineTo(0.0f, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51214b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51214b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
        int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
        g3 g3Var = this.f51213a;
        g3Var.setBounds(width, height, AndroidUtilities.dp(60.0f) + width, AndroidUtilities.dp(60.0f) + height);
        g3Var.draw(canvas);
        canvas.save();
        canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
        canvas.drawPath(this.f51215c, this.d);
        canvas.restore();
        ImageReceiver imageReceiver = this.f51214b;
        imageReceiver.setImageCoords(AndroidUtilities.dp(96.0f) + width, height, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
    }

    public u2(Context context, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(context);
        Path path = new Path();
        this.f51215c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        g3 g3Var = new g3(this, tL_starGiftUnique, 60, 0.27f);
        this.f51213a = g3Var;
        g3Var.K = 3;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f51214b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setImageBitmap(org.telegram.ui.Cells.u6.a(60, "fragment"));
        paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.33f));
        path.rewind();
        path.moveTo(0.0f, -AndroidUtilities.dp(8.0f));
        path.lineTo(AndroidUtilities.dp(6.166f), 0.0f);
        path.lineTo(0.0f, AndroidUtilities.dp(8.0f));
    }
}
