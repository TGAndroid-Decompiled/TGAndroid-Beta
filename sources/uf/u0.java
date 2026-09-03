package uf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.z8;
public final class u0 extends View {
    public final Drawable f45510a;
    public final ImageReceiver f45511b;

    public u0(v0 v0Var, Context context) {
        super(context);
        this.f45510a = getContext().getResources().getDrawable(R.drawable.map_pin_photo).mutate();
        z8 z8Var = new z8((f6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f45511b = imageReceiver;
        z8Var.r(v0Var.getUserConfig().getCurrentUser());
        imageReceiver.setForUserOrChat(v0Var.getUserConfig().getCurrentUser(), z8Var);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(62.0f);
        int dp2 = AndroidUtilities.dp(85.0f);
        Drawable drawable = this.f45510a;
        drawable.setBounds(0, 0, dp, dp2);
        drawable.draw(canvas);
        int dp3 = AndroidUtilities.dp(62.0f);
        ImageReceiver imageReceiver = this.f45511b;
        imageReceiver.setRoundRadius(dp3);
        imageReceiver.setImageCoords(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(85.0f), 1073741824));
    }
}
