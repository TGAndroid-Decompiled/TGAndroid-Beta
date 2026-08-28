package pf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.z8;
public final class v0 extends View {
    public final Drawable f45800a;
    public final ImageReceiver f45801b;

    public v0(w0 w0Var, Context context) {
        super(context);
        this.f45800a = getContext().getResources().getDrawable(R.drawable.map_pin_photo).mutate();
        z8 z8Var = new z8((b6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f45801b = imageReceiver;
        z8Var.r(w0Var.getUserConfig().getCurrentUser());
        imageReceiver.setForUserOrChat(w0Var.getUserConfig().getCurrentUser(), z8Var);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(62.0f);
        int dp2 = AndroidUtilities.dp(85.0f);
        Drawable drawable = this.f45800a;
        drawable.setBounds(0, 0, dp, dp2);
        drawable.draw(canvas);
        int dp3 = AndroidUtilities.dp(62.0f);
        ImageReceiver imageReceiver = this.f45801b;
        imageReceiver.setRoundRadius(dp3);
        imageReceiver.setImageCoords(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(85.0f), 1073741824));
    }
}
