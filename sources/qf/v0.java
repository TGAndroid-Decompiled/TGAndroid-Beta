package qf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.y8;

public final class v0 extends View {

    public final Drawable f46468a;

    public final ImageReceiver f46469b;

    public v0(w0 w0Var, Context context) {
        super(context);
        this.f46468a = getContext().getResources().getDrawable(R.drawable.map_pin_photo).mutate();
        y8 y8Var = new y8((c6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f46469b = imageReceiver;
        y8Var.r(w0Var.getUserConfig().getCurrentUser());
        imageReceiver.setForUserOrChat(w0Var.getUserConfig().getCurrentUser(), y8Var);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int iDp = AndroidUtilities.dp(62.0f);
        int iDp2 = AndroidUtilities.dp(85.0f);
        Drawable drawable = this.f46468a;
        drawable.setBounds(0, 0, iDp, iDp2);
        drawable.draw(canvas);
        int iDp3 = AndroidUtilities.dp(62.0f);
        ImageReceiver imageReceiver = this.f46469b;
        imageReceiver.setRoundRadius(iDp3);
        imageReceiver.setImageCoords(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(85.0f), 1073741824));
    }
}
