package qf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.t80;

public final class c1 extends LinearLayout {

    public final c6 f46258a;

    public final t80 f46259b;

    public final ImageReceiver f46260c;
    public final TextView d;

    public boolean f46261e;

    public c1(Context context, c6 c6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f46260c = imageReceiver;
        this.f46258a = c6Var;
        setOrientation(1);
        t80 t80Var = new t80();
        this.f46259b = t80Var;
        int i10 = g6.G6;
        int iV0 = g6.v0(i10, c6Var);
        t80Var.f(g6.l1(0.05f, iV0), g6.l1(0.15f, iV0), g6.l1(0.1f, iV0), g6.l1(0.3f, iV0));
        t80Var.j(4.0f);
        t80Var.f32710w.setStrokeWidth(AndroidUtilities.dp(1.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(g6.v0(i10, c6Var));
        textView.setTextSize(1, 16.0f);
        boolean z10 = LocaleController.isRTL;
        addView(textView, z5.t(-1, -2, 55, z10 ? 70 : 18, 10, z10 ? 18 : 70, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setTextColor(g6.v0(g6.f23441z6, c6Var));
        textView2.setText(LocaleController.getString(R.string.BusinessProfileLocation));
        textView2.setTextSize(1, 13.0f);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, z5.t(-1, -2, 55, z11 ? 70 : 18, 0, z11 ? 18 : 70, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z10) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            if (tL_businessLocation.geo_point != null) {
                this.f46260c.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(tL_businessLocation.geo_point, AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f), 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), "44_44", this.f46259b, 0L, (String) null, (Object) null, 0);
            } else {
                this.f46260c.setImageBitmap((Drawable) null);
            }
        }
        this.f46261e = z10;
        setPadding(0, 0, 0, z10 ? 1 : 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fDp = LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : getWidth() - AndroidUtilities.dp(60.0f);
        float fDp2 = AndroidUtilities.dp(8.0f);
        float fDp3 = AndroidUtilities.dp(44.0f);
        float fDp4 = AndroidUtilities.dp(44.0f);
        ImageReceiver imageReceiver = this.f46260c;
        imageReceiver.setImageCoords(fDp, fDp2, fDp3, fDp4);
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        if (this.f46261e) {
            Paint paintT0 = g6.T0("paintDivider", this.f46258a);
            if (paintT0 == null) {
                paintT0 = g6.f23175k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 21.33f : 0.0f), getMeasuredHeight(), paintT0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f46259b || super.verifyDrawable(drawable);
    }
}
