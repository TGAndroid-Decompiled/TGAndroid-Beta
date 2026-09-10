package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g9;
public final class y2 extends View {
    public final l3 f46326a;
    public final ImageReceiver f46327b;
    public final Drawable f46328c;

    public y2(Context context, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject) {
        super(context);
        l3 l3Var = new l3(this, tL_starGiftUnique, 60, 0.27f);
        this.f46326a = l3Var;
        l3Var.f45659t = 3;
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f46327b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, g9Var);
        Drawable mutate = context.getDrawable(R.drawable.chats_undo).mutate();
        this.f46328c = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18325z6, false), PorterDuff.Mode.MULTIPLY));
        mutate.setBounds(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46327b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46327b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
        int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
        l3 l3Var = this.f46326a;
        l3Var.setBounds(width, height, AndroidUtilities.dp(60.0f) + width, AndroidUtilities.dp(60.0f) + height);
        l3Var.draw(canvas);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        this.f46328c.draw(canvas);
        canvas.restore();
        ImageReceiver imageReceiver = this.f46327b;
        imageReceiver.setImageCoords(AndroidUtilities.dp(96.0f) + width, height, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
    }
}
